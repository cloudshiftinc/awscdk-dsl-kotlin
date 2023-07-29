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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.CfnDBCluster

/**
 * The `ReadEndpoint` return value specifies the reader endpoint for the DB cluster.
 *
 * The reader endpoint for a DB cluster load-balances connections across the Aurora Replicas that
 * are available in a DB cluster. As clients request new connections to the reader endpoint, Aurora
 * distributes the connection requests among the Aurora Replicas in the DB cluster. This
 * functionality can help balance your read workload across multiple Aurora Replicas in your DB
 * cluster.
 *
 * If a failover occurs, and the Aurora Replica that you are connected to is promoted to be the
 * primary instance, your connection is dropped. To continue sending your read workload to other
 * Aurora Replicas in the cluster, you can then reconnect to the reader endpoint.
 *
 * For more information about Aurora endpoints, see
 * [Amazon Aurora connection management](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/Aurora.Overview.Endpoints.html)
 * in the *Amazon Aurora User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * ReadEndpointProperty readEndpointProperty = ReadEndpointProperty.builder()
 * .address("address")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-readendpoint.html)
 */
@CdkDslMarker
public class CfnDBClusterReadEndpointPropertyDsl {
    private val cdkBuilder: CfnDBCluster.ReadEndpointProperty.Builder =
        CfnDBCluster.ReadEndpointProperty.builder()

    /** @param address The host address of the reader endpoint. */
    public fun address(address: String) {
        cdkBuilder.address(address)
    }

    public fun build(): CfnDBCluster.ReadEndpointProperty = cdkBuilder.build()
}
