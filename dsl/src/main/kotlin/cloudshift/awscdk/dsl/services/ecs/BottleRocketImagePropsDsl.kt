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
import software.amazon.awscdk.services.ec2.InstanceArchitecture
import software.amazon.awscdk.services.ecs.BottleRocketImageProps
import software.amazon.awscdk.services.ecs.BottlerocketEcsVariant
import kotlin.Boolean

@CdkDslMarker
public class BottleRocketImagePropsDsl {
    private val cdkBuilder: BottleRocketImageProps.Builder = BottleRocketImageProps.builder()

    public fun architecture(architecture: InstanceArchitecture) {
        cdkBuilder.architecture(architecture)
    }

    public fun cachedInContext(cachedInContext: Boolean) {
        cdkBuilder.cachedInContext(cachedInContext)
    }

    public fun variant(variant: BottlerocketEcsVariant) {
        cdkBuilder.variant(variant)
    }

    public fun build(): BottleRocketImageProps = cdkBuilder.build()
}
