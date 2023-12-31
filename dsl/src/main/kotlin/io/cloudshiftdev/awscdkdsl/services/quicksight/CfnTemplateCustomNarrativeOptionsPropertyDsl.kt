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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The custom narrative options.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CustomNarrativeOptionsProperty customNarrativeOptionsProperty =
 * CustomNarrativeOptionsProperty.builder()
 * .narrative("narrative")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-customnarrativeoptions.html)
 */
@CdkDslMarker
public class CfnTemplateCustomNarrativeOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.CustomNarrativeOptionsProperty.Builder =
        CfnTemplate.CustomNarrativeOptionsProperty.builder()

    /** @param narrative The string input of custom narrative. */
    public fun narrative(narrative: String) {
        cdkBuilder.narrative(narrative)
    }

    public fun build(): CfnTemplate.CustomNarrativeOptionsProperty = cdkBuilder.build()
}
