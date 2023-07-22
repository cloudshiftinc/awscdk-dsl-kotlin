@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDataQualityJobDefinition

/**
 * Networking options for a job, such as network traffic encryption between containers, whether to
 * allow inbound and outbound network calls to and from containers, and the VPC subnets and security
 * groups to use for VPC-enabled jobs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * NetworkConfigProperty networkConfigProperty = NetworkConfigProperty.builder()
 * .enableInterContainerTrafficEncryption(false)
 * .enableNetworkIsolation(false)
 * .vpcConfig(VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnets(List.of("subnets"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-dataqualityjobdefinition-networkconfig.html)
 */
@CdkDslMarker
public class CfnDataQualityJobDefinitionNetworkConfigPropertyDsl {
  private val cdkBuilder: CfnDataQualityJobDefinition.NetworkConfigProperty.Builder =
      CfnDataQualityJobDefinition.NetworkConfigProperty.builder()

  /**
   * @param enableInterContainerTrafficEncryption Whether to encrypt all communications between
   * distributed processing jobs.
   * Choose `True` to encrypt communications. Encryption provides greater security for distributed
   * processing jobs, but the processing might take longer.
   */
  public fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: Boolean) {
    cdkBuilder.enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption)
  }

  /**
   * @param enableInterContainerTrafficEncryption Whether to encrypt all communications between
   * distributed processing jobs.
   * Choose `True` to encrypt communications. Encryption provides greater security for distributed
   * processing jobs, but the processing might take longer.
   */
  public
      fun enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption: IResolvable) {
    cdkBuilder.enableInterContainerTrafficEncryption(enableInterContainerTrafficEncryption)
  }

  /**
   * @param enableNetworkIsolation Whether to allow inbound and outbound network calls to and from
   * the containers used for the processing job.
   */
  public fun enableNetworkIsolation(enableNetworkIsolation: Boolean) {
    cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
  }

  /**
   * @param enableNetworkIsolation Whether to allow inbound and outbound network calls to and from
   * the containers used for the processing job.
   */
  public fun enableNetworkIsolation(enableNetworkIsolation: IResolvable) {
    cdkBuilder.enableNetworkIsolation(enableNetworkIsolation)
  }

  /**
   * @param vpcConfig Specifies a VPC that your training jobs and hosted models have access to.
   * Control access to and from your training and model containers by configuring the VPC.
   */
  public fun vpcConfig(vpcConfig: IResolvable) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  /**
   * @param vpcConfig Specifies a VPC that your training jobs and hosted models have access to.
   * Control access to and from your training and model containers by configuring the VPC.
   */
  public fun vpcConfig(vpcConfig: CfnDataQualityJobDefinition.VpcConfigProperty) {
    cdkBuilder.vpcConfig(vpcConfig)
  }

  public fun build(): CfnDataQualityJobDefinition.NetworkConfigProperty = cdkBuilder.build()
}
