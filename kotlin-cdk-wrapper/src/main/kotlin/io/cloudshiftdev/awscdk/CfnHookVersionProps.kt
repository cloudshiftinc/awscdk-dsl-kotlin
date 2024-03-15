@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnHookVersionProps {
  public fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  public fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

  public fun schemaHandlerPackage(): String

  public fun typeName(): String

  @CdkDslMarker
  public interface Builder {
    public fun executionRoleArn(executionRoleArn: String)

    public fun loggingConfig(loggingConfig: IResolvable)

    public fun loggingConfig(loggingConfig: CfnHookVersion.LoggingConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f919faf1015d5a9527bc8c4bc1b7adf53fc3dfa1b8ba24e74cbf8001a5ccb8f")
    public fun loggingConfig(loggingConfig: CfnHookVersion.LoggingConfigProperty.Builder.() -> Unit)

    public fun schemaHandlerPackage(schemaHandlerPackage: String)

    public fun typeName(typeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnHookVersionProps.Builder =
        software.amazon.awscdk.CfnHookVersionProps.builder()

    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    override fun loggingConfig(loggingConfig: IResolvable) {
      cdkBuilder.loggingConfig(loggingConfig.let(IResolvable::unwrap))
    }

    override fun loggingConfig(loggingConfig: CfnHookVersion.LoggingConfigProperty) {
      cdkBuilder.loggingConfig(loggingConfig.let(CfnHookVersion.LoggingConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f919faf1015d5a9527bc8c4bc1b7adf53fc3dfa1b8ba24e74cbf8001a5ccb8f")
    override
        fun loggingConfig(loggingConfig: CfnHookVersion.LoggingConfigProperty.Builder.() -> Unit):
        Unit = loggingConfig(CfnHookVersion.LoggingConfigProperty(loggingConfig))

    override fun schemaHandlerPackage(schemaHandlerPackage: String) {
      cdkBuilder.schemaHandlerPackage(schemaHandlerPackage)
    }

    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.CfnHookVersionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnHookVersionProps,
  ) : CdkObject(cdkObject), CfnHookVersionProps {
    override fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

    override fun loggingConfig(): Any? = unwrap(this).getLoggingConfig()

    override fun schemaHandlerPackage(): String = unwrap(this).getSchemaHandlerPackage()

    override fun typeName(): String = unwrap(this).getTypeName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnHookVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnHookVersionProps): CfnHookVersionProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnHookVersionProps): software.amazon.awscdk.CfnHookVersionProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.CfnHookVersionProps
  }
}