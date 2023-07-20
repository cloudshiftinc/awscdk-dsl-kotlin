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

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnDeviceDefinitionVersionProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDeviceDefinitionVersionPropsDsl {
    private val cdkBuilder: CfnDeviceDefinitionVersionProps.Builder =
        CfnDeviceDefinitionVersionProps.builder()

    private val _devices: MutableList<Any> = mutableListOf()

    public fun deviceDefinitionId(deviceDefinitionId: String) {
        cdkBuilder.deviceDefinitionId(deviceDefinitionId)
    }

    public fun devices(vararg devices: Any) {
        _devices.addAll(listOf(*devices))
    }

    public fun devices(devices: Collection<Any>) {
        _devices.addAll(devices)
    }

    public fun devices(devices: IResolvable) {
        cdkBuilder.devices(devices)
    }

    public fun build(): CfnDeviceDefinitionVersionProps {
        if (_devices.isNotEmpty()) cdkBuilder.devices(_devices)
        return cdkBuilder.build()
    }
}
