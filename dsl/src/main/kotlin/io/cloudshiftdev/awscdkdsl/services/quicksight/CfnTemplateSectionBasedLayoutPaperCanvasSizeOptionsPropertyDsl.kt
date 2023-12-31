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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The options for a paper canvas of a section-based layout.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SectionBasedLayoutPaperCanvasSizeOptionsProperty sectionBasedLayoutPaperCanvasSizeOptionsProperty
 * = SectionBasedLayoutPaperCanvasSizeOptionsProperty.builder()
 * .paperMargin(SpacingProperty.builder()
 * .bottom("bottom")
 * .left("left")
 * .right("right")
 * .top("top")
 * .build())
 * .paperOrientation("paperOrientation")
 * .paperSize("paperSize")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-sectionbasedlayoutpapercanvassizeoptions.html)
 */
@CdkDslMarker
public class CfnTemplateSectionBasedLayoutPaperCanvasSizeOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.SectionBasedLayoutPaperCanvasSizeOptionsProperty.Builder =
        CfnTemplate.SectionBasedLayoutPaperCanvasSizeOptionsProperty.builder()

    /**
     * @param paperMargin Defines the spacing between the canvas content and the top, bottom, left,
     *   and right edges.
     */
    public fun paperMargin(paperMargin: IResolvable) {
        cdkBuilder.paperMargin(paperMargin)
    }

    /**
     * @param paperMargin Defines the spacing between the canvas content and the top, bottom, left,
     *   and right edges.
     */
    public fun paperMargin(paperMargin: CfnTemplate.SpacingProperty) {
        cdkBuilder.paperMargin(paperMargin)
    }

    /**
     * @param paperOrientation The paper orientation that is used to define canvas dimensions.
     *   Choose one of the following options:.
     * * PORTRAIT
     * * LANDSCAPE
     */
    public fun paperOrientation(paperOrientation: String) {
        cdkBuilder.paperOrientation(paperOrientation)
    }

    /** @param paperSize The paper size that is used to define canvas dimensions. */
    public fun paperSize(paperSize: String) {
        cdkBuilder.paperSize(paperSize)
    }

    public fun build(): CfnTemplate.SectionBasedLayoutPaperCanvasSizeOptionsProperty =
        cdkBuilder.build()
}
