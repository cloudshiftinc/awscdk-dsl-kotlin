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
import software.amazon.awscdk.services.cloudwatch.LogQueryVisualizationType
import software.amazon.awscdk.services.cloudwatch.LogQueryWidgetProps
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class LogQueryWidgetPropsDsl {
    private val cdkBuilder: LogQueryWidgetProps.Builder = LogQueryWidgetProps.builder()

    private val _logGroupNames: MutableList<String> = mutableListOf()

    private val _queryLines: MutableList<String> = mutableListOf()

    public fun height(height: Number) {
        cdkBuilder.height(height)
    }

    public fun logGroupNames(vararg logGroupNames: String) {
        _logGroupNames.addAll(listOf(*logGroupNames))
    }

    public fun logGroupNames(logGroupNames: Collection<String>) {
        _logGroupNames.addAll(logGroupNames)
    }

    public fun queryLines(vararg queryLines: String) {
        _queryLines.addAll(listOf(*queryLines))
    }

    public fun queryLines(queryLines: Collection<String>) {
        _queryLines.addAll(queryLines)
    }

    public fun queryString(queryString: String) {
        cdkBuilder.queryString(queryString)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    public fun view(view: LogQueryVisualizationType) {
        cdkBuilder.view(view)
    }

    public fun width(width: Number) {
        cdkBuilder.width(width)
    }

    public fun build(): LogQueryWidgetProps {
        if (_logGroupNames.isNotEmpty()) cdkBuilder.logGroupNames(_logGroupNames)
        if (_queryLines.isNotEmpty()) cdkBuilder.queryLines(_queryLines)
        return cdkBuilder.build()
    }
}
