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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.glue.CfnCrawler
import kotlin.String

@CdkDslMarker
public class CfnCrawlerMongoDBTargetPropertyDsl {
    private val cdkBuilder: CfnCrawler.MongoDBTargetProperty.Builder =
        CfnCrawler.MongoDBTargetProperty.builder()

    public fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): CfnCrawler.MongoDBTargetProperty = cdkBuilder.build()
}
