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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistribution
import software.amazon.awscdk.services.cloudfront.CfnStreamingDistributionProps

/**
 * Properties for defining a `CfnStreamingDistribution`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CfnStreamingDistributionProps cfnStreamingDistributionProps =
 * CfnStreamingDistributionProps.builder()
 * .streamingDistributionConfig(StreamingDistributionConfigProperty.builder()
 * .comment("comment")
 * .enabled(false)
 * .s3Origin(S3OriginProperty.builder()
 * .domainName("domainName")
 * .originAccessIdentity("originAccessIdentity")
 * .build())
 * .trustedSigners(TrustedSignersProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .awsAccountNumbers(List.of("awsAccountNumbers"))
 * .build())
 * // the properties below are optional
 * .aliases(List.of("aliases"))
 * .logging(LoggingProperty.builder()
 * .bucket("bucket")
 * .enabled(false)
 * .prefix("prefix")
 * .build())
 * .priceClass("priceClass")
 * .build())
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-streamingdistribution.html)
 */
@CdkDslMarker
public class CfnStreamingDistributionPropsDsl {
    private val cdkBuilder: CfnStreamingDistributionProps.Builder =
        CfnStreamingDistributionProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param streamingDistributionConfig The current configuration information for the RTMP
     *   distribution.
     */
    public fun streamingDistributionConfig(streamingDistributionConfig: IResolvable) {
        cdkBuilder.streamingDistributionConfig(streamingDistributionConfig)
    }

    /**
     * @param streamingDistributionConfig The current configuration information for the RTMP
     *   distribution.
     */
    public fun streamingDistributionConfig(
        streamingDistributionConfig: CfnStreamingDistribution.StreamingDistributionConfigProperty
    ) {
        cdkBuilder.streamingDistributionConfig(streamingDistributionConfig)
    }

    /** @param tags A complex type that contains zero or more `Tag` elements. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags A complex type that contains zero or more `Tag` elements. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnStreamingDistributionProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
