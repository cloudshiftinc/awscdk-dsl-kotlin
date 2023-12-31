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

package io.cloudshiftdev.awscdkdsl.services.autoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup
import software.constructs.Construct

/**
 * The `AWS::AutoScaling::AutoScalingGroup` resource defines an Amazon EC2 Auto Scaling group, which
 * is a collection of Amazon EC2 instances that are treated as a logical grouping for the purposes
 * of automatic scaling and management.
 *
 * For more information about Amazon EC2 Auto Scaling, see the
 * [Amazon EC2 Auto Scaling User Guide](https://docs.aws.amazon.com/autoscaling/ec2/userguide/what-is-amazon-ec2-auto-scaling.html)
 * .
 *
 * Amazon EC2 Auto Scaling configures instances launched as part of an Auto Scaling group using
 * either a
 * [launch template](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-launchtemplate.html)
 * or a launch configuration. We strongly recommend that you do not use launch configurations. They
 * do not provide full functionality for Amazon EC2 Auto Scaling or Amazon EC2. For more
 * information, see
 * [Launch configurations](https://docs.aws.amazon.com/autoscaling/ec2/userguide/launch-configurations.html)
 * and
 * [Migrate AWS CloudFormation stacks from launch configurations to launch templates](https://docs.aws.amazon.com/autoscaling/ec2/userguide/migrate-launch-configurations-with-cloudformation.html)
 * in the *Amazon EC2 Auto Scaling User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * CfnAutoScalingGroup cfnAutoScalingGroup = CfnAutoScalingGroup.Builder.create(this,
 * "MyCfnAutoScalingGroup")
 * .maxSize("maxSize")
 * .minSize("minSize")
 * // the properties below are optional
 * .autoScalingGroupName("autoScalingGroupName")
 * .availabilityZones(List.of("availabilityZones"))
 * .capacityRebalance(false)
 * .context("context")
 * .cooldown("cooldown")
 * .defaultInstanceWarmup(123)
 * .desiredCapacity("desiredCapacity")
 * .desiredCapacityType("desiredCapacityType")
 * .healthCheckGracePeriod(123)
 * .healthCheckType("healthCheckType")
 * .instanceId("instanceId")
 * .launchConfigurationName("launchConfigurationName")
 * .launchTemplate(LaunchTemplateSpecificationProperty.builder()
 * .version("version")
 * // the properties below are optional
 * .launchTemplateId("launchTemplateId")
 * .launchTemplateName("launchTemplateName")
 * .build())
 * .lifecycleHookSpecificationList(List.of(LifecycleHookSpecificationProperty.builder()
 * .lifecycleHookName("lifecycleHookName")
 * .lifecycleTransition("lifecycleTransition")
 * // the properties below are optional
 * .defaultResult("defaultResult")
 * .heartbeatTimeout(123)
 * .notificationMetadata("notificationMetadata")
 * .notificationTargetArn("notificationTargetArn")
 * .roleArn("roleArn")
 * .build()))
 * .loadBalancerNames(List.of("loadBalancerNames"))
 * .maxInstanceLifetime(123)
 * .metricsCollection(List.of(MetricsCollectionProperty.builder()
 * .granularity("granularity")
 * // the properties below are optional
 * .metrics(List.of("metrics"))
 * .build()))
 * .mixedInstancesPolicy(MixedInstancesPolicyProperty.builder()
 * .launchTemplate(LaunchTemplateProperty.builder()
 * .launchTemplateSpecification(LaunchTemplateSpecificationProperty.builder()
 * .version("version")
 * // the properties below are optional
 * .launchTemplateId("launchTemplateId")
 * .launchTemplateName("launchTemplateName")
 * .build())
 * // the properties below are optional
 * .overrides(List.of(LaunchTemplateOverridesProperty.builder()
 * .instanceRequirements(InstanceRequirementsProperty.builder()
 * .acceleratorCount(AcceleratorCountRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .acceleratorManufacturers(List.of("acceleratorManufacturers"))
 * .acceleratorNames(List.of("acceleratorNames"))
 * .acceleratorTotalMemoryMiB(AcceleratorTotalMemoryMiBRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .acceleratorTypes(List.of("acceleratorTypes"))
 * .allowedInstanceTypes(List.of("allowedInstanceTypes"))
 * .bareMetal("bareMetal")
 * .baselineEbsBandwidthMbps(BaselineEbsBandwidthMbpsRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .burstablePerformance("burstablePerformance")
 * .cpuManufacturers(List.of("cpuManufacturers"))
 * .excludedInstanceTypes(List.of("excludedInstanceTypes"))
 * .instanceGenerations(List.of("instanceGenerations"))
 * .localStorage("localStorage")
 * .localStorageTypes(List.of("localStorageTypes"))
 * .memoryGiBPerVCpu(MemoryGiBPerVCpuRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .memoryMiB(MemoryMiBRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .networkBandwidthGbps(NetworkBandwidthGbpsRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .networkInterfaceCount(NetworkInterfaceCountRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .onDemandMaxPricePercentageOverLowestPrice(123)
 * .requireHibernateSupport(false)
 * .spotMaxPricePercentageOverLowestPrice(123)
 * .totalLocalStorageGb(TotalLocalStorageGBRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .vCpuCount(VCpuCountRequestProperty.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .build())
 * .instanceType("instanceType")
 * .launchTemplateSpecification(LaunchTemplateSpecificationProperty.builder()
 * .version("version")
 * // the properties below are optional
 * .launchTemplateId("launchTemplateId")
 * .launchTemplateName("launchTemplateName")
 * .build())
 * .weightedCapacity("weightedCapacity")
 * .build()))
 * .build())
 * // the properties below are optional
 * .instancesDistribution(InstancesDistributionProperty.builder()
 * .onDemandAllocationStrategy("onDemandAllocationStrategy")
 * .onDemandBaseCapacity(123)
 * .onDemandPercentageAboveBaseCapacity(123)
 * .spotAllocationStrategy("spotAllocationStrategy")
 * .spotInstancePools(123)
 * .spotMaxPrice("spotMaxPrice")
 * .build())
 * .build())
 * .newInstancesProtectedFromScaleIn(false)
 * .notificationConfigurations(List.of(NotificationConfigurationProperty.builder()
 * .topicArn("topicArn")
 * // the properties below are optional
 * .notificationTypes(List.of("notificationTypes"))
 * .build()))
 * .placementGroup("placementGroup")
 * .serviceLinkedRoleArn("serviceLinkedRoleArn")
 * .tags(List.of(TagPropertyProperty.builder()
 * .key("key")
 * .propagateAtLaunch(false)
 * .value("value")
 * .build()))
 * .targetGroupArns(List.of("targetGroupArns"))
 * .terminationPolicies(List.of("terminationPolicies"))
 * .vpcZoneIdentifier(List.of("vpcZoneIdentifier"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html)
 */
