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

package io.cloudshiftdev.awscdkdsl.services.iotevents

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

/**
 * Information required to publish the MQTT message through the AWS IoT message broker.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotevents.*;
 * IotTopicPublishProperty iotTopicPublishProperty = IotTopicPublishProperty.builder()
 * .mqttTopic("mqttTopic")
 * // the properties below are optional
 * .payload(PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iottopicpublish.html)
 */
@CdkDslMarker
public class CfnDetectorModelIotTopicPublishPropertyDsl {
    private val cdkBuilder: CfnDetectorModel.IotTopicPublishProperty.Builder =
        CfnDetectorModel.IotTopicPublishProperty.builder()

    /**
     * @param mqttTopic The MQTT topic of the message. You can use a string expression that includes
     *   variables ( `$variable.&lt;variable-name&gt;` ) and input values (
     *   `$input.&lt;input-name&gt;.&lt;path-to-datum&gt;` ) as the topic string.
     */
    public fun mqttTopic(mqttTopic: String) {
        cdkBuilder.mqttTopic(mqttTopic)
    }

    /**
     * @param payload You can configure the action payload when you publish a message to an AWS IoT
     *   Core topic.
     */
    public fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload)
    }

    /**
     * @param payload You can configure the action payload when you publish a message to an AWS IoT
     *   Core topic.
     */
    public fun payload(payload: CfnDetectorModel.PayloadProperty) {
        cdkBuilder.payload(payload)
    }

    public fun build(): CfnDetectorModel.IotTopicPublishProperty = cdkBuilder.build()
}
