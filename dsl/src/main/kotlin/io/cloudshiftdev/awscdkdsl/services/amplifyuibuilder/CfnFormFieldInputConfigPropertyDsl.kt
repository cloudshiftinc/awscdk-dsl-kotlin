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

package io.cloudshiftdev.awscdkdsl.services.amplifyuibuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm

/**
 * The `FieldInputConfig` property specifies the configuration for the default input values to
 * display for a field.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amplifyuibuilder.*;
 * FieldInputConfigProperty fieldInputConfigProperty = FieldInputConfigProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .defaultChecked(false)
 * .defaultCountryCode("defaultCountryCode")
 * .defaultValue("defaultValue")
 * .descriptiveText("descriptiveText")
 * .fileUploaderConfig(FileUploaderFieldConfigProperty.builder()
 * .acceptedFileTypes(List.of("acceptedFileTypes"))
 * .accessLevel("accessLevel")
 * // the properties below are optional
 * .isResumable(false)
 * .maxFileCount(123)
 * .maxSize(123)
 * .showThumbnails(false)
 * .build())
 * .isArray(false)
 * .maxValue(123)
 * .minValue(123)
 * .name("name")
 * .placeholder("placeholder")
 * .readOnly(false)
 * .required(false)
 * .step(123)
 * .value("value")
 * .valueMappings(ValueMappingsProperty.builder()
 * .values(List.of(ValueMappingProperty.builder()
 * .value(FormInputValuePropertyProperty.builder()
 * .value("value")
 * .build())
 * // the properties below are optional
 * .displayValue(FormInputValuePropertyProperty.builder()
 * .value("value")
 * .build())
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplifyuibuilder-form-fieldinputconfig.html)
 */
@CdkDslMarker
public class CfnFormFieldInputConfigPropertyDsl {
    private val cdkBuilder: CfnForm.FieldInputConfigProperty.Builder =
        CfnForm.FieldInputConfigProperty.builder()

    /** @param defaultChecked Specifies whether a field has a default value. */
    public fun defaultChecked(defaultChecked: Boolean) {
        cdkBuilder.defaultChecked(defaultChecked)
    }

    /** @param defaultChecked Specifies whether a field has a default value. */
    public fun defaultChecked(defaultChecked: IResolvable) {
        cdkBuilder.defaultChecked(defaultChecked)
    }

    /** @param defaultCountryCode The default country code for a phone number. */
    public fun defaultCountryCode(defaultCountryCode: String) {
        cdkBuilder.defaultCountryCode(defaultCountryCode)
    }

    /** @param defaultValue The default value for the field. */
    public fun defaultValue(defaultValue: String) {
        cdkBuilder.defaultValue(defaultValue)
    }

    /** @param descriptiveText The text to display to describe the field. */
    public fun descriptiveText(descriptiveText: String) {
        cdkBuilder.descriptiveText(descriptiveText)
    }

    /** @param fileUploaderConfig The configuration for the file uploader field. */
    public fun fileUploaderConfig(fileUploaderConfig: IResolvable) {
        cdkBuilder.fileUploaderConfig(fileUploaderConfig)
    }

    /** @param fileUploaderConfig The configuration for the file uploader field. */
    public fun fileUploaderConfig(fileUploaderConfig: CfnForm.FileUploaderFieldConfigProperty) {
        cdkBuilder.fileUploaderConfig(fileUploaderConfig)
    }

    /**
     * @param isArray Specifies whether to render the field as an array. This property is ignored if
     *   the `dataSourceType` for the form is a Data Store.
     */
    public fun isArray(isArray: Boolean) {
        cdkBuilder.isArray(isArray)
    }

    /**
     * @param isArray Specifies whether to render the field as an array. This property is ignored if
     *   the `dataSourceType` for the form is a Data Store.
     */
    public fun isArray(isArray: IResolvable) {
        cdkBuilder.isArray(isArray)
    }

    /** @param maxValue The maximum value to display for the field. */
    public fun maxValue(maxValue: Number) {
        cdkBuilder.maxValue(maxValue)
    }

    /** @param minValue The minimum value to display for the field. */
    public fun minValue(minValue: Number) {
        cdkBuilder.minValue(minValue)
    }

    /** @param name The name of the field. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param placeholder The text to display as a placeholder for the field. */
    public fun placeholder(placeholder: String) {
        cdkBuilder.placeholder(placeholder)
    }

    /** @param readOnly Specifies a read only field. */
    public fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
    }

    /** @param readOnly Specifies a read only field. */
    public fun readOnly(readOnly: IResolvable) {
        cdkBuilder.readOnly(readOnly)
    }

    /** @param required Specifies a field that requires input. */
    public fun required(required: Boolean) {
        cdkBuilder.required(required)
    }

    /** @param required Specifies a field that requires input. */
    public fun required(required: IResolvable) {
        cdkBuilder.required(required)
    }

    /** @param step The stepping increment for a numeric value in a field. */
    public fun step(step: Number) {
        cdkBuilder.step(step)
    }

    /** @param type The input type for the field. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /** @param value The value for the field. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    /**
     * @param valueMappings The information to use to customize the input fields with data at
     *   runtime.
     */
    public fun valueMappings(valueMappings: IResolvable) {
        cdkBuilder.valueMappings(valueMappings)
    }

    /**
     * @param valueMappings The information to use to customize the input fields with data at
     *   runtime.
     */
    public fun valueMappings(valueMappings: CfnForm.ValueMappingsProperty) {
        cdkBuilder.valueMappings(valueMappings)
    }

    public fun build(): CfnForm.FieldInputConfigProperty = cdkBuilder.build()
}
