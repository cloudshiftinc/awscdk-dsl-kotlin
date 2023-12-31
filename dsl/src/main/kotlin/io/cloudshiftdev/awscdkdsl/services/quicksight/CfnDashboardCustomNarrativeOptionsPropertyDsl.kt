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
 * The custom narrative options.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CustomNarrativeOptionsProperty customNarrativeOptionsProperty =
 * CustomNarrativeOptionsProperty.builder()
 * .narrative("narrative")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-customnarrativeoptions.html)
 */
@CdkDslMarker
public class CfnDashboardCustomNarrativeOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.CustomNarrativeOptionsProperty.Builder =
        CfnDashboard.CustomNarrativeOptionsProperty.builder()

    /** @param narrative The string input of custom narrative. */
    public fun narrative(narrative: String) {
        cdkBuilder.narrative(narrative)
    }

    public fun build(): CfnDashboard.CustomNarrativeOptionsProperty = cdkBuilder.build()
}
