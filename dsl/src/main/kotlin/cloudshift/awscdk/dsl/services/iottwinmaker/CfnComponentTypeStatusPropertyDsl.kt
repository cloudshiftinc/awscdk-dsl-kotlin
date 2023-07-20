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

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType
import kotlin.String

@CdkDslMarker
public class CfnComponentTypeStatusPropertyDsl {
    private val cdkBuilder: CfnComponentType.StatusProperty.Builder =
        CfnComponentType.StatusProperty.builder()

    public fun error(error: IResolvable) {
        cdkBuilder.error(error)
    }

    public fun error(error: CfnComponentType.ErrorProperty) {
        cdkBuilder.error(error)
    }

    public fun state(state: String) {
        cdkBuilder.state(state)
    }

    public fun build(): CfnComponentType.StatusProperty = cdkBuilder.build()
}
