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

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnConfigRule
import software.constructs.Construct

/**
 * You must first create and start the AWS Config configuration recorder in order to create AWS
 * Config managed rules with AWS CloudFormation .
 *
 * For more information, see
 * [Managing the Configuration Recorder](https://docs.aws.amazon.com/config/latest/developerguide/stop-start-recorder.html)
 * .
 *
 * Adds or updates an AWS Config rule to evaluate if your AWS resources comply with your desired
 * configurations. For information on how many AWS Config rules you can have per account, see
 * [*Service Limits*](https://docs.aws.amazon.com/config/latest/developerguide/configlimits.html) in
 * the *AWS Config Developer Guide* .
 *
 * There are two types of rules: *AWS Config Managed Rules* and *AWS Config Custom Rules* . You can
 * use the `ConfigRule` resource to create both AWS Config Managed Rules and AWS Config Custom
 * Rules.
 *
 * AWS Config Managed Rules are predefined, customizable rules created by AWS Config . For a list of
 * managed rules, see
 * [List of AWS Config Managed Rules](https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html)
 * . If you are adding an AWS Config managed rule, you must specify the rule's identifier for the
 * `SourceIdentifier` key.
 *
 * AWS Config Custom Rules are rules that you create from scratch. There are two ways to create AWS
 * Config custom rules: with Lambda functions (
 * [AWS Lambda Developer Guide](https://docs.aws.amazon.com/config/latest/developerguide/gettingstarted-concepts.html#gettingstarted-concepts-function)
 * ) and with Guard (
 * [Guard GitHub Repository](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-guard)
 * ), a policy-as-code language. AWS Config custom rules created with AWS Lambda are called *AWS
 * Config Custom Lambda Rules* and AWS Config custom rules created with Guard are called *AWS Config
 * Custom Policy Rules* .
 *
 * If you are adding a new AWS Config Custom Lambda rule, you first need to create an AWS Lambda
 * function that the rule invokes to evaluate your resources. When you use the `ConfigRule` resource
 * to add a Custom Lambda rule to AWS Config , you must specify the Amazon Resource Name (ARN) that
 * AWS Lambda assigns to the function. You specify the ARN in the `SourceIdentifier` key. This key
 * is part of the `Source` object, which is part of the `ConfigRule` object.
 *
 * For any new AWS Config rule that you add, specify the `ConfigRuleName` in the `ConfigRule`
 * object. Do not specify the `ConfigRuleArn` or the `ConfigRuleId` . These values are generated by
 * AWS Config for new rules.
 *
 * If you are updating a rule that you added previously, you can specify the rule by
 * `ConfigRuleName` , `ConfigRuleId` , or `ConfigRuleArn` in the `ConfigRule` data type that you use
 * in this request.
 *
 * For more information about developing and using AWS Config rules, see
 * [Evaluating Resources with AWS Config Rules](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config.html)
 * in the *AWS Config Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * Object inputParameters;
 * CfnConfigRule cfnConfigRule = CfnConfigRule.Builder.create(this, "MyCfnConfigRule")
 * .source(SourceProperty.builder()
 * .owner("owner")
 * // the properties below are optional
 * .customPolicyDetails(CustomPolicyDetailsProperty.builder()
 * .enableDebugLogDelivery(false)
 * .policyRuntime("policyRuntime")
 * .policyText("policyText")
 * .build())
 * .sourceDetails(List.of(SourceDetailProperty.builder()
 * .eventSource("eventSource")
 * .messageType("messageType")
 * // the properties below are optional
 * .maximumExecutionFrequency("maximumExecutionFrequency")
 * .build()))
 * .sourceIdentifier("sourceIdentifier")
 * .build())
 * // the properties below are optional
 * .compliance(ComplianceProperty.builder()
 * .type("type")
 * .build())
 * .configRuleName("configRuleName")
 * .description("description")
 * .evaluationModes(List.of(EvaluationModeConfigurationProperty.builder()
 * .mode("mode")
 * .build()))
 * .inputParameters(inputParameters)
 * .maximumExecutionFrequency("maximumExecutionFrequency")
 * .scope(ScopeProperty.builder()
 * .complianceResourceId("complianceResourceId")
 * .complianceResourceTypes(List.of("complianceResourceTypes"))
 * .tagKey("tagKey")
 * .tagValue("tagValue")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html)
 */
