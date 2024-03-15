@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCoreDefinitionVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun coreDefinitionId(): String = unwrap(this).getCoreDefinitionId()

  public open fun coreDefinitionId(`value`: String) {
    unwrap(this).setCoreDefinitionId(`value`)
  }

  public open fun cores(): Any = unwrap(this).getCores()

  public open fun cores(`value`: IResolvable) {
    unwrap(this).setCores(`value`.let(IResolvable::unwrap))
  }

  public open fun cores(__idx_ac66f0: List<Any>) {
    unwrap(this).setCores(__idx_ac66f0)
  }

  public open fun cores(vararg __idx_ac66f0: Any): Unit = cores(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun coreDefinitionId(coreDefinitionId: String)

    public fun cores(cores: IResolvable)

    public fun cores(cores: List<Any>)

    public fun cores(vararg cores: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.Builder =
        software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.Builder.create(scope,
        id)

    override fun coreDefinitionId(coreDefinitionId: String) {
      cdkBuilder.coreDefinitionId(coreDefinitionId)
    }

    override fun cores(cores: IResolvable) {
      cdkBuilder.cores(cores.let(IResolvable::unwrap))
    }

    override fun cores(cores: List<Any>) {
      cdkBuilder.cores(cores)
    }

    override fun cores(vararg cores: Any): Unit = cores(cores.toList())

    public fun build(): software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCoreDefinitionVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCoreDefinitionVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion):
        CfnCoreDefinitionVersion = CfnCoreDefinitionVersion(cdkObject)

    internal fun unwrap(wrapped: CfnCoreDefinitionVersion):
        software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion = wrapped.cdkObject
  }

  public interface CoreProperty {
    public fun certificateArn(): String

    public fun id(): String

    public fun syncShadow(): Any? = unwrap(this).getSyncShadow()

    public fun thingArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun certificateArn(certificateArn: String)

      public fun id(id: String)

      public fun syncShadow(syncShadow: Boolean)

      public fun syncShadow(syncShadow: IResolvable)

      public fun thingArn(thingArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.CoreProperty.Builder =
          software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.CoreProperty.builder()

      override fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
      }

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun syncShadow(syncShadow: Boolean) {
        cdkBuilder.syncShadow(syncShadow)
      }

      override fun syncShadow(syncShadow: IResolvable) {
        cdkBuilder.syncShadow(syncShadow.let(IResolvable::unwrap))
      }

      override fun thingArn(thingArn: String) {
        cdkBuilder.thingArn(thingArn)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.CoreProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.CoreProperty,
    ) : CdkObject(cdkObject), CoreProperty {
      override fun certificateArn(): String = unwrap(this).getCertificateArn()

      override fun id(): String = unwrap(this).getId()

      override fun syncShadow(): Any? = unwrap(this).getSyncShadow()

      override fun thingArn(): String = unwrap(this).getThingArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CoreProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.CoreProperty):
          CoreProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CoreProperty):
          software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.CoreProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersion.CoreProperty
    }
  }
}