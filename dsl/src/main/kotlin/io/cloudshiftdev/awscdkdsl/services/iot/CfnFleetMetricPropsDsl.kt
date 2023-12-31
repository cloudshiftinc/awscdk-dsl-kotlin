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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnFleetMetric
import software.amazon.awscdk.services.iot.CfnFleetMetricProps

/**
 * Properties for defining a `CfnFleetMetric`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnFleetMetricProps cfnFleetMetricProps = CfnFleetMetricProps.builder()
 * .metricName("metricName")
 * // the properties below are optional
 * .aggregationField("aggregationField")
 * .aggregationType(AggregationTypeProperty.builder()
 * .name("name")
 * .values(List.of("values"))
 * .build())
 * .description("description")
 * .indexName("indexName")
 * .period(123)
 * .queryString("queryString")
 * .queryVersion("queryVersion")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .unit("unit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html)
 */
@CdkDslMarker
public class CfnFleetMetricPropsDsl {
    private val cdkBuilder: CfnFleetMetricProps.Builder = CfnFleetMetricProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param aggregationField The field to aggregate. */
    public fun aggregationField(aggregationField: String) {
        cdkBuilder.aggregationField(aggregationField)
    }

    /** @param aggregationType The type of the aggregation query. */
    public fun aggregationType(aggregationType: IResolvable) {
        cdkBuilder.aggregationType(aggregationType)
    }

    /** @param aggregationType The type of the aggregation query. */
    public fun aggregationType(aggregationType: CfnFleetMetric.AggregationTypeProperty) {
        cdkBuilder.aggregationType(aggregationType)
    }

    /** @param description The fleet metric description. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param indexName The name of the index to search. */
    public fun indexName(indexName: String) {
        cdkBuilder.indexName(indexName)
    }

    /** @param metricName The name of the fleet metric to create. */
    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    /**
     * @param period The time in seconds between fleet metric emissions. Range
     *   [60(1 min), 86400(1 day)] and must be multiple of 60.
     */
    public fun period(period: Number) {
        cdkBuilder.period(period)
    }

    /** @param queryString The search query string. */
    public fun queryString(queryString: String) {
        cdkBuilder.queryString(queryString)
    }

    /** @param queryVersion The query version. */
    public fun queryVersion(queryVersion: String) {
        cdkBuilder.queryVersion(queryVersion)
    }

    /** @param tags Metadata which can be used to manage the fleet metric. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Metadata which can be used to manage the fleet metric. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param unit Used to support unit transformation such as milliseconds to seconds. Must be a
     *   unit supported by CW metric. Default to null.
     */
    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    public fun build(): CfnFleetMetricProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
