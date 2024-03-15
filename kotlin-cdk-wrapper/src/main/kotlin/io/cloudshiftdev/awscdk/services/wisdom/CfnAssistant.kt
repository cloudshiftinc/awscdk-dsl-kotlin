@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wisdom

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAssistant internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.wisdom.CfnAssistant,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrAssistantArn(): String = unwrap(this).getAttrAssistantArn()

  public open fun attrAssistantId(): String = unwrap(this).getAttrAssistantId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun serverSideEncryptionConfiguration(): Any? =
      unwrap(this).getServerSideEncryptionConfiguration()

  public open fun serverSideEncryptionConfiguration(`value`: IResolvable) {
    unwrap(this).setServerSideEncryptionConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun serverSideEncryptionConfiguration(`value`: ServerSideEncryptionConfigurationProperty) {
    unwrap(this).setServerSideEncryptionConfiguration(`value`.let(ServerSideEncryptionConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("12f58c1f353a9ee7b8ea01860f1a9b615dcb95701311a5a7e183ff0f756b7ce3")
  public open
      fun serverSideEncryptionConfiguration(`value`: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
      Unit = serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable)

    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b927a22fbcb8f1bd706654383d90ea62756fa45306ce7b09c58424394d9ceba4")
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnAssistant.Builder =
        software.amazon.awscdk.services.wisdom.CfnAssistant.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(IResolvable::unwrap))
    }

    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(ServerSideEncryptionConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b927a22fbcb8f1bd706654383d90ea62756fa45306ce7b09c58424394d9ceba4")
    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty(serverSideEncryptionConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.wisdom.CfnAssistant = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.wisdom.CfnAssistant.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAssistant {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAssistant(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAssistant): CfnAssistant
        = CfnAssistant(cdkObject)

    internal fun unwrap(wrapped: CfnAssistant): software.amazon.awscdk.services.wisdom.CfnAssistant
        = wrapped.cdkObject
  }

  public interface ServerSideEncryptionConfigurationProperty {
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    @CdkDslMarker
    public interface Builder {
      public fun kmsKeyId(kmsKeyId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wisdom.CfnAssistant.ServerSideEncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.wisdom.CfnAssistant.ServerSideEncryptionConfigurationProperty.builder()

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      public fun build():
          software.amazon.awscdk.services.wisdom.CfnAssistant.ServerSideEncryptionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.wisdom.CfnAssistant.ServerSideEncryptionConfigurationProperty,
    ) : CdkObject(cdkObject), ServerSideEncryptionConfigurationProperty {
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServerSideEncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAssistant.ServerSideEncryptionConfigurationProperty):
          ServerSideEncryptionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerSideEncryptionConfigurationProperty):
          software.amazon.awscdk.services.wisdom.CfnAssistant.ServerSideEncryptionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.wisdom.CfnAssistant.ServerSideEncryptionConfigurationProperty
    }
  }
}