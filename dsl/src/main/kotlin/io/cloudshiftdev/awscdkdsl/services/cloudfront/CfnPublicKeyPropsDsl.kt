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

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnPublicKey
import software.amazon.awscdk.services.cloudfront.CfnPublicKeyProps

/**
 * Properties for defining a `CfnPublicKey`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CfnPublicKeyProps cfnPublicKeyProps = CfnPublicKeyProps.builder()
 * .publicKeyConfig(PublicKeyConfigProperty.builder()
 * .callerReference("callerReference")
 * .encodedKey("encodedKey")
 * .name("name")
 * // the properties below are optional
 * .comment("comment")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-publickey.html)
 */
@CdkDslMarker
public class CfnPublicKeyPropsDsl {
    private val cdkBuilder: CfnPublicKeyProps.Builder = CfnPublicKeyProps.builder()

    /**
     * @param publicKeyConfig Configuration information about a public key that you can use with
     *   [signed URLs and signed cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     *   , or with
     *   [field-level encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     *   .
     */
    public fun publicKeyConfig(publicKeyConfig: IResolvable) {
        cdkBuilder.publicKeyConfig(publicKeyConfig)
    }

    /**
     * @param publicKeyConfig Configuration information about a public key that you can use with
     *   [signed URLs and signed cookies](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/PrivateContent.html)
     *   , or with
     *   [field-level encryption](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/field-level-encryption.html)
     *   .
     */
    public fun publicKeyConfig(publicKeyConfig: CfnPublicKey.PublicKeyConfigProperty) {
        cdkBuilder.publicKeyConfig(publicKeyConfig)
    }

    public fun build(): CfnPublicKeyProps = cdkBuilder.build()
}
