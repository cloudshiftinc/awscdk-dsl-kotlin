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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalyticsv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

/**
 * Describes configuration parameters for a Flink-based Kinesis Data Analytics application or a
 * Studio notebook.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * FlinkApplicationConfigurationProperty flinkApplicationConfigurationProperty =
 * FlinkApplicationConfigurationProperty.builder()
 * .checkpointConfiguration(CheckpointConfigurationProperty.builder()
 * .configurationType("configurationType")
 * // the properties below are optional
 * .checkpointingEnabled(false)
 * .checkpointInterval(123)
 * .minPauseBetweenCheckpoints(123)
 * .build())
 * .monitoringConfiguration(MonitoringConfigurationProperty.builder()
 * .configurationType("configurationType")
 * // the properties below are optional
 * .logLevel("logLevel")
 * .metricsLevel("metricsLevel")
 * .build())
 * .parallelismConfiguration(ParallelismConfigurationProperty.builder()
 * .configurationType("configurationType")
 * // the properties below are optional
 * .autoScalingEnabled(false)
 * .parallelism(123)
 * .parallelismPerKpu(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-flinkapplicationconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationFlinkApplicationConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.FlinkApplicationConfigurationProperty.Builder =
        CfnApplication.FlinkApplicationConfigurationProperty.builder()

    /**
     * @param checkpointConfiguration Describes an application's checkpointing configuration.
     *   Checkpointing is the process of persisting application state for fault tolerance. For more
     *   information, see
     *   [Checkpoints for Fault Tolerance](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/concepts/programming-model.html#checkpoints-for-fault-tolerance)
     *   in the
     *   [Apache Flink Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
     *   .
     */
    public fun checkpointConfiguration(checkpointConfiguration: IResolvable) {
        cdkBuilder.checkpointConfiguration(checkpointConfiguration)
    }

    /**
     * @param checkpointConfiguration Describes an application's checkpointing configuration.
     *   Checkpointing is the process of persisting application state for fault tolerance. For more
     *   information, see
     *   [Checkpoints for Fault Tolerance](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/concepts/programming-model.html#checkpoints-for-fault-tolerance)
     *   in the
     *   [Apache Flink Documentation](https://docs.aws.amazon.com/https://ci.apache.org/projects/flink/flink-docs-release-1.8/)
     *   .
     */
    public fun checkpointConfiguration(
        checkpointConfiguration: CfnApplication.CheckpointConfigurationProperty
    ) {
        cdkBuilder.checkpointConfiguration(checkpointConfiguration)
    }

    /**
     * @param monitoringConfiguration Describes configuration parameters for Amazon CloudWatch
     *   logging for an application.
     */
    public fun monitoringConfiguration(monitoringConfiguration: IResolvable) {
        cdkBuilder.monitoringConfiguration(monitoringConfiguration)
    }

    /**
     * @param monitoringConfiguration Describes configuration parameters for Amazon CloudWatch
     *   logging for an application.
     */
    public fun monitoringConfiguration(
        monitoringConfiguration: CfnApplication.MonitoringConfigurationProperty
    ) {
        cdkBuilder.monitoringConfiguration(monitoringConfiguration)
    }

    /**
     * @param parallelismConfiguration Describes parameters for how an application executes multiple
     *   tasks simultaneously.
     */
    public fun parallelismConfiguration(parallelismConfiguration: IResolvable) {
        cdkBuilder.parallelismConfiguration(parallelismConfiguration)
    }

    /**
     * @param parallelismConfiguration Describes parameters for how an application executes multiple
     *   tasks simultaneously.
     */
    public fun parallelismConfiguration(
        parallelismConfiguration: CfnApplication.ParallelismConfigurationProperty
    ) {
        cdkBuilder.parallelismConfiguration(parallelismConfiguration)
    }

    public fun build(): CfnApplication.FlinkApplicationConfigurationProperty = cdkBuilder.build()
}
