package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ecs.CloudMapOptions
import io.cloudshiftdev.awscdk.services.ecs.Ec2Service
import io.cloudshiftdev.awscdk.services.ecs.Ec2TaskDefinition
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PlacementConstraint
import io.cloudshiftdev.awscdk.services.ecs.PlacementStrategy
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.NetworkTargetGroup
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class NetworkMultipleTargetGroupsEc2Service internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsEc2Service,
) : NetworkMultipleTargetGroupsServiceBase(cdkObject) {
  public open fun service(): Ec2Service = unwrap(this).getService().let(Ec2Service::wrap)

  @Deprecated(message = "deprecated in CDK")
  public open fun targetGroup(): NetworkTargetGroup =
      unwrap(this).getTargetGroup().let(NetworkTargetGroup::wrap)

  public open fun taskDefinition(): Ec2TaskDefinition =
      unwrap(this).getTaskDefinition().let(Ec2TaskDefinition::wrap)

  public interface Builder {
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b19dccf3564112370f3bbbf5ed02f2d29169055da6d5d1d6efd818a7c1b4df69")
    public fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit) {
    }

    public fun cluster(cluster: ICluster) {
    }

    public fun cpu(cpu: Number) {
    }

    public fun desiredCount(desiredCount: Number) {
    }

    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
    }

    public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
    }

    public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
    }

    public fun loadBalancers(loadBalancers: List<NetworkLoadBalancerProps>) {
    }

    public fun memoryLimitMiB(memoryLimitMiB: Number) {
    }

    public fun memoryReservationMiB(memoryReservationMiB: Number) {
    }

    public fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
    }

    public fun placementStrategies(placementStrategies: List<PlacementStrategy>) {
    }

    public fun propagateTags(propagateTags: PropagatedTagSource) {
    }

    public fun serviceName(serviceName: String) {
    }

    public fun targetGroups(targetGroups: List<NetworkTargetProps>) {
    }

    public fun taskDefinition(taskDefinition: Ec2TaskDefinition) {
    }

    public fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageProps) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1c6966fd779d9eed7391e6dbc00f7abcd7d844c7845659cb540c87c5f495b4d")
    public
        fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageProps.Builder.() -> Unit) {
    }

    public fun vpc(vpc: IVpc) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsEc2Service.Builder =
        software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsEc2Service.Builder.create(scope,
        id)

    public override fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
      cdkBuilder.cloudMapOptions(cloudMapOptions.let(CloudMapOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b19dccf3564112370f3bbbf5ed02f2d29169055da6d5d1d6efd818a7c1b4df69")
    public override fun cloudMapOptions(cloudMapOptions: CloudMapOptions.Builder.() -> Unit): Unit =
        cloudMapOptions(CloudMapOptions(cloudMapOptions))

    public override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    public override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    public override fun desiredCount(desiredCount: Number) {
      cdkBuilder.desiredCount(desiredCount)
    }

    public override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    public override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    public override fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
      cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod.let(Duration::unwrap))
    }

    public override fun loadBalancers(loadBalancers: List<NetworkLoadBalancerProps>) {
      cdkBuilder.loadBalancers(loadBalancers.map(NetworkLoadBalancerProps::unwrap))
    }

    public override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    public override fun memoryReservationMiB(memoryReservationMiB: Number) {
      cdkBuilder.memoryReservationMiB(memoryReservationMiB)
    }

    public override fun placementConstraints(placementConstraints: List<PlacementConstraint>) {
      cdkBuilder.placementConstraints(placementConstraints.map(PlacementConstraint::unwrap))
    }

    public override fun placementStrategies(placementStrategies: List<PlacementStrategy>) {
      cdkBuilder.placementStrategies(placementStrategies.map(PlacementStrategy::unwrap))
    }

    public override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
    }

    public override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    public override fun targetGroups(targetGroups: List<NetworkTargetProps>) {
      cdkBuilder.targetGroups(targetGroups.map(NetworkTargetProps::unwrap))
    }

    public override fun taskDefinition(taskDefinition: Ec2TaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(Ec2TaskDefinition::unwrap))
    }

    public override fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageProps) {
      cdkBuilder.taskImageOptions(taskImageOptions.let(NetworkLoadBalancedTaskImageProps::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c1c6966fd779d9eed7391e6dbc00f7abcd7d844c7845659cb540c87c5f495b4d")
    public override
        fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageProps.Builder.() -> Unit):
        Unit = taskImageOptions(NetworkLoadBalancedTaskImageProps(taskImageOptions))

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsEc2Service =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): NetworkMultipleTargetGroupsEc2Service {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return NetworkMultipleTargetGroupsEc2Service(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsEc2Service):
        NetworkMultipleTargetGroupsEc2Service = NetworkMultipleTargetGroupsEc2Service(cdkObject)

    internal fun unwrap(wrapped: NetworkMultipleTargetGroupsEc2Service):
        software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsEc2Service =
        wrapped.cdkObject
  }
}
