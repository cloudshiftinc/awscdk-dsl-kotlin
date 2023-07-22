@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.batch.CfnComputeEnvironment
import software.amazon.awscdk.services.batch.CfnComputeEnvironmentProps

/**
 * Properties for defining a `CfnComputeEnvironment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * CfnComputeEnvironmentProps cfnComputeEnvironmentProps = CfnComputeEnvironmentProps.builder()
 * .type("type")
 * // the properties below are optional
 * .computeEnvironmentName("computeEnvironmentName")
 * .computeResources(ComputeResourcesProperty.builder()
 * .maxvCpus(123)
 * .subnets(List.of("subnets"))
 * .type("type")
 * // the properties below are optional
 * .allocationStrategy("allocationStrategy")
 * .bidPercentage(123)
 * .desiredvCpus(123)
 * .ec2Configuration(List.of(Ec2ConfigurationObjectProperty.builder()
 * .imageType("imageType")
 * // the properties below are optional
 * .imageIdOverride("imageIdOverride")
 * .imageKubernetesVersion("imageKubernetesVersion")
 * .build()))
 * .ec2KeyPair("ec2KeyPair")
 * .imageId("imageId")
 * .instanceRole("instanceRole")
 * .instanceTypes(List.of("instanceTypes"))
 * .launchTemplate(LaunchTemplateSpecificationProperty.builder()
 * .launchTemplateId("launchTemplateId")
 * .launchTemplateName("launchTemplateName")
 * .version("version")
 * .build())
 * .minvCpus(123)
 * .placementGroup("placementGroup")
 * .securityGroupIds(List.of("securityGroupIds"))
 * .spotIamFleetRole("spotIamFleetRole")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .updateToLatestImageVersion(false)
 * .build())
 * .eksConfiguration(EksConfigurationProperty.builder()
 * .eksClusterArn("eksClusterArn")
 * .kubernetesNamespace("kubernetesNamespace")
 * .build())
 * .replaceComputeEnvironment(false)
 * .serviceRole("serviceRole")
 * .state("state")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .unmanagedvCpus(123)
 * .updatePolicy(UpdatePolicyProperty.builder()
 * .jobExecutionTimeoutMinutes(123)
 * .terminateJobsOnUpdate(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-computeenvironment.html)
 */
@CdkDslMarker
public class CfnComputeEnvironmentPropsDsl {
  private val cdkBuilder: CfnComputeEnvironmentProps.Builder = CfnComputeEnvironmentProps.builder()

  /**
   * @param computeEnvironmentName The name for your compute environment.
   * It can be up to 128 characters long. It can contain uppercase and lowercase letters, numbers,
   * hyphens (-), and underscores (_).
   */
  public fun computeEnvironmentName(computeEnvironmentName: String) {
    cdkBuilder.computeEnvironmentName(computeEnvironmentName)
  }

  /**
   * @param computeResources The ComputeResources property type specifies details of the compute
   * resources managed by the compute environment.
   * This parameter is required for managed compute environments. For more information, see [Compute
   * Environments](https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html) in the
   * ** .
   */
  public fun computeResources(computeResources: IResolvable) {
    cdkBuilder.computeResources(computeResources)
  }

  /**
   * @param computeResources The ComputeResources property type specifies details of the compute
   * resources managed by the compute environment.
   * This parameter is required for managed compute environments. For more information, see [Compute
   * Environments](https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html) in the
   * ** .
   */
  public fun computeResources(computeResources: CfnComputeEnvironment.ComputeResourcesProperty) {
    cdkBuilder.computeResources(computeResources)
  }

  /**
   * @param eksConfiguration The details for the Amazon EKS cluster that supports the compute
   * environment.
   */
  public fun eksConfiguration(eksConfiguration: IResolvable) {
    cdkBuilder.eksConfiguration(eksConfiguration)
  }

  /**
   * @param eksConfiguration The details for the Amazon EKS cluster that supports the compute
   * environment.
   */
  public fun eksConfiguration(eksConfiguration: CfnComputeEnvironment.EksConfigurationProperty) {
    cdkBuilder.eksConfiguration(eksConfiguration)
  }

