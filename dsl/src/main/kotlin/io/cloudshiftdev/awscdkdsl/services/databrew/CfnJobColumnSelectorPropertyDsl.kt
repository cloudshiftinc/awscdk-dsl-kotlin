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

package io.cloudshiftdev.awscdkdsl.services.databrew

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnJob

/**
 * Selector of a column from a dataset for profile job configuration.
 *
 * One selector includes either a column name or a regular expression.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * ColumnSelectorProperty columnSelectorProperty = ColumnSelectorProperty.builder()
 * .name("name")
 * .regex("regex")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-job-columnselector.html)
 */
@CdkDslMarker
public class CfnJobColumnSelectorPropertyDsl {
    private val cdkBuilder: CfnJob.ColumnSelectorProperty.Builder =
        CfnJob.ColumnSelectorProperty.builder()

    /** @param name The name of a column from a dataset. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param regex A regular expression for selecting a column from a dataset. */
    public fun regex(regex: String) {
        cdkBuilder.regex(regex)
    }

    public fun build(): CfnJob.ColumnSelectorProperty = cdkBuilder.build()
}
