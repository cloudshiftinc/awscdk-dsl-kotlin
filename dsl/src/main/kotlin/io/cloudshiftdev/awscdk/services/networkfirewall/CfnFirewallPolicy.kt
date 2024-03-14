package io.cloudshiftdev.awscdk.services.networkfirewall

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFirewallPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrFirewallPolicyArn(): String = unwrap(this).getAttrFirewallPolicyArn()

  public open fun attrFirewallPolicyId(): String = unwrap(this).getAttrFirewallPolicyId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun firewallPolicy(): Any = unwrap(this).getFirewallPolicy()

  public open fun firewallPolicy(`value`: IResolvable) {
    unwrap(this).setFirewallPolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun firewallPolicy(`value`: FirewallPolicyProperty) {
    unwrap(this).setFirewallPolicy(`value`.let(FirewallPolicyProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("66edb5975d0bddaf613db66a61a50392b0c450cd02e6d941688225a25a5bd985")
  public open fun firewallPolicy(`value`: FirewallPolicyProperty.Builder.() -> Unit): Unit =
      firewallPolicy(FirewallPolicyProperty(`value`))

  public open fun firewallPolicyName(): String = unwrap(this).getFirewallPolicyName()

  public open fun firewallPolicyName(`value`: String) {
    unwrap(this).setFirewallPolicyName(`value`)
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

  public interface Builder {
    public fun description(description: String) {
    }

    public fun firewallPolicy(firewallPolicy: IResolvable) {
    }

    public fun firewallPolicy(firewallPolicy: FirewallPolicyProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3fee919add41f58ca28ef0fb97d6fecde780687581df81b1424651353d73dd1c")
    public fun firewallPolicy(firewallPolicy: FirewallPolicyProperty.Builder.() -> Unit) {
    }

    public fun firewallPolicyName(firewallPolicyName: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.Builder =
        software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun firewallPolicy(firewallPolicy: IResolvable) {
      cdkBuilder.firewallPolicy(firewallPolicy.let(IResolvable::unwrap))
    }

    public override fun firewallPolicy(firewallPolicy: FirewallPolicyProperty) {
      cdkBuilder.firewallPolicy(firewallPolicy.let(FirewallPolicyProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3fee919add41f58ca28ef0fb97d6fecde780687581df81b1424651353d73dd1c")
    public override fun firewallPolicy(firewallPolicy: FirewallPolicyProperty.Builder.() -> Unit):
        Unit = firewallPolicy(FirewallPolicyProperty(firewallPolicy))

    public override fun firewallPolicyName(firewallPolicyName: String) {
      cdkBuilder.firewallPolicyName(firewallPolicyName)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFirewallPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFirewallPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy):
        CfnFirewallPolicy = CfnFirewallPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnFirewallPolicy):
        software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy = wrapped.cdkObject
  }

  public interface PublishMetricActionProperty {
    public fun dimensions(): Any

    public interface Builder {
      public fun dimensions(dimensions: IResolvable) {
      }

      public fun dimensions(dimensions: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PublishMetricActionProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PublishMetricActionProperty.builder()

      public override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable::unwrap))
      }

      public override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PublishMetricActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PublishMetricActionProperty,
    ) : PublishMetricActionProperty {
      public override fun dimensions(): Any = unwrap(this).getDimensions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PublishMetricActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PublishMetricActionProperty):
          PublishMetricActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublishMetricActionProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PublishMetricActionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface StatefulEngineOptionsProperty {
    public fun ruleOrder(): String? = unwrap(this).getRuleOrder()

    public fun streamExceptionPolicy(): String? = unwrap(this).getStreamExceptionPolicy()

    public interface Builder {
      public fun ruleOrder(ruleOrder: String) {
      }

      public fun streamExceptionPolicy(streamExceptionPolicy: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulEngineOptionsProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulEngineOptionsProperty.builder()

      public override fun ruleOrder(ruleOrder: String) {
        cdkBuilder.ruleOrder(ruleOrder)
      }

      public override fun streamExceptionPolicy(streamExceptionPolicy: String) {
        cdkBuilder.streamExceptionPolicy(streamExceptionPolicy)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulEngineOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulEngineOptionsProperty,
    ) : StatefulEngineOptionsProperty {
      public override fun ruleOrder(): String? = unwrap(this).getRuleOrder()

      public override fun streamExceptionPolicy(): String? = unwrap(this).getStreamExceptionPolicy()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StatefulEngineOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulEngineOptionsProperty):
          StatefulEngineOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatefulEngineOptionsProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulEngineOptionsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ActionDefinitionProperty {
    public fun publishMetricAction(): Any? = unwrap(this).getPublishMetricAction()

    public interface Builder {
      public fun publishMetricAction(publishMetricAction: IResolvable) {
      }

      public fun publishMetricAction(publishMetricAction: PublishMetricActionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e772170dc06f618e19273f007b7bc90f71cf467c4d9bcee90ac01ff1a1ea81ba")
      public
          fun publishMetricAction(publishMetricAction: PublishMetricActionProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.ActionDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.ActionDefinitionProperty.builder()

      public override fun publishMetricAction(publishMetricAction: IResolvable) {
        cdkBuilder.publishMetricAction(publishMetricAction.let(IResolvable::unwrap))
      }

      public override fun publishMetricAction(publishMetricAction: PublishMetricActionProperty) {
        cdkBuilder.publishMetricAction(publishMetricAction.let(PublishMetricActionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e772170dc06f618e19273f007b7bc90f71cf467c4d9bcee90ac01ff1a1ea81ba")
      public override
          fun publishMetricAction(publishMetricAction: PublishMetricActionProperty.Builder.() -> Unit):
          Unit = publishMetricAction(PublishMetricActionProperty(publishMetricAction))

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.ActionDefinitionProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.ActionDefinitionProperty,
    ) : ActionDefinitionProperty {
      public override fun publishMetricAction(): Any? = unwrap(this).getPublishMetricAction()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActionDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.ActionDefinitionProperty):
          ActionDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionDefinitionProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.ActionDefinitionProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface StatelessRuleGroupReferenceProperty {
    public fun priority(): Number

    public fun resourceArn(): String

    public interface Builder {
      public fun priority(priority: Number) {
      }

      public fun resourceArn(resourceArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatelessRuleGroupReferenceProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatelessRuleGroupReferenceProperty.builder()

      public override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      public override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatelessRuleGroupReferenceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatelessRuleGroupReferenceProperty,
    ) : StatelessRuleGroupReferenceProperty {
      public override fun priority(): Number = unwrap(this).getPriority()

      public override fun resourceArn(): String = unwrap(this).getResourceArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          StatelessRuleGroupReferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatelessRuleGroupReferenceProperty):
          StatelessRuleGroupReferenceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatelessRuleGroupReferenceProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatelessRuleGroupReferenceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface StatefulRuleGroupReferenceProperty {
    public fun `override`(): Any? = unwrap(this).getOverride()

    public fun priority(): Number? = unwrap(this).getPriority()

    public fun resourceArn(): String

    public interface Builder {
      public fun `override`(`override`: IResolvable) {
      }

      public fun `override`(`override`: StatefulRuleGroupOverrideProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("063e3edbf8a3a4bb75a758da399ab9da795146a21d0554e262127c3bacfb8fff")
      public fun `override`(`override`: StatefulRuleGroupOverrideProperty.Builder.() -> Unit) {
      }

      public fun priority(priority: Number) {
      }

      public fun resourceArn(resourceArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupReferenceProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupReferenceProperty.builder()

      public override fun `override`(`override`: IResolvable) {
        cdkBuilder.`override`(`override`.let(IResolvable::unwrap))
      }

      public override fun `override`(`override`: StatefulRuleGroupOverrideProperty) {
        cdkBuilder.`override`(`override`.let(StatefulRuleGroupOverrideProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("063e3edbf8a3a4bb75a758da399ab9da795146a21d0554e262127c3bacfb8fff")
      public override
          fun `override`(`override`: StatefulRuleGroupOverrideProperty.Builder.() -> Unit): Unit =
          `override`(StatefulRuleGroupOverrideProperty(`override`))

      public override fun priority(priority: Number) {
        cdkBuilder.priority(priority)
      }

      public override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupReferenceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupReferenceProperty,
    ) : StatefulRuleGroupReferenceProperty {
      public override fun `override`(): Any? = unwrap(this).getOverride()

      public override fun priority(): Number? = unwrap(this).getPriority()

      public override fun resourceArn(): String = unwrap(this).getResourceArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          StatefulRuleGroupReferenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupReferenceProperty):
          StatefulRuleGroupReferenceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatefulRuleGroupReferenceProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupReferenceProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DimensionProperty {
    public fun `value`(): String

    public interface Builder {
      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.DimensionProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.DimensionProperty.builder()

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.DimensionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.DimensionProperty,
    ) : DimensionProperty {
      public override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.DimensionProperty):
          DimensionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DimensionProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.DimensionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PolicyVariablesProperty {
    public fun ruleVariables(): Any? = unwrap(this).getRuleVariables()

    public interface Builder {
      public fun ruleVariables(ruleVariables: IResolvable) {
      }

      public fun ruleVariables(ruleVariables: Map<String, Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PolicyVariablesProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PolicyVariablesProperty.builder()

      public override fun ruleVariables(ruleVariables: IResolvable) {
        cdkBuilder.ruleVariables(ruleVariables.let(IResolvable::unwrap))
      }

      public override fun ruleVariables(ruleVariables: Map<String, Any>) {
        cdkBuilder.ruleVariables(ruleVariables)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PolicyVariablesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PolicyVariablesProperty,
    ) : PolicyVariablesProperty {
      public override fun ruleVariables(): Any? = unwrap(this).getRuleVariables()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyVariablesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PolicyVariablesProperty):
          PolicyVariablesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyVariablesProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.PolicyVariablesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CustomActionProperty {
    public fun actionDefinition(): Any

    public fun actionName(): String

    public interface Builder {
      public fun actionDefinition(actionDefinition: IResolvable) {
      }

      public fun actionDefinition(actionDefinition: ActionDefinitionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dd0a8d1a1cd7ed7b03b5bbc399ff186bb6dc0dce1de8ba5f266af5eb1769d035")
      public fun actionDefinition(actionDefinition: ActionDefinitionProperty.Builder.() -> Unit) {
      }

      public fun actionName(actionName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.CustomActionProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.CustomActionProperty.builder()

      public override fun actionDefinition(actionDefinition: IResolvable) {
        cdkBuilder.actionDefinition(actionDefinition.let(IResolvable::unwrap))
      }

      public override fun actionDefinition(actionDefinition: ActionDefinitionProperty) {
        cdkBuilder.actionDefinition(actionDefinition.let(ActionDefinitionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dd0a8d1a1cd7ed7b03b5bbc399ff186bb6dc0dce1de8ba5f266af5eb1769d035")
      public override
          fun actionDefinition(actionDefinition: ActionDefinitionProperty.Builder.() -> Unit): Unit
          = actionDefinition(ActionDefinitionProperty(actionDefinition))

      public override fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.CustomActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.CustomActionProperty,
    ) : CustomActionProperty {
      public override fun actionDefinition(): Any = unwrap(this).getActionDefinition()

      public override fun actionName(): String = unwrap(this).getActionName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CustomActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.CustomActionProperty):
          CustomActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomActionProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.CustomActionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FirewallPolicyProperty {
    public fun policyVariables(): Any? = unwrap(this).getPolicyVariables()

    public fun statefulDefaultActions(): List<String> = unwrap(this).getStatefulDefaultActions() ?:
        emptyList()

    public fun statefulEngineOptions(): Any? = unwrap(this).getStatefulEngineOptions()

    public fun statefulRuleGroupReferences(): Any? = unwrap(this).getStatefulRuleGroupReferences()

    public fun statelessCustomActions(): Any? = unwrap(this).getStatelessCustomActions()

    public fun statelessDefaultActions(): List<String>

    public fun statelessFragmentDefaultActions(): List<String>

    public fun statelessRuleGroupReferences(): Any? = unwrap(this).getStatelessRuleGroupReferences()

    public fun tlsInspectionConfigurationArn(): String? =
        unwrap(this).getTlsInspectionConfigurationArn()

    public interface Builder {
      public fun policyVariables(policyVariables: IResolvable) {
      }

      public fun policyVariables(policyVariables: PolicyVariablesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c1e79b0909d69ac9f8ec9ad77f008dfbf4f5d3aeef304c8d026900b1495d164")
      public fun policyVariables(policyVariables: PolicyVariablesProperty.Builder.() -> Unit) {
      }

      public fun statefulDefaultActions(statefulDefaultActions: List<String>) {
      }

      public fun statefulEngineOptions(statefulEngineOptions: IResolvable) {
      }

      public fun statefulEngineOptions(statefulEngineOptions: StatefulEngineOptionsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("580a3f4be7cfc54fabddc9cd8e0c9ff85d8c1dc2130ff4016fa3b8750d9ca735")
      public
          fun statefulEngineOptions(statefulEngineOptions: StatefulEngineOptionsProperty.Builder.() -> Unit) {
      }

      public fun statefulRuleGroupReferences(statefulRuleGroupReferences: IResolvable) {
      }

      public fun statefulRuleGroupReferences(statefulRuleGroupReferences: List<Any>) {
      }

      public fun statelessCustomActions(statelessCustomActions: IResolvable) {
      }

      public fun statelessCustomActions(statelessCustomActions: List<Any>) {
      }

      public fun statelessDefaultActions(statelessDefaultActions: List<String>) {
      }

      public fun statelessFragmentDefaultActions(statelessFragmentDefaultActions: List<String>) {
      }

      public fun statelessRuleGroupReferences(statelessRuleGroupReferences: IResolvable) {
      }

      public fun statelessRuleGroupReferences(statelessRuleGroupReferences: List<Any>) {
      }

      public fun tlsInspectionConfigurationArn(tlsInspectionConfigurationArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.FirewallPolicyProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.FirewallPolicyProperty.builder()

      public override fun policyVariables(policyVariables: IResolvable) {
        cdkBuilder.policyVariables(policyVariables.let(IResolvable::unwrap))
      }

      public override fun policyVariables(policyVariables: PolicyVariablesProperty) {
        cdkBuilder.policyVariables(policyVariables.let(PolicyVariablesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c1e79b0909d69ac9f8ec9ad77f008dfbf4f5d3aeef304c8d026900b1495d164")
      public override
          fun policyVariables(policyVariables: PolicyVariablesProperty.Builder.() -> Unit): Unit =
          policyVariables(PolicyVariablesProperty(policyVariables))

      public override fun statefulDefaultActions(statefulDefaultActions: List<String>) {
        cdkBuilder.statefulDefaultActions(statefulDefaultActions)
      }

      public override fun statefulEngineOptions(statefulEngineOptions: IResolvable) {
        cdkBuilder.statefulEngineOptions(statefulEngineOptions.let(IResolvable::unwrap))
      }

      public override
          fun statefulEngineOptions(statefulEngineOptions: StatefulEngineOptionsProperty) {
        cdkBuilder.statefulEngineOptions(statefulEngineOptions.let(StatefulEngineOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("580a3f4be7cfc54fabddc9cd8e0c9ff85d8c1dc2130ff4016fa3b8750d9ca735")
      public override
          fun statefulEngineOptions(statefulEngineOptions: StatefulEngineOptionsProperty.Builder.() -> Unit):
          Unit = statefulEngineOptions(StatefulEngineOptionsProperty(statefulEngineOptions))

      public override fun statefulRuleGroupReferences(statefulRuleGroupReferences: IResolvable) {
        cdkBuilder.statefulRuleGroupReferences(statefulRuleGroupReferences.let(IResolvable::unwrap))
      }

      public override fun statefulRuleGroupReferences(statefulRuleGroupReferences: List<Any>) {
        cdkBuilder.statefulRuleGroupReferences(statefulRuleGroupReferences)
      }

      public override fun statelessCustomActions(statelessCustomActions: IResolvable) {
        cdkBuilder.statelessCustomActions(statelessCustomActions.let(IResolvable::unwrap))
      }

      public override fun statelessCustomActions(statelessCustomActions: List<Any>) {
        cdkBuilder.statelessCustomActions(statelessCustomActions)
      }

      public override fun statelessDefaultActions(statelessDefaultActions: List<String>) {
        cdkBuilder.statelessDefaultActions(statelessDefaultActions)
      }

      public override
          fun statelessFragmentDefaultActions(statelessFragmentDefaultActions: List<String>) {
        cdkBuilder.statelessFragmentDefaultActions(statelessFragmentDefaultActions)
      }

      public override fun statelessRuleGroupReferences(statelessRuleGroupReferences: IResolvable) {
        cdkBuilder.statelessRuleGroupReferences(statelessRuleGroupReferences.let(IResolvable::unwrap))
      }

      public override fun statelessRuleGroupReferences(statelessRuleGroupReferences: List<Any>) {
        cdkBuilder.statelessRuleGroupReferences(statelessRuleGroupReferences)
      }

      public override fun tlsInspectionConfigurationArn(tlsInspectionConfigurationArn: String) {
        cdkBuilder.tlsInspectionConfigurationArn(tlsInspectionConfigurationArn)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.FirewallPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.FirewallPolicyProperty,
    ) : FirewallPolicyProperty {
      public override fun policyVariables(): Any? = unwrap(this).getPolicyVariables()

      public override fun statefulDefaultActions(): List<String> =
          unwrap(this).getStatefulDefaultActions() ?: emptyList()

      public override fun statefulEngineOptions(): Any? = unwrap(this).getStatefulEngineOptions()

      public override fun statefulRuleGroupReferences(): Any? =
          unwrap(this).getStatefulRuleGroupReferences()

      public override fun statelessCustomActions(): Any? = unwrap(this).getStatelessCustomActions()

      public override fun statelessDefaultActions(): List<String> =
          unwrap(this).getStatelessDefaultActions() ?: emptyList()

      public override fun statelessFragmentDefaultActions(): List<String> =
          unwrap(this).getStatelessFragmentDefaultActions() ?: emptyList()

      public override fun statelessRuleGroupReferences(): Any? =
          unwrap(this).getStatelessRuleGroupReferences()

      public override fun tlsInspectionConfigurationArn(): String? =
          unwrap(this).getTlsInspectionConfigurationArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FirewallPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.FirewallPolicyProperty):
          FirewallPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FirewallPolicyProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.FirewallPolicyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface StatefulRuleGroupOverrideProperty {
    public fun action(): String? = unwrap(this).getAction()

    public interface Builder {
      public fun action(action: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupOverrideProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupOverrideProperty.builder()

      public override fun action(action: String) {
        cdkBuilder.action(action)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupOverrideProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupOverrideProperty,
    ) : StatefulRuleGroupOverrideProperty {
      public override fun action(): String? = unwrap(this).getAction()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          StatefulRuleGroupOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupOverrideProperty):
          StatefulRuleGroupOverrideProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatefulRuleGroupOverrideProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.StatefulRuleGroupOverrideProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface IPSetProperty {
    public fun definition(): List<String> = unwrap(this).getDefinition() ?: emptyList()

    public interface Builder {
      public fun definition(definition: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.IPSetProperty.Builder =
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.IPSetProperty.builder()

      public override fun definition(definition: List<String>) {
        cdkBuilder.definition(definition)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.IPSetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.IPSetProperty,
    ) : IPSetProperty {
      public override fun definition(): List<String> = unwrap(this).getDefinition() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IPSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.IPSetProperty):
          IPSetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IPSetProperty):
          software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy.IPSetProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
