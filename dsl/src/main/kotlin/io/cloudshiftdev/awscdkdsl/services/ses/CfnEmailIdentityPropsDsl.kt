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

package io.cloudshiftdev.awscdkdsl.services.ses

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnEmailIdentity
import software.amazon.awscdk.services.ses.CfnEmailIdentityProps

/**
 * Properties for defining a `CfnEmailIdentity`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * CfnEmailIdentityProps cfnEmailIdentityProps = CfnEmailIdentityProps.builder()
 * .emailIdentity("emailIdentity")
 * // the properties below are optional
 * .configurationSetAttributes(ConfigurationSetAttributesProperty.builder()
 * .configurationSetName("configurationSetName")
 * .build())
 * .dkimAttributes(DkimAttributesProperty.builder()
 * .signingEnabled(false)
 * .build())
 * .dkimSigningAttributes(DkimSigningAttributesProperty.builder()
 * .domainSigningPrivateKey("domainSigningPrivateKey")
 * .domainSigningSelector("domainSigningSelector")
 * .nextSigningKeyLength("nextSigningKeyLength")
 * .build())
 * .feedbackAttributes(FeedbackAttributesProperty.builder()
 * .emailForwardingEnabled(false)
 * .build())
 * .mailFromAttributes(MailFromAttributesProperty.builder()
 * .behaviorOnMxFailure("behaviorOnMxFailure")
 * .mailFromDomain("mailFromDomain")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-emailidentity.html)
 */
@CdkDslMarker
public class CfnEmailIdentityPropsDsl {
    private val cdkBuilder: CfnEmailIdentityProps.Builder = CfnEmailIdentityProps.builder()

    /**
     * @param configurationSetAttributes Used to associate a configuration set with an email
     *   identity.
     */
    public fun configurationSetAttributes(configurationSetAttributes: IResolvable) {
        cdkBuilder.configurationSetAttributes(configurationSetAttributes)
    }

    /**
     * @param configurationSetAttributes Used to associate a configuration set with an email
     *   identity.
     */
    public fun configurationSetAttributes(
        configurationSetAttributes: CfnEmailIdentity.ConfigurationSetAttributesProperty
    ) {
        cdkBuilder.configurationSetAttributes(configurationSetAttributes)
    }

    /**
     * @param dkimAttributes An object that contains information about the DKIM attributes for the
     *   identity.
     */
    public fun dkimAttributes(dkimAttributes: IResolvable) {
        cdkBuilder.dkimAttributes(dkimAttributes)
    }

    /**
     * @param dkimAttributes An object that contains information about the DKIM attributes for the
     *   identity.
     */
    public fun dkimAttributes(dkimAttributes: CfnEmailIdentity.DkimAttributesProperty) {
        cdkBuilder.dkimAttributes(dkimAttributes)
    }

    /**
     * @param dkimSigningAttributes If your request includes this object, Amazon SES configures the
     *   identity to use Bring Your Own DKIM (BYODKIM) for DKIM authentication purposes, or,
     *   configures the key length to be used for
     *   [Easy DKIM](https://docs.aws.amazon.com/ses/latest/dg/send-email-authentication-dkim-easy.html)
     *   .
     */
    public fun dkimSigningAttributes(dkimSigningAttributes: IResolvable) {
        cdkBuilder.dkimSigningAttributes(dkimSigningAttributes)
    }

    /**
     * @param dkimSigningAttributes If your request includes this object, Amazon SES configures the
     *   identity to use Bring Your Own DKIM (BYODKIM) for DKIM authentication purposes, or,
     *   configures the key length to be used for
     *   [Easy DKIM](https://docs.aws.amazon.com/ses/latest/dg/send-email-authentication-dkim-easy.html)
     *   .
     */
    public fun dkimSigningAttributes(
        dkimSigningAttributes: CfnEmailIdentity.DkimSigningAttributesProperty
    ) {
        cdkBuilder.dkimSigningAttributes(dkimSigningAttributes)
    }

    /** @param emailIdentity The email address or domain to verify. */
    public fun emailIdentity(emailIdentity: String) {
        cdkBuilder.emailIdentity(emailIdentity)
    }

    /** @param feedbackAttributes Used to enable or disable feedback forwarding for an identity. */
    public fun feedbackAttributes(feedbackAttributes: IResolvable) {
        cdkBuilder.feedbackAttributes(feedbackAttributes)
    }

    /** @param feedbackAttributes Used to enable or disable feedback forwarding for an identity. */
    public fun feedbackAttributes(feedbackAttributes: CfnEmailIdentity.FeedbackAttributesProperty) {
        cdkBuilder.feedbackAttributes(feedbackAttributes)
    }

    /**
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     *   for an email identity.
     */
    public fun mailFromAttributes(mailFromAttributes: IResolvable) {
        cdkBuilder.mailFromAttributes(mailFromAttributes)
    }

    /**
     * @param mailFromAttributes Used to enable or disable the custom Mail-From domain configuration
     *   for an email identity.
     */
    public fun mailFromAttributes(mailFromAttributes: CfnEmailIdentity.MailFromAttributesProperty) {
        cdkBuilder.mailFromAttributes(mailFromAttributes)
    }

    public fun build(): CfnEmailIdentityProps = cdkBuilder.build()
}
