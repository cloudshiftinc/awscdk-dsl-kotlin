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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

/**
 * A parameter used to configure the SageMaker Clarify explainer to treat text features as text so
 * that explanations are provided for individual units of text.
 *
 * Required only for natural language processing (NLP) explainability.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ClarifyTextConfigProperty clarifyTextConfigProperty = ClarifyTextConfigProperty.builder()
 * .granularity("granularity")
 * .language("language")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-clarifytextconfig.html)
 */
@CdkDslMarker
public class CfnEndpointConfigClarifyTextConfigPropertyDsl {
    private val cdkBuilder: CfnEndpointConfig.ClarifyTextConfigProperty.Builder =
        CfnEndpointConfig.ClarifyTextConfigProperty.builder()

    /**
     * @param granularity The unit of granularity for the analysis of text features. For example, if
     *   the unit is `'token'` , then each token (like a word in English) of the text is treated as
     *   a feature. SHAP values are computed for each unit/feature.
     */
    public fun granularity(granularity: String) {
        cdkBuilder.granularity(granularity)
    }

    /**
     * @param language Specifies the language of the text features in
     *   [ISO 639-1](https://docs.aws.amazon.com/
     *   https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) or
     *   [ISO 639-3](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/ISO_639-3) code of a
     *   supported language.
     *
     * For a mix of multiple languages, use code `'xx'` .
     */
    public fun language(language: String) {
        cdkBuilder.language(language)
    }

    public fun build(): CfnEndpointConfig.ClarifyTextConfigProperty = cdkBuilder.build()
}
