@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The configuration of adding parameters in action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SetParameterValueConfigurationProperty setParameterValueConfigurationProperty =
 * SetParameterValueConfigurationProperty.builder()
 * .destinationParameterName("destinationParameterName")
 * .value(DestinationParameterValueConfigurationProperty.builder()
 * .customValuesConfiguration(CustomValuesConfigurationProperty.builder()
 * .customValues(CustomParameterValuesProperty.builder()
 * .dateTimeValues(List.of("dateTimeValues"))
 * .decimalValues(List.of(123))
 * .integerValues(List.of(123))
 * .stringValues(List.of("stringValues"))
 * .build())
 * // the properties below are optional
 * .includeNullValue(false)
 * .build())
 * .selectAllValueOptions("selectAllValueOptions")
 * .sourceColumn(ColumnIdentifierProperty.builder()
 * .columnName("columnName")
 * .dataSetIdentifier("dataSetIdentifier")
 * .build())
 * .sourceField("sourceField")
 * .sourceParameterName("sourceParameterName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-setparametervalueconfiguration.html)
 */
@CdkDslMarker
public class CfnTemplateSetParameterValueConfigurationPropertyDsl {
  private val cdkBuilder: CfnTemplate.SetParameterValueConfigurationProperty.Builder =
      CfnTemplate.SetParameterValueConfigurationProperty.builder()

  /**
   * @param destinationParameterName The destination parameter name of the
   * `SetParameterValueConfiguration` . 
   */
  public fun destinationParameterName(destinationParameterName: String) {
    cdkBuilder.destinationParameterName(destinationParameterName)
  }

  /**
   * @param value the value to be set. 
   */
  public fun `value`(`value`: IResolvable) {
    cdkBuilder.`value`(`value`)
  }

  /**
   * @param value the value to be set. 
   */
  public fun `value`(`value`: CfnTemplate.DestinationParameterValueConfigurationProperty) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnTemplate.SetParameterValueConfigurationProperty = cdkBuilder.build()
}