  /**
   * @param replaceComputeEnvironment Specifies whether the compute environment is replaced if an
   * update is made that requires replacing the instances in the compute environment.
   * The default value is `true` . To enable more properties to be updated, set this property to
   * `false` . When changing the value of this property to `false` , do not change any other properties
   * at the same time. If other properties are changed at the same time, and the change needs to be
   * rolled back but it can't, it's possible for the stack to go into the `UPDATE_ROLLBACK_FAILED`
   * state. You can't update a stack that is in the `UPDATE_ROLLBACK_FAILED` state. However, if you can
   * continue to roll it back, you can return the stack to its original settings and then try to update
   * it again. For more information, see [Continue rolling back an
   * update](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html)
   * in the *AWS CloudFormation User Guide* .
   *
   * The properties that can't be changed without replacing the compute environment are in the
   * [`ComputeResources`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html)
   * property type:
   * [`AllocationStrategy`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-allocationstrategy)
   * ,
   * [`BidPercentage`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-bidpercentage)
   * ,
   * [`Ec2Configuration`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2configuration)
   * ,
   * [`Ec2KeyPair`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2keypair)
   * ,
   * [`Ec2KeyPair`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2keypair)
   * ,
   * [`ImageId`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-imageid)
   * ,
   * [`InstanceRole`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancerole)
   * ,
   * [`InstanceTypes`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancetypes)
   * ,
   * [`LaunchTemplate`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-launchtemplate)
   * ,
   * [`MaxvCpus`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-maxvcpus)
   * ,
   * [`MinvCpus`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-minvcpus)
   * ,
   * [`PlacementGroup`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-placementgroup)
   * ,
   * [`SecurityGroupIds`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-securitygroupids)
   * ,
   * [`Subnets`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-subnets)
   * ,
   * [Tags](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-tags)
   * ,
   * [`Type`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-type)
   * , and
   * [`UpdateToLatestImageVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-updatetolatestimageversion)
   * .
   */
  public fun replaceComputeEnvironment(replaceComputeEnvironment: Boolean) {
    cdkBuilder.replaceComputeEnvironment(replaceComputeEnvironment)
  }

  /**
   * @param replaceComputeEnvironment Specifies whether the compute environment is replaced if an
   * update is made that requires replacing the instances in the compute environment.
   * The default value is `true` . To enable more properties to be updated, set this property to
   * `false` . When changing the value of this property to `false` , do not change any other properties
   * at the same time. If other properties are changed at the same time, and the change needs to be
   * rolled back but it can't, it's possible for the stack to go into the `UPDATE_ROLLBACK_FAILED`
   * state. You can't update a stack that is in the `UPDATE_ROLLBACK_FAILED` state. However, if you can
   * continue to roll it back, you can return the stack to its original settings and then try to update
   * it again. For more information, see [Continue rolling back an
   * update](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-continueupdaterollback.html)
   * in the *AWS CloudFormation User Guide* .
   *
   * The properties that can't be changed without replacing the compute environment are in the
   * [`ComputeResources`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html)
   * property type:
   * [`AllocationStrategy`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-allocationstrategy)
   * ,
   * [`BidPercentage`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-bidpercentage)
   * ,
   * [`Ec2Configuration`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2configuration)
   * ,
   * [`Ec2KeyPair`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2keypair)
   * ,
   * [`Ec2KeyPair`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2keypair)
   * ,
   * [`ImageId`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-imageid)
   * ,
   * [`InstanceRole`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancerole)
   * ,
   * [`InstanceTypes`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancetypes)
   * ,
   * [`LaunchTemplate`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-launchtemplate)
   * ,
   * [`MaxvCpus`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-maxvcpus)
   * ,
   * [`MinvCpus`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-minvcpus)
   * ,
   * [`PlacementGroup`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-placementgroup)
   * ,
   * [`SecurityGroupIds`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-securitygroupids)
   * ,
   * [`Subnets`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-subnets)
   * ,
   * [Tags](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-tags)
   * ,
   * [`Type`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-type)
   * , and
   * [`UpdateToLatestImageVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-updatetolatestimageversion)
   * .
   */
  public fun replaceComputeEnvironment(replaceComputeEnvironment: IResolvable) {
    cdkBuilder.replaceComputeEnvironment(replaceComputeEnvironment)
  }

