@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTopicPolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sns.CfnTopicPolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policyDocument(): Any = unwrap(this).getPolicyDocument()

  public open fun policyDocument(`value`: Any) {
    unwrap(this).setPolicyDocument(`value`)
  }

  public open fun topics(): List<String> = unwrap(this).getTopics()

  public open fun topics(`value`: List<String>) {
    unwrap(this).setTopics(`value`)
  }

  public open fun topics(vararg `value`: String): Unit = topics(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun policyDocument(policyDocument: Any)

    public fun topics(topics: List<String>)

    public fun topics(vararg topics: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.CfnTopicPolicy.Builder =
        software.amazon.awscdk.services.sns.CfnTopicPolicy.Builder.create(scope, id)

    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun topics(topics: List<String>) {
      cdkBuilder.topics(topics)
    }

    override fun topics(vararg topics: String): Unit = topics(topics.toList())

    public fun build(): software.amazon.awscdk.services.sns.CfnTopicPolicy = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sns.CfnTopicPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTopicPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTopicPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.CfnTopicPolicy): CfnTopicPolicy
        = CfnTopicPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnTopicPolicy): software.amazon.awscdk.services.sns.CfnTopicPolicy
        = wrapped.cdkObject
  }
}
