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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider
import software.constructs.Construct

/**
 * Describes a Verified Access trust provider.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnVerifiedAccessTrustProvider cfnVerifiedAccessTrustProvider =
 * CfnVerifiedAccessTrustProvider.Builder.create(this, "MyCfnVerifiedAccessTrustProvider")
 * .policyReferenceName("policyReferenceName")
 * .trustProviderType("trustProviderType")
 * // the properties below are optional
 * .description("description")
 * .deviceOptions(DeviceOptionsProperty.builder()
 * .tenantId("tenantId")
 * .build())
 * .deviceTrustProviderType("deviceTrustProviderType")
 * .oidcOptions(OidcOptionsProperty.builder()
 * .authorizationEndpoint("authorizationEndpoint")
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * .issuer("issuer")
 * .scope("scope")
 * .tokenEndpoint("tokenEndpoint")
 * .userInfoEndpoint("userInfoEndpoint")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .userTrustProviderType("userTrustProviderType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html)
 */
@CdkDslMarker
public class CfnVerifiedAccessTrustProviderDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVerifiedAccessTrustProvider.Builder =
        CfnVerifiedAccessTrustProvider.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A description for the AWS Verified Access trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-description)
     *
     * @param description A description for the AWS Verified Access trust provider.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The options for device-identity trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-deviceoptions)
     *
     * @param deviceOptions The options for device-identity trust provider.
     */
    public fun deviceOptions(deviceOptions: IResolvable) {
        cdkBuilder.deviceOptions(deviceOptions)
    }

    /**
     * The options for device-identity trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-deviceoptions)
     *
     * @param deviceOptions The options for device-identity trust provider.
     */
    public fun deviceOptions(deviceOptions: CfnVerifiedAccessTrustProvider.DeviceOptionsProperty) {
        cdkBuilder.deviceOptions(deviceOptions)
    }

    /**
     * The type of device-based trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-devicetrustprovidertype)
     *
     * @param deviceTrustProviderType The type of device-based trust provider.
     */
    public fun deviceTrustProviderType(deviceTrustProviderType: String) {
        cdkBuilder.deviceTrustProviderType(deviceTrustProviderType)
    }

    /**
     * The options for an OpenID Connect-compatible user-identity trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions)
     *
     * @param oidcOptions The options for an OpenID Connect-compatible user-identity trust provider.
     */
    public fun oidcOptions(oidcOptions: IResolvable) {
        cdkBuilder.oidcOptions(oidcOptions)
    }

    /**
     * The options for an OpenID Connect-compatible user-identity trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-oidcoptions)
     *
     * @param oidcOptions The options for an OpenID Connect-compatible user-identity trust provider.
     */
    public fun oidcOptions(oidcOptions: CfnVerifiedAccessTrustProvider.OidcOptionsProperty) {
        cdkBuilder.oidcOptions(oidcOptions)
    }

    /**
     * The identifier to be used when working with policy rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-policyreferencename)
     *
     * @param policyReferenceName The identifier to be used when working with policy rules.
     */
    public fun policyReferenceName(policyReferenceName: String) {
        cdkBuilder.policyReferenceName(policyReferenceName)
    }

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-tags)
     *
     * @param tags The tags.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-tags)
     *
     * @param tags The tags.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The type of Verified Access trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-trustprovidertype)
     *
     * @param trustProviderType The type of Verified Access trust provider.
     */
    public fun trustProviderType(trustProviderType: String) {
        cdkBuilder.trustProviderType(trustProviderType)
    }

    /**
     * The type of user-based trust provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccesstrustprovider.html#cfn-ec2-verifiedaccesstrustprovider-usertrustprovidertype)
     *
     * @param userTrustProviderType The type of user-based trust provider.
     */
    public fun userTrustProviderType(userTrustProviderType: String) {
        cdkBuilder.userTrustProviderType(userTrustProviderType)
    }

    public fun build(): CfnVerifiedAccessTrustProvider {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
