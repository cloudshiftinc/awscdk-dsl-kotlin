@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

/**
 * The table options for a pivot table visual.
 *
 * Example:
 *
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
 * .metricPlacement("metricPlacement")
 * .rowAlternateColorOptions(RowAlternateColorOptionsProperty.builder()
 * .rowAlternateColors(List.of("rowAlternateColors"))
 * .status("status")
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
 * .singleMetricVisibility("singleMetricVisibility")
 * .toggleButtonsVisibility("toggleButtonsVisibility")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-pivottableoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisPivotTableOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.PivotTableOptionsProperty.Builder =
        CfnAnalysis.PivotTableOptionsProperty.builder()

    /**
     * @param cellStyle The table cell style of cells.
     */
    public fun cellStyle(cellStyle: IResolvable) {
        cdkBuilder.cellStyle(cellStyle)
    }

    /**
     * @param cellStyle The table cell style of cells.
     */
    public fun cellStyle(cellStyle: CfnAnalysis.TableCellStyleProperty) {
        cdkBuilder.cellStyle(cellStyle)
    }

    /**
     * @param collapsedRowDimensionsVisibility The visibility setting of a pivot table's collapsed row
     * dimension fields.
     * If the value of this structure is `HIDDEN` , all collapsed columns in a pivot table are
     * automatically hidden. The default value is `VISIBLE` .
     */
    public fun collapsedRowDimensionsVisibility(collapsedRowDimensionsVisibility: String) {
        cdkBuilder.collapsedRowDimensionsVisibility(collapsedRowDimensionsVisibility)
    }

    /**
     * @param columnHeaderStyle The table cell style of the column header.
     */
    public fun columnHeaderStyle(columnHeaderStyle: IResolvable) {
        cdkBuilder.columnHeaderStyle(columnHeaderStyle)
    }

    /**
     * @param columnHeaderStyle The table cell style of the column header.
     */
    public fun columnHeaderStyle(columnHeaderStyle: CfnAnalysis.TableCellStyleProperty) {
        cdkBuilder.columnHeaderStyle(columnHeaderStyle)
    }

    /**
     * @param columnNamesVisibility The visibility of the column names.
     */
    public fun columnNamesVisibility(columnNamesVisibility: String) {
        cdkBuilder.columnNamesVisibility(columnNamesVisibility)
    }

    /**
     * @param metricPlacement The metric placement (row, column) options.
     */
    public fun metricPlacement(metricPlacement: String) {
        cdkBuilder.metricPlacement(metricPlacement)
    }

    /**
     * @param rowAlternateColorOptions The row alternate color options (widget status, row alternate
     * colors).
     */
    public fun rowAlternateColorOptions(rowAlternateColorOptions: IResolvable) {
        cdkBuilder.rowAlternateColorOptions(rowAlternateColorOptions)
    }

    /**
     * @param rowAlternateColorOptions The row alternate color options (widget status, row alternate
     * colors).
     */
    public fun rowAlternateColorOptions(rowAlternateColorOptions: CfnAnalysis.RowAlternateColorOptionsProperty) {
        cdkBuilder.rowAlternateColorOptions(rowAlternateColorOptions)
    }

    /**
     * @param rowFieldNamesStyle The table cell style of row field names.
     */
    public fun rowFieldNamesStyle(rowFieldNamesStyle: IResolvable) {
        cdkBuilder.rowFieldNamesStyle(rowFieldNamesStyle)
    }

    /**
     * @param rowFieldNamesStyle The table cell style of row field names.
     */
    public fun rowFieldNamesStyle(rowFieldNamesStyle: CfnAnalysis.TableCellStyleProperty) {
        cdkBuilder.rowFieldNamesStyle(rowFieldNamesStyle)
    }

    /**
     * @param rowHeaderStyle The table cell style of the row headers.
     */
    public fun rowHeaderStyle(rowHeaderStyle: IResolvable) {
        cdkBuilder.rowHeaderStyle(rowHeaderStyle)
    }

    /**
     * @param rowHeaderStyle The table cell style of the row headers.
     */
    public fun rowHeaderStyle(rowHeaderStyle: CfnAnalysis.TableCellStyleProperty) {
        cdkBuilder.rowHeaderStyle(rowHeaderStyle)
    }

    /**
     * @param singleMetricVisibility The visibility of the single metric options.
     */
    public fun singleMetricVisibility(singleMetricVisibility: String) {
        cdkBuilder.singleMetricVisibility(singleMetricVisibility)
    }

    /**
     * @param toggleButtonsVisibility Determines the visibility of the pivot table.
     */
    public fun toggleButtonsVisibility(toggleButtonsVisibility: String) {
        cdkBuilder.toggleButtonsVisibility(toggleButtonsVisibility)
    }

    public fun build(): CfnAnalysis.PivotTableOptionsProperty = cdkBuilder.build()
}
