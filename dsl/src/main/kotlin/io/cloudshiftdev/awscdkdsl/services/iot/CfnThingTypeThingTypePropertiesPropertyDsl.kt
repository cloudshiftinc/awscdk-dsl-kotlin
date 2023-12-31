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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iot.CfnThingType

/**
 * The ThingTypeProperties contains information about the thing type including: a thing type
 * description, and a list of searchable thing attribute names.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * ThingTypePropertiesProperty thingTypePropertiesProperty = ThingTypePropertiesProperty.builder()
 * .searchableAttributes(List.of("searchableAttributes"))
 * .thingTypeDescription("thingTypeDescription")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-thingtype-thingtypeproperties.html)
 */
@CdkDslMarker
public class CfnThingTypeThingTypePropertiesPropertyDsl {
    private val cdkBuilder: CfnThingType.ThingTypePropertiesProperty.Builder =
        CfnThingType.ThingTypePropertiesProperty.builder()

    private val _searchableAttributes: MutableList<String> = mutableListOf()

    /** @param searchableAttributes A list of searchable thing attribute names. */
    public fun searchableAttributes(vararg searchableAttributes: String) {
        _searchableAttributes.addAll(listOf(*searchableAttributes))
    }

    /** @param searchableAttributes A list of searchable thing attribute names. */
    public fun searchableAttributes(searchableAttributes: Collection<String>) {
        _searchableAttributes.addAll(searchableAttributes)
    }

    /** @param thingTypeDescription The description of the thing type. */
    public fun thingTypeDescription(thingTypeDescription: String) {
        cdkBuilder.thingTypeDescription(thingTypeDescription)
    }

    public fun build(): CfnThingType.ThingTypePropertiesProperty {
        if (_searchableAttributes.isNotEmpty())
            cdkBuilder.searchableAttributes(_searchableAttributes)
        return cdkBuilder.build()
    }
}
