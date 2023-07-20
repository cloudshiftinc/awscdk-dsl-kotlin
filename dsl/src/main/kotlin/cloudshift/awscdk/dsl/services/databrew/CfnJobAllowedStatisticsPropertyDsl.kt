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

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.databrew.CfnJob
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnJobAllowedStatisticsPropertyDsl {
    private val cdkBuilder: CfnJob.AllowedStatisticsProperty.Builder =
        CfnJob.AllowedStatisticsProperty.builder()

    private val _statistics: MutableList<String> = mutableListOf()

    public fun statistics(vararg statistics: String) {
        _statistics.addAll(listOf(*statistics))
    }

    public fun statistics(statistics: Collection<String>) {
        _statistics.addAll(statistics)
    }

    public fun build(): CfnJob.AllowedStatisticsProperty {
        if (_statistics.isNotEmpty()) cdkBuilder.statistics(_statistics)
        return cdkBuilder.build()
    }
}
