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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * A control to display a list of buttons or boxes.
 *
 * This is used to select either a single value or multiple values.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FilterListControlProperty filterListControlProperty = FilterListControlProperty.builder()
 * .filterControlId("filterControlId")
 * .sourceFilterId("sourceFilterId")
 * .title("title")
 * // the properties below are optional
 * .cascadingControlConfiguration(CascadingControlConfigurationProperty.builder()
 * .sourceControls(List.of(CascadingControlSourceProperty.builder()
 * .columnToMatch(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .sourceSheetControlId("sourceSheetControlId")
 * .build()))
 * .build())
 * .displayOptions(ListControlDisplayOptionsProperty.builder()
 * .searchOptions(ListControlSearchOptionsProperty.builder()
 * .visibility("visibility")
 * .build())
 * .selectAllOptions(ListControlSelectAllOptionsProperty.builder()
 * .visibility("visibility")
 * .build())
 * .titleOptions(LabelOptionsProperty.builder()
 * .customLabel("customLabel")
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
 * .visibility("visibility")
 * .build())
 * .build())
 * .selectableValues(FilterSelectableValuesProperty.builder()
 * .values(List.of("values"))
 * .build())
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-filterlistcontrol.html)
 */
@CdkDslMarker
public class CfnTemplateFilterListControlPropertyDsl {
    private val cdkBuilder: CfnTemplate.FilterListControlProperty.Builder =
        CfnTemplate.FilterListControlProperty.builder()

    /**
     * @param cascadingControlConfiguration The values that are displayed in a control can be
     *   configured to only show values that are valid based on what's selected in other controls.
     */
    public fun cascadingControlConfiguration(cascadingControlConfiguration: IResolvable) {
        cdkBuilder.cascadingControlConfiguration(cascadingControlConfiguration)
    }

    /**
     * @param cascadingControlConfiguration The values that are displayed in a control can be
     *   configured to only show values that are valid based on what's selected in other controls.
     */
    public fun cascadingControlConfiguration(
        cascadingControlConfiguration: CfnTemplate.CascadingControlConfigurationProperty
    ) {
        cdkBuilder.cascadingControlConfiguration(cascadingControlConfiguration)
    }

    /** @param displayOptions The display options of a control. */
    public fun displayOptions(displayOptions: IResolvable) {
        cdkBuilder.displayOptions(displayOptions)
    }

    /** @param displayOptions The display options of a control. */
    public fun displayOptions(displayOptions: CfnTemplate.ListControlDisplayOptionsProperty) {
        cdkBuilder.displayOptions(displayOptions)
    }

    /** @param filterControlId The ID of the `FilterListControl` . */
    public fun filterControlId(filterControlId: String) {
        cdkBuilder.filterControlId(filterControlId)
    }

    /** @param selectableValues A list of selectable values that are used in a control. */
    public fun selectableValues(selectableValues: IResolvable) {
        cdkBuilder.selectableValues(selectableValues)
    }

    /** @param selectableValues A list of selectable values that are used in a control. */
    public fun selectableValues(selectableValues: CfnTemplate.FilterSelectableValuesProperty) {
        cdkBuilder.selectableValues(selectableValues)
    }

    /** @param sourceFilterId The source filter ID of the `FilterListControl` . */
    public fun sourceFilterId(sourceFilterId: String) {
        cdkBuilder.sourceFilterId(sourceFilterId)
    }

    /** @param title The title of the `FilterListControl` . */
    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    /**
     * @param type The type of `FilterListControl` . Choose one of the following options:.
     * * `MULTI_SELECT` : The user can select multiple entries from the list.
     * * `SINGLE_SELECT` : The user can select a single entry from the list.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnTemplate.FilterListControlProperty = cdkBuilder.build()
}
