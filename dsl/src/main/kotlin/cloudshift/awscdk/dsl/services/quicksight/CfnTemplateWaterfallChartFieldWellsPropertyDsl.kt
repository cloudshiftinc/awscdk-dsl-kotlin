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
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateWaterfallChartFieldWellsPropertyDsl {
    private val cdkBuilder: CfnTemplate.WaterfallChartFieldWellsProperty.Builder =
        CfnTemplate.WaterfallChartFieldWellsProperty.builder()

    public fun waterfallChartAggregatedFieldWells(waterfallChartAggregatedFieldWells: IResolvable) {
        cdkBuilder.waterfallChartAggregatedFieldWells(waterfallChartAggregatedFieldWells)
    }

    public fun waterfallChartAggregatedFieldWells(waterfallChartAggregatedFieldWells: CfnTemplate.WaterfallChartAggregatedFieldWellsProperty) {
        cdkBuilder.waterfallChartAggregatedFieldWells(waterfallChartAggregatedFieldWells)
    }

    public fun build(): CfnTemplate.WaterfallChartFieldWellsProperty = cdkBuilder.build()
}
