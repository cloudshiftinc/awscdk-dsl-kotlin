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
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * Dashboard publish options.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DashboardPublishOptionsProperty dashboardPublishOptionsProperty =
 * DashboardPublishOptionsProperty.builder()
 * .adHocFilteringOption(AdHocFilteringOptionProperty.builder()
 * .availabilityStatus("availabilityStatus")
 * .build())
 * .dataPointDrillUpDownOption(DataPointDrillUpDownOptionProperty.builder()
 * .availabilityStatus("availabilityStatus")
 * .build())
 * .dataPointMenuLabelOption(DataPointMenuLabelOptionProperty.builder()
 * .availabilityStatus("availabilityStatus")
 * .build())
 * .dataPointTooltipOption(DataPointTooltipOptionProperty.builder()
 * .availabilityStatus("availabilityStatus")
 * .build())
 * .exportToCsvOption(ExportToCSVOptionProperty.builder()
 * .availabilityStatus("availabilityStatus")
 * .build())
 * .exportWithHiddenFieldsOption(ExportWithHiddenFieldsOptionProperty.builder()
 * .availabilityStatus("availabilityStatus")
 * .build())
 * .sheetControlsOption(SheetControlsOptionProperty.builder()
 * .visibilityState("visibilityState")
 * .build())
 * .sheetLayoutElementMaximizationOption(SheetLayoutElementMaximizationOptionProperty.builder()
 * .availabilityStatus("availabilityStatus")
 * .build())
 * .visualAxisSortOption(VisualAxisSortOptionProperty.builder()
 * .availabilityStatus("availabilityStatus")
 * .build())
 * .visualMenuOption(VisualMenuOptionProperty.builder()
 * .availabilityStatus("availabilityStatus")
 * .build())
 * .visualPublishOptions(DashboardVisualPublishOptionsProperty.builder()
 * .exportHiddenFieldsOption(ExportHiddenFieldsOptionProperty.builder()
 * .availabilityStatus("availabilityStatus")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-dashboardpublishoptions.html)
 */
@CdkDslMarker
public class CfnDashboardDashboardPublishOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.DashboardPublishOptionsProperty.Builder =
        CfnDashboard.DashboardPublishOptionsProperty.builder()

    /** @param adHocFilteringOption Ad hoc (one-time) filtering option. */
    public fun adHocFilteringOption(adHocFilteringOption: IResolvable) {
        cdkBuilder.adHocFilteringOption(adHocFilteringOption)
    }

    /** @param adHocFilteringOption Ad hoc (one-time) filtering option. */
    public fun adHocFilteringOption(
        adHocFilteringOption: CfnDashboard.AdHocFilteringOptionProperty
    ) {
        cdkBuilder.adHocFilteringOption(adHocFilteringOption)
    }

    /** @param dataPointDrillUpDownOption The drill-down options of data points in a dashboard. */
    public fun dataPointDrillUpDownOption(dataPointDrillUpDownOption: IResolvable) {
        cdkBuilder.dataPointDrillUpDownOption(dataPointDrillUpDownOption)
    }

    /** @param dataPointDrillUpDownOption The drill-down options of data points in a dashboard. */
    public fun dataPointDrillUpDownOption(
        dataPointDrillUpDownOption: CfnDashboard.DataPointDrillUpDownOptionProperty
    ) {
        cdkBuilder.dataPointDrillUpDownOption(dataPointDrillUpDownOption)
    }

    /** @param dataPointMenuLabelOption The data point menu label options of a dashboard. */
    public fun dataPointMenuLabelOption(dataPointMenuLabelOption: IResolvable) {
        cdkBuilder.dataPointMenuLabelOption(dataPointMenuLabelOption)
    }

    /** @param dataPointMenuLabelOption The data point menu label options of a dashboard. */
    public fun dataPointMenuLabelOption(
        dataPointMenuLabelOption: CfnDashboard.DataPointMenuLabelOptionProperty
    ) {
        cdkBuilder.dataPointMenuLabelOption(dataPointMenuLabelOption)
    }

    /** @param dataPointTooltipOption The data point tool tip options of a dashboard. */
    public fun dataPointTooltipOption(dataPointTooltipOption: IResolvable) {
        cdkBuilder.dataPointTooltipOption(dataPointTooltipOption)
    }

    /** @param dataPointTooltipOption The data point tool tip options of a dashboard. */
    public fun dataPointTooltipOption(
        dataPointTooltipOption: CfnDashboard.DataPointTooltipOptionProperty
    ) {
        cdkBuilder.dataPointTooltipOption(dataPointTooltipOption)
    }

    /** @param exportToCsvOption Export to .csv option. */
    public fun exportToCsvOption(exportToCsvOption: IResolvable) {
        cdkBuilder.exportToCsvOption(exportToCsvOption)
    }

    /** @param exportToCsvOption Export to .csv option. */
    public fun exportToCsvOption(exportToCsvOption: CfnDashboard.ExportToCSVOptionProperty) {
        cdkBuilder.exportToCsvOption(exportToCsvOption)
    }

    /**
     * @param exportWithHiddenFieldsOption Determines if hidden fields are exported with a
     *   dashboard.
     */
    public fun exportWithHiddenFieldsOption(exportWithHiddenFieldsOption: IResolvable) {
        cdkBuilder.exportWithHiddenFieldsOption(exportWithHiddenFieldsOption)
    }

    /**
     * @param exportWithHiddenFieldsOption Determines if hidden fields are exported with a
     *   dashboard.
     */
    public fun exportWithHiddenFieldsOption(
        exportWithHiddenFieldsOption: CfnDashboard.ExportWithHiddenFieldsOptionProperty
    ) {
        cdkBuilder.exportWithHiddenFieldsOption(exportWithHiddenFieldsOption)
    }

    /** @param sheetControlsOption Sheet controls option. */
    public fun sheetControlsOption(sheetControlsOption: IResolvable) {
        cdkBuilder.sheetControlsOption(sheetControlsOption)
    }

    /** @param sheetControlsOption Sheet controls option. */
    public fun sheetControlsOption(sheetControlsOption: CfnDashboard.SheetControlsOptionProperty) {
        cdkBuilder.sheetControlsOption(sheetControlsOption)
    }

    /**
     * @param sheetLayoutElementMaximizationOption The sheet layout maximization options of a
     *   dashbaord.
     */
    public fun sheetLayoutElementMaximizationOption(
        sheetLayoutElementMaximizationOption: IResolvable
    ) {
        cdkBuilder.sheetLayoutElementMaximizationOption(sheetLayoutElementMaximizationOption)
    }

    /**
     * @param sheetLayoutElementMaximizationOption The sheet layout maximization options of a
     *   dashbaord.
     */
    public fun sheetLayoutElementMaximizationOption(
        sheetLayoutElementMaximizationOption:
            CfnDashboard.SheetLayoutElementMaximizationOptionProperty
    ) {
        cdkBuilder.sheetLayoutElementMaximizationOption(sheetLayoutElementMaximizationOption)
    }

    /** @param visualAxisSortOption The axis sort options of a dashboard. */
    public fun visualAxisSortOption(visualAxisSortOption: IResolvable) {
        cdkBuilder.visualAxisSortOption(visualAxisSortOption)
    }

    /** @param visualAxisSortOption The axis sort options of a dashboard. */
    public fun visualAxisSortOption(
        visualAxisSortOption: CfnDashboard.VisualAxisSortOptionProperty
    ) {
        cdkBuilder.visualAxisSortOption(visualAxisSortOption)
    }

    /** @param visualMenuOption The menu options of a visual in a dashboard. */
    public fun visualMenuOption(visualMenuOption: IResolvable) {
        cdkBuilder.visualMenuOption(visualMenuOption)
    }

    /** @param visualMenuOption The menu options of a visual in a dashboard. */
    public fun visualMenuOption(visualMenuOption: CfnDashboard.VisualMenuOptionProperty) {
        cdkBuilder.visualMenuOption(visualMenuOption)
    }

    /** @param visualPublishOptions The visual publish options of a visual in a dashboard. */
    public fun visualPublishOptions(visualPublishOptions: IResolvable) {
        cdkBuilder.visualPublishOptions(visualPublishOptions)
    }

    /** @param visualPublishOptions The visual publish options of a visual in a dashboard. */
    public fun visualPublishOptions(
        visualPublishOptions: CfnDashboard.DashboardVisualPublishOptionsProperty
    ) {
        cdkBuilder.visualPublishOptions(visualPublishOptions)
    }

    public fun build(): CfnDashboard.DashboardPublishOptionsProperty = cdkBuilder.build()
}
