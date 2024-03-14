package io.cloudshiftdev.awscdk.services.databrew

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

public open class CfnSchedule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.databrew.CfnSchedule,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun cronExpression(): String = unwrap(this).getCronExpression()

  public open fun cronExpression(`value`: String) {
    unwrap(this).setCronExpression(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun jobNames(): List<String> = unwrap(this).getJobNames() ?: emptyList()

  public open fun jobNames(`value`: List<String>) {
    unwrap(this).setJobNames(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun cronExpression(cronExpression: String)

    public fun jobNames(jobNames: List<String>)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnSchedule.Builder =
        software.amazon.awscdk.services.databrew.CfnSchedule.Builder.create(scope, id)

    override fun cronExpression(cronExpression: String) {
      cdkBuilder.cronExpression(cronExpression)
    }

    override fun jobNames(jobNames: List<String>) {
      cdkBuilder.jobNames(jobNames)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.databrew.CfnSchedule = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSchedule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSchedule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnSchedule): CfnSchedule
        = CfnSchedule(cdkObject)

    internal fun unwrap(wrapped: CfnSchedule): software.amazon.awscdk.services.databrew.CfnSchedule
        = wrapped.cdkObject
  }
}