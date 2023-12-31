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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The settings for one RTMP output.
 *
 * The parent of this entity is OutputSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * RtmpOutputSettingsProperty rtmpOutputSettingsProperty = RtmpOutputSettingsProperty.builder()
 * .certificateMode("certificateMode")
 * .connectionRetryInterval(123)
 * .destination(OutputLocationRefProperty.builder()
 * .destinationRefId("destinationRefId")
 * .build())
 * .numRetries(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-rtmpoutputsettings.html)
 */
@CdkDslMarker
public class CfnChannelRtmpOutputSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.RtmpOutputSettingsProperty.Builder =
        CfnChannel.RtmpOutputSettingsProperty.builder()

    /**
     * @param certificateMode If set to verifyAuthenticity, verifies the TLS certificate chain to a
     *   trusted certificate authority (CA). This causes RTMPS outputs with self-signed certificates
     *   to fail.
     */
    public fun certificateMode(certificateMode: String) {
        cdkBuilder.certificateMode(certificateMode)
    }

    /**
     * @param connectionRetryInterval The number of seconds to wait before retrying a connection to
     *   the Flash Media server if the connection is lost.
     */
    public fun connectionRetryInterval(connectionRetryInterval: Number) {
        cdkBuilder.connectionRetryInterval(connectionRetryInterval)
    }

    /**
     * @param destination The RTMP endpoint excluding the stream name (for example,
     *   rtmp://host/appname).
     */
    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    /**
     * @param destination The RTMP endpoint excluding the stream name (for example,
     *   rtmp://host/appname).
     */
    public fun destination(destination: CfnChannel.OutputLocationRefProperty) {
        cdkBuilder.destination(destination)
    }

    /** @param numRetries The number of retry attempts. */
    public fun numRetries(numRetries: Number) {
        cdkBuilder.numRetries(numRetries)
    }

    public fun build(): CfnChannel.RtmpOutputSettingsProperty = cdkBuilder.build()
}
