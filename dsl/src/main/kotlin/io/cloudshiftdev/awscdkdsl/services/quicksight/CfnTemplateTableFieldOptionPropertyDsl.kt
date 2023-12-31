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
 * The options for a table field.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * TableFieldOptionProperty tableFieldOptionProperty = TableFieldOptionProperty.builder()
 * .fieldId("fieldId")
 * // the properties below are optional
 * .customLabel("customLabel")
 * .urlStyling(TableFieldURLConfigurationProperty.builder()
 * .imageConfiguration(TableFieldImageConfigurationProperty.builder()
 * .sizingOptions(TableCellImageSizingConfigurationProperty.builder()
 * .tableCellImageScalingConfiguration("tableCellImageScalingConfiguration")
 * .build())
 * .build())
 * .linkConfiguration(TableFieldLinkConfigurationProperty.builder()
 * .content(TableFieldLinkContentConfigurationProperty.builder()
 * .customIconContent(TableFieldCustomIconContentProperty.builder()
 * .icon("icon")
 * .build())
 * .customTextContent(TableFieldCustomTextContentProperty.builder()
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
 * // the properties below are optional
 * .value("value")
 * .build())
 * .build())
 * .target("target")
 * .build())
 * .build())
 * .visibility("visibility")
 * .width("width")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-tablefieldoption.html)
 */
@CdkDslMarker
public class CfnTemplateTableFieldOptionPropertyDsl {
    private val cdkBuilder: CfnTemplate.TableFieldOptionProperty.Builder =
        CfnTemplate.TableFieldOptionProperty.builder()

    /** @param customLabel The custom label for a table field. */
    public fun customLabel(customLabel: String) {
        cdkBuilder.customLabel(customLabel)
    }

    /** @param fieldId The field ID for a table field. */
    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    /** @param urlStyling The URL configuration for a table field. */
    public fun urlStyling(urlStyling: IResolvable) {
        cdkBuilder.urlStyling(urlStyling)
    }

    /** @param urlStyling The URL configuration for a table field. */
    public fun urlStyling(urlStyling: CfnTemplate.TableFieldURLConfigurationProperty) {
        cdkBuilder.urlStyling(urlStyling)
    }

    /** @param visibility The visibility of a table field. */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    /** @param width The width for a table field. */
    public fun width(width: String) {
        cdkBuilder.width(width)
    }

    public fun build(): CfnTemplate.TableFieldOptionProperty = cdkBuilder.build()
}
