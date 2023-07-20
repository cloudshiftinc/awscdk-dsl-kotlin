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

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kendra.CfnDataSource
import kotlin.String

@CdkDslMarker
public class CfnDataSourceConfluenceSpaceToIndexFieldMappingPropertyDsl {
    private val cdkBuilder: CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty.Builder =
        CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty.builder()

    public fun dataSourceFieldName(dataSourceFieldName: String) {
        cdkBuilder.dataSourceFieldName(dataSourceFieldName)
    }

    public fun dateFieldFormat(dateFieldFormat: String) {
        cdkBuilder.dateFieldFormat(dateFieldFormat)
    }

    public fun indexFieldName(indexFieldName: String) {
        cdkBuilder.indexFieldName(indexFieldName)
    }

    public fun build(): CfnDataSource.ConfluenceSpaceToIndexFieldMappingProperty = cdkBuilder.build()
}
