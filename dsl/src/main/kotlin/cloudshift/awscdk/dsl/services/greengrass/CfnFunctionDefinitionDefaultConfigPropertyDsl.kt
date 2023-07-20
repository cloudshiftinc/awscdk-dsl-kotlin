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

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinition

@CdkDslMarker
public class CfnFunctionDefinitionDefaultConfigPropertyDsl {
    private val cdkBuilder: CfnFunctionDefinition.DefaultConfigProperty.Builder =
        CfnFunctionDefinition.DefaultConfigProperty.builder()

    public fun execution(execution: IResolvable) {
        cdkBuilder.execution(execution)
    }

    public fun execution(execution: CfnFunctionDefinition.ExecutionProperty) {
        cdkBuilder.execution(execution)
    }

    public fun build(): CfnFunctionDefinition.DefaultConfigProperty = cdkBuilder.build()
}
