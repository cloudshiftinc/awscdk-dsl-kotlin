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

package io.cloudshiftdev.awscdkdsl.services.appintegrations

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appintegrations.CfnEventIntegration
import software.amazon.awscdk.services.appintegrations.CfnEventIntegrationProps

/**
 * Properties for defining a `CfnEventIntegration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appintegrations.*;
 * CfnEventIntegrationProps cfnEventIntegrationProps = CfnEventIntegrationProps.builder()
 * .eventBridgeBus("eventBridgeBus")
 * .eventFilter(EventFilterProperty.builder()
 * .source("source")
 * .build())
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appintegrations-eventintegration.html)
 */
@CdkDslMarker
public class CfnEventIntegrationPropsDsl {
    private val cdkBuilder: CfnEventIntegrationProps.Builder = CfnEventIntegrationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description The event integration description. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param eventBridgeBus The Amazon EventBridge bus for the event integration. */
    public fun eventBridgeBus(eventBridgeBus: String) {
        cdkBuilder.eventBridgeBus(eventBridgeBus)
    }

    /** @param eventFilter The event integration filter. */
    public fun eventFilter(eventFilter: IResolvable) {
        cdkBuilder.eventFilter(eventFilter)
    }

    /** @param eventFilter The event integration filter. */
    public fun eventFilter(eventFilter: CfnEventIntegration.EventFilterProperty) {
        cdkBuilder.eventFilter(eventFilter)
    }

    /** @param name The name of the event integration. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnEventIntegrationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
