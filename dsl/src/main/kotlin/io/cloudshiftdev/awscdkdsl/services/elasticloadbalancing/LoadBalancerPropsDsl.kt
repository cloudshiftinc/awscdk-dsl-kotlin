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

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancing

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancing.HealthCheck
import software.amazon.awscdk.services.elasticloadbalancing.ILoadBalancerTarget
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps

/**
 * Construction properties for a LoadBalancer.
 *
 * Example:
 * ```
 * Cluster cluster;
 * TaskDefinition taskDefinition;
 * Vpc vpc;
 * Ec2Service service = Ec2Service.Builder.create(this,
 * "Service").cluster(cluster).taskDefinition(taskDefinition).build();
 * LoadBalancer lb = LoadBalancer.Builder.create(this, "LB").vpc(vpc).build();
 * lb.addListener(LoadBalancerListener.builder().externalPort(80).build());
 * lb.addTarget(service.loadBalancerTarget(LoadBalancerTargetOptions.builder()
 * .containerName("MyContainer")
 * .containerPort(80)
 * .build()));
 * ```
 */
@CdkDslMarker
public class LoadBalancerPropsDsl {
    private val cdkBuilder: LoadBalancerProps.Builder = LoadBalancerProps.builder()

    private val _listeners: MutableList<LoadBalancerListener> = mutableListOf()

    private val _targets: MutableList<ILoadBalancerTarget> = mutableListOf()

    /**
     * @param accessLoggingPolicy Enable Loadbalancer access logs Can be used to avoid manual work
     *   as aws console Required S3 bucket name , enabled flag Can add interval for pushing log Can
     *   set bucket prefix in order to provide folder name inside bucket.
     */
    public fun accessLoggingPolicy(
        accessLoggingPolicy: CfnLoadBalancerAccessLoggingPolicyPropertyDsl.() -> Unit = {}
    ) {
        val builder = CfnLoadBalancerAccessLoggingPolicyPropertyDsl()
        builder.apply(accessLoggingPolicy)
        cdkBuilder.accessLoggingPolicy(builder.build())
    }

    /**
     * @param accessLoggingPolicy Enable Loadbalancer access logs Can be used to avoid manual work
     *   as aws console Required S3 bucket name , enabled flag Can add interval for pushing log Can
     *   set bucket prefix in order to provide folder name inside bucket.
     */
    public fun accessLoggingPolicy(
        accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty
    ) {
        cdkBuilder.accessLoggingPolicy(accessLoggingPolicy)
    }

    /**
     * @param crossZone Whether cross zone load balancing is enabled. This controls whether the load
     *   balancer evenly distributes requests across each availability zone
     */
    public fun crossZone(crossZone: Boolean) {
        cdkBuilder.crossZone(crossZone)
    }

    /**
     * @param healthCheck Health check settings for the load balancing targets. Not required but
     *   recommended.
     */
    public fun healthCheck(healthCheck: HealthCheckDsl.() -> Unit = {}) {
        val builder = HealthCheckDsl()
        builder.apply(healthCheck)
        cdkBuilder.healthCheck(builder.build())
    }

    /**
     * @param healthCheck Health check settings for the load balancing targets. Not required but
     *   recommended.
     */
    public fun healthCheck(healthCheck: HealthCheck) {
        cdkBuilder.healthCheck(healthCheck)
    }

    /**
     * @param internetFacing Whether this is an internet-facing Load Balancer. This controls whether
     *   the LB has a public IP address assigned. It does not open up the Load Balancer's security
     *   groups to public internet access.
     */
    public fun internetFacing(internetFacing: Boolean) {
        cdkBuilder.internetFacing(internetFacing)
    }

    /**
     * @param listeners What listeners to set up for the load balancer. Can also be added by
     *   .addListener()
     */
    public fun listeners(listeners: LoadBalancerListenerDsl.() -> Unit) {
        _listeners.add(LoadBalancerListenerDsl().apply(listeners).build())
    }

    /**
     * @param listeners What listeners to set up for the load balancer. Can also be added by
     *   .addListener()
     */
    public fun listeners(listeners: Collection<LoadBalancerListener>) {
        _listeners.addAll(listeners)
    }

    /**
     * @param subnetSelection Which subnets to deploy the load balancer. Can be used to define a
     *   specific set of subnets to deploy the load balancer to. Useful multiple public or private
     *   subnets are covering the same availability zone.
     */
    public fun subnetSelection(subnetSelection: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(subnetSelection)
        cdkBuilder.subnetSelection(builder.build())
    }

    /**
     * @param subnetSelection Which subnets to deploy the load balancer. Can be used to define a
     *   specific set of subnets to deploy the load balancer to. Useful multiple public or private
     *   subnets are covering the same availability zone.
     */
    public fun subnetSelection(subnetSelection: SubnetSelection) {
        cdkBuilder.subnetSelection(subnetSelection)
    }

    /** @param targets What targets to load balance to. Can also be added by .addTarget() */
    public fun targets(vararg targets: ILoadBalancerTarget) {
        _targets.addAll(listOf(*targets))
    }

    /** @param targets What targets to load balance to. Can also be added by .addTarget() */
    public fun targets(targets: Collection<ILoadBalancerTarget>) {
        _targets.addAll(targets)
    }

    /** @param vpc VPC network of the fleet instances. */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): LoadBalancerProps {
        if (_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
        if (_targets.isNotEmpty()) cdkBuilder.targets(_targets)
        return cdkBuilder.build()
    }
}
