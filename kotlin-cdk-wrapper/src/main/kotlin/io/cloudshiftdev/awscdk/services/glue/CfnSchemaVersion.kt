@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSchemaVersion internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.glue.CfnSchemaVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrVersionId(): String = unwrap(this).getAttrVersionId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun schema(): Any = unwrap(this).getSchema()

  public open fun schema(`value`: IResolvable) {
    unwrap(this).setSchema(`value`.let(IResolvable::unwrap))
  }

  public open fun schema(`value`: SchemaProperty) {
    unwrap(this).setSchema(`value`.let(SchemaProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8cb0a20ed64313dcb959d87d54de72323b3f7aa26343157f9ce966fff70df4f1")
  public open fun schema(`value`: SchemaProperty.Builder.() -> Unit): Unit =
      schema(SchemaProperty(`value`))

  public open fun schemaDefinition(): String = unwrap(this).getSchemaDefinition()

  public open fun schemaDefinition(`value`: String) {
    unwrap(this).setSchemaDefinition(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun schema(schema: IResolvable)

    public fun schema(schema: SchemaProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d485f89f5bda293c194cdfaf6fafbb513920af62464e4baeddce765acc7b571a")
    public fun schema(schema: SchemaProperty.Builder.() -> Unit)

    public fun schemaDefinition(schemaDefinition: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnSchemaVersion.Builder =
        software.amazon.awscdk.services.glue.CfnSchemaVersion.Builder.create(scope, id)

    override fun schema(schema: IResolvable) {
      cdkBuilder.schema(schema.let(IResolvable::unwrap))
    }

    override fun schema(schema: SchemaProperty) {
      cdkBuilder.schema(schema.let(SchemaProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d485f89f5bda293c194cdfaf6fafbb513920af62464e4baeddce765acc7b571a")
    override fun schema(schema: SchemaProperty.Builder.() -> Unit): Unit =
        schema(SchemaProperty(schema))

    override fun schemaDefinition(schemaDefinition: String) {
      cdkBuilder.schemaDefinition(schemaDefinition)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnSchemaVersion = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.glue.CfnSchemaVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSchemaVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSchemaVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSchemaVersion):
        CfnSchemaVersion = CfnSchemaVersion(cdkObject)

    internal fun unwrap(wrapped: CfnSchemaVersion):
        software.amazon.awscdk.services.glue.CfnSchemaVersion = wrapped.cdkObject
  }

  public interface SchemaProperty {
    public fun registryName(): String? = unwrap(this).getRegistryName()

    public fun schemaArn(): String? = unwrap(this).getSchemaArn()

    public fun schemaName(): String? = unwrap(this).getSchemaName()

    @CdkDslMarker
    public interface Builder {
      public fun registryName(registryName: String)

      public fun schemaArn(schemaArn: String)

      public fun schemaName(schemaName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnSchemaVersion.SchemaProperty.Builder =
          software.amazon.awscdk.services.glue.CfnSchemaVersion.SchemaProperty.builder()

      override fun registryName(registryName: String) {
        cdkBuilder.registryName(registryName)
      }

      override fun schemaArn(schemaArn: String) {
        cdkBuilder.schemaArn(schemaArn)
      }

      override fun schemaName(schemaName: String) {
        cdkBuilder.schemaName(schemaName)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnSchemaVersion.SchemaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.glue.CfnSchemaVersion.SchemaProperty,
    ) : CdkObject(cdkObject), SchemaProperty {
      override fun registryName(): String? = unwrap(this).getRegistryName()

      override fun schemaArn(): String? = unwrap(this).getSchemaArn()

      override fun schemaName(): String? = unwrap(this).getSchemaName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSchemaVersion.SchemaProperty):
          SchemaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaProperty):
          software.amazon.awscdk.services.glue.CfnSchemaVersion.SchemaProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnSchemaVersion.SchemaProperty
    }
  }
}