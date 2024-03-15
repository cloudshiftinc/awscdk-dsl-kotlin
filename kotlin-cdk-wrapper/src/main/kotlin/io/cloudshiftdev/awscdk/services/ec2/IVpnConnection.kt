@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.constructs.Node
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IVpnConnection : IResource {
  public fun customerGatewayAsn(): Number

  public fun customerGatewayId(): String

  public fun customerGatewayIp(): String

  public fun metric(arg0: String): Metric

  public fun metric(arg0: String, arg1: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric

  public fun metricTunnelDataIn(): Metric

  public fun metricTunnelDataIn(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a408d4099c755aa5052825a697a1e09ed3c0922fb2e01c022a92ae8971f3cc41")
  public fun metricTunnelDataIn(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricTunnelDataOut(): Metric

  public fun metricTunnelDataOut(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2a0186808bc5d783adc386b6893f8cd28b7ae5632db2feac47a15f37f4b9f43f")
  public fun metricTunnelDataOut(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricTunnelState(): Metric

  public fun metricTunnelState(arg0: MetricOptions): Metric

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a1beb32a9ea480a143d1145556689d9f3e16ee288165a9b93d39cc36626ae1f8")
  public fun metricTunnelState(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun vpnId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.IVpnConnection,
  ) : CdkObject(cdkObject), IVpnConnection {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun customerGatewayAsn(): Number = unwrap(this).getCustomerGatewayAsn()

    override fun customerGatewayId(): String = unwrap(this).getCustomerGatewayId()

    override fun customerGatewayIp(): String = unwrap(this).getCustomerGatewayIp()

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun metric(arg0: String): Metric = unwrap(this).metric(arg0).let(Metric::wrap)

    override fun metric(arg0: String, arg1: MetricOptions): Metric = unwrap(this).metric(arg0,
        arg1.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric = metric(arg0,
        MetricOptions(arg1))

    override fun metricTunnelDataIn(): Metric = unwrap(this).metricTunnelDataIn().let(Metric::wrap)

    override fun metricTunnelDataIn(arg0: MetricOptions): Metric =
        unwrap(this).metricTunnelDataIn(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a408d4099c755aa5052825a697a1e09ed3c0922fb2e01c022a92ae8971f3cc41")
    override fun metricTunnelDataIn(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricTunnelDataIn(MetricOptions(arg0))

    override fun metricTunnelDataOut(): Metric =
        unwrap(this).metricTunnelDataOut().let(Metric::wrap)

    override fun metricTunnelDataOut(arg0: MetricOptions): Metric =
        unwrap(this).metricTunnelDataOut(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2a0186808bc5d783adc386b6893f8cd28b7ae5632db2feac47a15f37f4b9f43f")
    override fun metricTunnelDataOut(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricTunnelDataOut(MetricOptions(arg0))

    override fun metricTunnelState(): Metric = unwrap(this).metricTunnelState().let(Metric::wrap)

    override fun metricTunnelState(arg0: MetricOptions): Metric =
        unwrap(this).metricTunnelState(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1beb32a9ea480a143d1145556689d9f3e16ee288165a9b93d39cc36626ae1f8")
    override fun metricTunnelState(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricTunnelState(MetricOptions(arg0))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun vpnId(): String = unwrap(this).getVpnId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IVpnConnection): IVpnConnection
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVpnConnection): software.amazon.awscdk.services.ec2.IVpnConnection
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IVpnConnection
  }
}
