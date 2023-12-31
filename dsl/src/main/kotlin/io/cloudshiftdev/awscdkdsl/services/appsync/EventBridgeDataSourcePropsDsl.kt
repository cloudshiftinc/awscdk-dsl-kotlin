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

package io.cloudshiftdev.awscdkdsl.services.appsync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.EventBridgeDataSourceProps
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.events.IEventBus
import software.amazon.awscdk.services.iam.IRole

/**
 * Properties for an AppSync EventBridge datasource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * import software.amazon.awscdk.services.events.*;
 * import software.amazon.awscdk.services.iam.*;
 * EventBus eventBus;
 * GraphqlApi graphqlApi;
 * Role role;
 * EventBridgeDataSourceProps eventBridgeDataSourceProps = EventBridgeDataSourceProps.builder()
 * .api(graphqlApi)
 * .eventBus(eventBus)
 * // the properties below are optional
 * .description("description")
 * .name("name")
 * .serviceRole(role)
 * .build();
 * ```
 */
@CdkDslMarker
public class EventBridgeDataSourcePropsDsl {
    private val cdkBuilder: EventBridgeDataSourceProps.Builder =
        EventBridgeDataSourceProps.builder()

    /** @param api The API to attach this data source to. */
    public fun api(api: IGraphqlApi) {
        cdkBuilder.api(api)
    }

    /** @param description the description of the data source. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param eventBus The EventBridge EventBus. */
    public fun eventBus(eventBus: IEventBus) {
        cdkBuilder.eventBus(eventBus)
    }

    /** @param name The name of the data source. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param serviceRole The IAM service role to be assumed by AppSync to interact with the data
     *   source.
     */
    public fun serviceRole(serviceRole: IRole) {
        cdkBuilder.serviceRole(serviceRole)
    }

    public fun build(): EventBridgeDataSourceProps = cdkBuilder.build()
}
