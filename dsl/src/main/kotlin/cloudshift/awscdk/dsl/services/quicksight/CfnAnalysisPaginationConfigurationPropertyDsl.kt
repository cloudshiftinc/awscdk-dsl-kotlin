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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Number

@CdkDslMarker
public class CfnAnalysisPaginationConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.PaginationConfigurationProperty.Builder =
        CfnAnalysis.PaginationConfigurationProperty.builder()

    public fun pageNumber(pageNumber: Number) {
        cdkBuilder.pageNumber(pageNumber)
    }

    public fun pageSize(pageSize: Number) {
        cdkBuilder.pageSize(pageSize)
    }

    public fun build(): CfnAnalysis.PaginationConfigurationProperty = cdkBuilder.build()
}
