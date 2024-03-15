@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface VpnConnectionOptions {
  public fun asn(): Number? = unwrap(this).getAsn()

  public fun ip(): String

  public fun staticRoutes(): List<String> = unwrap(this).getStaticRoutes() ?: emptyList()

  public fun tunnelOptions(): List<VpnTunnelOption> =
      unwrap(this).getTunnelOptions()?.map(VpnTunnelOption::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun asn(asn: Number)

    public fun ip(ip: String)

    public fun staticRoutes(staticRoutes: List<String>)

    public fun staticRoutes(vararg staticRoutes: String)

    public fun tunnelOptions(tunnelOptions: List<VpnTunnelOption>)

    public fun tunnelOptions(vararg tunnelOptions: VpnTunnelOption)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpnConnectionOptions.Builder =
        software.amazon.awscdk.services.ec2.VpnConnectionOptions.builder()

    override fun asn(asn: Number) {
      cdkBuilder.asn(asn)
    }

    override fun ip(ip: String) {
      cdkBuilder.ip(ip)
    }

    override fun staticRoutes(staticRoutes: List<String>) {
      cdkBuilder.staticRoutes(staticRoutes)
    }

    override fun staticRoutes(vararg staticRoutes: String): Unit =
        staticRoutes(staticRoutes.toList())

    override fun tunnelOptions(tunnelOptions: List<VpnTunnelOption>) {
      cdkBuilder.tunnelOptions(tunnelOptions.map(VpnTunnelOption::unwrap))
    }

    override fun tunnelOptions(vararg tunnelOptions: VpnTunnelOption): Unit =
        tunnelOptions(tunnelOptions.toList())

    public fun build(): software.amazon.awscdk.services.ec2.VpnConnectionOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.VpnConnectionOptions,
  ) : CdkObject(cdkObject), VpnConnectionOptions {
    override fun asn(): Number? = unwrap(this).getAsn()

    override fun ip(): String = unwrap(this).getIp()

    override fun staticRoutes(): List<String> = unwrap(this).getStaticRoutes() ?: emptyList()

    override fun tunnelOptions(): List<VpnTunnelOption> =
        unwrap(this).getTunnelOptions()?.map(VpnTunnelOption::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpnConnectionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpnConnectionOptions):
        VpnConnectionOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpnConnectionOptions):
        software.amazon.awscdk.services.ec2.VpnConnectionOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.VpnConnectionOptions
  }
}