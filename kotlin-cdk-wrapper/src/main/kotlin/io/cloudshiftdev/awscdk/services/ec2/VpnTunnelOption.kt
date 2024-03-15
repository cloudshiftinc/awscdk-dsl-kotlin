@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

public interface VpnTunnelOption {
  @Deprecated(message = "deprecated in CDK")
  public fun preSharedKey(): String? = unwrap(this).getPreSharedKey()

  public fun preSharedKeySecret(): SecretValue? =
      unwrap(this).getPreSharedKeySecret()?.let(SecretValue::wrap)

  public fun tunnelInsideCidr(): String? = unwrap(this).getTunnelInsideCidr()

  @CdkDslMarker
  public interface Builder {
    @Deprecated(message = "deprecated in CDK")
    public fun preSharedKey(preSharedKey: String)

    public fun preSharedKeySecret(preSharedKeySecret: SecretValue)

    public fun tunnelInsideCidr(tunnelInsideCidr: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpnTunnelOption.Builder =
        software.amazon.awscdk.services.ec2.VpnTunnelOption.builder()

    @Deprecated(message = "deprecated in CDK")
    override fun preSharedKey(preSharedKey: String) {
      cdkBuilder.preSharedKey(preSharedKey)
    }

    override fun preSharedKeySecret(preSharedKeySecret: SecretValue) {
      cdkBuilder.preSharedKeySecret(preSharedKeySecret.let(SecretValue::unwrap))
    }

    override fun tunnelInsideCidr(tunnelInsideCidr: String) {
      cdkBuilder.tunnelInsideCidr(tunnelInsideCidr)
    }

    public fun build(): software.amazon.awscdk.services.ec2.VpnTunnelOption = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.VpnTunnelOption,
  ) : CdkObject(cdkObject), VpnTunnelOption {
    @Deprecated(message = "deprecated in CDK")
    override fun preSharedKey(): String? = unwrap(this).getPreSharedKey()

    override fun preSharedKeySecret(): SecretValue? =
        unwrap(this).getPreSharedKeySecret()?.let(SecretValue::wrap)

    override fun tunnelInsideCidr(): String? = unwrap(this).getTunnelInsideCidr()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpnTunnelOption {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpnTunnelOption):
        VpnTunnelOption = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpnTunnelOption):
        software.amazon.awscdk.services.ec2.VpnTunnelOption = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.VpnTunnelOption
  }
}
