@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class UserPoolIdentityProviderAmazon internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon,
) : Resource(cdkObject), IUserPoolIdentityProvider {
  public override fun providerName(): String = unwrap(this).getProviderName()

  @CdkDslMarker
  public interface Builder {
    public fun attributeMapping(attributeMapping: AttributeMapping)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("428881ebb5d6adfee39d8c5562b22b48a809c9a10fb834306b0653a7e39e7e60")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    public fun clientId(clientId: String)

    public fun clientSecret(clientSecret: String)

    public fun scopes(scopes: List<String>)

    public fun scopes(vararg scopes: String)

    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon.Builder.create(scope,
        id)

    override fun attributeMapping(attributeMapping: AttributeMapping) {
      cdkBuilder.attributeMapping(attributeMapping.let(AttributeMapping::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("428881ebb5d6adfee39d8c5562b22b48a809c9a10fb834306b0653a7e39e7e60")
    override fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit): Unit =
        attributeMapping(AttributeMapping(attributeMapping))

    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    override fun clientSecret(clientSecret: String) {
      cdkBuilder.clientSecret(clientSecret)
    }

    override fun scopes(scopes: List<String>) {
      cdkBuilder.scopes(scopes)
    }

    override fun scopes(vararg scopes: String): Unit = scopes(scopes.toList())

    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderAmazon =
        cdkBuilder.build()
  }

  public companion object {
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
