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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

@CdkDslMarker
public class CfnWebACLAllowActionPropertyDsl {
    private val cdkBuilder: CfnWebACL.AllowActionProperty.Builder =
        CfnWebACL.AllowActionProperty.builder()

    public fun customRequestHandling(customRequestHandling: IResolvable) {
        cdkBuilder.customRequestHandling(customRequestHandling)
    }

    public fun customRequestHandling(customRequestHandling: CfnWebACL.CustomRequestHandlingProperty) {
        cdkBuilder.customRequestHandling(customRequestHandling)
    }

    public fun build(): CfnWebACL.AllowActionProperty = cdkBuilder.build()
}
