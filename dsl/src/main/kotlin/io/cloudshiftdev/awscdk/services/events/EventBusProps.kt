package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface EventBusProps {
  /**
   * The name of the event bus you are creating Note: If 'eventSourceName' is passed in, you cannot
   * set this.
   *
   * Default: - automatically generated name
   */
  public fun eventBusName(): String? = unwrap(this).getEventBusName()

  /**
   * The partner event source to associate with this event bus resource Note: If 'eventBusName' is
   * passed in, you cannot set this.
   *
   * Default: - no partner event source
   */
  public fun eventSourceName(): String? = unwrap(this).getEventSourceName()

  /**
   * A builder for [EventBusProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param eventBusName The name of the event bus you are creating Note: If 'eventSourceName' is
     * passed in, you cannot set this.
     */
    public fun eventBusName(eventBusName: String)

    /**
     * @param eventSourceName The partner event source to associate with this event bus resource
     * Note: If 'eventBusName' is passed in, you cannot set this.
     */
    public fun eventSourceName(eventSourceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.EventBusProps.Builder =
        software.amazon.awscdk.services.events.EventBusProps.builder()

    /**
     * @param eventBusName The name of the event bus you are creating Note: If 'eventSourceName' is
     * passed in, you cannot set this.
     */
    override fun eventBusName(eventBusName: String) {
      cdkBuilder.eventBusName(eventBusName)
    }

    /**
     * @param eventSourceName The partner event source to associate with this event bus resource
     * Note: If 'eventBusName' is passed in, you cannot set this.
     */
    override fun eventSourceName(eventSourceName: String) {
      cdkBuilder.eventSourceName(eventSourceName)
    }

    public fun build(): software.amazon.awscdk.services.events.EventBusProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.EventBusProps,
  ) : CdkObject(cdkObject), EventBusProps {
    /**
     * The name of the event bus you are creating Note: If 'eventSourceName' is passed in, you
     * cannot set this.
     *
     * Default: - automatically generated name
     */
    override fun eventBusName(): String? = unwrap(this).getEventBusName()

    /**
     * The partner event source to associate with this event bus resource Note: If 'eventBusName' is
     * passed in, you cannot set this.
     *
     * Default: - no partner event source
     */
    override fun eventSourceName(): String? = unwrap(this).getEventSourceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EventBusProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.EventBusProps):
        EventBusProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventBusProps):
        software.amazon.awscdk.services.events.EventBusProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.events.EventBusProps
  }
}
