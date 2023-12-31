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
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The configuration that defines the default value of a `DateTime` parameter when a value has not
 * been set.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * DateTimeValueWhenUnsetConfigurationProperty dateTimeValueWhenUnsetConfigurationProperty =
 * DateTimeValueWhenUnsetConfigurationProperty.builder()
 * .customValue("customValue")
 * .valueWhenUnsetOption("valueWhenUnsetOption")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-datetimevaluewhenunsetconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardDateTimeValueWhenUnsetConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.DateTimeValueWhenUnsetConfigurationProperty.Builder =
        CfnDashboard.DateTimeValueWhenUnsetConfigurationProperty.builder()

    /** @param customValue A custom value that's used when the value of a parameter isn't set. */
    public fun customValue(customValue: String) {
        cdkBuilder.customValue(customValue)
    }

    /**
     * @param valueWhenUnsetOption The built-in options for default values. The value can be one of
     *   the following:.
     * * `RECOMMENDED` : The recommended value.
     * * `NULL` : The `NULL` value.
     */
    public fun valueWhenUnsetOption(valueWhenUnsetOption: String) {
        cdkBuilder.valueWhenUnsetOption(valueWhenUnsetOption)
    }

    public fun build(): CfnDashboard.DateTimeValueWhenUnsetConfigurationProperty =
        cdkBuilder.build()
}
