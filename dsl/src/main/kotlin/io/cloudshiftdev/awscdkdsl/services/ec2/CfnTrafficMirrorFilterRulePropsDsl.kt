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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRule
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterRuleProps

/**
 * Properties for defining a `CfnTrafficMirrorFilterRule`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnTrafficMirrorFilterRuleProps cfnTrafficMirrorFilterRuleProps =
 * CfnTrafficMirrorFilterRuleProps.builder()
 * .destinationCidrBlock("destinationCidrBlock")
 * .ruleAction("ruleAction")
 * .ruleNumber(123)
 * .sourceCidrBlock("sourceCidrBlock")
 * .trafficDirection("trafficDirection")
 * .trafficMirrorFilterId("trafficMirrorFilterId")
 * // the properties below are optional
 * .description("description")
 * .destinationPortRange(TrafficMirrorPortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build())
 * .protocol(123)
 * .sourcePortRange(TrafficMirrorPortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilterrule.html)
 */
@CdkDslMarker
public class CfnTrafficMirrorFilterRulePropsDsl {
    private val cdkBuilder: CfnTrafficMirrorFilterRuleProps.Builder =
        CfnTrafficMirrorFilterRuleProps.builder()

    /** @param description The description of the Traffic Mirror rule. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param destinationCidrBlock The destination CIDR block to assign to the Traffic Mirror rule.
     */
    public fun destinationCidrBlock(destinationCidrBlock: String) {
        cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    /** @param destinationPortRange The destination port range. */
    public fun destinationPortRange(destinationPortRange: IResolvable) {
        cdkBuilder.destinationPortRange(destinationPortRange)
    }

    /** @param destinationPortRange The destination port range. */
    public fun destinationPortRange(
        destinationPortRange: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty
    ) {
        cdkBuilder.destinationPortRange(destinationPortRange)
    }

    /**
     * @param protocol The protocol, for example UDP, to assign to the Traffic Mirror rule. For
     *   information about the protocol value, see
     *   [Protocol Numbers](https://docs.aws.amazon.com/https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml)
     *   on the Internet Assigned Numbers Authority (IANA) website.
     */
    public fun protocol(protocol: Number) {
        cdkBuilder.protocol(protocol)
    }

    /** @param ruleAction The action to take on the filtered traffic. */
    public fun ruleAction(ruleAction: String) {
        cdkBuilder.ruleAction(ruleAction)
    }

    /**
     * @param ruleNumber The number of the Traffic Mirror rule. This number must be unique for each
     *   Traffic Mirror rule in a given direction. The rules are processed in ascending order by
     *   rule number.
     */
    public fun ruleNumber(ruleNumber: Number) {
        cdkBuilder.ruleNumber(ruleNumber)
    }

    /** @param sourceCidrBlock The source CIDR block to assign to the Traffic Mirror rule. */
    public fun sourceCidrBlock(sourceCidrBlock: String) {
        cdkBuilder.sourceCidrBlock(sourceCidrBlock)
    }

    /** @param sourcePortRange The source port range. */
    public fun sourcePortRange(sourcePortRange: IResolvable) {
        cdkBuilder.sourcePortRange(sourcePortRange)
    }

    /** @param sourcePortRange The source port range. */
    public fun sourcePortRange(
        sourcePortRange: CfnTrafficMirrorFilterRule.TrafficMirrorPortRangeProperty
    ) {
        cdkBuilder.sourcePortRange(sourcePortRange)
    }

    /** @param trafficDirection The type of traffic. */
    public fun trafficDirection(trafficDirection: String) {
        cdkBuilder.trafficDirection(trafficDirection)
    }

    /** @param trafficMirrorFilterId The ID of the filter that this rule is associated with. */
    public fun trafficMirrorFilterId(trafficMirrorFilterId: String) {
        cdkBuilder.trafficMirrorFilterId(trafficMirrorFilterId)
    }

    public fun build(): CfnTrafficMirrorFilterRuleProps = cdkBuilder.build()
}
