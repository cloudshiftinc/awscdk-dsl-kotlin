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

package io.cloudshiftdev.awscdkdsl.services.qldb

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.qldb.CfnStream

/**
 * The configuration settings of the Amazon Kinesis Data Streams destination for an Amazon QLDB
 * journal stream.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.qldb.*;
 * KinesisConfigurationProperty kinesisConfigurationProperty =
 * KinesisConfigurationProperty.builder()
 * .aggregationEnabled(false)
 * .streamArn("streamArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qldb-stream-kinesisconfiguration.html)
 */
@CdkDslMarker
public class CfnStreamKinesisConfigurationPropertyDsl {
    private val cdkBuilder: CfnStream.KinesisConfigurationProperty.Builder =
        CfnStream.KinesisConfigurationProperty.builder()

    /**
     * @param aggregationEnabled Enables QLDB to publish multiple data records in a single Kinesis
     *   Data Streams record, increasing the number of records sent per API call. Default: `True`
     *
     * Record aggregation has important implications for processing records and requires
     * de-aggregation in your stream consumer. To learn more, see
     * [KPL Key Concepts](https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html)
     * and
     * [Consumer De-aggregation](https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-consumer-deaggregation.html)
     * in the *Amazon Kinesis Data Streams Developer Guide* .
     */
    public fun aggregationEnabled(aggregationEnabled: Boolean) {
        cdkBuilder.aggregationEnabled(aggregationEnabled)
    }

    /**
     * @param aggregationEnabled Enables QLDB to publish multiple data records in a single Kinesis
     *   Data Streams record, increasing the number of records sent per API call. Default: `True`
     *
     * Record aggregation has important implications for processing records and requires
     * de-aggregation in your stream consumer. To learn more, see
     * [KPL Key Concepts](https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html)
     * and
     * [Consumer De-aggregation](https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-consumer-deaggregation.html)
     * in the *Amazon Kinesis Data Streams Developer Guide* .
     */
    public fun aggregationEnabled(aggregationEnabled: IResolvable) {
        cdkBuilder.aggregationEnabled(aggregationEnabled)
    }

    /** @param streamArn The Amazon Resource Name (ARN) of the Kinesis Data Streams resource. */
    public fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
    }

    public fun build(): CfnStream.KinesisConfigurationProperty = cdkBuilder.build()
}
