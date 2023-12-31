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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnTrafficMirrorSessionProps

/**
 * Properties for defining a `CfnTrafficMirrorSession`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnTrafficMirrorSessionProps cfnTrafficMirrorSessionProps =
 * CfnTrafficMirrorSessionProps.builder()
 * .networkInterfaceId("networkInterfaceId")
 * .sessionNumber(123)
 * .trafficMirrorFilterId("trafficMirrorFilterId")
 * .trafficMirrorTargetId("trafficMirrorTargetId")
 * // the properties below are optional
 * .description("description")
 * .packetLength(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .virtualNetworkId(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorsession.html)
 */
@CdkDslMarker
public class CfnTrafficMirrorSessionPropsDsl {
    private val cdkBuilder: CfnTrafficMirrorSessionProps.Builder =
        CfnTrafficMirrorSessionProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description The description of the Traffic Mirror session. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param networkInterfaceId The ID of the source network interface. */
    public fun networkInterfaceId(networkInterfaceId: String) {
        cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    /**
     * @param packetLength The number of bytes in each packet to mirror. These are bytes after the
     *   VXLAN header. Do not specify this parameter when you want to mirror the entire packet. To
     *   mirror a subset of the packet, set this to the length (in bytes) that you want to mirror.
     *   For example, if you set this value to 100, then the first 100 bytes that meet the filter
     *   criteria are copied to the target.
     *
     * If you do not want to mirror the entire packet, use the `PacketLength` parameter to specify
     * the number of bytes in each packet to mirror.
     *
     * For sessions with Network Load Balancer (NLB) Traffic Mirror targets the default
     * `PacketLength` will be set to 8500. Valid values are 1-8500. Setting a `PacketLength` greater
     * than 8500 will result in an error response.
     */
    public fun packetLength(packetLength: Number) {
        cdkBuilder.packetLength(packetLength)
    }

    /**
     * @param sessionNumber The session number determines the order in which sessions are evaluated
     *   when an interface is used by multiple sessions. The first session with a matching filter is
     *   the one that mirrors the packets.
     *
     * Valid values are 1-32766.
     */
    public fun sessionNumber(sessionNumber: Number) {
        cdkBuilder.sessionNumber(sessionNumber)
    }

    /** @param tags The tags to assign to a Traffic Mirror session. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to assign to a Traffic Mirror session. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param trafficMirrorFilterId The ID of the Traffic Mirror filter. */
    public fun trafficMirrorFilterId(trafficMirrorFilterId: String) {
        cdkBuilder.trafficMirrorFilterId(trafficMirrorFilterId)
    }

    /** @param trafficMirrorTargetId The ID of the Traffic Mirror target. */
    public fun trafficMirrorTargetId(trafficMirrorTargetId: String) {
        cdkBuilder.trafficMirrorTargetId(trafficMirrorTargetId)
    }

    /**
     * @param virtualNetworkId The VXLAN ID for the Traffic Mirror session. For more information
     *   about the VXLAN protocol, see
     *   [RFC 7348](https://docs.aws.amazon.com/https://tools.ietf.org/html/rfc7348) . If you do not
     *   specify a `VirtualNetworkId` , an account-wide unique id is chosen at random.
     */
    public fun virtualNetworkId(virtualNetworkId: Number) {
        cdkBuilder.virtualNetworkId(virtualNetworkId)
    }

    public fun build(): CfnTrafficMirrorSessionProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
