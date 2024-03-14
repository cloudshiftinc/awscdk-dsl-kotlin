package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProvisioningTemplate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot.CfnProvisioningTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrTemplateArn(): String = unwrap(this).getAttrTemplateArn()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun enabled(): Any? = unwrap(this).getEnabled()

  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun preProvisioningHook(): Any? = unwrap(this).getPreProvisioningHook()

  public open fun preProvisioningHook(`value`: IResolvable) {
    unwrap(this).setPreProvisioningHook(`value`.let(IResolvable::unwrap))
  }

  public open fun preProvisioningHook(`value`: ProvisioningHookProperty) {
    unwrap(this).setPreProvisioningHook(`value`.let(ProvisioningHookProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4397a2302134e730129d46ccc8332a13ce0e6443f8af54eebcb65f57e5ec8146")
  public open fun preProvisioningHook(`value`: ProvisioningHookProperty.Builder.() -> Unit): Unit =
      preProvisioningHook(ProvisioningHookProperty(`value`))

  public open fun provisioningRoleArn(): String = unwrap(this).getProvisioningRoleArn()

  public open fun provisioningRoleArn(`value`: String) {
    unwrap(this).setProvisioningRoleArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun templateBody(): String = unwrap(this).getTemplateBody()

  public open fun templateBody(`value`: String) {
    unwrap(this).setTemplateBody(`value`)
  }

  public open fun templateName(): String? = unwrap(this).getTemplateName()

  public open fun templateName(`value`: String) {
    unwrap(this).setTemplateName(`value`)
  }

  public open fun templateType(): String? = unwrap(this).getTemplateType()

  public open fun templateType(`value`: String) {
    unwrap(this).setTemplateType(`value`)
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun enabled(enabled: Boolean) {
    }

    public fun enabled(enabled: IResolvable) {
    }

    public fun preProvisioningHook(preProvisioningHook: IResolvable) {
    }

    public fun preProvisioningHook(preProvisioningHook: ProvisioningHookProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("859854171f55f7301674cd68e0ca7c8cae08b6697bf440a98b5295633c0c207e")
    public
        fun preProvisioningHook(preProvisioningHook: ProvisioningHookProperty.Builder.() -> Unit) {
    }

    public fun provisioningRoleArn(provisioningRoleArn: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun templateBody(templateBody: String) {
    }

    public fun templateName(templateName: String) {
    }

    public fun templateType(templateType: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnProvisioningTemplate.Builder =
        software.amazon.awscdk.services.iot.CfnProvisioningTemplate.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    public override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    public override fun preProvisioningHook(preProvisioningHook: IResolvable) {
      cdkBuilder.preProvisioningHook(preProvisioningHook.let(IResolvable::unwrap))
    }

    public override fun preProvisioningHook(preProvisioningHook: ProvisioningHookProperty) {
      cdkBuilder.preProvisioningHook(preProvisioningHook.let(ProvisioningHookProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("859854171f55f7301674cd68e0ca7c8cae08b6697bf440a98b5295633c0c207e")
    public override
        fun preProvisioningHook(preProvisioningHook: ProvisioningHookProperty.Builder.() -> Unit):
        Unit = preProvisioningHook(ProvisioningHookProperty(preProvisioningHook))

    public override fun provisioningRoleArn(provisioningRoleArn: String) {
      cdkBuilder.provisioningRoleArn(provisioningRoleArn)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun templateBody(templateBody: String) {
      cdkBuilder.templateBody(templateBody)
    }

    public override fun templateName(templateName: String) {
      cdkBuilder.templateName(templateName)
    }

    public override fun templateType(templateType: String) {
      cdkBuilder.templateType(templateType)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnProvisioningTemplate =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProvisioningTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProvisioningTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnProvisioningTemplate):
        CfnProvisioningTemplate = CfnProvisioningTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnProvisioningTemplate):
        software.amazon.awscdk.services.iot.CfnProvisioningTemplate = wrapped.cdkObject
  }

  public interface ProvisioningHookProperty {
    public fun payloadVersion(): String? = unwrap(this).getPayloadVersion()

    public fun targetArn(): String? = unwrap(this).getTargetArn()

    public interface Builder {
      public fun payloadVersion(payloadVersion: String) {
      }

      public fun targetArn(targetArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty.builder()

      public override fun payloadVersion(payloadVersion: String) {
        cdkBuilder.payloadVersion(payloadVersion)
      }

      public override fun targetArn(targetArn: String) {
        cdkBuilder.targetArn(targetArn)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty,
    ) : ProvisioningHookProperty {
      public override fun payloadVersion(): String? = unwrap(this).getPayloadVersion()

      public override fun targetArn(): String? = unwrap(this).getTargetArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProvisioningHookProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty):
          ProvisioningHookProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisioningHookProperty):
          software.amazon.awscdk.services.iot.CfnProvisioningTemplate.ProvisioningHookProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
