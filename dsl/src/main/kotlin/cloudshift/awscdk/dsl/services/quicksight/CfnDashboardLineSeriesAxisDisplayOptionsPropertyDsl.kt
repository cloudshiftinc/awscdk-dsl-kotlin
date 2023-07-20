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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDashboardLineSeriesAxisDisplayOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.LineSeriesAxisDisplayOptionsProperty.Builder =
        CfnDashboard.LineSeriesAxisDisplayOptionsProperty.builder()

    private val _missingDataConfigurations: MutableList<Any> = mutableListOf()

    public fun axisOptions(axisOptions: IResolvable) {
        cdkBuilder.axisOptions(axisOptions)
    }

    public fun axisOptions(axisOptions: CfnDashboard.AxisDisplayOptionsProperty) {
        cdkBuilder.axisOptions(axisOptions)
    }

    public fun missingDataConfigurations(vararg missingDataConfigurations: Any) {
        _missingDataConfigurations.addAll(listOf(*missingDataConfigurations))
    }

    public fun missingDataConfigurations(missingDataConfigurations: Collection<Any>) {
        _missingDataConfigurations.addAll(missingDataConfigurations)
    }

    public fun missingDataConfigurations(missingDataConfigurations: IResolvable) {
        cdkBuilder.missingDataConfigurations(missingDataConfigurations)
    }

    public fun build(): CfnDashboard.LineSeriesAxisDisplayOptionsProperty {
        if (_missingDataConfigurations.isNotEmpty()) {
            cdkBuilder.missingDataConfigurations(_missingDataConfigurations)
        }
        return cdkBuilder.build()
    }
}
