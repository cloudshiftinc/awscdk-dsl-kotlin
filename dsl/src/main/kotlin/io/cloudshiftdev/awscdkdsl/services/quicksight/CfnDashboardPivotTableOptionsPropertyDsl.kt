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
 * The table options for a pivot table visual.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * PivotTableOptionsProperty pivotTableOptionsProperty = PivotTableOptionsProperty.builder()
 * .cellStyle(TableCellStyleProperty.builder()
 * .backgroundColor("backgroundColor")
 * .border(GlobalTableBorderOptionsProperty.builder()
 * .sideSpecificBorder(TableSideBorderOptionsProperty.builder()
 * .bottom(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .innerHorizontal(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .innerVertical(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .left(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .right(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .top(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .build())
 * .uniformBorder(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .build())
 * .fontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .height(123)
 * .horizontalTextAlignment("horizontalTextAlignment")
 * .textWrap("textWrap")
 * .verticalTextAlignment("verticalTextAlignment")
 * .visibility("visibility")
 * .build())
 * .collapsedRowDimensionsVisibility("collapsedRowDimensionsVisibility")
 * .columnHeaderStyle(TableCellStyleProperty.builder()
 * .backgroundColor("backgroundColor")
 * .border(GlobalTableBorderOptionsProperty.builder()
 * .sideSpecificBorder(TableSideBorderOptionsProperty.builder()
 * .bottom(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .innerHorizontal(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .innerVertical(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .left(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .right(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .top(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .build())
 * .uniformBorder(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .build())
 * .fontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .height(123)
 * .horizontalTextAlignment("horizontalTextAlignment")
 * .textWrap("textWrap")
 * .verticalTextAlignment("verticalTextAlignment")
 * .visibility("visibility")
 * .build())
 * .columnNamesVisibility("columnNamesVisibility")
 * .defaultCellWidth("defaultCellWidth")
 * .metricPlacement("metricPlacement")
 * .rowAlternateColorOptions(RowAlternateColorOptionsProperty.builder()
 * .rowAlternateColors(List.of("rowAlternateColors"))
 * .status("status")
 * .usePrimaryBackgroundColor("usePrimaryBackgroundColor")
 * .build())
 * .rowFieldNamesStyle(TableCellStyleProperty.builder()
 * .backgroundColor("backgroundColor")
 * .border(GlobalTableBorderOptionsProperty.builder()
 * .sideSpecificBorder(TableSideBorderOptionsProperty.builder()
 * .bottom(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .innerHorizontal(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .innerVertical(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .left(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .right(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .top(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .build())
 * .uniformBorder(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .build())
 * .fontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .height(123)
 * .horizontalTextAlignment("horizontalTextAlignment")
 * .textWrap("textWrap")
 * .verticalTextAlignment("verticalTextAlignment")
 * .visibility("visibility")
 * .build())
 * .rowHeaderStyle(TableCellStyleProperty.builder()
 * .backgroundColor("backgroundColor")
 * .border(GlobalTableBorderOptionsProperty.builder()
 * .sideSpecificBorder(TableSideBorderOptionsProperty.builder()
 * .bottom(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .innerHorizontal(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .innerVertical(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .left(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .right(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .top(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .build())
 * .uniformBorder(TableBorderOptionsProperty.builder()
 * .color("color")
 * .style("style")
 * .thickness(123)
 * .build())
 * .build())
 * .fontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .height(123)
 * .horizontalTextAlignment("horizontalTextAlignment")
 * .textWrap("textWrap")
 * .verticalTextAlignment("verticalTextAlignment")
 * .visibility("visibility")
 * .build())
 * .rowsLabelOptions(PivotTableRowsLabelOptionsProperty.builder()
 * .customLabel("customLabel")
 * .visibility("visibility")
 * .build())
 * .rowsLayout("rowsLayout")
 * .singleMetricVisibility("singleMetricVisibility")
 * .toggleButtonsVisibility("toggleButtonsVisibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-pivottableoptions.html)
 */
@CdkDslMarker
public class CfnDashboardPivotTableOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.PivotTableOptionsProperty.Builder =
        CfnDashboard.PivotTableOptionsProperty.builder()

    /** @param cellStyle The table cell style of cells. */
    public fun cellStyle(cellStyle: IResolvable) {
        cdkBuilder.cellStyle(cellStyle)
    }

    /** @param cellStyle The table cell style of cells. */
    public fun cellStyle(cellStyle: CfnDashboard.TableCellStyleProperty) {
        cdkBuilder.cellStyle(cellStyle)
    }

    /**
     * @param collapsedRowDimensionsVisibility The visibility setting of a pivot table's collapsed
     *   row dimension fields. If the value of this structure is `HIDDEN` , all collapsed columns in
     *   a pivot table are automatically hidden. The default value is `VISIBLE` .
     */
    public fun collapsedRowDimensionsVisibility(collapsedRowDimensionsVisibility: String) {
        cdkBuilder.collapsedRowDimensionsVisibility(collapsedRowDimensionsVisibility)
    }

    /** @param columnHeaderStyle The table cell style of the column header. */
    public fun columnHeaderStyle(columnHeaderStyle: IResolvable) {
        cdkBuilder.columnHeaderStyle(columnHeaderStyle)
    }

    /** @param columnHeaderStyle The table cell style of the column header. */
    public fun columnHeaderStyle(columnHeaderStyle: CfnDashboard.TableCellStyleProperty) {
        cdkBuilder.columnHeaderStyle(columnHeaderStyle)
    }

    /** @param columnNamesVisibility The visibility of the column names. */
    public fun columnNamesVisibility(columnNamesVisibility: String) {
        cdkBuilder.columnNamesVisibility(columnNamesVisibility)
    }

    /** @param defaultCellWidth The default cell width of the pivot table. */
    public fun defaultCellWidth(defaultCellWidth: String) {
        cdkBuilder.defaultCellWidth(defaultCellWidth)
    }

    /** @param metricPlacement The metric placement (row, column) options. */
    public fun metricPlacement(metricPlacement: String) {
        cdkBuilder.metricPlacement(metricPlacement)
    }

    /**
     * @param rowAlternateColorOptions The row alternate color options (widget status, row alternate
     *   colors).
     */
    public fun rowAlternateColorOptions(rowAlternateColorOptions: IResolvable) {
        cdkBuilder.rowAlternateColorOptions(rowAlternateColorOptions)
    }

    /**
     * @param rowAlternateColorOptions The row alternate color options (widget status, row alternate
     *   colors).
     */
    public fun rowAlternateColorOptions(
        rowAlternateColorOptions: CfnDashboard.RowAlternateColorOptionsProperty
    ) {
        cdkBuilder.rowAlternateColorOptions(rowAlternateColorOptions)
    }

    /** @param rowFieldNamesStyle The table cell style of row field names. */
    public fun rowFieldNamesStyle(rowFieldNamesStyle: IResolvable) {
        cdkBuilder.rowFieldNamesStyle(rowFieldNamesStyle)
    }

    /** @param rowFieldNamesStyle The table cell style of row field names. */
    public fun rowFieldNamesStyle(rowFieldNamesStyle: CfnDashboard.TableCellStyleProperty) {
        cdkBuilder.rowFieldNamesStyle(rowFieldNamesStyle)
    }

    /** @param rowHeaderStyle The table cell style of the row headers. */
    public fun rowHeaderStyle(rowHeaderStyle: IResolvable) {
        cdkBuilder.rowHeaderStyle(rowHeaderStyle)
    }

    /** @param rowHeaderStyle The table cell style of the row headers. */
    public fun rowHeaderStyle(rowHeaderStyle: CfnDashboard.TableCellStyleProperty) {
        cdkBuilder.rowHeaderStyle(rowHeaderStyle)
    }

    /**
     * @param rowsLabelOptions The options for the label that is located above the row headers. This
     *   option is only applicable when `RowsLayout` is set to `HIERARCHY` .
     */
    public fun rowsLabelOptions(rowsLabelOptions: IResolvable) {
        cdkBuilder.rowsLabelOptions(rowsLabelOptions)
    }

    /**
     * @param rowsLabelOptions The options for the label that is located above the row headers. This
     *   option is only applicable when `RowsLayout` is set to `HIERARCHY` .
     */
    public fun rowsLabelOptions(rowsLabelOptions: CfnDashboard.PivotTableRowsLabelOptionsProperty) {
        cdkBuilder.rowsLabelOptions(rowsLabelOptions)
    }

    /**
     * @param rowsLayout The layout for the row dimension headers of a pivot table. Choose one of
     *   the following options.
     * * `TABULAR` : (Default) Each row field is displayed in a separate column.
     * * `HIERARCHY` : All row fields are displayed in a single column. Indentation is used to
     *   differentiate row headers of different fields.
     */
    public fun rowsLayout(rowsLayout: String) {
        cdkBuilder.rowsLayout(rowsLayout)
    }

    /** @param singleMetricVisibility The visibility of the single metric options. */
    public fun singleMetricVisibility(singleMetricVisibility: String) {
        cdkBuilder.singleMetricVisibility(singleMetricVisibility)
    }

    /** @param toggleButtonsVisibility Determines the visibility of the pivot table. */
    public fun toggleButtonsVisibility(toggleButtonsVisibility: String) {
        cdkBuilder.toggleButtonsVisibility(toggleButtonsVisibility)
    }

    public fun build(): CfnDashboard.PivotTableOptionsProperty = cdkBuilder.build()
}
