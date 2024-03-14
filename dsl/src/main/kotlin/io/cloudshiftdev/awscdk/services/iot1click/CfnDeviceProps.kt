package io.cloudshiftdev.awscdk.services.iot1click

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnDeviceProps {
  /**
   * The ID of the device, such as `G030PX0312744DWM` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-deviceid)
   */
  public fun deviceId(): String

  /**
   * A Boolean value indicating whether the device is enabled ( `true` ) or not ( `false` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-enabled)
   */
  public fun enabled(): Any

  /**
   * A builder for [CfnDeviceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deviceId The ID of the device, such as `G030PX0312744DWM` . 
     */
    public fun deviceId(deviceId: String)

    /**
     * @param enabled A Boolean value indicating whether the device is enabled ( `true` ) or not (
     * `false` ). 
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled A Boolean value indicating whether the device is enabled ( `true` ) or not (
     * `false` ). 
     */
    public fun enabled(enabled: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot1click.CfnDeviceProps.Builder =
        software.amazon.awscdk.services.iot1click.CfnDeviceProps.builder()

    /**
     * @param deviceId The ID of the device, such as `G030PX0312744DWM` . 
     */
    override fun deviceId(deviceId: String) {
      cdkBuilder.deviceId(deviceId)
    }

    /**
     * @param enabled A Boolean value indicating whether the device is enabled ( `true` ) or not (
     * `false` ). 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled A Boolean value indicating whether the device is enabled ( `true` ) or not (
     * `false` ). 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iot1click.CfnDeviceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot1click.CfnDeviceProps,
  ) : CdkObject(cdkObject), CfnDeviceProps {
    /**
     * The ID of the device, such as `G030PX0312744DWM` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-deviceid)
     */
    override fun deviceId(): String = unwrap(this).getDeviceId()

    /**
     * A Boolean value indicating whether the device is enabled ( `true` ) or not ( `false` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot1click-device.html#cfn-iot1click-device-enabled)
     */
    override fun enabled(): Any = unwrap(this).getEnabled()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDeviceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot1click.CfnDeviceProps):
        CfnDeviceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDeviceProps):
        software.amazon.awscdk.services.iot1click.CfnDeviceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iot1click.CfnDeviceProps
  }
}
