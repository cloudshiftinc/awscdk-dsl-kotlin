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

package io.cloudshiftdev.awscdkdsl.services.location

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.location.CfnMap
import software.amazon.awscdk.services.location.CfnMapProps

/**
 * Properties for defining a `CfnMap`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.location.*;
 * CfnMapProps cfnMapProps = CfnMapProps.builder()
 * .configuration(MapConfigurationProperty.builder()
 * .style("style")
 * .build())
 * .mapName("mapName")
 * // the properties below are optional
 * .description("description")
 * .pricingPlan("pricingPlan")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-map.html)
 */
@CdkDslMarker
public class CfnMapPropsDsl {
    private val cdkBuilder: CfnMapProps.Builder = CfnMapProps.builder()

    /**
     * @param configuration Specifies the `MapConfiguration` , including the map style, for the map
     *   resource that you create. The map style defines the look of maps and the data provider for
     *   your map resource.
     */
    public fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * @param configuration Specifies the `MapConfiguration` , including the map style, for the map
     *   resource that you create. The map style defines the look of maps and the data provider for
     *   your map resource.
     */
    public fun configuration(configuration: CfnMap.MapConfigurationProperty) {
        cdkBuilder.configuration(configuration)
    }

    /** @param description An optional description for the map resource. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param mapName The name for the map resource. Requirements:
     * * Must contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and
     *   underscores (_).
     * * Must be a unique map resource name.
     * * No spaces allowed. For example, `ExampleMap` .
     */
    public fun mapName(mapName: String) {
        cdkBuilder.mapName(mapName)
    }

    /**
     * @param pricingPlan No longer used. If included, the only allowed value is `RequestBasedUsage`
     *   . *Allowed Values* : `RequestBasedUsage`
     */
    public fun pricingPlan(pricingPlan: String) {
        cdkBuilder.pricingPlan(pricingPlan)
    }

    public fun build(): CfnMapProps = cdkBuilder.build()
}
