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
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * Output column.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * OutputColumnProperty outputColumnProperty = OutputColumnProperty.builder()
 * .description("description")
 * .name("name")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-outputcolumn.html)
 */
@CdkDslMarker
public class CfnDataSetOutputColumnPropertyDsl {
    private val cdkBuilder: CfnDataSet.OutputColumnProperty.Builder =
        CfnDataSet.OutputColumnProperty.builder()

    /** @param description A description for a column. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name A display name for the dataset. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param type The type. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDataSet.OutputColumnProperty = cdkBuilder.build()
}
