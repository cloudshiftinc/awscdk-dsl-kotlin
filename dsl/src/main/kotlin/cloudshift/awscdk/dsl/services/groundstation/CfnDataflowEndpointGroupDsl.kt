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

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup
import software.constructs.Construct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDataflowEndpointGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDataflowEndpointGroup.Builder =
        CfnDataflowEndpointGroup.Builder.create(scope, id)

    private val _endpointDetails: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun contactPostPassDurationSeconds(contactPostPassDurationSeconds: Number) {
        cdkBuilder.contactPostPassDurationSeconds(contactPostPassDurationSeconds)
    }

    public fun contactPrePassDurationSeconds(contactPrePassDurationSeconds: Number) {
        cdkBuilder.contactPrePassDurationSeconds(contactPrePassDurationSeconds)
    }

    public fun endpointDetails(vararg endpointDetails: Any) {
        _endpointDetails.addAll(listOf(*endpointDetails))
    }

    public fun endpointDetails(endpointDetails: Collection<Any>) {
        _endpointDetails.addAll(endpointDetails)
    }

    public fun endpointDetails(endpointDetails: IResolvable) {
        cdkBuilder.endpointDetails(endpointDetails)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDataflowEndpointGroup {
        if (_endpointDetails.isNotEmpty()) cdkBuilder.endpointDetails(_endpointDetails)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
