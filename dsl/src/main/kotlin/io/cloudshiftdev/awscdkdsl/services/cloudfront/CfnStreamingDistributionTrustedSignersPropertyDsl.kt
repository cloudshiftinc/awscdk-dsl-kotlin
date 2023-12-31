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
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution

/**
 * A list of AWS accounts whose public keys CloudFront can use to verify the signatures of signed
 * URLs and signed cookies.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * TrustedSignersProperty trustedSignersProperty = TrustedSignersProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .awsAccountNumbers(List.of("awsAccountNumbers"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-trustedsigners.html)
 */
@CdkDslMarker
public class CfnStreamingDistributionTrustedSignersPropertyDsl {
    private val cdkBuilder: CfnStreamingDistribution.TrustedSignersProperty.Builder =
        CfnStreamingDistribution.TrustedSignersProperty.builder()

    private val _awsAccountNumbers: MutableList<String> = mutableListOf()

    /**
     * @param awsAccountNumbers An AWS account number that contains active CloudFront key pairs that
     *   CloudFront can use to verify the signatures of signed URLs and signed cookies. If the AWS
     *   account that owns the key pairs is the same account that owns the CloudFront distribution,
     *   the value of this field is `self` .
     */
    public fun awsAccountNumbers(vararg awsAccountNumbers: String) {
        _awsAccountNumbers.addAll(listOf(*awsAccountNumbers))
    }

    /**
     * @param awsAccountNumbers An AWS account number that contains active CloudFront key pairs that
     *   CloudFront can use to verify the signatures of signed URLs and signed cookies. If the AWS
     *   account that owns the key pairs is the same account that owns the CloudFront distribution,
     *   the value of this field is `self` .
     */
    public fun awsAccountNumbers(awsAccountNumbers: Collection<String>) {
        _awsAccountNumbers.addAll(awsAccountNumbers)
    }

    /**
     * @param enabled This field is `true` if any of the AWS accounts in the list are configured as
     *   trusted signers. If not, this field is `false` .
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled This field is `true` if any of the AWS accounts in the list are configured as
     *   trusted signers. If not, this field is `false` .
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnStreamingDistribution.TrustedSignersProperty {
        if (_awsAccountNumbers.isNotEmpty()) cdkBuilder.awsAccountNumbers(_awsAccountNumbers)
        return cdkBuilder.build()
    }
}
