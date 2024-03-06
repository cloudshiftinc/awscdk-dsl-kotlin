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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ssm.ParameterType
import software.amazon.awscdk.services.ssm.ParameterValueType
import software.amazon.awscdk.services.ssm.StringParameterAttributes

/**
 * Attributes for parameters of various types of string.
 *
 * Example:
 * ```
 * Number parameterVersion = Token.asNumber(Map.of("Ref", "MyParameter"));
 * // Retrieve the latest value of the non-secret parameter
 * // with name "/My/String/Parameter".
 * String stringValue = StringParameter.fromStringParameterAttributes(this, "MyValue",
 * StringParameterAttributes.builder()
 * .parameterName("/My/Public/Parameter")
 * .build()).getStringValue();
 * String stringValueVersionFromToken = StringParameter.fromStringParameterAttributes(this,
 * "MyValueVersionFromToken", StringParameterAttributes.builder()
 * .parameterName("/My/Public/Parameter")
 * // parameter version from token
 * .version(parameterVersion)
 * .build()).getStringValue();
 * // Retrieve a specific version of the secret (SecureString) parameter.
 * // 'version' is always required.
 * IStringParameter secretValue = StringParameter.fromSecureStringParameterAttributes(this,
 * "MySecureValue", SecureStringParameterAttributes.builder()
 * .parameterName("/My/Secret/Parameter")
 * .version(5)
 * .build());
 * IStringParameter secretValueVersionFromToken =
 * StringParameter.fromSecureStringParameterAttributes(this, "MySecureValueVersionFromToken",
 * SecureStringParameterAttributes.builder()
 * .parameterName("/My/Secret/Parameter")
 * // parameter version from token
 * .version(parameterVersion)
 * .build());
 * ```
 *
 * [Documentation](ParameterType)
 */
@CdkDslMarker
public class StringParameterAttributesDsl {
    private val cdkBuilder: StringParameterAttributes.Builder = StringParameterAttributes.builder()

    /**
     * @param forceDynamicReference Use a dynamic reference as the representation in CloudFormation
     *   template level. By default, CDK tries to deduce an appropriate representation based on the
     *   parameter value (a CfnParameter or a dynamic reference). Use this flag to override the
     *   representation when it does not work.
     */
    public fun forceDynamicReference(forceDynamicReference: Boolean) {
        cdkBuilder.forceDynamicReference(forceDynamicReference)
    }

    /**
     * @param parameterName The name of the parameter store value. This value can be a token or a
     *   concrete string. If it is a concrete string and includes "/" it must also be prefixed with
     *   a "/" (fully-qualified).
     */
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
     * @param type The type of the string parameter.
     * @deprecated - use valueType instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun type(type: ParameterType) {
        cdkBuilder.type(type)
    }

    /**
     * @param valueType The type of the string parameter value. Using specific types can be helpful
     *   in catching invalid values at the start of creating or updating a stack. CloudFormation
     *   validates the values against existing values in the account.
     *
     * Note - if you want to allow values from different AWS accounts, use ParameterValueType.STRING
     */
    public fun valueType(valueType: ParameterValueType) {
        cdkBuilder.valueType(valueType)
    }

    /** @param version The version number of the value you wish to retrieve. */
    public fun version(version: Number) {
        cdkBuilder.version(version)
    }

    public fun build(): StringParameterAttributes = cdkBuilder.build()
}
