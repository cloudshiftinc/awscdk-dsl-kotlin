@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.String

public open class AdotLambdaLayerPythonSdkVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lambda.AdotLambdaLayerPythonSdkVersion,
) : CdkObject(cdkObject) {
  public open fun layerArn(scope: IConstruct, architecture: Architecture): String =
      unwrap(this).layerArn(scope.let(IConstruct::unwrap), architecture.let(Architecture::unwrap))

  public companion object {
    public val LATEST: AdotLambdaLayerPythonSdkVersion =
        AdotLambdaLayerPythonSdkVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerPythonSdkVersion.LATEST)

    public val V1_13_0: AdotLambdaLayerPythonSdkVersion =
        AdotLambdaLayerPythonSdkVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerPythonSdkVersion.V1_13_0)

    public val V1_14_0: AdotLambdaLayerPythonSdkVersion =
        AdotLambdaLayerPythonSdkVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerPythonSdkVersion.V1_14_0)

    public val V1_15_0: AdotLambdaLayerPythonSdkVersion =
        AdotLambdaLayerPythonSdkVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerPythonSdkVersion.V1_15_0)

    public val V1_16_0: AdotLambdaLayerPythonSdkVersion =
        AdotLambdaLayerPythonSdkVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerPythonSdkVersion.V1_16_0)

    public val V1_17_0: AdotLambdaLayerPythonSdkVersion =
        AdotLambdaLayerPythonSdkVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerPythonSdkVersion.V1_17_0)

    public val V1_18_0: AdotLambdaLayerPythonSdkVersion =
        AdotLambdaLayerPythonSdkVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerPythonSdkVersion.V1_18_0)

    public val V1_19_0_1: AdotLambdaLayerPythonSdkVersion =
        AdotLambdaLayerPythonSdkVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerPythonSdkVersion.V1_19_0_1)

    public val V1_20_0: AdotLambdaLayerPythonSdkVersion =
        AdotLambdaLayerPythonSdkVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerPythonSdkVersion.V1_20_0)

    public val V1_20_0_1: AdotLambdaLayerPythonSdkVersion =
        AdotLambdaLayerPythonSdkVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerPythonSdkVersion.V1_20_0_1)

    public val V1_21_0: AdotLambdaLayerPythonSdkVersion =
        AdotLambdaLayerPythonSdkVersion.wrap(software.amazon.awscdk.services.lambda.AdotLambdaLayerPythonSdkVersion.V1_21_0)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AdotLambdaLayerPythonSdkVersion):
        AdotLambdaLayerPythonSdkVersion = AdotLambdaLayerPythonSdkVersion(cdkObject)

    internal fun unwrap(wrapped: AdotLambdaLayerPythonSdkVersion):
        software.amazon.awscdk.services.lambda.AdotLambdaLayerPythonSdkVersion = wrapped.cdkObject
  }
}