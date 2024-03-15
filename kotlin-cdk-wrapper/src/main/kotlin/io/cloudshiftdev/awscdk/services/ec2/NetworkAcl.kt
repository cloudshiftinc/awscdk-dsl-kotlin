@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class NetworkAcl internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.NetworkAcl,
) : Resource(cdkObject), INetworkAcl {
  public override fun addEntry(id: String, options: CommonNetworkAclEntryOptions): NetworkAclEntry =
      unwrap(this).addEntry(id,
      options.let(CommonNetworkAclEntryOptions::unwrap)).let(NetworkAclEntry::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9ded3168e29970080cb3758417dce7573f6048a2cd62d2c05c7c24d3ed40bb13")
  public override fun addEntry(id: String,
      options: CommonNetworkAclEntryOptions.Builder.() -> Unit): NetworkAclEntry = addEntry(id,
      CommonNetworkAclEntryOptions(options))

  public open fun associateWithSubnet(id: String, selection: SubnetSelection) {
    unwrap(this).associateWithSubnet(id, selection.let(SubnetSelection::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("95778a2bcdf528def03cc5a57de958b58ac082ab5d7c7db85370a29a716de73e")
  public open fun associateWithSubnet(id: String, selection: SubnetSelection.Builder.() -> Unit):
      Unit = associateWithSubnet(id, SubnetSelection(selection))

  public override fun networkAclId(): String = unwrap(this).getNetworkAclId()

  public open fun networkAclVpcId(): String = unwrap(this).getNetworkAclVpcId()

  @CdkDslMarker
  public interface Builder {
    public fun networkAclName(networkAclName: String)

    public fun subnetSelection(subnetSelection: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("affa603912ddd5a21e35e10d48f164a621395d13f19b3892d23cd279360d51b5")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.NetworkAcl.Builder =
        software.amazon.awscdk.services.ec2.NetworkAcl.Builder.create(scope, id)

    override fun networkAclName(networkAclName: String) {
      cdkBuilder.networkAclName(networkAclName)
    }

    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("affa603912ddd5a21e35e10d48f164a621395d13f19b3892d23cd279360d51b5")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.NetworkAcl = cdkBuilder.build()
  }

  public companion object {
    public fun fromNetworkAclId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      networkAclId: String,
    ): INetworkAcl =
        software.amazon.awscdk.services.ec2.NetworkAcl.fromNetworkAclId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, networkAclId).let(INetworkAcl::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): NetworkAcl {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return NetworkAcl(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.NetworkAcl): NetworkAcl =
        NetworkAcl(cdkObject)

    internal fun unwrap(wrapped: NetworkAcl): software.amazon.awscdk.services.ec2.NetworkAcl =
        wrapped.cdkObject
  }
}
