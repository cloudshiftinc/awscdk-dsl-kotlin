@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String

/**
 * The calculated field of an analysis.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * CalculatedFieldProperty calculatedFieldProperty = CalculatedFieldProperty.builder()
 * .dataSetIdentifier("dataSetIdentifier")
 * .expression("expression")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-analysis-calculatedfield.html)
 */
@CdkDslMarker
public class CfnAnalysisCalculatedFieldPropertyDsl {
    private val cdkBuilder: CfnAnalysis.CalculatedFieldProperty.Builder =
        CfnAnalysis.CalculatedFieldProperty.builder()

    /**
     * @param dataSetIdentifier The data set that is used in this calculated field.
     */
    public fun dataSetIdentifier(dataSetIdentifier: String) {
        cdkBuilder.dataSetIdentifier(dataSetIdentifier)
    }

    /**
     * @param expression The expression of the calculated field.
     */
    public fun expression(expression: String) {
        cdkBuilder.expression(expression)
    }

    /**
     * @param name The name of the calculated field.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnAnalysis.CalculatedFieldProperty = cdkBuilder.build()
}
