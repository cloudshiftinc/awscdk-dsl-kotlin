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
import software.amazon.awscdk.services.networkmanager.CfnSiteToSiteVpnAttachment
import software.constructs.Construct

/**
 * Creates an Amazon Web Services site-to-site VPN attachment on an edge location of a core network.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * CfnSiteToSiteVpnAttachment cfnSiteToSiteVpnAttachment =
 * CfnSiteToSiteVpnAttachment.Builder.create(this, "MyCfnSiteToSiteVpnAttachment")
 * .coreNetworkId("coreNetworkId")
 * .vpnConnectionArn("vpnConnectionArn")
 * // the properties below are optional
 * .proposedSegmentChange(ProposedSegmentChangeProperty.builder()
 * .attachmentPolicyRuleNumber(123)
 * .segmentName("segmentName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html)
 */
@CdkDslMarker
public class CfnSiteToSiteVpnAttachmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSiteToSiteVpnAttachment.Builder =
        CfnSiteToSiteVpnAttachment.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The ID of a core network where you're creating a site-to-site VPN attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-corenetworkid)
     *
     * @param coreNetworkId The ID of a core network where you're creating a site-to-site VPN
     *   attachment.
     */
    public fun coreNetworkId(coreNetworkId: String) {
        cdkBuilder.coreNetworkId(coreNetworkId)
    }

    /**
     * The attachment to move from one segment to another.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-proposedsegmentchange)
     *
     * @param proposedSegmentChange The attachment to move from one segment to another.
     */
    public fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
        cdkBuilder.proposedSegmentChange(proposedSegmentChange)
    }

    /**
     * The attachment to move from one segment to another.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-proposedsegmentchange)
     *
     * @param proposedSegmentChange The attachment to move from one segment to another.
     */
    public fun proposedSegmentChange(
        proposedSegmentChange: CfnSiteToSiteVpnAttachment.ProposedSegmentChangeProperty
    ) {
        cdkBuilder.proposedSegmentChange(proposedSegmentChange)
    }

    /**
     * Tags for the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-tags)
     *
     * @param tags Tags for the attachment.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Tags for the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-tags)
     *
     * @param tags Tags for the attachment.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The ARN of the site-to-site VPN attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-sitetositevpnattachment.html#cfn-networkmanager-sitetositevpnattachment-vpnconnectionarn)
     *
     * @param vpnConnectionArn The ARN of the site-to-site VPN attachment.
     */
    public fun vpnConnectionArn(vpnConnectionArn: String) {
        cdkBuilder.vpnConnectionArn(vpnConnectionArn)
    }

    public fun build(): CfnSiteToSiteVpnAttachment {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
