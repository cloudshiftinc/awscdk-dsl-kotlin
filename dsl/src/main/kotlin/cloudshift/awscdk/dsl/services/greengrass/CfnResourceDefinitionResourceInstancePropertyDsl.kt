@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition

/**
 * A local resource, machine learning resource, or secret resource.
 *
 * For more information, see [Access Local Resources with Lambda
 * Functions](https://docs.aws.amazon.com/greengrass/latest/developerguide/access-local-resources.html)
 * , [Perform Machine Learning
 * Inference](https://docs.aws.amazon.com/greengrass/latest/developerguide/ml-inference.html) , and
 * [Deploy Secrets to the AWS IoT Greengrass
 * Core](https://docs.aws.amazon.com/greengrass/latest/developerguide/secrets.html) in the *Developer
 * Guide* .
 *
 * In an AWS CloudFormation template, the `Resources` property of the
 * [`AWS::Greengrass::ResourceDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html)
 * resource contains a list of `ResourceInstance` property types.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * ResourceInstanceProperty resourceInstanceProperty = ResourceInstanceProperty.builder()
 * .id("id")
 * .name("name")
 * .resourceDataContainer(ResourceDataContainerProperty.builder()
 * .localDeviceResourceData(LocalDeviceResourceDataProperty.builder()
 * .sourcePath("sourcePath")
 * // the properties below are optional
 * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
 * .autoAddGroupOwner(false)
 * // the properties below are optional
 * .groupOwner("groupOwner")
 * .build())
 * .build())
 * .localVolumeResourceData(LocalVolumeResourceDataProperty.builder()
 * .destinationPath("destinationPath")
 * .sourcePath("sourcePath")
 * // the properties below are optional
 * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
 * .autoAddGroupOwner(false)
 * // the properties below are optional
 * .groupOwner("groupOwner")
 * .build())
 * .build())
 * .s3MachineLearningModelResourceData(S3MachineLearningModelResourceDataProperty.builder()
 * .destinationPath("destinationPath")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
 * .groupOwner("groupOwner")
 * .groupPermission("groupPermission")
 * .build())
 * .build())
 * .sageMakerMachineLearningModelResourceData(SageMakerMachineLearningModelResourceDataProperty.builder()
 * .destinationPath("destinationPath")
 * .sageMakerJobArn("sageMakerJobArn")
 * // the properties below are optional
 * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
 * .groupOwner("groupOwner")
 * .groupPermission("groupPermission")
 * .build())
 * .build())
 * .secretsManagerSecretResourceData(SecretsManagerSecretResourceDataProperty.builder()
 * .arn("arn")
 * // the properties below are optional
 * .additionalStagingLabelsToDownload(List.of("additionalStagingLabelsToDownload"))
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html)
 */
@CdkDslMarker
public class CfnResourceDefinitionResourceInstancePropertyDsl {
  private val cdkBuilder: CfnResourceDefinition.ResourceInstanceProperty.Builder =
      CfnResourceDefinition.ResourceInstanceProperty.builder()

  /**
   * @param id A descriptive or arbitrary ID for the resource. 
   * This value must be unique within the resource definition version. Maximum length is 128
   * characters with pattern `[a-zA-Z0-9:_-]+` .
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param name The descriptive resource name, which is displayed on the AWS IoT Greengrass
   * console. 
   * Maximum length 128 characters with pattern [a-zA-Z0-9:_-]+. This must be unique within a
   * Greengrass group.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param resourceDataContainer A container for resource data. 
   * The container takes only one of the following supported resource data types:
   * `LocalDeviceResourceData` , `LocalVolumeResourceData` ,
   * `SageMakerMachineLearningModelResourceData` , `S3MachineLearningModelResourceData` , or
   * `SecretsManagerSecretResourceData` .
   *
   *
   * Only one resource type can be defined for a `ResourceDataContainer` instance.
   */
  public fun resourceDataContainer(resourceDataContainer: IResolvable) {
    cdkBuilder.resourceDataContainer(resourceDataContainer)
  }

  /**
   * @param resourceDataContainer A container for resource data. 
   * The container takes only one of the following supported resource data types:
   * `LocalDeviceResourceData` , `LocalVolumeResourceData` ,
   * `SageMakerMachineLearningModelResourceData` , `S3MachineLearningModelResourceData` , or
   * `SecretsManagerSecretResourceData` .
   *
   *
   * Only one resource type can be defined for a `ResourceDataContainer` instance.
   */
  public
      fun resourceDataContainer(resourceDataContainer: CfnResourceDefinition.ResourceDataContainerProperty) {
    cdkBuilder.resourceDataContainer(resourceDataContainer)
  }

  public fun build(): CfnResourceDefinition.ResourceInstanceProperty = cdkBuilder.build()
}
