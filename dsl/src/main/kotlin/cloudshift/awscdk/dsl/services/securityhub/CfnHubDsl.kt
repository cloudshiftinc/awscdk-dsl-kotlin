@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.securityhub.CfnHub
import software.constructs.Construct

@CdkDslMarker
public class CfnHubDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnHub.Builder = CfnHub.Builder.create(scope, id)

  /**
   * Whether to automatically enable new controls when they are added to standards that are enabled.
   *
   * By default, this is set to `true` , and new controls are enabled automatically. To not
   * automatically enable new controls, set this to `false` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-autoenablecontrols)
   * @param autoEnableControls Whether to automatically enable new controls when they are added to
   * standards that are enabled. 
   */
  public fun autoEnableControls(autoEnableControls: Boolean) {
    cdkBuilder.autoEnableControls(autoEnableControls)
  }

  /**
   * Whether to automatically enable new controls when they are added to standards that are enabled.
   *
   * By default, this is set to `true` , and new controls are enabled automatically. To not
   * automatically enable new controls, set this to `false` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-autoenablecontrols)
   * @param autoEnableControls Whether to automatically enable new controls when they are added to
   * standards that are enabled. 
   */
  public fun autoEnableControls(autoEnableControls: IResolvable) {
    cdkBuilder.autoEnableControls(autoEnableControls)
  }

  /**
   * Specifies whether an account has consolidated control findings turned on or off.
   *
   * If the value for this field is set to `SECURITY_CONTROL` , Security Hub generates a single
   * finding for a control check even when the check applies to multiple enabled standards.
   *
   * If the value for this field is set to `STANDARD_CONTROL` , Security Hub generates separate
   * findings for a control check when the check applies to multiple enabled standards.
   *
   * The value for this field in a member account matches the value in the administrator account.
   * For accounts that aren't part of an organization, the default value of this field is
   * `SECURITY_CONTROL` if you enabled Security Hub on or after February 23, 2023.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-controlfindinggenerator)
   * @param controlFindingGenerator Specifies whether an account has consolidated control findings
   * turned on or off. 
   */
  public fun controlFindingGenerator(controlFindingGenerator: String) {
    cdkBuilder.controlFindingGenerator(controlFindingGenerator)
  }

  /**
   * Whether to enable the security standards that Security Hub has designated as automatically
   * enabled.
   *
   * If you don't provide a value for `EnableDefaultStandards` , it is set to `true` , and the
   * designated standards are automatically enabled in each AWS Region where you enable Security Hub .
   * If you don't want to enable the designated standards, set `EnableDefaultStandards` to `false` .
   *
   * Currently, the automatically enabled standards are the Center for Internet Security (CIS) AWS
   * Foundations Benchmark v1.2.0 and AWS Foundational Security Best Practices (FSBP).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-enabledefaultstandards)
   * @param enableDefaultStandards Whether to enable the security standards that Security Hub has
   * designated as automatically enabled. 
   */
  public fun enableDefaultStandards(enableDefaultStandards: Boolean) {
    cdkBuilder.enableDefaultStandards(enableDefaultStandards)
  }

  /**
   * Whether to enable the security standards that Security Hub has designated as automatically
   * enabled.
   *
   * If you don't provide a value for `EnableDefaultStandards` , it is set to `true` , and the
   * designated standards are automatically enabled in each AWS Region where you enable Security Hub .
   * If you don't want to enable the designated standards, set `EnableDefaultStandards` to `false` .
   *
   * Currently, the automatically enabled standards are the Center for Internet Security (CIS) AWS
   * Foundations Benchmark v1.2.0 and AWS Foundational Security Best Practices (FSBP).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-enabledefaultstandards)
   * @param enableDefaultStandards Whether to enable the security standards that Security Hub has
   * designated as automatically enabled. 
   */
  public fun enableDefaultStandards(enableDefaultStandards: IResolvable) {
    cdkBuilder.enableDefaultStandards(enableDefaultStandards)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securityhub-hub.html#cfn-securityhub-hub-tags)
   * @param tags An array of key-value pairs to apply to this resource. 
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnHub = cdkBuilder.build()
}
