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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The side border options for a table.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TableSideBorderOptionsProperty tableSideBorderOptionsProperty =
 * TableSideBorderOptionsProperty.builder()
 * .bottom(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .innerHorizontal(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .innerVertical(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .left(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .right(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .top(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-tablesideborderoptions.html)
 */
@CdkDslMarker
public class CfnDashboardTableSideBorderOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.TableSideBorderOptionsProperty.Builder =
        CfnDashboard.TableSideBorderOptionsProperty.builder()

    /** @param bottom The table border options of the bottom border. */
    public fun bottom(bottom: IResolvable) {
        cdkBuilder.bottom(bottom)
    }

    /** @param bottom The table border options of the bottom border. */
    public fun bottom(bottom: CfnDashboard.TableBorderOptionsProperty) {
        cdkBuilder.bottom(bottom)
    }

    /** @param innerHorizontal The table border options of the inner horizontal border. */
    public fun innerHorizontal(innerHorizontal: IResolvable) {
        cdkBuilder.innerHorizontal(innerHorizontal)
    }

    /** @param innerHorizontal The table border options of the inner horizontal border. */
    public fun innerHorizontal(innerHorizontal: CfnDashboard.TableBorderOptionsProperty) {
        cdkBuilder.innerHorizontal(innerHorizontal)
    }

    /** @param innerVertical The table border options of the inner vertical border. */
    public fun innerVertical(innerVertical: IResolvable) {
        cdkBuilder.innerVertical(innerVertical)
    }

    /** @param innerVertical The table border options of the inner vertical border. */
    public fun innerVertical(innerVertical: CfnDashboard.TableBorderOptionsProperty) {
        cdkBuilder.innerVertical(innerVertical)
    }

    /** @param left The table border options of the left border. */
    public fun left(left: IResolvable) {
        cdkBuilder.left(left)
    }

    /** @param left The table border options of the left border. */
    public fun left(left: CfnDashboard.TableBorderOptionsProperty) {
        cdkBuilder.left(left)
    }

    /** @param right The table border options of the right border. */
    public fun right(right: IResolvable) {
        cdkBuilder.right(right)
    }

    /** @param right The table border options of the right border. */
    public fun right(right: CfnDashboard.TableBorderOptionsProperty) {
        cdkBuilder.right(right)
    }

    /** @param top The table border options of the top border. */
    public fun top(top: IResolvable) {
        cdkBuilder.top(top)
    }

    /** @param top The table border options of the top border. */
    public fun top(top: CfnDashboard.TableBorderOptionsProperty) {
        cdkBuilder.top(top)
    }

    public fun build(): CfnDashboard.TableSideBorderOptionsProperty = cdkBuilder.build()
}
