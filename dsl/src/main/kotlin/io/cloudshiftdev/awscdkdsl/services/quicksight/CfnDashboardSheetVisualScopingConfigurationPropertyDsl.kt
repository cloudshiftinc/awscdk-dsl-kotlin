@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.quicksight.CfnDashboard

/**
 * The filter that is applied to the options.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * SheetVisualScopingConfigurationProperty sheetVisualScopingConfigurationProperty =
 * SheetVisualScopingConfigurationProperty.builder()
 * .scope("scope")
 * .sheetId("sheetId")
 * // the properties below are optional
 * .visualIds(List.of("visualIds"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dashboard-sheetvisualscopingconfiguration.html)
 */
@CdkDslMarker
public class CfnDashboardSheetVisualScopingConfigurationPropertyDsl {
    private val cdkBuilder: CfnDashboard.SheetVisualScopingConfigurationProperty.Builder =
        CfnDashboard.SheetVisualScopingConfigurationProperty.builder()

    private val _visualIds: MutableList<String> = mutableListOf()

    /**
     * @param scope The scope of the applied entities. Choose one of the following options:.
     * * `ALL_VISUALS`
     * * `SELECTED_VISUALS`
     */
    public fun scope(scope: String) {
        cdkBuilder.scope(scope)
    }

    /** @param sheetId The selected sheet that the filter is applied to. */
    public fun sheetId(sheetId: String) {
        cdkBuilder.sheetId(sheetId)
    }

    /** @param visualIds The selected visuals that the filter is applied to. */
    public fun visualIds(vararg visualIds: String) {
        _visualIds.addAll(listOf(*visualIds))
    }

    /** @param visualIds The selected visuals that the filter is applied to. */
    public fun visualIds(visualIds: Collection<String>) {
        _visualIds.addAll(visualIds)
    }

    public fun build(): CfnDashboard.SheetVisualScopingConfigurationProperty {
        if (_visualIds.isNotEmpty()) cdkBuilder.visualIds(_visualIds)
        return cdkBuilder.build()
    }
}
