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

package cloudshift.awscdk.dsl.services.kinesisvideo

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.kinesisvideo.CfnSignalingChannelProps
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnSignalingChannelPropsDsl {
    private val cdkBuilder: CfnSignalingChannelProps.Builder = CfnSignalingChannelProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun messageTtlSeconds(messageTtlSeconds: Number) {
        cdkBuilder.messageTtlSeconds(messageTtlSeconds)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnSignalingChannelProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
