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
import software.amazon.awscdk.services.quicksight.CfnDataSource
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDataSourceSqlServerParametersPropertyDsl {
    private val cdkBuilder: CfnDataSource.SqlServerParametersProperty.Builder =
        CfnDataSource.SqlServerParametersProperty.builder()

    public fun database(database: String) {
        cdkBuilder.database(database)
    }

    public fun host(host: String) {
        cdkBuilder.host(host)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun build(): CfnDataSource.SqlServerParametersProperty = cdkBuilder.build()
}
