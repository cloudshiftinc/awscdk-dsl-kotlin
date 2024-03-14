package io.cloudshiftdev.awscdk.services.s3objectlambda

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAccessPointPolicy internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicy,
) : CfnResource(cdkObject), IInspectable {
  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * An access point with an attached AWS Lambda function used to access transformed data from an
   * Amazon S3 bucket.
   */
  public open fun objectLambdaAccessPoint(): String = unwrap(this).getObjectLambdaAccessPoint()

  /**
   * An access point with an attached AWS Lambda function used to access transformed data from an
   * Amazon S3 bucket.
   */
  public open fun objectLambdaAccessPoint(`value`: String) {
    unwrap(this).setObjectLambdaAccessPoint(`value`)
  }

  /**
   * Object Lambda Access Point resource policy document.
   */
  public open fun policyDocument(): Any = unwrap(this).getPolicyDocument()

  /**
   * Object Lambda Access Point resource policy document.
   */
  public open fun policyDocument(`value`: Any) {
    unwrap(this).setPolicyDocument(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.s3objectlambda.CfnAccessPointPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An access point with an attached AWS Lambda function used to access transformed data from an
     * Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspointpolicy.html#cfn-s3objectlambda-accesspointpolicy-objectlambdaaccesspoint)
     * @param objectLambdaAccessPoint An access point with an attached AWS Lambda function used to
     * access transformed data from an Amazon S3 bucket. 
     */
    public fun objectLambdaAccessPoint(objectLambdaAccessPoint: String)

    /**
     * Object Lambda Access Point resource policy document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspointpolicy.html#cfn-s3objectlambda-accesspointpolicy-policydocument)
     * @param policyDocument Object Lambda Access Point resource policy document. 
     */
    public fun policyDocument(policyDocument: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicy.Builder =
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicy.Builder.create(scope,
        id)

    /**
     * An access point with an attached AWS Lambda function used to access transformed data from an
     * Amazon S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspointpolicy.html#cfn-s3objectlambda-accesspointpolicy-objectlambdaaccesspoint)
     * @param objectLambdaAccessPoint An access point with an attached AWS Lambda function used to
     * access transformed data from an Amazon S3 bucket. 
     */
    override fun objectLambdaAccessPoint(objectLambdaAccessPoint: String) {
      cdkBuilder.objectLambdaAccessPoint(objectLambdaAccessPoint)
    }

    /**
     * Object Lambda Access Point resource policy document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3objectlambda-accesspointpolicy.html#cfn-s3objectlambda-accesspointpolicy-policydocument)
     * @param policyDocument Object Lambda Access Point resource policy document. 
     */
    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    public fun build(): software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessPointPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessPointPolicy(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicy):
        CfnAccessPointPolicy = CfnAccessPointPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPointPolicy):
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPointPolicy = wrapped.cdkObject
  }
}