@CdkDslMarker
public class CfnConfigRuleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConfigRule.Builder = CfnConfigRule.Builder.create(scope, id)

    private val _evaluationModes: MutableList<Any> = mutableListOf()

    /**
     * Compliance details of the Config rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-compliance)
     *
     * @param compliance Compliance details of the Config rule.
     */
    public fun compliance(compliance: IResolvable) {
        cdkBuilder.compliance(compliance)
    }

    /**
     * Compliance details of the Config rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-compliance)
     *
     * @param compliance Compliance details of the Config rule.
     */
    public fun compliance(compliance: CfnConfigRule.ComplianceProperty) {
        cdkBuilder.compliance(compliance)
    }

    /**
     * A name for the AWS Config rule.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the rule name. For more information, see
     * [Name Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-configrulename)
     *
     * @param configRuleName A name for the AWS Config rule.
     */
    public fun configRuleName(configRuleName: String) {
        cdkBuilder.configRuleName(configRuleName)
    }

    /**
     * The description that you provide for the AWS Config rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-description)
     *
     * @param description The description that you provide for the AWS Config rule.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * List of EvaluationModeConfiguration objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-evaluationmodes)
     *
     * @param evaluationModes List of EvaluationModeConfiguration objects.
     */
    public fun evaluationModes(vararg evaluationModes: Any) {
        _evaluationModes.addAll(listOf(*evaluationModes))
    }

    /**
     * List of EvaluationModeConfiguration objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-evaluationmodes)
     *
     * @param evaluationModes List of EvaluationModeConfiguration objects.
     */
    public fun evaluationModes(evaluationModes: Collection<Any>) {
        _evaluationModes.addAll(evaluationModes)
    }

    /**
     * List of EvaluationModeConfiguration objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-evaluationmodes)
     *
     * @param evaluationModes List of EvaluationModeConfiguration objects.
     */
    public fun evaluationModes(evaluationModes: IResolvable) {
        cdkBuilder.evaluationModes(evaluationModes)
    }

    /**
     * A string, in JSON format, that is passed to the AWS Config rule Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-inputparameters)
     *
     * @param inputParameters A string, in JSON format, that is passed to the AWS Config rule Lambda
     *   function.
     */
    public fun inputParameters(inputParameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(inputParameters)
        cdkBuilder.inputParameters(builder.map)
    }

    /**
     * A string, in JSON format, that is passed to the AWS Config rule Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-inputparameters)
     *
     * @param inputParameters A string, in JSON format, that is passed to the AWS Config rule Lambda
     *   function.
     */
    public fun inputParameters(inputParameters: Any) {
        cdkBuilder.inputParameters(inputParameters)
    }

    /**
     * The maximum frequency with which AWS Config runs evaluations for a rule.
     *
     * You can specify a value for `MaximumExecutionFrequency` when:
     * * You are using an AWS managed rule that is triggered at a periodic frequency.
     * * Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more
     *   information, see
     *   [ConfigSnapshotDeliveryProperties](https://docs.aws.amazon.com/config/latest/APIReference/API_ConfigSnapshotDeliveryProperties.html)
     *   .
     *
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the
     * frequency, specify a valid value for the `MaximumExecutionFrequency` parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-maximumexecutionfrequency)
     *
     * @param maximumExecutionFrequency The maximum frequency with which AWS Config runs evaluations
     *   for a rule.
     */
    public fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
        cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
    }

    /**
     * Defines which resources can trigger an evaluation for the rule.
     *
     * The scope can include one or more resource types, a combination of one resource type and one
     * resource ID, or a combination of a tag key and value. Specify a scope to constrain the
     * resources that can trigger an evaluation for the rule. If you do not specify a scope,
     * evaluations are triggered when any resource in the recording group changes.
     *
     * The scope can be empty.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-scope)
     *
     * @param scope Defines which resources can trigger an evaluation for the rule.
     */
    public fun scope(scope: IResolvable) {
        cdkBuilder.scope(scope)
    }

    /**
     * Defines which resources can trigger an evaluation for the rule.
     *
     * The scope can include one or more resource types, a combination of one resource type and one
     * resource ID, or a combination of a tag key and value. Specify a scope to constrain the
     * resources that can trigger an evaluation for the rule. If you do not specify a scope,
     * evaluations are triggered when any resource in the recording group changes.
     *
     * The scope can be empty.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-scope)
     *
     * @param scope Defines which resources can trigger an evaluation for the rule.
     */
    public fun scope(scope: CfnConfigRule.ScopeProperty) {
        cdkBuilder.scope(scope)
    }

    /**
     * Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom Policy rules,
     * and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the notifications that
     * cause the function to evaluate your AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-source)
     *
     * @param source Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom
     *   Policy rules, and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the
     *   notifications that cause the function to evaluate your AWS resources.
     */
    public fun source(source: IResolvable) {
        cdkBuilder.source(source)
    }

    /**
     * Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom Policy rules,
     * and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the notifications that
     * cause the function to evaluate your AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-config-configrule.html#cfn-config-configrule-source)
     *
     * @param source Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom
     *   Policy rules, and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the
     *   notifications that cause the function to evaluate your AWS resources.
     */
    public fun source(source: CfnConfigRule.SourceProperty) {
        cdkBuilder.source(source)
    }

    public fun build(): CfnConfigRule {
        if (_evaluationModes.isNotEmpty()) cdkBuilder.evaluationModes(_evaluationModes)
        return cdkBuilder.build()
    }
}
