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
 * The configuration of a `CustomContentVisual` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CustomContentConfigurationProperty customContentConfigurationProperty =
 * CustomContentConfigurationProperty.builder()
 * .contentType("contentType")
 * .contentUrl("contentUrl")
 * .imageScaling("imageScaling")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-customcontentconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateCustomContentConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.CustomContentConfigurationProperty.Builder =
        CfnTemplate.CustomContentConfigurationProperty.builder()

    /**
     * @param contentType The content type of the custom content visual. You can use this to have
     *   the visual render as an image.
     */
    public fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
    }

    /**
     * @param contentUrl The input URL that links to the custom content that you want in the custom
     *   visual.
     */
    public fun contentUrl(contentUrl: String) {
        cdkBuilder.contentUrl(contentUrl)
    }

    /**
     * @param imageScaling The sizing options for the size of the custom content visual. This
     *   structure is required when the `ContentType` of the visual is `'IMAGE'` .
     */
    public fun imageScaling(imageScaling: String) {
        cdkBuilder.imageScaling(imageScaling)
    }

    public fun build(): CfnTemplate.CustomContentConfigurationProperty = cdkBuilder.build()
}
