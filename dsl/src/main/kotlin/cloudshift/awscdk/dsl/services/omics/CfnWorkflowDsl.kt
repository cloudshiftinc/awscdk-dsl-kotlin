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

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.omics.CfnWorkflow
import software.constructs.Construct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

@CdkDslMarker
public class CfnWorkflowDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnWorkflow.Builder = CfnWorkflow.Builder.create(scope, id)

    public fun definitionUri(definitionUri: String) {
        cdkBuilder.definitionUri(definitionUri)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun engine(engine: String) {
        cdkBuilder.engine(engine)
    }

    public fun main(main: String) {
        cdkBuilder.main(main)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun parameterTemplate(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.parameterTemplate(builder.map)
    }

    public fun parameterTemplate(parameterTemplate: Map<String, Any>) {
        cdkBuilder.parameterTemplate(parameterTemplate)
    }

    public fun parameterTemplate(parameterTemplate: IResolvable) {
        cdkBuilder.parameterTemplate(parameterTemplate)
    }

    public fun storageCapacity(storageCapacity: Number) {
        cdkBuilder.storageCapacity(storageCapacity)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnWorkflow = cdkBuilder.build()
}
