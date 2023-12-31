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

package io.cloudshiftdev.awscdkdsl.services.config

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnConfigRule
import software.amazon.awscdk.services.config.CfnConfigRuleProps

/**
 * Properties for defining a `CfnConfigRule`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * Object inputParameters;
 * CfnConfigRuleProps cfnConfigRuleProps = CfnConfigRuleProps.builder()
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
public class CfnConfigRulePropsDsl {
    private val cdkBuilder: CfnConfigRuleProps.Builder = CfnConfigRuleProps.builder()

    private val _evaluationModes: MutableList<Any> = mutableListOf()

    /** @param compliance Compliance details of the Config rule. */
    public fun compliance(compliance: IResolvable) {
        cdkBuilder.compliance(compliance)
    }

    /** @param compliance Compliance details of the Config rule. */
    public fun compliance(compliance: CfnConfigRule.ComplianceProperty) {
        cdkBuilder.compliance(compliance)
    }

    /**
     * @param configRuleName A name for the AWS Config rule. If you don't specify a name, AWS
     *   CloudFormation generates a unique physical ID and uses that ID for the rule name. For more
     *   information, see
     *   [Name Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     *   .
     */
    public fun configRuleName(configRuleName: String) {
        cdkBuilder.configRuleName(configRuleName)
    }

    /** @param description The description that you provide for the AWS Config rule. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param evaluationModes List of EvaluationModeConfiguration objects. */
    public fun evaluationModes(vararg evaluationModes: Any) {
        _evaluationModes.addAll(listOf(*evaluationModes))
    }

    /** @param evaluationModes List of EvaluationModeConfiguration objects. */
    public fun evaluationModes(evaluationModes: Collection<Any>) {
        _evaluationModes.addAll(evaluationModes)
    }

    /** @param evaluationModes List of EvaluationModeConfiguration objects. */
    public fun evaluationModes(evaluationModes: IResolvable) {
        cdkBuilder.evaluationModes(evaluationModes)
    }

    /**
     * @param inputParameters A string, in JSON format, that is passed to the AWS Config rule Lambda
     *   function.
     */
    public fun inputParameters(inputParameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(inputParameters)
        cdkBuilder.inputParameters(builder.map)
    }

    /**
     * @param inputParameters A string, in JSON format, that is passed to the AWS Config rule Lambda
     *   function.
     */
    public fun inputParameters(inputParameters: Any) {
        cdkBuilder.inputParameters(inputParameters)
    }

    /**
     * @param maximumExecutionFrequency The maximum frequency with which AWS Config runs evaluations
     *   for a rule. You can specify a value for `MaximumExecutionFrequency` when:
     * * You are using an AWS managed rule that is triggered at a periodic frequency.
     * * Your custom rule is triggered when AWS Config delivers the configuration snapshot. For more
     *   information, see
     *   [ConfigSnapshotDeliveryProperties](https://docs.aws.amazon.com/config/latest/APIReference/API_ConfigSnapshotDeliveryProperties.html)
     *   .
     *
     * By default, rules with a periodic trigger are evaluated every 24 hours. To change the
     * frequency, specify a valid value for the `MaximumExecutionFrequency` parameter.
     */
    public fun maximumExecutionFrequency(maximumExecutionFrequency: String) {
        cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
    }

    /**
     * @param scope Defines which resources can trigger an evaluation for the rule. The scope can
     *   include one or more resource types, a combination of one resource type and one resource ID,
     *   or a combination of a tag key and value. Specify a scope to constrain the resources that
     *   can trigger an evaluation for the rule. If you do not specify a scope, evaluations are
     *   triggered when any resource in the recording group changes.
     *
     * The scope can be empty.
     */
    public fun scope(scope: IResolvable) {
        cdkBuilder.scope(scope)
    }

    /**
     * @param scope Defines which resources can trigger an evaluation for the rule. The scope can
     *   include one or more resource types, a combination of one resource type and one resource ID,
     *   or a combination of a tag key and value. Specify a scope to constrain the resources that
     *   can trigger an evaluation for the rule. If you do not specify a scope, evaluations are
     *   triggered when any resource in the recording group changes.
     *
     * The scope can be empty.
     */
    public fun scope(scope: CfnConfigRule.ScopeProperty) {
        cdkBuilder.scope(scope)
    }

    /**
     * @param source Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom
     *   Policy rules, and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the
     *   notifications that cause the function to evaluate your AWS resources.
     */
    public fun source(source: IResolvable) {
        cdkBuilder.source(source)
    }

    /**
     * @param source Provides the rule owner ( `AWS` for managed rules, `CUSTOM_POLICY` for Custom
     *   Policy rules, and `CUSTOM_LAMBDA` for Custom Lambda rules), the rule identifier, and the
     *   notifications that cause the function to evaluate your AWS resources.
     */
    public fun source(source: CfnConfigRule.SourceProperty) {
        cdkBuilder.source(source)
    }

    public fun build(): CfnConfigRuleProps {
        if (_evaluationModes.isNotEmpty()) cdkBuilder.evaluationModes(_evaluationModes)
        return cdkBuilder.build()
    }
}
