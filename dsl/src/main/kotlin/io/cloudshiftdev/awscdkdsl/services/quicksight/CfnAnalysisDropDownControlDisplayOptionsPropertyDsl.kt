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
 * The display options of a control.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DropDownControlDisplayOptionsProperty dropDownControlDisplayOptionsProperty =
 * DropDownControlDisplayOptionsProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-dropdowncontroldisplayoptions.html)
 */
@CdkDslMarker
public class CfnAnalysisDropDownControlDisplayOptionsPropertyDsl {
    private val cdkBuilder: CfnAnalysis.DropDownControlDisplayOptionsProperty.Builder =
        CfnAnalysis.DropDownControlDisplayOptionsProperty.builder()

    /**
     * @param selectAllOptions The configuration of the `Select all` options in a dropdown control.
     */
    public fun selectAllOptions(selectAllOptions: IResolvable) {
        cdkBuilder.selectAllOptions(selectAllOptions)
    }

    /**
     * @param selectAllOptions The configuration of the `Select all` options in a dropdown control.
     */
    public fun selectAllOptions(selectAllOptions: CfnAnalysis.ListControlSelectAllOptionsProperty) {
        cdkBuilder.selectAllOptions(selectAllOptions)
    }

    /** @param titleOptions The options to configure the title visibility, name, and font size. */
    public fun titleOptions(titleOptions: IResolvable) {
        cdkBuilder.titleOptions(titleOptions)
    }

    /** @param titleOptions The options to configure the title visibility, name, and font size. */
    public fun titleOptions(titleOptions: CfnAnalysis.LabelOptionsProperty) {
        cdkBuilder.titleOptions(titleOptions)
    }

    public fun build(): CfnAnalysis.DropDownControlDisplayOptionsProperty = cdkBuilder.build()
}
