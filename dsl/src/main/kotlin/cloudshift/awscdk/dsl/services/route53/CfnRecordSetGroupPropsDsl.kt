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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53.CfnRecordSetGroupProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRecordSetGroupPropsDsl {
    private val cdkBuilder: CfnRecordSetGroupProps.Builder = CfnRecordSetGroupProps.builder()

    private val _recordSets: MutableList<Any> = mutableListOf()

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
    }

    public fun hostedZoneName(hostedZoneName: String) {
        cdkBuilder.hostedZoneName(hostedZoneName)
    }

    public fun recordSets(vararg recordSets: Any) {
        _recordSets.addAll(listOf(*recordSets))
    }

    public fun recordSets(recordSets: Collection<Any>) {
        _recordSets.addAll(recordSets)
    }

    public fun recordSets(recordSets: IResolvable) {
        cdkBuilder.recordSets(recordSets)
    }

    public fun build(): CfnRecordSetGroupProps {
        if (_recordSets.isNotEmpty()) cdkBuilder.recordSets(_recordSets)
        return cdkBuilder.build()
    }
}
