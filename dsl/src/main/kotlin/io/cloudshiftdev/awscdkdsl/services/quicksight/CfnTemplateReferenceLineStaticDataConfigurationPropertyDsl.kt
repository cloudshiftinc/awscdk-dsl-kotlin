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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The static data configuration of the reference line data configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ReferenceLineStaticDataConfigurationProperty referenceLineStaticDataConfigurationProperty =
 * ReferenceLineStaticDataConfigurationProperty.builder()
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-referencelinestaticdataconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateReferenceLineStaticDataConfigurationPropertyDsl {
    private val cdkBuilder: CfnTemplate.ReferenceLineStaticDataConfigurationProperty.Builder =
        CfnTemplate.ReferenceLineStaticDataConfigurationProperty.builder()

    /** @param value The double input of the static data. */
    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTemplate.ReferenceLineStaticDataConfigurationProperty =
        cdkBuilder.build()
}
