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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnThingType
import software.amazon.awscdk.services.iot.CfnThingTypeProps

/**
 * Properties for defining a `CfnThingType`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnThingTypeProps cfnThingTypeProps = CfnThingTypeProps.builder()
 * .deprecateThingType(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .thingTypeName("thingTypeName")
 * .thingTypeProperties(ThingTypePropertiesProperty.builder()
 * .searchableAttributes(List.of("searchableAttributes"))
 * .thingTypeDescription("thingTypeDescription")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingtype.html)
 */
@CdkDslMarker
public class CfnThingTypePropsDsl {
    private val cdkBuilder: CfnThingTypeProps.Builder = CfnThingTypeProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param deprecateThingType Deprecates a thing type. You can not associate new things with
     *   deprecated thing type. Requires permission to access the
     *   [DeprecateThingType](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
     *   action.
     */
    public fun deprecateThingType(deprecateThingType: Boolean) {
        cdkBuilder.deprecateThingType(deprecateThingType)
    }

    /**
     * @param deprecateThingType Deprecates a thing type. You can not associate new things with
     *   deprecated thing type. Requires permission to access the
     *   [DeprecateThingType](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
     *   action.
     */
    public fun deprecateThingType(deprecateThingType: IResolvable) {
        cdkBuilder.deprecateThingType(deprecateThingType)
    }

    /** @param tags Metadata which can be used to manage the thing type. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Metadata which can be used to manage the thing type. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param thingTypeName The name of the thing type. */
    public fun thingTypeName(thingTypeName: String) {
        cdkBuilder.thingTypeName(thingTypeName)
    }

    /**
     * @param thingTypeProperties The thing type properties for the thing type to create. It
     *   contains information about the new thing type including a description, and a list of
     *   searchable thing attribute names. `ThingTypeProperties` can't be updated after the initial
     *   creation of the `ThingType` .
     */
    public fun thingTypeProperties(thingTypeProperties: IResolvable) {
        cdkBuilder.thingTypeProperties(thingTypeProperties)
    }

    /**
     * @param thingTypeProperties The thing type properties for the thing type to create. It
     *   contains information about the new thing type including a description, and a list of
     *   searchable thing attribute names. `ThingTypeProperties` can't be updated after the initial
     *   creation of the `ThingType` .
     */
    public fun thingTypeProperties(thingTypeProperties: CfnThingType.ThingTypePropertiesProperty) {
        cdkBuilder.thingTypeProperties(thingTypeProperties)
    }

    public fun build(): CfnThingTypeProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
