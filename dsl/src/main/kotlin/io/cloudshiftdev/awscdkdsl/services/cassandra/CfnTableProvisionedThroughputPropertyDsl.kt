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

package io.cloudshiftdev.awscdkdsl.services.cassandra

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.cassandra.CfnTable

/**
 * The provisioned throughput for the table, which consists of `ReadCapacityUnits` and
 * `WriteCapacityUnits` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cassandra.*;
 * ProvisionedThroughputProperty provisionedThroughputProperty =
 * ProvisionedThroughputProperty.builder()
 * .readCapacityUnits(123)
 * .writeCapacityUnits(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-provisionedthroughput.html)
 */
@CdkDslMarker
public class CfnTableProvisionedThroughputPropertyDsl {
    private val cdkBuilder: CfnTable.ProvisionedThroughputProperty.Builder =
        CfnTable.ProvisionedThroughputProperty.builder()

    /**
     * @param readCapacityUnits The amount of read capacity that's provisioned for the table. For
     *   more information, see
     *   [Read/write capacity mode](https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html)
     *   in the *Amazon Keyspaces Developer Guide* .
     */
    public fun readCapacityUnits(readCapacityUnits: Number) {
        cdkBuilder.readCapacityUnits(readCapacityUnits)
    }

    /**
     * @param writeCapacityUnits The amount of write capacity that's provisioned for the table. For
     *   more information, see
     *   [Read/write capacity mode](https://docs.aws.amazon.com/keyspaces/latest/devguide/ReadWriteCapacityMode.html)
     *   in the *Amazon Keyspaces Developer Guide* .
     */
    public fun writeCapacityUnits(writeCapacityUnits: Number) {
        cdkBuilder.writeCapacityUnits(writeCapacityUnits)
    }

    public fun build(): CfnTable.ProvisionedThroughputProperty = cdkBuilder.build()
}
