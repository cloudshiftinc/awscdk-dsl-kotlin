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
import software.amazon.awscdk.services.networkmanager.CfnConnectPeer
import software.amazon.awscdk.services.networkmanager.CfnConnectPeerProps

/**
 * Properties for defining a `CfnConnectPeer`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * CfnConnectPeerProps cfnConnectPeerProps = CfnConnectPeerProps.builder()
 * .connectAttachmentId("connectAttachmentId")
 * .peerAddress("peerAddress")
 * // the properties below are optional
 * .bgpOptions(BgpOptionsProperty.builder()
 * .peerAsn(123)
 * .build())
 * .coreNetworkAddress("coreNetworkAddress")
 * .insideCidrBlocks(List.of("insideCidrBlocks"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-connectpeer.html)
 */
@CdkDslMarker
public class CfnConnectPeerPropsDsl {
    private val cdkBuilder: CfnConnectPeerProps.Builder = CfnConnectPeerProps.builder()

    private val _insideCidrBlocks: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param bgpOptions Bgp options. */
    public fun bgpOptions(bgpOptions: IResolvable) {
        cdkBuilder.bgpOptions(bgpOptions)
    }

    /** @param bgpOptions Bgp options. */
    public fun bgpOptions(bgpOptions: CfnConnectPeer.BgpOptionsProperty) {
        cdkBuilder.bgpOptions(bgpOptions)
    }

    /** @param connectAttachmentId The ID of the attachment to connect. */
    public fun connectAttachmentId(connectAttachmentId: String) {
        cdkBuilder.connectAttachmentId(connectAttachmentId)
    }

    /** @param coreNetworkAddress The IP address of a core network. */
    public fun coreNetworkAddress(coreNetworkAddress: String) {
        cdkBuilder.coreNetworkAddress(coreNetworkAddress)
    }

    /** @param insideCidrBlocks The inside IP addresses used for a Connect peer configuration. */
    public fun insideCidrBlocks(vararg insideCidrBlocks: String) {
        _insideCidrBlocks.addAll(listOf(*insideCidrBlocks))
    }

    /** @param insideCidrBlocks The inside IP addresses used for a Connect peer configuration. */
    public fun insideCidrBlocks(insideCidrBlocks: Collection<String>) {
        _insideCidrBlocks.addAll(insideCidrBlocks)
    }

    /** @param peerAddress The IP address of the Connect peer. */
    public fun peerAddress(peerAddress: String) {
        cdkBuilder.peerAddress(peerAddress)
    }

    /** @param tags The list of key-value tags associated with the Connect peer. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The list of key-value tags associated with the Connect peer. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnConnectPeerProps {
        if (_insideCidrBlocks.isNotEmpty()) cdkBuilder.insideCidrBlocks(_insideCidrBlocks)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
