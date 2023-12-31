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

package io.cloudshiftdev.awscdkdsl.services.kendra

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnFaq

/**
 * Information required to find a specific file in an Amazon S3 bucket.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * S3PathProperty s3PathProperty = S3PathProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-faq-s3path.html)
 */
@CdkDslMarker
public class CfnFaqS3PathPropertyDsl {
    private val cdkBuilder: CfnFaq.S3PathProperty.Builder = CfnFaq.S3PathProperty.builder()

    /** @param bucket The name of the S3 bucket that contains the file. */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /** @param key The name of the file. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun build(): CfnFaq.S3PathProperty = cdkBuilder.build()
}
