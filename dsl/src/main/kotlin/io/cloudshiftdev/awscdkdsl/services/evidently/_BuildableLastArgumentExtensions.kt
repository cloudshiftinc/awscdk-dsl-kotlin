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

package io.cloudshiftdev.awscdkdsl.services.evidently

import kotlin.Unit
import software.amazon.awscdk.services.evidently.CfnExperiment
import software.amazon.awscdk.services.evidently.CfnLaunch
import software.amazon.awscdk.services.evidently.CfnProject

/**
 * A structure that contains the configuration of which variation to use as the "control" version.
 */
public inline fun CfnExperiment.setOnlineAbConfig(
    block: CfnExperimentOnlineAbConfigObjectPropertyDsl.() -> Unit = {}
) {
    val builder = CfnExperimentOnlineAbConfigObjectPropertyDsl()
    builder.apply(block)
    return setOnlineAbConfig(builder.build())
}

/** A structure that you can use to start and stop the experiment. */
public inline fun CfnExperiment.setRunningStatus(
    block: CfnExperimentRunningStatusObjectPropertyDsl.() -> Unit = {}
) {
    val builder = CfnExperimentRunningStatusObjectPropertyDsl()
    builder.apply(block)
    return setRunningStatus(builder.build())
}

/** A structure that you can use to start and stop the launch. */
public inline fun CfnLaunch.setExecutionStatus(
    block: CfnLaunchExecutionStatusObjectPropertyDsl.() -> Unit = {}
) {
    val builder = CfnLaunchExecutionStatusObjectPropertyDsl()
    builder.apply(block)
    return setExecutionStatus(builder.build())
}

/**
 * Use this parameter if the project will use *client-side evaluation powered by AWS AppConfig* .
 */
public inline fun CfnProject.setAppConfigResource(
    block: CfnProjectAppConfigResourceObjectPropertyDsl.() -> Unit = {}
) {
    val builder = CfnProjectAppConfigResourceObjectPropertyDsl()
    builder.apply(block)
    return setAppConfigResource(builder.build())
}

/**
 * A structure that contains information about where Evidently is to store evaluation events for
 * longer term storage, if you choose to do so.
 */
public inline fun CfnProject.setDataDelivery(
    block: CfnProjectDataDeliveryObjectPropertyDsl.() -> Unit = {}
) {
    val builder = CfnProjectDataDeliveryObjectPropertyDsl()
    builder.apply(block)
    return setDataDelivery(builder.build())
}
