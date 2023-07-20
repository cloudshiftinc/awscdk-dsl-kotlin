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

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.logs.CfnLogGroupProps
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLogGroupPropsDsl {
    private val cdkBuilder: CfnLogGroupProps.Builder = CfnLogGroupProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun dataProtectionPolicy(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.dataProtectionPolicy(builder.map)
    }

    public fun dataProtectionPolicy(dataProtectionPolicy: Any) {
        cdkBuilder.dataProtectionPolicy(dataProtectionPolicy)
    }

    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    public fun retentionInDays(retentionInDays: Number) {
        cdkBuilder.retentionInDays(retentionInDays)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnLogGroupProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
