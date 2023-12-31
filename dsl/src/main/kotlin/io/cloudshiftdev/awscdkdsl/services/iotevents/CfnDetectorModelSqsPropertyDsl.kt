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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

/**
 * Sends information about the detector model instance and the event that triggered the action to an
 * Amazon SQS queue.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotevents.*;
 * SqsProperty sqsProperty = SqsProperty.builder()
 * .queueUrl("queueUrl")
 * // the properties below are optional
 * .payload(PayloadProperty.builder()
 * .contentExpression("contentExpression")
 * .type("type")
 * .build())
 * .useBase64(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-sqs.html)
 */
@CdkDslMarker
public class CfnDetectorModelSqsPropertyDsl {
    private val cdkBuilder: CfnDetectorModel.SqsProperty.Builder =
        CfnDetectorModel.SqsProperty.builder()

    /**
     * @param payload You can configure the action payload when you send a message to an Amazon SQS
     *   queue.
     */
    public fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload)
    }

    /**
     * @param payload You can configure the action payload when you send a message to an Amazon SQS
     *   queue.
     */
    public fun payload(payload: CfnDetectorModel.PayloadProperty) {
        cdkBuilder.payload(payload)
    }

    /** @param queueUrl The URL of the SQS queue where the data is written. */
    public fun queueUrl(queueUrl: String) {
        cdkBuilder.queueUrl(queueUrl)
    }

    /**
     * @param useBase64 Set this to TRUE if you want the data to be base-64 encoded before it is
     *   written to the queue. Otherwise, set this to FALSE.
     */
    public fun useBase64(useBase64: Boolean) {
        cdkBuilder.useBase64(useBase64)
    }

    /**
     * @param useBase64 Set this to TRUE if you want the data to be base-64 encoded before it is
     *   written to the queue. Otherwise, set this to FALSE.
     */
    public fun useBase64(useBase64: IResolvable) {
        cdkBuilder.useBase64(useBase64)
    }

    public fun build(): CfnDetectorModel.SqsProperty = cdkBuilder.build()
}
