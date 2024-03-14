package io.cloudshiftdev.awscdk.services.grafana

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWorkspace internal constructor(
  private val cdkObject: software.amazon.awscdk.services.grafana.CfnWorkspace,
) : CfnResource(cdkObject), IInspectable {
  public open fun accountAccessType(): String = unwrap(this).getAccountAccessType()

  public open fun accountAccessType(`value`: String) {
    unwrap(this).setAccountAccessType(`value`)
  }

  public open fun attrCreationTimestamp(): String = unwrap(this).getAttrCreationTimestamp()

  public open fun attrEndpoint(): String = unwrap(this).getAttrEndpoint()

  public open fun attrGrafanaVersion(): String = unwrap(this).getAttrGrafanaVersion()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrModificationTimestamp(): String = unwrap(this).getAttrModificationTimestamp()

  public open fun attrSamlConfigurationStatus(): String =
      unwrap(this).getAttrSamlConfigurationStatus()

  public open fun attrSsoClientId(): String = unwrap(this).getAttrSsoClientId()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun authenticationProviders(): List<String> =
      unwrap(this).getAuthenticationProviders() ?: emptyList()

  public open fun authenticationProviders(`value`: List<String>) {
    unwrap(this).setAuthenticationProviders(`value`)
  }

  public open fun clientToken(): String? = unwrap(this).getClientToken()

  public open fun clientToken(`value`: String) {
    unwrap(this).setClientToken(`value`)
  }

  public open fun dataSources(): List<String> = unwrap(this).getDataSources() ?: emptyList()

  public open fun dataSources(`value`: List<String>) {
    unwrap(this).setDataSources(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun grafanaVersion(): String? = unwrap(this).getGrafanaVersion()

  public open fun grafanaVersion(`value`: String) {
    unwrap(this).setGrafanaVersion(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun networkAccessControl(): Any? = unwrap(this).getNetworkAccessControl()

  public open fun networkAccessControl(`value`: IResolvable) {
    unwrap(this).setNetworkAccessControl(`value`.let(IResolvable::unwrap))
  }

  public open fun networkAccessControl(`value`: NetworkAccessControlProperty) {
    unwrap(this).setNetworkAccessControl(`value`.let(NetworkAccessControlProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f31a5420c793bc08ef1229cc07500938747140f3715a4eb12bcf8673389f0352")
  public open fun networkAccessControl(`value`: NetworkAccessControlProperty.Builder.() -> Unit):
      Unit = networkAccessControl(NetworkAccessControlProperty(`value`))

  public open fun notificationDestinations(): List<String> =
      unwrap(this).getNotificationDestinations() ?: emptyList()

  public open fun notificationDestinations(`value`: List<String>) {
    unwrap(this).setNotificationDestinations(`value`)
  }

  public open fun organizationRoleName(): String? = unwrap(this).getOrganizationRoleName()

  public open fun organizationRoleName(`value`: String) {
    unwrap(this).setOrganizationRoleName(`value`)
  }

  public open fun organizationalUnits(): List<String> = unwrap(this).getOrganizationalUnits() ?:
      emptyList()

  public open fun organizationalUnits(`value`: List<String>) {
    unwrap(this).setOrganizationalUnits(`value`)
  }

  public open fun permissionType(): String = unwrap(this).getPermissionType()

  public open fun permissionType(`value`: String) {
    unwrap(this).setPermissionType(`value`)
  }

  public open fun pluginAdminEnabled(): Any? = unwrap(this).getPluginAdminEnabled()

  public open fun pluginAdminEnabled(`value`: Boolean) {
    unwrap(this).setPluginAdminEnabled(`value`)
  }

  public open fun pluginAdminEnabled(`value`: IResolvable) {
    unwrap(this).setPluginAdminEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun samlConfiguration(): Any? = unwrap(this).getSamlConfiguration()

  public open fun samlConfiguration(`value`: IResolvable) {
    unwrap(this).setSamlConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun samlConfiguration(`value`: SamlConfigurationProperty) {
    unwrap(this).setSamlConfiguration(`value`.let(SamlConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f40c8cae3318f11b1d97dc3e51dee7d8563d983c14ded98df2fa00aae49e0e46")
  public open fun samlConfiguration(`value`: SamlConfigurationProperty.Builder.() -> Unit): Unit =
      samlConfiguration(SamlConfigurationProperty(`value`))

  public open fun stackSetName(): String? = unwrap(this).getStackSetName()

  public open fun stackSetName(`value`: String) {
    unwrap(this).setStackSetName(`value`)
  }

  public open fun vpcConfiguration(): Any? = unwrap(this).getVpcConfiguration()

  public open fun vpcConfiguration(`value`: IResolvable) {
    unwrap(this).setVpcConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcConfiguration(`value`: VpcConfigurationProperty) {
    unwrap(this).setVpcConfiguration(`value`.let(VpcConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("107b8a12692f631c878f8a7babb0fdd31d9cf9add58049709b52ba456bf0cf9f")
  public open fun vpcConfiguration(`value`: VpcConfigurationProperty.Builder.() -> Unit): Unit =
      vpcConfiguration(VpcConfigurationProperty(`value`))

  public interface Builder {
    public fun accountAccessType(accountAccessType: String) {
    }

    public fun authenticationProviders(authenticationProviders: List<String>) {
    }

    public fun clientToken(clientToken: String) {
    }

    public fun dataSources(dataSources: List<String>) {
    }

    public fun description(description: String) {
    }

    public fun grafanaVersion(grafanaVersion: String) {
    }

    public fun name(name: String) {
    }

    public fun networkAccessControl(networkAccessControl: IResolvable) {
    }

    public fun networkAccessControl(networkAccessControl: NetworkAccessControlProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df2922984192277a6cb4babdf86c15baf8ea0664de96e9273ca37d3ccaf3d04d")
    public
        fun networkAccessControl(networkAccessControl: NetworkAccessControlProperty.Builder.() -> Unit) {
    }

    public fun notificationDestinations(notificationDestinations: List<String>) {
    }

    public fun organizationRoleName(organizationRoleName: String) {
    }

    public fun organizationalUnits(organizationalUnits: List<String>) {
    }

    public fun permissionType(permissionType: String) {
    }

    public fun pluginAdminEnabled(pluginAdminEnabled: Boolean) {
    }

    public fun pluginAdminEnabled(pluginAdminEnabled: IResolvable) {
    }

    public fun roleArn(roleArn: String) {
    }

    public fun samlConfiguration(samlConfiguration: IResolvable) {
    }

    public fun samlConfiguration(samlConfiguration: SamlConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19f9da4b10020d14cb5d2bc9761e2de07ca9b315e7d18d487e8454cf8b620839")
    public fun samlConfiguration(samlConfiguration: SamlConfigurationProperty.Builder.() -> Unit) {
    }

    public fun stackSetName(stackSetName: String) {
    }

    public fun vpcConfiguration(vpcConfiguration: IResolvable) {
    }

    public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2b9aa7bdef0230100506279e9d2fd971b43162c1bd618c02fec5efd930d5b25")
    public fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.grafana.CfnWorkspace.Builder =
        software.amazon.awscdk.services.grafana.CfnWorkspace.Builder.create(scope, id)

    public override fun accountAccessType(accountAccessType: String) {
      cdkBuilder.accountAccessType(accountAccessType)
    }

    public override fun authenticationProviders(authenticationProviders: List<String>) {
      cdkBuilder.authenticationProviders(authenticationProviders)
    }

    public override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    public override fun dataSources(dataSources: List<String>) {
      cdkBuilder.dataSources(dataSources)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun grafanaVersion(grafanaVersion: String) {
      cdkBuilder.grafanaVersion(grafanaVersion)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun networkAccessControl(networkAccessControl: IResolvable) {
      cdkBuilder.networkAccessControl(networkAccessControl.let(IResolvable::unwrap))
    }

    public override fun networkAccessControl(networkAccessControl: NetworkAccessControlProperty) {
      cdkBuilder.networkAccessControl(networkAccessControl.let(NetworkAccessControlProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df2922984192277a6cb4babdf86c15baf8ea0664de96e9273ca37d3ccaf3d04d")
    public override
        fun networkAccessControl(networkAccessControl: NetworkAccessControlProperty.Builder.() -> Unit):
        Unit = networkAccessControl(NetworkAccessControlProperty(networkAccessControl))

    public override fun notificationDestinations(notificationDestinations: List<String>) {
      cdkBuilder.notificationDestinations(notificationDestinations)
    }

    public override fun organizationRoleName(organizationRoleName: String) {
      cdkBuilder.organizationRoleName(organizationRoleName)
    }

    public override fun organizationalUnits(organizationalUnits: List<String>) {
      cdkBuilder.organizationalUnits(organizationalUnits)
    }

    public override fun permissionType(permissionType: String) {
      cdkBuilder.permissionType(permissionType)
    }

    public override fun pluginAdminEnabled(pluginAdminEnabled: Boolean) {
      cdkBuilder.pluginAdminEnabled(pluginAdminEnabled)
    }

    public override fun pluginAdminEnabled(pluginAdminEnabled: IResolvable) {
      cdkBuilder.pluginAdminEnabled(pluginAdminEnabled.let(IResolvable::unwrap))
    }

    public override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public override fun samlConfiguration(samlConfiguration: IResolvable) {
      cdkBuilder.samlConfiguration(samlConfiguration.let(IResolvable::unwrap))
    }

    public override fun samlConfiguration(samlConfiguration: SamlConfigurationProperty) {
      cdkBuilder.samlConfiguration(samlConfiguration.let(SamlConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19f9da4b10020d14cb5d2bc9761e2de07ca9b315e7d18d487e8454cf8b620839")
    public override
        fun samlConfiguration(samlConfiguration: SamlConfigurationProperty.Builder.() -> Unit): Unit
        = samlConfiguration(SamlConfigurationProperty(samlConfiguration))

    public override fun stackSetName(stackSetName: String) {
      cdkBuilder.stackSetName(stackSetName)
    }

    public override fun vpcConfiguration(vpcConfiguration: IResolvable) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(IResolvable::unwrap))
    }

    public override fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty) {
      cdkBuilder.vpcConfiguration(vpcConfiguration.let(VpcConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e2b9aa7bdef0230100506279e9d2fd971b43162c1bd618c02fec5efd930d5b25")
    public override
        fun vpcConfiguration(vpcConfiguration: VpcConfigurationProperty.Builder.() -> Unit): Unit =
        vpcConfiguration(VpcConfigurationProperty(vpcConfiguration))

    public fun build(): software.amazon.awscdk.services.grafana.CfnWorkspace = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkspace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkspace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.grafana.CfnWorkspace): CfnWorkspace
        = CfnWorkspace(cdkObject)

    internal fun unwrap(wrapped: CfnWorkspace): software.amazon.awscdk.services.grafana.CfnWorkspace
        = wrapped.cdkObject
  }

  public interface AssertionAttributesProperty {
    public fun email(): String? = unwrap(this).getEmail()

    public fun groups(): String? = unwrap(this).getGroups()

    public fun login(): String? = unwrap(this).getLogin()

    public fun name(): String? = unwrap(this).getName()

    public fun org(): String? = unwrap(this).getOrg()

    public fun role(): String? = unwrap(this).getRole()

    public interface Builder {
      public fun email(email: String) {
      }

      public fun groups(groups: String) {
      }

      public fun login(login: String) {
      }

      public fun name(name: String) {
      }

      public fun org(org: String) {
      }

      public fun role(role: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.grafana.CfnWorkspace.AssertionAttributesProperty.Builder =
          software.amazon.awscdk.services.grafana.CfnWorkspace.AssertionAttributesProperty.builder()

      public override fun email(email: String) {
        cdkBuilder.email(email)
      }

      public override fun groups(groups: String) {
        cdkBuilder.groups(groups)
      }

      public override fun login(login: String) {
        cdkBuilder.login(login)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun org(org: String) {
        cdkBuilder.org(org)
      }

      public override fun role(role: String) {
        cdkBuilder.role(role)
      }

      public fun build():
          software.amazon.awscdk.services.grafana.CfnWorkspace.AssertionAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.grafana.CfnWorkspace.AssertionAttributesProperty,
    ) : AssertionAttributesProperty {
      public override fun email(): String? = unwrap(this).getEmail()

      public override fun groups(): String? = unwrap(this).getGroups()

      public override fun login(): String? = unwrap(this).getLogin()

      public override fun name(): String? = unwrap(this).getName()

      public override fun org(): String? = unwrap(this).getOrg()

      public override fun role(): String? = unwrap(this).getRole()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AssertionAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.grafana.CfnWorkspace.AssertionAttributesProperty):
          AssertionAttributesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AssertionAttributesProperty):
          software.amazon.awscdk.services.grafana.CfnWorkspace.AssertionAttributesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface IdpMetadataProperty {
    public fun url(): String? = unwrap(this).getUrl()

    public fun xml(): String? = unwrap(this).getXml()

    public interface Builder {
      public fun url(url: String) {
      }

      public fun xml(xml: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.grafana.CfnWorkspace.IdpMetadataProperty.Builder =
          software.amazon.awscdk.services.grafana.CfnWorkspace.IdpMetadataProperty.builder()

      public override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public override fun xml(xml: String) {
        cdkBuilder.xml(xml)
      }

      public fun build(): software.amazon.awscdk.services.grafana.CfnWorkspace.IdpMetadataProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.grafana.CfnWorkspace.IdpMetadataProperty,
    ) : IdpMetadataProperty {
      public override fun url(): String? = unwrap(this).getUrl()

      public override fun xml(): String? = unwrap(this).getXml()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IdpMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.grafana.CfnWorkspace.IdpMetadataProperty):
          IdpMetadataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdpMetadataProperty):
          software.amazon.awscdk.services.grafana.CfnWorkspace.IdpMetadataProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SamlConfigurationProperty {
    public fun allowedOrganizations(): List<String> = unwrap(this).getAllowedOrganizations() ?:
        emptyList()

    public fun assertionAttributes(): Any? = unwrap(this).getAssertionAttributes()

    public fun idpMetadata(): Any

    public fun loginValidityDuration(): Number? = unwrap(this).getLoginValidityDuration()

    public fun roleValues(): Any? = unwrap(this).getRoleValues()

    public interface Builder {
      public fun allowedOrganizations(allowedOrganizations: List<String>) {
      }

      public fun assertionAttributes(assertionAttributes: IResolvable) {
      }

      public fun assertionAttributes(assertionAttributes: AssertionAttributesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("04e8718853837bb26880a91e92d3c04665c0bb5204515f23f9cde811673e1eb2")
      public
          fun assertionAttributes(assertionAttributes: AssertionAttributesProperty.Builder.() -> Unit) {
      }

      public fun idpMetadata(idpMetadata: IResolvable) {
      }

      public fun idpMetadata(idpMetadata: IdpMetadataProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21db845b00d8cebed8b48c0525e0e7ebc5800bc202c0bb6bbed0a2f90ba0fdaa")
      public fun idpMetadata(idpMetadata: IdpMetadataProperty.Builder.() -> Unit) {
      }

      public fun loginValidityDuration(loginValidityDuration: Number) {
      }

      public fun roleValues(roleValues: IResolvable) {
      }

      public fun roleValues(roleValues: RoleValuesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ceb493a89a71363274d243185fa55a080b787a7563005bb6ca53f91798daa70")
      public fun roleValues(roleValues: RoleValuesProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.grafana.CfnWorkspace.SamlConfigurationProperty.Builder =
          software.amazon.awscdk.services.grafana.CfnWorkspace.SamlConfigurationProperty.builder()

      public override fun allowedOrganizations(allowedOrganizations: List<String>) {
        cdkBuilder.allowedOrganizations(allowedOrganizations)
      }

      public override fun assertionAttributes(assertionAttributes: IResolvable) {
        cdkBuilder.assertionAttributes(assertionAttributes.let(IResolvable::unwrap))
      }

      public override fun assertionAttributes(assertionAttributes: AssertionAttributesProperty) {
        cdkBuilder.assertionAttributes(assertionAttributes.let(AssertionAttributesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("04e8718853837bb26880a91e92d3c04665c0bb5204515f23f9cde811673e1eb2")
      public override
          fun assertionAttributes(assertionAttributes: AssertionAttributesProperty.Builder.() -> Unit):
          Unit = assertionAttributes(AssertionAttributesProperty(assertionAttributes))

      public override fun idpMetadata(idpMetadata: IResolvable) {
        cdkBuilder.idpMetadata(idpMetadata.let(IResolvable::unwrap))
      }

      public override fun idpMetadata(idpMetadata: IdpMetadataProperty) {
        cdkBuilder.idpMetadata(idpMetadata.let(IdpMetadataProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("21db845b00d8cebed8b48c0525e0e7ebc5800bc202c0bb6bbed0a2f90ba0fdaa")
      public override fun idpMetadata(idpMetadata: IdpMetadataProperty.Builder.() -> Unit): Unit =
          idpMetadata(IdpMetadataProperty(idpMetadata))

      public override fun loginValidityDuration(loginValidityDuration: Number) {
        cdkBuilder.loginValidityDuration(loginValidityDuration)
      }

      public override fun roleValues(roleValues: IResolvable) {
        cdkBuilder.roleValues(roleValues.let(IResolvable::unwrap))
      }

      public override fun roleValues(roleValues: RoleValuesProperty) {
        cdkBuilder.roleValues(roleValues.let(RoleValuesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9ceb493a89a71363274d243185fa55a080b787a7563005bb6ca53f91798daa70")
      public override fun roleValues(roleValues: RoleValuesProperty.Builder.() -> Unit): Unit =
          roleValues(RoleValuesProperty(roleValues))

      public fun build():
          software.amazon.awscdk.services.grafana.CfnWorkspace.SamlConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.grafana.CfnWorkspace.SamlConfigurationProperty,
    ) : SamlConfigurationProperty {
      public override fun allowedOrganizations(): List<String> =
          unwrap(this).getAllowedOrganizations() ?: emptyList()

      public override fun assertionAttributes(): Any? = unwrap(this).getAssertionAttributes()

      public override fun idpMetadata(): Any = unwrap(this).getIdpMetadata()

      public override fun loginValidityDuration(): Number? = unwrap(this).getLoginValidityDuration()

      public override fun roleValues(): Any? = unwrap(this).getRoleValues()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SamlConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.grafana.CfnWorkspace.SamlConfigurationProperty):
          SamlConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SamlConfigurationProperty):
          software.amazon.awscdk.services.grafana.CfnWorkspace.SamlConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface NetworkAccessControlProperty {
    public fun prefixListIds(): List<String> = unwrap(this).getPrefixListIds() ?: emptyList()

    public fun vpceIds(): List<String> = unwrap(this).getVpceIds() ?: emptyList()

    public interface Builder {
      public fun prefixListIds(prefixListIds: List<String>) {
      }

      public fun vpceIds(vpceIds: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.grafana.CfnWorkspace.NetworkAccessControlProperty.Builder
          =
          software.amazon.awscdk.services.grafana.CfnWorkspace.NetworkAccessControlProperty.builder()

      public override fun prefixListIds(prefixListIds: List<String>) {
        cdkBuilder.prefixListIds(prefixListIds)
      }

      public override fun vpceIds(vpceIds: List<String>) {
        cdkBuilder.vpceIds(vpceIds)
      }

      public fun build():
          software.amazon.awscdk.services.grafana.CfnWorkspace.NetworkAccessControlProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.grafana.CfnWorkspace.NetworkAccessControlProperty,
    ) : NetworkAccessControlProperty {
      public override fun prefixListIds(): List<String> = unwrap(this).getPrefixListIds() ?:
          emptyList()

      public override fun vpceIds(): List<String> = unwrap(this).getVpceIds() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkAccessControlProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.grafana.CfnWorkspace.NetworkAccessControlProperty):
          NetworkAccessControlProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkAccessControlProperty):
          software.amazon.awscdk.services.grafana.CfnWorkspace.NetworkAccessControlProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface VpcConfigurationProperty {
    public fun securityGroupIds(): List<String>

    public fun subnetIds(): List<String>

    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>) {
      }

      public fun subnetIds(subnetIds: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.grafana.CfnWorkspace.VpcConfigurationProperty.Builder =
          software.amazon.awscdk.services.grafana.CfnWorkspace.VpcConfigurationProperty.builder()

      public override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      public override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      public fun build():
          software.amazon.awscdk.services.grafana.CfnWorkspace.VpcConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.grafana.CfnWorkspace.VpcConfigurationProperty,
    ) : VpcConfigurationProperty {
      public override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      public override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.grafana.CfnWorkspace.VpcConfigurationProperty):
          VpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigurationProperty):
          software.amazon.awscdk.services.grafana.CfnWorkspace.VpcConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RoleValuesProperty {
    public fun admin(): List<String> = unwrap(this).getAdmin() ?: emptyList()

    public fun editor(): List<String> = unwrap(this).getEditor() ?: emptyList()

    public interface Builder {
      public fun admin(admin: List<String>) {
      }

      public fun editor(editor: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.grafana.CfnWorkspace.RoleValuesProperty.Builder =
          software.amazon.awscdk.services.grafana.CfnWorkspace.RoleValuesProperty.builder()

      public override fun admin(admin: List<String>) {
        cdkBuilder.admin(admin)
      }

      public override fun editor(editor: List<String>) {
        cdkBuilder.editor(editor)
      }

      public fun build(): software.amazon.awscdk.services.grafana.CfnWorkspace.RoleValuesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.grafana.CfnWorkspace.RoleValuesProperty,
    ) : RoleValuesProperty {
      public override fun admin(): List<String> = unwrap(this).getAdmin() ?: emptyList()

      public override fun editor(): List<String> = unwrap(this).getEditor() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RoleValuesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.grafana.CfnWorkspace.RoleValuesProperty):
          RoleValuesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RoleValuesProperty):
          software.amazon.awscdk.services.grafana.CfnWorkspace.RoleValuesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
