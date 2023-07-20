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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTemplateFilledMapVisualPropertyDsl {
    private val cdkBuilder: CfnTemplate.FilledMapVisualProperty.Builder =
        CfnTemplate.FilledMapVisualProperty.builder()

    private val _actions: MutableList<Any> = mutableListOf()

    private val _columnHierarchies: MutableList<Any> = mutableListOf()

    public fun actions(vararg actions: Any) {
        _actions.addAll(listOf(*actions))
    }

    public fun actions(actions: Collection<Any>) {
        _actions.addAll(actions)
    }

    public fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions)
    }

    public fun chartConfiguration(chartConfiguration: IResolvable) {
        cdkBuilder.chartConfiguration(chartConfiguration)
    }

    public fun chartConfiguration(chartConfiguration: CfnTemplate.FilledMapConfigurationProperty) {
        cdkBuilder.chartConfiguration(chartConfiguration)
    }

    public fun columnHierarchies(vararg columnHierarchies: Any) {
        _columnHierarchies.addAll(listOf(*columnHierarchies))
    }

    public fun columnHierarchies(columnHierarchies: Collection<Any>) {
        _columnHierarchies.addAll(columnHierarchies)
    }

    public fun columnHierarchies(columnHierarchies: IResolvable) {
        cdkBuilder.columnHierarchies(columnHierarchies)
    }

    public fun conditionalFormatting(conditionalFormatting: IResolvable) {
        cdkBuilder.conditionalFormatting(conditionalFormatting)
    }

    public fun conditionalFormatting(conditionalFormatting: CfnTemplate.FilledMapConditionalFormattingProperty) {
        cdkBuilder.conditionalFormatting(conditionalFormatting)
    }

    public fun subtitle(subtitle: IResolvable) {
        cdkBuilder.subtitle(subtitle)
    }

    public fun subtitle(subtitle: CfnTemplate.VisualSubtitleLabelOptionsProperty) {
        cdkBuilder.subtitle(subtitle)
    }

    public fun title(title: IResolvable) {
        cdkBuilder.title(title)
    }

    public fun title(title: CfnTemplate.VisualTitleLabelOptionsProperty) {
        cdkBuilder.title(title)
    }

    public fun visualId(visualId: String) {
        cdkBuilder.visualId(visualId)
    }

    public fun build(): CfnTemplate.FilledMapVisualProperty {
        if (_actions.isNotEmpty()) cdkBuilder.actions(_actions)
        if (_columnHierarchies.isNotEmpty()) cdkBuilder.columnHierarchies(_columnHierarchies)
        return cdkBuilder.build()
    }
}
