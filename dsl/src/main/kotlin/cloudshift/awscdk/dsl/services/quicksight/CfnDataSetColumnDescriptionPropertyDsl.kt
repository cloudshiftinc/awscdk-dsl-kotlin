@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDataSet
import kotlin.String

/**
 * Metadata that contains a description for a column.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ColumnDescriptionProperty columnDescriptionProperty = ColumnDescriptionProperty.builder()
 * .text("text")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-columndescription.html)
 */
@CdkDslMarker
public class CfnDataSetColumnDescriptionPropertyDsl {
    private val cdkBuilder: CfnDataSet.ColumnDescriptionProperty.Builder =
        CfnDataSet.ColumnDescriptionProperty.builder()

    /**
     * @param text The text of a description for a column.
     */
    public fun text(text: String) {
        cdkBuilder.text(text)
    }

    public fun build(): CfnDataSet.ColumnDescriptionProperty = cdkBuilder.build()
}
