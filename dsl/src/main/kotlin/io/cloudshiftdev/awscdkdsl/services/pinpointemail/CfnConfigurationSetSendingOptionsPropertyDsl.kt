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

package io.cloudshiftdev.awscdkdsl.services.pinpointemail

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet

/**
 * Used to enable or disable email sending for messages that use this configuration set in the
 * current AWS Region.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpointemail.*;
 * SendingOptionsProperty sendingOptionsProperty = SendingOptionsProperty.builder()
 * .sendingEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-sendingoptions.html)
 */
@CdkDslMarker
public class CfnConfigurationSetSendingOptionsPropertyDsl {
    private val cdkBuilder: CfnConfigurationSet.SendingOptionsProperty.Builder =
        CfnConfigurationSet.SendingOptionsProperty.builder()

    /**
     * @param sendingEnabled If `true` , email sending is enabled for the configuration set. If
     *   `false` , email sending is disabled for the configuration set.
     */
    public fun sendingEnabled(sendingEnabled: Boolean) {
        cdkBuilder.sendingEnabled(sendingEnabled)
    }

    /**
     * @param sendingEnabled If `true` , email sending is enabled for the configuration set. If
     *   `false` , email sending is disabled for the configuration set.
     */
    public fun sendingEnabled(sendingEnabled: IResolvable) {
        cdkBuilder.sendingEnabled(sendingEnabled)
    }

    public fun build(): CfnConfigurationSet.SendingOptionsProperty = cdkBuilder.build()
}
