@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.cognito

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProviderProps

/**
 * Properties for defining a `CfnUserPoolIdentityProvider`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * Object attributeMapping;
 * Object providerDetails;
 * CfnUserPoolIdentityProviderProps cfnUserPoolIdentityProviderProps =
 * CfnUserPoolIdentityProviderProps.builder()
 * .providerName("providerName")
 * .providerType("providerType")
 * .userPoolId("userPoolId")
 * // the properties below are optional
 * .attributeMapping(attributeMapping)
 * .idpIdentifiers(List.of("idpIdentifiers"))
 * .providerDetails(providerDetails)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html)
 */
@CdkDslMarker
public class CfnUserPoolIdentityProviderPropsDsl {
    private val cdkBuilder: CfnUserPoolIdentityProviderProps.Builder =
        CfnUserPoolIdentityProviderProps.builder()

    private val _idpIdentifiers: MutableList<String> = mutableListOf()

    /**
     * @param attributeMapping A mapping of IdP attributes to standard and custom user pool
     *   attributes.
     */
    public fun attributeMapping(attributeMapping: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(attributeMapping)
        cdkBuilder.attributeMapping(builder.map)
    }

    /**
     * @param attributeMapping A mapping of IdP attributes to standard and custom user pool
     *   attributes.
     */
    public fun attributeMapping(attributeMapping: Any) {
        cdkBuilder.attributeMapping(attributeMapping)
    }

    /** @param idpIdentifiers A list of IdP identifiers. */
    public fun idpIdentifiers(vararg idpIdentifiers: String) {
        _idpIdentifiers.addAll(listOf(*idpIdentifiers))
    }

    /** @param idpIdentifiers A list of IdP identifiers. */
    public fun idpIdentifiers(idpIdentifiers: Collection<String>) {
        _idpIdentifiers.addAll(idpIdentifiers)
    }

