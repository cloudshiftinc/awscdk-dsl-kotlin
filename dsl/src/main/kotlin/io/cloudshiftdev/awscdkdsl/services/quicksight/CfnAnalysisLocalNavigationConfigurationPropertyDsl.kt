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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The navigation configuration for `CustomActionNavigationOperation` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * LocalNavigationConfigurationProperty localNavigationConfigurationProperty =
 * LocalNavigationConfigurationProperty.builder()
 * .targetSheetId("targetSheetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-localnavigationconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisLocalNavigationConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.LocalNavigationConfigurationProperty.Builder =
        CfnAnalysis.LocalNavigationConfigurationProperty.builder()

    /** @param targetSheetId The sheet that is targeted for navigation in the same analysis. */
    public fun targetSheetId(targetSheetId: String) {
        cdkBuilder.targetSheetId(targetSheetId)
    }

    public fun build(): CfnAnalysis.LocalNavigationConfigurationProperty = cdkBuilder.build()
}
