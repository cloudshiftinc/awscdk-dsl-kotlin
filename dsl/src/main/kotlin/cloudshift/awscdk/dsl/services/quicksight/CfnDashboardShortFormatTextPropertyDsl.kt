@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.String

/**
 * The text format for the title.
 *
 * This is a union type structure. For this structure to be valid, only one of the attributes can be
 * defined.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ShortFormatTextProperty shortFormatTextProperty = ShortFormatTextProperty.builder()
 * .plainText("plainText")
 * .richText("richText")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-shortformattext.html)
 */
@CdkDslMarker
public class CfnDashboardShortFormatTextPropertyDsl {
    private val cdkBuilder: CfnDashboard.ShortFormatTextProperty.Builder =
        CfnDashboard.ShortFormatTextProperty.builder()

    /**
     * @param plainText Plain text format.
     */
    public fun plainText(plainText: String) {
        cdkBuilder.plainText(plainText)
    }

    /**
     * @param richText Rich text.
     * Examples of rich text include bold, underline, and italics.
     */
    public fun richText(richText: String) {
        cdkBuilder.richText(richText)
    }

    public fun build(): CfnDashboard.ShortFormatTextProperty = cdkBuilder.build()
}
