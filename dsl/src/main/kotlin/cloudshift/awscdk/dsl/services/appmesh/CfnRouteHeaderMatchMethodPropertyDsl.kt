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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute
import kotlin.String

@CdkDslMarker
public class CfnRouteHeaderMatchMethodPropertyDsl {
    private val cdkBuilder: CfnRoute.HeaderMatchMethodProperty.Builder =
        CfnRoute.HeaderMatchMethodProperty.builder()

    public fun exact(exact: String) {
        cdkBuilder.exact(exact)
    }

    public fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
    }

    public fun range(range: IResolvable) {
        cdkBuilder.range(range)
    }

    public fun range(range: CfnRoute.MatchRangeProperty) {
        cdkBuilder.range(range)
    }

    public fun regex(regex: String) {
        cdkBuilder.regex(regex)
    }

    public fun suffix(suffix: String) {
        cdkBuilder.suffix(suffix)
    }

    public fun build(): CfnRoute.HeaderMatchMethodProperty = cdkBuilder.build()
}
