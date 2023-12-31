@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.events

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.EventBus
import software.constructs.Construct

/**
 * Define an EventBridge EventBus.
 *
 * Example:
 * ```
 * EventBus bus = EventBus.Builder.create(this, "bus")
 * .eventBusName("MyCustomEventBus")
 * .build();
 * bus.archive("MyArchive", BaseArchiveProps.builder()
 * .archiveName("MyCustomEventBusArchive")
 * .description("MyCustomerEventBus Archive")
 * .eventPattern(EventPattern.builder()
 * .account(List.of(Stack.of(this).getAccount()))
 * .build())
 * .retention(Duration.days(365))
 * .build());
 * ```
 */
@CdkDslMarker
public class EventBusDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: EventBus.Builder = EventBus.Builder.create(scope, id)

    /**
     * The name of the event bus you are creating Note: If 'eventSourceName' is passed in, you
     * cannot set this.
     *
     * Default: - automatically generated name
     *
     * @param eventBusName The name of the event bus you are creating Note: If 'eventSourceName' is
     *   passed in, you cannot set this.
     */
    public fun eventBusName(eventBusName: String) {
        cdkBuilder.eventBusName(eventBusName)
    }

    /**
     * The partner event source to associate with this event bus resource Note: If 'eventBusName' is
     * passed in, you cannot set this.
     *
     * Default: - no partner event source
     *
     * @param eventSourceName The partner event source to associate with this event bus resource
     *   Note: If 'eventBusName' is passed in, you cannot set this.
     */
    public fun eventSourceName(eventSourceName: String) {
        cdkBuilder.eventSourceName(eventSourceName)
    }

    public fun build(): EventBus = cdkBuilder.build()
}
