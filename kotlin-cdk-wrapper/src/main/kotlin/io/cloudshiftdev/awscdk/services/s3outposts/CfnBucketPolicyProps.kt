@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3outposts

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnBucketPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.s3outposts.*;
 * Object policyDocument;
 * CfnBucketPolicyProps cfnBucketPolicyProps = CfnBucketPolicyProps.builder()
 * .bucket("bucket")
 * .policyDocument(policyDocument)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucketpolicy.html)
 */
public interface CfnBucketPolicyProps {
  /**
   * The name of the Amazon S3 Outposts bucket to which the policy applies.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucketpolicy.html#cfn-s3outposts-bucketpolicy-bucket)
   */
  public fun bucket(): String

  /**
   * A policy document containing permissions to add to the specified bucket.
   *
   * In IAM, you must provide policy documents in JSON format. However, in CloudFormation, you can
   * provide the policy in JSON or YAML format because CloudFormation converts YAML to JSON before
   * submitting it to IAM. For more information, see the AWS::IAM::Policy
   * [PolicyDocument](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
   * resource description in this guide and [Access Policy Language
   * Overview](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-policy-language-overview.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucketpolicy.html#cfn-s3outposts-bucketpolicy-policydocument)
   */
  public fun policyDocument(): Any

  /**
   * A builder for [CfnBucketPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket The name of the Amazon S3 Outposts bucket to which the policy applies. 
     */
    public fun bucket(bucket: String)

    /**
     * @param policyDocument A policy document containing permissions to add to the specified
     * bucket. 
     * In IAM, you must provide policy documents in JSON format. However, in CloudFormation, you can
     * provide the policy in JSON or YAML format because CloudFormation converts YAML to JSON before
     * submitting it to IAM. For more information, see the AWS::IAM::Policy
     * [PolicyDocument](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
     * resource description in this guide and [Access Policy Language
     * Overview](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-policy-language-overview.html)
     * .
     */
    public fun policyDocument(policyDocument: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3outposts.CfnBucketPolicyProps.Builder
        = software.amazon.awscdk.services.s3outposts.CfnBucketPolicyProps.builder()

    /**
     * @param bucket The name of the Amazon S3 Outposts bucket to which the policy applies. 
     */
    override fun bucket(bucket: String) {
      cdkBuilder.bucket(bucket)
    }

    /**
     * @param policyDocument A policy document containing permissions to add to the specified
     * bucket. 
     * In IAM, you must provide policy documents in JSON format. However, in CloudFormation, you can
     * provide the policy in JSON or YAML format because CloudFormation converts YAML to JSON before
     * submitting it to IAM. For more information, see the AWS::IAM::Policy
     * [PolicyDocument](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
     * resource description in this guide and [Access Policy Language
     * Overview](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-policy-language-overview.html)
     * .
     */
    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    public fun build(): software.amazon.awscdk.services.s3outposts.CfnBucketPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucketPolicyProps,
  ) : CdkObject(cdkObject), CfnBucketPolicyProps {
    /**
     * The name of the Amazon S3 Outposts bucket to which the policy applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucketpolicy.html#cfn-s3outposts-bucketpolicy-bucket)
     */
    override fun bucket(): String = unwrap(this).getBucket()

    /**
     * A policy document containing permissions to add to the specified bucket.
     *
     * In IAM, you must provide policy documents in JSON format. However, in CloudFormation, you can
     * provide the policy in JSON or YAML format because CloudFormation converts YAML to JSON before
     * submitting it to IAM. For more information, see the AWS::IAM::Policy
     * [PolicyDocument](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
     * resource description in this guide and [Access Policy Language
     * Overview](https://docs.aws.amazon.com/AmazonS3/latest/userguide/access-policy-language-overview.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-bucketpolicy.html#cfn-s3outposts-bucketpolicy-policydocument)
     */
    override fun policyDocument(): Any = unwrap(this).getPolicyDocument()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBucketPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucketPolicyProps):
        CfnBucketPolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnBucketPolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBucketPolicyProps):
        software.amazon.awscdk.services.s3outposts.CfnBucketPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3outposts.CfnBucketPolicyProps
  }
}
