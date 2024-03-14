package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVirtualRouter internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualRouter,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrMeshName(): String = unwrap(this).getAttrMeshName()

  public open fun attrMeshOwner(): String = unwrap(this).getAttrMeshOwner()

  public open fun attrResourceOwner(): String = unwrap(this).getAttrResourceOwner()

  public open fun attrUid(): String = unwrap(this).getAttrUid()

  public open fun attrVirtualRouterName(): String = unwrap(this).getAttrVirtualRouterName()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun meshName(): String = unwrap(this).getMeshName()

  public open fun meshName(`value`: String) {
    unwrap(this).setMeshName(`value`)
  }

  public open fun meshOwner(): String? = unwrap(this).getMeshOwner()

  public open fun meshOwner(`value`: String) {
    unwrap(this).setMeshOwner(`value`)
  }

  public open fun spec(): Any = unwrap(this).getSpec()

  public open fun spec(`value`: IResolvable) {
    unwrap(this).setSpec(`value`.let(IResolvable::unwrap))
  }

  public open fun spec(`value`: VirtualRouterSpecProperty) {
    unwrap(this).setSpec(`value`.let(VirtualRouterSpecProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("614f3bb2c4544dc6f7fa0ced8b25da933abd3e3b21800f970d645a38eeda9bb6")
  public open fun spec(`value`: VirtualRouterSpecProperty.Builder.() -> Unit): Unit =
      spec(VirtualRouterSpecProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun virtualRouterName(): String? = unwrap(this).getVirtualRouterName()

  public open fun virtualRouterName(`value`: String) {
    unwrap(this).setVirtualRouterName(`value`)
  }

  public interface Builder {
    public fun meshName(meshName: String)

    public fun meshOwner(meshOwner: String)

    public fun spec(spec: IResolvable)

    public fun spec(spec: VirtualRouterSpecProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4adab77e464f114a3a2b32d80657205875f60e4232a06251eff7019e7d50b4ea")
    public fun spec(spec: VirtualRouterSpecProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun virtualRouterName(virtualRouterName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.CfnVirtualRouter.Builder =
        software.amazon.awscdk.services.appmesh.CfnVirtualRouter.Builder.create(scope, id)

    override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    override fun meshOwner(meshOwner: String) {
      cdkBuilder.meshOwner(meshOwner)
    }

    override fun spec(spec: IResolvable) {
      cdkBuilder.spec(spec.let(IResolvable::unwrap))
    }

    override fun spec(spec: VirtualRouterSpecProperty) {
      cdkBuilder.spec(spec.let(VirtualRouterSpecProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4adab77e464f114a3a2b32d80657205875f60e4232a06251eff7019e7d50b4ea")
    override fun spec(spec: VirtualRouterSpecProperty.Builder.() -> Unit): Unit =
        spec(VirtualRouterSpecProperty(spec))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun virtualRouterName(virtualRouterName: String) {
      cdkBuilder.virtualRouterName(virtualRouterName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CfnVirtualRouter =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVirtualRouter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVirtualRouter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualRouter):
        CfnVirtualRouter = CfnVirtualRouter(cdkObject)

    internal fun unwrap(wrapped: CfnVirtualRouter):
        software.amazon.awscdk.services.appmesh.CfnVirtualRouter = wrapped.cdkObject
  }

  public interface VirtualRouterSpecProperty {
    public fun listeners(): Any

    public interface Builder {
      public fun listeners(listeners: IResolvable)

      public fun listeners(listeners: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterSpecProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterSpecProperty.builder()

      override fun listeners(listeners: IResolvable) {
        cdkBuilder.listeners(listeners.let(IResolvable::unwrap))
      }

      override fun listeners(listeners: List<Any>) {
        cdkBuilder.listeners(listeners)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterSpecProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterSpecProperty,
    ) : VirtualRouterSpecProperty {
      override fun listeners(): Any = unwrap(this).getListeners()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VirtualRouterSpecProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterSpecProperty):
          VirtualRouterSpecProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualRouterSpecProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterSpecProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PortMappingProperty {
    public fun port(): Number

    public fun protocol(): String

    public interface Builder {
      public fun port(port: Number)

      public fun protocol(protocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.PortMappingProperty.Builder =
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.PortMappingProperty.builder()

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.PortMappingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.PortMappingProperty,
    ) : PortMappingProperty {
      override fun port(): Number = unwrap(this).getPort()

      override fun protocol(): String = unwrap(this).getProtocol()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PortMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualRouter.PortMappingProperty):
          PortMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortMappingProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.PortMappingProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface VirtualRouterListenerProperty {
    public fun portMapping(): Any

    public interface Builder {
      public fun portMapping(portMapping: IResolvable)

      public fun portMapping(portMapping: PortMappingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("259fa42bf718471f6642c0dbaf6dbebf61498fe145bb69ea893b2762040d3d80")
      public fun portMapping(portMapping: PortMappingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterListenerProperty.Builder
          =
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterListenerProperty.builder()

      override fun portMapping(portMapping: IResolvable) {
        cdkBuilder.portMapping(portMapping.let(IResolvable::unwrap))
      }

      override fun portMapping(portMapping: PortMappingProperty) {
        cdkBuilder.portMapping(portMapping.let(PortMappingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("259fa42bf718471f6642c0dbaf6dbebf61498fe145bb69ea893b2762040d3d80")
      override fun portMapping(portMapping: PortMappingProperty.Builder.() -> Unit): Unit =
          portMapping(PortMappingProperty(portMapping))

      public fun build():
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterListenerProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterListenerProperty,
    ) : VirtualRouterListenerProperty {
      override fun portMapping(): Any = unwrap(this).getPortMapping()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VirtualRouterListenerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterListenerProperty):
          VirtualRouterListenerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VirtualRouterListenerProperty):
          software.amazon.awscdk.services.appmesh.CfnVirtualRouter.VirtualRouterListenerProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}