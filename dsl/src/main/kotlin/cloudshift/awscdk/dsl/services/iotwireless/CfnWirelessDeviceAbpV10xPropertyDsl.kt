@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnWirelessDevice
import kotlin.String

@CdkDslMarker
public class CfnWirelessDeviceAbpV10xPropertyDsl {
    private val cdkBuilder: CfnWirelessDevice.AbpV10xProperty.Builder =
        CfnWirelessDevice.AbpV10xProperty.builder()

    public fun devAddr(devAddr: String) {
        cdkBuilder.devAddr(devAddr)
    }

    public fun sessionKeys(sessionKeys: IResolvable) {
        cdkBuilder.sessionKeys(sessionKeys)
    }

    public fun sessionKeys(sessionKeys: CfnWirelessDevice.SessionKeysAbpV10xProperty) {
        cdkBuilder.sessionKeys(sessionKeys)
    }

    public fun build(): CfnWirelessDevice.AbpV10xProperty = cdkBuilder.build()
}
