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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnService
import software.constructs.Construct

/**
 * The `AWS::ECS::Service` resource creates an Amazon Elastic Container Service (Amazon ECS) service
 * that runs and maintains the requested number of tasks and associated load balancers.
 *
 * The stack update fails if you change any properties that require replacement and at least one
 * Amazon ECS Service Connect `ServiceConnectService` is configured. This is because AWS
 * CloudFormation creates the replacement service first, but each `ServiceConnectService` must have
 * a name that is unique in the namespace. &gt; Starting April 15, 2023, AWS ; will not onboard new
 * customers to Amazon Elastic Inference (EI), and will help current customers migrate their
 * workloads to options that offer better price and performance. After April 15, 2023, new customers
 * will not be able to launch instances with Amazon EI accelerators in Amazon SageMaker, Amazon ECS
 * , or Amazon EC2 . However, customers who have used Amazon EI at least once during the past 30-day
 * period are considered current customers and will be able to continue using the service.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * CfnService cfnService = CfnService.Builder.create(this, "MyCfnService")
 * .capacityProviderStrategy(List.of(CapacityProviderStrategyItemProperty.builder()
 * .base(123)
 * .capacityProvider("capacityProvider")
 * .weight(123)
 * .build()))
 * .cluster("cluster")
 * .deploymentConfiguration(DeploymentConfigurationProperty.builder()
 * .alarms(DeploymentAlarmsProperty.builder()
 * .alarmNames(List.of("alarmNames"))
 * .enable(false)
 * .rollback(false)
 * .build())
 * .deploymentCircuitBreaker(DeploymentCircuitBreakerProperty.builder()
 * .enable(false)
 * .rollback(false)
 * .build())
 * .maximumPercent(123)
 * .minimumHealthyPercent(123)
 * .build())
 * .deploymentController(DeploymentControllerProperty.builder()
 * .type("type")
 * .build())
 * .desiredCount(123)
 * .enableEcsManagedTags(false)
 * .enableExecuteCommand(false)
 * .healthCheckGracePeriodSeconds(123)
 * .launchType("launchType")
 * .loadBalancers(List.of(LoadBalancerProperty.builder()
 * .containerName("containerName")
 * .containerPort(123)
 * .loadBalancerName("loadBalancerName")
 * .targetGroupArn("targetGroupArn")
 * .build()))
 * .networkConfiguration(NetworkConfigurationProperty.builder()
 * .awsvpcConfiguration(AwsVpcConfigurationProperty.builder()
 * .assignPublicIp("assignPublicIp")
 * .securityGroups(List.of("securityGroups"))
 * .subnets(List.of("subnets"))
 * .build())
 * .build())
 * .placementConstraints(List.of(PlacementConstraintProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .expression("expression")
 * .build()))
 * .placementStrategies(List.of(PlacementStrategyProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .field("field")
 * .build()))
 * .platformVersion("platformVersion")
 * .propagateTags("propagateTags")
 * .role("role")
 * .schedulingStrategy("schedulingStrategy")
 * .serviceConnectConfiguration(ServiceConnectConfigurationProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .logConfiguration(LogConfigurationProperty.builder()
 * .logDriver("logDriver")
 * .options(Map.of(
 * "optionsKey", "options"))
 * .secretOptions(List.of(SecretProperty.builder()
 * .name("name")
 * .valueFrom("valueFrom")
 * .build()))
 * .build())
 * .namespace("namespace")
 * .services(List.of(ServiceConnectServiceProperty.builder()
 * .portName("portName")
 * // the properties below are optional
 * .clientAliases(List.of(ServiceConnectClientAliasProperty.builder()
 * .port(123)
 * // the properties below are optional
 * .dnsName("dnsName")
 * .build()))
 * .discoveryName("discoveryName")
 * .ingressPortOverride(123)
 * .timeout(TimeoutConfigurationProperty.builder()
 * .idleTimeoutSeconds(123)
 * .perRequestTimeoutSeconds(123)
 * .build())
 * .tls(ServiceConnectTlsConfigurationProperty.builder()
 * .issuerCertificateAuthority(ServiceConnectTlsCertificateAuthorityProperty.builder()
 * .awsPcaAuthorityArn("awsPcaAuthorityArn")
 * .build())
 * // the properties below are optional
 * .kmsKey("kmsKey")
 * .roleArn("roleArn")
 * .build())
 * .build()))
 * .build())
 * .serviceName("serviceName")
 * .serviceRegistries(List.of(ServiceRegistryProperty.builder()
 * .containerName("containerName")
 * .containerPort(123)
 * .port(123)
 * .registryArn("registryArn")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .taskDefinition("taskDefinition")
 * .volumeConfigurations(List.of(ServiceVolumeConfigurationProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .managedEbsVolume(ServiceManagedEBSVolumeConfigurationProperty.builder()
 * .roleArn("roleArn")
 * // the properties below are optional
 * .encrypted(false)
 * .filesystemType("filesystemType")
 * .iops(123)
 * .kmsKeyId("kmsKeyId")
 * .sizeInGiB(123)
 * .snapshotId("snapshotId")
 * .tagSpecifications(List.of(EBSTagSpecificationProperty.builder()
 * .resourceType("resourceType")
 * // the properties below are optional
 * .propagateTags("propagateTags")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * .throughput(123)
 * .volumeType("volumeType")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html)
 */
