@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.logs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.cloudwatch.Unit
import software.amazon.awscdk.services.logs.IFilterPattern
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.logs.MetricFilterProps

/**
 * Properties for a MetricFilter.
 *
 * Example:
 * ```
 * MetricFilter.Builder.create(this, "MetricFilter")
 * .logGroup(logGroup)
 * .metricNamespace("MyApp")
 * .metricName("Latency")
 * .filterPattern(FilterPattern.exists("$.latency"))
 * .metricValue("$.latency")
 * .build();
 * ```
 */
@CdkDslMarker
public class MetricFilterPropsDsl {
    private val cdkBuilder: MetricFilterProps.Builder = MetricFilterProps.builder()

    /** @param defaultValue The value to emit if the pattern does not match a particular event. */
    public fun defaultValue(defaultValue: Number) {
        cdkBuilder.defaultValue(defaultValue)
    }

    /**
     * @param dimensions The fields to use as dimensions for the metric. One metric filter can
     *   include as many as three dimensions.
     */
    public fun dimensions(dimensions: Map<String, String>) {
        cdkBuilder.dimensions(dimensions)
    }

    /** @param filterName The name of the metric filter. */
    public fun filterName(filterName: String) {
        cdkBuilder.filterName(filterName)
    }

    /** @param filterPattern Pattern to search for log events. */
    public fun filterPattern(filterPattern: IFilterPattern) {
        cdkBuilder.filterPattern(filterPattern)
    }

    /** @param logGroup The log group to create the filter on. */
    public fun logGroup(logGroup: ILogGroup) {
        cdkBuilder.logGroup(logGroup)
    }

    /** @param metricName The name of the metric to emit. */
    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    /** @param metricNamespace The namespace of the metric to emit. */
    public fun metricNamespace(metricNamespace: String) {
        cdkBuilder.metricNamespace(metricNamespace)
    }

    /**
     * @param metricValue The value to emit for the metric. Can either be a literal number
     *   (typically "1"), or the name of a field in the structure to take the value from the matched
     *   event. If you are using a field value, the field value must have been matched using the
     *   pattern.
     *
     * If you want to specify a field from a matched JSON structure, use '$.fieldName', and make
     * sure the field is in the pattern (if only as '$.fieldName = *').
     *
     * If you want to specify a field from a matched space-delimited structure, use '$fieldName'.
     */
    public fun metricValue(metricValue: String) {
        cdkBuilder.metricValue(metricValue)
    }

    /** @param unit The unit to assign to the metric. */
    public fun unit(unit: Unit) {
        cdkBuilder.unit(unit)
    }

    public fun build(): MetricFilterProps = cdkBuilder.build()
}
