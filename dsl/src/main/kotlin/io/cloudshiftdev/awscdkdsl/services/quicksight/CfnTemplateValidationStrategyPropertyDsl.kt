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
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The option to relax the validation that is required to create and update analyses, dashboards,
 * and templates with definition objects.
 *
 * When you set this value to `LENIENT` , validation is skipped for specific errors.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ValidationStrategyProperty validationStrategyProperty = ValidationStrategyProperty.builder()
 * .mode("mode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-validationstrategy.html)
 */
@CdkDslMarker
public class CfnTemplateValidationStrategyPropertyDsl {
    private val cdkBuilder: CfnTemplate.ValidationStrategyProperty.Builder =
        CfnTemplate.ValidationStrategyProperty.builder()

    /**
     * @param mode The mode of validation for the asset to be created or updated. When you set this
     *   value to `STRICT` , strict validation for every error is enforced. When you set this value
     *   to `LENIENT` , validation is skipped for specific UI errors.
     */
    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    public fun build(): CfnTemplate.ValidationStrategyProperty = cdkBuilder.build()
}
