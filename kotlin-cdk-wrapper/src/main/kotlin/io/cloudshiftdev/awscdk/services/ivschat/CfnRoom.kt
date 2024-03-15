@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivschat

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRoom internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ivschat.CfnRoom,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun loggingConfigurationIdentifiers(): List<String> =
      unwrap(this).getLoggingConfigurationIdentifiers() ?: emptyList()

  public open fun loggingConfigurationIdentifiers(`value`: List<String>) {
    unwrap(this).setLoggingConfigurationIdentifiers(`value`)
  }

  public open fun loggingConfigurationIdentifiers(vararg `value`: String): Unit =
      loggingConfigurationIdentifiers(`value`.toList())

  public open fun maximumMessageLength(): Number? = unwrap(this).getMaximumMessageLength()

  public open fun maximumMessageLength(`value`: Number) {
    unwrap(this).setMaximumMessageLength(`value`)
  }

  public open fun maximumMessageRatePerSecond(): Number? =
      unwrap(this).getMaximumMessageRatePerSecond()

  public open fun maximumMessageRatePerSecond(`value`: Number) {
    unwrap(this).setMaximumMessageRatePerSecond(`value`)
  }

  public open fun messageReviewHandler(): Any? = unwrap(this).getMessageReviewHandler()

  public open fun messageReviewHandler(`value`: IResolvable) {
    unwrap(this).setMessageReviewHandler(`value`.let(IResolvable::unwrap))
  }

  public open fun messageReviewHandler(`value`: MessageReviewHandlerProperty) {
    unwrap(this).setMessageReviewHandler(`value`.let(MessageReviewHandlerProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0e29e2644e41e61c4918568854141c919460123dfe0df4cbd64ae77718ca4c93")
  public open fun messageReviewHandler(`value`: MessageReviewHandlerProperty.Builder.() -> Unit):
      Unit = messageReviewHandler(MessageReviewHandlerProperty(`value`))

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun loggingConfigurationIdentifiers(loggingConfigurationIdentifiers: List<String>)

    public fun loggingConfigurationIdentifiers(vararg loggingConfigurationIdentifiers: String)

    public fun maximumMessageLength(maximumMessageLength: Number)

    public fun maximumMessageRatePerSecond(maximumMessageRatePerSecond: Number)

    public fun messageReviewHandler(messageReviewHandler: IResolvable)

    public fun messageReviewHandler(messageReviewHandler: MessageReviewHandlerProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e81b16974c7ad0a6acdf5a37615c7459552040bc7b0daa1c70fc56505d6925b")
    public
        fun messageReviewHandler(messageReviewHandler: MessageReviewHandlerProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivschat.CfnRoom.Builder =
        software.amazon.awscdk.services.ivschat.CfnRoom.Builder.create(scope, id)

    override fun loggingConfigurationIdentifiers(loggingConfigurationIdentifiers: List<String>) {
      cdkBuilder.loggingConfigurationIdentifiers(loggingConfigurationIdentifiers)
    }

    override fun loggingConfigurationIdentifiers(vararg loggingConfigurationIdentifiers: String):
        Unit = loggingConfigurationIdentifiers(loggingConfigurationIdentifiers.toList())

    override fun maximumMessageLength(maximumMessageLength: Number) {
      cdkBuilder.maximumMessageLength(maximumMessageLength)
    }

    override fun maximumMessageRatePerSecond(maximumMessageRatePerSecond: Number) {
      cdkBuilder.maximumMessageRatePerSecond(maximumMessageRatePerSecond)
    }

    override fun messageReviewHandler(messageReviewHandler: IResolvable) {
      cdkBuilder.messageReviewHandler(messageReviewHandler.let(IResolvable::unwrap))
    }

    override fun messageReviewHandler(messageReviewHandler: MessageReviewHandlerProperty) {
      cdkBuilder.messageReviewHandler(messageReviewHandler.let(MessageReviewHandlerProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e81b16974c7ad0a6acdf5a37615c7459552040bc7b0daa1c70fc56505d6925b")
    override
        fun messageReviewHandler(messageReviewHandler: MessageReviewHandlerProperty.Builder.() -> Unit):
        Unit = messageReviewHandler(MessageReviewHandlerProperty(messageReviewHandler))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ivschat.CfnRoom = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ivschat.CfnRoom.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRoom {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRoom(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivschat.CfnRoom): CfnRoom =
        CfnRoom(cdkObject)

    internal fun unwrap(wrapped: CfnRoom): software.amazon.awscdk.services.ivschat.CfnRoom =
        wrapped.cdkObject
  }

  public interface MessageReviewHandlerProperty {
    public fun fallbackResult(): String? = unwrap(this).getFallbackResult()

    public fun uri(): String? = unwrap(this).getUri()

    @CdkDslMarker
    public interface Builder {
      public fun fallbackResult(fallbackResult: String)

      public fun uri(uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ivschat.CfnRoom.MessageReviewHandlerProperty.Builder =
          software.amazon.awscdk.services.ivschat.CfnRoom.MessageReviewHandlerProperty.builder()

      override fun fallbackResult(fallbackResult: String) {
        cdkBuilder.fallbackResult(fallbackResult)
      }

      override fun uri(uri: String) {
        cdkBuilder.uri(uri)
      }

      public fun build():
          software.amazon.awscdk.services.ivschat.CfnRoom.MessageReviewHandlerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ivschat.CfnRoom.MessageReviewHandlerProperty,
    ) : CdkObject(cdkObject), MessageReviewHandlerProperty {
      override fun fallbackResult(): String? = unwrap(this).getFallbackResult()

      override fun uri(): String? = unwrap(this).getUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MessageReviewHandlerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ivschat.CfnRoom.MessageReviewHandlerProperty):
          MessageReviewHandlerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MessageReviewHandlerProperty):
          software.amazon.awscdk.services.ivschat.CfnRoom.MessageReviewHandlerProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ivschat.CfnRoom.MessageReviewHandlerProperty
    }
  }
}
