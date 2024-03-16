@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Contains all metrics for a Network Load Balancer.
 */
public interface INetworkLoadBalancerMetrics {
  /**
   * The total number of concurrent TCP flows (or connections) from clients to targets.
   *
   * This metric includes connections in the SYN_SENT and ESTABLISHED states.
   * TCP connections are not terminated at the load balancer, so a client
   * opening a TCP connection to a target counts as a single flow.
   *
   * Default: Average over 5 minutes
   *
   * @param props
   */
  public fun activeFlowCount(): Metric

  /**
   * The total number of concurrent TCP flows (or connections) from clients to targets.
   *
   * This metric includes connections in the SYN_SENT and ESTABLISHED states.
   * TCP connections are not terminated at the load balancer, so a client
   * opening a TCP connection to a target counts as a single flow.
   *
   * Default: Average over 5 minutes
   *
   * @param props
   */
  public fun activeFlowCount(props: MetricOptions): Metric

  /**
   * The total number of concurrent TCP flows (or connections) from clients to targets.
   *
   * This metric includes connections in the SYN_SENT and ESTABLISHED states.
   * TCP connections are not terminated at the load balancer, so a client
   * opening a TCP connection to a target counts as a single flow.
   *
   * Default: Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("df365ed7bc5bb1494f98541bca9886f91f4b2f9cd495cbd4467cb842596d6dc9")
  public fun activeFlowCount(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of load balancer capacity units (LCU) used by your load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun consumedLcUs(): Metric

  /**
   * The number of load balancer capacity units (LCU) used by your load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun consumedLcUs(props: MetricOptions): Metric

  /**
   * The number of load balancer capacity units (LCU) used by your load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("18e8e39bc441acca7c83d0b93ee82feb5719d75ccb2df798d695dbe35e061cf0")
  public fun consumedLcUs(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Return the given named metric for this Network Load Balancer.
   *
   * Default: Average over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public fun custom(metricName: String): Metric

  /**
   * Return the given named metric for this Network Load Balancer.
   *
   * Default: Average over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  public fun custom(metricName: String, props: MetricOptions): Metric

  /**
   * Return the given named metric for this Network Load Balancer.
   *
   * Default: Average over 5 minutes
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e3a7bf310cfbfe77339a32a3f576ae6834193015bd367fe25d8280f53f24860b")
  public fun custom(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The total number of new TCP flows (or connections) established from clients to targets in the
   * time period.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun newFlowCount(): Metric

  /**
   * The total number of new TCP flows (or connections) established from clients to targets in the
   * time period.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun newFlowCount(props: MetricOptions): Metric

  /**
   * The total number of new TCP flows (or connections) established from clients to targets in the
   * time period.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9ff04603e17644e75cf1646a7029b51c1fa41808e56215c629f056760e352bad")
  public fun newFlowCount(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The total number of bytes processed by the load balancer, including TCP/IP headers.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun processedBytes(): Metric

  /**
   * The total number of bytes processed by the load balancer, including TCP/IP headers.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun processedBytes(props: MetricOptions): Metric

  /**
   * The total number of bytes processed by the load balancer, including TCP/IP headers.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0834009453def8be68d52ce6251707f95f5284610a225d554c4471bca1f54d3b")
  public fun processedBytes(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The total number of reset (RST) packets sent from a client to a target.
   *
   * These resets are generated by the client and forwarded by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun tcpClientResetCount(): Metric

  /**
   * The total number of reset (RST) packets sent from a client to a target.
   *
   * These resets are generated by the client and forwarded by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun tcpClientResetCount(props: MetricOptions): Metric

  /**
   * The total number of reset (RST) packets sent from a client to a target.
   *
   * These resets are generated by the client and forwarded by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("45c8943b67a2585f45f923161100699260880bcd39738a9d5d24f6d8f24821e6")
  public fun tcpClientResetCount(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The total number of reset (RST) packets generated by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun tcpElbResetCount(): Metric

  /**
   * The total number of reset (RST) packets generated by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun tcpElbResetCount(props: MetricOptions): Metric

  /**
   * The total number of reset (RST) packets generated by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c5f8cbc5fd289799693a66e35c1763ed4e441e12f73d926e2dfe5e15ccb983b9")
  public fun tcpElbResetCount(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The total number of reset (RST) packets sent from a target to a client.
   *
   * These resets are generated by the target and forwarded by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun tcpTargetResetCount(): Metric

  /**
   * The total number of reset (RST) packets sent from a target to a client.
   *
   * These resets are generated by the target and forwarded by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  public fun tcpTargetResetCount(props: MetricOptions): Metric

  /**
   * The total number of reset (RST) packets sent from a target to a client.
   *
   * These resets are generated by the target and forwarded by the load balancer.
   *
   * Default: Sum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f54be02520e4435b9ab84a7d81541dc666e12059b56d7e98c38f8e427fc3c8e3")
  public fun tcpTargetResetCount(props: MetricOptions.Builder.() -> Unit): Metric

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerMetrics):
        INetworkLoadBalancerMetrics = CdkObjectWrappers.wrap(cdkObject) as
        INetworkLoadBalancerMetrics

    internal fun unwrap(wrapped: INetworkLoadBalancerMetrics):
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerMetrics =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerMetrics
  }
}
