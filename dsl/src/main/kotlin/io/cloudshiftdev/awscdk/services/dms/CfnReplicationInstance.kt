package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnReplicationInstance internal constructor(
  private val cdkObject: software.amazon.awscdk.services.dms.CfnReplicationInstance,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun allocatedStorage(): Number? = unwrap(this).getAllocatedStorage()

  public open fun allocatedStorage(`value`: Number) {
    unwrap(this).setAllocatedStorage(`value`)
  }

  public open fun allowMajorVersionUpgrade(): Any? = unwrap(this).getAllowMajorVersionUpgrade()

  public open fun allowMajorVersionUpgrade(`value`: Boolean) {
    unwrap(this).setAllowMajorVersionUpgrade(`value`)
  }

  public open fun allowMajorVersionUpgrade(`value`: IResolvable) {
    unwrap(this).setAllowMajorVersionUpgrade(`value`.let(IResolvable::unwrap))
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrReplicationInstancePrivateIpAddresses(): String =
      unwrap(this).getAttrReplicationInstancePrivateIpAddresses()

  public open fun attrReplicationInstancePublicIpAddresses(): String =
      unwrap(this).getAttrReplicationInstancePublicIpAddresses()

  public open fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  public open fun autoMinorVersionUpgrade(`value`: Boolean) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`)
  }

  public open fun autoMinorVersionUpgrade(`value`: IResolvable) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`.let(IResolvable::unwrap))
  }

  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun multiAz(): Any? = unwrap(this).getMultiAz()

  public open fun multiAz(`value`: Boolean) {
    unwrap(this).setMultiAz(`value`)
  }

  public open fun multiAz(`value`: IResolvable) {
    unwrap(this).setMultiAz(`value`.let(IResolvable::unwrap))
  }

  public open fun preferredMaintenanceWindow(): String? =
      unwrap(this).getPreferredMaintenanceWindow()

  public open fun preferredMaintenanceWindow(`value`: String) {
    unwrap(this).setPreferredMaintenanceWindow(`value`)
  }

  public open fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  public open fun publiclyAccessible(`value`: Boolean) {
    unwrap(this).setPubliclyAccessible(`value`)
  }

  public open fun publiclyAccessible(`value`: IResolvable) {
    unwrap(this).setPubliclyAccessible(`value`.let(IResolvable::unwrap))
  }

  public open fun replicationInstanceClass(): String = unwrap(this).getReplicationInstanceClass()

  public open fun replicationInstanceClass(`value`: String) {
    unwrap(this).setReplicationInstanceClass(`value`)
  }

  public open fun replicationInstanceIdentifier(): String? =
      unwrap(this).getReplicationInstanceIdentifier()

  public open fun replicationInstanceIdentifier(`value`: String) {
    unwrap(this).setReplicationInstanceIdentifier(`value`)
  }

  public open fun replicationSubnetGroupIdentifier(): String? =
      unwrap(this).getReplicationSubnetGroupIdentifier()

  public open fun replicationSubnetGroupIdentifier(`value`: String) {
    unwrap(this).setReplicationSubnetGroupIdentifier(`value`)
  }

  public open fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  public open fun resourceIdentifier(`value`: String) {
    unwrap(this).setResourceIdentifier(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  public open fun vpcSecurityGroupIds(`value`: List<String>) {
    unwrap(this).setVpcSecurityGroupIds(`value`)
  }

  public interface Builder {
    public fun allocatedStorage(allocatedStorage: Number) {
    }

    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
    }

    public fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: IResolvable) {
    }

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
    }

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
    }

    public fun availabilityZone(availabilityZone: String) {
    }

    public fun engineVersion(engineVersion: String) {
    }

    public fun kmsKeyId(kmsKeyId: String) {
    }

    public fun multiAz(multiAz: Boolean) {
    }

    public fun multiAz(multiAz: IResolvable) {
    }

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    }

    public fun publiclyAccessible(publiclyAccessible: Boolean) {
    }

    public fun publiclyAccessible(publiclyAccessible: IResolvable) {
    }

    public fun replicationInstanceClass(replicationInstanceClass: String) {
    }

    public fun replicationInstanceIdentifier(replicationInstanceIdentifier: String) {
    }

    public fun replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier: String) {
    }

    public fun resourceIdentifier(resourceIdentifier: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnReplicationInstance.Builder =
        software.amazon.awscdk.services.dms.CfnReplicationInstance.Builder.create(scope, id)

    public override fun allocatedStorage(allocatedStorage: Number) {
      cdkBuilder.allocatedStorage(allocatedStorage)
    }

    public override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: Boolean) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade)
    }

    public override fun allowMajorVersionUpgrade(allowMajorVersionUpgrade: IResolvable) {
      cdkBuilder.allowMajorVersionUpgrade(allowMajorVersionUpgrade.let(IResolvable::unwrap))
    }

    public override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    public override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    public override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    public override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    public override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public override fun multiAz(multiAz: Boolean) {
      cdkBuilder.multiAz(multiAz)
    }

    public override fun multiAz(multiAz: IResolvable) {
      cdkBuilder.multiAz(multiAz.let(IResolvable::unwrap))
    }

    public override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    public override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    public override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    public override fun replicationInstanceClass(replicationInstanceClass: String) {
      cdkBuilder.replicationInstanceClass(replicationInstanceClass)
    }

    public override fun replicationInstanceIdentifier(replicationInstanceIdentifier: String) {
      cdkBuilder.replicationInstanceIdentifier(replicationInstanceIdentifier)
    }

    public override fun replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier: String) {
      cdkBuilder.replicationSubnetGroupIdentifier(replicationSubnetGroupIdentifier)
    }

    public override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    public fun build(): software.amazon.awscdk.services.dms.CfnReplicationInstance =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReplicationInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReplicationInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnReplicationInstance):
        CfnReplicationInstance = CfnReplicationInstance(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationInstance):
        software.amazon.awscdk.services.dms.CfnReplicationInstance = wrapped.cdkObject
  }
}
