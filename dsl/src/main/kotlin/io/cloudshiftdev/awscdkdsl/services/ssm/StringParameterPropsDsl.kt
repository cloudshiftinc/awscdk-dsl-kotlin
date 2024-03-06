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

package io.cloudshiftdev.awscdkdsl.services.ssm

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import software.amazon.awscdk.services.ssm.ParameterDataType
import software.amazon.awscdk.services.ssm.ParameterTier
import software.amazon.awscdk.services.ssm.ParameterType
import software.amazon.awscdk.services.ssm.StringParameterProps

/**
 * Properties needed to create a String SSM parameter.
 *
 * Example:
 * ```
 * // Grant read access to some Role
 * IRole role;
 * // Create a new SSM Parameter holding a String
 * StringParameter param = StringParameter.Builder.create(this, "StringParameter")
 * // description: 'Some user-friendly description',
 * // name: 'ParameterName',
 * .stringValue("Initial parameter value")
 * .build();
 * param.grantRead(role);
 * // Create a new SSM Parameter holding a StringList
 * StringListParameter listParameter = StringListParameter.Builder.create(this,
 * "StringListParameter")
 * // description: 'Some user-friendly description',
 * // name: 'ParameterName',
 * .stringListValue(List.of("Initial parameter value A", "Initial parameter value B"))
 * .build();
 * ```
 */
@CdkDslMarker
public class StringParameterPropsDsl {
    private val cdkBuilder: StringParameterProps.Builder = StringParameterProps.builder()

    /**
     * @param allowedPattern A regular expression used to validate the parameter value. For example,
     *   for String types with values restricted to numbers, you can specify the following: `^\d+$`
     */
    public fun allowedPattern(allowedPattern: String) {
        cdkBuilder.allowedPattern(allowedPattern)
    }

    /** @param dataType The data type of the parameter, such as `text` or `aws:ec2:image`. */
    public fun dataType(dataType: ParameterDataType) {
        cdkBuilder.dataType(dataType)
    }

    /** @param description Information about the parameter that you want to add to the system. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param parameterName The name of the parameter. */
    public fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
    }

    /**
     * @param simpleName Indicates if the parameter name is a simple name (i.e. does not include "/"
     *   separators). This is required only if `parameterName` is a token, which means we are unable
     *   to detect if the name is simple or "path-like" for the purpose of rendering SSM parameter
     *   ARNs.
     *
     * If `parameterName` is not specified, `simpleName` must be `true` (or undefined) since the
     * name generated by AWS CloudFormation is always a simple name.
     */
    public fun simpleName(simpleName: Boolean) {
        cdkBuilder.simpleName(simpleName)
    }

    /**
     * @param stringValue The value of the parameter. It may not reference another parameter and
     *   `{{}}` cannot be used in the value.
     */
    public fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
    }

    /** @param tier The tier of the string parameter. */
    public fun tier(tier: ParameterTier) {
        cdkBuilder.tier(tier)
    }

    /**
     * @param type The type of the string parameter.
     * @deprecated - type will always be 'String'
     */
    @Deprecated(message = "deprecated in CDK")
    public fun type(type: ParameterType) {
        cdkBuilder.type(type)
    }

    public fun build(): StringParameterProps = cdkBuilder.build()
}
