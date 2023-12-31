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

package io.cloudshiftdev.awscdkdsl.services.signer

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.signer.CfnSigningProfile
import software.constructs.Construct

/**
 * Creates a signing profile.
 *
 * A signing profile is a code-signing template that can be used to carry out a pre-defined signing
 * job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.signer.*;
 * CfnSigningProfile cfnSigningProfile = CfnSigningProfile.Builder.create(this,
 * "MyCfnSigningProfile")
 * .platformId("platformId")
 * // the properties below are optional
 * .signatureValidityPeriod(SignatureValidityPeriodProperty.builder()
 * .type("type")
 * .value(123)
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html)
 */
@CdkDslMarker
public class CfnSigningProfileDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSigningProfile.Builder = CfnSigningProfile.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The ID of a platform that is available for use by a signing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-platformid)
     *
     * @param platformId The ID of a platform that is available for use by a signing profile.
     */
    public fun platformId(platformId: String) {
        cdkBuilder.platformId(platformId)
    }

    /**
     * The validity period override for any signature generated using this signing profile.
     *
     * If unspecified, the default is 135 months.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-signaturevalidityperiod)
     *
     * @param signatureValidityPeriod The validity period override for any signature generated using
     *   this signing profile.
     */
    public fun signatureValidityPeriod(signatureValidityPeriod: IResolvable) {
        cdkBuilder.signatureValidityPeriod(signatureValidityPeriod)
    }

    /**
     * The validity period override for any signature generated using this signing profile.
     *
     * If unspecified, the default is 135 months.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-signaturevalidityperiod)
     *
     * @param signatureValidityPeriod The validity period override for any signature generated using
     *   this signing profile.
     */
    public fun signatureValidityPeriod(
        signatureValidityPeriod: CfnSigningProfile.SignatureValidityPeriodProperty
    ) {
        cdkBuilder.signatureValidityPeriod(signatureValidityPeriod)
    }

    /**
     * A list of tags associated with the signing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-tags)
     *
     * @param tags A list of tags associated with the signing profile.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of tags associated with the signing profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-signer-signingprofile.html#cfn-signer-signingprofile-tags)
     *
     * @param tags A list of tags associated with the signing profile.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnSigningProfile {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
