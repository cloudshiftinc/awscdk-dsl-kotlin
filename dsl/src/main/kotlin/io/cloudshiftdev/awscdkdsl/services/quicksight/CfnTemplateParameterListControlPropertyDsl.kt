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
 * A control to display a list with buttons or boxes that are used to select either a single value
 * or multiple values.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ParameterListControlProperty parameterListControlProperty =
 * ParameterListControlProperty.builder()
 * .parameterControlId("parameterControlId")
 * .sourceParameterName("sourceParameterName")
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
 * .selectableValues(ParameterSelectableValuesProperty.builder()
 * .linkToDataSetColumn(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .values(List.of("values"))
 * .build())
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-parameterlistcontrol.html)
 */
@CdkDslMarker
public class CfnTemplateParameterListControlPropertyDsl {
    private val cdkBuilder: CfnTemplate.ParameterListControlProperty.Builder =
        CfnTemplate.ParameterListControlProperty.builder()

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

    /** @param parameterControlId The ID of the `ParameterListControl` . */
    public fun parameterControlId(parameterControlId: String) {
        cdkBuilder.parameterControlId(parameterControlId)
    }

    /** @param selectableValues A list of selectable values that are used in a control. */
    public fun selectableValues(selectableValues: IResolvable) {
        cdkBuilder.selectableValues(selectableValues)
    }

    /** @param selectableValues A list of selectable values that are used in a control. */
    public fun selectableValues(selectableValues: CfnTemplate.ParameterSelectableValuesProperty) {
        cdkBuilder.selectableValues(selectableValues)
    }

    /** @param sourceParameterName The source parameter name of the `ParameterListControl` . */
    public fun sourceParameterName(sourceParameterName: String) {
        cdkBuilder.sourceParameterName(sourceParameterName)
    }

    /** @param title The title of the `ParameterListControl` . */
    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    /** @param type The type of `ParameterListControl` . */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnTemplate.ParameterListControlProperty = cdkBuilder.build()
}
