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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The navigation operation that navigates between different sheets in the same analysis.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CustomActionNavigationOperationProperty customActionNavigationOperationProperty =
 * CustomActionNavigationOperationProperty.builder()
 * .localNavigationConfiguration(LocalNavigationConfigurationProperty.builder()
 * .targetSheetId("targetSheetId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-customactionnavigationoperation.html)
 */
@CdkDslMarker
public class CfnAnalysisCustomActionNavigationOperationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.CustomActionNavigationOperationProperty.Builder =
        CfnAnalysis.CustomActionNavigationOperationProperty.builder()

    /** @param localNavigationConfiguration The configuration that chooses the navigation target. */
    public fun localNavigationConfiguration(localNavigationConfiguration: IResolvable) {
        cdkBuilder.localNavigationConfiguration(localNavigationConfiguration)
    }

    /** @param localNavigationConfiguration The configuration that chooses the navigation target. */
    public fun localNavigationConfiguration(
        localNavigationConfiguration: CfnAnalysis.LocalNavigationConfigurationProperty
    ) {
        cdkBuilder.localNavigationConfiguration(localNavigationConfiguration)
    }

    public fun build(): CfnAnalysis.CustomActionNavigationOperationProperty = cdkBuilder.build()
}
