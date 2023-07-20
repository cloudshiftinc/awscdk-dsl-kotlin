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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.omics.CfnVariantStore
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnVariantStoreDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVariantStore.Builder = CfnVariantStore.Builder.create(scope, id)

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun reference(reference: IResolvable) {
        cdkBuilder.reference(reference)
    }

    public fun reference(reference: CfnVariantStore.ReferenceItemProperty) {
        cdkBuilder.reference(reference)
    }

    public fun sseConfig(sseConfig: IResolvable) {
        cdkBuilder.sseConfig(sseConfig)
    }

    public fun sseConfig(sseConfig: CfnVariantStore.SseConfigProperty) {
        cdkBuilder.sseConfig(sseConfig)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnVariantStore = cdkBuilder.build()
}
