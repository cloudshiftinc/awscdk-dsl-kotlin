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

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnServiceNetworkServiceAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnServiceNetworkServiceAssociation.Builder =
        CfnServiceNetworkServiceAssociation.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun dnsEntry(dnsEntry: IResolvable) {
        cdkBuilder.dnsEntry(dnsEntry)
    }

    public fun dnsEntry(dnsEntry: CfnServiceNetworkServiceAssociation.DnsEntryProperty) {
        cdkBuilder.dnsEntry(dnsEntry)
    }

    public fun serviceIdentifier(serviceIdentifier: String) {
        cdkBuilder.serviceIdentifier(serviceIdentifier)
    }

    public fun serviceNetworkIdentifier(serviceNetworkIdentifier: String) {
        cdkBuilder.serviceNetworkIdentifier(serviceNetworkIdentifier)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnServiceNetworkServiceAssociation {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
