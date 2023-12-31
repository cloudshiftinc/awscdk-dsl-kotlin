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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * The option that determines the hierarchy of the fields for a visual element.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ColumnHierarchyProperty columnHierarchyProperty = ColumnHierarchyProperty.builder()
 * .dateTimeHierarchy(DateTimeHierarchyProperty.builder()
 * .hierarchyId("hierarchyId")
 * // the properties below are optional
 * .drillDownFilters(List.of(DrillDownFilterProperty.builder()
 * .categoryFilter(CategoryDrillDownFilterProperty.builder()
 * .categoryValues(List.of("categoryValues"))
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .build())
 * .numericEqualityFilter(NumericEqualityDrillDownFilterProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .value(123)
 * .build())
 * .timeRangeFilter(TimeRangeDrillDownFilterProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .rangeMaximum("rangeMaximum")
 * .rangeMinimum("rangeMinimum")
 * .timeGranularity("timeGranularity")
 * .build())
 * .build()))
 * .build())
 * .explicitHierarchy(ExplicitHierarchyProperty.builder()
 * .columns(List.of(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build()))
 * .hierarchyId("hierarchyId")
 * // the properties below are optional
 * .drillDownFilters(List.of(DrillDownFilterProperty.builder()
 * .categoryFilter(CategoryDrillDownFilterProperty.builder()
 * .categoryValues(List.of("categoryValues"))
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .build())
 * .numericEqualityFilter(NumericEqualityDrillDownFilterProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .value(123)
 * .build())
 * .timeRangeFilter(TimeRangeDrillDownFilterProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .rangeMaximum("rangeMaximum")
 * .rangeMinimum("rangeMinimum")
 * .timeGranularity("timeGranularity")
 * .build())
 * .build()))
 * .build())
 * .predefinedHierarchy(PredefinedHierarchyProperty.builder()
 * .columns(List.of(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build()))
 * .hierarchyId("hierarchyId")
 * // the properties below are optional
 * .drillDownFilters(List.of(DrillDownFilterProperty.builder()
 * .categoryFilter(CategoryDrillDownFilterProperty.builder()
 * .categoryValues(List.of("categoryValues"))
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .build())
 * .numericEqualityFilter(NumericEqualityDrillDownFilterProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .value(123)
 * .build())
 * .timeRangeFilter(TimeRangeDrillDownFilterProperty.builder()
 * .column(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .rangeMaximum("rangeMaximum")
 * .rangeMinimum("rangeMinimum")
 * .timeGranularity("timeGranularity")
 * .build())
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-columnhierarchy.html)
 */
@CdkDslMarker
public class CfnAnalysisColumnHierarchyPropertyDsl {
    private val cdkBuilder: CfnAnalysis.ColumnHierarchyProperty.Builder =
        CfnAnalysis.ColumnHierarchyProperty.builder()

    /**
     * @param dateTimeHierarchy The option that determines the hierarchy of any `DateTime` fields.
     */
    public fun dateTimeHierarchy(dateTimeHierarchy: IResolvable) {
        cdkBuilder.dateTimeHierarchy(dateTimeHierarchy)
    }

    /**
     * @param dateTimeHierarchy The option that determines the hierarchy of any `DateTime` fields.
     */
    public fun dateTimeHierarchy(dateTimeHierarchy: CfnAnalysis.DateTimeHierarchyProperty) {
        cdkBuilder.dateTimeHierarchy(dateTimeHierarchy)
    }

    /**
     * @param explicitHierarchy The option that determines the hierarchy of the fields that are
     *   built within a visual's field wells. These fields can't be duplicated to other visuals.
     */
    public fun explicitHierarchy(explicitHierarchy: IResolvable) {
        cdkBuilder.explicitHierarchy(explicitHierarchy)
    }

    /**
     * @param explicitHierarchy The option that determines the hierarchy of the fields that are
     *   built within a visual's field wells. These fields can't be duplicated to other visuals.
     */
    public fun explicitHierarchy(explicitHierarchy: CfnAnalysis.ExplicitHierarchyProperty) {
        cdkBuilder.explicitHierarchy(explicitHierarchy)
    }

    /**
     * @param predefinedHierarchy The option that determines the hierarchy of the fields that are
     *   defined during data preparation. These fields are available to use in any analysis that
     *   uses the data source.
     */
    public fun predefinedHierarchy(predefinedHierarchy: IResolvable) {
        cdkBuilder.predefinedHierarchy(predefinedHierarchy)
    }

    /**
     * @param predefinedHierarchy The option that determines the hierarchy of the fields that are
     *   defined during data preparation. These fields are available to use in any analysis that
     *   uses the data source.
     */
    public fun predefinedHierarchy(predefinedHierarchy: CfnAnalysis.PredefinedHierarchyProperty) {
        cdkBuilder.predefinedHierarchy(predefinedHierarchy)
    }

    public fun build(): CfnAnalysis.ColumnHierarchyProperty = cdkBuilder.build()
}
