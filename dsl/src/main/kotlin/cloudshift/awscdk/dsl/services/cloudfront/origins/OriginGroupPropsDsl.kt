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

package cloudshift.awscdk.dsl.services.cloudfront.origins

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudfront.IOrigin
import software.amazon.awscdk.services.cloudfront.origins.OriginGroupProps
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class OriginGroupPropsDsl {
    private val cdkBuilder: OriginGroupProps.Builder = OriginGroupProps.builder()

    private val _fallbackStatusCodes: MutableList<Number> = mutableListOf()

    public fun fallbackOrigin(fallbackOrigin: IOrigin) {
        cdkBuilder.fallbackOrigin(fallbackOrigin)
    }

    public fun fallbackStatusCodes(vararg fallbackStatusCodes: Number) {
        _fallbackStatusCodes.addAll(listOf(*fallbackStatusCodes))
    }

    public fun fallbackStatusCodes(fallbackStatusCodes: Collection<Number>) {
        _fallbackStatusCodes.addAll(fallbackStatusCodes)
    }

    public fun primaryOrigin(primaryOrigin: IOrigin) {
        cdkBuilder.primaryOrigin(primaryOrigin)
    }

    public fun build(): OriginGroupProps {
        if (_fallbackStatusCodes.isNotEmpty()) cdkBuilder.fallbackStatusCodes(_fallbackStatusCodes)
        return cdkBuilder.build()
    }
}
