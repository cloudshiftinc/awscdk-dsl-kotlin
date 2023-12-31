@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.networkmanager

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkmanager.CfnDevice
import software.amazon.awscdk.services.networkmanager.CfnDeviceProps

/**
 * Properties for defining a `CfnDevice`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * CfnDeviceProps cfnDeviceProps = CfnDeviceProps.builder()
 * .globalNetworkId("globalNetworkId")
 * // the properties below are optional
 * .awsLocation(AWSLocationProperty.builder()
 * .subnetArn("subnetArn")
 * .zone("zone")
 * .build())
 * .description("description")
 * .location(LocationProperty.builder()
 * .address("address")
 * .latitude("latitude")
 * .longitude("longitude")
 * .build())
 * .model("model")
 * .serialNumber("serialNumber")
 * .siteId("siteId")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .type("type")
 * .vendor("vendor")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-device.html)
 */
@CdkDslMarker
public class CfnDevicePropsDsl {
    private val cdkBuilder: CfnDeviceProps.Builder = CfnDeviceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param awsLocation The Amazon Web Services location of the device, if applicable. */
    public fun awsLocation(awsLocation: IResolvable) {
        cdkBuilder.awsLocation(awsLocation)
    }

    /** @param awsLocation The Amazon Web Services location of the device, if applicable. */
    public fun awsLocation(awsLocation: CfnDevice.AWSLocationProperty) {
        cdkBuilder.awsLocation(awsLocation)
    }

    /**
     * @param description A description of the device. Constraints: Maximum length of 256
     *   characters.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param globalNetworkId The ID of the global network. */
    public fun globalNetworkId(globalNetworkId: String) {
        cdkBuilder.globalNetworkId(globalNetworkId)
    }

    /** @param location The site location. */
    public fun location(location: IResolvable) {
        cdkBuilder.location(location)
    }

    /** @param location The site location. */
    public fun location(location: CfnDevice.LocationProperty) {
        cdkBuilder.location(location)
    }

    /** @param model The model of the device. Constraints: Maximum length of 128 characters. */
    public fun model(model: String) {
        cdkBuilder.model(model)
    }

    /**
     * @param serialNumber The serial number of the device. Constraints: Maximum length of 128
     *   characters.
     */
    public fun serialNumber(serialNumber: String) {
        cdkBuilder.serialNumber(serialNumber)
    }

    /** @param siteId The site ID. */
    public fun siteId(siteId: String) {
        cdkBuilder.siteId(siteId)
    }

    /** @param tags The tags for the device. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags for the device. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param type The device type. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /** @param vendor The vendor of the device. Constraints: Maximum length of 128 characters. */
    public fun vendor(vendor: String) {
        cdkBuilder.vendor(vendor)
    }

    public fun build(): CfnDeviceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
