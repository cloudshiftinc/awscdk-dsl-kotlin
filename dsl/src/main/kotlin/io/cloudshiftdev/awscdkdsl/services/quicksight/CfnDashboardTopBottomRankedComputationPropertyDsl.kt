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
 * The top ranked and bottom ranked computation configuration.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-topbottomrankedcomputation.html)
 */
@CdkDslMarker
public class CfnDashboardTopBottomRankedComputationPropertyDsl {
    private val cdkBuilder: CfnDashboard.TopBottomRankedComputationProperty.Builder =
        CfnDashboard.TopBottomRankedComputationProperty.builder()

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

    /** @param name The name of a computation. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param resultSize The result size of a top and bottom ranked computation. */
    public fun resultSize(resultSize: Number) {
        cdkBuilder.resultSize(resultSize)
    }

    /**
     * @param type The computation type. Choose one of the following options:.
     * * TOP: A top ranked computation.
     * * BOTTOM: A bottom ranked computation.
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

    public fun build(): CfnDashboard.TopBottomRankedComputationProperty = cdkBuilder.build()
}
