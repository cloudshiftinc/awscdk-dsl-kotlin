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
import kotlin.collections.Map
import software.amazon.awscdk.services.config.ManagedRuleProps
import software.amazon.awscdk.services.config.MaximumExecutionFrequency
import software.amazon.awscdk.services.config.RuleScope

/**
 * Construction properties for a ManagedRule.
 *
 * Example:
 * ```
 * // https://docs.aws.amazon.com/config/latest/developerguide/access-keys-rotated.html
 * // https://docs.aws.amazon.com/config/latest/developerguide/access-keys-rotated.html
 * ManagedRule.Builder.create(this, "AccessKeysRotated")
 * .identifier(ManagedRuleIdentifiers.ACCESS_KEYS_ROTATED)
 * .inputParameters(Map.of(
 * "maxAccessKeyAge", 60))
 * // default is 24 hours
 * .maximumExecutionFrequency(MaximumExecutionFrequency.TWELVE_HOURS)
 * .build();
 * ```
 */
@CdkDslMarker
public class ManagedRulePropsDsl {
    private val cdkBuilder: ManagedRuleProps.Builder = ManagedRuleProps.builder()

    /** @param configRuleName A name for the AWS Config rule. */
    public fun configRuleName(configRuleName: String) {
        cdkBuilder.configRuleName(configRuleName)
    }

    /** @param description A description about this AWS Config rule. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param identifier The identifier of the AWS managed rule. */
    public fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
    }

    /** @param inputParameters Input parameter values that are passed to the AWS Config rule. */
    public fun inputParameters(inputParameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(inputParameters)
        cdkBuilder.inputParameters(builder.map)
    }

    /** @param inputParameters Input parameter values that are passed to the AWS Config rule. */
    public fun inputParameters(inputParameters: Map<String, Any>) {
        cdkBuilder.inputParameters(inputParameters)
    }

    /**
     * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs
     *   evaluations.
     */
    public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency) {
        cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
    }

    /** @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule. */
    public fun ruleScope(ruleScope: RuleScope) {
        cdkBuilder.ruleScope(ruleScope)
    }

    public fun build(): ManagedRuleProps = cdkBuilder.build()
}
