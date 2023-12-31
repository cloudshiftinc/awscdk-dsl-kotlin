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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cassandra.CfnTable

/**
 * Defines an individual column within the clustering key.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cassandra.*;
 * ClusteringKeyColumnProperty clusteringKeyColumnProperty = ClusteringKeyColumnProperty.builder()
 * .column(ColumnProperty.builder()
 * .columnName("columnName")
 * .columnType("columnType")
 * .build())
 * // the properties below are optional
 * .orderBy("orderBy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-clusteringkeycolumn.html)
 */
@CdkDslMarker
public class CfnTableClusteringKeyColumnPropertyDsl {
    private val cdkBuilder: CfnTable.ClusteringKeyColumnProperty.Builder =
        CfnTable.ClusteringKeyColumnProperty.builder()

    /** @param column The name and data type of this clustering key column. */
    public fun column(column: IResolvable) {
        cdkBuilder.column(column)
    }

    /** @param column The name and data type of this clustering key column. */
    public fun column(column: CfnTable.ColumnProperty) {
        cdkBuilder.column(column)
    }

    /**
     * @param orderBy The order in which this column's data is stored:.
     * * `ASC` (default) - The column's data is stored in ascending order.
     * * `DESC` - The column's data is stored in descending order.
     */
    public fun orderBy(orderBy: String) {
        cdkBuilder.orderBy(orderBy)
    }

    public fun build(): CfnTable.ClusteringKeyColumnProperty = cdkBuilder.build()
}
