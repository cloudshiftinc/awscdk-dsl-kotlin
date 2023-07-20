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
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.greengrass.CfnConnectorDefinition
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnConnectorDefinitionConnectorPropertyDsl {
    private val cdkBuilder: CfnConnectorDefinition.ConnectorProperty.Builder =
        CfnConnectorDefinition.ConnectorProperty.builder()

    public fun connectorArn(connectorArn: String) {
        cdkBuilder.connectorArn(connectorArn)
    }

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun parameters(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.parameters(builder.map)
    }

    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    public fun build(): CfnConnectorDefinition.ConnectorProperty = cdkBuilder.build()
}
