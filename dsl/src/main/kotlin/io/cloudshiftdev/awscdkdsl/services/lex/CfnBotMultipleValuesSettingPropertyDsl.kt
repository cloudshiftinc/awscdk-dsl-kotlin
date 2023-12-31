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

package io.cloudshiftdev.awscdkdsl.services.lex

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot

/**
 * Indicates whether a slot can return multiple values.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * MultipleValuesSettingProperty multipleValuesSettingProperty =
 * MultipleValuesSettingProperty.builder()
 * .allowMultipleValues(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lex-bot-multiplevaluessetting.html)
 */
@CdkDslMarker
public class CfnBotMultipleValuesSettingPropertyDsl {
    private val cdkBuilder: CfnBot.MultipleValuesSettingProperty.Builder =
        CfnBot.MultipleValuesSettingProperty.builder()

    /**
     * @param allowMultipleValues Indicates whether a slot can return multiple values. When `true` ,
     *   the slot may return more than one value in a response. When `false` , the slot returns only
     *   a single value.
     *
     * Multi-value slots are only available in the en-US locale. If you set this value to `true` in
     * any other locale, Amazon Lex throws a `ValidationException` .
     *
     * If the `allowMutlipleValues` is not set, the default value is `false` .
     */
    public fun allowMultipleValues(allowMultipleValues: Boolean) {
        cdkBuilder.allowMultipleValues(allowMultipleValues)
    }

    /**
     * @param allowMultipleValues Indicates whether a slot can return multiple values. When `true` ,
     *   the slot may return more than one value in a response. When `false` , the slot returns only
     *   a single value.
     *
     * Multi-value slots are only available in the en-US locale. If you set this value to `true` in
     * any other locale, Amazon Lex throws a `ValidationException` .
     *
     * If the `allowMutlipleValues` is not set, the default value is `false` .
     */
    public fun allowMultipleValues(allowMultipleValues: IResolvable) {
        cdkBuilder.allowMultipleValues(allowMultipleValues)
    }

    public fun build(): CfnBot.MultipleValuesSettingProperty = cdkBuilder.build()
}
