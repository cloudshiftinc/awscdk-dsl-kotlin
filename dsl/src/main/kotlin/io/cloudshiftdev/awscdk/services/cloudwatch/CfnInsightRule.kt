package io.cloudshiftdev.awscdk.services.cloudwatch

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

public open class CfnInsightRule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnInsightRule,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrRuleName(): String = unwrap(this).getAttrRuleName()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ruleBody(): String = unwrap(this).getRuleBody()

  public open fun ruleBody(`value`: String) {
    unwrap(this).setRuleBody(`value`)
  }

  public open fun ruleName(): String = unwrap(this).getRuleName()

  public open fun ruleName(`value`: String) {
    unwrap(this).setRuleName(`value`)
  }

  public open fun ruleState(): String = unwrap(this).getRuleState()

  public open fun ruleState(`value`: String) {
    unwrap(this).setRuleState(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun ruleBody(ruleBody: String)

    public fun ruleName(ruleName: String)

    public fun ruleState(ruleState: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CfnInsightRule.Builder =
        software.amazon.awscdk.services.cloudwatch.CfnInsightRule.Builder.create(scope, id)

    override fun ruleBody(ruleBody: String) {
      cdkBuilder.ruleBody(ruleBody)
    }

    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    override fun ruleState(ruleState: String) {
      cdkBuilder.ruleState(ruleState)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.CfnInsightRule =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInsightRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInsightRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnInsightRule):
        CfnInsightRule = CfnInsightRule(cdkObject)

    internal fun unwrap(wrapped: CfnInsightRule):
        software.amazon.awscdk.services.cloudwatch.CfnInsightRule = wrapped.cdkObject
  }
}
