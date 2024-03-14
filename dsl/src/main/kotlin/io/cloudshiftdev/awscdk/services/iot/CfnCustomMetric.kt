package io.cloudshiftdev.awscdk.services.iot

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

public open class CfnCustomMetric internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot.CfnCustomMetric,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrMetricArn(): String = unwrap(this).getAttrMetricArn()

  public open fun displayName(): String? = unwrap(this).getDisplayName()

  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun metricName(): String? = unwrap(this).getMetricName()

  public open fun metricName(`value`: String) {
    unwrap(this).setMetricName(`value`)
  }

  public open fun metricType(): String = unwrap(this).getMetricType()

  public open fun metricType(`value`: String) {
    unwrap(this).setMetricType(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun displayName(displayName: String) {
    }

    public fun metricName(metricName: String) {
    }

    public fun metricType(metricType: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnCustomMetric.Builder =
        software.amazon.awscdk.services.iot.CfnCustomMetric.Builder.create(scope, id)

    public override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    public override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    public override fun metricType(metricType: String) {
      cdkBuilder.metricType(metricType)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnCustomMetric = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCustomMetric {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCustomMetric(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnCustomMetric):
        CfnCustomMetric = CfnCustomMetric(cdkObject)

    internal fun unwrap(wrapped: CfnCustomMetric):
        software.amazon.awscdk.services.iot.CfnCustomMetric = wrapped.cdkObject
  }
}
