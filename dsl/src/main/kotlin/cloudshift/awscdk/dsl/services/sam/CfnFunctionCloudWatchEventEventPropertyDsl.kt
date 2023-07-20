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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.sam.CfnFunction
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnFunctionCloudWatchEventEventPropertyDsl {
    private val cdkBuilder: CfnFunction.CloudWatchEventEventProperty.Builder =
        CfnFunction.CloudWatchEventEventProperty.builder()

    public fun input(input: String) {
        cdkBuilder.input(input)
    }

    public fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
    }

    public fun pattern(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.pattern(builder.map)
    }

    public fun pattern(pattern: Any) {
        cdkBuilder.pattern(pattern)
    }

    public fun build(): CfnFunction.CloudWatchEventEventProperty = cdkBuilder.build()
}
