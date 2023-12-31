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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The limit configuration of the visual display for an axis.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ItemsLimitConfigurationProperty itemsLimitConfigurationProperty =
 * ItemsLimitConfigurationProperty.builder()
 * .itemsLimit(123)
 * .otherCategories("otherCategories")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-itemslimitconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateItemsLimitConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.ItemsLimitConfigurationProperty.Builder =
        CfnTemplate.ItemsLimitConfigurationProperty.builder()

    /**
     * @param itemsLimit The limit on how many items of a field are showed in the chart. For
     *   example, the number of slices that are displayed in a pie chart.
     */
    public fun itemsLimit(itemsLimit: Number) {
        cdkBuilder.itemsLimit(itemsLimit)
    }

    /**
     * @param otherCategories The `Show other` of an axis in the chart. Choose one of the following
     *   options:.
     * * `INCLUDE`
     * * `EXCLUDE`
     */
    public fun otherCategories(otherCategories: String) {
        cdkBuilder.otherCategories(otherCategories)
    }

    public fun build(): CfnTemplate.ItemsLimitConfigurationProperty = cdkBuilder.build()
}
