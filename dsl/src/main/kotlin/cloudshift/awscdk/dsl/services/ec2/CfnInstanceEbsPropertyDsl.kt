@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnInstance

/**
 * Specifies a block device for an EBS volume.
 *
 * `Ebs` is a property of the [Amazon EC2
 * BlockDeviceMapping](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-blockdev-mapping.html)
 * property.
 *
 *
 * After the instance is running, you can modify only the `DeleteOnTermination` parameters for the
 * attached volumes without interrupting the instance. Modifying any other parameter results in
 * instance
 * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
 * .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * EbsProperty ebsProperty = EbsProperty.builder()
 * .deleteOnTermination(false)
 * .encrypted(false)
 * .iops(123)
 * .kmsKeyId("kmsKeyId")
 * .snapshotId("snapshotId")
 * .volumeSize(123)
 * .volumeType("volumeType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-ebs.html)
 */
@CdkDslMarker
public class CfnInstanceEbsPropertyDsl {
  private val cdkBuilder: CfnInstance.EbsProperty.Builder = CfnInstance.EbsProperty.builder()

  /**
   * @param deleteOnTermination Indicates whether the EBS volume is deleted on instance termination.
   * For more information, see [Preserving Amazon EBS volumes on instance
   * termination](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination)
   * in the *Amazon EC2 User Guide* .
   */
  public fun deleteOnTermination(deleteOnTermination: Boolean) {
    cdkBuilder.deleteOnTermination(deleteOnTermination)
  }

  /**
   * @param deleteOnTermination Indicates whether the EBS volume is deleted on instance termination.
   * For more information, see [Preserving Amazon EBS volumes on instance
   * termination](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination)
   * in the *Amazon EC2 User Guide* .
   */
  public fun deleteOnTermination(deleteOnTermination: IResolvable) {
    cdkBuilder.deleteOnTermination(deleteOnTermination)
  }

  /**
   * @param encrypted Indicates whether the volume should be encrypted.
   * The effect of setting the encryption state to `true` depends on the volume origin (new or from
   * a snapshot), starting encryption state, ownership, and whether encryption by default is enabled.
   * For more information, see [Encryption by
   * default](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default)
   * in the *Amazon Elastic Compute Cloud User Guide* .
   *
   * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS encryption.
   * For more information, see [Supported instance
   * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
   * .
   *
   *
   * After the instance is running, modifying this parameter results in instance
   * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
   * .
   */
  public fun encrypted(encrypted: Boolean) {
    cdkBuilder.encrypted(encrypted)
  }

  /**
   * @param encrypted Indicates whether the volume should be encrypted.
   * The effect of setting the encryption state to `true` depends on the volume origin (new or from
   * a snapshot), starting encryption state, ownership, and whether encryption by default is enabled.
   * For more information, see [Encryption by
   * default](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#encryption-by-default)
   * in the *Amazon Elastic Compute Cloud User Guide* .
   *
   * Encrypted Amazon EBS volumes must be attached to instances that support Amazon EBS encryption.
   * For more information, see [Supported instance
   * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html#EBSEncryption_supported_instances)
   * .
   *
   *
   * After the instance is running, modifying this parameter results in instance
   * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
   * .
   */
  public fun encrypted(encrypted: IResolvable) {
    cdkBuilder.encrypted(encrypted)
  }

  /**
   * @param iops The number of I/O operations per second (IOPS).
   * For `gp3` , `io1` , and `io2` volumes, this represents the number of IOPS that are provisioned
   * for the volume. For `gp2` volumes, this represents the baseline performance of the volume and the
   * rate at which the volume accumulates I/O credits for bursting.
   *
   * The following are the supported values for each volume type:
   *
   * * `gp3` : 3,000-16,000 IOPS
   * * `io1` : 100-64,000 IOPS
   * * `io2` : 100-64,000 IOPS
   *
   * For `io1` and `io2` volumes, we guarantee 64,000 IOPS only for [Instances built on the Nitro
   * System](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html#ec2-nitro-instances)
   * . Other instance families guarantee performance up to 32,000 IOPS.
   *
   * This parameter is required for `io1` and `io2` volumes. The default for `gp3` volumes is 3,000
   * IOPS. This parameter is not supported for `gp2` , `st1` , `sc1` , or `standard` volumes.
   *
   *
   * After the instance is running, modifying this parameter results in instance
   * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
   * .
   */
  public fun iops(iops: Number) {
    cdkBuilder.iops(iops)
  }

  /**
   * @param kmsKeyId The identifier of the AWS KMS key to use for Amazon EBS encryption.
   * If `KmsKeyId` is specified, the encrypted state must be `true` . If the encrypted state is
   * `true` but you do not specify `KmsKeyId` , your KMS key for EBS is used.
   *
   * You can specify the KMS key using any of the following:
   *
   * * Key ID. For example, 1234abcd-12ab-34cd-56ef-1234567890ab.
   * * Key alias. For example, alias/ExampleAlias.
   * * Key ARN. For example,
   * arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab.
   * * Alias ARN. For example, arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias.
   *
   *
   * After the instance is running, modifying this parameter results in instance
   * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
   * .
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * @param snapshotId The ID of the snapshot.
   * If you specify both `SnapshotId` and `VolumeSize` , `VolumeSize` must be equal or greater than
   * the size of the snapshot.
   *
   *
   * After the instance is running, modifying this parameter results in instance
   * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
   * .
   */
  public fun snapshotId(snapshotId: String) {
    cdkBuilder.snapshotId(snapshotId)
  }

  /**
   * @param volumeSize The size of the volume, in GiBs.
   * You must specify either a snapshot ID or a volume size. If you specify a snapshot, the default
   * is the snapshot size. You can specify a volume size that is equal to or larger than the snapshot
   * size.
   *
   * The following are the supported volumes sizes for each volume type:
   *
   * * `gp2` and `gp3` :1-16,384
   * * `io1` and `io2` : 4-16,384
   * * `st1` and `sc1` : 125-16,384
   * * `standard` : 1-1,024
   *
   *
   * After the instance is running, modifying this parameter results in instance
   * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
   * .
   */
  public fun volumeSize(volumeSize: Number) {
    cdkBuilder.volumeSize(volumeSize)
  }

  /**
   * @param volumeType The volume type.
   * For more information, see [Amazon EBS volume
   * types](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSVolumeTypes.html) in the *Amazon EC2
   * User Guide* . If the volume type is `io1` or `io2` , you must specify the IOPS that the volume
   * supports.
   *
   *
   * After the instance is running, modifying this parameter results in instance
   * [replacement](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-update-behaviors.html#update-replacement)
   * .
   */
  public fun volumeType(volumeType: String) {
    cdkBuilder.volumeType(volumeType)
  }

  public fun build(): CfnInstance.EbsProperty = cdkBuilder.build()
}
