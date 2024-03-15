@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface FirelensOptions {
  public fun configFileType(): FirelensConfigFileType? =
      unwrap(this).getConfigFileType()?.let(FirelensConfigFileType::wrap)

  public fun configFileValue(): String? = unwrap(this).getConfigFileValue()

  public fun enableEcsLogMetadata(): Boolean? = unwrap(this).getEnableECSLogMetadata()

  @CdkDslMarker
  public interface Builder {
    public fun configFileType(configFileType: FirelensConfigFileType)

    public fun configFileValue(configFileValue: String)

    public fun enableEcsLogMetadata(enableEcsLogMetadata: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.FirelensOptions.Builder =
        software.amazon.awscdk.services.ecs.FirelensOptions.builder()

    override fun configFileType(configFileType: FirelensConfigFileType) {
      cdkBuilder.configFileType(configFileType.let(FirelensConfigFileType::unwrap))
    }

    override fun configFileValue(configFileValue: String) {
      cdkBuilder.configFileValue(configFileValue)
    }

    override fun enableEcsLogMetadata(enableEcsLogMetadata: Boolean) {
      cdkBuilder.enableEcsLogMetadata(enableEcsLogMetadata)
    }

    public fun build(): software.amazon.awscdk.services.ecs.FirelensOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.FirelensOptions,
  ) : CdkObject(cdkObject), FirelensOptions {
    override fun configFileType(): FirelensConfigFileType? =
        unwrap(this).getConfigFileType()?.let(FirelensConfigFileType::wrap)

    override fun configFileValue(): String? = unwrap(this).getConfigFileValue()

    override fun enableEcsLogMetadata(): Boolean? = unwrap(this).getEnableECSLogMetadata()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FirelensOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FirelensOptions):
        FirelensOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FirelensOptions):
        software.amazon.awscdk.services.ecs.FirelensOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.FirelensOptions
  }
}
