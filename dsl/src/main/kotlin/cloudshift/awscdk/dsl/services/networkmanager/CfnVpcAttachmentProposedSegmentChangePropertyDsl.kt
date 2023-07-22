@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.networkmanager.CfnVpcAttachment

/**
 * Describes a proposed segment change.
 *
 * In some cases, the segment change must first be evaluated and accepted.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * ProposedSegmentChangeProperty proposedSegmentChangeProperty =
 * ProposedSegmentChangeProperty.builder()
 * .attachmentPolicyRuleNumber(123)
 * .segmentName("segmentName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-vpcattachment-proposedsegmentchange.html)
 */
@CdkDslMarker
public class CfnVpcAttachmentProposedSegmentChangePropertyDsl {
  private val cdkBuilder: CfnVpcAttachment.ProposedSegmentChangeProperty.Builder =
      CfnVpcAttachment.ProposedSegmentChangeProperty.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param attachmentPolicyRuleNumber The rule number in the policy document that applies to this
   * change.
   */
  public fun attachmentPolicyRuleNumber(attachmentPolicyRuleNumber: Number) {
    cdkBuilder.attachmentPolicyRuleNumber(attachmentPolicyRuleNumber)
  }

  /**
   * @param segmentName The name of the segment to change.
   */
  public fun segmentName(segmentName: String) {
    cdkBuilder.segmentName(segmentName)
  }

  /**
   * @param tags The list of key-value tags that changed for the segment.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The list of key-value tags that changed for the segment.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnVpcAttachment.ProposedSegmentChangeProperty {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
