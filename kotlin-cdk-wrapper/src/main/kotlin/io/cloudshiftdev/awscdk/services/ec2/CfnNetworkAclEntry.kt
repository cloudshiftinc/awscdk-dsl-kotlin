@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnNetworkAclEntry internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkAclEntry,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun cidrBlock(): String? = unwrap(this).getCidrBlock()

  public open fun cidrBlock(`value`: String) {
    unwrap(this).setCidrBlock(`value`)
  }

  public open fun egress(): Any? = unwrap(this).getEgress()

  public open fun egress(`value`: Boolean) {
    unwrap(this).setEgress(`value`)
  }

  public open fun egress(`value`: IResolvable) {
    unwrap(this).setEgress(`value`.let(IResolvable::unwrap))
  }

  public open fun icmp(): Any? = unwrap(this).getIcmp()

  public open fun icmp(`value`: IResolvable) {
    unwrap(this).setIcmp(`value`.let(IResolvable::unwrap))
  }

  public open fun icmp(`value`: IcmpProperty) {
    unwrap(this).setIcmp(`value`.let(IcmpProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("55184738d20eb1378fc1b704f394062a5328b85fd14814a2826cc6c4e3e003e8")
  public open fun icmp(`value`: IcmpProperty.Builder.() -> Unit): Unit = icmp(IcmpProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipv6CidrBlock(): String? = unwrap(this).getIpv6CidrBlock()

  public open fun ipv6CidrBlock(`value`: String) {
    unwrap(this).setIpv6CidrBlock(`value`)
  }

  public open fun networkAclId(): String = unwrap(this).getNetworkAclId()

  public open fun networkAclId(`value`: String) {
    unwrap(this).setNetworkAclId(`value`)
  }

  public open fun portRange(): Any? = unwrap(this).getPortRange()

  public open fun portRange(`value`: IResolvable) {
    unwrap(this).setPortRange(`value`.let(IResolvable::unwrap))
  }

  public open fun portRange(`value`: PortRangeProperty) {
    unwrap(this).setPortRange(`value`.let(PortRangeProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("08a0e0211939b35b9751acdc74a1bf4db211ee13cd36af718057333d995fb25a")
  public open fun portRange(`value`: PortRangeProperty.Builder.() -> Unit): Unit =
      portRange(PortRangeProperty(`value`))

  public open fun protocol(): Number = unwrap(this).getProtocol()

  public open fun protocol(`value`: Number) {
    unwrap(this).setProtocol(`value`)
  }

  public open fun ruleAction(): String = unwrap(this).getRuleAction()

  public open fun ruleAction(`value`: String) {
    unwrap(this).setRuleAction(`value`)
  }

  public open fun ruleNumber(): Number = unwrap(this).getRuleNumber()

  public open fun ruleNumber(`value`: Number) {
    unwrap(this).setRuleNumber(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun cidrBlock(cidrBlock: String)

    public fun egress(egress: Boolean)

    public fun egress(egress: IResolvable)

    public fun icmp(icmp: IResolvable)

    public fun icmp(icmp: IcmpProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8a613d51f545c688842567246531da6476a28bfac69f661517869cfd459e1f00")
    public fun icmp(icmp: IcmpProperty.Builder.() -> Unit)

    public fun ipv6CidrBlock(ipv6CidrBlock: String)

    public fun networkAclId(networkAclId: String)

    public fun portRange(portRange: IResolvable)

    public fun portRange(portRange: PortRangeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac611dc7fb1882857f12b7c643de7e7def24e62823ba7c3d4f0dad0d02b4fd8c")
    public fun portRange(portRange: PortRangeProperty.Builder.() -> Unit)

    public fun protocol(protocol: Number)

    public fun ruleAction(ruleAction: String)

    public fun ruleNumber(ruleNumber: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.Builder.create(scope, id)

    override fun cidrBlock(cidrBlock: String) {
      cdkBuilder.cidrBlock(cidrBlock)
    }

    override fun egress(egress: Boolean) {
      cdkBuilder.egress(egress)
    }

    override fun egress(egress: IResolvable) {
      cdkBuilder.egress(egress.let(IResolvable::unwrap))
    }

    override fun icmp(icmp: IResolvable) {
      cdkBuilder.icmp(icmp.let(IResolvable::unwrap))
    }

    override fun icmp(icmp: IcmpProperty) {
      cdkBuilder.icmp(icmp.let(IcmpProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8a613d51f545c688842567246531da6476a28bfac69f661517869cfd459e1f00")
    override fun icmp(icmp: IcmpProperty.Builder.() -> Unit): Unit = icmp(IcmpProperty(icmp))

    override fun ipv6CidrBlock(ipv6CidrBlock: String) {
      cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    override fun networkAclId(networkAclId: String) {
      cdkBuilder.networkAclId(networkAclId)
    }

    override fun portRange(portRange: IResolvable) {
      cdkBuilder.portRange(portRange.let(IResolvable::unwrap))
    }

    override fun portRange(portRange: PortRangeProperty) {
      cdkBuilder.portRange(portRange.let(PortRangeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ac611dc7fb1882857f12b7c643de7e7def24e62823ba7c3d4f0dad0d02b4fd8c")
    override fun portRange(portRange: PortRangeProperty.Builder.() -> Unit): Unit =
        portRange(PortRangeProperty(portRange))

    override fun protocol(protocol: Number) {
      cdkBuilder.protocol(protocol)
    }

    override fun ruleAction(ruleAction: String) {
      cdkBuilder.ruleAction(ruleAction)
    }

    override fun ruleNumber(ruleNumber: Number) {
      cdkBuilder.ruleNumber(ruleNumber)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkAclEntry = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNetworkAclEntry {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNetworkAclEntry(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkAclEntry):
        CfnNetworkAclEntry = CfnNetworkAclEntry(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkAclEntry):
        software.amazon.awscdk.services.ec2.CfnNetworkAclEntry = wrapped.cdkObject
  }

  public interface IcmpProperty {
    public fun code(): Number? = unwrap(this).getCode()

    public fun type(): Number? = unwrap(this).getType()

    @CdkDslMarker
    public interface Builder {
      public fun code(code: Number)

      public fun type(type: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.IcmpProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.IcmpProperty.builder()

      override fun code(code: Number) {
        cdkBuilder.code(code)
      }

      override fun type(type: Number) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.IcmpProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.IcmpProperty,
    ) : CdkObject(cdkObject), IcmpProperty {
      override fun code(): Number? = unwrap(this).getCode()

      override fun type(): Number? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IcmpProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.IcmpProperty):
          IcmpProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IcmpProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.IcmpProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.IcmpProperty
    }
  }

  public interface PortRangeProperty {
    public fun from(): Number? = unwrap(this).getFrom()

    public fun to(): Number? = unwrap(this).getTo()

    @CdkDslMarker
    public interface Builder {
      public fun from(from: Number)

      public fun to(to: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.PortRangeProperty.Builder =
          software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.PortRangeProperty.builder()

      override fun from(from: Number) {
        cdkBuilder.from(from)
      }

      override fun to(to: Number) {
        cdkBuilder.to(to)
      }

      public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.PortRangeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.PortRangeProperty,
    ) : CdkObject(cdkObject), PortRangeProperty {
      override fun from(): Number? = unwrap(this).getFrom()

      override fun to(): Number? = unwrap(this).getTo()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PortRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.PortRangeProperty):
          PortRangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortRangeProperty):
          software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.PortRangeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnNetworkAclEntry.PortRangeProperty
    }
  }
}