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

package io.cloudshiftdev.awscdkdsl.services.transfer

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.transfer.CfnCertificate
import software.constructs.Construct

/**
 * Imports the signing and encryption certificates that you need to create local (AS2) profiles and
 * partner profiles.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * CfnCertificate cfnCertificate = CfnCertificate.Builder.create(this, "MyCfnCertificate")
 * .certificate("certificate")
 * .usage("usage")
 * // the properties below are optional
 * .activeDate("activeDate")
 * .certificateChain("certificateChain")
 * .description("description")
 * .inactiveDate("inactiveDate")
 * .privateKey("privateKey")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html)
 */
@CdkDslMarker
public class CfnCertificateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnCertificate.Builder = CfnCertificate.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * An optional date that specifies when the certificate becomes active.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-activedate)
     *
     * @param activeDate An optional date that specifies when the certificate becomes active.
     */
    public fun activeDate(activeDate: String) {
        cdkBuilder.activeDate(activeDate)
    }

    /**
     * The file name for the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-certificate)
     *
     * @param certificate The file name for the certificate.
     */
    public fun certificate(certificate: String) {
        cdkBuilder.certificate(certificate)
    }

    /**
     * The list of certificates that make up the chain for the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-certificatechain)
     *
     * @param certificateChain The list of certificates that make up the chain for the certificate.
     */
    public fun certificateChain(certificateChain: String) {
        cdkBuilder.certificateChain(certificateChain)
    }

    /**
     * The name or description that's used to identity the certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-description)
     *
     * @param description The name or description that's used to identity the certificate.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * An optional date that specifies when the certificate becomes inactive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-inactivedate)
     *
     * @param inactiveDate An optional date that specifies when the certificate becomes inactive.
     */
    public fun inactiveDate(inactiveDate: String) {
        cdkBuilder.inactiveDate(inactiveDate)
    }

    /**
     * The file that contains the private key for the certificate that's being imported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-privatekey)
     *
     * @param privateKey The file that contains the private key for the certificate that's being
     *   imported.
     */
    public fun privateKey(privateKey: String) {
        cdkBuilder.privateKey(privateKey)
    }

    /**
     * Key-value pairs that can be used to group and search for certificates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-tags)
     *
     * @param tags Key-value pairs that can be used to group and search for certificates.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Key-value pairs that can be used to group and search for certificates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-tags)
     *
     * @param tags Key-value pairs that can be used to group and search for certificates.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * Specifies whether this certificate is used for signing or encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-certificate.html#cfn-transfer-certificate-usage)
     *
     * @param usage Specifies whether this certificate is used for signing or encryption.
     */
    public fun usage(usage: String) {
        cdkBuilder.usage(usage)
    }

    public fun build(): CfnCertificate {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