  /**
   * @param serviceRole The full Amazon Resource Name (ARN) of the IAM role that allows AWS Batch to
   * make calls to other AWS services on your behalf.
   * For more information, see [AWS Batch service IAM
   * role](https://docs.aws.amazon.com/batch/latest/userguide/service_IAM_role.html) in the *AWS Batch
   * User Guide* .
   *
   *
   * If your account already created the AWS Batch service-linked role, that role is used by default
   * for your compute environment unless you specify a different role here. If the AWS Batch
   * service-linked role doesn't exist in your account, and no role is specified here, the service
   * attempts to create the AWS Batch service-linked role in your account.
   *
   *
   * If your specified role has a path other than `/` , then you must specify either the full role
   * ARN (recommended) or prefix the role name with the path. For example, if a role with the name
   * `bar` has a path of `/foo/` , specify `/foo/bar` as the role name. For more information, see
   * [Friendly names and
   * paths](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names)
   * in the *IAM User Guide* .
   *
   *
   * Depending on how you created your AWS Batch service role, its ARN might contain the
   * `service-role` path prefix. When you only specify the name of the service role, AWS Batch assumes
   * that your ARN doesn't use the `service-role` path prefix. Because of this, we recommend that you
   * specify the full ARN of your service role when you create compute environments.
   */
  public fun serviceRole(serviceRole: String) {
    cdkBuilder.serviceRole(serviceRole)
  }

  /**
   * @param state The state of the compute environment.
   * If the state is `ENABLED` , then the compute environment accepts jobs from a queue and can
   * scale out automatically based on queues.
   *
   * If the state is `ENABLED` , then the AWS Batch scheduler can attempt to place jobs from an
   * associated job queue on the compute resources within the environment. If the compute environment
   * is managed, then it can scale its instances out or in automatically, based on the job queue
   * demand.
   *
   * If the state is `DISABLED` , then the AWS Batch scheduler doesn't attempt to place jobs within
   * the environment. Jobs in a `STARTING` or `RUNNING` state continue to progress normally. Managed
   * compute environments in the `DISABLED` state don't scale out.
   *
   *
   * Compute environments in a `DISABLED` state may continue to incur billing charges. To prevent
   * additional charges, turn off and then delete the compute environment. For more information, see
   * [State](https://docs.aws.amazon.com/batch/latest/userguide/compute_environment_parameters.html#compute_environment_state)
   * in the *AWS Batch User Guide* .
   *
   *
   * When an instance is idle, the instance scales down to the `minvCpus` value. However, the
   * instance size doesn't change. For example, consider a `c5.8xlarge` instance with a `minvCpus`
   * value of `4` and a `desiredvCpus` value of `36` . This instance doesn't scale down to a `c5.large`
   * instance.
   */
  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  /**
   * @param tags The tags applied to the compute environment.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param type The type of the compute environment: `MANAGED` or `UNMANAGED` . 
   * For more information, see [Compute
   * Environments](https://docs.aws.amazon.com/batch/latest/userguide/compute_environments.html) in the
   * *AWS Batch User Guide* .
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param unmanagedvCpus The maximum number of vCPUs for an unmanaged compute environment.
   * This parameter is only used for fair share scheduling to reserve vCPU capacity for new share
   * identifiers. If this parameter isn't provided for a fair share job queue, no vCPU capacity is
   * reserved.
   *
   *
   * This parameter is only supported when the `type` parameter is set to `UNMANAGED` .
   */
  public fun unmanagedvCpus(unmanagedvCpus: Number) {
    cdkBuilder.unmanagedvCpus(unmanagedvCpus)
  }

  /**
   * @param updatePolicy Specifies the infrastructure update policy for the compute environment.
   * For more information about infrastructure updates, see [Updating compute
   * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
   * in the *AWS Batch User Guide* .
   */
  public fun updatePolicy(updatePolicy: IResolvable) {
    cdkBuilder.updatePolicy(updatePolicy)
  }

  /**
   * @param updatePolicy Specifies the infrastructure update policy for the compute environment.
   * For more information about infrastructure updates, see [Updating compute
   * environments](https://docs.aws.amazon.com/batch/latest/userguide/updating-compute-environments.html)
   * in the *AWS Batch User Guide* .
   */
  public fun updatePolicy(updatePolicy: CfnComputeEnvironment.UpdatePolicyProperty) {
    cdkBuilder.updatePolicy(updatePolicy)
  }

  public fun build(): CfnComputeEnvironmentProps = cdkBuilder.build()
}
