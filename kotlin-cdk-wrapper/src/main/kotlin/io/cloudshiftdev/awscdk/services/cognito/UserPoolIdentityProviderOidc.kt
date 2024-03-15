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

public open class UserPoolIdentityProviderOidc internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidc,
) : Resource(cdkObject), IUserPoolIdentityProvider {
  public override fun providerName(): String = unwrap(this).getProviderName()

  @CdkDslMarker
  public interface Builder {
    public fun attributeMapping(attributeMapping: AttributeMapping)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("603595185306f3cbe3b150f2d42508de726dc0a43008589c4ee2fb5565eac7f6")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    public fun attributeRequestMethod(attributeRequestMethod: OidcAttributeRequestMethod)

    public fun clientId(clientId: String)

    public fun clientSecret(clientSecret: String)

    public fun endpoints(endpoints: OidcEndpoints)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47ba295429bf4c0b6cf598bc197daa092bdec752210ec00b61c23f978b2e181c")
    public fun endpoints(endpoints: OidcEndpoints.Builder.() -> Unit)

    public fun identifiers(identifiers: List<String>)

    public fun identifiers(vararg identifiers: String)

    public fun issuerUrl(issuerUrl: String)

    public fun name(name: String)

    public fun scopes(scopes: List<String>)

    public fun scopes(vararg scopes: String)

    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidc.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidc.Builder.create(scope,
        id)

    override fun attributeMapping(attributeMapping: AttributeMapping) {
      cdkBuilder.attributeMapping(attributeMapping.let(AttributeMapping::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("603595185306f3cbe3b150f2d42508de726dc0a43008589c4ee2fb5565eac7f6")
    override fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit): Unit =
        attributeMapping(AttributeMapping(attributeMapping))

    override fun attributeRequestMethod(attributeRequestMethod: OidcAttributeRequestMethod) {
      cdkBuilder.attributeRequestMethod(attributeRequestMethod.let(OidcAttributeRequestMethod::unwrap))
    }

    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    override fun clientSecret(clientSecret: String) {
      cdkBuilder.clientSecret(clientSecret)
    }

    override fun endpoints(endpoints: OidcEndpoints) {
      cdkBuilder.endpoints(endpoints.let(OidcEndpoints::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("47ba295429bf4c0b6cf598bc197daa092bdec752210ec00b61c23f978b2e181c")
    override fun endpoints(endpoints: OidcEndpoints.Builder.() -> Unit): Unit =
        endpoints(OidcEndpoints(endpoints))

    override fun identifiers(identifiers: List<String>) {
      cdkBuilder.identifiers(identifiers)
    }

    override fun identifiers(vararg identifiers: String): Unit = identifiers(identifiers.toList())

    override fun issuerUrl(issuerUrl: String) {
      cdkBuilder.issuerUrl(issuerUrl)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun scopes(scopes: List<String>) {
      cdkBuilder.scopes(scopes)
    }

    override fun scopes(vararg scopes: String): Unit = scopes(scopes.toList())

    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidc =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UserPoolIdentityProviderOidc {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UserPoolIdentityProviderOidc(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidc):
        UserPoolIdentityProviderOidc = UserPoolIdentityProviderOidc(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProviderOidc):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderOidc = wrapped.cdkObject
  }
}
