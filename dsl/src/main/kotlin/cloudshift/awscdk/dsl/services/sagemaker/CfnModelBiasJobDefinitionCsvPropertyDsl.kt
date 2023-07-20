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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelBiasJobDefinition
import kotlin.Boolean

@CdkDslMarker
public class CfnModelBiasJobDefinitionCsvPropertyDsl {
    private val cdkBuilder: CfnModelBiasJobDefinition.CsvProperty.Builder =
        CfnModelBiasJobDefinition.CsvProperty.builder()

    public fun `header`(`header`: Boolean) {
        cdkBuilder.`header`(`header`)
    }

    public fun `header`(`header`: IResolvable) {
        cdkBuilder.`header`(`header`)
    }

    public fun build(): CfnModelBiasJobDefinition.CsvProperty = cdkBuilder.build()
}
