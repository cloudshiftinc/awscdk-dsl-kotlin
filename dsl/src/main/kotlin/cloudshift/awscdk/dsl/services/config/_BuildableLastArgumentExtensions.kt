@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.dsl.services.events.OnEventOptionsDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnConfigRule
import software.amazon.awscdk.services.config.CfnConfigurationAggregator
import software.amazon.awscdk.services.config.CfnConfigurationRecorder
import software.amazon.awscdk.services.config.CfnDeliveryChannel
import software.amazon.awscdk.services.config.CfnOrganizationConfigRule
import software.amazon.awscdk.services.config.CfnRemediationConfiguration
import software.amazon.awscdk.services.config.CustomPolicy
import software.amazon.awscdk.services.config.CustomRule
import software.amazon.awscdk.services.config.IRule
import software.amazon.awscdk.services.config.ManagedRule
import software.amazon.awscdk.services.events.Rule

public inline fun CfnConfigRule.setSource(block: CfnConfigRuleSourcePropertyDsl.() -> Unit = {}) {
  val builder = CfnConfigRuleSourcePropertyDsl()
  builder.apply(block)
  return setSource(builder.build())
}

public inline fun CfnConfigRule.setScope(block: CfnConfigRuleScopePropertyDsl.() -> Unit = {}) {
  val builder = CfnConfigRuleScopePropertyDsl()
  builder.apply(block)
  return setScope(builder.build())
}

public inline
    fun CfnRemediationConfiguration.setExecutionControls(block: CfnRemediationConfigurationExecutionControlsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnRemediationConfigurationExecutionControlsPropertyDsl()
  builder.apply(block)
  return setExecutionControls(builder.build())
}

public inline
    fun CfnDeliveryChannel.setConfigSnapshotDeliveryProperties(block: CfnDeliveryChannelConfigSnapshotDeliveryPropertiesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDeliveryChannelConfigSnapshotDeliveryPropertiesPropertyDsl()
  builder.apply(block)
  return setConfigSnapshotDeliveryProperties(builder.build())
}

public inline fun ManagedRule.onComplianceChange(id: String, block: OnEventOptionsDsl.() -> Unit =
    {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onComplianceChange(id, builder.build())
}

public inline fun ManagedRule.onEvent(id: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onEvent(id, builder.build())
}

public inline fun ManagedRule.onReEvaluationStatus(id: String, block: OnEventOptionsDsl.() -> Unit =
    {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onReEvaluationStatus(id, builder.build())
}

public inline
    fun CfnConfigurationAggregator.setOrganizationAggregationSource(block: CfnConfigurationAggregatorOrganizationAggregationSourcePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConfigurationAggregatorOrganizationAggregationSourcePropertyDsl()
  builder.apply(block)
  return setOrganizationAggregationSource(builder.build())
}

public inline fun CustomRule.onComplianceChange(id: String, block: OnEventOptionsDsl.() -> Unit =
    {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onComplianceChange(id, builder.build())
}

public inline fun CustomRule.onEvent(id: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onEvent(id, builder.build())
}

public inline fun CustomRule.onReEvaluationStatus(id: String, block: OnEventOptionsDsl.() -> Unit =
    {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onReEvaluationStatus(id, builder.build())
}

public inline fun CustomPolicy.onComplianceChange(id: String, block: OnEventOptionsDsl.() -> Unit =
    {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onComplianceChange(id, builder.build())
}

public inline fun CustomPolicy.onEvent(id: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onEvent(id, builder.build())
}

public inline fun CustomPolicy.onReEvaluationStatus(id: String, block: OnEventOptionsDsl.() -> Unit
    = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onReEvaluationStatus(id, builder.build())
}

public inline
    fun CfnConfigurationRecorder.setRecordingGroup(block: CfnConfigurationRecorderRecordingGroupPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnConfigurationRecorderRecordingGroupPropertyDsl()
  builder.apply(block)
  return setRecordingGroup(builder.build())
}

public inline
    fun CfnOrganizationConfigRule.setOrganizationCustomPolicyRuleMetadata(block: CfnOrganizationConfigRuleOrganizationCustomPolicyRuleMetadataPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnOrganizationConfigRuleOrganizationCustomPolicyRuleMetadataPropertyDsl()
  builder.apply(block)
  return setOrganizationCustomPolicyRuleMetadata(builder.build())
}

public inline
    fun CfnOrganizationConfigRule.setOrganizationCustomRuleMetadata(block: CfnOrganizationConfigRuleOrganizationCustomRuleMetadataPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnOrganizationConfigRuleOrganizationCustomRuleMetadataPropertyDsl()
  builder.apply(block)
  return setOrganizationCustomRuleMetadata(builder.build())
}

public inline
    fun CfnOrganizationConfigRule.setOrganizationManagedRuleMetadata(block: CfnOrganizationConfigRuleOrganizationManagedRuleMetadataPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnOrganizationConfigRuleOrganizationManagedRuleMetadataPropertyDsl()
  builder.apply(block)
  return setOrganizationManagedRuleMetadata(builder.build())
}

public inline fun IRule.onComplianceChange(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}):
    Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onComplianceChange(arg0, builder.build())
}

public inline fun IRule.onEvent(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onEvent(arg0, builder.build())
}

public inline fun IRule.onReEvaluationStatus(arg0: String, block: OnEventOptionsDsl.() -> Unit =
    {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onReEvaluationStatus(arg0, builder.build())
}