@CdkDslMarker
public class CfnAutoScalingGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAutoScalingGroup.Builder =
        CfnAutoScalingGroup.Builder.create(scope, id)

    private val _availabilityZones: MutableList<String> = mutableListOf()

    private val _lifecycleHookSpecificationList: MutableList<Any> = mutableListOf()

    private val _loadBalancerNames: MutableList<String> = mutableListOf()

    private val _metricsCollection: MutableList<Any> = mutableListOf()

    private val _notificationConfigurations: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnAutoScalingGroup.TagPropertyProperty> = mutableListOf()

    private val _targetGroupArns: MutableList<String> = mutableListOf()

    private val _terminationPolicies: MutableList<String> = mutableListOf()

    private val _vpcZoneIdentifier: MutableList<String> = mutableListOf()

    /**
     * The name of the Auto Scaling group. This name must be unique per Region per account.
     *
     * The name can contain any ASCII character 33 to 126 including most punctuation characters,
     * digits, and upper and lowercased letters.
     *
     * You cannot use a colon (:) in the name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-autoscalinggroupname)
     *
     * @param autoScalingGroupName The name of the Auto Scaling group. This name must be unique per
     *   Region per account.
     */
    public fun autoScalingGroupName(autoScalingGroupName: String) {
        cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    /**
     * A list of Availability Zones where instances in the Auto Scaling group can be created.
     *
     * Used for launching into the default VPC subnet in each Availability Zone when not using the
     * `VPCZoneIdentifier` property, or for attaching a network interface when an existing network
     * interface ID is specified in a launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-availabilityzones)
     *
     * @param availabilityZones A list of Availability Zones where instances in the Auto Scaling
     *   group can be created.
     */
    public fun availabilityZones(vararg availabilityZones: String) {
        _availabilityZones.addAll(listOf(*availabilityZones))
    }

    /**
     * A list of Availability Zones where instances in the Auto Scaling group can be created.
     *
     * Used for launching into the default VPC subnet in each Availability Zone when not using the
     * `VPCZoneIdentifier` property, or for attaching a network interface when an existing network
     * interface ID is specified in a launch template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-availabilityzones)
     *
     * @param availabilityZones A list of Availability Zones where instances in the Auto Scaling
     *   group can be created.
     */
    public fun availabilityZones(availabilityZones: Collection<String>) {
        _availabilityZones.addAll(availabilityZones)
    }

    /**
     * Indicates whether Capacity Rebalancing is enabled.
     *
     * Otherwise, Capacity Rebalancing is disabled. When you turn on Capacity Rebalancing, Amazon
     * EC2 Auto Scaling attempts to launch a Spot Instance whenever Amazon EC2 notifies that a Spot
     * Instance is at an elevated risk of interruption. After launching a new instance, it then
     * terminates an old instance. For more information, see
     * [Use Capacity Rebalancing to handle Amazon EC2 Spot Interruptions](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-capacity-rebalancing.html)
     * in the in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-capacityrebalance)
     *
     * @param capacityRebalance Indicates whether Capacity Rebalancing is enabled.
     */
    public fun capacityRebalance(capacityRebalance: Boolean) {
        cdkBuilder.capacityRebalance(capacityRebalance)
    }

    /**
     * Indicates whether Capacity Rebalancing is enabled.
     *
     * Otherwise, Capacity Rebalancing is disabled. When you turn on Capacity Rebalancing, Amazon
     * EC2 Auto Scaling attempts to launch a Spot Instance whenever Amazon EC2 notifies that a Spot
     * Instance is at an elevated risk of interruption. After launching a new instance, it then
     * terminates an old instance. For more information, see
     * [Use Capacity Rebalancing to handle Amazon EC2 Spot Interruptions](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-capacity-rebalancing.html)
     * in the in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-capacityrebalance)
     *
     * @param capacityRebalance Indicates whether Capacity Rebalancing is enabled.
     */
    public fun capacityRebalance(capacityRebalance: IResolvable) {
        cdkBuilder.capacityRebalance(capacityRebalance)
    }

    /**
     * Reserved.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-context)
     *
     * @param context Reserved.
     */
    public fun context(context: String) {
        cdkBuilder.context(context)
    }

    /**
     * *Only needed if you use simple scaling policies.*.
     *
     * The amount of time, in seconds, between one scaling activity ending and another one starting
     * due to simple scaling policies. For more information, see
     * [Scaling cooldowns for Amazon EC2 Auto Scaling](https://docs.aws.amazon.com/autoscaling/ec2/userguide/Cooldown.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Default: `300` seconds
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-cooldown)
     *
     * @param cooldown *Only needed if you use simple scaling policies.*.
     */
    public fun cooldown(cooldown: String) {
        cdkBuilder.cooldown(cooldown)
    }

    /**
     * The amount of time, in seconds, until a new instance is considered to have finished
     * initializing and resource consumption to become stable after it enters the `InService` state.
     *
     * During an instance refresh, Amazon EC2 Auto Scaling waits for the warm-up period after it
     * replaces an instance before it moves on to replacing the next instance. Amazon EC2 Auto
     * Scaling also waits for the warm-up period before aggregating the metrics for new instances
     * with existing instances in the Amazon CloudWatch metrics that are used for scaling, resulting
     * in more reliable usage data. For more information, see
     * [Set the default instance warmup for an Auto Scaling group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-default-instance-warmup.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * To manage various warm-up settings at the group level, we recommend that you set the default
     * instance warmup, *even if it is set to 0 seconds* . To remove a value that you previously
     * set, include the property but specify `-1` for the value. However, we strongly recommend
     * keeping the default instance warmup enabled by specifying a value of `0` or other nominal
     * value.
     *
     * Default: None
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-defaultinstancewarmup)
     *
     * @param defaultInstanceWarmup The amount of time, in seconds, until a new instance is
     *   considered to have finished initializing and resource consumption to become stable after it
     *   enters the `InService` state.
     */
    public fun defaultInstanceWarmup(defaultInstanceWarmup: Number) {
        cdkBuilder.defaultInstanceWarmup(defaultInstanceWarmup)
    }

    /**
     * The desired capacity is the initial capacity of the Auto Scaling group at the time of its
     * creation and the capacity it attempts to maintain.
     *
     * It can scale beyond this capacity if you configure automatic scaling.
     *
     * The number must be greater than or equal to the minimum size of the group and less than or
     * equal to the maximum size of the group. If you do not specify a desired capacity when
     * creating the stack, the default is the minimum size of the group.
     *
     * CloudFormation marks the Auto Scaling group as successful (by setting its status to
     * CREATE_COMPLETE) when the desired capacity is reached. However, if a maximum Spot price is
     * set in the launch template or launch configuration that you specified, then desired capacity
     * is not used as a criteria for success. Whether your request is fulfilled depends on Spot
     * Instance capacity and your maximum price.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-desiredcapacity)
     *
     * @param desiredCapacity The desired capacity is the initial capacity of the Auto Scaling group
     *   at the time of its creation and the capacity it attempts to maintain.
     */
    public fun desiredCapacity(desiredCapacity: String) {
        cdkBuilder.desiredCapacity(desiredCapacity)
    }

    /**
     * The unit of measurement for the value specified for desired capacity.
     *
     * Amazon EC2 Auto Scaling supports `DesiredCapacityType` for attribute-based instance type
     * selection only. For more information, see
     * [Creating an Auto Scaling group using attribute-based instance type selection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-instance-type-requirements.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * By default, Amazon EC2 Auto Scaling specifies `units` , which translates into number of
     * instances.
     *
     * Valid values: `units` | `vcpu` | `memory-mib`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-desiredcapacitytype)
     *
     * @param desiredCapacityType The unit of measurement for the value specified for desired
     *   capacity.
     */
    public fun desiredCapacityType(desiredCapacityType: String) {
        cdkBuilder.desiredCapacityType(desiredCapacityType)
    }

    /**
     * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health
     * status of an EC2 instance that has come into service and marking it unhealthy due to a failed
     * health check.
     *
     * This is useful if your instances do not immediately pass their health checks after they enter
     * the `InService` state. For more information, see
     * [Set the health check grace period for an Auto Scaling group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/health-check-grace-period.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Default: `0` seconds
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-healthcheckgraceperiod)
     *
     * @param healthCheckGracePeriod The amount of time, in seconds, that Amazon EC2 Auto Scaling
     *   waits before checking the health status of an EC2 instance that has come into service and
     *   marking it unhealthy due to a failed health check.
     */
    public fun healthCheckGracePeriod(healthCheckGracePeriod: Number) {
        cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod)
    }

    /**
     * A comma-separated value string of one or more health check types.
     *
     * The valid values are `EC2` , `ELB` , and `VPC_LATTICE` . `EC2` is the default health check
     * and cannot be disabled. For more information, see
     * [Health checks for Auto Scaling instances](https://docs.aws.amazon.com/autoscaling/ec2/userguide/healthcheck.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Only specify `EC2` if you must clear a value that was previously set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-healthchecktype)
     *
     * @param healthCheckType A comma-separated value string of one or more health check types.
     */
    public fun healthCheckType(healthCheckType: String) {
        cdkBuilder.healthCheckType(healthCheckType)
    }

    /**
     * The ID of the instance used to base the launch configuration on.
     *
     * For more information, see
     * [Create an Auto Scaling group using an EC2 instance](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-asg-from-instance.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * If you specify `LaunchTemplate` , `MixedInstancesPolicy` , or `LaunchConfigurationName` ,
     * don't specify `InstanceId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-instanceid)
     *
     * @param instanceId The ID of the instance used to base the launch configuration on.
     */
    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    /**
     * The name of the launch configuration to use to launch instances.
     *
     * Required only if you don't specify `LaunchTemplate` , `MixedInstancesPolicy` , or
     * `InstanceId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-launchconfigurationname)
     *
     * @param launchConfigurationName The name of the launch configuration to use to launch
     *   instances.
     */
    public fun launchConfigurationName(launchConfigurationName: String) {
        cdkBuilder.launchConfigurationName(launchConfigurationName)
    }

    /**
     * Information used to specify the launch template and version to use to launch instances.
     *
     * You can alternatively associate a launch template to the Auto Scaling group by specifying a
     * `MixedInstancesPolicy` . For more information about creating launch templates, see
     * [Create a launch template for an Auto Scaling group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * If you omit this property, you must specify `MixedInstancesPolicy` ,
     * `LaunchConfigurationName` , or `InstanceId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-launchtemplate)
     *
     * @param launchTemplate Information used to specify the launch template and version to use to
     *   launch instances.
     */
    public fun launchTemplate(launchTemplate: IResolvable) {
        cdkBuilder.launchTemplate(launchTemplate)
    }

    /**
     * Information used to specify the launch template and version to use to launch instances.
     *
     * You can alternatively associate a launch template to the Auto Scaling group by specifying a
     * `MixedInstancesPolicy` . For more information about creating launch templates, see
     * [Create a launch template for an Auto Scaling group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/create-launch-template.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * If you omit this property, you must specify `MixedInstancesPolicy` ,
     * `LaunchConfigurationName` , or `InstanceId` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-launchtemplate)
     *
     * @param launchTemplate Information used to specify the launch template and version to use to
     *   launch instances.
     */
    public fun launchTemplate(
        launchTemplate: CfnAutoScalingGroup.LaunchTemplateSpecificationProperty
    ) {
        cdkBuilder.launchTemplate(launchTemplate)
    }

    /**
     * One or more lifecycle hooks to add to the Auto Scaling group before instances are launched.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecificationlist)
     *
     * @param lifecycleHookSpecificationList One or more lifecycle hooks to add to the Auto Scaling
     *   group before instances are launched.
     */
    public fun lifecycleHookSpecificationList(vararg lifecycleHookSpecificationList: Any) {
        _lifecycleHookSpecificationList.addAll(listOf(*lifecycleHookSpecificationList))
    }

    /**
     * One or more lifecycle hooks to add to the Auto Scaling group before instances are launched.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecificationlist)
     *
     * @param lifecycleHookSpecificationList One or more lifecycle hooks to add to the Auto Scaling
     *   group before instances are launched.
     */
    public fun lifecycleHookSpecificationList(lifecycleHookSpecificationList: Collection<Any>) {
        _lifecycleHookSpecificationList.addAll(lifecycleHookSpecificationList)
    }

    /**
     * One or more lifecycle hooks to add to the Auto Scaling group before instances are launched.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecificationlist)
     *
     * @param lifecycleHookSpecificationList One or more lifecycle hooks to add to the Auto Scaling
     *   group before instances are launched.
     */
    public fun lifecycleHookSpecificationList(lifecycleHookSpecificationList: IResolvable) {
        cdkBuilder.lifecycleHookSpecificationList(lifecycleHookSpecificationList)
    }

    /**
     * A list of Classic Load Balancers associated with this Auto Scaling group.
     *
     * For Application Load Balancers, Network Load Balancers, and Gateway Load Balancers, specify
     * the `TargetGroupARNs` property instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-loadbalancernames)
     *
     * @param loadBalancerNames A list of Classic Load Balancers associated with this Auto Scaling
     *   group.
     */
    public fun loadBalancerNames(vararg loadBalancerNames: String) {
        _loadBalancerNames.addAll(listOf(*loadBalancerNames))
    }

    /**
     * A list of Classic Load Balancers associated with this Auto Scaling group.
     *
     * For Application Load Balancers, Network Load Balancers, and Gateway Load Balancers, specify
     * the `TargetGroupARNs` property instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-loadbalancernames)
     *
     * @param loadBalancerNames A list of Classic Load Balancers associated with this Auto Scaling
     *   group.
     */
    public fun loadBalancerNames(loadBalancerNames: Collection<String>) {
        _loadBalancerNames.addAll(loadBalancerNames)
    }

    /**
     * The maximum amount of time, in seconds, that an instance can be in service.
     *
     * The default is null. If specified, the value must be either 0 or a number equal to or greater
     * than 86,400 seconds (1 day). For more information, see
     * [Replacing Auto Scaling instances based on maximum instance lifetime](https://docs.aws.amazon.com/autoscaling/ec2/userguide/asg-max-instance-lifetime.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-maxinstancelifetime)
     *
     * @param maxInstanceLifetime The maximum amount of time, in seconds, that an instance can be in
     *   service.
     */
    public fun maxInstanceLifetime(maxInstanceLifetime: Number) {
        cdkBuilder.maxInstanceLifetime(maxInstanceLifetime)
    }

    /**
     * The maximum size of the group.
     *
     * With a mixed instances policy that uses instance weighting, Amazon EC2 Auto Scaling may need
     * to go above `MaxSize` to meet your capacity requirements. In this event, Amazon EC2 Auto
     * Scaling will never go above `MaxSize` by more than your largest instance weight (weights that
     * define how many units each instance contributes to the desired capacity of the group).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-maxsize)
     *
     * @param maxSize The maximum size of the group.
     */
    public fun maxSize(maxSize: String) {
        cdkBuilder.maxSize(maxSize)
    }

    /**
     * Enables the monitoring of group metrics of an Auto Scaling group.
     *
     * By default, these metrics are disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-metricscollection)
     *
     * @param metricsCollection Enables the monitoring of group metrics of an Auto Scaling group.
     */
    public fun metricsCollection(vararg metricsCollection: Any) {
        _metricsCollection.addAll(listOf(*metricsCollection))
    }

    /**
     * Enables the monitoring of group metrics of an Auto Scaling group.
     *
     * By default, these metrics are disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-metricscollection)
     *
     * @param metricsCollection Enables the monitoring of group metrics of an Auto Scaling group.
     */
    public fun metricsCollection(metricsCollection: Collection<Any>) {
        _metricsCollection.addAll(metricsCollection)
    }

    /**
     * Enables the monitoring of group metrics of an Auto Scaling group.
     *
     * By default, these metrics are disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-metricscollection)
     *
     * @param metricsCollection Enables the monitoring of group metrics of an Auto Scaling group.
     */
    public fun metricsCollection(metricsCollection: IResolvable) {
        cdkBuilder.metricsCollection(metricsCollection)
    }

    /**
     * The minimum size of the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-minsize)
     *
     * @param minSize The minimum size of the group.
     */
    public fun minSize(minSize: String) {
        cdkBuilder.minSize(minSize)
    }

    /**
     * An embedded object that specifies a mixed instances policy.
     *
     * The policy includes properties that not only define the distribution of On-Demand Instances
     * and Spot Instances, the maximum price to pay for Spot Instances (optional), and how the Auto
     * Scaling group allocates instance types to fulfill On-Demand and Spot capacities, but also the
     * properties that specify the instance configuration information—the launch template and
     * instance types. The policy can also include a weight for each instance type and different
     * launch templates for individual instance types.
     *
     * For more information, see
     * [Auto Scaling groups with multiple instance types and purchase options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-mixedinstancespolicy)
     *
     * @param mixedInstancesPolicy An embedded object that specifies a mixed instances policy.
     */
    public fun mixedInstancesPolicy(mixedInstancesPolicy: IResolvable) {
        cdkBuilder.mixedInstancesPolicy(mixedInstancesPolicy)
    }

    /**
     * An embedded object that specifies a mixed instances policy.
     *
     * The policy includes properties that not only define the distribution of On-Demand Instances
     * and Spot Instances, the maximum price to pay for Spot Instances (optional), and how the Auto
     * Scaling group allocates instance types to fulfill On-Demand and Spot capacities, but also the
     * properties that specify the instance configuration information—the launch template and
     * instance types. The policy can also include a weight for each instance type and different
     * launch templates for individual instance types.
     *
     * For more information, see
     * [Auto Scaling groups with multiple instance types and purchase options](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-mixed-instances-groups.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-mixedinstancespolicy)
     *
     * @param mixedInstancesPolicy An embedded object that specifies a mixed instances policy.
     */
    public fun mixedInstancesPolicy(
        mixedInstancesPolicy: CfnAutoScalingGroup.MixedInstancesPolicyProperty
    ) {
        cdkBuilder.mixedInstancesPolicy(mixedInstancesPolicy)
    }

    /**
     * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto
     * Scaling when scaling in.
     *
     * For more information about preventing instances from terminating on scale in, see
     * [Using instance scale-in protection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-protection.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-newinstancesprotectedfromscalein)
     *
     * @param newInstancesProtectedFromScaleIn Indicates whether newly launched instances are
     *   protected from termination by Amazon EC2 Auto Scaling when scaling in.
     */
    public fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: Boolean) {
        cdkBuilder.newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn)
    }

    /**
     * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto
     * Scaling when scaling in.
     *
     * For more information about preventing instances from terminating on scale in, see
     * [Using instance scale-in protection](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-instance-protection.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-newinstancesprotectedfromscalein)
     *
     * @param newInstancesProtectedFromScaleIn Indicates whether newly launched instances are
     *   protected from termination by Amazon EC2 Auto Scaling when scaling in.
     */
    public fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: IResolvable) {
        cdkBuilder.newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn)
    }

    /**
     * Configures an Auto Scaling group to send notifications when specified events take place.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-notificationconfigurations)
     *
     * @param notificationConfigurations Configures an Auto Scaling group to send notifications when
     *   specified events take place.
     */
    public fun notificationConfigurations(vararg notificationConfigurations: Any) {
        _notificationConfigurations.addAll(listOf(*notificationConfigurations))
    }

    /**
     * Configures an Auto Scaling group to send notifications when specified events take place.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-notificationconfigurations)
     *
     * @param notificationConfigurations Configures an Auto Scaling group to send notifications when
     *   specified events take place.
     */
    public fun notificationConfigurations(notificationConfigurations: Collection<Any>) {
        _notificationConfigurations.addAll(notificationConfigurations)
    }

    /**
     * Configures an Auto Scaling group to send notifications when specified events take place.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-notificationconfigurations)
     *
     * @param notificationConfigurations Configures an Auto Scaling group to send notifications when
     *   specified events take place.
     */
    public fun notificationConfigurations(notificationConfigurations: IResolvable) {
        cdkBuilder.notificationConfigurations(notificationConfigurations)
    }

    /**
     * The name of the placement group into which to launch your instances.
     *
     * For more information, see
     * [Placement groups](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html)
     * in the *Amazon EC2 User Guide for Linux Instances* .
     *
     * A *cluster* placement group is a logical grouping of instances within a single Availability
     * Zone. You cannot specify multiple Availability Zones and a cluster placement group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-placementgroup)
     *
     * @param placementGroup The name of the placement group into which to launch your instances.
     */
    public fun placementGroup(placementGroup: String) {
        cdkBuilder.placementGroup(placementGroup)
    }

    /**
     * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to
     * call other AWS service on your behalf.
     *
     * By default, Amazon EC2 Auto Scaling uses a service-linked role named
     * `AWSServiceRoleForAutoScaling` , which it creates if it does not exist. For more information,
     * see
     * [Service-linked roles](https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-service-linked-role.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-servicelinkedrolearn)
     *
     * @param serviceLinkedRoleArn The Amazon Resource Name (ARN) of the service-linked role that
     *   the Auto Scaling group uses to call other AWS service on your behalf.
     */
    public fun serviceLinkedRoleArn(serviceLinkedRoleArn: String) {
        cdkBuilder.serviceLinkedRoleArn(serviceLinkedRoleArn)
    }

    /**
     * One or more tags.
     *
     * You can tag your Auto Scaling group and propagate the tags to the Amazon EC2 instances it
     * launches. Tags are not propagated to Amazon EBS volumes. To add tags to Amazon EBS volumes,
     * specify the tags in a launch template but use caution. If the launch template specifies an
     * instance tag with a key that is also specified for the Auto Scaling group, Amazon EC2 Auto
     * Scaling overrides the value of that instance tag with the value specified by the Auto Scaling
     * group. For more information, see
     * [Tag Auto Scaling groups and instances](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-tagging.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-tags)
     *
     * @param tags One or more tags.
     */
    public fun tags(tags: CfnAutoScalingGroupTagPropertyPropertyDsl.() -> Unit) {
        _tags.add(CfnAutoScalingGroupTagPropertyPropertyDsl().apply(tags).build())
    }

    /**
     * One or more tags.
     *
     * You can tag your Auto Scaling group and propagate the tags to the Amazon EC2 instances it
     * launches. Tags are not propagated to Amazon EBS volumes. To add tags to Amazon EBS volumes,
     * specify the tags in a launch template but use caution. If the launch template specifies an
     * instance tag with a key that is also specified for the Auto Scaling group, Amazon EC2 Auto
     * Scaling overrides the value of that instance tag with the value specified by the Auto Scaling
     * group. For more information, see
     * [Tag Auto Scaling groups and instances](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-tagging.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-tags)
     *
     * @param tags One or more tags.
     */
    public fun tags(tags: Collection<CfnAutoScalingGroup.TagPropertyProperty>) {
        _tags.addAll(tags)
    }

    /**
     * The Amazon Resource Names (ARN) of the Elastic Load Balancing target groups to associate with
     * the Auto Scaling group.
     *
     * Instances are registered as targets with the target groups. The target groups receive
     * incoming traffic and route requests to one or more registered targets. For more information,
     * see
     * [Use Elastic Load Balancing to distribute traffic across the instances in your Auto Scaling group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-targetgrouparns)
     *
     * @param targetGroupArns The Amazon Resource Names (ARN) of the Elastic Load Balancing target
     *   groups to associate with the Auto Scaling group.
     */
    public fun targetGroupArns(vararg targetGroupArns: String) {
        _targetGroupArns.addAll(listOf(*targetGroupArns))
    }

    /**
     * The Amazon Resource Names (ARN) of the Elastic Load Balancing target groups to associate with
     * the Auto Scaling group.
     *
     * Instances are registered as targets with the target groups. The target groups receive
     * incoming traffic and route requests to one or more registered targets. For more information,
     * see
     * [Use Elastic Load Balancing to distribute traffic across the instances in your Auto Scaling group](https://docs.aws.amazon.com/autoscaling/ec2/userguide/autoscaling-load-balancer.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-targetgrouparns)
     *
     * @param targetGroupArns The Amazon Resource Names (ARN) of the Elastic Load Balancing target
     *   groups to associate with the Auto Scaling group.
     */
    public fun targetGroupArns(targetGroupArns: Collection<String>) {
        _targetGroupArns.addAll(targetGroupArns)
    }

    /**
     * A policy or a list of policies that are used to select the instance to terminate.
     *
     * These policies are executed in the order that you list them. For more information, see
     * [Work with Amazon EC2 Auto Scaling termination policies](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-termination-policies.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Valid values: `Default` | `AllocationStrategy` | `ClosestToNextInstanceHour` |
     * `NewestInstance` | `OldestInstance` | `OldestLaunchConfiguration` | `OldestLaunchTemplate` |
     * `arn:aws:lambda:region:account-id:function:my-function:my-alias`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-terminationpolicies)
     *
     * @param terminationPolicies A policy or a list of policies that are used to select the
     *   instance to terminate.
     */
    public fun terminationPolicies(vararg terminationPolicies: String) {
        _terminationPolicies.addAll(listOf(*terminationPolicies))
    }

    /**
     * A policy or a list of policies that are used to select the instance to terminate.
     *
     * These policies are executed in the order that you list them. For more information, see
     * [Work with Amazon EC2 Auto Scaling termination policies](https://docs.aws.amazon.com/autoscaling/ec2/userguide/ec2-auto-scaling-termination-policies.html)
     * in the *Amazon EC2 Auto Scaling User Guide* .
     *
     * Valid values: `Default` | `AllocationStrategy` | `ClosestToNextInstanceHour` |
     * `NewestInstance` | `OldestInstance` | `OldestLaunchConfiguration` | `OldestLaunchTemplate` |
     * `arn:aws:lambda:region:account-id:function:my-function:my-alias`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-terminationpolicies)
     *
     * @param terminationPolicies A policy or a list of policies that are used to select the
     *   instance to terminate.
     */
    public fun terminationPolicies(terminationPolicies: Collection<String>) {
        _terminationPolicies.addAll(terminationPolicies)
    }

    /**
     * A list of subnet IDs for a virtual private cloud (VPC) where instances in the Auto Scaling
     * group can be created.
     *
     * If this resource specifies public subnets and is also in a VPC that is defined in the same
     * stack template, you must use the
     * [DependsOn attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the
     * [VPC-gateway attachment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html)
     * .
     *
     * When you update `VPCZoneIdentifier` , this retains the same Auto Scaling group and replaces
     * old instances with new ones, according to the specified subnets. You can optionally specify
     * how CloudFormation handles these updates by using an
     * [UpdatePolicy attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html)
     * .
     *
     * Required to launch instances into a nondefault VPC. If you specify `VPCZoneIdentifier` with
     * `AvailabilityZones` , the subnets that you specify for this property must reside in those
     * Availability Zones.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-vpczoneidentifier)
     *
     * @param vpcZoneIdentifier A list of subnet IDs for a virtual private cloud (VPC) where
     *   instances in the Auto Scaling group can be created.
     */
    public fun vpcZoneIdentifier(vararg vpcZoneIdentifier: String) {
        _vpcZoneIdentifier.addAll(listOf(*vpcZoneIdentifier))
    }

    /**
     * A list of subnet IDs for a virtual private cloud (VPC) where instances in the Auto Scaling
     * group can be created.
     *
     * If this resource specifies public subnets and is also in a VPC that is defined in the same
     * stack template, you must use the
     * [DependsOn attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
     * to declare a dependency on the
     * [VPC-gateway attachment](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpc-gateway-attachment.html)
     * .
     *
     * When you update `VPCZoneIdentifier` , this retains the same Auto Scaling group and replaces
     * old instances with new ones, according to the specified subnets. You can optionally specify
     * how CloudFormation handles these updates by using an
     * [UpdatePolicy attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html)
     * .
     *
     * Required to launch instances into a nondefault VPC. If you specify `VPCZoneIdentifier` with
     * `AvailabilityZones` , the subnets that you specify for this property must reside in those
     * Availability Zones.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-autoscaling-autoscalinggroup.html#cfn-autoscaling-autoscalinggroup-vpczoneidentifier)
     *
     * @param vpcZoneIdentifier A list of subnet IDs for a virtual private cloud (VPC) where
     *   instances in the Auto Scaling group can be created.
     */
    public fun vpcZoneIdentifier(vpcZoneIdentifier: Collection<String>) {
        _vpcZoneIdentifier.addAll(vpcZoneIdentifier)
    }

    public fun build(): CfnAutoScalingGroup {
        if (_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
        if (_lifecycleHookSpecificationList.isNotEmpty())
            cdkBuilder.lifecycleHookSpecificationList(_lifecycleHookSpecificationList)
        if (_loadBalancerNames.isNotEmpty()) cdkBuilder.loadBalancerNames(_loadBalancerNames)
        if (_metricsCollection.isNotEmpty()) cdkBuilder.metricsCollection(_metricsCollection)
        if (_notificationConfigurations.isNotEmpty())
            cdkBuilder.notificationConfigurations(_notificationConfigurations)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_targetGroupArns.isNotEmpty()) cdkBuilder.targetGroupArns(_targetGroupArns)
        if (_terminationPolicies.isNotEmpty()) cdkBuilder.terminationPolicies(_terminationPolicies)
        if (_vpcZoneIdentifier.isNotEmpty()) cdkBuilder.vpcZoneIdentifier(_vpcZoneIdentifier)
        return cdkBuilder.build()
    }
}
