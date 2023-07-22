@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-shortformattext.html)
 */
@CdkDslMarker
public class CfnAnalysisShortFormatTextPropertyDsl {
  private val cdkBuilder: CfnAnalysis.ShortFormatTextProperty.Builder =
      CfnAnalysis.ShortFormatTextProperty.builder()

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

  public fun build(): CfnAnalysis.ShortFormatTextProperty = cdkBuilder.build()
}
