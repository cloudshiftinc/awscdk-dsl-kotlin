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

package io.cloudshiftdev.awscdkdsl.services.medialive

import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel
import software.amazon.awscdk.services.medialive.CfnInput
import software.amazon.awscdk.services.medialive.CfnMultiplex
import software.amazon.awscdk.services.medialive.CfnMultiplexprogram

/** Specification of CDI inputs for this channel. */
public inline fun CfnChannel.setCdiInputSpecification(
    block: CfnChannelCdiInputSpecificationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnChannelCdiInputSpecificationPropertyDsl()
    builder.apply(block)
    return setCdiInputSpecification(builder.build())
}

/** The encoding configuration for the output content. */
public inline fun CfnChannel.setEncoderSettings(
    block: CfnChannelEncoderSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnChannelEncoderSettingsPropertyDsl()
    builder.apply(block)
    return setEncoderSettings(builder.build())
}

/** The input specification for this channel. */
public inline fun CfnChannel.setInputSpecification(
    block: CfnChannelInputSpecificationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnChannelInputSpecificationPropertyDsl()
    builder.apply(block)
    return setInputSpecification(builder.build())
}

/** Maintenance settings for this channel. */
public inline fun CfnChannel.setMaintenance(
    block: CfnChannelMaintenanceCreateSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnChannelMaintenanceCreateSettingsPropertyDsl()
    builder.apply(block)
    return setMaintenance(builder.build())
}

/**
 * Settings to enable VPC mode in the channel, so that the endpoints for all outputs are in your
 * VPC.
 */
public inline fun CfnChannel.setVpc(block: CfnChannelVpcOutputSettingsPropertyDsl.() -> Unit = {}) {
    val builder = CfnChannelVpcOutputSettingsPropertyDsl()
    builder.apply(block)
    return setVpc(builder.build())
}

/** Settings that apply only if the input is an push input where the source is on Amazon VPC. */
public inline fun CfnInput.setVpc(block: CfnInputInputVpcRequestPropertyDsl.() -> Unit = {}) {
    val builder = CfnInputInputVpcRequestPropertyDsl()
    builder.apply(block)
    return setVpc(builder.build())
}

/** Configuration for a multiplex event. */
public inline fun CfnMultiplex.setMultiplexSettings(
    block: CfnMultiplexMultiplexSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnMultiplexMultiplexSettingsPropertyDsl()
    builder.apply(block)
    return setMultiplexSettings(builder.build())
}

/** Multiplex Program settings configuration. */
public inline fun CfnMultiplexprogram.setMultiplexProgramSettings(
    block: CfnMultiplexprogramMultiplexProgramSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnMultiplexprogramMultiplexProgramSettingsPropertyDsl()
    builder.apply(block)
    return setMultiplexProgramSettings(builder.build())
}

/** Packet identifiers map for a given Multiplex program. */
public inline fun CfnMultiplexprogram.setPacketIdentifiersMap(
    block: CfnMultiplexprogramMultiplexProgramPacketIdentifiersMapPropertyDsl.() -> Unit = {}
) {
    val builder = CfnMultiplexprogramMultiplexProgramPacketIdentifiersMapPropertyDsl()
    builder.apply(block)
    return setPacketIdentifiersMap(builder.build())
}
