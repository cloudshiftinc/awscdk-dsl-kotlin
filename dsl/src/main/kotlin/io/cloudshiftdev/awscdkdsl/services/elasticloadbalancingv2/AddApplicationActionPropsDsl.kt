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

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationActionProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction
import software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition

/**
 * Properties for adding a new action to a listener.
 *
 * Example:
 * ```
 * ApplicationListener listener;
 * listener.addAction("Fixed", AddApplicationActionProps.builder()
 * .priority(10)
 * .conditions(List.of(ListenerCondition.pathPatterns(List.of("/ok"))))
 * .action(ListenerAction.fixedResponse(200, FixedResponseOptions.builder()
 * .contentType("text/plain")
 * .messageBody("OK")
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class AddApplicationActionPropsDsl {
    private val cdkBuilder: AddApplicationActionProps.Builder = AddApplicationActionProps.builder()

    private val _conditions: MutableList<ListenerCondition> = mutableListOf()

    /** @param action Action to perform. */
    public fun action(action: ListenerAction) {
        cdkBuilder.action(action)
    }

    /** @param conditions Rule applies if matches the conditions. */
    public fun conditions(vararg conditions: ListenerCondition) {
        _conditions.addAll(listOf(*conditions))
    }

    /** @param conditions Rule applies if matches the conditions. */
    public fun conditions(conditions: Collection<ListenerCondition>) {
        _conditions.addAll(conditions)
    }

    /**
     * @param priority Priority of this target group. The rule with the lowest priority will be used
     *   for every request. If priority is not given, these target groups will be added as defaults,
     *   and must not have conditions.
     *
     * Priorities must be unique.
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    public fun build(): AddApplicationActionProps {
        if (_conditions.isNotEmpty()) cdkBuilder.conditions(_conditions)
        return cdkBuilder.build()
    }
}
