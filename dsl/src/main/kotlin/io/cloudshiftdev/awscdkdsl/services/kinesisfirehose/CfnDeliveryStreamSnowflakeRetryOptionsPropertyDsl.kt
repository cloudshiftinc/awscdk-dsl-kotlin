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

package io.cloudshiftdev.awscdkdsl.services.kinesisfirehose

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream

/**
 * Specify how long Firehose retries sending data to the New Relic HTTP endpoint.
 *
 * After sending data, Firehose first waits for an acknowledgment from the HTTP endpoint. If an
 * error occurs or the acknowledgment doesn’t arrive within the acknowledgment timeout period,
 * Firehose starts the retry duration counter. It keeps retrying until the retry duration expires.
 * After that, Firehose considers it a data delivery failure and backs up the data to your Amazon S3
 * bucket. Every time that Firehose sends data to the HTTP endpoint (either the initial attempt or a
 * retry), it restarts the acknowledgement timeout counter and waits for an acknowledgement from the
 * HTTP endpoint. Even if the retry duration expires, Firehose still waits for the acknowledgment
 * until it receives it or the acknowledgement timeout period is reached. If the acknowledgment
 * times out, Firehose determines whether there's time left in the retry counter. If there is time
 * left, it retries again and repeats the logic until it receives an acknowledgment or determines
 * that the retry time has expired. If you don't want Firehose to retry sending data, set this value
 * to 0.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisfirehose.*;
 * SnowflakeRetryOptionsProperty snowflakeRetryOptionsProperty =
 * SnowflakeRetryOptionsProperty.builder()
 * .durationInSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-snowflakeretryoptions.html)
 */
@CdkDslMarker
public class CfnDeliveryStreamSnowflakeRetryOptionsPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.SnowflakeRetryOptionsProperty.Builder =
        CfnDeliveryStream.SnowflakeRetryOptionsProperty.builder()

    /**
     * @param durationInSeconds the time period where Firehose will retry sending data to the chosen
     *   HTTP endpoint.
     */
    public fun durationInSeconds(durationInSeconds: Number) {
        cdkBuilder.durationInSeconds(durationInSeconds)
    }

    public fun build(): CfnDeliveryStream.SnowflakeRetryOptionsProperty = cdkBuilder.build()
}
