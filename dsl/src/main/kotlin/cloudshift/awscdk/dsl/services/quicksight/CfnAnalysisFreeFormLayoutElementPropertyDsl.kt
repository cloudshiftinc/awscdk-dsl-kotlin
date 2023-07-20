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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnalysisFreeFormLayoutElementPropertyDsl {
    private val cdkBuilder: CfnAnalysis.FreeFormLayoutElementProperty.Builder =
        CfnAnalysis.FreeFormLayoutElementProperty.builder()

    private val _renderingRules: MutableList<Any> = mutableListOf()

    public fun backgroundStyle(backgroundStyle: IResolvable) {
        cdkBuilder.backgroundStyle(backgroundStyle)
    }

    public fun backgroundStyle(backgroundStyle: CfnAnalysis.FreeFormLayoutElementBackgroundStyleProperty) {
        cdkBuilder.backgroundStyle(backgroundStyle)
    }

    public fun borderStyle(borderStyle: IResolvable) {
        cdkBuilder.borderStyle(borderStyle)
    }

    public fun borderStyle(borderStyle: CfnAnalysis.FreeFormLayoutElementBorderStyleProperty) {
        cdkBuilder.borderStyle(borderStyle)
    }

    public fun elementId(elementId: String) {
        cdkBuilder.elementId(elementId)
    }

    public fun elementType(elementType: String) {
        cdkBuilder.elementType(elementType)
    }

    public fun height(height: String) {
        cdkBuilder.height(height)
    }

    public fun loadingAnimation(loadingAnimation: IResolvable) {
        cdkBuilder.loadingAnimation(loadingAnimation)
    }

    public fun loadingAnimation(loadingAnimation: CfnAnalysis.LoadingAnimationProperty) {
        cdkBuilder.loadingAnimation(loadingAnimation)
    }

    public fun renderingRules(vararg renderingRules: Any) {
        _renderingRules.addAll(listOf(*renderingRules))
    }

    public fun renderingRules(renderingRules: Collection<Any>) {
        _renderingRules.addAll(renderingRules)
    }

    public fun renderingRules(renderingRules: IResolvable) {
        cdkBuilder.renderingRules(renderingRules)
    }

    public fun selectedBorderStyle(selectedBorderStyle: IResolvable) {
        cdkBuilder.selectedBorderStyle(selectedBorderStyle)
    }

    public fun selectedBorderStyle(selectedBorderStyle: CfnAnalysis.FreeFormLayoutElementBorderStyleProperty) {
        cdkBuilder.selectedBorderStyle(selectedBorderStyle)
    }

    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    public fun width(width: String) {
        cdkBuilder.width(width)
    }

    public fun xAxisLocation(xAxisLocation: String) {
        cdkBuilder.xAxisLocation(xAxisLocation)
    }

    public fun yAxisLocation(yAxisLocation: String) {
        cdkBuilder.yAxisLocation(yAxisLocation)
    }

    public fun build(): CfnAnalysis.FreeFormLayoutElementProperty {
        if (_renderingRules.isNotEmpty()) cdkBuilder.renderingRules(_renderingRules)
        return cdkBuilder.build()
    }
}
