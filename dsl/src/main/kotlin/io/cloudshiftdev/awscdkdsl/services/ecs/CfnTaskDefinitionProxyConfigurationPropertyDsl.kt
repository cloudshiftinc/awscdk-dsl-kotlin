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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

/**
 * The configuration details for the App Mesh proxy.
 *
 * For tasks that use the EC2 launch type, the container instances require at least version 1.26.0
 * of the container agent and at least version 1.26.0-1 of the `ecs-init` package to use a proxy
 * configuration. If your container instances are launched from the Amazon ECS optimized AMI version
 * `20190301` or later, then they contain the required versions of the container agent and
 * `ecs-init` . For more information, see
 * [Amazon ECS-optimized Linux AMI](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-optimized_AMI.html)
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * ProxyConfigurationProperty proxyConfigurationProperty = ProxyConfigurationProperty.builder()
 * .containerName("containerName")
 * // the properties below are optional
 * .proxyConfigurationProperties(List.of(KeyValuePairProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-proxyconfiguration.html)
 */
@CdkDslMarker
public class CfnTaskDefinitionProxyConfigurationPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.ProxyConfigurationProperty.Builder =
        CfnTaskDefinition.ProxyConfigurationProperty.builder()

    private val _proxyConfigurationProperties: MutableList<Any> = mutableListOf()

    /** @param containerName The name of the container that will serve as the App Mesh proxy. */
    public fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
    }

    /**
     * @param proxyConfigurationProperties The set of network configuration parameters to provide
     *   the Container Network Interface (CNI) plugin, specified as key-value pairs.
     * * `IgnoredUID` - (Required) The user ID (UID) of the proxy container as defined by the `user`
     *   parameter in a container definition. This is used to ensure the proxy ignores its own
     *   traffic. If `IgnoredGID` is specified, this field can be empty.
     * * `IgnoredGID` - (Required) The group ID (GID) of the proxy container as defined by the
     *   `user` parameter in a container definition. This is used to ensure the proxy ignores its
     *   own traffic. If `IgnoredUID` is specified, this field can be empty.
     * * `AppPorts` - (Required) The list of ports that the application uses. Network traffic to
     *   these ports is forwarded to the `ProxyIngressPort` and `ProxyEgressPort` .
     * * `ProxyIngressPort` - (Required) Specifies the port that incoming traffic to the `AppPorts`
     *   is directed to.
     * * `ProxyEgressPort` - (Required) Specifies the port that outgoing traffic from the `AppPorts`
     *   is directed to.
     * * `EgressIgnoredPorts` - (Required) The egress traffic going to the specified ports is
     *   ignored and not redirected to the `ProxyEgressPort` . It can be an empty list.
     * * `EgressIgnoredIPs` - (Required) The egress traffic going to the specified IP addresses is
     *   ignored and not redirected to the `ProxyEgressPort` . It can be an empty list.
     */
    public fun proxyConfigurationProperties(vararg proxyConfigurationProperties: Any) {
        _proxyConfigurationProperties.addAll(listOf(*proxyConfigurationProperties))
    }

    /**
     * @param proxyConfigurationProperties The set of network configuration parameters to provide
     *   the Container Network Interface (CNI) plugin, specified as key-value pairs.
     * * `IgnoredUID` - (Required) The user ID (UID) of the proxy container as defined by the `user`
     *   parameter in a container definition. This is used to ensure the proxy ignores its own
     *   traffic. If `IgnoredGID` is specified, this field can be empty.
     * * `IgnoredGID` - (Required) The group ID (GID) of the proxy container as defined by the
     *   `user` parameter in a container definition. This is used to ensure the proxy ignores its
     *   own traffic. If `IgnoredUID` is specified, this field can be empty.
     * * `AppPorts` - (Required) The list of ports that the application uses. Network traffic to
     *   these ports is forwarded to the `ProxyIngressPort` and `ProxyEgressPort` .
     * * `ProxyIngressPort` - (Required) Specifies the port that incoming traffic to the `AppPorts`
     *   is directed to.
     * * `ProxyEgressPort` - (Required) Specifies the port that outgoing traffic from the `AppPorts`
     *   is directed to.
     * * `EgressIgnoredPorts` - (Required) The egress traffic going to the specified ports is
     *   ignored and not redirected to the `ProxyEgressPort` . It can be an empty list.
     * * `EgressIgnoredIPs` - (Required) The egress traffic going to the specified IP addresses is
     *   ignored and not redirected to the `ProxyEgressPort` . It can be an empty list.
     */
    public fun proxyConfigurationProperties(proxyConfigurationProperties: Collection<Any>) {
        _proxyConfigurationProperties.addAll(proxyConfigurationProperties)
    }

    /**
     * @param proxyConfigurationProperties The set of network configuration parameters to provide
     *   the Container Network Interface (CNI) plugin, specified as key-value pairs.
     * * `IgnoredUID` - (Required) The user ID (UID) of the proxy container as defined by the `user`
     *   parameter in a container definition. This is used to ensure the proxy ignores its own
     *   traffic. If `IgnoredGID` is specified, this field can be empty.
     * * `IgnoredGID` - (Required) The group ID (GID) of the proxy container as defined by the
     *   `user` parameter in a container definition. This is used to ensure the proxy ignores its
     *   own traffic. If `IgnoredUID` is specified, this field can be empty.
     * * `AppPorts` - (Required) The list of ports that the application uses. Network traffic to
     *   these ports is forwarded to the `ProxyIngressPort` and `ProxyEgressPort` .
     * * `ProxyIngressPort` - (Required) Specifies the port that incoming traffic to the `AppPorts`
     *   is directed to.
     * * `ProxyEgressPort` - (Required) Specifies the port that outgoing traffic from the `AppPorts`
     *   is directed to.
     * * `EgressIgnoredPorts` - (Required) The egress traffic going to the specified ports is
     *   ignored and not redirected to the `ProxyEgressPort` . It can be an empty list.
     * * `EgressIgnoredIPs` - (Required) The egress traffic going to the specified IP addresses is
     *   ignored and not redirected to the `ProxyEgressPort` . It can be an empty list.
     */
    public fun proxyConfigurationProperties(proxyConfigurationProperties: IResolvable) {
        cdkBuilder.proxyConfigurationProperties(proxyConfigurationProperties)
    }

    /** @param type The proxy type. The only supported value is `APPMESH` . */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnTaskDefinition.ProxyConfigurationProperty {
        if (_proxyConfigurationProperties.isNotEmpty())
            cdkBuilder.proxyConfigurationProperties(_proxyConfigurationProperties)
        return cdkBuilder.build()
    }
}
