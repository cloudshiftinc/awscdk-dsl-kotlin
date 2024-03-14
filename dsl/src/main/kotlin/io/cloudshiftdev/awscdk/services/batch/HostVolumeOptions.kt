package io.cloudshiftdev.awscdk.services.batch

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface HostVolumeOptions : EcsVolumeOptions {
  public fun hostPath(): String? = unwrap(this).getHostPath()

  public interface Builder {
    public fun containerPath(containerPath: String) {
    }

    public fun hostPath(hostPath: String) {
    }

    public fun name(name: String) {
    }

    public fun readonly(readonly: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.HostVolumeOptions.Builder =
        software.amazon.awscdk.services.batch.HostVolumeOptions.builder()

    public override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    public override fun hostPath(hostPath: String) {
      cdkBuilder.hostPath(hostPath)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun readonly(readonly: Boolean) {
      cdkBuilder.readonly(readonly)
    }

    public fun build(): software.amazon.awscdk.services.batch.HostVolumeOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.HostVolumeOptions,
  ) : HostVolumeOptions {
    public override fun containerPath(): String = unwrap(this).getContainerPath()

    public override fun hostPath(): String? = unwrap(this).getHostPath()

    public override fun name(): String = unwrap(this).getName()

    public override fun readonly(): Boolean? = unwrap(this).getReadonly()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HostVolumeOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.HostVolumeOptions):
        HostVolumeOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HostVolumeOptions):
        software.amazon.awscdk.services.batch.HostVolumeOptions = (wrapped as Wrapper).cdkObject
  }
}
