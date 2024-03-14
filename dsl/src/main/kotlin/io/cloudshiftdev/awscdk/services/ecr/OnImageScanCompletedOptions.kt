package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.services.events.EventPattern
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface OnImageScanCompletedOptions : OnEventOptions {
  public fun imageTags(): List<String> = unwrap(this).getImageTags() ?: emptyList()

  public interface Builder {
    public fun crossStackScope(crossStackScope: Construct) {
    }

    public fun description(description: String) {
    }

    public fun eventPattern(eventPattern: EventPattern) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf45c2c16e38272d1b5548976659dc1c0e2c1bf198af7c1978500dedc86da8d8")
    public fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit) {
    }

    public fun imageTags(imageTags: List<String>) {
    }

    public fun ruleName(ruleName: String) {
    }

    public fun target(target: IRuleTarget) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.OnImageScanCompletedOptions.Builder
        = software.amazon.awscdk.services.ecr.OnImageScanCompletedOptions.builder()

    public override fun crossStackScope(crossStackScope: Construct) {
      cdkBuilder.crossStackScope(crossStackScope.let(Construct::unwrap))
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun eventPattern(eventPattern: EventPattern) {
      cdkBuilder.eventPattern(eventPattern.let(EventPattern::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf45c2c16e38272d1b5548976659dc1c0e2c1bf198af7c1978500dedc86da8d8")
    public override fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit): Unit =
        eventPattern(EventPattern(eventPattern))

    public override fun imageTags(imageTags: List<String>) {
      cdkBuilder.imageTags(imageTags)
    }

    public override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    public override fun target(target: IRuleTarget) {
      cdkBuilder.target(target.let(IRuleTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecr.OnImageScanCompletedOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecr.OnImageScanCompletedOptions,
  ) : OnImageScanCompletedOptions {
    public override fun crossStackScope(): Construct? =
        unwrap(this).getCrossStackScope()?.let(Construct::wrap)

    public override fun description(): String? = unwrap(this).getDescription()

    public override fun eventPattern(): EventPattern? =
        unwrap(this).getEventPattern()?.let(EventPattern::wrap)

    public override fun imageTags(): List<String> = unwrap(this).getImageTags() ?: emptyList()

    public override fun ruleName(): String? = unwrap(this).getRuleName()

    public override fun target(): IRuleTarget? = unwrap(this).getTarget()?.let(IRuleTarget::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): OnImageScanCompletedOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.OnImageScanCompletedOptions):
        OnImageScanCompletedOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OnImageScanCompletedOptions):
        software.amazon.awscdk.services.ecr.OnImageScanCompletedOptions = (wrapped as
        Wrapper).cdkObject
  }
}
