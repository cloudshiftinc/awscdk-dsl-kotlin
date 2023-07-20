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

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.logs.StreamOptions
import kotlin.String

@CdkDslMarker
public class StreamOptionsDsl {
    private val cdkBuilder: StreamOptions.Builder = StreamOptions.builder()

    public fun logStreamName(logStreamName: String) {
        cdkBuilder.logStreamName(logStreamName)
    }

    public fun build(): StreamOptions = cdkBuilder.build()
}
