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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution

/**
 * A complex type that controls whether access logs are written for the streaming distribution.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * LoggingProperty loggingProperty = LoggingProperty.builder()
 * .bucket("bucket")
 * .enabled(false)
 * .prefix("prefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-streamingdistribution-logging.html)
 */
@CdkDslMarker
public class CfnStreamingDistributionLoggingPropertyDsl {
    private val cdkBuilder: CfnStreamingDistribution.LoggingProperty.Builder =
        CfnStreamingDistribution.LoggingProperty.builder()

    /**
     * @param bucket The Amazon S3 bucket to store the access logs in, for example,
     *   `myawslogbucket.s3.amazonaws.com` .
     */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /**
     * @param enabled Specifies whether you want CloudFront to save access logs to an Amazon S3
     *   bucket. If you don't want to enable logging when you create a streaming distribution or if
     *   you want to disable logging for an existing streaming distribution, specify `false` for
     *   `Enabled` , and specify `empty Bucket` and `Prefix` elements. If you specify `false` for
     *   `Enabled` but you specify values for `Bucket` and `Prefix` , the values are automatically
     *   deleted.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Specifies whether you want CloudFront to save access logs to an Amazon S3
     *   bucket. If you don't want to enable logging when you create a streaming distribution or if
     *   you want to disable logging for an existing streaming distribution, specify `false` for
     *   `Enabled` , and specify `empty Bucket` and `Prefix` elements. If you specify `false` for
     *   `Enabled` but you specify values for `Bucket` and `Prefix` , the values are automatically
     *   deleted.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param prefix An optional string that you want CloudFront to prefix to the access log
     *   filenames for this streaming distribution, for example, `myprefix/` . If you want to enable
     *   logging, but you don't want to specify a prefix, you still must include an empty `Prefix`
     *   element in the `Logging` element.
     */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun build(): CfnStreamingDistribution.LoggingProperty = cdkBuilder.build()
}
