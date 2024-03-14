package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAggregationAuthorization internal constructor(
  private val cdkObject: software.amazon.awscdk.services.config.CfnAggregationAuthorization,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrAggregationAuthorizationArn(): String =
      unwrap(this).getAttrAggregationAuthorizationArn()

  public open fun authorizedAccountId(): String = unwrap(this).getAuthorizedAccountId()

  public open fun authorizedAccountId(`value`: String) {
    unwrap(this).setAuthorizedAccountId(`value`)
  }

  public open fun authorizedAwsRegion(): String = unwrap(this).getAuthorizedAwsRegion()

  public open fun authorizedAwsRegion(`value`: String) {
    unwrap(this).setAuthorizedAwsRegion(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun authorizedAccountId(authorizedAccountId: String)

    public fun authorizedAwsRegion(authorizedAwsRegion: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CfnAggregationAuthorization.Builder =
        software.amazon.awscdk.services.config.CfnAggregationAuthorization.Builder.create(scope, id)

    override fun authorizedAccountId(authorizedAccountId: String) {
      cdkBuilder.authorizedAccountId(authorizedAccountId)
    }

    override fun authorizedAwsRegion(authorizedAwsRegion: String) {
      cdkBuilder.authorizedAwsRegion(authorizedAwsRegion)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.config.CfnAggregationAuthorization =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAggregationAuthorization {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAggregationAuthorization(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.config.CfnAggregationAuthorization):
        CfnAggregationAuthorization = CfnAggregationAuthorization(cdkObject)

    internal fun unwrap(wrapped: CfnAggregationAuthorization):
        software.amazon.awscdk.services.config.CfnAggregationAuthorization = wrapped.cdkObject
  }
}
