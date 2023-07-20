@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.elasticloadbalancingv2.AddApplicationTargetGroupsProps
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationTargetGroup
import software.amazon.awscdk.services.elasticloadbalancingv2.ListenerCondition
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class AddApplicationTargetGroupsPropsDsl {
    private val cdkBuilder: AddApplicationTargetGroupsProps.Builder =
        AddApplicationTargetGroupsProps.builder()

    private val _conditions: MutableList<ListenerCondition> = mutableListOf()

    private val _targetGroups: MutableList<IApplicationTargetGroup> = mutableListOf()

    public fun conditions(vararg conditions: ListenerCondition) {
        _conditions.addAll(listOf(*conditions))
    }

    public fun conditions(conditions: Collection<ListenerCondition>) {
        _conditions.addAll(conditions)
    }

    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    public fun targetGroups(vararg targetGroups: IApplicationTargetGroup) {
        _targetGroups.addAll(listOf(*targetGroups))
    }

    public fun targetGroups(targetGroups: Collection<IApplicationTargetGroup>) {
        _targetGroups.addAll(targetGroups)
    }

    public fun build(): AddApplicationTargetGroupsProps {
        if (_conditions.isNotEmpty()) cdkBuilder.conditions(_conditions)
        if (_targetGroups.isNotEmpty()) cdkBuilder.targetGroups(_targetGroups)
        return cdkBuilder.build()
    }
}
