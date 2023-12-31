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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The configuration of embedded captions in the output.
 *
 * The parent of this entity is CaptionDestinationSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * EmbeddedDestinationSettingsProperty embeddedDestinationSettingsProperty =
 * EmbeddedDestinationSettingsProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-embeddeddestinationsettings.html)
 */
@CdkDslMarker
public class CfnChannelEmbeddedDestinationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.EmbeddedDestinationSettingsProperty.Builder =
        CfnChannel.EmbeddedDestinationSettingsProperty.builder()

    public fun build(): CfnChannel.EmbeddedDestinationSettingsProperty = cdkBuilder.build()
}
