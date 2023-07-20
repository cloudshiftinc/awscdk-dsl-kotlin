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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

@CdkDslMarker
public class CfnAnalysisSetParameterValueConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.SetParameterValueConfigurationProperty.Builder =
        CfnAnalysis.SetParameterValueConfigurationProperty.builder()

    public fun destinationParameterName(destinationParameterName: String) {
        cdkBuilder.destinationParameterName(destinationParameterName)
    }

    public fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`)
    }

    public fun `value`(`value`: CfnAnalysis.DestinationParameterValueConfigurationProperty) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnAnalysis.SetParameterValueConfigurationProperty = cdkBuilder.build()
}
