@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import software.amazon.awscdk.services.ssm.ParameterDataType
import software.amazon.awscdk.services.ssm.ParameterTier
import software.amazon.awscdk.services.ssm.ParameterType
import software.amazon.awscdk.services.ssm.StringParameterProps

@CdkDslMarker
public class StringParameterPropsDsl {
  private val cdkBuilder: StringParameterProps.Builder = StringParameterProps.builder()

  public fun allowedPattern(allowedPattern: String) {
    cdkBuilder.allowedPattern(allowedPattern)
  }

  public fun dataType(dataType: ParameterDataType) {
    cdkBuilder.dataType(dataType)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun parameterName(parameterName: String) {
    cdkBuilder.parameterName(parameterName)
  }

  public fun simpleName(simpleName: Boolean) {
    cdkBuilder.simpleName(simpleName)
  }

  public fun stringValue(stringValue: String) {
    cdkBuilder.stringValue(stringValue)
  }

  public fun tier(tier: ParameterTier) {
    cdkBuilder.tier(tier)
  }

  @Deprecated(message = "deprecated in CDK")
  public fun type(type: ParameterType) {
    cdkBuilder.type(type)
  }

  public fun build(): StringParameterProps = cdkBuilder.build()
}
