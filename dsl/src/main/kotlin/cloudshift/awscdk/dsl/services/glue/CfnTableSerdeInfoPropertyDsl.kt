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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.glue.CfnTable
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnTableSerdeInfoPropertyDsl {
    private val cdkBuilder: CfnTable.SerdeInfoProperty.Builder = CfnTable.SerdeInfoProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun parameters(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.parameters(builder.map)
    }

    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    public fun serializationLibrary(serializationLibrary: String) {
        cdkBuilder.serializationLibrary(serializationLibrary)
    }

    public fun build(): CfnTable.SerdeInfoProperty = cdkBuilder.build()
}
