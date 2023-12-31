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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

/**
 * Sends message data to an AWS IoT Analytics channel.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * IotAnalyticsActionProperty iotAnalyticsActionProperty = IotAnalyticsActionProperty.builder()
 * .channelName("channelName")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .batchMode(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-iotanalyticsaction.html)
 */
@CdkDslMarker
public class CfnTopicRuleIotAnalyticsActionPropertyDsl {
    private val cdkBuilder: CfnTopicRule.IotAnalyticsActionProperty.Builder =
        CfnTopicRule.IotAnalyticsActionProperty.builder()

    /**
     * @param batchMode Whether to process the action as a batch. The default value is `false` .
     *   When `batchMode` is `true` and the rule SQL statement evaluates to an Array, each Array
     *   element is delivered as a separate message when passed by
     *   [`BatchPutMessage`](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_BatchPutMessage.html)
     *   The resulting array can't have more than 100 messages.
     */
    public fun batchMode(batchMode: Boolean) {
        cdkBuilder.batchMode(batchMode)
    }

    /**
     * @param batchMode Whether to process the action as a batch. The default value is `false` .
     *   When `batchMode` is `true` and the rule SQL statement evaluates to an Array, each Array
     *   element is delivered as a separate message when passed by
     *   [`BatchPutMessage`](https://docs.aws.amazon.com/iotanalytics/latest/APIReference/API_BatchPutMessage.html)
     *   The resulting array can't have more than 100 messages.
     */
    public fun batchMode(batchMode: IResolvable) {
        cdkBuilder.batchMode(batchMode)
    }

    /**
     * @param channelName The name of the IoT Analytics channel to which message data will be sent.
     */
    public fun channelName(channelName: String) {
        cdkBuilder.channelName(channelName)
    }

    /**
     * @param roleArn The ARN of the role which has a policy that grants IoT Analytics permission to
     *   send message data via IoT Analytics (iotanalytics:BatchPutMessage).
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnTopicRule.IotAnalyticsActionProperty = cdkBuilder.build()
}
