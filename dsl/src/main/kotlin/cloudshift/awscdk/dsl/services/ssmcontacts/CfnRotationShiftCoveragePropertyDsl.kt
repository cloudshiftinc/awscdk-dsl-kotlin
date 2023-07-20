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

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnRotation
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRotationShiftCoveragePropertyDsl {
    private val cdkBuilder: CfnRotation.ShiftCoverageProperty.Builder =
        CfnRotation.ShiftCoverageProperty.builder()

    private val _coverageTimes: MutableList<Any> = mutableListOf()

    public fun coverageTimes(vararg coverageTimes: Any) {
        _coverageTimes.addAll(listOf(*coverageTimes))
    }

    public fun coverageTimes(coverageTimes: Collection<Any>) {
        _coverageTimes.addAll(coverageTimes)
    }

    public fun coverageTimes(coverageTimes: IResolvable) {
        cdkBuilder.coverageTimes(coverageTimes)
    }

    public fun dayOfWeek(dayOfWeek: String) {
        cdkBuilder.dayOfWeek(dayOfWeek)
    }

    public fun build(): CfnRotation.ShiftCoverageProperty {
        if (_coverageTimes.isNotEmpty()) cdkBuilder.coverageTimes(_coverageTimes)
        return cdkBuilder.build()
    }
}
