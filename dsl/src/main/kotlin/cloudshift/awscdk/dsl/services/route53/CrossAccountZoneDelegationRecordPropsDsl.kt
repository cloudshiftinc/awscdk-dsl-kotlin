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

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecordProps
import software.amazon.awscdk.services.route53.IHostedZone
import kotlin.String

@CdkDslMarker
public class CrossAccountZoneDelegationRecordPropsDsl {
    private val cdkBuilder: CrossAccountZoneDelegationRecordProps.Builder =
        CrossAccountZoneDelegationRecordProps.builder()

    public fun delegatedZone(delegatedZone: IHostedZone) {
        cdkBuilder.delegatedZone(delegatedZone)
    }

    public fun delegationRole(delegationRole: IRole) {
        cdkBuilder.delegationRole(delegationRole)
    }

    public fun parentHostedZoneId(parentHostedZoneId: String) {
        cdkBuilder.parentHostedZoneId(parentHostedZoneId)
    }

    public fun parentHostedZoneName(parentHostedZoneName: String) {
        cdkBuilder.parentHostedZoneName(parentHostedZoneName)
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun ttl(ttl: Duration) {
        cdkBuilder.ttl(ttl)
    }

    public fun build(): CrossAccountZoneDelegationRecordProps = cdkBuilder.build()
}
