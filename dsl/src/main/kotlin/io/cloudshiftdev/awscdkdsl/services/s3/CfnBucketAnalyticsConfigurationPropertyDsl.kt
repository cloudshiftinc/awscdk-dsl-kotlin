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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Specifies the configuration and any analyses for the analytics filter of an Amazon S3 bucket.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * AnalyticsConfigurationProperty analyticsConfigurationProperty =
 * AnalyticsConfigurationProperty.builder()
 * .id("id")
 * .storageClassAnalysis(StorageClassAnalysisProperty.builder()
 * .dataExport(DataExportProperty.builder()
 * .destination(DestinationProperty.builder()
 * .bucketArn("bucketArn")
 * .format("format")
 * // the properties below are optional
 * .bucketAccountId("bucketAccountId")
 * .prefix("prefix")
 * .build())
 * .outputSchemaVersion("outputSchemaVersion")
 * .build())
 * .build())
 * // the properties below are optional
 * .prefix("prefix")
 * .tagFilters(List.of(TagFilterProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-analyticsconfiguration.html)
 */
@CdkDslMarker
public class CfnBucketAnalyticsConfigurationPropertyDsl {
    private val cdkBuilder: CfnBucket.AnalyticsConfigurationProperty.Builder =
        CfnBucket.AnalyticsConfigurationProperty.builder()

    private val _tagFilters: MutableList<Any> = mutableListOf()

    /** @param id The ID that identifies the analytics configuration. */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /**
     * @param prefix The prefix that an object must have to be included in the analytics results.
     */
    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    /**
     * @param storageClassAnalysis Contains data related to access patterns to be collected and made
     *   available to analyze the tradeoffs between different storage classes.
     */
    public fun storageClassAnalysis(storageClassAnalysis: IResolvable) {
        cdkBuilder.storageClassAnalysis(storageClassAnalysis)
    }

    /**
     * @param storageClassAnalysis Contains data related to access patterns to be collected and made
     *   available to analyze the tradeoffs between different storage classes.
     */
    public fun storageClassAnalysis(storageClassAnalysis: CfnBucket.StorageClassAnalysisProperty) {
        cdkBuilder.storageClassAnalysis(storageClassAnalysis)
    }

    /**
     * @param tagFilters The tags to use when evaluating an analytics filter. The analytics only
     *   includes objects that meet the filter's criteria. If no filter is specified, all of the
     *   contents of the bucket are included in the analysis.
     */
    public fun tagFilters(vararg tagFilters: Any) {
        _tagFilters.addAll(listOf(*tagFilters))
    }

    /**
     * @param tagFilters The tags to use when evaluating an analytics filter. The analytics only
     *   includes objects that meet the filter's criteria. If no filter is specified, all of the
     *   contents of the bucket are included in the analysis.
     */
    public fun tagFilters(tagFilters: Collection<Any>) {
        _tagFilters.addAll(tagFilters)
    }

    /**
     * @param tagFilters The tags to use when evaluating an analytics filter. The analytics only
     *   includes objects that meet the filter's criteria. If no filter is specified, all of the
     *   contents of the bucket are included in the analysis.
     */
    public fun tagFilters(tagFilters: IResolvable) {
        cdkBuilder.tagFilters(tagFilters)
    }

    public fun build(): CfnBucket.AnalyticsConfigurationProperty {
        if (_tagFilters.isNotEmpty()) cdkBuilder.tagFilters(_tagFilters)
        return cdkBuilder.build()
    }
}
