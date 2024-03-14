package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class UserPoolIdentityProviderAmazon internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon,
) : Resource(cdkObject), IUserPoolIdentityProvider {
  public override fun providerName(): String = unwrap(this).getProviderName()

  public interface Builder {
    public fun attributeMapping(attributeMapping: AttributeMapping) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("428881ebb5d6adfee39d8c5562b22b48a809c9a10fb834306b0653a7e39e7e60")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit) {
    }

    public fun clientId(clientId: String) {
    }

    public fun clientSecret(clientSecret: String) {
    }

    public fun scopes(scopes: List<String>) {
    }

    public fun userPool(userPool: IUserPool) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon.Builder.create(scope,
        id)

    public override fun attributeMapping(attributeMapping: AttributeMapping) {
      cdkBuilder.attributeMapping(attributeMapping.let(AttributeMapping::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("428881ebb5d6adfee39d8c5562b22b48a809c9a10fb834306b0653a7e39e7e60")
    public override fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit):
        Unit = attributeMapping(AttributeMapping(attributeMapping))

    public override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    public override fun clientSecret(clientSecret: String) {
      cdkBuilder.clientSecret(clientSecret)
    }

    public override fun scopes(scopes: List<String>) {
      cdkBuilder.scopes(scopes)
    }

    public override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UserPoolIdentityProviderAmazon {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UserPoolIdentityProviderAmazon(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon):
        UserPoolIdentityProviderAmazon = UserPoolIdentityProviderAmazon(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProviderAmazon):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon = wrapped.cdkObject
  }
}
