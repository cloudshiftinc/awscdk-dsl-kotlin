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

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.servicecatalog.TagOptions
import software.constructs.Construct
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

@CdkDslMarker
public class TagOptionsDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: TagOptions.Builder = TagOptions.Builder.create(scope, id)

    public fun allowedValuesForTags(allowedValuesForTags: Map<String, List<String>>) {
        cdkBuilder.allowedValuesForTags(allowedValuesForTags)
    }

    public fun build(): TagOptions = cdkBuilder.build()
}
