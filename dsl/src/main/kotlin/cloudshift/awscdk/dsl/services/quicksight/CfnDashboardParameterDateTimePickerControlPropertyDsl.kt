@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * A control from a date parameter that specifies date and time.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * ParameterDateTimePickerControlProperty parameterDateTimePickerControlProperty =
 * ParameterDateTimePickerControlProperty.builder()
 * .parameterControlId("parameterControlId")
 * .sourceParameterName("sourceParameterName")
 * .title("title")
 * // the properties below are optional
 * .displayOptions(DateTimePickerControlDisplayOptionsProperty.builder()
 * .dateTimeFormat("dateTimeFormat")
 * .titleOptions(LabelOptionsProperty.builder()
 * .customLabel("customLabel")
 * .fontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .visibility("visibility")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-parameterdatetimepickercontrol.html)
 */
@CdkDslMarker
public class CfnDashboardParameterDateTimePickerControlPropertyDsl {
  private val cdkBuilder: CfnDashboard.ParameterDateTimePickerControlProperty.Builder =
      CfnDashboard.ParameterDateTimePickerControlProperty.builder()

  /**
   * @param displayOptions The display options of a control.
   */
  public fun displayOptions(displayOptions: IResolvable) {
    cdkBuilder.displayOptions(displayOptions)
  }

  /**
   * @param displayOptions The display options of a control.
   */
  public
      fun displayOptions(displayOptions: CfnDashboard.DateTimePickerControlDisplayOptionsProperty) {
    cdkBuilder.displayOptions(displayOptions)
  }

  /**
   * @param parameterControlId The ID of the `ParameterDateTimePickerControl` . 
   */
  public fun parameterControlId(parameterControlId: String) {
    cdkBuilder.parameterControlId(parameterControlId)
  }

  /**
   * @param sourceParameterName The name of the `ParameterDateTimePickerControl` . 
   */
  public fun sourceParameterName(sourceParameterName: String) {
    cdkBuilder.sourceParameterName(sourceParameterName)
  }

  /**
   * @param title The title of the `ParameterDateTimePickerControl` . 
   */
  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun build(): CfnDashboard.ParameterDateTimePickerControlProperty = cdkBuilder.build()
}
