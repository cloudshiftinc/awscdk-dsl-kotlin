@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDBSecurityGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.CfnDBSecurityGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun dbSecurityGroupIngress(): Any = unwrap(this).getDbSecurityGroupIngress()

  public open fun dbSecurityGroupIngress(`value`: IResolvable) {
    unwrap(this).setDbSecurityGroupIngress(`value`.let(IResolvable::unwrap))
  }

  public open fun dbSecurityGroupIngress(__idx_ac66f0: List<Any>) {
    unwrap(this).setDbSecurityGroupIngress(__idx_ac66f0)
  }

  public open fun dbSecurityGroupIngress(vararg __idx_ac66f0: Any): Unit =
      dbSecurityGroupIngress(__idx_ac66f0.toList())

  public open fun ec2VpcId(): String? = unwrap(this).getEc2VpcId()

  public open fun ec2VpcId(`value`: String) {
    unwrap(this).setEc2VpcId(`value`)
  }

  public open fun groupDescription(): String = unwrap(this).getGroupDescription()

  public open fun groupDescription(`value`: String) {
    unwrap(this).setGroupDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun dbSecurityGroupIngress(dbSecurityGroupIngress: IResolvable)

    public fun dbSecurityGroupIngress(dbSecurityGroupIngress: List<Any>)

    public fun dbSecurityGroupIngress(vararg dbSecurityGroupIngress: Any)

    public fun ec2VpcId(ec2VpcId: String)

    public fun groupDescription(groupDescription: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnDBSecurityGroup.Builder =
        software.amazon.awscdk.services.rds.CfnDBSecurityGroup.Builder.create(scope, id)

    override fun dbSecurityGroupIngress(dbSecurityGroupIngress: IResolvable) {
      cdkBuilder.dbSecurityGroupIngress(dbSecurityGroupIngress.let(IResolvable::unwrap))
    }

    override fun dbSecurityGroupIngress(dbSecurityGroupIngress: List<Any>) {
      cdkBuilder.dbSecurityGroupIngress(dbSecurityGroupIngress)
    }

    override fun dbSecurityGroupIngress(vararg dbSecurityGroupIngress: Any): Unit =
        dbSecurityGroupIngress(dbSecurityGroupIngress.toList())

    override fun ec2VpcId(ec2VpcId: String) {
      cdkBuilder.ec2VpcId(ec2VpcId)
    }

    override fun groupDescription(groupDescription: String) {
      cdkBuilder.groupDescription(groupDescription)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.rds.CfnDBSecurityGroup = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.rds.CfnDBSecurityGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDBSecurityGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDBSecurityGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBSecurityGroup):
        CfnDBSecurityGroup = CfnDBSecurityGroup(cdkObject)

    internal fun unwrap(wrapped: CfnDBSecurityGroup):
        software.amazon.awscdk.services.rds.CfnDBSecurityGroup = wrapped.cdkObject
  }

  public interface IngressProperty {
    public fun cidrip(): String? = unwrap(this).getCidrip()

    public fun ec2SecurityGroupId(): String? = unwrap(this).getEc2SecurityGroupId()

    public fun ec2SecurityGroupName(): String? = unwrap(this).getEc2SecurityGroupName()

    public fun ec2SecurityGroupOwnerId(): String? = unwrap(this).getEc2SecurityGroupOwnerId()

    @CdkDslMarker
    public interface Builder {
      public fun cidrip(cidrip: String)

      public fun ec2SecurityGroupId(ec2SecurityGroupId: String)

      public fun ec2SecurityGroupName(ec2SecurityGroupName: String)

      public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.rds.CfnDBSecurityGroup.IngressProperty.Builder =
          software.amazon.awscdk.services.rds.CfnDBSecurityGroup.IngressProperty.builder()

      override fun cidrip(cidrip: String) {
        cdkBuilder.cidrip(cidrip)
      }

      override fun ec2SecurityGroupId(ec2SecurityGroupId: String) {
        cdkBuilder.ec2SecurityGroupId(ec2SecurityGroupId)
      }

      override fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
        cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
      }

      override fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
        cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
      }

      public fun build(): software.amazon.awscdk.services.rds.CfnDBSecurityGroup.IngressProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.rds.CfnDBSecurityGroup.IngressProperty,
    ) : CdkObject(cdkObject), IngressProperty {
      override fun cidrip(): String? = unwrap(this).getCidrip()

      override fun ec2SecurityGroupId(): String? = unwrap(this).getEc2SecurityGroupId()

      override fun ec2SecurityGroupName(): String? = unwrap(this).getEc2SecurityGroupName()

      override fun ec2SecurityGroupOwnerId(): String? = unwrap(this).getEc2SecurityGroupOwnerId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IngressProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnDBSecurityGroup.IngressProperty):
          IngressProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngressProperty):
          software.amazon.awscdk.services.rds.CfnDBSecurityGroup.IngressProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.rds.CfnDBSecurityGroup.IngressProperty
    }
  }
}