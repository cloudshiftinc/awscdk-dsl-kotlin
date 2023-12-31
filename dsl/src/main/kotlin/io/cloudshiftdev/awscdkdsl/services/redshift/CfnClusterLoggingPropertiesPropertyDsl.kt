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

package io.cloudshiftdev.awscdkdsl.services.redshift

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshift.CfnCluster

/**
 * Specifies logging information, such as queries and connection attempts, for the specified Amazon
 * Redshift cluster.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshift.*;
 * LoggingPropertiesProperty loggingPropertiesProperty = LoggingPropertiesProperty.builder()
 * .bucketName("bucketName")
 * // the properties below are optional
 * .s3KeyPrefix("s3KeyPrefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-cluster-loggingproperties.html)
 */
@CdkDslMarker
public class CfnClusterLoggingPropertiesPropertyDsl {
    private val cdkBuilder: CfnCluster.LoggingPropertiesProperty.Builder =
        CfnCluster.LoggingPropertiesProperty.builder()

    /**
     * @param bucketName The name of an existing S3 bucket where the log files are to be stored.
     *   Constraints:
     * * Must be in the same region as the cluster
     * * The cluster must have read bucket and put object permissions
     */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param s3KeyPrefix The prefix applied to the log file names. Constraints:
     * * Cannot exceed 512 characters
     * * Cannot contain spaces( ), double quotes ("), single quotes ('), a backslash (), or control
     *   characters. The hexadecimal codes for invalid characters are:
     * * x00 to x20
     * * x22
     * * x27
     * * x5c
     * * x7f or larger
     */
    public fun s3KeyPrefix(s3KeyPrefix: String) {
        cdkBuilder.s3KeyPrefix(s3KeyPrefix)
    }

    public fun build(): CfnCluster.LoggingPropertiesProperty = cdkBuilder.build()
}
