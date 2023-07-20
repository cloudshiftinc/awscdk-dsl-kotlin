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
public class CfnTemplatePivotTableDataPathOptionPropertyDsl {
    private val cdkBuilder: CfnTemplate.PivotTableDataPathOptionProperty.Builder =
        CfnTemplate.PivotTableDataPathOptionProperty.builder()

    private val _dataPathList: MutableList<Any> = mutableListOf()

    public fun dataPathList(vararg dataPathList: Any) {
        _dataPathList.addAll(listOf(*dataPathList))
    }

    public fun dataPathList(dataPathList: Collection<Any>) {
        _dataPathList.addAll(dataPathList)
    }

    public fun dataPathList(dataPathList: IResolvable) {
        cdkBuilder.dataPathList(dataPathList)
    }

    public fun width(width: String) {
        cdkBuilder.width(width)
    }

    public fun build(): CfnTemplate.PivotTableDataPathOptionProperty {
        if (_dataPathList.isNotEmpty()) cdkBuilder.dataPathList(_dataPathList)
        return cdkBuilder.build()
    }
}
