@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String

/**
 * The options for data bars.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DataBarsOptionsProperty dataBarsOptionsProperty = DataBarsOptionsProperty.builder()
 * .fieldId("fieldId")
 * // the properties below are optional
 * .negativeColor("negativeColor")
 * .positiveColor("positiveColor")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-databarsoptions.html)
 */
@CdkDslMarker
public class CfnTemplateDataBarsOptionsPropertyDsl {
    private val cdkBuilder: CfnTemplate.DataBarsOptionsProperty.Builder =
        CfnTemplate.DataBarsOptionsProperty.builder()

    /**
     * @param fieldId The field ID for the data bars options.
     */
    public fun fieldId(fieldId: String) {
        cdkBuilder.fieldId(fieldId)
    }

    /**
     * @param negativeColor The color of the negative data bar.
     */
    public fun negativeColor(negativeColor: String) {
        cdkBuilder.negativeColor(negativeColor)
    }

    /**
     * @param positiveColor The color of the positive data bar.
     */
    public fun positiveColor(positiveColor: String) {
        cdkBuilder.positiveColor(positiveColor)
    }

    public fun build(): CfnTemplate.DataBarsOptionsProperty = cdkBuilder.build()
}
