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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ecs.CapacityProviderStrategy
import software.amazon.awscdk.services.ecs.CloudMapOptions
import software.amazon.awscdk.services.ecs.DeploymentAlarmConfig
import software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker
import software.amazon.awscdk.services.ecs.DeploymentController
import software.amazon.awscdk.services.ecs.ExternalServiceProps
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.ecs.ServiceConnectProps
import software.amazon.awscdk.services.ecs.TaskDefinition

/**
 * The properties for defining a service using the External launch type.
 *
 * Example:
 * ```
 * Cluster cluster;
 * TaskDefinition taskDefinition;
 * ExternalService service = ExternalService.Builder.create(this, "Service")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .desiredCount(5)
 * .build();
 * ```
 */
@CdkDslMarker
public class ExternalServicePropsDsl {
    private val cdkBuilder: ExternalServiceProps.Builder = ExternalServiceProps.builder()

    private val _capacityProviderStrategies: MutableList<CapacityProviderStrategy> = mutableListOf()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /**
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     *   service.
     */
    public fun capacityProviderStrategies(
        capacityProviderStrategies: CapacityProviderStrategyDsl.() -> Unit
    ) {
        _capacityProviderStrategies.add(
            CapacityProviderStrategyDsl().apply(capacityProviderStrategies).build()
        )
    }

    /**
     * @param capacityProviderStrategies A list of Capacity Provider strategies used to place a
     *   service.
     */
    public fun capacityProviderStrategies(
        capacityProviderStrategies: Collection<CapacityProviderStrategy>
    ) {
        _capacityProviderStrategies.addAll(capacityProviderStrategies)
    }

    /**
     * @param circuitBreaker Whether to enable the deployment circuit breaker. If this property is
     *   defined, circuit breaker will be implicitly enabled.
     */
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreakerDsl.() -> Unit = {}) {
        val builder = DeploymentCircuitBreakerDsl()
        builder.apply(circuitBreaker)
        cdkBuilder.circuitBreaker(builder.build())
    }

    /**
     * @param circuitBreaker Whether to enable the deployment circuit breaker. If this property is
     *   defined, circuit breaker will be implicitly enabled.
     */
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
        cdkBuilder.circuitBreaker(circuitBreaker)
    }

    /**
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     *   discovery.
     */
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptionsDsl.() -> Unit = {}) {
        val builder = CloudMapOptionsDsl()
        builder.apply(cloudMapOptions)
        cdkBuilder.cloudMapOptions(builder.build())
    }

    /**
     * @param cloudMapOptions The options for configuring an Amazon ECS service to use service
     *   discovery.
     */
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
        cdkBuilder.cloudMapOptions(cloudMapOptions)
    }

    /** @param cluster The name of the cluster that hosts the service. */
    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    /**
     * @param deploymentAlarms The alarm(s) to monitor during deployment, and behavior to apply if
     *   at least one enters a state of alarm during the deployment or bake time.
     */
    public fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfigDsl.() -> Unit = {}) {
        val builder = DeploymentAlarmConfigDsl()
        builder.apply(deploymentAlarms)
        cdkBuilder.deploymentAlarms(builder.build())
    }

    /**
     * @param deploymentAlarms The alarm(s) to monitor during deployment, and behavior to apply if
     *   at least one enters a state of alarm during the deployment or bake time.
     */
    public fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig) {
        cdkBuilder.deploymentAlarms(deploymentAlarms)
    }

    /**
     * @param deploymentController Specifies which deployment controller to use for the service. For
     *   more information, see
     *   [Amazon ECS Deployment Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     */
    public fun deploymentController(deploymentController: DeploymentControllerDsl.() -> Unit = {}) {
        val builder = DeploymentControllerDsl()
        builder.apply(deploymentController)
        cdkBuilder.deploymentController(builder.build())
    }

    /**
     * @param deploymentController Specifies which deployment controller to use for the service. For
     *   more information, see
     *   [Amazon ECS Deployment Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     */
    public fun deploymentController(deploymentController: DeploymentController) {
        cdkBuilder.deploymentController(deploymentController)
    }

    /**
     * @param desiredCount The desired number of instantiations of the task definition to keep
     *   running on the service.
     */
    public fun desiredCount(desiredCount: Number) {
        cdkBuilder.desiredCount(desiredCount)
    }

    /**
     * @param enableEcsManagedTags Specifies whether to enable Amazon ECS managed tags for the tasks
     *   within the service. For more information, see
     *   [Tagging Your Amazon ECS Resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     */
    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    /** @param enableExecuteCommand Whether to enable the ability to execute into a container. */
    public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    /**
     * @param healthCheckGracePeriod The period of time, in seconds, that the Amazon ECS service
     *   scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has
     *   first started.
     */
    public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
        cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod)
    }

    /**
     * @param maxHealthyPercent The maximum number of tasks, specified as a percentage of the Amazon
     *   ECS service's DesiredCount value, that can run in a service during a deployment.
     */
    public fun maxHealthyPercent(maxHealthyPercent: Number) {
        cdkBuilder.maxHealthyPercent(maxHealthyPercent)
    }

    /**
     * @param minHealthyPercent The minimum number of tasks, specified as a percentage of the Amazon
     *   ECS service's DesiredCount value, that must continue to run and remain healthy during a
     *   deployment.
     */
    public fun minHealthyPercent(minHealthyPercent: Number) {
        cdkBuilder.minHealthyPercent(minHealthyPercent)
    }

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     *   service to the tasks in the service. Valid values are: PropagatedTagSource.SERVICE,
     *   PropagatedTagSource.TASK_DEFINITION or PropagatedTagSource.NONE
     */
    public fun propagateTags(propagateTags: PropagatedTagSource) {
        cdkBuilder.propagateTags(propagateTags)
    }

    /**
     * @param securityGroups The security groups to associate with the service. If you do not
     *   specify a security group, a new security group is created.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * @param securityGroups The security groups to associate with the service. If you do not
     *   specify a security group, a new security group is created.
     */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /** @param serviceConnectConfiguration Configuration for Service Connect. */
    public fun serviceConnectConfiguration(
        serviceConnectConfiguration: ServiceConnectPropsDsl.() -> Unit = {}
    ) {
        val builder = ServiceConnectPropsDsl()
        builder.apply(serviceConnectConfiguration)
        cdkBuilder.serviceConnectConfiguration(builder.build())
    }

    /** @param serviceConnectConfiguration Configuration for Service Connect. */
    public fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps) {
        cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration)
    }

    /** @param serviceName The name of the service. */
    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    /**
     * @param taskDefinition The task definition to use for tasks in the service.
     *   [disable-awslint:ref-via-interface]
     */
    public fun taskDefinition(taskDefinition: TaskDefinition) {
        cdkBuilder.taskDefinition(taskDefinition)
    }

    public fun build(): ExternalServiceProps {
        if (_capacityProviderStrategies.isNotEmpty())
            cdkBuilder.capacityProviderStrategies(_capacityProviderStrategies)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
