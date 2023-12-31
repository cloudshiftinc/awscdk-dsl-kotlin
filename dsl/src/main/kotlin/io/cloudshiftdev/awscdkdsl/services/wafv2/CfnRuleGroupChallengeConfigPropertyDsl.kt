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

package io.cloudshiftdev.awscdkdsl.services.wafv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnRuleGroup

/**
 * Specifies how AWS WAF should handle `Challenge` evaluations.
 *
 * This is available at the web ACL level and in each rule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * ChallengeConfigProperty challengeConfigProperty = ChallengeConfigProperty.builder()
 * .immunityTimeProperty(ImmunityTimePropertyProperty.builder()
 * .immunityTime(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-challengeconfig.html)
 */
@CdkDslMarker
public class CfnRuleGroupChallengeConfigPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.ChallengeConfigProperty.Builder =
        CfnRuleGroup.ChallengeConfigProperty.builder()

    /**
     * @param immunityTimeProperty Determines how long a challenge timestamp in the token remains
     *   valid after the client successfully responds to a challenge.
     */
    public fun immunityTimeProperty(immunityTimeProperty: IResolvable) {
        cdkBuilder.immunityTimeProperty(immunityTimeProperty)
    }

    /**
     * @param immunityTimeProperty Determines how long a challenge timestamp in the token remains
     *   valid after the client successfully responds to a challenge.
     */
    public fun immunityTimeProperty(
        immunityTimeProperty: CfnRuleGroup.ImmunityTimePropertyProperty
    ) {
        cdkBuilder.immunityTimeProperty(immunityTimeProperty)
    }

    public fun build(): CfnRuleGroup.ChallengeConfigProperty = cdkBuilder.build()
}
