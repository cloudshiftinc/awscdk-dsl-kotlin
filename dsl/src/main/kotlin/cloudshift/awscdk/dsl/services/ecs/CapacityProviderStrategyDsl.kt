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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.CapacityProviderStrategy
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CapacityProviderStrategyDsl {
    private val cdkBuilder: CapacityProviderStrategy.Builder = CapacityProviderStrategy.builder()

    public fun base(base: Number) {
        cdkBuilder.base(base)
    }

    public fun capacityProvider(capacityProvider: String) {
        cdkBuilder.capacityProvider(capacityProvider)
    }

    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): CapacityProviderStrategy = cdkBuilder.build()
}
