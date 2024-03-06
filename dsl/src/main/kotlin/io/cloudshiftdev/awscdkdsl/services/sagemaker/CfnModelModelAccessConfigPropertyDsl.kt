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
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModel

/**
 * The access configuration file to control access to the ML model.
 *
 * You can explicitly accept the model end-user license agreement (EULA) within the
 * `ModelAccessConfig` .
 * * If you are a Jumpstart user, see the
 *   [End-user license agreements](https://docs.aws.amazon.com/sagemaker/latest/dg/jumpstart-foundation-models-choose.html#jumpstart-foundation-models-choose-eula)
 *   section for more details on accepting the EULA.
 * * If you are an AutoML user, see the *Optional Parameters* section of *Create an AutoML job to
 *   fine-tune text generation models using the API* for details on
 *   [How to set the EULA acceptance when fine-tuning a model using the AutoML API](https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-create-experiment-finetune-llms.html#autopilot-llms-finetuning-api-optional-params)
 *   .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * ModelAccessConfigProperty modelAccessConfigProperty = ModelAccessConfigProperty.builder()
 * .acceptEula(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-modelaccessconfig.html)
 */
@CdkDslMarker
public class CfnModelModelAccessConfigPropertyDsl {
    private val cdkBuilder: CfnModel.ModelAccessConfigProperty.Builder =
        CfnModel.ModelAccessConfigProperty.builder()

    /**
     * @param acceptEula Specifies agreement to the model end-user license agreement (EULA). The
     *   `AcceptEula` value must be explicitly defined as `True` in order to accept the EULA that
     *   this model requires. You are responsible for reviewing and complying with any applicable
     *   license terms and making sure they are acceptable for your use case before downloading or
     *   using a model.
     */
    public fun acceptEula(acceptEula: Boolean) {
        cdkBuilder.acceptEula(acceptEula)
    }

    /**
     * @param acceptEula Specifies agreement to the model end-user license agreement (EULA). The
     *   `AcceptEula` value must be explicitly defined as `True` in order to accept the EULA that
     *   this model requires. You are responsible for reviewing and complying with any applicable
     *   license terms and making sure they are acceptable for your use case before downloading or
     *   using a model.
     */
    public fun acceptEula(acceptEula: IResolvable) {
        cdkBuilder.acceptEula(acceptEula)
    }

    public fun build(): CfnModel.ModelAccessConfigProperty = cdkBuilder.build()
}
