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

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * An object that represents the compute environment architecture for AWS Batch jobs on Fargate.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * RuntimePlatformProperty runtimePlatformProperty = RuntimePlatformProperty.builder()
 * .cpuArchitecture("cpuArchitecture")
 * .operatingSystemFamily("operatingSystemFamily")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-runtimeplatform.html)
 */
@CdkDslMarker
public class CfnJobDefinitionRuntimePlatformPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.RuntimePlatformProperty.Builder =
        CfnJobDefinition.RuntimePlatformProperty.builder()

    /**
     * @param cpuArchitecture The vCPU architecture. The default value is `X86_64` . Valid values
     *   are `X86_64` and `ARM64` .
     *
     * This parameter must be set to `X86_64` for Windows containers. &gt; Fargate Spot is not
     * supported for `ARM64` and Windows-based containers on Fargate. A job queue will be blocked if
     * a Fargate `ARM64` or Windows job is submitted to a job queue with only Fargate Spot compute
     * environments. However, you can attach both `FARGATE` and `FARGATE_SPOT` compute environments
     * to the same job queue.
     */
    public fun cpuArchitecture(cpuArchitecture: String) {
        cdkBuilder.cpuArchitecture(cpuArchitecture)
    }

    /**
     * @param operatingSystemFamily The operating system for the compute environment. Valid values
     *   are: `LINUX` (default), `WINDOWS_SERVER_2019_CORE` , `WINDOWS_SERVER_2019_FULL` ,
     *   `WINDOWS_SERVER_2022_CORE` , and `WINDOWS_SERVER_2022_FULL` .
     *
     * The following parameters can’t be set for Windows containers: `linuxParameters` ,
     * `privileged` , `user` , `ulimits` , `readonlyRootFilesystem` , and `efsVolumeConfiguration` .
     * &gt; The AWS Batch Scheduler checks the compute environments that are attached to the job
     * queue before registering a task definition with Fargate. In this scenario, the job queue is
     * where the job is submitted. If the job requires a Windows container and the first compute
     * environment is `LINUX` , the compute environment is skipped and the next compute environment
     * is checked until a Windows-based compute environment is found. &gt; Fargate Spot is not
     * supported for `ARM64` and Windows-based containers on Fargate. A job queue will be blocked if
     * a Fargate `ARM64` or Windows job is submitted to a job queue with only Fargate Spot compute
     * environments. However, you can attach both `FARGATE` and `FARGATE_SPOT` compute environments
     * to the same job queue.
     */
    public fun operatingSystemFamily(operatingSystemFamily: String) {
        cdkBuilder.operatingSystemFamily(operatingSystemFamily)
    }

    public fun build(): CfnJobDefinition.RuntimePlatformProperty = cdkBuilder.build()
}
