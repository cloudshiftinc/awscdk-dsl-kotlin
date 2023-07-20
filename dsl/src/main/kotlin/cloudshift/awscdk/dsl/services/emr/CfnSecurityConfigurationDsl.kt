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

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.emr.CfnSecurityConfiguration
import software.constructs.Construct
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnSecurityConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSecurityConfiguration.Builder =
        CfnSecurityConfiguration.Builder.create(scope, id)

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun securityConfiguration(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.securityConfiguration(builder.map)
    }

    public fun securityConfiguration(securityConfiguration: Any) {
        cdkBuilder.securityConfiguration(securityConfiguration)
    }

    public fun build(): CfnSecurityConfiguration = cdkBuilder.build()
}
