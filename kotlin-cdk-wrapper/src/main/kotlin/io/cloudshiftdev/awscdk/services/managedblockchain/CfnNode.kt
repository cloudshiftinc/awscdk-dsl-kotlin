@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.managedblockchain

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnNode internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.managedblockchain.CfnNode,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrMemberId(): String = unwrap(this).getAttrMemberId()

  public open fun attrNetworkId(): String = unwrap(this).getAttrNetworkId()

  public open fun attrNodeId(): String = unwrap(this).getAttrNodeId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun memberId(): String? = unwrap(this).getMemberId()

  public open fun memberId(`value`: String) {
    unwrap(this).setMemberId(`value`)
  }

  public open fun networkId(): String = unwrap(this).getNetworkId()

  public open fun networkId(`value`: String) {
    unwrap(this).setNetworkId(`value`)
  }

  public open fun nodeConfiguration(): Any = unwrap(this).getNodeConfiguration()

  public open fun nodeConfiguration(`value`: IResolvable) {
    unwrap(this).setNodeConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun nodeConfiguration(`value`: NodeConfigurationProperty) {
    unwrap(this).setNodeConfiguration(`value`.let(NodeConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3744c2aa38ad0ecdee34189bd441b4f2c87838909119eddc9888c05962431588")
  public open fun nodeConfiguration(`value`: NodeConfigurationProperty.Builder.() -> Unit): Unit =
      nodeConfiguration(NodeConfigurationProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun memberId(memberId: String)

    public fun networkId(networkId: String)

    public fun nodeConfiguration(nodeConfiguration: IResolvable)

    public fun nodeConfiguration(nodeConfiguration: NodeConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25aeecfc6e7cc309f4cae08c5b752d870903f4d2b570694a11231b1a0f3c8055")
    public fun nodeConfiguration(nodeConfiguration: NodeConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.managedblockchain.CfnNode.Builder =
        software.amazon.awscdk.services.managedblockchain.CfnNode.Builder.create(scope, id)

    override fun memberId(memberId: String) {
      cdkBuilder.memberId(memberId)
    }

    override fun networkId(networkId: String) {
      cdkBuilder.networkId(networkId)
    }

    override fun nodeConfiguration(nodeConfiguration: IResolvable) {
      cdkBuilder.nodeConfiguration(nodeConfiguration.let(IResolvable::unwrap))
    }

    override fun nodeConfiguration(nodeConfiguration: NodeConfigurationProperty) {
      cdkBuilder.nodeConfiguration(nodeConfiguration.let(NodeConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25aeecfc6e7cc309f4cae08c5b752d870903f4d2b570694a11231b1a0f3c8055")
    override fun nodeConfiguration(nodeConfiguration: NodeConfigurationProperty.Builder.() -> Unit):
        Unit = nodeConfiguration(NodeConfigurationProperty(nodeConfiguration))

    public fun build(): software.amazon.awscdk.services.managedblockchain.CfnNode =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.managedblockchain.CfnNode.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNode {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNode(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnNode): CfnNode
        = CfnNode(cdkObject)

    internal fun unwrap(wrapped: CfnNode): software.amazon.awscdk.services.managedblockchain.CfnNode
        = wrapped.cdkObject
  }

  public interface NodeConfigurationProperty {
    public fun availabilityZone(): String

    public fun instanceType(): String

    @CdkDslMarker
    public interface Builder {
      public fun availabilityZone(availabilityZone: String)

      public fun instanceType(instanceType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.managedblockchain.CfnNode.NodeConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.managedblockchain.CfnNode.NodeConfigurationProperty.builder()

      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      override fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
      }

      public fun build():
          software.amazon.awscdk.services.managedblockchain.CfnNode.NodeConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.managedblockchain.CfnNode.NodeConfigurationProperty,
    ) : CdkObject(cdkObject), NodeConfigurationProperty {
      override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

      override fun instanceType(): String = unwrap(this).getInstanceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NodeConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.managedblockchain.CfnNode.NodeConfigurationProperty):
          NodeConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NodeConfigurationProperty):
          software.amazon.awscdk.services.managedblockchain.CfnNode.NodeConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.managedblockchain.CfnNode.NodeConfigurationProperty
    }
  }
}
