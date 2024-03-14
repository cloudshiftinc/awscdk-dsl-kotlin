package io.cloudshiftdev.awscdk.services.wafv2

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

public open class CfnLoggingConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrManagedByFirewallManager(): IResolvable =
      unwrap(this).getAttrManagedByFirewallManager().let(IResolvable::wrap)

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logDestinationConfigs(): List<String> = unwrap(this).getLogDestinationConfigs() ?:
      emptyList()

  public open fun logDestinationConfigs(`value`: List<String>) {
    unwrap(this).setLogDestinationConfigs(`value`)
  }

  public open fun loggingFilter(): Any? = unwrap(this).getLoggingFilter()

  public open fun loggingFilter(`value`: Any) {
    unwrap(this).setLoggingFilter(`value`)
  }

  public open fun redactedFields(): Any? = unwrap(this).getRedactedFields()

  public open fun redactedFields(`value`: IResolvable) {
    unwrap(this).setRedactedFields(`value`.let(IResolvable::unwrap))
  }

  public open fun redactedFields(__idx_ac66f0: List<Any>) {
    unwrap(this).setRedactedFields(__idx_ac66f0)
  }

  public open fun resourceArn(): String = unwrap(this).getResourceArn()

  public open fun resourceArn(`value`: String) {
    unwrap(this).setResourceArn(`value`)
  }

  public interface Builder {
    public fun logDestinationConfigs(logDestinationConfigs: List<String>) {
    }

    public fun loggingFilter(loggingFilter: Any) {
    }

    public fun redactedFields(redactedFields: IResolvable) {
    }

    public fun redactedFields(redactedFields: List<Any>) {
    }

    public fun resourceArn(resourceArn: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.Builder =
        software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.Builder.create(scope, id)

    public override fun logDestinationConfigs(logDestinationConfigs: List<String>) {
      cdkBuilder.logDestinationConfigs(logDestinationConfigs)
    }

    public override fun loggingFilter(loggingFilter: Any) {
      cdkBuilder.loggingFilter(loggingFilter)
    }

    public override fun redactedFields(redactedFields: IResolvable) {
      cdkBuilder.redactedFields(redactedFields.let(IResolvable::unwrap))
    }

    public override fun redactedFields(redactedFields: List<Any>) {
      cdkBuilder.redactedFields(redactedFields)
    }

    public override fun resourceArn(resourceArn: String) {
      cdkBuilder.resourceArn(resourceArn)
    }

    public fun build(): software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLoggingConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLoggingConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration):
        CfnLoggingConfiguration = CfnLoggingConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnLoggingConfiguration):
        software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration = wrapped.cdkObject
  }

  public interface LabelNameConditionProperty {
    public fun labelName(): String

    public interface Builder {
      public fun labelName(labelName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LabelNameConditionProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LabelNameConditionProperty.builder()

      public override fun labelName(labelName: String) {
        cdkBuilder.labelName(labelName)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LabelNameConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LabelNameConditionProperty,
    ) : LabelNameConditionProperty {
      public override fun labelName(): String = unwrap(this).getLabelName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LabelNameConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LabelNameConditionProperty):
          LabelNameConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LabelNameConditionProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LabelNameConditionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FilterProperty {
    public fun behavior(): String

    public fun conditions(): Any

    public fun requirement(): String

    public interface Builder {
      public fun behavior(behavior: String) {
      }

      public fun conditions(conditions: IResolvable) {
      }

      public fun conditions(conditions: List<Any>) {
      }

      public fun requirement(requirement: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FilterProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FilterProperty.builder()

      public override fun behavior(behavior: String) {
        cdkBuilder.behavior(behavior)
      }

      public override fun conditions(conditions: IResolvable) {
        cdkBuilder.conditions(conditions.let(IResolvable::unwrap))
      }

      public override fun conditions(conditions: List<Any>) {
        cdkBuilder.conditions(conditions)
      }

      public override fun requirement(requirement: String) {
        cdkBuilder.requirement(requirement)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FilterProperty,
    ) : FilterProperty {
      public override fun behavior(): String = unwrap(this).getBehavior()

      public override fun conditions(): Any = unwrap(this).getConditions()

      public override fun requirement(): String = unwrap(this).getRequirement()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FilterProperty):
          FilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FilterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LoggingFilterProperty {
    public fun defaultBehavior(): String

    public fun filters(): Any

    public interface Builder {
      public fun defaultBehavior(defaultBehavior: String) {
      }

      public fun filters(filters: IResolvable) {
      }

      public fun filters(filters: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LoggingFilterProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LoggingFilterProperty.builder()

      public override fun defaultBehavior(defaultBehavior: String) {
        cdkBuilder.defaultBehavior(defaultBehavior)
      }

      public override fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters.let(IResolvable::unwrap))
      }

      public override fun filters(filters: List<Any>) {
        cdkBuilder.filters(filters)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LoggingFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LoggingFilterProperty,
    ) : LoggingFilterProperty {
      public override fun defaultBehavior(): String = unwrap(this).getDefaultBehavior()

      public override fun filters(): Any = unwrap(this).getFilters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LoggingFilterProperty):
          LoggingFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoggingFilterProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.LoggingFilterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SingleHeaderProperty {
    public fun name(): String

    public interface Builder {
      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.SingleHeaderProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.SingleHeaderProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.SingleHeaderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.SingleHeaderProperty,
    ) : SingleHeaderProperty {
      public override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SingleHeaderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.SingleHeaderProperty):
          SingleHeaderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleHeaderProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.SingleHeaderProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConditionProperty {
    public fun actionCondition(): Any? = unwrap(this).getActionCondition()

    public fun labelNameCondition(): Any? = unwrap(this).getLabelNameCondition()

    public interface Builder {
      public fun actionCondition(actionCondition: IResolvable) {
      }

      public fun actionCondition(actionCondition: ActionConditionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3b3cd5e6627685433dd5fb1edd61d760fdeaaf76940ac0b738602063754b5759")
      public fun actionCondition(actionCondition: ActionConditionProperty.Builder.() -> Unit) {
      }

      public fun labelNameCondition(labelNameCondition: IResolvable) {
      }

      public fun labelNameCondition(labelNameCondition: LabelNameConditionProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c2ef676ac8836bd83691849c0052441a394f30aa7e8af8a052f1c99f452d30c")
      public
          fun labelNameCondition(labelNameCondition: LabelNameConditionProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ConditionProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ConditionProperty.builder()

      public override fun actionCondition(actionCondition: IResolvable) {
        cdkBuilder.actionCondition(actionCondition.let(IResolvable::unwrap))
      }

      public override fun actionCondition(actionCondition: ActionConditionProperty) {
        cdkBuilder.actionCondition(actionCondition.let(ActionConditionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3b3cd5e6627685433dd5fb1edd61d760fdeaaf76940ac0b738602063754b5759")
      public override
          fun actionCondition(actionCondition: ActionConditionProperty.Builder.() -> Unit): Unit =
          actionCondition(ActionConditionProperty(actionCondition))

      public override fun labelNameCondition(labelNameCondition: IResolvable) {
        cdkBuilder.labelNameCondition(labelNameCondition.let(IResolvable::unwrap))
      }

      public override fun labelNameCondition(labelNameCondition: LabelNameConditionProperty) {
        cdkBuilder.labelNameCondition(labelNameCondition.let(LabelNameConditionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c2ef676ac8836bd83691849c0052441a394f30aa7e8af8a052f1c99f452d30c")
      public override
          fun labelNameCondition(labelNameCondition: LabelNameConditionProperty.Builder.() -> Unit):
          Unit = labelNameCondition(LabelNameConditionProperty(labelNameCondition))

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ConditionProperty,
    ) : ConditionProperty {
      public override fun actionCondition(): Any? = unwrap(this).getActionCondition()

      public override fun labelNameCondition(): Any? = unwrap(this).getLabelNameCondition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ConditionProperty):
          ConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ConditionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ActionConditionProperty {
    public fun action(): String

    public interface Builder {
      public fun action(action: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ActionConditionProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ActionConditionProperty.builder()

      public override fun action(action: String) {
        cdkBuilder.action(action)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ActionConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ActionConditionProperty,
    ) : ActionConditionProperty {
      public override fun action(): String = unwrap(this).getAction()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActionConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ActionConditionProperty):
          ActionConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionConditionProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.ActionConditionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FieldToMatchProperty {
    public fun jsonBody(): Any? = unwrap(this).getJsonBody()

    public fun method(): Any? = unwrap(this).getMethod()

    public fun queryString(): Any? = unwrap(this).getQueryString()

    public fun singleHeader(): Any? = unwrap(this).getSingleHeader()

    public fun uriPath(): Any? = unwrap(this).getUriPath()

    public interface Builder {
      public fun jsonBody(jsonBody: Any) {
      }

      public fun method(method: Any) {
      }

      public fun queryString(queryString: Any) {
      }

      public fun singleHeader(singleHeader: Any) {
      }

      public fun uriPath(uriPath: Any) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FieldToMatchProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FieldToMatchProperty.builder()

      public override fun jsonBody(jsonBody: Any) {
        cdkBuilder.jsonBody(jsonBody)
      }

      public override fun method(method: Any) {
        cdkBuilder.method(method)
      }

      public override fun queryString(queryString: Any) {
        cdkBuilder.queryString(queryString)
      }

      public override fun singleHeader(singleHeader: Any) {
        cdkBuilder.singleHeader(singleHeader)
      }

      public override fun uriPath(uriPath: Any) {
        cdkBuilder.uriPath(uriPath)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FieldToMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FieldToMatchProperty,
    ) : FieldToMatchProperty {
      public override fun jsonBody(): Any? = unwrap(this).getJsonBody()

      public override fun method(): Any? = unwrap(this).getMethod()

      public override fun queryString(): Any? = unwrap(this).getQueryString()

      public override fun singleHeader(): Any? = unwrap(this).getSingleHeader()

      public override fun uriPath(): Any? = unwrap(this).getUriPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FieldToMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FieldToMatchProperty):
          FieldToMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldToMatchProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FieldToMatchProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MatchPatternProperty {
    public fun all(): Any? = unwrap(this).getAll()

    public fun includedPaths(): List<String> = unwrap(this).getIncludedPaths() ?: emptyList()

    public interface Builder {
      public fun all(all: Any) {
      }

      public fun includedPaths(includedPaths: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.MatchPatternProperty.Builder
          =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.MatchPatternProperty.builder()

      public override fun all(all: Any) {
        cdkBuilder.all(all)
      }

      public override fun includedPaths(includedPaths: List<String>) {
        cdkBuilder.includedPaths(includedPaths)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.MatchPatternProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.MatchPatternProperty,
    ) : MatchPatternProperty {
      public override fun all(): Any? = unwrap(this).getAll()

      public override fun includedPaths(): List<String> = unwrap(this).getIncludedPaths() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MatchPatternProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.MatchPatternProperty):
          MatchPatternProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatchPatternProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.MatchPatternProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface JsonBodyProperty {
    public fun invalidFallbackBehavior(): String? = unwrap(this).getInvalidFallbackBehavior()

    public fun matchPattern(): Any

    public fun matchScope(): String

    public interface Builder {
      public fun invalidFallbackBehavior(invalidFallbackBehavior: String) {
      }

      public fun matchPattern(matchPattern: IResolvable) {
      }

      public fun matchPattern(matchPattern: MatchPatternProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47b476afe276952959a64bd7d77e5444c8c854c6ae0d48aed8f259844a9e3648")
      public fun matchPattern(matchPattern: MatchPatternProperty.Builder.() -> Unit) {
      }

      public fun matchScope(matchScope: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.JsonBodyProperty.Builder =
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.JsonBodyProperty.builder()

      public override fun invalidFallbackBehavior(invalidFallbackBehavior: String) {
        cdkBuilder.invalidFallbackBehavior(invalidFallbackBehavior)
      }

      public override fun matchPattern(matchPattern: IResolvable) {
        cdkBuilder.matchPattern(matchPattern.let(IResolvable::unwrap))
      }

      public override fun matchPattern(matchPattern: MatchPatternProperty) {
        cdkBuilder.matchPattern(matchPattern.let(MatchPatternProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("47b476afe276952959a64bd7d77e5444c8c854c6ae0d48aed8f259844a9e3648")
      public override fun matchPattern(matchPattern: MatchPatternProperty.Builder.() -> Unit): Unit
          = matchPattern(MatchPatternProperty(matchPattern))

      public override fun matchScope(matchScope: String) {
        cdkBuilder.matchScope(matchScope)
      }

      public fun build():
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.JsonBodyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.JsonBodyProperty,
    ) : JsonBodyProperty {
      public override fun invalidFallbackBehavior(): String? =
          unwrap(this).getInvalidFallbackBehavior()

      public override fun matchPattern(): Any = unwrap(this).getMatchPattern()

      public override fun matchScope(): String = unwrap(this).getMatchScope()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JsonBodyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.JsonBodyProperty):
          JsonBodyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonBodyProperty):
          software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.JsonBodyProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
