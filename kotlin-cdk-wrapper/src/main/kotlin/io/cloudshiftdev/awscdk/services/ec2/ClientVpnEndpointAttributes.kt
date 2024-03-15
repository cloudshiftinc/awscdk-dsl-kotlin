@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ClientVpnEndpointAttributes {
  public fun endpointId(): String

  public fun securityGroups(): List<ISecurityGroup>

  @CdkDslMarker
  public interface Builder {
    public fun endpointId(endpointId: String)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes.Builder
        = software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes.builder()

    override fun endpointId(endpointId: String) {
      cdkBuilder.endpointId(endpointId)
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    public fun build(): software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes,
  ) : CdkObject(cdkObject), ClientVpnEndpointAttributes {
    override fun endpointId(): String = unwrap(this).getEndpointId()

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups().map(ISecurityGroup::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ClientVpnEndpointAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes):
        ClientVpnEndpointAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClientVpnEndpointAttributes):
        software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.ClientVpnEndpointAttributes
  }
}
