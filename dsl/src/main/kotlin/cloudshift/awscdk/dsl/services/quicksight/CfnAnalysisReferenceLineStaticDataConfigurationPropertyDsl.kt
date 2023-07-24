@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Number

/**
 * The static data configuration of the reference line data configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ReferenceLineStaticDataConfigurationProperty referenceLineStaticDataConfigurationProperty =
 * ReferenceLineStaticDataConfigurationProperty.builder()
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-referencelinestaticdataconfiguration.html)
 */
@CdkDslMarker
public class CfnAnalysisReferenceLineStaticDataConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ReferenceLineStaticDataConfigurationProperty.Builder =
        CfnAnalysis.ReferenceLineStaticDataConfigurationProperty.builder()

    /**
     * @param value The double input of the static data.
     */
    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnAnalysis.ReferenceLineStaticDataConfigurationProperty = cdkBuilder.build()
}
