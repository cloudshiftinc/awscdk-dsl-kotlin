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
import software.amazon.awscdk.services.quicksight.CfnAnalysis

/**
 * A control to display a text box that is used to enter multiple entries.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * FilterTextAreaControlProperty filterTextAreaControlProperty =
 * FilterTextAreaControlProperty.builder()
 * .filterControlId("filterControlId")
 * .sourceFilterId("sourceFilterId")
 * .title("title")
 * // the properties below are optional
 * .delimiter("delimiter")
 * .displayOptions(TextAreaControlDisplayOptionsProperty.builder()
 * .infoIconLabelOptions(SheetControlInfoIconLabelOptionsProperty.builder()
 * .infoIconText("infoIconText")
 * .visibility("visibility")
 * .build())
 * .placeholderOptions(TextControlPlaceholderOptionsProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-filtertextareacontrol.html)
 */
@CdkDslMarker
public class CfnAnalysisFilterTextAreaControlPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FilterTextAreaControlProperty.Builder =
        CfnAnalysis.FilterTextAreaControlProperty.builder()

    /** @param delimiter The delimiter that is used to separate the lines in text. */
    public fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
    }

    /** @param displayOptions The display options of a control. */
    public fun displayOptions(displayOptions: IResolvable) {
        cdkBuilder.displayOptions(displayOptions)
    }

    /** @param displayOptions The display options of a control. */
    public fun displayOptions(displayOptions: CfnAnalysis.TextAreaControlDisplayOptionsProperty) {
        cdkBuilder.displayOptions(displayOptions)
    }

    /** @param filterControlId The ID of the `FilterTextAreaControl` . */
    public fun filterControlId(filterControlId: String) {
        cdkBuilder.filterControlId(filterControlId)
    }

    /** @param sourceFilterId The source filter ID of the `FilterTextAreaControl` . */
    public fun sourceFilterId(sourceFilterId: String) {
        cdkBuilder.sourceFilterId(sourceFilterId)
    }

    /** @param title The title of the `FilterTextAreaControl` . */
    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    public fun build(): CfnAnalysis.FilterTextAreaControlProperty = cdkBuilder.build()
}
