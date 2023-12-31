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

package io.cloudshiftdev.awscdkdsl.services.glue

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnClassifier

/**
 * A classifier for `XML` content.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * XMLClassifierProperty xMLClassifierProperty = XMLClassifierProperty.builder()
 * .classification("classification")
 * .rowTag("rowTag")
 * // the properties below are optional
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-classifier-xmlclassifier.html)
 */
@CdkDslMarker
public class CfnClassifierXMLClassifierPropertyDsl {
    private val cdkBuilder: CfnClassifier.XMLClassifierProperty.Builder =
        CfnClassifier.XMLClassifierProperty.builder()

    /** @param classification An identifier of the data format that the classifier matches. */
    public fun classification(classification: String) {
        cdkBuilder.classification(classification)
    }

    /** @param name The name of the classifier. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param rowTag The XML tag designating the element that contains each record in an XML
     *   document being parsed. This can't identify a self-closing element (closed by `/&gt;` ). An
     *   empty row element that contains only attributes can be parsed as long as it ends with a
     *   closing tag (for example, `&lt;row item_a="A" item_b="B"&gt;&lt;/row&gt;` is okay, but
     *   `&lt;row item_a="A" item_b="B" /&gt;` is not).
     */
    public fun rowTag(rowTag: String) {
        cdkBuilder.rowTag(rowTag)
    }

    public fun build(): CfnClassifier.XMLClassifierProperty = cdkBuilder.build()
}
