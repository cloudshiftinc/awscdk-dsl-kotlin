@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.certificatemanager

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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCertificate internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.certificatemanager.CfnCertificate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun certificateAuthorityArn(): String? = unwrap(this).getCertificateAuthorityArn()

  public open fun certificateAuthorityArn(`value`: String) {
    unwrap(this).setCertificateAuthorityArn(`value`)
  }

  public open fun certificateTransparencyLoggingPreference(): String? =
      unwrap(this).getCertificateTransparencyLoggingPreference()

  public open fun certificateTransparencyLoggingPreference(`value`: String) {
    unwrap(this).setCertificateTransparencyLoggingPreference(`value`)
  }

  public open fun domainName(): String = unwrap(this).getDomainName()

  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  public open fun domainValidationOptions(): Any? = unwrap(this).getDomainValidationOptions()

  public open fun domainValidationOptions(`value`: IResolvable) {
    unwrap(this).setDomainValidationOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun domainValidationOptions(__idx_ac66f0: List<Any>) {
    unwrap(this).setDomainValidationOptions(__idx_ac66f0)
  }

  public open fun domainValidationOptions(vararg __idx_ac66f0: Any): Unit =
      domainValidationOptions(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun keyAlgorithm(): String? = unwrap(this).getKeyAlgorithm()

  public open fun keyAlgorithm(`value`: String) {
    unwrap(this).setKeyAlgorithm(`value`)
  }

  public open fun subjectAlternativeNames(): List<String> =
      unwrap(this).getSubjectAlternativeNames() ?: emptyList()

  public open fun subjectAlternativeNames(`value`: List<String>) {
    unwrap(this).setSubjectAlternativeNames(`value`)
  }

  public open fun subjectAlternativeNames(vararg `value`: String): Unit =
      subjectAlternativeNames(`value`.toList())

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun validationMethod(): String? = unwrap(this).getValidationMethod()

  public open fun validationMethod(`value`: String) {
    unwrap(this).setValidationMethod(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun certificateAuthorityArn(certificateAuthorityArn: String)

    public
        fun certificateTransparencyLoggingPreference(certificateTransparencyLoggingPreference: String)

    public fun domainName(domainName: String)

    public fun domainValidationOptions(domainValidationOptions: IResolvable)

    public fun domainValidationOptions(domainValidationOptions: List<Any>)

    public fun domainValidationOptions(vararg domainValidationOptions: Any)

    public fun keyAlgorithm(keyAlgorithm: String)

    public fun subjectAlternativeNames(subjectAlternativeNames: List<String>)

    public fun subjectAlternativeNames(vararg subjectAlternativeNames: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun validationMethod(validationMethod: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.certificatemanager.CfnCertificate.Builder =
        software.amazon.awscdk.services.certificatemanager.CfnCertificate.Builder.create(scope, id)

    override fun certificateAuthorityArn(certificateAuthorityArn: String) {
      cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
    }

    override
        fun certificateTransparencyLoggingPreference(certificateTransparencyLoggingPreference: String) {
      cdkBuilder.certificateTransparencyLoggingPreference(certificateTransparencyLoggingPreference)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun domainValidationOptions(domainValidationOptions: IResolvable) {
      cdkBuilder.domainValidationOptions(domainValidationOptions.let(IResolvable::unwrap))
    }

    override fun domainValidationOptions(domainValidationOptions: List<Any>) {
      cdkBuilder.domainValidationOptions(domainValidationOptions)
    }

    override fun domainValidationOptions(vararg domainValidationOptions: Any): Unit =
        domainValidationOptions(domainValidationOptions.toList())

    override fun keyAlgorithm(keyAlgorithm: String) {
      cdkBuilder.keyAlgorithm(keyAlgorithm)
    }

    override fun subjectAlternativeNames(subjectAlternativeNames: List<String>) {
      cdkBuilder.subjectAlternativeNames(subjectAlternativeNames)
    }

    override fun subjectAlternativeNames(vararg subjectAlternativeNames: String): Unit =
        subjectAlternativeNames(subjectAlternativeNames.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun validationMethod(validationMethod: String) {
      cdkBuilder.validationMethod(validationMethod)
    }

    public fun build(): software.amazon.awscdk.services.certificatemanager.CfnCertificate =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.certificatemanager.CfnCertificate.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCertificate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCertificate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.CfnCertificate):
        CfnCertificate = CfnCertificate(cdkObject)

    internal fun unwrap(wrapped: CfnCertificate):
        software.amazon.awscdk.services.certificatemanager.CfnCertificate = wrapped.cdkObject
  }

  public interface DomainValidationOptionProperty {
    public fun domainName(): String

    public fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

    public fun validationDomain(): String? = unwrap(this).getValidationDomain()

    @CdkDslMarker
    public interface Builder {
      public fun domainName(domainName: String)

      public fun hostedZoneId(hostedZoneId: String)

      public fun validationDomain(validationDomain: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty.Builder
          =
          software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty.builder()

      override fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
      }

      override fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
      }

      override fun validationDomain(validationDomain: String) {
        cdkBuilder.validationDomain(validationDomain)
      }

      public fun build():
          software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty,
    ) : CdkObject(cdkObject), DomainValidationOptionProperty {
      override fun domainName(): String = unwrap(this).getDomainName()

      override fun hostedZoneId(): String? = unwrap(this).getHostedZoneId()

      override fun validationDomain(): String? = unwrap(this).getValidationDomain()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DomainValidationOptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty):
          DomainValidationOptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DomainValidationOptionProperty):
          software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.certificatemanager.CfnCertificate.DomainValidationOptionProperty
    }
  }
}
