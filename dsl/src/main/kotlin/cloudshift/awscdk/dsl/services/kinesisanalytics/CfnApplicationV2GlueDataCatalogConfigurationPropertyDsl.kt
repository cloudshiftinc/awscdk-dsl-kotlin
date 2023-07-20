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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import kotlin.String

@CdkDslMarker
public class CfnApplicationV2GlueDataCatalogConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.GlueDataCatalogConfigurationProperty.Builder =
        CfnApplicationV2.GlueDataCatalogConfigurationProperty.builder()

    public fun databaseArn(databaseArn: String) {
        cdkBuilder.databaseArn(databaseArn)
    }

    public fun build(): CfnApplicationV2.GlueDataCatalogConfigurationProperty = cdkBuilder.build()
}
