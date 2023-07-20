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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociationProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnIPAMResourceDiscoveryAssociationPropsDsl {
    private val cdkBuilder: CfnIPAMResourceDiscoveryAssociationProps.Builder =
        CfnIPAMResourceDiscoveryAssociationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun ipamId(ipamId: String) {
        cdkBuilder.ipamId(ipamId)
    }

    public fun ipamResourceDiscoveryId(ipamResourceDiscoveryId: String) {
        cdkBuilder.ipamResourceDiscoveryId(ipamResourceDiscoveryId)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnIPAMResourceDiscoveryAssociationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
