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

package io.cloudshiftdev.awscdkdsl.services.eventschemas

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.eventschemas.CfnSchema
import software.amazon.awscdk.services.eventschemas.CfnSchemaProps

/**
 * Properties for defining a `CfnSchema`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eventschemas.*;
 * CfnSchemaProps cfnSchemaProps = CfnSchemaProps.builder()
 * .content("content")
 * .registryName("registryName")
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .schemaName("schemaName")
 * .tags(List.of(TagsEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-schema.html)
 */
@CdkDslMarker
public class CfnSchemaPropsDsl {
    private val cdkBuilder: CfnSchemaProps.Builder = CfnSchemaProps.builder()

    private val _tags: MutableList<CfnSchema.TagsEntryProperty> = mutableListOf()

    /** @param content The source of the schema definition. */
    public fun content(content: String) {
        cdkBuilder.content(content)
    }

    /** @param description A description of the schema. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param registryName The name of the schema registry. */
    public fun registryName(registryName: String) {
        cdkBuilder.registryName(registryName)
    }

    /** @param schemaName The name of the schema. */
    public fun schemaName(schemaName: String) {
        cdkBuilder.schemaName(schemaName)
    }

    /** @param tags Tags associated with the schema. */
    public fun tags(tags: CfnSchemaTagsEntryPropertyDsl.() -> Unit) {
        _tags.add(CfnSchemaTagsEntryPropertyDsl().apply(tags).build())
    }

    /** @param tags Tags associated with the schema. */
    public fun tags(tags: Collection<CfnSchema.TagsEntryProperty>) {
        _tags.addAll(tags)
    }

    /** @param type The type of schema. Valid types include `OpenApi3` and `JSONSchemaDraft4` . */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnSchemaProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
