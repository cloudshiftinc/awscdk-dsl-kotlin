@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediatailor

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVodSource internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.mediatailor.CfnVodSource,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun httpPackageConfigurations(): Any = unwrap(this).getHttpPackageConfigurations()

  public open fun httpPackageConfigurations(`value`: IResolvable) {
    unwrap(this).setHttpPackageConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun httpPackageConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setHttpPackageConfigurations(__idx_ac66f0)
  }

  public open fun httpPackageConfigurations(vararg __idx_ac66f0: Any): Unit =
      httpPackageConfigurations(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun sourceLocationName(): String = unwrap(this).getSourceLocationName()

  public open fun sourceLocationName(`value`: String) {
    unwrap(this).setSourceLocationName(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  public open fun vodSourceName(): String = unwrap(this).getVodSourceName()

  public open fun vodSourceName(`value`: String) {
    unwrap(this).setVodSourceName(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun httpPackageConfigurations(httpPackageConfigurations: IResolvable)

    public fun httpPackageConfigurations(httpPackageConfigurations: List<Any>)

    public fun httpPackageConfigurations(vararg httpPackageConfigurations: Any)

    public fun sourceLocationName(sourceLocationName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vodSourceName(vodSourceName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediatailor.CfnVodSource.Builder =
        software.amazon.awscdk.services.mediatailor.CfnVodSource.Builder.create(scope, id)

    override fun httpPackageConfigurations(httpPackageConfigurations: IResolvable) {
      cdkBuilder.httpPackageConfigurations(httpPackageConfigurations.let(IResolvable::unwrap))
    }

    override fun httpPackageConfigurations(httpPackageConfigurations: List<Any>) {
      cdkBuilder.httpPackageConfigurations(httpPackageConfigurations)
    }

    override fun httpPackageConfigurations(vararg httpPackageConfigurations: Any): Unit =
        httpPackageConfigurations(httpPackageConfigurations.toList())

    override fun sourceLocationName(sourceLocationName: String) {
      cdkBuilder.sourceLocationName(sourceLocationName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vodSourceName(vodSourceName: String) {
      cdkBuilder.vodSourceName(vodSourceName)
    }

    public fun build(): software.amazon.awscdk.services.mediatailor.CfnVodSource =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediatailor.CfnVodSource.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVodSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVodSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnVodSource):
        CfnVodSource = CfnVodSource(cdkObject)

    internal fun unwrap(wrapped: CfnVodSource):
        software.amazon.awscdk.services.mediatailor.CfnVodSource = wrapped.cdkObject
  }

  public interface HttpPackageConfigurationProperty {
    public fun path(): String

    public fun sourceGroup(): String

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun path(path: String)

      public fun sourceGroup(sourceGroup: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediatailor.CfnVodSource.HttpPackageConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediatailor.CfnVodSource.HttpPackageConfigurationProperty.builder()

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      override fun sourceGroup(sourceGroup: String) {
        cdkBuilder.sourceGroup(sourceGroup)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.mediatailor.CfnVodSource.HttpPackageConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.mediatailor.CfnVodSource.HttpPackageConfigurationProperty,
    ) : CdkObject(cdkObject), HttpPackageConfigurationProperty {
      override fun path(): String = unwrap(this).getPath()

      override fun sourceGroup(): String = unwrap(this).getSourceGroup()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HttpPackageConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnVodSource.HttpPackageConfigurationProperty):
          HttpPackageConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HttpPackageConfigurationProperty):
          software.amazon.awscdk.services.mediatailor.CfnVodSource.HttpPackageConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediatailor.CfnVodSource.HttpPackageConfigurationProperty
    }
  }
}