package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.applicationautoscaling.ScalingInterval
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.CapacityProviderStrategy
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import io.cloudshiftdev.awscdk.services.ecs.DeploymentCircuitBreaker
import io.cloudshiftdev.awscdk.services.ecs.DeploymentController
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import io.cloudshiftdev.awscdk.services.ecs.FargateService
import io.cloudshiftdev.awscdk.services.ecs.FargateTaskDefinition
import io.cloudshiftdev.awscdk.services.ecs.HealthCheck
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.LogDriver
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.ecs.RuntimePlatform
import io.cloudshiftdev.awscdk.services.ecs.Secret
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class QueueProcessingFargateService internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateService,
) : QueueProcessingServiceBase(cdkObject) {
  public open fun service(): FargateService = unwrap(this).getService().let(FargateService::wrap)

  public open fun taskDefinition(): FargateTaskDefinition =
      unwrap(this).getTaskDefinition().let(FargateTaskDefinition::wrap)

  public interface Builder {
    public fun assignPublicIp(assignPublicIp: Boolean) {
    }

    public
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>) {
    }

    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1a13a051c572cfab0cbb890f588ab5c5792f47fc440c95396da62370d106383")
    public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit) {
    }

    public fun cluster(cluster: ICluster) {
    }

    public fun command(command: List<String>) {
    }

    public fun containerName(containerName: String) {
    }

    public fun cooldown(cooldown: Duration) {
    }

    public fun cpu(cpu: Number) {
    }

    public fun cpuTargetUtilizationPercent(cpuTargetUtilizationPercent: Number) {
    }

    public fun deploymentController(deploymentController: DeploymentController) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f12de726142aa9f89b123b40e7b7aa9bb1ac170f001fe65b6bd0999e41c15aaa")
    public fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit) {
    }

    public fun disableCpuBasedScaling(disableCpuBasedScaling: Boolean) {
    }

    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
    }

    public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
    }

    public fun enableLogging(enableLogging: Boolean) {
    }

    public fun environment(environment: Map<String, String>) {
    }

    public fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
    }

    public fun family(family: String) {
    }

    public fun healthCheck(healthCheck: HealthCheck) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da5a7971c845e3598a76c1861d1848d91dcb77e996123167092de622a2b12b39")
    public fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit) {
    }

    public fun image(image: ContainerImage) {
    }

    public fun logDriver(logDriver: LogDriver) {
    }

    public fun maxHealthyPercent(maxHealthyPercent: Number) {
    }

    public fun maxReceiveCount(maxReceiveCount: Number) {
    }

    public fun maxScalingCapacity(maxScalingCapacity: Number) {
    }

    public fun memoryLimitMiB(memoryLimitMiB: Number) {
    }

    public fun minHealthyPercent(minHealthyPercent: Number) {
    }

    public fun minScalingCapacity(minScalingCapacity: Number) {
    }

    public fun platformVersion(platformVersion: FargatePlatformVersion) {
    }

    public fun propagateTags(propagateTags: PropagatedTagSource) {
    }

    public fun queue(queue: IQueue) {
    }

    public fun retentionPeriod(retentionPeriod: Duration) {
    }

    public fun runtimePlatform(runtimePlatform: RuntimePlatform) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eeb750a6d0db3fb1b949f8821bd6ba56805bc3c6e80afa9135f07aa0bba7bd7f")
    public fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit) {
    }

    public fun scalingSteps(scalingSteps: List<ScalingInterval>) {
    }

    public fun secrets(secrets: Map<String, Secret>) {
    }

    public fun securityGroups(securityGroups: List<ISecurityGroup>) {
    }

    public fun serviceName(serviceName: String) {
    }

    public fun taskDefinition(taskDefinition: FargateTaskDefinition) {
    }

    public fun taskSubnets(taskSubnets: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23c2e8ff83ca375d76ffdcb2c21cca961b4b2585533f4b396c10695a163b8626")
    public fun taskSubnets(taskSubnets: SubnetSelection.Builder.() -> Unit) {
    }

    public fun visibilityTimeout(visibilityTimeout: Duration) {
    }

    public fun vpc(vpc: IVpc) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateService.Builder =
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateService.Builder.create(scope,
        id)

    public override fun assignPublicIp(assignPublicIp: Boolean) {
      cdkBuilder.assignPublicIp(assignPublicIp)
    }

    public override
        fun capacityProviderStrategies(capacityProviderStrategies: List<CapacityProviderStrategy>) {
      cdkBuilder.capacityProviderStrategies(capacityProviderStrategies.map(CapacityProviderStrategy::unwrap))
    }

    public override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
      cdkBuilder.circuitBreaker(circuitBreaker.let(DeploymentCircuitBreaker::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d1a13a051c572cfab0cbb890f588ab5c5792f47fc440c95396da62370d106383")
    public override fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker.Builder.() -> Unit):
        Unit = circuitBreaker(DeploymentCircuitBreaker(circuitBreaker))

    public override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    public override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    public override fun containerName(containerName: String) {
      cdkBuilder.containerName(containerName)
    }

    public override fun cooldown(cooldown: Duration) {
      cdkBuilder.cooldown(cooldown.let(Duration::unwrap))
    }

    public override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    public override fun cpuTargetUtilizationPercent(cpuTargetUtilizationPercent: Number) {
      cdkBuilder.cpuTargetUtilizationPercent(cpuTargetUtilizationPercent)
    }

    public override fun deploymentController(deploymentController: DeploymentController) {
      cdkBuilder.deploymentController(deploymentController.let(DeploymentController::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f12de726142aa9f89b123b40e7b7aa9bb1ac170f001fe65b6bd0999e41c15aaa")
    public override
        fun deploymentController(deploymentController: DeploymentController.Builder.() -> Unit):
        Unit = deploymentController(DeploymentController(deploymentController))

    public override fun disableCpuBasedScaling(disableCpuBasedScaling: Boolean) {
      cdkBuilder.disableCpuBasedScaling(disableCpuBasedScaling)
    }

    public override fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
      cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    public override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    public override fun enableLogging(enableLogging: Boolean) {
      cdkBuilder.enableLogging(enableLogging)
    }

    public override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    public override fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
      cdkBuilder.ephemeralStorageGiB(ephemeralStorageGiB)
    }

    public override fun family(family: String) {
      cdkBuilder.family(family)
    }

    public override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da5a7971c845e3598a76c1861d1848d91dcb77e996123167092de622a2b12b39")
    public override fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
        healthCheck(HealthCheck(healthCheck))

    public override fun image(image: ContainerImage) {
      cdkBuilder.image(image.let(ContainerImage::unwrap))
    }

    public override fun logDriver(logDriver: LogDriver) {
      cdkBuilder.logDriver(logDriver.let(LogDriver::unwrap))
    }

    public override fun maxHealthyPercent(maxHealthyPercent: Number) {
      cdkBuilder.maxHealthyPercent(maxHealthyPercent)
    }

    public override fun maxReceiveCount(maxReceiveCount: Number) {
      cdkBuilder.maxReceiveCount(maxReceiveCount)
    }

    public override fun maxScalingCapacity(maxScalingCapacity: Number) {
      cdkBuilder.maxScalingCapacity(maxScalingCapacity)
    }

    public override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    public override fun minHealthyPercent(minHealthyPercent: Number) {
      cdkBuilder.minHealthyPercent(minHealthyPercent)
    }

    public override fun minScalingCapacity(minScalingCapacity: Number) {
      cdkBuilder.minScalingCapacity(minScalingCapacity)
    }

    public override fun platformVersion(platformVersion: FargatePlatformVersion) {
      cdkBuilder.platformVersion(platformVersion.let(FargatePlatformVersion::unwrap))
    }

    public override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
    }

    public override fun queue(queue: IQueue) {
      cdkBuilder.queue(queue.let(IQueue::unwrap))
    }

    public override fun retentionPeriod(retentionPeriod: Duration) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(Duration::unwrap))
    }

    public override fun runtimePlatform(runtimePlatform: RuntimePlatform) {
      cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatform::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eeb750a6d0db3fb1b949f8821bd6ba56805bc3c6e80afa9135f07aa0bba7bd7f")
    public override fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit): Unit =
        runtimePlatform(RuntimePlatform(runtimePlatform))

    public override fun scalingSteps(scalingSteps: List<ScalingInterval>) {
      cdkBuilder.scalingSteps(scalingSteps.map(ScalingInterval::unwrap))
    }

    public override fun secrets(secrets: Map<String, Secret>) {
      cdkBuilder.secrets(secrets.mapValues { Secret.unwrap(it.value)})
    }

    public override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    public override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    public override fun taskDefinition(taskDefinition: FargateTaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(FargateTaskDefinition::unwrap))
    }

    public override fun taskSubnets(taskSubnets: SubnetSelection) {
      cdkBuilder.taskSubnets(taskSubnets.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23c2e8ff83ca375d76ffdcb2c21cca961b4b2585533f4b396c10695a163b8626")
    public override fun taskSubnets(taskSubnets: SubnetSelection.Builder.() -> Unit): Unit =
        taskSubnets(SubnetSelection(taskSubnets))

    public override fun visibilityTimeout(visibilityTimeout: Duration) {
      cdkBuilder.visibilityTimeout(visibilityTimeout.let(Duration::unwrap))
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateService =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): QueueProcessingFargateService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return QueueProcessingFargateService(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateService):
        QueueProcessingFargateService = QueueProcessingFargateService(cdkObject)

    internal fun unwrap(wrapped: QueueProcessingFargateService):
        software.amazon.awscdk.services.ecs.patterns.QueueProcessingFargateService =
        wrapped.cdkObject
  }
}
