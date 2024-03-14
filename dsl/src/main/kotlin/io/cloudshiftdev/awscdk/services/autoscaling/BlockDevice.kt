package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface BlockDevice {
  /**
   * The device name exposed to the EC2 instance.
   *
   * Supply a value like `/dev/sdh`, `xvdh`.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html)
   */
  public fun deviceName(): String

  /**
   * Defines the block device volume, to be either an Amazon EBS volume or an ephemeral instance
   * store volume.
   *
   * Supply a value like `BlockDeviceVolume.ebs(15)`, `BlockDeviceVolume.ephemeral(0)`.
   */
  public fun volume(): BlockDeviceVolume

  /**
   * A builder for [BlockDevice]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deviceName The device name exposed to the EC2 instance. 
     * Supply a value like `/dev/sdh`, `xvdh`.
     */
    public fun deviceName(deviceName: String)

    /**
     * @param volume Defines the block device volume, to be either an Amazon EBS volume or an
     * ephemeral instance store volume. 
     * Supply a value like `BlockDeviceVolume.ebs(15)`, `BlockDeviceVolume.ephemeral(0)`.
     */
    public fun volume(volume: BlockDeviceVolume)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.BlockDevice.Builder =
        software.amazon.awscdk.services.autoscaling.BlockDevice.builder()

    /**
     * @param deviceName The device name exposed to the EC2 instance. 
     * Supply a value like `/dev/sdh`, `xvdh`.
     */
    override fun deviceName(deviceName: String) {
      cdkBuilder.deviceName(deviceName)
    }

    /**
     * @param volume Defines the block device volume, to be either an Amazon EBS volume or an
     * ephemeral instance store volume. 
     * Supply a value like `BlockDeviceVolume.ebs(15)`, `BlockDeviceVolume.ephemeral(0)`.
     */
    override fun volume(volume: BlockDeviceVolume) {
      cdkBuilder.volume(volume.let(BlockDeviceVolume::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.BlockDevice = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.BlockDevice,
  ) : CdkObject(cdkObject), BlockDevice {
    /**
     * The device name exposed to the EC2 instance.
     *
     * Supply a value like `/dev/sdh`, `xvdh`.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/device_naming.html)
     */
    override fun deviceName(): String = unwrap(this).getDeviceName()

    /**
     * Defines the block device volume, to be either an Amazon EBS volume or an ephemeral instance
     * store volume.
     *
     * Supply a value like `BlockDeviceVolume.ebs(15)`, `BlockDeviceVolume.ephemeral(0)`.
     */
    override fun volume(): BlockDeviceVolume = unwrap(this).getVolume().let(BlockDeviceVolume::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BlockDevice {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.BlockDevice):
        BlockDevice = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BlockDevice):
        software.amazon.awscdk.services.autoscaling.BlockDevice = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.autoscaling.BlockDevice
  }
}
