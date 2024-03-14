package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface SubnetSelection {
  public fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?: emptyList()

  public fun onePerAz(): Boolean? = unwrap(this).getOnePerAz()

  public fun subnetFilters(): List<SubnetFilter> =
      unwrap(this).getSubnetFilters()?.map(SubnetFilter::wrap) ?: emptyList()

  public fun subnetGroupName(): String? = unwrap(this).getSubnetGroupName()

  public fun subnetType(): SubnetType? = unwrap(this).getSubnetType()?.let(SubnetType::wrap)

  public fun subnets(): List<ISubnet> = unwrap(this).getSubnets()?.map(ISubnet::wrap) ?: emptyList()

  public interface Builder {
    public fun availabilityZones(availabilityZones: List<String>)

    public fun onePerAz(onePerAz: Boolean)

    public fun subnetFilters(subnetFilters: List<SubnetFilter>)

    public fun subnetGroupName(subnetGroupName: String)

    public fun subnetType(subnetType: SubnetType)

    public fun subnets(subnets: List<ISubnet>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.SubnetSelection.Builder =
        software.amazon.awscdk.services.ec2.SubnetSelection.builder()

    override fun availabilityZones(availabilityZones: List<String>) {
      cdkBuilder.availabilityZones(availabilityZones)
    }

    override fun onePerAz(onePerAz: Boolean) {
      cdkBuilder.onePerAz(onePerAz)
    }

    override fun subnetFilters(subnetFilters: List<SubnetFilter>) {
      cdkBuilder.subnetFilters(subnetFilters.map(SubnetFilter::unwrap))
    }

    override fun subnetGroupName(subnetGroupName: String) {
      cdkBuilder.subnetGroupName(subnetGroupName)
    }

    override fun subnetType(subnetType: SubnetType) {
      cdkBuilder.subnetType(subnetType.let(SubnetType::unwrap))
    }

    override fun subnets(subnets: List<ISubnet>) {
      cdkBuilder.subnets(subnets.map(ISubnet::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.SubnetSelection = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.SubnetSelection,
  ) : SubnetSelection {
    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

    override fun onePerAz(): Boolean? = unwrap(this).getOnePerAz()

    override fun subnetFilters(): List<SubnetFilter> =
        unwrap(this).getSubnetFilters()?.map(SubnetFilter::wrap) ?: emptyList()

    override fun subnetGroupName(): String? = unwrap(this).getSubnetGroupName()

    override fun subnetType(): SubnetType? = unwrap(this).getSubnetType()?.let(SubnetType::wrap)

    override fun subnets(): List<ISubnet> = unwrap(this).getSubnets()?.map(ISubnet::wrap) ?:
        emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SubnetSelection {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SubnetSelection):
        SubnetSelection = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubnetSelection):
        software.amazon.awscdk.services.ec2.SubnetSelection = (wrapped as Wrapper).cdkObject
  }
}