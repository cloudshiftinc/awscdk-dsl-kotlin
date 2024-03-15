@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IIpAddresses {
  public fun allocateSubnetsCidr(arg0: AllocateCidrRequest): SubnetIpamOptions

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2b0342e5517b6eaf50616712b0cc3dedcaaf80337137500e7b6c321aed0efab8")
  public fun allocateSubnetsCidr(arg0: AllocateCidrRequest.Builder.() -> Unit): SubnetIpamOptions

  public fun allocateVpcCidr(): VpcIpamOptions

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.IIpAddresses,
  ) : CdkObject(cdkObject), IIpAddresses {
    override fun allocateSubnetsCidr(arg0: AllocateCidrRequest): SubnetIpamOptions =
        unwrap(this).allocateSubnetsCidr(arg0.let(AllocateCidrRequest::unwrap)).let(SubnetIpamOptions::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b0342e5517b6eaf50616712b0cc3dedcaaf80337137500e7b6c321aed0efab8")
    override fun allocateSubnetsCidr(arg0: AllocateCidrRequest.Builder.() -> Unit):
        SubnetIpamOptions = allocateSubnetsCidr(AllocateCidrRequest(arg0))

    override fun allocateVpcCidr(): VpcIpamOptions =
        unwrap(this).allocateVpcCidr().let(VpcIpamOptions::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IIpAddresses): IIpAddresses =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IIpAddresses): software.amazon.awscdk.services.ec2.IIpAddresses =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IIpAddresses
  }
}