    /**
     * @param providerDetails The scopes, URLs, and identifiers for your external identity provider.
     *   The following examples describe the provider detail keys for each IdP type. These values
     *   and their schema are subject to change. Social IdP `authorize_scopes` values must match the
     *   values listed here.
     * * **OpenID Connect (OIDC)** - Amazon Cognito accepts the following elements when it can't
     *   discover endpoint URLs from `oidc_issuer` : `attributes_url` , `authorize_url` , `jwks_uri`
     *   , `token_url` .
     *
     * Create or update request: `"ProviderDetails": { "attributes_request_method": "GET",
     * "attributes_url": "https://auth.example.com/userInfo", "authorize_scopes": "openid profile
     * email", "authorize_url": "https://auth.example.com/authorize", "client_id":
     * "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri":
     * "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com",
     * "token_url": "https://example.com/token" }`
     *
     * Describe response: `"ProviderDetails": { "attributes_request_method": "GET",
     * "attributes_url": "https://auth.example.com/userInfo", "attributes_url_add_attributes":
     * "false", "authorize_scopes": "openid profile email", "authorize_url":
     * "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret":
     * "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json",
     * "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }`
     * * **SAML** - Create or update request with Metadata URL: `"ProviderDetails": { "IDPInit":
     *   "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataURL":
     *   "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256" }`
     *
     * Create or update request with Metadata file: `"ProviderDetails": { "IDPInit": "true",
     * "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataFile": "[metadata XML]",
     * "RequestSigningAlgorithm": "rsa-sha256" }`
     *
     * The value of `MetadataFile` must be the plaintext metadata document with all quote (")
     * characters escaped by backslashes.
     *
     * Describe response: `"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true",
     * "EncryptedResponses" : "true", "ActiveEncryptionCertificate": "[certificate]", "MetadataURL":
     * "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256",
     * "SLORedirectBindingURI": "https://auth.example.com/slo/saml", "SSORedirectBindingURI":
     * "https://auth.example.com/sso/saml" }`
     * * **LoginWithAmazon** - Create or update request: `"ProviderDetails": { "authorize_scopes":
     *   "profile postal_code", "client_id": "amzn1.application-oa2-client.1example23456789",
     *   "client_secret": "provider-app-client-secret"`
     *
     * Describe response: `"ProviderDetails": { "attributes_url":
     * "https://api.amazon.com/user/profile", "attributes_url_add_attributes": "false",
     * "authorize_scopes": "profile postal_code", "authorize_url": "https://www.amazon.com/ap/oa",
     * "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret":
     * "provider-app-client-secret", "token_request_method": "POST", "token_url":
     * "https://api.amazon.com/auth/o2/token" }`
     * * **Google** - Create or update request: `"ProviderDetails": { "authorize_scopes": "email
     *   profile openid", "client_id": "1example23456789.apps.googleusercontent.com",
     *   "client_secret": "provider-app-client-secret" }`
     *
     * Describe response: `"ProviderDetails": { "attributes_url":
     * "https://people.googleapis.com/v1/people/me?personFields=", "attributes_url_add_attributes":
     * "true", "authorize_scopes": "email profile openid", "authorize_url":
     * "https://accounts.google.com/o/oauth2/v2/auth", "client_id":
     * "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret",
     * "oidc_issuer": "https://accounts.google.com", "token_request_method": "POST", "token_url":
     * "https://www.googleapis.com/oauth2/v4/token" }`
     * * **SignInWithApple** - Create or update request: `"ProviderDetails": { "authorize_scopes":
     *   "email name", "client_id": "com.example.cognito", "private_key": "1EXAMPLE", "key_id":
     *   "2EXAMPLE", "team_id": "3EXAMPLE" }`
     *
     * Describe response: `"ProviderDetails": { "attributes_url_add_attributes": "false",
     * "authorize_scopes": "email name", "authorize_url":
     * "https://appleid.apple.com/auth/authorize", "client_id": "com.example.cognito", "key_id":
     * "1EXAMPLE", "oidc_issuer": "https://appleid.apple.com", "team_id": "2EXAMPLE",
     * "token_request_method": "POST", "token_url": "https://appleid.apple.com/auth/token" }`
     * * **Facebook** - Create or update request: `"ProviderDetails": { "api_version": "v17.0",
     *   "authorize_scopes": "public_profile, email", "client_id": "1example23456789",
     *   "client_secret": "provider-app-client-secret" }`
     *
     * Describe response: `"ProviderDetails": { "api_version": "v17.0", "attributes_url":
     * "https://graph.facebook.com/v17.0/me?fields=", "attributes_url_add_attributes": "true",
     * "authorize_scopes": "public_profile, email", "authorize_url":
     * "https://www.facebook.com/v17.0/dialog/oauth", "client_id": "1example23456789",
     * "client_secret": "provider-app-client-secret", "token_request_method": "GET", "token_url":
     * "https://graph.facebook.com/v17.0/oauth/access_token" }`
     */
    public fun providerDetails(providerDetails: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(providerDetails)
        cdkBuilder.providerDetails(builder.map)
    }

