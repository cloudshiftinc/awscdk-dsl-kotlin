@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface LogDriverConfig {
  public fun logDriver(): String

  public fun options(): Map<String, String> = unwrap(this).getOptions() ?: emptyMap()

  public fun secretOptions(): List<CfnTaskDefinition.SecretProperty> =
      unwrap(this).getSecretOptions()?.map(CfnTaskDefinition.SecretProperty::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun logDriver(logDriver: String)

    public fun options(options: Map<String, String>)

    public fun secretOptions(secretOptions: List<CfnTaskDefinition.SecretProperty>)

    public fun secretOptions(vararg secretOptions: CfnTaskDefinition.SecretProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.LogDriverConfig.Builder =
        software.amazon.awscdk.services.ecs.LogDriverConfig.builder()

    override fun logDriver(logDriver: String) {
      cdkBuilder.logDriver(logDriver)
    }

    override fun options(options: Map<String, String>) {
      cdkBuilder.options(options)
    }

    override fun secretOptions(secretOptions: List<CfnTaskDefinition.SecretProperty>) {
      cdkBuilder.secretOptions(secretOptions.map(CfnTaskDefinition.SecretProperty::unwrap))
    }

    override fun secretOptions(vararg secretOptions: CfnTaskDefinition.SecretProperty): Unit =
        secretOptions(secretOptions.toList())

    public fun build(): software.amazon.awscdk.services.ecs.LogDriverConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.LogDriverConfig,
  ) : CdkObject(cdkObject), LogDriverConfig {
    override fun logDriver(): String = unwrap(this).getLogDriver()

    override fun options(): Map<String, String> = unwrap(this).getOptions() ?: emptyMap()

    override fun secretOptions(): List<CfnTaskDefinition.SecretProperty> =
        unwrap(this).getSecretOptions()?.map(CfnTaskDefinition.SecretProperty::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LogDriverConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.LogDriverConfig):
        LogDriverConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogDriverConfig):
        software.amazon.awscdk.services.ecs.LogDriverConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.LogDriverConfig
  }
}