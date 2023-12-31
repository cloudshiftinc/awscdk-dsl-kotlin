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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ExplainerConfigProperty explainerConfigProperty = ExplainerConfigProperty.builder()
 * .clarifyExplainerConfig(ClarifyExplainerConfigProperty.builder()
 * .shapConfig(ClarifyShapConfigProperty.builder()
 * .shapBaselineConfig(ClarifyShapBaselineConfigProperty.builder()
 * .mimeType("mimeType")
 * .shapBaseline("shapBaseline")
 * .shapBaselineUri("shapBaselineUri")
 * .build())
 * // the properties below are optional
 * .numberOfSamples(123)
 * .seed(123)
 * .textConfig(ClarifyTextConfigProperty.builder()
 * .granularity("granularity")
 * .language("language")
 * .build())
 * .useLogit(false)
 * .build())
 * // the properties below are optional
 * .enableExplanations("enableExplanations")
 * .inferenceConfig(ClarifyInferenceConfigProperty.builder()
 * .contentTemplate("contentTemplate")
 * .featureHeaders(List.of("featureHeaders"))
 * .featuresAttribute("featuresAttribute")
 * .featureTypes(List.of("featureTypes"))
 * .labelAttribute("labelAttribute")
 * .labelHeaders(List.of("labelHeaders"))
 * .labelIndex(123)
 * .maxPayloadInMb(123)
 * .maxRecordCount(123)
 * .probabilityAttribute("probabilityAttribute")
 * .probabilityIndex(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-explainerconfig.html)
 */
@CdkDslMarker
public class CfnEndpointConfigExplainerConfigPropertyDsl {
    private val cdkBuilder: CfnEndpointConfig.ExplainerConfigProperty.Builder =
        CfnEndpointConfig.ExplainerConfigProperty.builder()

    /** @param clarifyExplainerConfig the value to be set. */
    public fun clarifyExplainerConfig(clarifyExplainerConfig: IResolvable) {
        cdkBuilder.clarifyExplainerConfig(clarifyExplainerConfig)
    }

    /** @param clarifyExplainerConfig the value to be set. */
    public fun clarifyExplainerConfig(
        clarifyExplainerConfig: CfnEndpointConfig.ClarifyExplainerConfigProperty
    ) {
        cdkBuilder.clarifyExplainerConfig(clarifyExplainerConfig)
    }

    public fun build(): CfnEndpointConfig.ExplainerConfigProperty = cdkBuilder.build()
}
