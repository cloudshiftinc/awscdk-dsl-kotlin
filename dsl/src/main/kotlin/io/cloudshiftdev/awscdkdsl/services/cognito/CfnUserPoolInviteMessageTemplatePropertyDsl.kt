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
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPool

/**
 * The message template to be used for the welcome message to new users.
 *
 * See also
 * [Customizing User Invitation Messages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * InviteMessageTemplateProperty inviteMessageTemplateProperty =
 * InviteMessageTemplateProperty.builder()
 * .emailMessage("emailMessage")
 * .emailSubject("emailSubject")
 * .smsMessage("smsMessage")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html)
 */
@CdkDslMarker
public class CfnUserPoolInviteMessageTemplatePropertyDsl {
    private val cdkBuilder: CfnUserPool.InviteMessageTemplateProperty.Builder =
        CfnUserPool.InviteMessageTemplateProperty.builder()

    /**
     * @param emailMessage The message template for email messages. EmailMessage is allowed only if
     *   [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
     *   is DEVELOPER.
     */
    public fun emailMessage(emailMessage: String) {
        cdkBuilder.emailMessage(emailMessage)
    }

    /**
     * @param emailSubject The subject line for email messages. EmailSubject is allowed only if
     *   [EmailSendingAccount](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_EmailConfigurationType.html#CognitoUserPools-Type-EmailConfigurationType-EmailSendingAccount)
     *   is DEVELOPER.
     */
    public fun emailSubject(emailSubject: String) {
        cdkBuilder.emailSubject(emailSubject)
    }

    /** @param smsMessage The message template for SMS messages. */
    public fun smsMessage(smsMessage: String) {
        cdkBuilder.smsMessage(smsMessage)
    }

    public fun build(): CfnUserPool.InviteMessageTemplateProperty = cdkBuilder.build()
}
