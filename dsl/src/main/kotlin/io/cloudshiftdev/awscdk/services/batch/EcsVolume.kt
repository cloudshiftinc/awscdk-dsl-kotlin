package io.cloudshiftdev.awscdk.services.batch

import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class EcsVolume internal constructor(
  private val cdkObject: software.amazon.awscdk.services.batch.EcsVolume,
) {
  public open fun containerPath(): String = unwrap(this).getContainerPath()

  public open fun name(): String = unwrap(this).getName()

  public open fun readonly(): Boolean? = unwrap(this).getReadonly()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.EcsVolume,
  ) : EcsVolume(cdkObject)

  public companion object {
    public open fun efs(options: EfsVolumeOptions): EfsVolume =
        software.amazon.awscdk.services.batch.EcsVolume.efs(options.let(EfsVolumeOptions::unwrap)).let(EfsVolume::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9275ffcb192fc3d2a8ef19e2ccbb251879805035fb5b6e25a33d4fb8f155c71b")
    public open fun efs(options: EfsVolumeOptions.Builder.() -> Unit): EfsVolume =
        efs(EfsVolumeOptions(options))

    public open fun host(options: HostVolumeOptions): HostVolume =
        software.amazon.awscdk.services.batch.EcsVolume.host(options.let(HostVolumeOptions::unwrap)).let(HostVolume::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95ba5d1b24b828eb8450cd58e809325a975ce6934b25a34c881235e47d1fa54d")
    public open fun host(options: HostVolumeOptions.Builder.() -> Unit): HostVolume =
        host(HostVolumeOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EcsVolume): EcsVolume =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsVolume): software.amazon.awscdk.services.batch.EcsVolume =
        (wrapped as Wrapper).cdkObject
  }
}
