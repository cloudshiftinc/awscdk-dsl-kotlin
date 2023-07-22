@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnAssociation

/**
 * `InstanceAssociationOutputLocation` is a property of the
 * [AWS::SSM::Association](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html)
 * resource that specifies an Amazon S3 bucket where you want to store the results of this association
 * request.
 *
 * For the minimal permissions required to enable Amazon S3 output for an association, see [Creating
 * associations](https://docs.aws.amazon.com/systems-manager/latest/userguide/sysman-state-assoc.html)
 * in the *Systems Manager User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * InstanceAssociationOutputLocationProperty instanceAssociationOutputLocationProperty =
 * InstanceAssociationOutputLocationProperty.builder()
 * .s3Location(S3OutputLocationProperty.builder()
 * .outputS3BucketName("outputS3BucketName")
 * .outputS3KeyPrefix("outputS3KeyPrefix")
 * .outputS3Region("outputS3Region")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html)
 */
@CdkDslMarker
public class CfnAssociationInstanceAssociationOutputLocationPropertyDsl {
  private val cdkBuilder: CfnAssociation.InstanceAssociationOutputLocationProperty.Builder =
      CfnAssociation.InstanceAssociationOutputLocationProperty.builder()

  /**
   * @param s3Location `S3OutputLocation` is a property of the
   * [InstanceAssociationOutputLocation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html)
   * property that specifies an Amazon S3 bucket where you want to store the results of this request.
   */
  public fun s3Location(s3Location: IResolvable) {
    cdkBuilder.s3Location(s3Location)
  }

  /**
   * @param s3Location `S3OutputLocation` is a property of the
   * [InstanceAssociationOutputLocation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html)
   * property that specifies an Amazon S3 bucket where you want to store the results of this request.
   */
  public fun s3Location(s3Location: CfnAssociation.S3OutputLocationProperty) {
    cdkBuilder.s3Location(s3Location)
  }

  public fun build(): CfnAssociation.InstanceAssociationOutputLocationProperty = cdkBuilder.build()
}
