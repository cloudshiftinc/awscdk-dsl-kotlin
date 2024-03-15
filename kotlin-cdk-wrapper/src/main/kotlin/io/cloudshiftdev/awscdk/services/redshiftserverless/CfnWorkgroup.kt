@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshiftserverless

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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWorkgroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrWorkgroup(): IResolvable =
      unwrap(this).getAttrWorkgroup().let(IResolvable::wrap)

  public open fun attrWorkgroupBaseCapacity(): Number = unwrap(this).getAttrWorkgroupBaseCapacity()

  public open fun attrWorkgroupConfigParameters(): IResolvable =
      unwrap(this).getAttrWorkgroupConfigParameters().let(IResolvable::wrap)

  public open fun attrWorkgroupCreationDate(): String = unwrap(this).getAttrWorkgroupCreationDate()

  public open fun attrWorkgroupEndpoint(): IResolvable =
      unwrap(this).getAttrWorkgroupEndpoint().let(IResolvable::wrap)

  public open fun attrWorkgroupEndpointAddress(): String =
      unwrap(this).getAttrWorkgroupEndpointAddress()

  public open fun attrWorkgroupEndpointPort(): Number = unwrap(this).getAttrWorkgroupEndpointPort()

  public open fun attrWorkgroupEndpointVpcEndpoints(): IResolvable =
      unwrap(this).getAttrWorkgroupEndpointVpcEndpoints().let(IResolvable::wrap)

  public open fun attrWorkgroupEnhancedVpcRouting(): IResolvable =
      unwrap(this).getAttrWorkgroupEnhancedVpcRouting().let(IResolvable::wrap)

  public open fun attrWorkgroupMaxCapacity(): Number = unwrap(this).getAttrWorkgroupMaxCapacity()

  public open fun attrWorkgroupNamespaceName(): String =
      unwrap(this).getAttrWorkgroupNamespaceName()

  public open fun attrWorkgroupPubliclyAccessible(): IResolvable =
      unwrap(this).getAttrWorkgroupPubliclyAccessible().let(IResolvable::wrap)

  public open fun attrWorkgroupSecurityGroupIds(): List<String> =
      unwrap(this).getAttrWorkgroupSecurityGroupIds()

  public open fun attrWorkgroupStatus(): String = unwrap(this).getAttrWorkgroupStatus()

  public open fun attrWorkgroupSubnetIds(): List<String> = unwrap(this).getAttrWorkgroupSubnetIds()

  public open fun attrWorkgroupWorkgroupArn(): String = unwrap(this).getAttrWorkgroupWorkgroupArn()

  public open fun attrWorkgroupWorkgroupId(): String = unwrap(this).getAttrWorkgroupWorkgroupId()

  public open fun attrWorkgroupWorkgroupName(): String =
      unwrap(this).getAttrWorkgroupWorkgroupName()

  public open fun baseCapacity(): Number? = unwrap(this).getBaseCapacity()

  public open fun baseCapacity(`value`: Number) {
    unwrap(this).setBaseCapacity(`value`)
  }

  public open fun configParameters(): Any? = unwrap(this).getConfigParameters()

  public open fun configParameters(`value`: IResolvable) {
    unwrap(this).setConfigParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun configParameters(__idx_ac66f0: List<Any>) {
    unwrap(this).setConfigParameters(__idx_ac66f0)
  }

  public open fun configParameters(vararg __idx_ac66f0: Any): Unit =
      configParameters(__idx_ac66f0.toList())

  public open fun enhancedVpcRouting(): Any? = unwrap(this).getEnhancedVpcRouting()

  public open fun enhancedVpcRouting(`value`: Boolean) {
    unwrap(this).setEnhancedVpcRouting(`value`)
  }

  public open fun enhancedVpcRouting(`value`: IResolvable) {
    unwrap(this).setEnhancedVpcRouting(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

  public open fun maxCapacity(`value`: Number) {
    unwrap(this).setMaxCapacity(`value`)
  }

  public open fun namespaceName(): String? = unwrap(this).getNamespaceName()

  public open fun namespaceName(`value`: String) {
    unwrap(this).setNamespaceName(`value`)
  }

  public open fun port(): Number? = unwrap(this).getPort()

  public open fun port(`value`: Number) {
    unwrap(this).setPort(`value`)
  }

  public open fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  public open fun publiclyAccessible(`value`: Boolean) {
    unwrap(this).setPubliclyAccessible(`value`)
  }

  public open fun publiclyAccessible(`value`: IResolvable) {
    unwrap(this).setPubliclyAccessible(`value`.let(IResolvable::unwrap))
  }

  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  public open fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

  public open fun subnetIds(`value`: List<String>) {
    unwrap(this).setSubnetIds(`value`)
  }

  public open fun subnetIds(vararg `value`: String): Unit = subnetIds(`value`.toList())

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun workgroupName(): String = unwrap(this).getWorkgroupName()

  public open fun workgroupName(`value`: String) {
    unwrap(this).setWorkgroupName(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun baseCapacity(baseCapacity: Number)

    public fun configParameters(configParameters: IResolvable)

    public fun configParameters(configParameters: List<Any>)

    public fun configParameters(vararg configParameters: Any)

    public fun enhancedVpcRouting(enhancedVpcRouting: Boolean)

    public fun enhancedVpcRouting(enhancedVpcRouting: IResolvable)

    public fun maxCapacity(maxCapacity: Number)

    public fun namespaceName(namespaceName: String)

    public fun port(port: Number)

    public fun publiclyAccessible(publiclyAccessible: Boolean)

    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun subnetIds(subnetIds: List<String>)

    public fun subnetIds(vararg subnetIds: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun workgroupName(workgroupName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.Builder
        = software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.Builder.create(scope, id)

    override fun baseCapacity(baseCapacity: Number) {
      cdkBuilder.baseCapacity(baseCapacity)
    }

    override fun configParameters(configParameters: IResolvable) {
      cdkBuilder.configParameters(configParameters.let(IResolvable::unwrap))
    }

    override fun configParameters(configParameters: List<Any>) {
      cdkBuilder.configParameters(configParameters)
    }

    override fun configParameters(vararg configParameters: Any): Unit =
        configParameters(configParameters.toList())

    override fun enhancedVpcRouting(enhancedVpcRouting: Boolean) {
      cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
    }

    override fun enhancedVpcRouting(enhancedVpcRouting: IResolvable) {
      cdkBuilder.enhancedVpcRouting(enhancedVpcRouting.let(IResolvable::unwrap))
    }

    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    override fun namespaceName(namespaceName: String) {
      cdkBuilder.namespaceName(namespaceName)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun workgroupName(workgroupName: String) {
      cdkBuilder.workgroupName(workgroupName)
    }

    public fun build(): software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkgroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkgroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup):
        CfnWorkgroup = CfnWorkgroup(cdkObject)

    internal fun unwrap(wrapped: CfnWorkgroup):
        software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup = wrapped.cdkObject
  }

  public interface ConfigParameterProperty {
    public fun parameterKey(): String? = unwrap(this).getParameterKey()

    public fun parameterValue(): String? = unwrap(this).getParameterValue()

    @CdkDslMarker
    public interface Builder {
      public fun parameterKey(parameterKey: String)

      public fun parameterValue(parameterValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.ConfigParameterProperty.Builder
          =
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.ConfigParameterProperty.builder()

      override fun parameterKey(parameterKey: String) {
        cdkBuilder.parameterKey(parameterKey)
      }

      override fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
      }

      public fun build():
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.ConfigParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.ConfigParameterProperty,
    ) : CdkObject(cdkObject), ConfigParameterProperty {
      override fun parameterKey(): String? = unwrap(this).getParameterKey()

      override fun parameterValue(): String? = unwrap(this).getParameterValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.ConfigParameterProperty):
          ConfigParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConfigParameterProperty):
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.ConfigParameterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.ConfigParameterProperty
    }
  }

  public interface NetworkInterfaceProperty {
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

    public fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

    public fun subnetId(): String? = unwrap(this).getSubnetId()

    @CdkDslMarker
    public interface Builder {
      public fun availabilityZone(availabilityZone: String)

      public fun networkInterfaceId(networkInterfaceId: String)

      public fun privateIpAddress(privateIpAddress: String)

      public fun subnetId(subnetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.NetworkInterfaceProperty.Builder
          =
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.NetworkInterfaceProperty.builder()

      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      override fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
      }

      override fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
      }

      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public fun build():
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.NetworkInterfaceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.NetworkInterfaceProperty,
    ) : CdkObject(cdkObject), NetworkInterfaceProperty {
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

      override fun privateIpAddress(): String? = unwrap(this).getPrivateIpAddress()

      override fun subnetId(): String? = unwrap(this).getSubnetId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkInterfaceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.NetworkInterfaceProperty):
          NetworkInterfaceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkInterfaceProperty):
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.NetworkInterfaceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.NetworkInterfaceProperty
    }
  }

  public interface EndpointProperty {
    public fun address(): String? = unwrap(this).getAddress()

    public fun port(): Number? = unwrap(this).getPort()

    public fun vpcEndpoints(): Any? = unwrap(this).getVpcEndpoints()

    @CdkDslMarker
    public interface Builder {
      public fun address(address: String)

      public fun port(port: Number)

      public fun vpcEndpoints(vpcEndpoints: IResolvable)

      public fun vpcEndpoints(vpcEndpoints: List<Any>)

      public fun vpcEndpoints(vararg vpcEndpoints: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.EndpointProperty.Builder =
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.EndpointProperty.builder()

      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      override fun vpcEndpoints(vpcEndpoints: IResolvable) {
        cdkBuilder.vpcEndpoints(vpcEndpoints.let(IResolvable::unwrap))
      }

      override fun vpcEndpoints(vpcEndpoints: List<Any>) {
        cdkBuilder.vpcEndpoints(vpcEndpoints)
      }

      override fun vpcEndpoints(vararg vpcEndpoints: Any): Unit =
          vpcEndpoints(vpcEndpoints.toList())

      public fun build():
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.EndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.EndpointProperty,
    ) : CdkObject(cdkObject), EndpointProperty {
      override fun address(): String? = unwrap(this).getAddress()

      override fun port(): Number? = unwrap(this).getPort()

      override fun vpcEndpoints(): Any? = unwrap(this).getVpcEndpoints()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.EndpointProperty):
          EndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointProperty):
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.EndpointProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.EndpointProperty
    }
  }

  public interface VpcEndpointProperty {
    public fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

    public fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

    public fun vpcId(): String? = unwrap(this).getVpcId()

    @CdkDslMarker
    public interface Builder {
      public fun networkInterfaces(networkInterfaces: IResolvable)

      public fun networkInterfaces(networkInterfaces: List<Any>)

      public fun networkInterfaces(vararg networkInterfaces: Any)

      public fun vpcEndpointId(vpcEndpointId: String)

      public fun vpcId(vpcId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.VpcEndpointProperty.Builder
          =
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.VpcEndpointProperty.builder()

      override fun networkInterfaces(networkInterfaces: IResolvable) {
        cdkBuilder.networkInterfaces(networkInterfaces.let(IResolvable::unwrap))
      }

      override fun networkInterfaces(networkInterfaces: List<Any>) {
        cdkBuilder.networkInterfaces(networkInterfaces)
      }

      override fun networkInterfaces(vararg networkInterfaces: Any): Unit =
          networkInterfaces(networkInterfaces.toList())

      override fun vpcEndpointId(vpcEndpointId: String) {
        cdkBuilder.vpcEndpointId(vpcEndpointId)
      }

      override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build():
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.VpcEndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.VpcEndpointProperty,
    ) : CdkObject(cdkObject), VpcEndpointProperty {
      override fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

      override fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

      override fun vpcId(): String? = unwrap(this).getVpcId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.VpcEndpointProperty):
          VpcEndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcEndpointProperty):
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.VpcEndpointProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.VpcEndpointProperty
    }
  }

  public interface WorkgroupProperty {
    public fun baseCapacity(): Number? = unwrap(this).getBaseCapacity()

    public fun configParameters(): Any? = unwrap(this).getConfigParameters()

    public fun creationDate(): String? = unwrap(this).getCreationDate()

    public fun endpoint(): Any? = unwrap(this).getEndpoint()

    public fun enhancedVpcRouting(): Any? = unwrap(this).getEnhancedVpcRouting()

    public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    public fun namespaceName(): String? = unwrap(this).getNamespaceName()

    public fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    public fun status(): String? = unwrap(this).getStatus()

    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    public fun workgroupArn(): String? = unwrap(this).getWorkgroupArn()

    public fun workgroupId(): String? = unwrap(this).getWorkgroupId()

    public fun workgroupName(): String? = unwrap(this).getWorkgroupName()

    @CdkDslMarker
    public interface Builder {
      public fun baseCapacity(baseCapacity: Number)

      public fun configParameters(configParameters: IResolvable)

      public fun configParameters(configParameters: List<Any>)

      public fun configParameters(vararg configParameters: Any)

      public fun creationDate(creationDate: String)

      public fun endpoint(endpoint: IResolvable)

      public fun endpoint(endpoint: EndpointProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e3a0436ce967cae2579973bb1658315839784ca8a1fc6e5283acc57981b310e")
      public fun endpoint(endpoint: EndpointProperty.Builder.() -> Unit)

      public fun enhancedVpcRouting(enhancedVpcRouting: Boolean)

      public fun enhancedVpcRouting(enhancedVpcRouting: IResolvable)

      public fun maxCapacity(maxCapacity: Number)

      public fun namespaceName(namespaceName: String)

      public fun publiclyAccessible(publiclyAccessible: Boolean)

      public fun publiclyAccessible(publiclyAccessible: IResolvable)

      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun securityGroupIds(vararg securityGroupIds: String)

      public fun status(status: String)

      public fun subnetIds(subnetIds: List<String>)

      public fun subnetIds(vararg subnetIds: String)

      public fun workgroupArn(workgroupArn: String)

      public fun workgroupId(workgroupId: String)

      public fun workgroupName(workgroupName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.WorkgroupProperty.Builder
          =
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.WorkgroupProperty.builder()

      override fun baseCapacity(baseCapacity: Number) {
        cdkBuilder.baseCapacity(baseCapacity)
      }

      override fun configParameters(configParameters: IResolvable) {
        cdkBuilder.configParameters(configParameters.let(IResolvable::unwrap))
      }

      override fun configParameters(configParameters: List<Any>) {
        cdkBuilder.configParameters(configParameters)
      }

      override fun configParameters(vararg configParameters: Any): Unit =
          configParameters(configParameters.toList())

      override fun creationDate(creationDate: String) {
        cdkBuilder.creationDate(creationDate)
      }

      override fun endpoint(endpoint: IResolvable) {
        cdkBuilder.endpoint(endpoint.let(IResolvable::unwrap))
      }

      override fun endpoint(endpoint: EndpointProperty) {
        cdkBuilder.endpoint(endpoint.let(EndpointProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e3a0436ce967cae2579973bb1658315839784ca8a1fc6e5283acc57981b310e")
      override fun endpoint(endpoint: EndpointProperty.Builder.() -> Unit): Unit =
          endpoint(EndpointProperty(endpoint))

      override fun enhancedVpcRouting(enhancedVpcRouting: Boolean) {
        cdkBuilder.enhancedVpcRouting(enhancedVpcRouting)
      }

      override fun enhancedVpcRouting(enhancedVpcRouting: IResolvable) {
        cdkBuilder.enhancedVpcRouting(enhancedVpcRouting.let(IResolvable::unwrap))
      }

      override fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
      }

      override fun namespaceName(namespaceName: String) {
        cdkBuilder.namespaceName(namespaceName)
      }

      override fun publiclyAccessible(publiclyAccessible: Boolean) {
        cdkBuilder.publiclyAccessible(publiclyAccessible)
      }

      override fun publiclyAccessible(publiclyAccessible: IResolvable) {
        cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
      }

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      override fun workgroupArn(workgroupArn: String) {
        cdkBuilder.workgroupArn(workgroupArn)
      }

      override fun workgroupId(workgroupId: String) {
        cdkBuilder.workgroupId(workgroupId)
      }

      override fun workgroupName(workgroupName: String) {
        cdkBuilder.workgroupName(workgroupName)
      }

      public fun build():
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.WorkgroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.WorkgroupProperty,
    ) : CdkObject(cdkObject), WorkgroupProperty {
      override fun baseCapacity(): Number? = unwrap(this).getBaseCapacity()

      override fun configParameters(): Any? = unwrap(this).getConfigParameters()

      override fun creationDate(): String? = unwrap(this).getCreationDate()

      override fun endpoint(): Any? = unwrap(this).getEndpoint()

      override fun enhancedVpcRouting(): Any? = unwrap(this).getEnhancedVpcRouting()

      override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

      override fun namespaceName(): String? = unwrap(this).getNamespaceName()

      override fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      override fun status(): String? = unwrap(this).getStatus()

      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

      override fun workgroupArn(): String? = unwrap(this).getWorkgroupArn()

      override fun workgroupId(): String? = unwrap(this).getWorkgroupId()

      override fun workgroupName(): String? = unwrap(this).getWorkgroupName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WorkgroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.WorkgroupProperty):
          WorkgroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkgroupProperty):
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.WorkgroupProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.redshiftserverless.CfnWorkgroup.WorkgroupProperty
    }
  }
}
