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

package io.cloudshiftdev.awscdkdsl.services.iotanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset

/**
 * Configuration information for delivery of dataset contents to Amazon Simple Storage Service
 * (Amazon S3).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * S3DestinationConfigurationProperty s3DestinationConfigurationProperty =
 * S3DestinationConfigurationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .glueConfiguration(GlueConfigurationProperty.builder()
 * .databaseName("databaseName")
 * .tableName("tableName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-s3destinationconfiguration.html)
 */
@CdkDslMarker
public class CfnDatasetS3DestinationConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataset.S3DestinationConfigurationProperty.Builder =
        CfnDataset.S3DestinationConfigurationProperty.builder()

    /** @param bucket The name of the S3 bucket to which dataset contents are delivered. */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /**
     * @param glueConfiguration Configuration information for coordination with AWS Glue , a fully
     *   managed extract, transform and load (ETL) service.
     */
    public fun glueConfiguration(glueConfiguration: IResolvable) {
        cdkBuilder.glueConfiguration(glueConfiguration)
    }

    /**
     * @param glueConfiguration Configuration information for coordination with AWS Glue , a fully
     *   managed extract, transform and load (ETL) service.
     */
    public fun glueConfiguration(glueConfiguration: CfnDataset.GlueConfigurationProperty) {
        cdkBuilder.glueConfiguration(glueConfiguration)
    }

    /**
     * @param key The key of the dataset contents object in an S3 bucket. Each object has a key that
     *   is a unique identifier. Each object has exactly one key.
     *
     * You can create a unique key with the following options:
     * * Use `!{iotanalytics:scheduleTime}` to insert the time of a scheduled SQL query run.
     * * Use `!{iotanalytics:versionId}` to insert a unique hash that identifies a dataset content.
     * * Use `!{iotanalytics:creationTime}` to insert the creation time of a dataset content.
     *
     * The following example creates a unique key for a CSV file:
     * `dataset/mydataset/!{iotanalytics:scheduleTime}/!{iotanalytics:versionId}.csv`
     *
     * If you don't use `!{iotanalytics:versionId}` to specify the key, you might get duplicate
     * keys. For example, you might have two dataset contents with the same `scheduleTime` but
     * different `versionId` s. This means that one dataset content overwrites the other.
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * @param roleArn The ARN of the role that grants AWS IoT Analytics permission to interact with
     *   your Amazon S3 and AWS Glue resources.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnDataset.S3DestinationConfigurationProperty = cdkBuilder.build()
}
