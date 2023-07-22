@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.ssm.SecureStringParameterAttributes

/**
 * Attributes for secure string parameters.
 *
 * Example:
 *
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
 */
@CdkDslMarker
public class SecureStringParameterAttributesDsl {
  private val cdkBuilder: SecureStringParameterAttributes.Builder =
      SecureStringParameterAttributes.builder()

  /**
   * @param encryptionKey The encryption key that is used to encrypt this parameter.
   */
  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
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

  public fun build(): SecureStringParameterAttributes = cdkBuilder.build()
}
