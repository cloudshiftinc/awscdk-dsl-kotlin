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
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * An ad hoc (one-time) filtering option.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * AdHocFilteringOptionProperty adHocFilteringOptionProperty =
 * AdHocFilteringOptionProperty.builder()
 * .availabilityStatus("availabilityStatus")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-adhocfilteringoption.html)
 */
@CdkDslMarker
public class CfnDashboardAdHocFilteringOptionPropertyDsl {
    private val cdkBuilder: CfnDashboard.AdHocFilteringOptionProperty.Builder =
        CfnDashboard.AdHocFilteringOptionProperty.builder()

    /** @param availabilityStatus Availability status. */
    public fun availabilityStatus(availabilityStatus: String) {
        cdkBuilder.availabilityStatus(availabilityStatus)
    }

    public fun build(): CfnDashboard.AdHocFilteringOptionProperty = cdkBuilder.build()
}
