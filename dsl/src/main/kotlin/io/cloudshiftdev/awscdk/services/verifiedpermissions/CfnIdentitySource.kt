package io.cloudshiftdev.awscdk.services.verifiedpermissions

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIdentitySource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrDetails(): IResolvable = unwrap(this).getAttrDetails().let(IResolvable::wrap)

  public open fun attrDetailsClientIds(): List<String> = unwrap(this).getAttrDetailsClientIds() ?:
      emptyList()

  public open fun attrDetailsDiscoveryUrl(): String = unwrap(this).getAttrDetailsDiscoveryUrl()

  public open fun attrDetailsOpenIdIssuer(): String = unwrap(this).getAttrDetailsOpenIdIssuer()

  public open fun attrDetailsUserPoolArn(): String = unwrap(this).getAttrDetailsUserPoolArn()

  public open fun attrIdentitySourceId(): String = unwrap(this).getAttrIdentitySourceId()

  public open fun configuration(): Any = unwrap(this).getConfiguration()

  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun configuration(`value`: IdentitySourceConfigurationProperty) {
    unwrap(this).setConfiguration(`value`.let(IdentitySourceConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3f097b6a0169411a9541f2f293b2ec50920e1c9135042b5e23a00482ca4233e1")
  public open fun configuration(`value`: IdentitySourceConfigurationProperty.Builder.() -> Unit):
      Unit = configuration(IdentitySourceConfigurationProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policyStoreId(): String = unwrap(this).getPolicyStoreId()

  public open fun policyStoreId(`value`: String) {
    unwrap(this).setPolicyStoreId(`value`)
  }

  public open fun principalEntityType(): String? = unwrap(this).getPrincipalEntityType()

  public open fun principalEntityType(`value`: String) {
    unwrap(this).setPrincipalEntityType(`value`)
  }

  public interface Builder {
    public fun configuration(configuration: IResolvable) {
    }

    public fun configuration(configuration: IdentitySourceConfigurationProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bbfe0ed3878f6d1c30b37f35051aaaf5948f60ea00fa239fb3ec49a4c3cee4d")
    public
        fun configuration(configuration: IdentitySourceConfigurationProperty.Builder.() -> Unit) {
    }

    public fun policyStoreId(policyStoreId: String) {
    }

    public fun principalEntityType(principalEntityType: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.Builder =
        software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.Builder.create(scope,
        id)

    public override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    public override fun configuration(configuration: IdentitySourceConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(IdentitySourceConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8bbfe0ed3878f6d1c30b37f35051aaaf5948f60ea00fa239fb3ec49a4c3cee4d")
    public override
        fun configuration(configuration: IdentitySourceConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(IdentitySourceConfigurationProperty(configuration))

    public override fun policyStoreId(policyStoreId: String) {
      cdkBuilder.policyStoreId(policyStoreId)
    }

    public override fun principalEntityType(principalEntityType: String) {
      cdkBuilder.principalEntityType(principalEntityType)
    }

    public fun build(): software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIdentitySource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIdentitySource(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource):
        CfnIdentitySource = CfnIdentitySource(cdkObject)

    internal fun unwrap(wrapped: CfnIdentitySource):
        software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource = wrapped.cdkObject
  }

  public interface IdentitySourceConfigurationProperty {
    public fun cognitoUserPoolConfiguration(): Any

    public interface Builder {
      public fun cognitoUserPoolConfiguration(cognitoUserPoolConfiguration: IResolvable) {
      }

      public
          fun cognitoUserPoolConfiguration(cognitoUserPoolConfiguration: CognitoUserPoolConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51bdf9dd6707933905c3a015af20f3e511473a2a30ce40b46ee0e5fe6764b226")
      public
          fun cognitoUserPoolConfiguration(cognitoUserPoolConfiguration: CognitoUserPoolConfigurationProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceConfigurationProperty.builder()

      public override fun cognitoUserPoolConfiguration(cognitoUserPoolConfiguration: IResolvable) {
        cdkBuilder.cognitoUserPoolConfiguration(cognitoUserPoolConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun cognitoUserPoolConfiguration(cognitoUserPoolConfiguration: CognitoUserPoolConfigurationProperty) {
        cdkBuilder.cognitoUserPoolConfiguration(cognitoUserPoolConfiguration.let(CognitoUserPoolConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51bdf9dd6707933905c3a015af20f3e511473a2a30ce40b46ee0e5fe6764b226")
      public override
          fun cognitoUserPoolConfiguration(cognitoUserPoolConfiguration: CognitoUserPoolConfigurationProperty.Builder.() -> Unit):
          Unit =
          cognitoUserPoolConfiguration(CognitoUserPoolConfigurationProperty(cognitoUserPoolConfiguration))

      public fun build():
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceConfigurationProperty,
    ) : IdentitySourceConfigurationProperty {
      public override fun cognitoUserPoolConfiguration(): Any =
          unwrap(this).getCognitoUserPoolConfiguration()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          IdentitySourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceConfigurationProperty):
          IdentitySourceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdentitySourceConfigurationProperty):
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface IdentitySourceDetailsProperty {
    public fun clientIds(): List<String> = unwrap(this).getClientIds() ?: emptyList()

    public fun discoveryUrl(): String? = unwrap(this).getDiscoveryUrl()

    public fun openIdIssuer(): String? = unwrap(this).getOpenIdIssuer()

    public fun userPoolArn(): String? = unwrap(this).getUserPoolArn()

    public interface Builder {
      public fun clientIds(clientIds: List<String>) {
      }

      public fun discoveryUrl(discoveryUrl: String) {
      }

      public fun openIdIssuer(openIdIssuer: String) {
      }

      public fun userPoolArn(userPoolArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceDetailsProperty.Builder
          =
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceDetailsProperty.builder()

      public override fun clientIds(clientIds: List<String>) {
        cdkBuilder.clientIds(clientIds)
      }

      public override fun discoveryUrl(discoveryUrl: String) {
        cdkBuilder.discoveryUrl(discoveryUrl)
      }

      public override fun openIdIssuer(openIdIssuer: String) {
        cdkBuilder.openIdIssuer(openIdIssuer)
      }

      public override fun userPoolArn(userPoolArn: String) {
        cdkBuilder.userPoolArn(userPoolArn)
      }

      public fun build():
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceDetailsProperty,
    ) : IdentitySourceDetailsProperty {
      public override fun clientIds(): List<String> = unwrap(this).getClientIds() ?: emptyList()

      public override fun discoveryUrl(): String? = unwrap(this).getDiscoveryUrl()

      public override fun openIdIssuer(): String? = unwrap(this).getOpenIdIssuer()

      public override fun userPoolArn(): String? = unwrap(this).getUserPoolArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IdentitySourceDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceDetailsProperty):
          IdentitySourceDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdentitySourceDetailsProperty):
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.IdentitySourceDetailsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CognitoUserPoolConfigurationProperty {
    public fun clientIds(): List<String> = unwrap(this).getClientIds() ?: emptyList()

    public fun userPoolArn(): String

    public interface Builder {
      public fun clientIds(clientIds: List<String>) {
      }

      public fun userPoolArn(userPoolArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.CognitoUserPoolConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.CognitoUserPoolConfigurationProperty.builder()

      public override fun clientIds(clientIds: List<String>) {
        cdkBuilder.clientIds(clientIds)
      }

      public override fun userPoolArn(userPoolArn: String) {
        cdkBuilder.userPoolArn(userPoolArn)
      }

      public fun build():
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.CognitoUserPoolConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.CognitoUserPoolConfigurationProperty,
    ) : CognitoUserPoolConfigurationProperty {
      public override fun clientIds(): List<String> = unwrap(this).getClientIds() ?: emptyList()

      public override fun userPoolArn(): String = unwrap(this).getUserPoolArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CognitoUserPoolConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.CognitoUserPoolConfigurationProperty):
          CognitoUserPoolConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CognitoUserPoolConfigurationProperty):
          software.amazon.awscdk.services.verifiedpermissions.CfnIdentitySource.CognitoUserPoolConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
