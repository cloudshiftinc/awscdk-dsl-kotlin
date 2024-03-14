package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface VpcLookupOptions {
  public fun isDefault(): Boolean? = unwrap(this).getIsDefault()

  public fun ownerAccountId(): String? = unwrap(this).getOwnerAccountId()

  public fun region(): String? = unwrap(this).getRegion()

  public fun returnVpnGateways(): Boolean? = unwrap(this).getReturnVpnGateways()

  public fun subnetGroupNameTag(): String? = unwrap(this).getSubnetGroupNameTag()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public fun vpcId(): String? = unwrap(this).getVpcId()

  public fun vpcName(): String? = unwrap(this).getVpcName()

  public interface Builder {
    public fun isDefault(isDefault: Boolean) {
    }

    public fun ownerAccountId(ownerAccountId: String) {
    }

    public fun region(region: String) {
    }

    public fun returnVpnGateways(returnVpnGateways: Boolean) {
    }

    public fun subnetGroupNameTag(subnetGroupNameTag: String) {
    }

    public fun tags(tags: Map<String, String>) {
    }

    public fun vpcId(vpcId: String) {
    }

    public fun vpcName(vpcName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpcLookupOptions.Builder =
        software.amazon.awscdk.services.ec2.VpcLookupOptions.builder()

    public override fun isDefault(isDefault: Boolean) {
      cdkBuilder.isDefault(isDefault)
    }

    public override fun ownerAccountId(ownerAccountId: String) {
      cdkBuilder.ownerAccountId(ownerAccountId)
    }

    public override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public override fun returnVpnGateways(returnVpnGateways: Boolean) {
      cdkBuilder.returnVpnGateways(returnVpnGateways)
    }

    public override fun subnetGroupNameTag(subnetGroupNameTag: String) {
      cdkBuilder.subnetGroupNameTag(subnetGroupNameTag)
    }

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public override fun vpcName(vpcName: String) {
      cdkBuilder.vpcName(vpcName)
    }

    public fun build(): software.amazon.awscdk.services.ec2.VpcLookupOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.VpcLookupOptions,
  ) : VpcLookupOptions {
    public override fun isDefault(): Boolean? = unwrap(this).getIsDefault()

    public override fun ownerAccountId(): String? = unwrap(this).getOwnerAccountId()

    public override fun region(): String? = unwrap(this).getRegion()

    public override fun returnVpnGateways(): Boolean? = unwrap(this).getReturnVpnGateways()

    public override fun subnetGroupNameTag(): String? = unwrap(this).getSubnetGroupNameTag()

    public override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    public override fun vpcId(): String? = unwrap(this).getVpcId()

    public override fun vpcName(): String? = unwrap(this).getVpcName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VpcLookupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpcLookupOptions):
        VpcLookupOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcLookupOptions):
        software.amazon.awscdk.services.ec2.VpcLookupOptions = (wrapped as Wrapper).cdkObject
  }
}
