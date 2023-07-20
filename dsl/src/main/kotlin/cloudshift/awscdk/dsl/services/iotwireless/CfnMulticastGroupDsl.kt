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
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnMulticastGroup
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnMulticastGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnMulticastGroup.Builder = CfnMulticastGroup.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun associateWirelessDevice(associateWirelessDevice: String) {
        cdkBuilder.associateWirelessDevice(associateWirelessDevice)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun disassociateWirelessDevice(disassociateWirelessDevice: String) {
        cdkBuilder.disassociateWirelessDevice(disassociateWirelessDevice)
    }

    public fun loRaWan(loRaWan: IResolvable) {
        cdkBuilder.loRaWan(loRaWan)
    }

    public fun loRaWan(loRaWan: CfnMulticastGroup.LoRaWANProperty) {
        cdkBuilder.loRaWan(loRaWan)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnMulticastGroup {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
