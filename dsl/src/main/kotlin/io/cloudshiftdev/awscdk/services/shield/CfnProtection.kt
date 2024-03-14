package io.cloudshiftdev.awscdk.services.shield

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProtection internal constructor(
  private val cdkObject: software.amazon.awscdk.services.shield.CfnProtection,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun applicationLayerAutomaticResponseConfiguration(): Any? =
      unwrap(this).getApplicationLayerAutomaticResponseConfiguration()

  public open fun applicationLayerAutomaticResponseConfiguration(`value`: IResolvable) {
    unwrap(this).setApplicationLayerAutomaticResponseConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open
      fun applicationLayerAutomaticResponseConfiguration(`value`: ApplicationLayerAutomaticResponseConfigurationProperty) {
    unwrap(this).setApplicationLayerAutomaticResponseConfiguration(`value`.let(ApplicationLayerAutomaticResponseConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("436e263b50a5a95995a9795ae7db91a9746693576825798754e01d1c72146b89")
  public open
      fun applicationLayerAutomaticResponseConfiguration(`value`: ApplicationLayerAutomaticResponseConfigurationProperty.Builder.() -> Unit):
      Unit =
      applicationLayerAutomaticResponseConfiguration(ApplicationLayerAutomaticResponseConfigurationProperty(`value`))

  public open fun attrProtectionArn(): String = unwrap(this).getAttrProtectionArn()

  public open fun attrProtectionId(): String = unwrap(this).getAttrProtectionId()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun healthCheckArns(): List<String> = unwrap(this).getHealthCheckArns() ?: emptyList()

  public open fun healthCheckArns(`value`: List<String>) {
    unwrap(this).setHealthCheckArns(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun resourceArn(): String = unwrap(this).getResourceArn()

  public open fun resourceArn(`value`: String) {
    unwrap(this).setResourceArn(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public
        fun applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration: IResolvable) {
    }

    public
        fun applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration: ApplicationLayerAutomaticResponseConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ad69ea36018550e2d034dd48646a5d76908c61d6c21a95ea72805d7596bf673")
    public
        fun applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration: ApplicationLayerAutomaticResponseConfigurationProperty.Builder.() -> Unit) {
    }

    public fun healthCheckArns(healthCheckArns: List<String>) {
    }

    public fun name(name: String) {
    }

    public fun resourceArn(resourceArn: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.shield.CfnProtection.Builder =
        software.amazon.awscdk.services.shield.CfnProtection.Builder.create(scope, id)

    public override
        fun applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration: IResolvable) {
      cdkBuilder.applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration.let(IResolvable::unwrap))
    }

    public override
        fun applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration: ApplicationLayerAutomaticResponseConfigurationProperty) {
      cdkBuilder.applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration.let(ApplicationLayerAutomaticResponseConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ad69ea36018550e2d034dd48646a5d76908c61d6c21a95ea72805d7596bf673")
    public override
        fun applicationLayerAutomaticResponseConfiguration(applicationLayerAutomaticResponseConfiguration: ApplicationLayerAutomaticResponseConfigurationProperty.Builder.() -> Unit):
        Unit =
        applicationLayerAutomaticResponseConfiguration(ApplicationLayerAutomaticResponseConfigurationProperty(applicationLayerAutomaticResponseConfiguration))

    public override fun healthCheckArns(healthCheckArns: List<String>) {
      cdkBuilder.healthCheckArns(healthCheckArns)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.shield.CfnProtection = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProtection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProtection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.shield.CfnProtection):
        CfnProtection = CfnProtection(cdkObject)

    internal fun unwrap(wrapped: CfnProtection):
        software.amazon.awscdk.services.shield.CfnProtection = wrapped.cdkObject
  }

  public interface ApplicationLayerAutomaticResponseConfigurationProperty {
    public fun action(): Any

    public fun status(): String

    public interface Builder {
      public fun action(action: IResolvable) {
      }

      public fun action(action: ActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eacdaaffff023b14a9cce4f48634923c2822f0a133865877fdb6951c765f722f")
      public fun action(action: ActionProperty.Builder.() -> Unit) {
      }

      public fun status(status: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.shield.CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.shield.CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty.builder()

      public override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      public override fun action(action: ActionProperty) {
        cdkBuilder.action(action.let(ActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eacdaaffff023b14a9cce4f48634923c2822f0a133865877fdb6951c765f722f")
      public override fun action(action: ActionProperty.Builder.() -> Unit): Unit =
          action(ActionProperty(action))

      public override fun status(status: String) {
        cdkBuilder.status(status)
      }

      public fun build():
          software.amazon.awscdk.services.shield.CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.shield.CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty,
    ) : ApplicationLayerAutomaticResponseConfigurationProperty {
      public override fun action(): Any = unwrap(this).getAction()

      public override fun status(): String = unwrap(this).getStatus()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ApplicationLayerAutomaticResponseConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.shield.CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty):
          ApplicationLayerAutomaticResponseConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ApplicationLayerAutomaticResponseConfigurationProperty):
          software.amazon.awscdk.services.shield.CfnProtection.ApplicationLayerAutomaticResponseConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ActionProperty {
    public fun block(): Any? = unwrap(this).getBlock()

    public fun count(): Any? = unwrap(this).getCount()

    public interface Builder {
      public fun block(block: Any) {
      }

      public fun count(count: Any) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.shield.CfnProtection.ActionProperty.Builder =
          software.amazon.awscdk.services.shield.CfnProtection.ActionProperty.builder()

      public override fun block(block: Any) {
        cdkBuilder.block(block)
      }

      public override fun count(count: Any) {
        cdkBuilder.count(count)
      }

      public fun build(): software.amazon.awscdk.services.shield.CfnProtection.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.shield.CfnProtection.ActionProperty,
    ) : ActionProperty {
      public override fun block(): Any? = unwrap(this).getBlock()

      public override fun count(): Any? = unwrap(this).getCount()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.shield.CfnProtection.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.shield.CfnProtection.ActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
