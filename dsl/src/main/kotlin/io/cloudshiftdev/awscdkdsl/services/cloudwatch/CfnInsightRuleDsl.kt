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

package io.cloudshiftdev.awscdkdsl.services.cloudwatch

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.cloudwatch.CfnInsightRule
import software.constructs.Construct

/**
 * Creates or updates a Contributor Insights rule.
 *
 * Rules evaluate log events in a CloudWatch Logs log group, enabling you to find contributor data
 * for the log events in that log group. For more information, see
 * [Using Contributor Insights to Analyze High-Cardinality Data](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights.html)
 * in the *Amazon CloudWatch User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
 * CfnInsightRule cfnInsightRule = CfnInsightRule.Builder.create(this, "MyCfnInsightRule")
 * .ruleBody("ruleBody")
 * .ruleName("ruleName")
 * .ruleState("ruleState")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html)
 */
@CdkDslMarker
public class CfnInsightRuleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnInsightRule.Builder = CfnInsightRule.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The definition of the rule, as a JSON object.
     *
     * For details about the syntax, see
     * [Contributor Insights Rule Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights-RuleSyntax.html)
     * in the *Amazon CloudWatch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulebody)
     *
     * @param ruleBody The definition of the rule, as a JSON object.
     */
    public fun ruleBody(ruleBody: String) {
        cdkBuilder.ruleBody(ruleBody)
    }

    /**
     * The name of the rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulename)
     *
     * @param ruleName The name of the rule.
     */
    public fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
    }

    /**
     * The current state of the rule.
     *
     * Valid values are `ENABLED` and `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-rulestate)
     *
     * @param ruleState The current state of the rule.
     */
    public fun ruleState(ruleState: String) {
        cdkBuilder.ruleState(ruleState)
    }

    /**
     * A list of key-value pairs to associate with the Contributor Insights rule.
     *
     * You can associate as many as 50 tags with a rule.
     *
     * Tags can help you organize and categorize your resources. For more information, see
     * [Tagging Your Amazon CloudWatch Resources](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Tagging.html)
     * .
     *
     * To be able to associate tags with a rule, you must have the `cloudwatch:TagResource`
     * permission in addition to the `cloudwatch:PutInsightRule` permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-tags)
     *
     * @param tags A list of key-value pairs to associate with the Contributor Insights rule.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of key-value pairs to associate with the Contributor Insights rule.
     *
     * You can associate as many as 50 tags with a rule.
     *
     * Tags can help you organize and categorize your resources. For more information, see
     * [Tagging Your Amazon CloudWatch Resources](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Tagging.html)
     * .
     *
     * To be able to associate tags with a rule, you must have the `cloudwatch:TagResource`
     * permission in addition to the `cloudwatch:PutInsightRule` permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html#cfn-cloudwatch-insightrule-tags)
     *
     * @param tags A list of key-value pairs to associate with the Contributor Insights rule.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnInsightRule {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
