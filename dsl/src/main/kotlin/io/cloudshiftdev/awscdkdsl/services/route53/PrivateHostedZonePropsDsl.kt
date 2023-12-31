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

package io.cloudshiftdev.awscdkdsl.services.route53

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.route53.PrivateHostedZoneProps

/**
 * Properties to create a Route 53 private hosted zone.
 *
 * Example:
 * ```
 * Vpc vpc;
 * PrivateHostedZone zone = PrivateHostedZone.Builder.create(this, "HostedZone")
 * .zoneName("fully.qualified.domain.com")
 * .vpc(vpc)
 * .build();
 * ```
 */
@CdkDslMarker
public class PrivateHostedZonePropsDsl {
    private val cdkBuilder: PrivateHostedZoneProps.Builder = PrivateHostedZoneProps.builder()

    /** @param addTrailingDot Whether to add a trailing dot to the zone name. */
    public fun addTrailingDot(addTrailingDot: Boolean) {
        cdkBuilder.addTrailingDot(addTrailingDot)
    }

    /** @param comment Any comments that you want to include about the hosted zone. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * @param queryLogsLogGroupArn The Amazon Resource Name (ARN) for the log group that you want
     *   Amazon Route 53 to send query logs to.
     */
    public fun queryLogsLogGroupArn(queryLogsLogGroupArn: String) {
        cdkBuilder.queryLogsLogGroupArn(queryLogsLogGroupArn)
    }

    /**
     * @param vpc A VPC that you want to associate with this hosted zone. Private hosted zones must
     *   be associated with at least one VPC. You can associated additional VPCs using
     *   `addVpc(vpc)`.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    /**
     * @param zoneName The name of the domain. For resource record types that include a domain name,
     *   specify a fully qualified domain name.
     */
    public fun zoneName(zoneName: String) {
        cdkBuilder.zoneName(zoneName)
    }

    public fun build(): PrivateHostedZoneProps = cdkBuilder.build()
}
