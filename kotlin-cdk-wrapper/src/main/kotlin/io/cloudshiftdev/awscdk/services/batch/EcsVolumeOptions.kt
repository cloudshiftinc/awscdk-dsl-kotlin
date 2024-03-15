@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface EcsVolumeOptions {
  public fun containerPath(): String

  public fun name(): String

  public fun readonly(): Boolean? = unwrap(this).getReadonly()

  @CdkDslMarker
  public interface Builder {
    public fun containerPath(containerPath: String)

    public fun name(name: String)

    public fun readonly(readonly: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EcsVolumeOptions.Builder =
        software.amazon.awscdk.services.batch.EcsVolumeOptions.builder()

    override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun readonly(readonly: Boolean) {
      cdkBuilder.readonly(readonly)
    }

    public fun build(): software.amazon.awscdk.services.batch.EcsVolumeOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.EcsVolumeOptions,
  ) : CdkObject(cdkObject), EcsVolumeOptions {
    override fun containerPath(): String = unwrap(this).getContainerPath()

    override fun name(): String = unwrap(this).getName()

    override fun readonly(): Boolean? = unwrap(this).getReadonly()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsVolumeOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EcsVolumeOptions):
        EcsVolumeOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsVolumeOptions):
        software.amazon.awscdk.services.batch.EcsVolumeOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.batch.EcsVolumeOptions
  }
}
