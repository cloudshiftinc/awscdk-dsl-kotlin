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
 * The date configuration of the filter.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * AnchorDateConfigurationProperty anchorDateConfigurationProperty =
 * AnchorDateConfigurationProperty.builder()
 * .anchorOption("anchorOption")
 * .parameterName("parameterName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-anchordateconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisAnchorDateConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.AnchorDateConfigurationProperty.Builder =
        CfnAnalysis.AnchorDateConfigurationProperty.builder()

    /**
     * @param anchorOption The options for the date configuration. Choose one of the options below:.
     * * `NOW`
     */
    public fun anchorOption(anchorOption: String) {
        cdkBuilder.anchorOption(anchorOption)
    }

    /**
     * @param parameterName The name of the parameter that is used for the anchor date
     *   configuration.
     */
    public fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
    }

    public fun build(): CfnAnalysis.AnchorDateConfigurationProperty = cdkBuilder.build()
}
