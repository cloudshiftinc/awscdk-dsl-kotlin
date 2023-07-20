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
import cloudshift.awscdk.dsl.services.ecs.RuntimePlatformDsl
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ecs.CloudMapOptions
import software.amazon.awscdk.services.ecs.FargatePlatformVersion
import software.amazon.awscdk.services.ecs.FargateTaskDefinition
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.ecs.RuntimePlatform
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancedTaskImageProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsFargateServiceProps
import software.amazon.awscdk.services.ecs.patterns.ApplicationTargetProps
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ApplicationMultipleTargetGroupsFargateServicePropsDsl {
    private val cdkBuilder: ApplicationMultipleTargetGroupsFargateServiceProps.Builder =
        ApplicationMultipleTargetGroupsFargateServiceProps.builder()

    private val _loadBalancers: MutableList<ApplicationLoadBalancerProps> = mutableListOf()

    private val _targetGroups: MutableList<ApplicationTargetProps> = mutableListOf()

    public fun assignPublicIp(assignPublicIp: Boolean) {
        cdkBuilder.assignPublicIp(assignPublicIp)
    }

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

    public fun loadBalancers(loadBalancers: ApplicationLoadBalancerPropsDsl.() -> Unit) {
        _loadBalancers.add(ApplicationLoadBalancerPropsDsl().apply(loadBalancers).build())
    }

    public fun loadBalancers(loadBalancers: Collection<ApplicationLoadBalancerProps>) {
        _loadBalancers.addAll(loadBalancers)
    }

    public fun memoryLimitMiB(memoryLimitMiB: Number) {
        cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    public fun platformVersion(platformVersion: FargatePlatformVersion) {
        cdkBuilder.platformVersion(platformVersion)
    }

    public fun propagateTags(propagateTags: PropagatedTagSource) {
        cdkBuilder.propagateTags(propagateTags)
    }

    public fun runtimePlatform(block: RuntimePlatformDsl.() -> Unit = {}) {
        val builder = RuntimePlatformDsl()
        builder.apply(block)
        cdkBuilder.runtimePlatform(builder.build())
    }

    public fun runtimePlatform(runtimePlatform: RuntimePlatform) {
        cdkBuilder.runtimePlatform(runtimePlatform)
    }

    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    public fun targetGroups(targetGroups: ApplicationTargetPropsDsl.() -> Unit) {
        _targetGroups.add(ApplicationTargetPropsDsl().apply(targetGroups).build())
    }

    public fun targetGroups(targetGroups: Collection<ApplicationTargetProps>) {
        _targetGroups.addAll(targetGroups)
    }

    public fun taskDefinition(taskDefinition: FargateTaskDefinition) {
        cdkBuilder.taskDefinition(taskDefinition)
    }

    public fun taskImageOptions(block: ApplicationLoadBalancedTaskImagePropsDsl.() -> Unit = {}) {
        val builder = ApplicationLoadBalancedTaskImagePropsDsl()
        builder.apply(block)
        cdkBuilder.taskImageOptions(builder.build())
    }

    public fun taskImageOptions(taskImageOptions: ApplicationLoadBalancedTaskImageProps) {
        cdkBuilder.taskImageOptions(taskImageOptions)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): ApplicationMultipleTargetGroupsFargateServiceProps {
        if (_loadBalancers.isNotEmpty()) cdkBuilder.loadBalancers(_loadBalancers)
        if (_targetGroups.isNotEmpty()) cdkBuilder.targetGroups(_targetGroups)
        return cdkBuilder.build()
    }
}
