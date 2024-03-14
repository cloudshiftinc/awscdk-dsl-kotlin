package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUserPoolIdentityProvider internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attributeMapping(): Any? = unwrap(this).getAttributeMapping()

  public open fun attributeMapping(`value`: Any) {
    unwrap(this).setAttributeMapping(`value`)
  }

  public open fun idpIdentifiers(): List<String> = unwrap(this).getIdpIdentifiers() ?: emptyList()

  public open fun idpIdentifiers(`value`: List<String>) {
    unwrap(this).setIdpIdentifiers(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun providerDetails(): Any? = unwrap(this).getProviderDetails()

  public open fun providerDetails(`value`: Any) {
    unwrap(this).setProviderDetails(`value`)
  }

  public open fun providerName(): String = unwrap(this).getProviderName()

  public open fun providerName(`value`: String) {
    unwrap(this).setProviderName(`value`)
  }

  public open fun providerType(): String = unwrap(this).getProviderType()

  public open fun providerType(`value`: String) {
    unwrap(this).setProviderType(`value`)
  }

  public open fun userPoolId(): String = unwrap(this).getUserPoolId()

  public open fun userPoolId(`value`: String) {
    unwrap(this).setUserPoolId(`value`)
  }

  public interface Builder {
    public fun attributeMapping(attributeMapping: Any) {
    }

    public fun idpIdentifiers(idpIdentifiers: List<String>) {
    }

    public fun providerDetails(providerDetails: Any) {
    }

    public fun providerName(providerName: String) {
    }

    public fun providerType(providerType: String) {
    }

    public fun userPoolId(userPoolId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider.Builder.create(scope,
        id)

    public override fun attributeMapping(attributeMapping: Any) {
      cdkBuilder.attributeMapping(attributeMapping)
    }

    public override fun idpIdentifiers(idpIdentifiers: List<String>) {
      cdkBuilder.idpIdentifiers(idpIdentifiers)
    }

    public override fun providerDetails(providerDetails: Any) {
      cdkBuilder.providerDetails(providerDetails)
    }

    public override fun providerName(providerName: String) {
      cdkBuilder.providerName(providerName)
    }

    public override fun providerType(providerType: String) {
      cdkBuilder.providerType(providerType)
    }

    public override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserPoolIdentityProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserPoolIdentityProvider(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider):
        CfnUserPoolIdentityProvider = CfnUserPoolIdentityProvider(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolIdentityProvider):
        software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider = wrapped.cdkObject
  }
}
