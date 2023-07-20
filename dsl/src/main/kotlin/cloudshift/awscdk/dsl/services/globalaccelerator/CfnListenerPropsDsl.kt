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

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.globalaccelerator.CfnListenerProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnListenerPropsDsl {
    private val cdkBuilder: CfnListenerProps.Builder = CfnListenerProps.builder()

    private val _portRanges: MutableList<Any> = mutableListOf()

    public fun acceleratorArn(acceleratorArn: String) {
        cdkBuilder.acceleratorArn(acceleratorArn)
    }

    public fun clientAffinity(clientAffinity: String) {
        cdkBuilder.clientAffinity(clientAffinity)
    }

    public fun portRanges(vararg portRanges: Any) {
        _portRanges.addAll(listOf(*portRanges))
    }

    public fun portRanges(portRanges: Collection<Any>) {
        _portRanges.addAll(portRanges)
    }

    public fun portRanges(portRanges: IResolvable) {
        cdkBuilder.portRanges(portRanges)
    }

    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    public fun build(): CfnListenerProps {
        if (_portRanges.isNotEmpty()) cdkBuilder.portRanges(_portRanges)
        return cdkBuilder.build()
    }
}