    /**
     * @param providerDetails The scopes, URLs, and identifiers for your external identity provider.
     *   The following examples describe the provider detail keys for each IdP type. These values
     *   and their schema are subject to change. Social IdP `authorize_scopes` values must match the
     *   values listed here.
     * * **OpenID Connect (OIDC)** - Amazon Cognito accepts the following elements when it can't
     *   discover endpoint URLs from `oidc_issuer` : `attributes_url` , `authorize_url` , `jwks_uri`
     *   , `token_url` .
     *
     * Create or update request: `"ProviderDetails": { "attributes_request_method": "GET",
     * "attributes_url": "https://auth.example.com/userInfo", "authorize_scopes": "openid profile
     * email", "authorize_url": "https://auth.example.com/authorize", "client_id":
     * "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri":
     * "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com",
     * "token_url": "https://example.com/token" }`
     *
     * Describe response: `"ProviderDetails": { "attributes_request_method": "GET",
     * "attributes_url": "https://auth.example.com/userInfo", "attributes_url_add_attributes":
     * "false", "authorize_scopes": "openid profile email", "authorize_url":
     * "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret":
     * "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json",
     * "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }`
     * * **SAML** - Create or update request with Metadata URL: `"ProviderDetails": { "IDPInit":
     *   "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataURL":
     *   "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256" }`
     *
     * Create or update request with Metadata file: `"ProviderDetails": { "IDPInit": "true",
     * "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataFile": "[metadata XML]",
     * "RequestSigningAlgorithm": "rsa-sha256" }`
     *
     * The value of `MetadataFile` must be the plaintext metadata document with all quote (")
     * characters escaped by backslashes.
     *
     * Describe response: `"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true",
     * "EncryptedResponses" : "true", "ActiveEncryptionCertificate": "[certificate]", "MetadataURL":
     * "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256",
     * "SLORedirectBindingURI": "https://auth.example.com/slo/saml", "SSORedirectBindingURI":
     * "https://auth.example.com/sso/saml" }`
     * * **LoginWithAmazon** - Create or update request: `"ProviderDetails": { "authorize_scopes":
     *   "profile postal_code", "client_id": "amzn1.application-oa2-client.1example23456789",
     *   "client_secret": "provider-app-client-secret"`
     *
     * Describe response: `"ProviderDetails": { "attributes_url":
     * "https://api.amazon.com/user/profile", "attributes_url_add_attributes": "false",
     * "authorize_scopes": "profile postal_code", "authorize_url": "https://www.amazon.com/ap/oa",
     * "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret":
     * "provider-app-client-secret", "token_request_method": "POST", "token_url":
     * "https://api.amazon.com/auth/o2/token" }`
     * * **Google** - Create or update request: `"ProviderDetails": { "authorize_scopes": "email
     *   profile openid", "client_id": "1example23456789.apps.googleusercontent.com",
     *   "client_secret": "provider-app-client-secret" }`
     *
     * Describe response: `"ProviderDetails": { "attributes_url":
     * "https://people.googleapis.com/v1/people/me?personFields=", "attributes_url_add_attributes":
     * "true", "authorize_scopes": "email profile openid", "authorize_url":
     * "https://accounts.google.com/o/oauth2/v2/auth", "client_id":
     * "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret",
     * "oidc_issuer": "https://accounts.google.com", "token_request_method": "POST", "token_url":
     * "https://www.googleapis.com/oauth2/v4/token" }`
     * * **SignInWithApple** - Create or update request: `"ProviderDetails": { "authorize_scopes":
     *   "email name", "client_id": "com.example.cognito", "private_key": "1EXAMPLE", "key_id":
     *   "2EXAMPLE", "team_id": "3EXAMPLE" }`
     *
     * Describe response: `"ProviderDetails": { "attributes_url_add_attributes": "false",
     * "authorize_scopes": "email name", "authorize_url":
     * "https://appleid.apple.com/auth/authorize", "client_id": "com.example.cognito", "key_id":
     * "1EXAMPLE", "oidc_issuer": "https://appleid.apple.com", "team_id": "2EXAMPLE",
     * "token_request_method": "POST", "token_url": "https://appleid.apple.com/auth/token" }`
     * * **Facebook** - Create or update request: `"ProviderDetails": { "api_version": "v17.0",
     *   "authorize_scopes": "public_profile, email", "client_id": "1example23456789",
     *   "client_secret": "provider-app-client-secret" }`
     *
     * Describe response: `"ProviderDetails": { "api_version": "v17.0", "attributes_url":
     * "https://graph.facebook.com/v17.0/me?fields=", "attributes_url_add_attributes": "true",
     * "authorize_scopes": "public_profile, email", "authorize_url":
     * "https://www.facebook.com/v17.0/dialog/oauth", "client_id": "1example23456789",
     * "client_secret": "provider-app-client-secret", "token_request_method": "GET", "token_url":
     * "https://graph.facebook.com/v17.0/oauth/access_token" }`
     */
    public fun providerDetails(providerDetails: Any) {
        cdkBuilder.providerDetails(providerDetails)
    }

    /** @param providerName The IdP name. */
    public fun providerName(providerName: String) {
        cdkBuilder.providerName(providerName)
    }

    /** @param providerType The IdP type. */
    public fun providerType(providerType: String) {
        cdkBuilder.providerType(providerType)
    }

    /** @param userPoolId The user pool ID. */
    public fun userPoolId(userPoolId: String) {
        cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): CfnUserPoolIdentityProviderProps {
        if (_idpIdentifiers.isNotEmpty()) cdkBuilder.idpIdentifiers(_idpIdentifiers)
        return cdkBuilder.build()
    }
}
