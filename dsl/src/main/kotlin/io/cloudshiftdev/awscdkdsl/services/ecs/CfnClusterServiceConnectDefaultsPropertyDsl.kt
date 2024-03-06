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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnCluster

/**
 * Use this parameter to set a default Service Connect namespace.
 *
 * After you set a default Service Connect namespace, any new services with Service Connect turned
 * on that are created in the cluster are added as client services in the namespace. This setting
 * only applies to new services that set the `enabled` parameter to `true` in the
 * `ServiceConnectConfiguration` . You can set the namespace of each service individually in the
 * `ServiceConnectConfiguration` to override this default parameter.
 *
 * Tasks that run in a namespace can use short names to connect to services in the namespace. Tasks
 * can connect to services across all of the clusters in the namespace. Tasks connect through a
 * managed proxy container that collects logs and metrics for increased visibility. Only the tasks
 * that Amazon ECS services create are supported with Service Connect. For more information, see
 * [Service Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html)
 * in the *Amazon Elastic Container Service Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * ServiceConnectDefaultsProperty serviceConnectDefaultsProperty =
 * ServiceConnectDefaultsProperty.builder()
 * .namespace("namespace")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-serviceconnectdefaults.html)
 */
@CdkDslMarker
public class CfnClusterServiceConnectDefaultsPropertyDsl {
    private val cdkBuilder: CfnCluster.ServiceConnectDefaultsProperty.Builder =
        CfnCluster.ServiceConnectDefaultsProperty.builder()

    /**
     * @param namespace The namespace name or full Amazon Resource Name (ARN) of the AWS Cloud Map
     *   namespace that's used when you create a service and don't specify a Service Connect
     *   configuration. The namespace name can include up to 1024 characters. The name is
     *   case-sensitive. The name can't include hyphens (-), tilde (~), greater than (&gt;), less
     *   than (&lt;), or slash (/).
     *
     * If you enter an existing namespace name or ARN, then that namespace will be used. Any
     * namespace type is supported. The namespace must be in this account and this AWS Region.
     *
     * If you enter a new name, a AWS Cloud Map namespace will be created. Amazon ECS creates a AWS
     * Cloud Map namespace with the "API calls" method of instance discovery only. This instance
     * discovery method is the "HTTP" namespace type in the AWS Command Line Interface . Other types
     * of instance discovery aren't used by Service Connect.
     *
     * If you update the cluster with an empty string `""` for the namespace name, the cluster
     * configuration for Service Connect is removed. Note that the namespace will remain in AWS
     * Cloud Map and must be deleted separately.
     *
     * For more information about AWS Cloud Map , see
     * [Working with Services](https://docs.aws.amazon.com/cloud-map/latest/dg/working-with-services.html)
     * in the *AWS Cloud Map Developer Guide* .
     */
    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    public fun build(): CfnCluster.ServiceConnectDefaultsProperty = cdkBuilder.build()
}
