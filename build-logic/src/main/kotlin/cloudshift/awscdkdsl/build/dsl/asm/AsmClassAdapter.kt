package cloudshift.awscdkdsl.build.dsl.asm

import cloudshift.awscdkdsl.build.dsl.model.CdkClass
import cloudshift.awscdkdsl.build.dsl.model.source.CdkSourceClass
import com.squareup.kotlinpoet.ClassName
import org.gradle.kotlin.dsl.provideDelegate
import org.objectweb.asm.Type
import org.objectweb.asm.tree.AnnotationNode
import org.objectweb.asm.tree.ClassNode

internal class AsmClassAdapter(
    override val className: ClassName,
    private val delegate: ClassNode,
    private val sourceClass: CdkSourceClass
) : CdkClass {
    override val comment: String? = sourceClass.comment

    private val annotations: List<ClassName> by
        lazy(LazyThreadSafetyMode.NONE) {
            delegate.allAnnotations.map { Type.getType(it.desc).toTypeName() }
        }
    override val deprecated: Boolean = annotations.any { it.toString().contains("Deprecated") }

    override val publicMemberFunctions: List<CdkClass.Method> by
        lazy(LazyThreadSafetyMode.NONE) {
            delegate.methods
                .filter {
                    !it.isConstructor() &&
                        it.accessFlags.isPublic() &&
                        !it.accessFlags.isGenerated() &&
                        !it.accessFlags.isStatic()
                }
                .map {
                    val method = sourceClass.methodFor(it.name)
                    if (method == null)
                        println("No source method found for ${sourceClass.className} ${it.name}")
                    AsmMethodAdapter(it, method)
                }
        }

    override val publicStaticFunctions: List<CdkClass.Method> by
        lazy(LazyThreadSafetyMode.NONE) {
            delegate.methods
                .filter {
                    it.accessFlags.isPublic() &&
                        !it.accessFlags.isGenerated() &&
                        it.accessFlags.isStatic()
                }
                .map { AsmMethodAdapter(it) }
        }

    private val allConstructors: List<CdkClass.Method> by
        lazy(LazyThreadSafetyMode.NONE) {
            delegate.methods
                .filter { it.isConstructor() && !it.accessFlags.isGenerated() }
                .map { AsmMethodAdapter(it) }
        }

    private val interfaces: List<ClassName> by
        lazy(LazyThreadSafetyMode.NONE) {
            delegate.interfaces.map { ClassName.fromAsmClassName(it) }
        }

    override fun canInstantiate() = allConstructors.all { it.parameters.isEmpty() }

    override fun implementsInterface(name: ClassName) = name in interfaces

    override fun toString(): String {
        return "AsmClassAdapter(className=$className)"
    }
}

private val ClassNode.allAnnotations: List<AnnotationNode>
    get() = (visibleAnnotations ?: emptyList()) + (invisibleAnnotations ?: emptyList())
