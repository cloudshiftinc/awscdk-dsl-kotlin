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

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.cloudwatch.CustomWidget
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CustomWidgetDsl {
    private val cdkBuilder: CustomWidget.Builder = CustomWidget.Builder.create()

    public fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
    }

    public fun height(height: Number) {
        cdkBuilder.height(height)
    }

    public fun params(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.params(builder.map)
    }

    public fun params(params: Any) {
        cdkBuilder.params(params)
    }

    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    public fun updateOnRefresh(updateOnRefresh: Boolean) {
        cdkBuilder.updateOnRefresh(updateOnRefresh)
    }

    public fun updateOnResize(updateOnResize: Boolean) {
        cdkBuilder.updateOnResize(updateOnResize)
    }

    public fun updateOnTimeRangeChange(updateOnTimeRangeChange: Boolean) {
        cdkBuilder.updateOnTimeRangeChange(updateOnTimeRangeChange)
    }

    public fun width(width: Number) {
        cdkBuilder.width(width)
    }

    public fun build(): CustomWidget = cdkBuilder.build()
}
