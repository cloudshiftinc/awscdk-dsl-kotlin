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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The top movers and bottom movers computation setup.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-topbottommoverscomputation.html)
 */
@CdkDslMarker
public class CfnDashboardTopBottomMoversComputationPropertyDsl {
    private val cdkBuilder: CfnDashboard.TopBottomMoversComputationProperty.Builder =
        CfnDashboard.TopBottomMoversComputationProperty.builder()

    /** @param category The category field that is used in a computation. */
    public fun category(category: IResolvable) {
        cdkBuilder.category(category)
    }

    /** @param category The category field that is used in a computation. */
    public fun category(category: CfnDashboard.DimensionFieldProperty) {
        cdkBuilder.category(category)
    }

    /** @param computationId The ID for a computation. */
    public fun computationId(computationId: String) {
        cdkBuilder.computationId(computationId)
    }

    /** @param moverSize The mover size setup of the top and bottom movers computation. */
    public fun moverSize(moverSize: Number) {
        cdkBuilder.moverSize(moverSize)
    }

    /** @param name The name of a computation. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param sortOrder The sort order setup of the top and bottom movers computation. */
    public fun sortOrder(sortOrder: String) {
        cdkBuilder.sortOrder(sortOrder)
    }

    /** @param time The time field that is used in a computation. */
    public fun time(time: IResolvable) {
        cdkBuilder.time(time)
    }

    /** @param time The time field that is used in a computation. */
    public fun time(time: CfnDashboard.DimensionFieldProperty) {
        cdkBuilder.time(time)
    }

    /**
     * @param type The computation type. Choose from the following options:.
     * * TOP: Top movers computation.
     * * BOTTOM: Bottom movers computation.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /** @param value The value field that is used in a computation. */
    public fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`)
    }

    /** @param value The value field that is used in a computation. */
    public fun `value`(`value`: CfnDashboard.MeasureFieldProperty) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnDashboard.TopBottomMoversComputationProperty = cdkBuilder.build()
}
