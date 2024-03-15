@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcaconnectorad

import io.cloudshiftdev.awscdk.CfnResource
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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConnector internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnConnector,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrConnectorArn(): String = unwrap(this).getAttrConnectorArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun certificateAuthorityArn(): String = unwrap(this).getCertificateAuthorityArn()

  public open fun certificateAuthorityArn(`value`: String) {
    unwrap(this).setCertificateAuthorityArn(`value`)
  }

  public open fun directoryId(): String = unwrap(this).getDirectoryId()

  public open fun directoryId(`value`: String) {
    unwrap(this).setDirectoryId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  public open fun vpcInformation(): Any = unwrap(this).getVpcInformation()

  public open fun vpcInformation(`value`: IResolvable) {
    unwrap(this).setVpcInformation(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcInformation(`value`: VpcInformationProperty) {
    unwrap(this).setVpcInformation(`value`.let(VpcInformationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e2cf8ac4f3f89fdabf0898b800f2d31e3fc356ec7a18dd166400722accbe0826")
  public open fun vpcInformation(`value`: VpcInformationProperty.Builder.() -> Unit): Unit =
      vpcInformation(VpcInformationProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun certificateAuthorityArn(certificateAuthorityArn: String)

    public fun directoryId(directoryId: String)

    public fun tags(tags: Map<String, String>)

    public fun vpcInformation(vpcInformation: IResolvable)

    public fun vpcInformation(vpcInformation: VpcInformationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32df71517c442273d53d51243ad04fe59b3bad74e4a946944099697bd91f110b")
    public fun vpcInformation(vpcInformation: VpcInformationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pcaconnectorad.CfnConnector.Builder =
        software.amazon.awscdk.services.pcaconnectorad.CfnConnector.Builder.create(scope, id)

    override fun certificateAuthorityArn(certificateAuthorityArn: String) {
      cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    override fun directoryId(directoryId: String) {
      cdkBuilder.directoryId(directoryId)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun vpcInformation(vpcInformation: IResolvable) {
      cdkBuilder.vpcInformation(vpcInformation.let(IResolvable::unwrap))
    }

    override fun vpcInformation(vpcInformation: VpcInformationProperty) {
      cdkBuilder.vpcInformation(vpcInformation.let(VpcInformationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32df71517c442273d53d51243ad04fe59b3bad74e4a946944099697bd91f110b")
    override fun vpcInformation(vpcInformation: VpcInformationProperty.Builder.() -> Unit): Unit =
        vpcInformation(VpcInformationProperty(vpcInformation))

    public fun build(): software.amazon.awscdk.services.pcaconnectorad.CfnConnector =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pcaconnectorad.CfnConnector.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnector {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnector(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnConnector):
        CfnConnector = CfnConnector(cdkObject)

    internal fun unwrap(wrapped: CfnConnector):
        software.amazon.awscdk.services.pcaconnectorad.CfnConnector = wrapped.cdkObject
  }

  public interface VpcInformationProperty {
    public fun securityGroupIds(): List<String>

    @CdkDslMarker
    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun securityGroupIds(vararg securityGroupIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnConnector.VpcInformationProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnConnector.VpcInformationProperty.builder()

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnConnector.VpcInformationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnConnector.VpcInformationProperty,
    ) : CdkObject(cdkObject), VpcInformationProperty {
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcInformationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnConnector.VpcInformationProperty):
          VpcInformationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcInformationProperty):
          software.amazon.awscdk.services.pcaconnectorad.CfnConnector.VpcInformationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnConnector.VpcInformationProperty
    }
  }
}
