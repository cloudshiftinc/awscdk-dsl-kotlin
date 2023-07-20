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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnApplicationV2EnvironmentPropertiesPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.EnvironmentPropertiesProperty.Builder =
        CfnApplicationV2.EnvironmentPropertiesProperty.builder()

    private val _propertyGroups: MutableList<Any> = mutableListOf()

    public fun propertyGroups(vararg propertyGroups: Any) {
        _propertyGroups.addAll(listOf(*propertyGroups))
    }

    public fun propertyGroups(propertyGroups: Collection<Any>) {
        _propertyGroups.addAll(propertyGroups)
    }

    public fun propertyGroups(propertyGroups: IResolvable) {
        cdkBuilder.propertyGroups(propertyGroups)
    }

    public fun build(): CfnApplicationV2.EnvironmentPropertiesProperty {
        if (_propertyGroups.isNotEmpty()) cdkBuilder.propertyGroups(_propertyGroups)
        return cdkBuilder.build()
    }
}
