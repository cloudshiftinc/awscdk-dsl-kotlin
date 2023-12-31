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
import software.amazon.awscdk.services.ses.CfnReceiptRule

/**
 * When included in a receipt rule, this action rejects the received email by returning a bounce
 * response to the sender and, optionally, publishes a notification to Amazon Simple Notification
 * Service (Amazon SNS).
 *
 * For information about sending a bounce message in response to a received email, see the
 * [Amazon SES Developer Guide](https://docs.aws.amazon.com/ses/latest/dg/receiving-email-action-bounce.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * BounceActionProperty bounceActionProperty = BounceActionProperty.builder()
 * .message("message")
 * .sender("sender")
 * .smtpReplyCode("smtpReplyCode")
 * // the properties below are optional
 * .statusCode("statusCode")
 * .topicArn("topicArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html)
 */
@CdkDslMarker
public class CfnReceiptRuleBounceActionPropertyDsl {
    private val cdkBuilder: CfnReceiptRule.BounceActionProperty.Builder =
        CfnReceiptRule.BounceActionProperty.builder()

    /** @param message Human-readable text to include in the bounce message. */
    public fun message(message: String) {
        cdkBuilder.message(message)
    }

    /**
     * @param sender The email address of the sender of the bounced email. This is the address from
     *   which the bounce message is sent.
     */
    public fun sender(sender: String) {
        cdkBuilder.sender(sender)
    }

    /**
     * @param smtpReplyCode The SMTP reply code, as defined by
     *   [RFC 5321](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc5321) .
     */
    public fun smtpReplyCode(smtpReplyCode: String) {
        cdkBuilder.smtpReplyCode(smtpReplyCode)
    }

    /**
     * @param statusCode The SMTP enhanced status code, as defined by
     *   [RFC 3463](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc3463) .
     */
    public fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
    }

    /**
     * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
     *   bounce action is taken. You can find the ARN of a topic by using the
     *   [ListTopics](https://docs.aws.amazon.com/sns/latest/api/API_ListTopics.html) operation in
     *   Amazon SNS.
     *
     * For more information about Amazon SNS topics, see the
     * [Amazon SNS Developer Guide](https://docs.aws.amazon.com/sns/latest/dg/CreateTopic.html) .
     */
    public fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
    }

    public fun build(): CfnReceiptRule.BounceActionProperty = cdkBuilder.build()
}
