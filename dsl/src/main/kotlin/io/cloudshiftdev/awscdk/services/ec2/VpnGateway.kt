package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class VpnGateway internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.VpnGateway,
) : Resource(cdkObject), IVpnGateway {
  /**
   * The virtual private gateway Id.
   */
  public override fun gatewayId(): String = unwrap(this).getGatewayId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.VpnGateway].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Explicitly specify an Asn or let aws pick an Asn for you.
     *
     * Default: 65000
     *
     * @param amazonSideAsn Explicitly specify an Asn or let aws pick an Asn for you. 
     */
    public fun amazonSideAsn(amazonSideAsn: Number)

    /**
     * Default type ipsec.1.
     *
     * @param type Default type ipsec.1. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpnGateway.Builder =
        software.amazon.awscdk.services.ec2.VpnGateway.Builder.create(scope, id)

    /**
     * Explicitly specify an Asn or let aws pick an Asn for you.
     *
     * Default: 65000
     *
     * @param amazonSideAsn Explicitly specify an Asn or let aws pick an Asn for you. 
     */
    override fun amazonSideAsn(amazonSideAsn: Number) {
      cdkBuilder.amazonSideAsn(amazonSideAsn)
    }

    /**
     * Default type ipsec.1.
     *
     * @param type Default type ipsec.1. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ec2.VpnGateway = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): VpnGateway {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return VpnGateway(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpnGateway): VpnGateway =
        VpnGateway(cdkObject)

    internal fun unwrap(wrapped: VpnGateway): software.amazon.awscdk.services.ec2.VpnGateway =
        wrapped.cdkObject
  }
}