@CdkDslMarker
public class CfnServiceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnService.Builder = CfnService.Builder.create(scope, id)

    private val _capacityProviderStrategy: MutableList<Any> = mutableListOf()

    private val _loadBalancers: MutableList<Any> = mutableListOf()

    private val _placementConstraints: MutableList<Any> = mutableListOf()

    private val _placementStrategies: MutableList<Any> = mutableListOf()

    private val _serviceRegistries: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _volumeConfigurations: MutableList<Any> = mutableListOf()

    /**
     * The capacity provider strategy to use for the service.
     *
     * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If
     * no `capacityProviderStrategy` or `launchType` is specified, the
     * `defaultCapacityProviderStrategy` for the cluster is used.
     *
     * A capacity provider strategy may contain a maximum of 6 capacity providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-capacityproviderstrategy)
     *
     * @param capacityProviderStrategy The capacity provider strategy to use for the service.
     */
    public fun capacityProviderStrategy(vararg capacityProviderStrategy: Any) {
        _capacityProviderStrategy.addAll(listOf(*capacityProviderStrategy))
    }

    /**
     * The capacity provider strategy to use for the service.
     *
     * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If
     * no `capacityProviderStrategy` or `launchType` is specified, the
     * `defaultCapacityProviderStrategy` for the cluster is used.
     *
     * A capacity provider strategy may contain a maximum of 6 capacity providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-capacityproviderstrategy)
     *
     * @param capacityProviderStrategy The capacity provider strategy to use for the service.
     */
    public fun capacityProviderStrategy(capacityProviderStrategy: Collection<Any>) {
        _capacityProviderStrategy.addAll(capacityProviderStrategy)
    }

    /**
     * The capacity provider strategy to use for the service.
     *
     * If a `capacityProviderStrategy` is specified, the `launchType` parameter must be omitted. If
     * no `capacityProviderStrategy` or `launchType` is specified, the
     * `defaultCapacityProviderStrategy` for the cluster is used.
     *
     * A capacity provider strategy may contain a maximum of 6 capacity providers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-capacityproviderstrategy)
     *
     * @param capacityProviderStrategy The capacity provider strategy to use for the service.
     */
    public fun capacityProviderStrategy(capacityProviderStrategy: IResolvable) {
        cdkBuilder.capacityProviderStrategy(capacityProviderStrategy)
    }

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that you run your service
     * on.
     *
     * If you do not specify a cluster, the default cluster is assumed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-cluster)
     *
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that you run
     *   your service on.
     */
    public fun cluster(cluster: String) {
        cdkBuilder.cluster(cluster)
    }

    /**
     * Optional deployment parameters that control how many tasks run during the deployment and the
     * ordering of stopping and starting tasks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentconfiguration)
     *
     * @param deploymentConfiguration Optional deployment parameters that control how many tasks run
     *   during the deployment and the ordering of stopping and starting tasks.
     */
    public fun deploymentConfiguration(deploymentConfiguration: IResolvable) {
        cdkBuilder.deploymentConfiguration(deploymentConfiguration)
    }

    /**
     * Optional deployment parameters that control how many tasks run during the deployment and the
     * ordering of stopping and starting tasks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentconfiguration)
     *
     * @param deploymentConfiguration Optional deployment parameters that control how many tasks run
     *   during the deployment and the ordering of stopping and starting tasks.
     */
    public fun deploymentConfiguration(
        deploymentConfiguration: CfnService.DeploymentConfigurationProperty
    ) {
        cdkBuilder.deploymentConfiguration(deploymentConfiguration)
    }

    /**
     * The deployment controller to use for the service.
     *
     * If no deployment controller is specified, the default value of `ECS` is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentcontroller)
     *
     * @param deploymentController The deployment controller to use for the service.
     */
    public fun deploymentController(deploymentController: IResolvable) {
        cdkBuilder.deploymentController(deploymentController)
    }

    /**
     * The deployment controller to use for the service.
     *
     * If no deployment controller is specified, the default value of `ECS` is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-deploymentcontroller)
     *
     * @param deploymentController The deployment controller to use for the service.
     */
    public fun deploymentController(deploymentController: CfnService.DeploymentControllerProperty) {
        cdkBuilder.deploymentController(deploymentController)
    }

    /**
     * The number of instantiations of the specified task definition to place and keep running in
     * your service.
     *
     * For new services, if a desired count is not specified, a default value of `1` is used. When
     * using the `DAEMON` scheduling strategy, the desired count is not required.
     *
     * For existing services, if a desired count is not specified, it is omitted from the operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-desiredcount)
     *
     * @param desiredCount The number of instantiations of the specified task definition to place
     *   and keep running in your service.
     */
    public fun desiredCount(desiredCount: Number) {
        cdkBuilder.desiredCount(desiredCount)
    }

    /**
     * Specifies whether to turn on Amazon ECS managed tags for the tasks within the service.
     *
     * For more information, see
     * [Tagging your Amazon ECS resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * When you use Amazon ECS managed tags, you need to set the `propagateTags` request parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-enableecsmanagedtags)
     *
     * @param enableEcsManagedTags Specifies whether to turn on Amazon ECS managed tags for the
     *   tasks within the service.
     */
    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    /**
     * Specifies whether to turn on Amazon ECS managed tags for the tasks within the service.
     *
     * For more information, see
     * [Tagging your Amazon ECS resources](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * When you use Amazon ECS managed tags, you need to set the `propagateTags` request parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-enableecsmanagedtags)
     *
     * @param enableEcsManagedTags Specifies whether to turn on Amazon ECS managed tags for the
     *   tasks within the service.
     */
    public fun enableEcsManagedTags(enableEcsManagedTags: IResolvable) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    /**
     * Determines whether the execute command functionality is turned on for the service.
     *
     * If `true` , the execute command functionality is turned on for all containers in tasks as
     * part of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-enableexecutecommand)
     *
     * @param enableExecuteCommand Determines whether the execute command functionality is turned on
     *   for the service.
     */
    public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    /**
     * Determines whether the execute command functionality is turned on for the service.
     *
     * If `true` , the execute command functionality is turned on for all containers in tasks as
     * part of the service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-enableexecutecommand)
     *
     * @param enableExecuteCommand Determines whether the execute command functionality is turned on
     *   for the service.
     */
    public fun enableExecuteCommand(enableExecuteCommand: IResolvable) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    /**
     * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy
     * Elastic Load Balancing target health checks after a task has first started.
     *
     * This is only used when your service is configured to use a load balancer. If your service has
     * a load balancer defined and you don't specify a health check grace period value, the default
     * value of `0` is used.
     *
     * If you do not use an Elastic Load Balancing, we recommend that you use the `startPeriod` in
     * the task definition health check parameters. For more information, see
     * [Health check](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_HealthCheck.html)
     * .
     *
     * If your service's tasks take a while to start and respond to Elastic Load Balancing health
     * checks, you can specify a health check grace period of up to 2,147,483,647 seconds (about 69
     * years). During that time, the Amazon ECS service scheduler ignores health check status. This
     * grace period can prevent the service scheduler from marking tasks as unhealthy and stopping
     * them before they have time to come up.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-healthcheckgraceperiodseconds)
     *
     * @param healthCheckGracePeriodSeconds The period of time, in seconds, that the Amazon ECS
     *   service scheduler ignores unhealthy Elastic Load Balancing target health checks after a
     *   task has first started.
     */
    public fun healthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds: Number) {
        cdkBuilder.healthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds)
    }

    /**
     * The launch type on which to run your service.
     *
     * For more information, see
     * [Amazon ECS Launch Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-launchtype)
     *
     * @param launchType The launch type on which to run your service.
     */
    public fun launchType(launchType: String) {
        cdkBuilder.launchType(launchType)
    }

    /**
     * A list of load balancer objects to associate with the service.
     *
     * If you specify the `Role` property, `LoadBalancers` must be specified as well. For
     * information about the number of load balancers that you can specify per service, see
     * [Service Load Balancing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-loadbalancers)
     *
     * @param loadBalancers A list of load balancer objects to associate with the service.
     */
    public fun loadBalancers(vararg loadBalancers: Any) {
        _loadBalancers.addAll(listOf(*loadBalancers))
    }

    /**
     * A list of load balancer objects to associate with the service.
     *
     * If you specify the `Role` property, `LoadBalancers` must be specified as well. For
     * information about the number of load balancers that you can specify per service, see
     * [Service Load Balancing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-loadbalancers)
     *
     * @param loadBalancers A list of load balancer objects to associate with the service.
     */
    public fun loadBalancers(loadBalancers: Collection<Any>) {
        _loadBalancers.addAll(loadBalancers)
    }

    /**
     * A list of load balancer objects to associate with the service.
     *
     * If you specify the `Role` property, `LoadBalancers` must be specified as well. For
     * information about the number of load balancers that you can specify per service, see
     * [Service Load Balancing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-load-balancing.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-loadbalancers)
     *
     * @param loadBalancers A list of load balancer objects to associate with the service.
     */
    public fun loadBalancers(loadBalancers: IResolvable) {
        cdkBuilder.loadBalancers(loadBalancers)
    }

    /**
     * The network configuration for the service.
     *
     * This parameter is required for task definitions that use the `awsvpc` network mode to receive
     * their own elastic network interface, and it is not supported for other network modes. For
     * more information, see
     * [Task Networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-networkconfiguration)
     *
     * @param networkConfiguration The network configuration for the service.
     */
    public fun networkConfiguration(networkConfiguration: IResolvable) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    /**
     * The network configuration for the service.
     *
     * This parameter is required for task definitions that use the `awsvpc` network mode to receive
     * their own elastic network interface, and it is not supported for other network modes. For
     * more information, see
     * [Task Networking](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-networkconfiguration)
     *
     * @param networkConfiguration The network configuration for the service.
     */
    public fun networkConfiguration(networkConfiguration: CfnService.NetworkConfigurationProperty) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    /**
     * An array of placement constraint objects to use for tasks in your service.
     *
     * You can specify a maximum of 10 constraints for each task. This limit includes constraints in
     * the task definition and those specified at runtime.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints)
     *
     * @param placementConstraints An array of placement constraint objects to use for tasks in your
     *   service.
     */
    public fun placementConstraints(vararg placementConstraints: Any) {
        _placementConstraints.addAll(listOf(*placementConstraints))
    }

    /**
     * An array of placement constraint objects to use for tasks in your service.
     *
     * You can specify a maximum of 10 constraints for each task. This limit includes constraints in
     * the task definition and those specified at runtime.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints)
     *
     * @param placementConstraints An array of placement constraint objects to use for tasks in your
     *   service.
     */
    public fun placementConstraints(placementConstraints: Collection<Any>) {
        _placementConstraints.addAll(placementConstraints)
    }

    /**
     * An array of placement constraint objects to use for tasks in your service.
     *
     * You can specify a maximum of 10 constraints for each task. This limit includes constraints in
     * the task definition and those specified at runtime.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints)
     *
     * @param placementConstraints An array of placement constraint objects to use for tasks in your
     *   service.
     */
    public fun placementConstraints(placementConstraints: IResolvable) {
        cdkBuilder.placementConstraints(placementConstraints)
    }

    /**
     * The placement strategy objects to use for tasks in your service.
     *
     * You can specify a maximum of 5 strategy rules for each service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies)
     *
     * @param placementStrategies The placement strategy objects to use for tasks in your service.
     */
    public fun placementStrategies(vararg placementStrategies: Any) {
        _placementStrategies.addAll(listOf(*placementStrategies))
    }

    /**
     * The placement strategy objects to use for tasks in your service.
     *
     * You can specify a maximum of 5 strategy rules for each service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies)
     *
     * @param placementStrategies The placement strategy objects to use for tasks in your service.
     */
    public fun placementStrategies(placementStrategies: Collection<Any>) {
        _placementStrategies.addAll(placementStrategies)
    }

    /**
     * The placement strategy objects to use for tasks in your service.
     *
     * You can specify a maximum of 5 strategy rules for each service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies)
     *
     * @param placementStrategies The placement strategy objects to use for tasks in your service.
     */
    public fun placementStrategies(placementStrategies: IResolvable) {
        cdkBuilder.placementStrategies(placementStrategies)
    }

    /**
     * The platform version that your tasks in the service are running on.
     *
     * A platform version is specified only for tasks using the Fargate launch type. If one isn't
     * specified, the `LATEST` platform version is used. For more information, see
     * [AWS Fargate platform versions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * Default: - "LATEST"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-platformversion)
     *
     * @param platformVersion The platform version that your tasks in the service are running on.
     */
    public fun platformVersion(platformVersion: String) {
        cdkBuilder.platformVersion(platformVersion)
    }

    /**
     * Specifies whether to propagate the tags from the task definition to the task.
     *
     * If no value is specified, the tags aren't propagated. Tags can only be propagated to the task
     * during task creation. To add tags to a task after task creation, use the
     * [TagResource](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_TagResource.html)
     * API action.
     *
     * The default is `NONE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-propagatetags)
     *
     * @param propagateTags Specifies whether to propagate the tags from the task definition to the
     *   task.
     */
    public fun propagateTags(propagateTags: String) {
        cdkBuilder.propagateTags(propagateTags)
    }

    /**
     * The name or full Amazon Resource Name (ARN) of the IAM role that allows Amazon ECS to make
     * calls to your load balancer on your behalf.
     *
     * This parameter is only permitted if you are using a load balancer with your service and your
     * task definition doesn't use the `awsvpc` network mode. If you specify the `role` parameter,
     * you must also specify a load balancer object with the `loadBalancers` parameter.
     *
     * If your account has already created the Amazon ECS service-linked role, that role is used for
     * your service unless you specify a role here. The service-linked role is required if your task
     * definition uses the `awsvpc` network mode or if the service is configured to use service
     * discovery, an external deployment controller, multiple target groups, or Elastic Inference
     * accelerators in which case you don't specify a role here. For more information, see
     * [Using service-linked roles for Amazon ECS](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * If your specified role has a path other than `/` , then you must either specify the full role
     * ARN (this is recommended) or prefix the role name with the path. For example, if a role with
     * the name `bar` has a path of `/foo/` then you would specify `/foo/bar` as the role name. For
     * more information, see
     * [Friendly names and paths](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names)
     * in the *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-role)
     *
     * @param role The name or full Amazon Resource Name (ARN) of the IAM role that allows Amazon
     *   ECS to make calls to your load balancer on your behalf.
     */
    public fun role(role: String) {
        cdkBuilder.role(role)
    }

    /**
     * The scheduling strategy to use for the service. For more information, see
     * [Services](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html) .
     *
     * There are two service scheduler strategies available:
     * * `REPLICA` -The replica scheduling strategy places and maintains the desired number of tasks
     *   across your cluster. By default, the service scheduler spreads tasks across Availability
     *   Zones. You can use task placement strategies and constraints to customize task placement
     *   decisions. This scheduler strategy is required if the service uses the `CODE_DEPLOY` or
     *   `EXTERNAL` deployment controller types.
     * * `DAEMON` -The daemon scheduling strategy deploys exactly one task on each active container
     *   instance that meets all of the task placement constraints that you specify in your cluster.
     *   The service scheduler also evaluates the task placement constraints for running tasks and
     *   will stop tasks that don't meet the placement constraints. When you're using this strategy,
     *   you don't need to specify a desired number of tasks, a task placement strategy, or use
     *   Service Auto Scaling policies.
     *
     * Tasks using the Fargate launch type or the `CODE_DEPLOY` or `EXTERNAL` deployment controller
     * types don't support the `DAEMON` scheduling strategy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-schedulingstrategy)
     *
     * @param schedulingStrategy The scheduling strategy to use for the service. For more
     *   information, see
     *   [Services](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html) .
     */
    public fun schedulingStrategy(schedulingStrategy: String) {
        cdkBuilder.schedulingStrategy(schedulingStrategy)
    }

    /**
     * The configuration for this service to discover and connect to services, and be discovered by,
     * and connected from, other services within a namespace.
     *
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect
     * through a managed proxy container that collects logs and metrics for increased visibility.
     * Only the tasks that Amazon ECS services create are supported with Service Connect. For more
     * information, see
     * [Service Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceconnectconfiguration)
     *
     * @param serviceConnectConfiguration The configuration for this service to discover and connect
     *   to services, and be discovered by, and connected from, other services within a namespace.
     */
    public fun serviceConnectConfiguration(serviceConnectConfiguration: IResolvable) {
        cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration)
    }

    /**
     * The configuration for this service to discover and connect to services, and be discovered by,
     * and connected from, other services within a namespace.
     *
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect
     * through a managed proxy container that collects logs and metrics for increased visibility.
     * Only the tasks that Amazon ECS services create are supported with Service Connect. For more
     * information, see
     * [Service Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceconnectconfiguration)
     *
     * @param serviceConnectConfiguration The configuration for this service to discover and connect
     *   to services, and be discovered by, and connected from, other services within a namespace.
     */
    public fun serviceConnectConfiguration(
        serviceConnectConfiguration: CfnService.ServiceConnectConfigurationProperty
    ) {
        cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration)
    }

    /**
     * The name of your service.
     *
     * Up to 255 letters (uppercase and lowercase), numbers, underscores, and hyphens are allowed.
     * Service names must be unique within a cluster, but you can have similarly named services in
     * multiple clusters within a Region or across multiple Regions.
     *
     * The stack update fails if you change any properties that require replacement and the
     * `ServiceName` is configured. This is because AWS CloudFormation creates the replacement
     * service first, but each `ServiceName` must be unique in the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-servicename)
     *
     * @param serviceName The name of your service.
     */
    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    /**
     * The details of the service discovery registry to associate with this service. For more
     * information, see
     * [Service discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html)
     * .
     *
     * Each service may be associated with one service registry. Multiple service registries for
     * each service isn't supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceregistries)
     *
     * @param serviceRegistries The details of the service discovery registry to associate with this
     *   service. For more information, see
     *   [Service discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html)
     *   .
     */
    public fun serviceRegistries(vararg serviceRegistries: Any) {
        _serviceRegistries.addAll(listOf(*serviceRegistries))
    }

    /**
     * The details of the service discovery registry to associate with this service. For more
     * information, see
     * [Service discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html)
     * .
     *
     * Each service may be associated with one service registry. Multiple service registries for
     * each service isn't supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceregistries)
     *
     * @param serviceRegistries The details of the service discovery registry to associate with this
     *   service. For more information, see
     *   [Service discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html)
     *   .
     */
    public fun serviceRegistries(serviceRegistries: Collection<Any>) {
        _serviceRegistries.addAll(serviceRegistries)
    }

    /**
     * The details of the service discovery registry to associate with this service. For more
     * information, see
     * [Service discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html)
     * .
     *
     * Each service may be associated with one service registry. Multiple service registries for
     * each service isn't supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceregistries)
     *
     * @param serviceRegistries The details of the service discovery registry to associate with this
     *   service. For more information, see
     *   [Service discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html)
     *   .
     */
    public fun serviceRegistries(serviceRegistries: IResolvable) {
        cdkBuilder.serviceRegistries(serviceRegistries)
    }

    /**
     * The metadata that you apply to the service to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define. When a service is
     * deleted, the tags are deleted as well.
     *
     * The following basic restrictions apply to tags:
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     *   services may have restrictions on allowed characters. Generally allowed characters are:
     *   letters, numbers, and spaces representable in UTF-8, and the following characters: + - = .
     *   _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-tags)
     *
     * @param tags The metadata that you apply to the service to help you categorize and organize
     *   them.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The metadata that you apply to the service to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value, both of which you define. When a service is
     * deleted, the tags are deleted as well.
     *
     * The following basic restrictions apply to tags:
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     *   services may have restrictions on allowed characters. Generally allowed characters are:
     *   letters, numbers, and spaces representable in UTF-8, and the following characters: + - = .
     *   _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-tags)
     *
     * @param tags The metadata that you apply to the service to help you categorize and organize
     *   them.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The `family` and `revision` ( `family:revision` ) or full ARN of the task definition to run
     * in your service.
     *
     * If a `revision` isn't specified, the latest `ACTIVE` revision is used.
     *
     * A task definition must be specified if the service uses either the `ECS` or `CODE_DEPLOY`
     * deployment controllers.
     *
     * For more information about deployment types, see
     * [Amazon ECS deployment types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-taskdefinition)
     *
     * @param taskDefinition The `family` and `revision` ( `family:revision` ) or full ARN of the
     *   task definition to run in your service.
     */
    public fun taskDefinition(taskDefinition: String) {
        cdkBuilder.taskDefinition(taskDefinition)
    }

    /**
     * The configuration for a volume specified in the task definition as a volume that is
     * configured at launch time.
     *
     * Currently, the only supported volume type is an Amazon EBS volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-volumeconfigurations)
     *
     * @param volumeConfigurations The configuration for a volume specified in the task definition
     *   as a volume that is configured at launch time.
     */
    public fun volumeConfigurations(vararg volumeConfigurations: Any) {
        _volumeConfigurations.addAll(listOf(*volumeConfigurations))
    }

    /**
     * The configuration for a volume specified in the task definition as a volume that is
     * configured at launch time.
     *
     * Currently, the only supported volume type is an Amazon EBS volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-volumeconfigurations)
     *
     * @param volumeConfigurations The configuration for a volume specified in the task definition
     *   as a volume that is configured at launch time.
     */
    public fun volumeConfigurations(volumeConfigurations: Collection<Any>) {
        _volumeConfigurations.addAll(volumeConfigurations)
    }

    /**
     * The configuration for a volume specified in the task definition as a volume that is
     * configured at launch time.
     *
     * Currently, the only supported volume type is an Amazon EBS volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-volumeconfigurations)
     *
     * @param volumeConfigurations The configuration for a volume specified in the task definition
     *   as a volume that is configured at launch time.
     */
    public fun volumeConfigurations(volumeConfigurations: IResolvable) {
        cdkBuilder.volumeConfigurations(volumeConfigurations)
    }

    public fun build(): CfnService {
        if (_capacityProviderStrategy.isNotEmpty())
            cdkBuilder.capacityProviderStrategy(_capacityProviderStrategy)
        if (_loadBalancers.isNotEmpty()) cdkBuilder.loadBalancers(_loadBalancers)
        if (_placementConstraints.isNotEmpty())
            cdkBuilder.placementConstraints(_placementConstraints)
        if (_placementStrategies.isNotEmpty()) cdkBuilder.placementStrategies(_placementStrategies)
        if (_serviceRegistries.isNotEmpty()) cdkBuilder.serviceRegistries(_serviceRegistries)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_volumeConfigurations.isNotEmpty())
            cdkBuilder.volumeConfigurations(_volumeConfigurations)
        return cdkBuilder.build()
    }
}
