package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class PrefixList internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.PrefixList,
) : Resource(cdkObject), IPrefixList {
  public open fun addressFamily(): String = unwrap(this).getAddressFamily()

  public open fun ownerId(): String = unwrap(this).getOwnerId()

  public open fun prefixListArn(): String = unwrap(this).getPrefixListArn()

  public override fun prefixListId(): String = unwrap(this).getPrefixListId()

  public open fun prefixListName(): String = unwrap(this).getPrefixListName()

  public open fun version(): Number = unwrap(this).getVersion()

  public interface Builder {
    public fun addressFamily(addressFamily: AddressFamily) {
    }

    public fun entries(entries: List<CfnPrefixList.EntryProperty>) {
    }

    public fun maxEntries(maxEntries: Number) {
    }

    public fun prefixListName(prefixListName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.PrefixList.Builder =
        software.amazon.awscdk.services.ec2.PrefixList.Builder.create(scope, id)

    public override fun addressFamily(addressFamily: AddressFamily) {
      cdkBuilder.addressFamily(addressFamily.let(AddressFamily::unwrap))
    }

    public override fun entries(entries: List<CfnPrefixList.EntryProperty>) {
      cdkBuilder.entries(entries.map(CfnPrefixList.EntryProperty::unwrap))
    }

    public override fun maxEntries(maxEntries: Number) {
      cdkBuilder.maxEntries(maxEntries)
    }

    public override fun prefixListName(prefixListName: String) {
      cdkBuilder.prefixListName(prefixListName)
    }

    public fun build(): software.amazon.awscdk.services.ec2.PrefixList = cdkBuilder.build()
  }

  public companion object {
    public open fun fromPrefixListId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      prefixListId: String,
    ): IPrefixList =
        software.amazon.awscdk.services.ec2.PrefixList.fromPrefixListId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, prefixListId).let(IPrefixList::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): PrefixList {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return PrefixList(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.PrefixList): PrefixList =
        PrefixList(cdkObject)

    internal fun unwrap(wrapped: PrefixList): software.amazon.awscdk.services.ec2.PrefixList =
        wrapped.cdkObject
  }
}
