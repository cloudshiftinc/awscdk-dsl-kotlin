package io.cloudshiftdev.awscdk.services.events

import kotlin.String
import kotlin.Unit

public interface EventBusAttributes {
  public fun eventBusArn(): String

  public fun eventBusName(): String

  public fun eventBusPolicy(): String

  public fun eventSourceName(): String? = unwrap(this).getEventSourceName()

  public interface Builder {
    public fun eventBusArn(eventBusArn: String)

    public fun eventBusName(eventBusName: String)

    public fun eventBusPolicy(eventBusPolicy: String)

    public fun eventSourceName(eventSourceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.EventBusAttributes.Builder =
        software.amazon.awscdk.services.events.EventBusAttributes.builder()

    override fun eventBusArn(eventBusArn: String) {
      cdkBuilder.eventBusArn(eventBusArn)
    }

    override fun eventBusName(eventBusName: String) {
      cdkBuilder.eventBusName(eventBusName)
    }

    override fun eventBusPolicy(eventBusPolicy: String) {
      cdkBuilder.eventBusPolicy(eventBusPolicy)
    }

    override fun eventSourceName(eventSourceName: String) {
      cdkBuilder.eventSourceName(eventSourceName)
    }

    public fun build(): software.amazon.awscdk.services.events.EventBusAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.events.EventBusAttributes,
  ) : EventBusAttributes {
    override fun eventBusArn(): String = unwrap(this).getEventBusArn()

    override fun eventBusName(): String = unwrap(this).getEventBusName()

    override fun eventBusPolicy(): String = unwrap(this).getEventBusPolicy()

    override fun eventSourceName(): String? = unwrap(this).getEventSourceName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EventBusAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.EventBusAttributes):
        EventBusAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventBusAttributes):
        software.amazon.awscdk.services.events.EventBusAttributes = (wrapped as Wrapper).cdkObject
  }
}