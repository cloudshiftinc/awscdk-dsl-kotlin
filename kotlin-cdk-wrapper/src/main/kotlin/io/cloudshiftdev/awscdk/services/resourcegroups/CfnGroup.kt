@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.resourcegroups

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

public open class CfnGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.resourcegroups.CfnGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun configuration(): Any? = unwrap(this).getConfiguration()

  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun configuration(__idx_ac66f0: List<Any>) {
    unwrap(this).setConfiguration(__idx_ac66f0)
  }

  public open fun configuration(vararg __idx_ac66f0: Any): Unit =
      configuration(__idx_ac66f0.toList())

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

  public open fun resourceQuery(): Any? = unwrap(this).getResourceQuery()

  public open fun resourceQuery(`value`: IResolvable) {
    unwrap(this).setResourceQuery(`value`.let(IResolvable::unwrap))
  }

  public open fun resourceQuery(`value`: ResourceQueryProperty) {
    unwrap(this).setResourceQuery(`value`.let(ResourceQueryProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d8ee51f4d4d8442631a9f5c118f7e42605a7ed23d6022c31e00a498e95d9b2a0")
  public open fun resourceQuery(`value`: ResourceQueryProperty.Builder.() -> Unit): Unit =
      resourceQuery(ResourceQueryProperty(`value`))

  public open fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

  public open fun resources(`value`: List<String>) {
    unwrap(this).setResources(`value`)
  }

  public open fun resources(vararg `value`: String): Unit = resources(`value`.toList())

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun configuration(configuration: IResolvable)

    public fun configuration(configuration: List<Any>)

    public fun configuration(vararg configuration: Any)

    public fun description(description: String)

    public fun name(name: String)

    public fun resourceQuery(resourceQuery: IResolvable)

    public fun resourceQuery(resourceQuery: ResourceQueryProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4732f3df54ba438975b7e4ed5106216fc121d4b1ec4be1eb1d1162caa68037ab")
    public fun resourceQuery(resourceQuery: ResourceQueryProperty.Builder.() -> Unit)

    public fun resources(resources: List<String>)

    public fun resources(vararg resources: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.resourcegroups.CfnGroup.Builder =
        software.amazon.awscdk.services.resourcegroups.CfnGroup.Builder.create(scope, id)

    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    override fun configuration(configuration: List<Any>) {
      cdkBuilder.configuration(configuration)
    }

    override fun configuration(vararg configuration: Any): Unit =
        configuration(configuration.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun resourceQuery(resourceQuery: IResolvable) {
      cdkBuilder.resourceQuery(resourceQuery.let(IResolvable::unwrap))
    }

    override fun resourceQuery(resourceQuery: ResourceQueryProperty) {
      cdkBuilder.resourceQuery(resourceQuery.let(ResourceQueryProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4732f3df54ba438975b7e4ed5106216fc121d4b1ec4be1eb1d1162caa68037ab")
    override fun resourceQuery(resourceQuery: ResourceQueryProperty.Builder.() -> Unit): Unit =
        resourceQuery(ResourceQueryProperty(resourceQuery))

    override fun resources(resources: List<String>) {
      cdkBuilder.resources(resources)
    }

    override fun resources(vararg resources: String): Unit = resources(resources.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.resourcegroups.CfnGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.resourcegroups.CfnGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.resourcegroups.CfnGroup): CfnGroup
        = CfnGroup(cdkObject)

    internal fun unwrap(wrapped: CfnGroup): software.amazon.awscdk.services.resourcegroups.CfnGroup
        = wrapped.cdkObject
  }

  public interface ResourceQueryProperty {
    public fun query(): Any? = unwrap(this).getQuery()

    public fun type(): String? = unwrap(this).getType()

    @CdkDslMarker
    public interface Builder {
      public fun query(query: IResolvable)

      public fun query(query: QueryProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5f4652e493f93af8130a6eb2ac9332223eea6a60935ee3b8c65ab7fae91ec69")
      public fun query(query: QueryProperty.Builder.() -> Unit)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ResourceQueryProperty.Builder =
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ResourceQueryProperty.builder()

      override fun query(query: IResolvable) {
        cdkBuilder.query(query.let(IResolvable::unwrap))
      }

      override fun query(query: QueryProperty) {
        cdkBuilder.query(query.let(QueryProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d5f4652e493f93af8130a6eb2ac9332223eea6a60935ee3b8c65ab7fae91ec69")
      override fun query(query: QueryProperty.Builder.() -> Unit): Unit =
          query(QueryProperty(query))

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ResourceQueryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ResourceQueryProperty,
    ) : CdkObject(cdkObject), ResourceQueryProperty {
      override fun query(): Any? = unwrap(this).getQuery()

      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceQueryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resourcegroups.CfnGroup.ResourceQueryProperty):
          ResourceQueryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceQueryProperty):
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ResourceQueryProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ResourceQueryProperty
    }
  }

  public interface QueryProperty {
    public fun resourceTypeFilters(): List<String> = unwrap(this).getResourceTypeFilters() ?:
        emptyList()

    public fun stackIdentifier(): String? = unwrap(this).getStackIdentifier()

    public fun tagFilters(): Any? = unwrap(this).getTagFilters()

    @CdkDslMarker
    public interface Builder {
      public fun resourceTypeFilters(resourceTypeFilters: List<String>)

      public fun resourceTypeFilters(vararg resourceTypeFilters: String)

      public fun stackIdentifier(stackIdentifier: String)

      public fun tagFilters(tagFilters: IResolvable)

      public fun tagFilters(tagFilters: List<Any>)

      public fun tagFilters(vararg tagFilters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resourcegroups.CfnGroup.QueryProperty.Builder =
          software.amazon.awscdk.services.resourcegroups.CfnGroup.QueryProperty.builder()

      override fun resourceTypeFilters(resourceTypeFilters: List<String>) {
        cdkBuilder.resourceTypeFilters(resourceTypeFilters)
      }

      override fun resourceTypeFilters(vararg resourceTypeFilters: String): Unit =
          resourceTypeFilters(resourceTypeFilters.toList())

      override fun stackIdentifier(stackIdentifier: String) {
        cdkBuilder.stackIdentifier(stackIdentifier)
      }

      override fun tagFilters(tagFilters: IResolvable) {
        cdkBuilder.tagFilters(tagFilters.let(IResolvable::unwrap))
      }

      override fun tagFilters(tagFilters: List<Any>) {
        cdkBuilder.tagFilters(tagFilters)
      }

      override fun tagFilters(vararg tagFilters: Any): Unit = tagFilters(tagFilters.toList())

      public fun build(): software.amazon.awscdk.services.resourcegroups.CfnGroup.QueryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.resourcegroups.CfnGroup.QueryProperty,
    ) : CdkObject(cdkObject), QueryProperty {
      override fun resourceTypeFilters(): List<String> = unwrap(this).getResourceTypeFilters() ?:
          emptyList()

      override fun stackIdentifier(): String? = unwrap(this).getStackIdentifier()

      override fun tagFilters(): Any? = unwrap(this).getTagFilters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): QueryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resourcegroups.CfnGroup.QueryProperty):
          QueryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: QueryProperty):
          software.amazon.awscdk.services.resourcegroups.CfnGroup.QueryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.resourcegroups.CfnGroup.QueryProperty
    }
  }

  public interface TagFilterProperty {
    public fun key(): String? = unwrap(this).getKey()

    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun values(values: List<String>)

      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resourcegroups.CfnGroup.TagFilterProperty.Builder =
          software.amazon.awscdk.services.resourcegroups.CfnGroup.TagFilterProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build(): software.amazon.awscdk.services.resourcegroups.CfnGroup.TagFilterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.resourcegroups.CfnGroup.TagFilterProperty,
    ) : CdkObject(cdkObject), TagFilterProperty {
      override fun key(): String? = unwrap(this).getKey()

      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resourcegroups.CfnGroup.TagFilterProperty):
          TagFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagFilterProperty):
          software.amazon.awscdk.services.resourcegroups.CfnGroup.TagFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.resourcegroups.CfnGroup.TagFilterProperty
    }
  }

  public interface ConfigurationItemProperty {
    public fun parameters(): Any? = unwrap(this).getParameters()

    public fun type(): String? = unwrap(this).getType()

    @CdkDslMarker
    public interface Builder {
      public fun parameters(parameters: IResolvable)

      public fun parameters(parameters: List<Any>)

      public fun parameters(vararg parameters: Any)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationItemProperty.Builder
          =
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationItemProperty.builder()

      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      override fun parameters(parameters: List<Any>) {
        cdkBuilder.parameters(parameters)
      }

      override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationItemProperty,
    ) : CdkObject(cdkObject), ConfigurationItemProperty {
      override fun parameters(): Any? = unwrap(this).getParameters()

      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationItemProperty):
          ConfigurationItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationItemProperty):
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationItemProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationItemProperty
    }
  }

  public interface ConfigurationParameterProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun values(values: List<String>)

      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationParameterProperty.Builder
          =
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationParameterProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationParameterProperty,
    ) : CdkObject(cdkObject), ConfigurationParameterProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationParameterProperty):
          ConfigurationParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigurationParameterProperty):
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.resourcegroups.CfnGroup.ConfigurationParameterProperty
    }
  }
}
