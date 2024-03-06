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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * A `TimeEqualityFilter` filters values that are equal to a given value.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TimeEqualityFilterProperty timeEqualityFilterProperty = TimeEqualityFilterProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .filterId("filterId")
 * // the properties below are optional
 * .parameterName("parameterName")
 * .rollingDate(RollingDateConfigurationProperty.builder()
 * .expression("expression")
 * // the properties below are optional
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .timeGranularity("timeGranularity")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-timeequalityfilter.html)
 */
@CdkDslMarker
public class CfnDashboardTimeEqualityFilterPropertyDsl {
    private val cdkBuilder: CfnDashboard.TimeEqualityFilterProperty.Builder =
        CfnDashboard.TimeEqualityFilterProperty.builder()

    /** @param column The column that the filter is applied to. */
    public fun column(column: IResolvable) {
        cdkBuilder.column(column)
    }

    /** @param column The column that the filter is applied to. */
    public fun column(column: CfnDashboard.ColumnIdentifierProperty) {
        cdkBuilder.column(column)
    }

    /**
     * @param filterId An identifier that uniquely identifies a filter within a dashboard, analysis,
     *   or template.
     */
    public fun filterId(filterId: String) {
        cdkBuilder.filterId(filterId)
    }

    /**
     * @param parameterName The parameter whose value should be used for the filter value. This
     *   field is mutually exclusive to `Value` and `RollingDate` .
     */
    public fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
    }

    /**
     * @param rollingDate The rolling date input for the `TimeEquality` filter. This field is
     *   mutually exclusive to `Value` and `ParameterName` .
     */
    public fun rollingDate(rollingDate: IResolvable) {
        cdkBuilder.rollingDate(rollingDate)
    }

    /**
     * @param rollingDate The rolling date input for the `TimeEquality` filter. This field is
     *   mutually exclusive to `Value` and `ParameterName` .
     */
    public fun rollingDate(rollingDate: CfnDashboard.RollingDateConfigurationProperty) {
        cdkBuilder.rollingDate(rollingDate)
    }

    /**
     * @param timeGranularity The level of time precision that is used to aggregate `DateTime`
     *   values.
     */
    public fun timeGranularity(timeGranularity: String) {
        cdkBuilder.timeGranularity(timeGranularity)
    }

    /**
     * @param value The value of a `TimeEquality` filter. This field is mutually exclusive to
     *   `RollingDate` and `ParameterName` .
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnDashboard.TimeEqualityFilterProperty = cdkBuilder.build()
}
