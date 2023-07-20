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
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition
import kotlin.Boolean

@CdkDslMarker
public class CfnDataQualityJobDefinitionDatasetFormatPropertyDsl {
    private val cdkBuilder: CfnDataQualityJobDefinition.DatasetFormatProperty.Builder =
        CfnDataQualityJobDefinition.DatasetFormatProperty.builder()

    public fun csv(csv: IResolvable) {
        cdkBuilder.csv(csv)
    }

    public fun csv(csv: CfnDataQualityJobDefinition.CsvProperty) {
        cdkBuilder.csv(csv)
    }

    public fun json(json: IResolvable) {
        cdkBuilder.json(json)
    }

    public fun json(json: CfnDataQualityJobDefinition.JsonProperty) {
        cdkBuilder.json(json)
    }

    public fun parquet(parquet: Boolean) {
        cdkBuilder.parquet(parquet)
    }

    public fun parquet(parquet: IResolvable) {
        cdkBuilder.parquet(parquet)
    }

    public fun build(): CfnDataQualityJobDefinition.DatasetFormatProperty = cdkBuilder.build()
}
