@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lex

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBotVersion internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lex.CfnBotVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrBotVersion(): String = unwrap(this).getAttrBotVersion()

  public open fun botId(): String = unwrap(this).getBotId()

  public open fun botId(`value`: String) {
    unwrap(this).setBotId(`value`)
  }

  public open fun botVersionLocaleSpecification(): Any =
      unwrap(this).getBotVersionLocaleSpecification()

  public open fun botVersionLocaleSpecification(`value`: IResolvable) {
    unwrap(this).setBotVersionLocaleSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun botVersionLocaleSpecification(__idx_ac66f0: List<Any>) {
    unwrap(this).setBotVersionLocaleSpecification(__idx_ac66f0)
  }

  public open fun botVersionLocaleSpecification(vararg __idx_ac66f0: Any): Unit =
      botVersionLocaleSpecification(__idx_ac66f0.toList())

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun botId(botId: String)

    public fun botVersionLocaleSpecification(botVersionLocaleSpecification: IResolvable)

    public fun botVersionLocaleSpecification(botVersionLocaleSpecification: List<Any>)

    public fun botVersionLocaleSpecification(vararg botVersionLocaleSpecification: Any)

    public fun description(description: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lex.CfnBotVersion.Builder =
        software.amazon.awscdk.services.lex.CfnBotVersion.Builder.create(scope, id)

    override fun botId(botId: String) {
      cdkBuilder.botId(botId)
    }

    override fun botVersionLocaleSpecification(botVersionLocaleSpecification: IResolvable) {
      cdkBuilder.botVersionLocaleSpecification(botVersionLocaleSpecification.let(IResolvable::unwrap))
    }

    override fun botVersionLocaleSpecification(botVersionLocaleSpecification: List<Any>) {
      cdkBuilder.botVersionLocaleSpecification(botVersionLocaleSpecification)
    }

    override fun botVersionLocaleSpecification(vararg botVersionLocaleSpecification: Any): Unit =
        botVersionLocaleSpecification(botVersionLocaleSpecification.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.lex.CfnBotVersion = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lex.CfnBotVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBotVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBotVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotVersion): CfnBotVersion =
        CfnBotVersion(cdkObject)

    internal fun unwrap(wrapped: CfnBotVersion): software.amazon.awscdk.services.lex.CfnBotVersion =
        wrapped.cdkObject
  }

  public interface BotVersionLocaleSpecificationProperty {
    public fun botVersionLocaleDetails(): Any

    public fun localeId(): String

    @CdkDslMarker
    public interface Builder {
      public fun botVersionLocaleDetails(botVersionLocaleDetails: IResolvable)

      public fun botVersionLocaleDetails(botVersionLocaleDetails: BotVersionLocaleDetailsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("86d58c78ffe488c4ee3550cb7a85c66edcf765197baeb36ebbc9f8ac86dfee63")
      public
          fun botVersionLocaleDetails(botVersionLocaleDetails: BotVersionLocaleDetailsProperty.Builder.() -> Unit)

      public fun localeId(localeId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleSpecificationProperty.builder()

      override fun botVersionLocaleDetails(botVersionLocaleDetails: IResolvable) {
        cdkBuilder.botVersionLocaleDetails(botVersionLocaleDetails.let(IResolvable::unwrap))
      }

      override
          fun botVersionLocaleDetails(botVersionLocaleDetails: BotVersionLocaleDetailsProperty) {
        cdkBuilder.botVersionLocaleDetails(botVersionLocaleDetails.let(BotVersionLocaleDetailsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("86d58c78ffe488c4ee3550cb7a85c66edcf765197baeb36ebbc9f8ac86dfee63")
      override
          fun botVersionLocaleDetails(botVersionLocaleDetails: BotVersionLocaleDetailsProperty.Builder.() -> Unit):
          Unit = botVersionLocaleDetails(BotVersionLocaleDetailsProperty(botVersionLocaleDetails))

      override fun localeId(localeId: String) {
        cdkBuilder.localeId(localeId)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleSpecificationProperty,
    ) : CdkObject(cdkObject), BotVersionLocaleSpecificationProperty {
      override fun botVersionLocaleDetails(): Any = unwrap(this).getBotVersionLocaleDetails()

      override fun localeId(): String = unwrap(this).getLocaleId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          BotVersionLocaleSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleSpecificationProperty):
          BotVersionLocaleSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BotVersionLocaleSpecificationProperty):
          software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleSpecificationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleSpecificationProperty
    }
  }

  public interface BotVersionLocaleDetailsProperty {
    public fun sourceBotVersion(): String

    @CdkDslMarker
    public interface Builder {
      public fun sourceBotVersion(sourceBotVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleDetailsProperty.Builder
          =
          software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleDetailsProperty.builder()

      override fun sourceBotVersion(sourceBotVersion: String) {
        cdkBuilder.sourceBotVersion(sourceBotVersion)
      }

      public fun build():
          software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleDetailsProperty,
    ) : CdkObject(cdkObject), BotVersionLocaleDetailsProperty {
      override fun sourceBotVersion(): String = unwrap(this).getSourceBotVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BotVersionLocaleDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleDetailsProperty):
          BotVersionLocaleDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BotVersionLocaleDetailsProperty):
          software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleDetailsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lex.CfnBotVersion.BotVersionLocaleDetailsProperty
    }
  }
}
