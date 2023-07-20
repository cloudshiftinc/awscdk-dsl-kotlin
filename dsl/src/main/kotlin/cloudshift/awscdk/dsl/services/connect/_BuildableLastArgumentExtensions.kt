@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.connect

import software.amazon.awscdk.services.connect.CfnEvaluationForm
import software.amazon.awscdk.services.connect.CfnInstance
import software.amazon.awscdk.services.connect.CfnInstanceStorageConfig
import software.amazon.awscdk.services.connect.CfnQuickConnect
import software.amazon.awscdk.services.connect.CfnRule
import software.amazon.awscdk.services.connect.CfnUser
import kotlin.Unit

public inline fun CfnInstanceStorageConfig.setKinesisFirehoseConfig(
    block: CfnInstanceStorageConfigKinesisFirehoseConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnInstanceStorageConfigKinesisFirehoseConfigPropertyDsl()
    builder.apply(block)
    return setKinesisFirehoseConfig(builder.build())
}

public inline fun CfnInstanceStorageConfig.setKinesisStreamConfig(
    block: CfnInstanceStorageConfigKinesisStreamConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnInstanceStorageConfigKinesisStreamConfigPropertyDsl()
    builder.apply(block)
    return setKinesisStreamConfig(builder.build())
}

public inline fun CfnInstanceStorageConfig.setKinesisVideoStreamConfig(
    block: CfnInstanceStorageConfigKinesisVideoStreamConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnInstanceStorageConfigKinesisVideoStreamConfigPropertyDsl()
    builder.apply(block)
    return setKinesisVideoStreamConfig(builder.build())
}

public inline fun CfnInstanceStorageConfig.setS3Config(
    block: CfnInstanceStorageConfigS3ConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnInstanceStorageConfigS3ConfigPropertyDsl()
    builder.apply(block)
    return setS3Config(builder.build())
}

public inline fun CfnUser.setPhoneConfig(block: CfnUserUserPhoneConfigPropertyDsl.() -> Unit = {}) {
    val builder = CfnUserUserPhoneConfigPropertyDsl()
    builder.apply(block)
    return setPhoneConfig(builder.build())
}

public inline fun CfnUser.setIdentityInfo(
    block: CfnUserUserIdentityInfoPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnUserUserIdentityInfoPropertyDsl()
    builder.apply(block)
    return setIdentityInfo(builder.build())
}

public inline fun CfnEvaluationForm.setScoringStrategy(
    block: CfnEvaluationFormScoringStrategyPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnEvaluationFormScoringStrategyPropertyDsl()
    builder.apply(block)
    return setScoringStrategy(builder.build())
}

public inline fun CfnQuickConnect.setQuickConnectConfig(
    block: CfnQuickConnectQuickConnectConfigPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnQuickConnectQuickConnectConfigPropertyDsl()
    builder.apply(block)
    return setQuickConnectConfig(builder.build())
}

public inline fun CfnRule.setActions(block: CfnRuleActionsPropertyDsl.() -> Unit = {}) {
    val builder = CfnRuleActionsPropertyDsl()
    builder.apply(block)
    return setActions(builder.build())
}

public inline fun CfnRule.setTriggerEventSource(
    block: CfnRuleRuleTriggerEventSourcePropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnRuleRuleTriggerEventSourcePropertyDsl()
    builder.apply(block)
    return setTriggerEventSource(builder.build())
}

public inline fun CfnInstance.setAttributes(
    block: CfnInstanceAttributesPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnInstanceAttributesPropertyDsl()
    builder.apply(block)
    return setAttributes(builder.build())
}
