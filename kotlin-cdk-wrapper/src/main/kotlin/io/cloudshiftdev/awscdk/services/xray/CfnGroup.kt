@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.xray

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.xray.CfnGroup,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrGroupArn(): String = unwrap(this).getAttrGroupArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun filterExpression(): String? = unwrap(this).getFilterExpression()

  public open fun filterExpression(`value`: String) {
    unwrap(this).setFilterExpression(`value`)
  }

  public open fun groupName(): String = unwrap(this).getGroupName()

  public open fun groupName(`value`: String) {
    unwrap(this).setGroupName(`value`)
  }

  public open fun insightsConfiguration(): Any? = unwrap(this).getInsightsConfiguration()

  public open fun insightsConfiguration(`value`: IResolvable) {
    unwrap(this).setInsightsConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun insightsConfiguration(`value`: InsightsConfigurationProperty) {
    unwrap(this).setInsightsConfiguration(`value`.let(InsightsConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6e7a1b1ee0c528a291571125f084fe3f352b6eee004c646e010cd75b4d911253")
  public open fun insightsConfiguration(`value`: InsightsConfigurationProperty.Builder.() -> Unit):
      Unit = insightsConfiguration(InsightsConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun filterExpression(filterExpression: String)

    public fun groupName(groupName: String)

    public fun insightsConfiguration(insightsConfiguration: IResolvable)

    public fun insightsConfiguration(insightsConfiguration: InsightsConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e14f6cec07b18027436bd71c2f8cbcc7699546fea0b70fd3021cfc68390e860")
    public
        fun insightsConfiguration(insightsConfiguration: InsightsConfigurationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.xray.CfnGroup.Builder =
        software.amazon.awscdk.services.xray.CfnGroup.Builder.create(scope, id)

    override fun filterExpression(filterExpression: String) {
      cdkBuilder.filterExpression(filterExpression)
    }

    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    override fun insightsConfiguration(insightsConfiguration: IResolvable) {
      cdkBuilder.insightsConfiguration(insightsConfiguration.let(IResolvable::unwrap))
    }

    override fun insightsConfiguration(insightsConfiguration: InsightsConfigurationProperty) {
      cdkBuilder.insightsConfiguration(insightsConfiguration.let(InsightsConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e14f6cec07b18027436bd71c2f8cbcc7699546fea0b70fd3021cfc68390e860")
    override
        fun insightsConfiguration(insightsConfiguration: InsightsConfigurationProperty.Builder.() -> Unit):
        Unit = insightsConfiguration(InsightsConfigurationProperty(insightsConfiguration))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.xray.CfnGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.xray.CfnGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnGroup): CfnGroup =
        CfnGroup(cdkObject)

    internal fun unwrap(wrapped: CfnGroup): software.amazon.awscdk.services.xray.CfnGroup =
        wrapped.cdkObject
  }

  public interface InsightsConfigurationProperty {
    public fun insightsEnabled(): Any? = unwrap(this).getInsightsEnabled()

    public fun notificationsEnabled(): Any? = unwrap(this).getNotificationsEnabled()

    @CdkDslMarker
    public interface Builder {
      public fun insightsEnabled(insightsEnabled: Boolean)

      public fun insightsEnabled(insightsEnabled: IResolvable)

      public fun notificationsEnabled(notificationsEnabled: Boolean)

      public fun notificationsEnabled(notificationsEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.xray.CfnGroup.InsightsConfigurationProperty.Builder =
          software.amazon.awscdk.services.xray.CfnGroup.InsightsConfigurationProperty.builder()

      override fun insightsEnabled(insightsEnabled: Boolean) {
        cdkBuilder.insightsEnabled(insightsEnabled)
      }

      override fun insightsEnabled(insightsEnabled: IResolvable) {
        cdkBuilder.insightsEnabled(insightsEnabled.let(IResolvable::unwrap))
      }

      override fun notificationsEnabled(notificationsEnabled: Boolean) {
        cdkBuilder.notificationsEnabled(notificationsEnabled)
      }

      override fun notificationsEnabled(notificationsEnabled: IResolvable) {
        cdkBuilder.notificationsEnabled(notificationsEnabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.xray.CfnGroup.InsightsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.xray.CfnGroup.InsightsConfigurationProperty,
    ) : CdkObject(cdkObject), InsightsConfigurationProperty {
      override fun insightsEnabled(): Any? = unwrap(this).getInsightsEnabled()

      override fun notificationsEnabled(): Any? = unwrap(this).getNotificationsEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InsightsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.xray.CfnGroup.InsightsConfigurationProperty):
          InsightsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InsightsConfigurationProperty):
          software.amazon.awscdk.services.xray.CfnGroup.InsightsConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.xray.CfnGroup.InsightsConfigurationProperty
    }
  }
}
