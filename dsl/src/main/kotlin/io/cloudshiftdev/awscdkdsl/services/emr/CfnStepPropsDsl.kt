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

package io.cloudshiftdev.awscdkdsl.services.emr

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnStep
import software.amazon.awscdk.services.emr.CfnStepProps

/**
 * Properties for defining a `CfnStep`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * CfnStepProps cfnStepProps = CfnStepProps.builder()
 * .actionOnFailure("actionOnFailure")
 * .hadoopJarStep(HadoopJarStepConfigProperty.builder()
 * .jar("jar")
 * // the properties below are optional
 * .args(List.of("args"))
 * .mainClass("mainClass")
 * .stepProperties(List.of(KeyValueProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build())
 * .jobFlowId("jobFlowId")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-step.html)
 */
@CdkDslMarker
public class CfnStepPropsDsl {
    private val cdkBuilder: CfnStepProps.Builder = CfnStepProps.builder()

    /**
     * @param actionOnFailure This specifies what action to take when the cluster step fails.
     *   Possible values are `CANCEL_AND_WAIT` and `CONTINUE` .
     */
    public fun actionOnFailure(actionOnFailure: String) {
        cdkBuilder.actionOnFailure(actionOnFailure)
    }

    /**
     * @param hadoopJarStep The `HadoopJarStepConfig` property type specifies a job flow step
     *   consisting of a JAR file whose main function will be executed. The main function submits a
     *   job for the cluster to execute as a step on the master node, and then waits for the job to
     *   finish or fail before executing subsequent steps.
     */
    public fun hadoopJarStep(hadoopJarStep: IResolvable) {
        cdkBuilder.hadoopJarStep(hadoopJarStep)
    }

    /**
     * @param hadoopJarStep The `HadoopJarStepConfig` property type specifies a job flow step
     *   consisting of a JAR file whose main function will be executed. The main function submits a
     *   job for the cluster to execute as a step on the master node, and then waits for the job to
     *   finish or fail before executing subsequent steps.
     */
    public fun hadoopJarStep(hadoopJarStep: CfnStep.HadoopJarStepConfigProperty) {
        cdkBuilder.hadoopJarStep(hadoopJarStep)
    }

    /** @param jobFlowId A string that uniquely identifies the cluster (job flow). */
    public fun jobFlowId(jobFlowId: String) {
        cdkBuilder.jobFlowId(jobFlowId)
    }

    /** @param name The name of the cluster step. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnStepProps = cdkBuilder.build()
}
