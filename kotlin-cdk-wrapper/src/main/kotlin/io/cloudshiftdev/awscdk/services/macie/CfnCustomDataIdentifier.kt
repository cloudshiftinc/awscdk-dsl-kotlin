@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.macie

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCustomDataIdentifier internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.macie.CfnCustomDataIdentifier,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun ignoreWords(): List<String> = unwrap(this).getIgnoreWords() ?: emptyList()

  public open fun ignoreWords(`value`: List<String>) {
    unwrap(this).setIgnoreWords(`value`)
  }

  public open fun ignoreWords(vararg `value`: String): Unit = ignoreWords(`value`.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun keywords(): List<String> = unwrap(this).getKeywords() ?: emptyList()

  public open fun keywords(`value`: List<String>) {
    unwrap(this).setKeywords(`value`)
  }

  public open fun keywords(vararg `value`: String): Unit = keywords(`value`.toList())

  public open fun maximumMatchDistance(): Number? = unwrap(this).getMaximumMatchDistance()

  public open fun maximumMatchDistance(`value`: Number) {
    unwrap(this).setMaximumMatchDistance(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun regex(): String = unwrap(this).getRegex()

  public open fun regex(`value`: String) {
    unwrap(this).setRegex(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun ignoreWords(ignoreWords: List<String>)

    public fun ignoreWords(vararg ignoreWords: String)

    public fun keywords(keywords: List<String>)

    public fun keywords(vararg keywords: String)

    public fun maximumMatchDistance(maximumMatchDistance: Number)

    public fun name(name: String)

    public fun regex(regex: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.macie.CfnCustomDataIdentifier.Builder =
        software.amazon.awscdk.services.macie.CfnCustomDataIdentifier.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun ignoreWords(ignoreWords: List<String>) {
      cdkBuilder.ignoreWords(ignoreWords)
    }

    override fun ignoreWords(vararg ignoreWords: String): Unit = ignoreWords(ignoreWords.toList())

    override fun keywords(keywords: List<String>) {
      cdkBuilder.keywords(keywords)
    }

    override fun keywords(vararg keywords: String): Unit = keywords(keywords.toList())

    override fun maximumMatchDistance(maximumMatchDistance: Number) {
      cdkBuilder.maximumMatchDistance(maximumMatchDistance)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun regex(regex: String) {
      cdkBuilder.regex(regex)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.macie.CfnCustomDataIdentifier =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.macie.CfnCustomDataIdentifier.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCustomDataIdentifier {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCustomDataIdentifier(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.macie.CfnCustomDataIdentifier):
        CfnCustomDataIdentifier = CfnCustomDataIdentifier(cdkObject)

    internal fun unwrap(wrapped: CfnCustomDataIdentifier):
        software.amazon.awscdk.services.macie.CfnCustomDataIdentifier = wrapped.cdkObject
  }
}
