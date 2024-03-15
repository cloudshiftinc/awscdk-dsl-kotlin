@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opsworks

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStack internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.opsworks.CfnStack,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun agentVersion(): String? = unwrap(this).getAgentVersion()

  public open fun agentVersion(`value`: String) {
    unwrap(this).setAgentVersion(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attributes(): Any? = unwrap(this).getAttributes()

  public open fun attributes(`value`: IResolvable) {
    unwrap(this).setAttributes(`value`.let(IResolvable::unwrap))
  }

  public open fun attributes(`value`: Map<String, String>) {
    unwrap(this).setAttributes(`value`)
  }

  public open fun chefConfiguration(): Any? = unwrap(this).getChefConfiguration()

  public open fun chefConfiguration(`value`: IResolvable) {
    unwrap(this).setChefConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun chefConfiguration(`value`: ChefConfigurationProperty) {
    unwrap(this).setChefConfiguration(`value`.let(ChefConfigurationProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("22366ece289ebaeddc97c549e01146e6e8826a0baee8a182c309f73a27a12080")
  public open fun chefConfiguration(`value`: ChefConfigurationProperty.Builder.() -> Unit): Unit =
      chefConfiguration(ChefConfigurationProperty(`value`))

  public open fun cloneAppIds(): List<String> = unwrap(this).getCloneAppIds() ?: emptyList()

  public open fun cloneAppIds(`value`: List<String>) {
    unwrap(this).setCloneAppIds(`value`)
  }

  public open fun cloneAppIds(vararg `value`: String): Unit = cloneAppIds(`value`.toList())

  public open fun clonePermissions(): Any? = unwrap(this).getClonePermissions()

  public open fun clonePermissions(`value`: Boolean) {
    unwrap(this).setClonePermissions(`value`)
  }

  public open fun clonePermissions(`value`: IResolvable) {
    unwrap(this).setClonePermissions(`value`.let(IResolvable::unwrap))
  }

  public open fun configurationManager(): Any? = unwrap(this).getConfigurationManager()

  public open fun configurationManager(`value`: IResolvable) {
    unwrap(this).setConfigurationManager(`value`.let(IResolvable::unwrap))
  }

  public open fun configurationManager(`value`: StackConfigurationManagerProperty) {
    unwrap(this).setConfigurationManager(`value`.let(StackConfigurationManagerProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("971da53eb407c5f3dda86ee8db18517ce2ddd693f422aa5ac1aa90c470d67a71")
  public open
      fun configurationManager(`value`: StackConfigurationManagerProperty.Builder.() -> Unit): Unit
      = configurationManager(StackConfigurationManagerProperty(`value`))

  public open fun customCookbooksSource(): Any? = unwrap(this).getCustomCookbooksSource()

  public open fun customCookbooksSource(`value`: IResolvable) {
    unwrap(this).setCustomCookbooksSource(`value`.let(IResolvable::unwrap))
  }

  public open fun customCookbooksSource(`value`: SourceProperty) {
    unwrap(this).setCustomCookbooksSource(`value`.let(SourceProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("04c3f24ad26e530ea6834ab30654b092418a3c2e86153e6aade61504a2b8fcc6")
  public open fun customCookbooksSource(`value`: SourceProperty.Builder.() -> Unit): Unit =
      customCookbooksSource(SourceProperty(`value`))

  public open fun customJson(): Any? = unwrap(this).getCustomJson()

  public open fun customJson(`value`: Any) {
    unwrap(this).setCustomJson(`value`)
  }

  public open fun defaultAvailabilityZone(): String? = unwrap(this).getDefaultAvailabilityZone()

  public open fun defaultAvailabilityZone(`value`: String) {
    unwrap(this).setDefaultAvailabilityZone(`value`)
  }

  public open fun defaultInstanceProfileArn(): String = unwrap(this).getDefaultInstanceProfileArn()

  public open fun defaultInstanceProfileArn(`value`: String) {
    unwrap(this).setDefaultInstanceProfileArn(`value`)
  }

  public open fun defaultOs(): String? = unwrap(this).getDefaultOs()

  public open fun defaultOs(`value`: String) {
    unwrap(this).setDefaultOs(`value`)
  }

  public open fun defaultRootDeviceType(): String? = unwrap(this).getDefaultRootDeviceType()

  public open fun defaultRootDeviceType(`value`: String) {
    unwrap(this).setDefaultRootDeviceType(`value`)
  }

  public open fun defaultSshKeyName(): String? = unwrap(this).getDefaultSshKeyName()

  public open fun defaultSshKeyName(`value`: String) {
    unwrap(this).setDefaultSshKeyName(`value`)
  }

  public open fun defaultSubnetId(): String? = unwrap(this).getDefaultSubnetId()

  public open fun defaultSubnetId(`value`: String) {
    unwrap(this).setDefaultSubnetId(`value`)
  }

  public open fun ecsClusterArn(): String? = unwrap(this).getEcsClusterArn()

  public open fun ecsClusterArn(`value`: String) {
    unwrap(this).setEcsClusterArn(`value`)
  }

  public open fun elasticIps(): Any? = unwrap(this).getElasticIps()

  public open fun elasticIps(`value`: IResolvable) {
    unwrap(this).setElasticIps(`value`.let(IResolvable::unwrap))
  }

  public open fun elasticIps(__idx_ac66f0: List<Any>) {
    unwrap(this).setElasticIps(__idx_ac66f0)
  }

  public open fun elasticIps(vararg __idx_ac66f0: Any): Unit = elasticIps(__idx_ac66f0.toList())

  public open fun hostnameTheme(): String? = unwrap(this).getHostnameTheme()

  public open fun hostnameTheme(`value`: String) {
    unwrap(this).setHostnameTheme(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun rdsDbInstances(): Any? = unwrap(this).getRdsDbInstances()

  public open fun rdsDbInstances(`value`: IResolvable) {
    unwrap(this).setRdsDbInstances(`value`.let(IResolvable::unwrap))
  }

  public open fun rdsDbInstances(__idx_ac66f0: List<Any>) {
    unwrap(this).setRdsDbInstances(__idx_ac66f0)
  }

  public open fun rdsDbInstances(vararg __idx_ac66f0: Any): Unit =
      rdsDbInstances(__idx_ac66f0.toList())

  public open fun serviceRoleArn(): String = unwrap(this).getServiceRoleArn()

  public open fun serviceRoleArn(`value`: String) {
    unwrap(this).setServiceRoleArn(`value`)
  }

  public open fun sourceStackId(): String? = unwrap(this).getSourceStackId()

  public open fun sourceStackId(`value`: String) {
    unwrap(this).setSourceStackId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun useCustomCookbooks(): Any? = unwrap(this).getUseCustomCookbooks()

  public open fun useCustomCookbooks(`value`: Boolean) {
    unwrap(this).setUseCustomCookbooks(`value`)
  }

  public open fun useCustomCookbooks(`value`: IResolvable) {
    unwrap(this).setUseCustomCookbooks(`value`.let(IResolvable::unwrap))
  }

  public open fun useOpsworksSecurityGroups(): Any? = unwrap(this).getUseOpsworksSecurityGroups()

  public open fun useOpsworksSecurityGroups(`value`: Boolean) {
    unwrap(this).setUseOpsworksSecurityGroups(`value`)
  }

  public open fun useOpsworksSecurityGroups(`value`: IResolvable) {
    unwrap(this).setUseOpsworksSecurityGroups(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcId(): String? = unwrap(this).getVpcId()

  public open fun vpcId(`value`: String) {
    unwrap(this).setVpcId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun agentVersion(agentVersion: String)

    public fun attributes(attributes: IResolvable)

    public fun attributes(attributes: Map<String, String>)

    public fun chefConfiguration(chefConfiguration: IResolvable)

    public fun chefConfiguration(chefConfiguration: ChefConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c52845227911481080e46e0f18dd87dd85091e61f37801c276c5b0d79512091")
    public fun chefConfiguration(chefConfiguration: ChefConfigurationProperty.Builder.() -> Unit)

    public fun cloneAppIds(cloneAppIds: List<String>)

    public fun cloneAppIds(vararg cloneAppIds: String)

    public fun clonePermissions(clonePermissions: Boolean)

    public fun clonePermissions(clonePermissions: IResolvable)

    public fun configurationManager(configurationManager: IResolvable)

    public fun configurationManager(configurationManager: StackConfigurationManagerProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63882aab79a73f1c4aeceacb3cf4156ba0b410ca519a816e8dfd0bb7802282b0")
    public
        fun configurationManager(configurationManager: StackConfigurationManagerProperty.Builder.() -> Unit)

    public fun customCookbooksSource(customCookbooksSource: IResolvable)

    public fun customCookbooksSource(customCookbooksSource: SourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02814ce37b712fafba48ed90650097bc884bff764f2d799c44da9700d64e12bc")
    public fun customCookbooksSource(customCookbooksSource: SourceProperty.Builder.() -> Unit)

    public fun customJson(customJson: Any)

    public fun defaultAvailabilityZone(defaultAvailabilityZone: String)

    public fun defaultInstanceProfileArn(defaultInstanceProfileArn: String)

    public fun defaultOs(defaultOs: String)

    public fun defaultRootDeviceType(defaultRootDeviceType: String)

    public fun defaultSshKeyName(defaultSshKeyName: String)

    public fun defaultSubnetId(defaultSubnetId: String)

    public fun ecsClusterArn(ecsClusterArn: String)

    public fun elasticIps(elasticIps: IResolvable)

    public fun elasticIps(elasticIps: List<Any>)

    public fun elasticIps(vararg elasticIps: Any)

    public fun hostnameTheme(hostnameTheme: String)

    public fun name(name: String)

    public fun rdsDbInstances(rdsDbInstances: IResolvable)

    public fun rdsDbInstances(rdsDbInstances: List<Any>)

    public fun rdsDbInstances(vararg rdsDbInstances: Any)

    public fun serviceRoleArn(serviceRoleArn: String)

    public fun sourceStackId(sourceStackId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun useCustomCookbooks(useCustomCookbooks: Boolean)

    public fun useCustomCookbooks(useCustomCookbooks: IResolvable)

    public fun useOpsworksSecurityGroups(useOpsworksSecurityGroups: Boolean)

    public fun useOpsworksSecurityGroups(useOpsworksSecurityGroups: IResolvable)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.opsworks.CfnStack.Builder =
        software.amazon.awscdk.services.opsworks.CfnStack.Builder.create(scope, id)

    override fun agentVersion(agentVersion: String) {
      cdkBuilder.agentVersion(agentVersion)
    }

    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
    }

    override fun attributes(attributes: Map<String, String>) {
      cdkBuilder.attributes(attributes)
    }

    override fun chefConfiguration(chefConfiguration: IResolvable) {
      cdkBuilder.chefConfiguration(chefConfiguration.let(IResolvable::unwrap))
    }

    override fun chefConfiguration(chefConfiguration: ChefConfigurationProperty) {
      cdkBuilder.chefConfiguration(chefConfiguration.let(ChefConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c52845227911481080e46e0f18dd87dd85091e61f37801c276c5b0d79512091")
    override fun chefConfiguration(chefConfiguration: ChefConfigurationProperty.Builder.() -> Unit):
        Unit = chefConfiguration(ChefConfigurationProperty(chefConfiguration))

    override fun cloneAppIds(cloneAppIds: List<String>) {
      cdkBuilder.cloneAppIds(cloneAppIds)
    }

    override fun cloneAppIds(vararg cloneAppIds: String): Unit = cloneAppIds(cloneAppIds.toList())

    override fun clonePermissions(clonePermissions: Boolean) {
      cdkBuilder.clonePermissions(clonePermissions)
    }

    override fun clonePermissions(clonePermissions: IResolvable) {
      cdkBuilder.clonePermissions(clonePermissions.let(IResolvable::unwrap))
    }

    override fun configurationManager(configurationManager: IResolvable) {
      cdkBuilder.configurationManager(configurationManager.let(IResolvable::unwrap))
    }

    override fun configurationManager(configurationManager: StackConfigurationManagerProperty) {
      cdkBuilder.configurationManager(configurationManager.let(StackConfigurationManagerProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63882aab79a73f1c4aeceacb3cf4156ba0b410ca519a816e8dfd0bb7802282b0")
    override
        fun configurationManager(configurationManager: StackConfigurationManagerProperty.Builder.() -> Unit):
        Unit = configurationManager(StackConfigurationManagerProperty(configurationManager))

    override fun customCookbooksSource(customCookbooksSource: IResolvable) {
      cdkBuilder.customCookbooksSource(customCookbooksSource.let(IResolvable::unwrap))
    }

    override fun customCookbooksSource(customCookbooksSource: SourceProperty) {
      cdkBuilder.customCookbooksSource(customCookbooksSource.let(SourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02814ce37b712fafba48ed90650097bc884bff764f2d799c44da9700d64e12bc")
    override fun customCookbooksSource(customCookbooksSource: SourceProperty.Builder.() -> Unit):
        Unit = customCookbooksSource(SourceProperty(customCookbooksSource))

    override fun customJson(customJson: Any) {
      cdkBuilder.customJson(customJson)
    }

    override fun defaultAvailabilityZone(defaultAvailabilityZone: String) {
      cdkBuilder.defaultAvailabilityZone(defaultAvailabilityZone)
    }

    override fun defaultInstanceProfileArn(defaultInstanceProfileArn: String) {
      cdkBuilder.defaultInstanceProfileArn(defaultInstanceProfileArn)
    }

    override fun defaultOs(defaultOs: String) {
      cdkBuilder.defaultOs(defaultOs)
    }

    override fun defaultRootDeviceType(defaultRootDeviceType: String) {
      cdkBuilder.defaultRootDeviceType(defaultRootDeviceType)
    }

    override fun defaultSshKeyName(defaultSshKeyName: String) {
      cdkBuilder.defaultSshKeyName(defaultSshKeyName)
    }

    override fun defaultSubnetId(defaultSubnetId: String) {
      cdkBuilder.defaultSubnetId(defaultSubnetId)
    }

    override fun ecsClusterArn(ecsClusterArn: String) {
      cdkBuilder.ecsClusterArn(ecsClusterArn)
    }

    override fun elasticIps(elasticIps: IResolvable) {
      cdkBuilder.elasticIps(elasticIps.let(IResolvable::unwrap))
    }

    override fun elasticIps(elasticIps: List<Any>) {
      cdkBuilder.elasticIps(elasticIps)
    }

    override fun elasticIps(vararg elasticIps: Any): Unit = elasticIps(elasticIps.toList())

    override fun hostnameTheme(hostnameTheme: String) {
      cdkBuilder.hostnameTheme(hostnameTheme)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun rdsDbInstances(rdsDbInstances: IResolvable) {
      cdkBuilder.rdsDbInstances(rdsDbInstances.let(IResolvable::unwrap))
    }

    override fun rdsDbInstances(rdsDbInstances: List<Any>) {
      cdkBuilder.rdsDbInstances(rdsDbInstances)
    }

    override fun rdsDbInstances(vararg rdsDbInstances: Any): Unit =
        rdsDbInstances(rdsDbInstances.toList())

    override fun serviceRoleArn(serviceRoleArn: String) {
      cdkBuilder.serviceRoleArn(serviceRoleArn)
    }

    override fun sourceStackId(sourceStackId: String) {
      cdkBuilder.sourceStackId(sourceStackId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun useCustomCookbooks(useCustomCookbooks: Boolean) {
      cdkBuilder.useCustomCookbooks(useCustomCookbooks)
    }

    override fun useCustomCookbooks(useCustomCookbooks: IResolvable) {
      cdkBuilder.useCustomCookbooks(useCustomCookbooks.let(IResolvable::unwrap))
    }

    override fun useOpsworksSecurityGroups(useOpsworksSecurityGroups: Boolean) {
      cdkBuilder.useOpsworksSecurityGroups(useOpsworksSecurityGroups)
    }

    override fun useOpsworksSecurityGroups(useOpsworksSecurityGroups: IResolvable) {
      cdkBuilder.useOpsworksSecurityGroups(useOpsworksSecurityGroups.let(IResolvable::unwrap))
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.opsworks.CfnStack = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.opsworks.CfnStack.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStack {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStack(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnStack): CfnStack =
        CfnStack(cdkObject)

    internal fun unwrap(wrapped: CfnStack): software.amazon.awscdk.services.opsworks.CfnStack =
        wrapped.cdkObject
  }

  public interface ElasticIpProperty {
    public fun ip(): String

    public fun name(): String? = unwrap(this).getName()

    @CdkDslMarker
    public interface Builder {
      public fun ip(ip: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty.builder()

      override fun ip(ip: String) {
        cdkBuilder.ip(ip)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty,
    ) : CdkObject(cdkObject), ElasticIpProperty {
      override fun ip(): String = unwrap(this).getIp()

      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ElasticIpProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty):
          ElasticIpProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ElasticIpProperty):
          software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.opsworks.CfnStack.ElasticIpProperty
    }
  }

  public interface ChefConfigurationProperty {
    public fun berkshelfVersion(): String? = unwrap(this).getBerkshelfVersion()

    public fun manageBerkshelf(): Any? = unwrap(this).getManageBerkshelf()

    @CdkDslMarker
    public interface Builder {
      public fun berkshelfVersion(berkshelfVersion: String)

      public fun manageBerkshelf(manageBerkshelf: Boolean)

      public fun manageBerkshelf(manageBerkshelf: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty.builder()

      override fun berkshelfVersion(berkshelfVersion: String) {
        cdkBuilder.berkshelfVersion(berkshelfVersion)
      }

      override fun manageBerkshelf(manageBerkshelf: Boolean) {
        cdkBuilder.manageBerkshelf(manageBerkshelf)
      }

      override fun manageBerkshelf(manageBerkshelf: IResolvable) {
        cdkBuilder.manageBerkshelf(manageBerkshelf.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty,
    ) : CdkObject(cdkObject), ChefConfigurationProperty {
      override fun berkshelfVersion(): String? = unwrap(this).getBerkshelfVersion()

      override fun manageBerkshelf(): Any? = unwrap(this).getManageBerkshelf()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ChefConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty):
          ChefConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChefConfigurationProperty):
          software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.opsworks.CfnStack.ChefConfigurationProperty
    }
  }

  public interface StackConfigurationManagerProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun version(): String? = unwrap(this).getVersion()

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty.Builder
          =
          software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty,
    ) : CdkObject(cdkObject), StackConfigurationManagerProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StackConfigurationManagerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty):
          StackConfigurationManagerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StackConfigurationManagerProperty):
          software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.opsworks.CfnStack.StackConfigurationManagerProperty
    }
  }

  public interface SourceProperty {
    public fun password(): String? = unwrap(this).getPassword()

    public fun revision(): String? = unwrap(this).getRevision()

    public fun sshKey(): String? = unwrap(this).getSshKey()

    public fun type(): String? = unwrap(this).getType()

    public fun url(): String? = unwrap(this).getUrl()

    public fun username(): String? = unwrap(this).getUsername()

    @CdkDslMarker
    public interface Builder {
      public fun password(password: String)

      public fun revision(revision: String)

      public fun sshKey(sshKey: String)

      public fun type(type: String)

      public fun url(url: String)

      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty.builder()

      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      override fun revision(revision: String) {
        cdkBuilder.revision(revision)
      }

      override fun sshKey(sshKey: String) {
        cdkBuilder.sshKey(sshKey)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build(): software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty,
    ) : CdkObject(cdkObject), SourceProperty {
      override fun password(): String? = unwrap(this).getPassword()

      override fun revision(): String? = unwrap(this).getRevision()

      override fun sshKey(): String? = unwrap(this).getSshKey()

      override fun type(): String? = unwrap(this).getType()

      override fun url(): String? = unwrap(this).getUrl()

      override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty):
          SourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceProperty):
          software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.opsworks.CfnStack.SourceProperty
    }
  }

  public interface RdsDbInstanceProperty {
    public fun dbPassword(): String

    public fun dbUser(): String

    public fun rdsDbInstanceArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun dbPassword(dbPassword: String)

      public fun dbUser(dbUser: String)

      public fun rdsDbInstanceArn(rdsDbInstanceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty.Builder =
          software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty.builder()

      override fun dbPassword(dbPassword: String) {
        cdkBuilder.dbPassword(dbPassword)
      }

      override fun dbUser(dbUser: String) {
        cdkBuilder.dbUser(dbUser)
      }

      override fun rdsDbInstanceArn(rdsDbInstanceArn: String) {
        cdkBuilder.rdsDbInstanceArn(rdsDbInstanceArn)
      }

      public fun build(): software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty,
    ) : CdkObject(cdkObject), RdsDbInstanceProperty {
      override fun dbPassword(): String = unwrap(this).getDbPassword()

      override fun dbUser(): String = unwrap(this).getDbUser()

      override fun rdsDbInstanceArn(): String = unwrap(this).getRdsDbInstanceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RdsDbInstanceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty):
          RdsDbInstanceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RdsDbInstanceProperty):
          software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.opsworks.CfnStack.RdsDbInstanceProperty
    }
  }
}
