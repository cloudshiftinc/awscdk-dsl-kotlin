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
import software.amazon.awscdk.services.route53.IHostedZone
import software.amazon.awscdk.services.route53.ZoneDelegationRecordProps
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class ZoneDelegationRecordPropsDsl {
    private val cdkBuilder: ZoneDelegationRecordProps.Builder = ZoneDelegationRecordProps.builder()

    private val _nameServers: MutableList<String> = mutableListOf()

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun deleteExisting(deleteExisting: Boolean) {
        cdkBuilder.deleteExisting(deleteExisting)
    }

    public fun nameServers(vararg nameServers: String) {
        _nameServers.addAll(listOf(*nameServers))
    }

    public fun nameServers(nameServers: Collection<String>) {
        _nameServers.addAll(nameServers)
    }

    public fun recordName(recordName: String) {
        cdkBuilder.recordName(recordName)
    }

    public fun ttl(ttl: Duration) {
        cdkBuilder.ttl(ttl)
    }

    public fun zone(zone: IHostedZone) {
        cdkBuilder.zone(zone)
    }

    public fun build(): ZoneDelegationRecordProps {
        if (_nameServers.isNotEmpty()) cdkBuilder.nameServers(_nameServers)
        return cdkBuilder.build()
    }
}
