package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIdentityPoolRoleAttachment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun identityPoolId(): String = unwrap(this).getIdentityPoolId()

  public open fun identityPoolId(`value`: String) {
    unwrap(this).setIdentityPoolId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun roleMappings(): Any? = unwrap(this).getRoleMappings()

  public open fun roleMappings(`value`: IResolvable) {
    unwrap(this).setRoleMappings(`value`.let(IResolvable::unwrap))
  }

  public open fun roleMappings(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setRoleMappings(__item_ac66f0)
  }

  public open fun roles(): Any? = unwrap(this).getRoles()

  public open fun roles(`value`: Any) {
    unwrap(this).setRoles(`value`)
  }

  public interface Builder {
    public fun identityPoolId(identityPoolId: String) {
    }

    public fun roleMappings(roleMappings: IResolvable) {
    }

    public fun roleMappings(roleMappings: Map<String, Any>) {
    }

    public fun roles(roles: Any) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.Builder =
        software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.Builder.create(scope,
        id)

    public override fun identityPoolId(identityPoolId: String) {
      cdkBuilder.identityPoolId(identityPoolId)
    }

    public override fun roleMappings(roleMappings: IResolvable) {
      cdkBuilder.roleMappings(roleMappings.let(IResolvable::unwrap))
    }

    public override fun roleMappings(roleMappings: Map<String, Any>) {
      cdkBuilder.roleMappings(roleMappings)
    }

    public override fun roles(roles: Any) {
      cdkBuilder.roles(roles)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIdentityPoolRoleAttachment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIdentityPoolRoleAttachment(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment):
        CfnIdentityPoolRoleAttachment = CfnIdentityPoolRoleAttachment(cdkObject)

    internal fun unwrap(wrapped: CfnIdentityPoolRoleAttachment):
        software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment = wrapped.cdkObject
  }

  public interface RulesConfigurationTypeProperty {
    public fun rules(): Any

    public interface Builder {
      public fun rules(rules: IResolvable) {
      }

      public fun rules(rules: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty.builder()

      public override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable::unwrap))
      }

      public override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty,
    ) : RulesConfigurationTypeProperty {
      public override fun rules(): Any = unwrap(this).getRules()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RulesConfigurationTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty):
          RulesConfigurationTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RulesConfigurationTypeProperty):
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RulesConfigurationTypeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MappingRuleProperty {
    public fun claim(): String

    public fun matchType(): String

    public fun roleArn(): String

    public fun `value`(): String

    public interface Builder {
      public fun claim(claim: String) {
      }

      public fun matchType(matchType: String) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty.builder()

      public override fun claim(claim: String) {
        cdkBuilder.claim(claim)
      }

      public override fun matchType(matchType: String) {
        cdkBuilder.matchType(matchType)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty,
    ) : MappingRuleProperty {
      public override fun claim(): String = unwrap(this).getClaim()

      public override fun matchType(): String = unwrap(this).getMatchType()

      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MappingRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty):
          MappingRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MappingRuleProperty):
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.MappingRuleProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RoleMappingProperty {
    public fun ambiguousRoleResolution(): String? = unwrap(this).getAmbiguousRoleResolution()

    public fun identityProvider(): String? = unwrap(this).getIdentityProvider()

    public fun rulesConfiguration(): Any? = unwrap(this).getRulesConfiguration()

    public fun type(): String

    public interface Builder {
      public fun ambiguousRoleResolution(ambiguousRoleResolution: String) {
      }

      public fun identityProvider(identityProvider: String) {
      }

      public fun rulesConfiguration(rulesConfiguration: IResolvable) {
      }

      public fun rulesConfiguration(rulesConfiguration: RulesConfigurationTypeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("34b2423d58ded2152c85df2c07e9e7361b18364114635054c986d2e0974afe0a")
      public
          fun rulesConfiguration(rulesConfiguration: RulesConfigurationTypeProperty.Builder.() -> Unit) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty.Builder
          =
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty.builder()

      public override fun ambiguousRoleResolution(ambiguousRoleResolution: String) {
        cdkBuilder.ambiguousRoleResolution(ambiguousRoleResolution)
      }

      public override fun identityProvider(identityProvider: String) {
        cdkBuilder.identityProvider(identityProvider)
      }

      public override fun rulesConfiguration(rulesConfiguration: IResolvable) {
        cdkBuilder.rulesConfiguration(rulesConfiguration.let(IResolvable::unwrap))
      }

      public override fun rulesConfiguration(rulesConfiguration: RulesConfigurationTypeProperty) {
        cdkBuilder.rulesConfiguration(rulesConfiguration.let(RulesConfigurationTypeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("34b2423d58ded2152c85df2c07e9e7361b18364114635054c986d2e0974afe0a")
      public override
          fun rulesConfiguration(rulesConfiguration: RulesConfigurationTypeProperty.Builder.() -> Unit):
          Unit = rulesConfiguration(RulesConfigurationTypeProperty(rulesConfiguration))

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty,
    ) : RoleMappingProperty {
      public override fun ambiguousRoleResolution(): String? =
          unwrap(this).getAmbiguousRoleResolution()

      public override fun identityProvider(): String? = unwrap(this).getIdentityProvider()

      public override fun rulesConfiguration(): Any? = unwrap(this).getRulesConfiguration()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RoleMappingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty):
          RoleMappingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RoleMappingProperty):
          software.amazon.awscdk.services.cognito.CfnIdentityPoolRoleAttachment.RoleMappingProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
