package io.cloudshiftdev.awscdk.services.s3outposts

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBucketPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucketPolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun bucket(): String = unwrap(this).getBucket()

  public open fun bucket(`value`: String) {
    unwrap(this).setBucket(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policyDocument(): Any = unwrap(this).getPolicyDocument()

  public open fun policyDocument(`value`: Any) {
    unwrap(this).setPolicyDocument(`value`)
  }

  public interface Builder {
    public fun bucket(bucket: String) {
    }

    public fun policyDocument(policyDocument: Any) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3outposts.CfnBucketPolicy.Builder =
        software.amazon.awscdk.services.s3outposts.CfnBucketPolicy.Builder.create(scope, id)

    public override fun bucket(bucket: String) {
      cdkBuilder.bucket(bucket)
    }

    public override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    public fun build(): software.amazon.awscdk.services.s3outposts.CfnBucketPolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBucketPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBucketPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucketPolicy):
        CfnBucketPolicy = CfnBucketPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnBucketPolicy):
        software.amazon.awscdk.services.s3outposts.CfnBucketPolicy = wrapped.cdkObject
  }
}
