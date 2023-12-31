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

package io.cloudshiftdev.awscdkdsl.services.synthetics

import kotlin.Unit
import software.amazon.awscdk.services.synthetics.CfnCanary

/**
 * A structure that contains the configuration for canary artifacts, including the
 * encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
 */
public inline fun CfnCanary.setArtifactConfig(
    block: CfnCanaryArtifactConfigPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCanaryArtifactConfigPropertyDsl()
    builder.apply(block)
    return setArtifactConfig(builder.build())
}

/** Use this structure to input your script code for the canary. */
public inline fun CfnCanary.setCode(block: CfnCanaryCodePropertyDsl.() -> Unit = {}) {
    val builder = CfnCanaryCodePropertyDsl()
    builder.apply(block)
    return setCode(builder.build())
}

/** A structure that contains input information for a canary run. */
public inline fun CfnCanary.setRunConfig(block: CfnCanaryRunConfigPropertyDsl.() -> Unit = {}) {
    val builder = CfnCanaryRunConfigPropertyDsl()
    builder.apply(block)
    return setRunConfig(builder.build())
}

/**
 * A structure that contains information about how often the canary is to run, and when these runs
 * are to stop.
 */
public inline fun CfnCanary.setSchedule(block: CfnCanarySchedulePropertyDsl.() -> Unit = {}) {
    val builder = CfnCanarySchedulePropertyDsl()
    builder.apply(block)
    return setSchedule(builder.build())
}

/**
 * If this canary performs visual monitoring by comparing screenshots, this structure contains the
 * ID of the canary run to use as the baseline for screenshots, and the coordinates of any parts of
 * the screen to ignore during the visual monitoring comparison.
 */
public inline fun CfnCanary.setVisualReference(
    block: CfnCanaryVisualReferencePropertyDsl.() -> Unit = {}
) {
    val builder = CfnCanaryVisualReferencePropertyDsl()
    builder.apply(block)
    return setVisualReference(builder.build())
}

/**
 * If this canary is to test an endpoint in a VPC, this structure contains information about the
 * subnet and security groups of the VPC endpoint.
 */
public inline fun CfnCanary.setVpcConfig(block: CfnCanaryVPCConfigPropertyDsl.() -> Unit = {}) {
    val builder = CfnCanaryVPCConfigPropertyDsl()
    builder.apply(block)
    return setVpcConfig(builder.build())
}
