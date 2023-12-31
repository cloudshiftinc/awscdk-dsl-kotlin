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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnCluster

/**
 * The details of the execute command configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * ExecuteCommandConfigurationProperty executeCommandConfigurationProperty =
 * ExecuteCommandConfigurationProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .logConfiguration(ExecuteCommandLogConfigurationProperty.builder()
 * .cloudWatchEncryptionEnabled(false)
 * .cloudWatchLogGroupName("cloudWatchLogGroupName")
 * .s3BucketName("s3BucketName")
 * .s3EncryptionEnabled(false)
 * .s3KeyPrefix("s3KeyPrefix")
 * .build())
 * .logging("logging")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandconfiguration.html)
 */
@CdkDslMarker
public class CfnClusterExecuteCommandConfigurationPropertyDsl {
    private val cdkBuilder: CfnCluster.ExecuteCommandConfigurationProperty.Builder =
        CfnCluster.ExecuteCommandConfigurationProperty.builder()

    /**
     * @param kmsKeyId Specify an AWS Key Management Service key ID to encrypt the data between the
     *   local client and the container.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param logConfiguration The log configuration for the results of the execute command actions.
     *   The logs can be sent to CloudWatch Logs or an Amazon S3 bucket. When `logging=OVERRIDE` is
     *   specified, a `logConfiguration` must be provided.
     */
    public fun logConfiguration(logConfiguration: IResolvable) {
        cdkBuilder.logConfiguration(logConfiguration)
    }

    /**
     * @param logConfiguration The log configuration for the results of the execute command actions.
     *   The logs can be sent to CloudWatch Logs or an Amazon S3 bucket. When `logging=OVERRIDE` is
     *   specified, a `logConfiguration` must be provided.
     */
    public fun logConfiguration(
        logConfiguration: CfnCluster.ExecuteCommandLogConfigurationProperty
    ) {
        cdkBuilder.logConfiguration(logConfiguration)
    }

    /**
     * @param logging The log setting to use for redirecting logs for your execute command results.
     *   The following log settings are available.
     * * `NONE` : The execute command session is not logged.
     * * `DEFAULT` : The `awslogs` configuration in the task definition is used. If no logging
     *   parameter is specified, it defaults to this value. If no `awslogs` log driver is configured
     *   in the task definition, the output won't be logged.
     * * `OVERRIDE` : Specify the logging details as a part of `logConfiguration` . If the
     *   `OVERRIDE` logging option is specified, the `logConfiguration` is required.
     */
    public fun logging(logging: String) {
        cdkBuilder.logging(logging)
    }

    public fun build(): CfnCluster.ExecuteCommandConfigurationProperty = cdkBuilder.build()
}
