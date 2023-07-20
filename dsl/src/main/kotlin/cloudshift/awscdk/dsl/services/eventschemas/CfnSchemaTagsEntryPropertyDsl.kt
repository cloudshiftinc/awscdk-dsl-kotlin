@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.eventschemas

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.eventschemas.CfnSchema
import kotlin.String

@CdkDslMarker
public class CfnSchemaTagsEntryPropertyDsl {
    private val cdkBuilder: CfnSchema.TagsEntryProperty.Builder =
        CfnSchema.TagsEntryProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnSchema.TagsEntryProperty = cdkBuilder.build()
}
