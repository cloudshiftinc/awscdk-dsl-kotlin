@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * A list of selectable values that are used in a control.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ParameterSelectableValuesProperty parameterSelectableValuesProperty =
 * ParameterSelectableValuesProperty.builder()
 * .linkToDataSetColumn(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-parameterselectablevalues.html)
 */
@CdkDslMarker
public class CfnTemplateParameterSelectableValuesPropertyDsl {
    private val cdkBuilder: CfnTemplate.ParameterSelectableValuesProperty.Builder =
        CfnTemplate.ParameterSelectableValuesProperty.builder()

    private val _values: MutableList<String> = mutableListOf()

    /**
     * @param linkToDataSetColumn The column identifier that fetches values from the data set.
     */
    public fun linkToDataSetColumn(linkToDataSetColumn: IResolvable) {
        cdkBuilder.linkToDataSetColumn(linkToDataSetColumn)
    }

    /**
     * @param linkToDataSetColumn The column identifier that fetches values from the data set.
     */
    public fun linkToDataSetColumn(linkToDataSetColumn: CfnTemplate.ColumnIdentifierProperty) {
        cdkBuilder.linkToDataSetColumn(linkToDataSetColumn)
    }

    /**
     * @param values The values that are used in `ParameterSelectableValues` .
     */
    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    /**
     * @param values The values that are used in `ParameterSelectableValues` .
     */
    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    public fun build(): CfnTemplate.ParameterSelectableValuesProperty {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
