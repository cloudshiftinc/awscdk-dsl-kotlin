@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ecs.CloudMapOptionsDsl
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ecs.CloudMapOptions
import software.amazon.awscdk.services.ecs.Ec2TaskDefinition
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.PlacementConstraint
import software.amazon.awscdk.services.ecs.PlacementStrategy
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageProps
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancerProps
import software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsEc2Service
import software.amazon.awscdk.services.ecs.patterns.NetworkTargetProps
import software.constructs.Construct
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class NetworkMultipleTargetGroupsEc2ServiceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: NetworkMultipleTargetGroupsEc2Service.Builder =
        NetworkMultipleTargetGroupsEc2Service.Builder.create(scope, id)

    private val _loadBalancers: MutableList<NetworkLoadBalancerProps> = mutableListOf()

    private val _placementConstraints: MutableList<PlacementConstraint> = mutableListOf()

    private val _placementStrategies: MutableList<PlacementStrategy> = mutableListOf()

    private val _targetGroups: MutableList<NetworkTargetProps> = mutableListOf()

    public fun cloudMapOptions(block: CloudMapOptionsDsl.() -> Unit = {}) {
        val builder = CloudMapOptionsDsl()
        builder.apply(block)
        cdkBuilder.cloudMapOptions(builder.build())
    }

    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
        cdkBuilder.cloudMapOptions(cloudMapOptions)
    }

    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    public fun cpu(cpu: Number) {
        cdkBuilder.cpu(cpu)
    }

    public fun desiredCount(desiredCount: Number) {
        cdkBuilder.desiredCount(desiredCount)
    }

    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
        cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod)
    }

    public fun loadBalancers(loadBalancers: NetworkLoadBalancerPropsDsl.() -> Unit) {
        _loadBalancers.add(NetworkLoadBalancerPropsDsl().apply(loadBalancers).build())
    }

    public fun loadBalancers(loadBalancers: Collection<NetworkLoadBalancerProps>) {
        _loadBalancers.addAll(loadBalancers)
    }

    public fun memoryLimitMiB(memoryLimitMiB: Number) {
        cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    public fun memoryReservationMiB(memoryReservationMiB: Number) {
        cdkBuilder.memoryReservationMiB(memoryReservationMiB)
    }

    public fun placementConstraints(vararg placementConstraints: PlacementConstraint) {
        _placementConstraints.addAll(listOf(*placementConstraints))
    }

    public fun placementConstraints(placementConstraints: Collection<PlacementConstraint>) {
        _placementConstraints.addAll(placementConstraints)
    }

    public fun placementStrategies(vararg placementStrategies: PlacementStrategy) {
        _placementStrategies.addAll(listOf(*placementStrategies))
    }

    public fun placementStrategies(placementStrategies: Collection<PlacementStrategy>) {
        _placementStrategies.addAll(placementStrategies)
    }

    public fun propagateTags(propagateTags: PropagatedTagSource) {
        cdkBuilder.propagateTags(propagateTags)
    }

    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    public fun targetGroups(targetGroups: NetworkTargetPropsDsl.() -> Unit) {
        _targetGroups.add(NetworkTargetPropsDsl().apply(targetGroups).build())
    }

    public fun targetGroups(targetGroups: Collection<NetworkTargetProps>) {
        _targetGroups.addAll(targetGroups)
    }

    public fun taskDefinition(taskDefinition: Ec2TaskDefinition) {
        cdkBuilder.taskDefinition(taskDefinition)
    }

    public fun taskImageOptions(block: NetworkLoadBalancedTaskImagePropsDsl.() -> Unit = {}) {
        val builder = NetworkLoadBalancedTaskImagePropsDsl()
        builder.apply(block)
        cdkBuilder.taskImageOptions(builder.build())
    }

    public fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageProps) {
        cdkBuilder.taskImageOptions(taskImageOptions)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): NetworkMultipleTargetGroupsEc2Service {
        if (_loadBalancers.isNotEmpty()) cdkBuilder.loadBalancers(_loadBalancers)
        if (_placementConstraints.isNotEmpty()) cdkBuilder.placementConstraints(_placementConstraints)
        if (_placementStrategies.isNotEmpty()) cdkBuilder.placementStrategies(_placementStrategies)
        if (_targetGroups.isNotEmpty()) cdkBuilder.targetGroups(_targetGroups)
        return cdkBuilder.build()
    }
}
