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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnHookTypeConfigProps
import kotlin.String

@CdkDslMarker
public class CfnHookTypeConfigPropsDsl {
    private val cdkBuilder: CfnHookTypeConfigProps.Builder = CfnHookTypeConfigProps.builder()

    public fun configuration(configuration: String) {
        cdkBuilder.configuration(configuration)
    }

    public fun configurationAlias(configurationAlias: String) {
        cdkBuilder.configurationAlias(configurationAlias)
    }

    public fun typeArn(typeArn: String) {
        cdkBuilder.typeArn(typeArn)
    }

    public fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
    }

    public fun build(): CfnHookTypeConfigProps = cdkBuilder.build()
}
