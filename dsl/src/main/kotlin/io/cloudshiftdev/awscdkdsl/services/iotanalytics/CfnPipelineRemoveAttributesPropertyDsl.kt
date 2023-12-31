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

package io.cloudshiftdev.awscdkdsl.services.iotanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iotanalytics.CfnPipeline

/**
 * An activity that removes attributes from a message.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * RemoveAttributesProperty removeAttributesProperty = RemoveAttributesProperty.builder()
 * .attributes(List.of("attributes"))
 * .name("name")
 * // the properties below are optional
 * .next("next")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-removeattributes.html)
 */
@CdkDslMarker
public class CfnPipelineRemoveAttributesPropertyDsl {
    private val cdkBuilder: CfnPipeline.RemoveAttributesProperty.Builder =
        CfnPipeline.RemoveAttributesProperty.builder()

    private val _attributes: MutableList<String> = mutableListOf()

    /** @param attributes A list of 1-50 attributes to remove from the message. */
    public fun attributes(vararg attributes: String) {
        _attributes.addAll(listOf(*attributes))
    }

    /** @param attributes A list of 1-50 attributes to remove from the message. */
    public fun attributes(attributes: Collection<String>) {
        _attributes.addAll(attributes)
    }

    /** @param name The name of the 'removeAttributes' activity. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param next The next activity in the pipeline. */
    public fun next(next: String) {
        cdkBuilder.next(next)
    }

    public fun build(): CfnPipeline.RemoveAttributesProperty {
        if (_attributes.isNotEmpty()) cdkBuilder.attributes(_attributes)
        return cdkBuilder.build()
    }
}
