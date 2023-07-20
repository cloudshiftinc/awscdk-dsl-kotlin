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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iot.CfnScheduledAuditProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnScheduledAuditPropsDsl {
    private val cdkBuilder: CfnScheduledAuditProps.Builder = CfnScheduledAuditProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _targetCheckNames: MutableList<String> = mutableListOf()

    public fun dayOfMonth(dayOfMonth: String) {
        cdkBuilder.dayOfMonth(dayOfMonth)
    }

    public fun dayOfWeek(dayOfWeek: String) {
        cdkBuilder.dayOfWeek(dayOfWeek)
    }

    public fun frequency(frequency: String) {
        cdkBuilder.frequency(frequency)
    }

    public fun scheduledAuditName(scheduledAuditName: String) {
        cdkBuilder.scheduledAuditName(scheduledAuditName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun targetCheckNames(vararg targetCheckNames: String) {
        _targetCheckNames.addAll(listOf(*targetCheckNames))
    }

    public fun targetCheckNames(targetCheckNames: Collection<String>) {
        _targetCheckNames.addAll(targetCheckNames)
    }

    public fun build(): CfnScheduledAuditProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_targetCheckNames.isNotEmpty()) cdkBuilder.targetCheckNames(_targetCheckNames)
        return cdkBuilder.build()
    }
}
