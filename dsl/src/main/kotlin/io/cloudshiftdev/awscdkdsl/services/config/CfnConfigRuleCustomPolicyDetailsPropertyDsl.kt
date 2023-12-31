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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.config.CfnConfigRule

/**
 * Provides the runtime system, policy definition, and whether debug logging enabled.
 *
 * You can specify the following CustomPolicyDetails parameter values only for AWS Config Custom
 * Policy rules.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * CustomPolicyDetailsProperty customPolicyDetailsProperty = CustomPolicyDetailsProperty.builder()
 * .enableDebugLogDelivery(false)
 * .policyRuntime("policyRuntime")
 * .policyText("policyText")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-custompolicydetails.html)
 */
@CdkDslMarker
public class CfnConfigRuleCustomPolicyDetailsPropertyDsl {
    private val cdkBuilder: CfnConfigRule.CustomPolicyDetailsProperty.Builder =
        CfnConfigRule.CustomPolicyDetailsProperty.builder()

    /**
     * @param enableDebugLogDelivery The boolean expression for enabling debug logging for your AWS
     *   Config Custom Policy rule. The default value is `false` .
     */
    public fun enableDebugLogDelivery(enableDebugLogDelivery: Boolean) {
        cdkBuilder.enableDebugLogDelivery(enableDebugLogDelivery)
    }

    /**
     * @param enableDebugLogDelivery The boolean expression for enabling debug logging for your AWS
     *   Config Custom Policy rule. The default value is `false` .
     */
    public fun enableDebugLogDelivery(enableDebugLogDelivery: IResolvable) {
        cdkBuilder.enableDebugLogDelivery(enableDebugLogDelivery)
    }

    /**
     * @param policyRuntime The runtime system for your AWS Config Custom Policy rule. Guard is a
     *   policy-as-code language that allows you to write policies that are enforced by AWS Config
     *   Custom Policy rules. For more information about Guard, see the
     *   [Guard GitHub Repository](https://docs.aws.amazon.com/https://github.com/aws-cloudformation/cloudformation-guard)
     *   .
     */
    public fun policyRuntime(policyRuntime: String) {
        cdkBuilder.policyRuntime(policyRuntime)
    }

    /**
     * @param policyText The policy definition containing the logic for your AWS Config Custom
     *   Policy rule.
     */
    public fun policyText(policyText: String) {
        cdkBuilder.policyText(policyText)
    }

    public fun build(): CfnConfigRule.CustomPolicyDetailsProperty = cdkBuilder.build()
}
