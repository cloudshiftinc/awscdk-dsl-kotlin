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

package io.cloudshiftdev.awscdkdsl.services.connect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.connect.CfnEvaluationForm

/**
 * Information about the property value used in automation of a numeric questions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * NumericQuestionPropertyValueAutomationProperty numericQuestionPropertyValueAutomationProperty =
 * NumericQuestionPropertyValueAutomationProperty.builder()
 * .label("label")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-evaluationform-numericquestionpropertyvalueautomation.html)
 */
@CdkDslMarker
public class CfnEvaluationFormNumericQuestionPropertyValueAutomationPropertyDsl {
    private val cdkBuilder:
        CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty.Builder =
        CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty.builder()

    /**
     * @param label The property label of the automation. *Allowed values* :
     *   `OVERALL_CUSTOMER_SENTIMENT_SCORE` , `OVERALL_AGENT_SENTIMENT_SCORE` | `NON_TALK_TIME` |
     *   `NON_TALK_TIME_PERCENTAGE` | `NUMBER_OF_INTERRUPTIONS` | `CONTACT_DURATION` |
     *   `AGENT_INTERACTION_DURATION` | `CUSTOMER_HOLD_TIME`
     */
    public fun label(label: String) {
        cdkBuilder.label(label)
    }

    public fun build(): CfnEvaluationForm.NumericQuestionPropertyValueAutomationProperty =
        cdkBuilder.build()
}
