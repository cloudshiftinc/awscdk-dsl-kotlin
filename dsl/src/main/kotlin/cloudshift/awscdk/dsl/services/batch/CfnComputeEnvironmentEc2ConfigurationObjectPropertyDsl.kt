@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.batch.CfnComputeEnvironment

@CdkDslMarker
public class CfnComputeEnvironmentEc2ConfigurationObjectPropertyDsl {
  private val cdkBuilder: CfnComputeEnvironment.Ec2ConfigurationObjectProperty.Builder =
      CfnComputeEnvironment.Ec2ConfigurationObjectProperty.builder()

  /**
   * @param imageIdOverride The AMI ID used for instances launched in the compute environment that
   * match the image type.
   * This setting overrides the `imageId` set in the `computeResource` object.
   *
   *
   * The AMI that you choose for a compute environment must match the architecture of the instance
   * types that you intend to use for that compute environment. For example, if your compute
   * environment uses A1 instance types, the compute resource AMI that you choose must support ARM
   * instances. Amazon ECS vends both x86 and ARM versions of the Amazon ECS-optimized Amazon Linux 2
   * AMI. For more information, see [Amazon ECS-optimized Amazon Linux 2
   * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#ecs-optimized-ami-linux-variants.html)
   * in the *Amazon Elastic Container Service Developer Guide* .
   */
  public fun imageIdOverride(imageIdOverride: String) {
    cdkBuilder.imageIdOverride(imageIdOverride)
  }

  /**
   * @param imageKubernetesVersion The Kubernetes version for the compute environment.
   * If you don't specify a value, the latest version that AWS Batch supports is used.
   */
  public fun imageKubernetesVersion(imageKubernetesVersion: String) {
    cdkBuilder.imageKubernetesVersion(imageKubernetesVersion)
  }

  /**
   * @param imageType The image type to match with the instance type to select an AMI. 
   * The supported values are different for `ECS` and `EKS` resources.
   *
   * * **ECS** - If the `imageIdOverride` parameter isn't specified, then a recent [Amazon
   * ECS-optimized Amazon Linux 2
   * AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami) (
   * `ECS_AL2` ) is used. If a new image type is specified in an update, but neither an `imageId` nor a
   * `imageIdOverride` parameter is specified, then the latest Amazon ECS optimized AMI for that image
   * type that's supported by AWS Batch is used.
   * * **ECS_AL2** - [Amazon Linux
   * 2](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#al2ami) :
   * Default for all non-GPU instance families.
   * * **ECS_AL2_NVIDIA** - [Amazon Linux 2
   * (GPU)](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#gpuami)
   * : Default for all GPU instance families (for example `P4` and `G4` ) and can be used for all non
   * AWS Graviton-based instance types.
   * * **ECS_AL1** - [Amazon
   * Linux](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html#alami) .
   * Amazon Linux has reached the end-of-life of standard support. For more information, see [Amazon
   * Linux AMI](https://docs.aws.amazon.com/amazon-linux-ami/) .
   * * **EKS** - If the `imageIdOverride` parameter isn't specified, then a recent [Amazon
   * EKS-optimized Amazon Linux
   * AMI](https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html) ( `EKS_AL2` ) is
   * used. If a new image type is specified in an update, but neither an `imageId` nor a
   * `imageIdOverride` parameter is specified, then the latest Amazon EKS optimized AMI for that image
   * type that AWS Batch supports is used.
   * * **EKS_AL2** - [Amazon Linux
   * 2](https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html) : Default for all
   * non-GPU instance families.
   * * **EKS_AL2_NVIDIA** - [Amazon Linux 2
   * (accelerated)](https://docs.aws.amazon.com/eks/latest/userguide/eks-optimized-ami.html) : Default
   * for all GPU instance families (for example, `P4` and `G4` ) and can be used for all non AWS
   * Graviton-based instance types.
   */
  public fun imageType(imageType: String) {
    cdkBuilder.imageType(imageType)
  }

  public fun build(): CfnComputeEnvironment.Ec2ConfigurationObjectProperty = cdkBuilder.build()
}
