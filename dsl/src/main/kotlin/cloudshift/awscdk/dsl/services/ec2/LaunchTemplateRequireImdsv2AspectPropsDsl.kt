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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2AspectProps
import kotlin.Boolean

@CdkDslMarker
public class LaunchTemplateRequireImdsv2AspectPropsDsl {
    private val cdkBuilder: LaunchTemplateRequireImdsv2AspectProps.Builder =
        LaunchTemplateRequireImdsv2AspectProps.builder()

    public fun suppressWarnings(suppressWarnings: Boolean) {
        cdkBuilder.suppressWarnings(suppressWarnings)
    }

    public fun build(): LaunchTemplateRequireImdsv2AspectProps = cdkBuilder.build()
}
