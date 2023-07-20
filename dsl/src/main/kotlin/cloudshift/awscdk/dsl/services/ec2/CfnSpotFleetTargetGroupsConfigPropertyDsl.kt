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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSpotFleet
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnSpotFleetTargetGroupsConfigPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.TargetGroupsConfigProperty.Builder =
        CfnSpotFleet.TargetGroupsConfigProperty.builder()

    private val _targetGroups: MutableList<Any> = mutableListOf()

    public fun targetGroups(vararg targetGroups: Any) {
        _targetGroups.addAll(listOf(*targetGroups))
    }

    public fun targetGroups(targetGroups: Collection<Any>) {
        _targetGroups.addAll(targetGroups)
    }

    public fun targetGroups(targetGroups: IResolvable) {
        cdkBuilder.targetGroups(targetGroups)
    }

    public fun build(): CfnSpotFleet.TargetGroupsConfigProperty {
        if (_targetGroups.isNotEmpty()) cdkBuilder.targetGroups(_targetGroups)
        return cdkBuilder.build()
    }
}
