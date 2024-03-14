package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.String

public open class AdotLambdaLayerJavaAutoInstrumentationVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion,
) : CdkObject(cdkObject) {
  /**
   * The ARN of the Lambda layer.
   *
   * @param scope The binding scope. 
   * @param architecture The architecture of the Lambda layer (either X86_64 or ARM_64). 
   */
  public open fun layerArn(scope: IConstruct, architecture: Architecture): String =
      unwrap(this).layerArn(scope.let(IConstruct::unwrap), architecture.let(Architecture::unwrap))

  public companion object {
    public val LATEST: AdotLambdaLayerJavaAutoInstrumentationVersion =
        AdotLambdaLayerJavaAutoInstrumentationVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion.LATEST)

    public val V1_19_2: AdotLambdaLayerJavaAutoInstrumentationVersion =
        AdotLambdaLayerJavaAutoInstrumentationVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion.V1_19_2)

    public val V1_28_1: AdotLambdaLayerJavaAutoInstrumentationVersion =
        AdotLambdaLayerJavaAutoInstrumentationVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion.V1_28_1)

    public val V1_30_0: AdotLambdaLayerJavaAutoInstrumentationVersion =
        AdotLambdaLayerJavaAutoInstrumentationVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion.V1_30_0)

    public val V1_31_0: AdotLambdaLayerJavaAutoInstrumentationVersion =
        AdotLambdaLayerJavaAutoInstrumentationVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion.V1_31_0)

    public val V1_32_0: AdotLambdaLayerJavaAutoInstrumentationVersion =
        AdotLambdaLayerJavaAutoInstrumentationVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion.V1_32_0)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion):
        AdotLambdaLayerJavaAutoInstrumentationVersion =
        AdotLambdaLayerJavaAutoInstrumentationVersion(cdkObject)

    internal fun unwrap(wrapped: AdotLambdaLayerJavaAutoInstrumentationVersion):
        software.amazon.awscdk.services.lambda.AdotLambdaLayerJavaAutoInstrumentationVersion =
        wrapped.cdkObject
  }
}
