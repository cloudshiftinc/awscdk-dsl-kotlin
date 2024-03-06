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

package io.cloudshiftdev.awscdkdsl.services.workspacesweb

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.workspacesweb.CfnIdentityProvider
import software.constructs.Construct

/**
 * This resource specifies an identity provider that is then associated with a web portal.
 *
 * This resource is not required if your portal's `AuthenticationType` is IAM Identity Center.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.workspacesweb.*;
 * CfnIdentityProvider cfnIdentityProvider = CfnIdentityProvider.Builder.create(this,
 * "MyCfnIdentityProvider")
 * .identityProviderDetails(Map.of(
 * "identityProviderDetailsKey", "identityProviderDetails"))
 * .identityProviderName("identityProviderName")
 * .identityProviderType("identityProviderType")
 * // the properties below are optional
 * .portalArn("portalArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-identityprovider.html)
 */
@CdkDslMarker
public class CfnIdentityProviderDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnIdentityProvider.Builder =
        CfnIdentityProvider.Builder.create(scope, id)

    /**
     * The identity provider details. The following list describes the provider detail keys for each
     * identity provider type.
     * * For Google and Login with Amazon:
     * * `client_id`
     * * `client_secret`
     * * `authorize_scopes`
     * * For Facebook:
     * * `client_id`
     * * `client_secret`
     * * `authorize_scopes`
     * * `api_version`
     * * For Sign in with Apple:
     * * `client_id`
     * * `team_id`
     * * `key_id`
     * * `private_key`
     * * `authorize_scopes`
     * * For OIDC providers:
     * * `client_id`
     * * `client_secret`
     * * `attributes_request_method`
     * * `oidc_issuer`
     * * `authorize_scopes`
     * * `authorize_url` *if not available from discovery URL specified by oidc_issuer key*
     * * `token_url` *if not available from discovery URL specified by oidc_issuer key*
     * * `attributes_url` *if not available from discovery URL specified by oidc_issuer key*
     * * `jwks_uri` *if not available from discovery URL specified by oidc_issuer key*
     * * For SAML providers:
     * * `MetadataFile` OR `MetadataURL`
     * * `IDPSignout` (boolean) *optional*
     * * `IDPInit` (boolean) *optional*
     * * `RequestSigningAlgorithm` (string) *optional* - Only accepts `rsa-sha256`
     * * `EncryptedResponses` (boolean) *optional*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-identityprovider.html#cfn-workspacesweb-identityprovider-identityproviderdetails)
     *
     * @param identityProviderDetails The identity provider details. The following list describes
     *   the provider detail keys for each identity provider type.
     */
    public fun identityProviderDetails(identityProviderDetails: Map<String, String>) {
        cdkBuilder.identityProviderDetails(identityProviderDetails)
    }

    /**
     * The identity provider details. The following list describes the provider detail keys for each
     * identity provider type.
     * * For Google and Login with Amazon:
     * * `client_id`
     * * `client_secret`
     * * `authorize_scopes`
     * * For Facebook:
     * * `client_id`
     * * `client_secret`
     * * `authorize_scopes`
     * * `api_version`
     * * For Sign in with Apple:
     * * `client_id`
     * * `team_id`
     * * `key_id`
     * * `private_key`
     * * `authorize_scopes`
     * * For OIDC providers:
     * * `client_id`
     * * `client_secret`
     * * `attributes_request_method`
     * * `oidc_issuer`
     * * `authorize_scopes`
     * * `authorize_url` *if not available from discovery URL specified by oidc_issuer key*
     * * `token_url` *if not available from discovery URL specified by oidc_issuer key*
     * * `attributes_url` *if not available from discovery URL specified by oidc_issuer key*
     * * `jwks_uri` *if not available from discovery URL specified by oidc_issuer key*
     * * For SAML providers:
     * * `MetadataFile` OR `MetadataURL`
     * * `IDPSignout` (boolean) *optional*
     * * `IDPInit` (boolean) *optional*
     * * `RequestSigningAlgorithm` (string) *optional* - Only accepts `rsa-sha256`
     * * `EncryptedResponses` (boolean) *optional*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-identityprovider.html#cfn-workspacesweb-identityprovider-identityproviderdetails)
     *
     * @param identityProviderDetails The identity provider details. The following list describes
     *   the provider detail keys for each identity provider type.
     */
    public fun identityProviderDetails(identityProviderDetails: IResolvable) {
        cdkBuilder.identityProviderDetails(identityProviderDetails)
    }

    /**
     * The identity provider name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-identityprovider.html#cfn-workspacesweb-identityprovider-identityprovidername)
     *
     * @param identityProviderName The identity provider name.
     */
    public fun identityProviderName(identityProviderName: String) {
        cdkBuilder.identityProviderName(identityProviderName)
    }

    /**
     * The identity provider type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-identityprovider.html#cfn-workspacesweb-identityprovider-identityprovidertype)
     *
     * @param identityProviderType The identity provider type.
     */
    public fun identityProviderType(identityProviderType: String) {
        cdkBuilder.identityProviderType(identityProviderType)
    }

    /**
     * The ARN of the identity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-workspacesweb-identityprovider.html#cfn-workspacesweb-identityprovider-portalarn)
     *
     * @param portalArn The ARN of the identity provider.
     */
    public fun portalArn(portalArn: String) {
        cdkBuilder.portalArn(portalArn)
    }

    public fun build(): CfnIdentityProvider = cdkBuilder.build()
}
