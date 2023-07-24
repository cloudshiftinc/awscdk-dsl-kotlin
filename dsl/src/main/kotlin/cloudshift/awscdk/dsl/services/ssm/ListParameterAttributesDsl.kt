@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ssm.ListParameterAttributes
import software.amazon.awscdk.services.ssm.ParameterValueType
import kotlin.Boolean
import kotlin.Number
import kotlin.String

/**
 * Attributes for parameters of string list type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * ListParameterAttributes listParameterAttributes = ListParameterAttributes.builder()
 * .parameterName("parameterName")
 * // the properties below are optional
 * .elementType(ParameterValueType.STRING)
 * .simpleName(false)
 * .version(123)
 * .build();
 * ```
 *
 * [Documentation](ParameterType)
 */
@CdkDslMarker
public class ListParameterAttributesDsl {
    private val cdkBuilder: ListParameterAttributes.Builder = ListParameterAttributes.builder()

    /**
     * @param elementType The type of the string list parameter value.
     * Using specific types can be helpful in catching invalid values
     * at the start of creating or updating a stack. CloudFormation validates
     * the values against existing values in the account.
     *
     * Note - if you want to allow values from different AWS accounts, use
     * ParameterValueType.STRING
     */
    public fun elementType(elementType: ParameterValueType) {
        cdkBuilder.elementType(elementType)
    }

    /**
     * @param parameterName The name of the parameter store value.
     * This value can be a token or a concrete string. If it is a concrete string
     * and includes "/" it must also be prefixed with a "/" (fully-qualified).
     */
    public fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
    }

    /**
     * @param simpleName Indicates of the parameter name is a simple name (i.e. does not include "/"
     * separators).
     * This is only required only if `parameterName` is a token, which means we
     * are unable to detect if the name is simple or "path-like" for the purpose
     * of rendering SSM parameter ARNs.
     *
     * If `parameterName` is not specified, `simpleName` must be `true` (or
     * undefined) since the name generated by AWS CloudFormation is always a
     * simple name.
     */
    public fun simpleName(simpleName: Boolean) {
        cdkBuilder.simpleName(simpleName)
    }

    /**
     * @param version The version number of the value you wish to retrieve.
     */
    public fun version(version: Number) {
        cdkBuilder.version(version)
    }

    public fun build(): ListParameterAttributes = cdkBuilder.build()
}
