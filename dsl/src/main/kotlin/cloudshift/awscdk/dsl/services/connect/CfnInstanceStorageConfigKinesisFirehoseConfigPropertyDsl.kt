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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig
import kotlin.String

@CdkDslMarker
public class CfnInstanceStorageConfigKinesisFirehoseConfigPropertyDsl {
    private val cdkBuilder: CfnInstanceStorageConfig.KinesisFirehoseConfigProperty.Builder =
        CfnInstanceStorageConfig.KinesisFirehoseConfigProperty.builder()

    public fun firehoseArn(firehoseArn: String) {
        cdkBuilder.firehoseArn(firehoseArn)
    }

    public fun build(): CfnInstanceStorageConfig.KinesisFirehoseConfigProperty = cdkBuilder.build()
}
