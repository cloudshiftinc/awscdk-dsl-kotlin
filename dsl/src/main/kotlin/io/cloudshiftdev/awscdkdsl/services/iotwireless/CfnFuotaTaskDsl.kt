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

package io.cloudshiftdev.awscdkdsl.services.iotwireless

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnFuotaTask
import software.constructs.Construct

/**
 * A FUOTA task.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * CfnFuotaTask cfnFuotaTask = CfnFuotaTask.Builder.create(this, "MyCfnFuotaTask")
 * .firmwareUpdateImage("firmwareUpdateImage")
 * .firmwareUpdateRole("firmwareUpdateRole")
 * .loRaWan(LoRaWANProperty.builder()
 * .rfRegion("rfRegion")
 * // the properties below are optional
 * .startTime("startTime")
 * .build())
 * // the properties below are optional
 * .associateMulticastGroup("associateMulticastGroup")
 * .associateWirelessDevice("associateWirelessDevice")
 * .description("description")
 * .disassociateMulticastGroup("disassociateMulticastGroup")
 * .disassociateWirelessDevice("disassociateWirelessDevice")
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html)
 */
@CdkDslMarker
public class CfnFuotaTaskDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFuotaTask.Builder = CfnFuotaTask.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The ID of the multicast group to associate with a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-associatemulticastgroup)
     *
     * @param associateMulticastGroup The ID of the multicast group to associate with a FUOTA task.
     */
    public fun associateMulticastGroup(associateMulticastGroup: String) {
        cdkBuilder.associateMulticastGroup(associateMulticastGroup)
    }

    /**
     * The ID of the wireless device to associate with a multicast group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-associatewirelessdevice)
     *
     * @param associateWirelessDevice The ID of the wireless device to associate with a multicast
     *   group.
     */
    public fun associateWirelessDevice(associateWirelessDevice: String) {
        cdkBuilder.associateWirelessDevice(associateWirelessDevice)
    }

    /**
     * The description of the new resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-description)
     *
     * @param description The description of the new resource.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The ID of the multicast group to disassociate from a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-disassociatemulticastgroup)
     *
     * @param disassociateMulticastGroup The ID of the multicast group to disassociate from a FUOTA
     *   task.
     */
    public fun disassociateMulticastGroup(disassociateMulticastGroup: String) {
        cdkBuilder.disassociateMulticastGroup(disassociateMulticastGroup)
    }

    /**
     * The ID of the wireless device to disassociate from a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-disassociatewirelessdevice)
     *
     * @param disassociateWirelessDevice The ID of the wireless device to disassociate from a FUOTA
     *   task.
     */
    public fun disassociateWirelessDevice(disassociateWirelessDevice: String) {
        cdkBuilder.disassociateWirelessDevice(disassociateWirelessDevice)
    }

    /**
     * The S3 URI points to a firmware update image that is to be used with a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-firmwareupdateimage)
     *
     * @param firmwareUpdateImage The S3 URI points to a firmware update image that is to be used
     *   with a FUOTA task.
     */
    public fun firmwareUpdateImage(firmwareUpdateImage: String) {
        cdkBuilder.firmwareUpdateImage(firmwareUpdateImage)
    }

    /**
     * The firmware update role that is to be used with a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-firmwareupdaterole)
     *
     * @param firmwareUpdateRole The firmware update role that is to be used with a FUOTA task.
     */
    public fun firmwareUpdateRole(firmwareUpdateRole: String) {
        cdkBuilder.firmwareUpdateRole(firmwareUpdateRole)
    }

    /**
     * The LoRaWAN information used with a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-lorawan)
     *
     * @param loRaWan The LoRaWAN information used with a FUOTA task.
     */
    public fun loRaWan(loRaWan: IResolvable) {
        cdkBuilder.loRaWan(loRaWan)
    }

    /**
     * The LoRaWAN information used with a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-lorawan)
     *
     * @param loRaWan The LoRaWAN information used with a FUOTA task.
     */
    public fun loRaWan(loRaWan: CfnFuotaTask.LoRaWANProperty) {
        cdkBuilder.loRaWan(loRaWan)
    }

    /**
     * The name of a FUOTA task.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-name)
     *
     * @param name The name of a FUOTA task.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-tags)
     *
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags are an array of key-value pairs to attach to the specified resource.
     *
     * Tags can have a minimum of 0 and a maximum of 50 items.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotwireless-fuotatask.html#cfn-iotwireless-fuotatask-tags)
     *
     * @param tags The tags are an array of key-value pairs to attach to the specified resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnFuotaTask {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
