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

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnDetectorModel
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDetectorModelOnExitPropertyDsl {
    private val cdkBuilder: CfnDetectorModel.OnExitProperty.Builder =
        CfnDetectorModel.OnExitProperty.builder()

    private val _events: MutableList<Any> = mutableListOf()

    public fun events(vararg events: Any) {
        _events.addAll(listOf(*events))
    }

    public fun events(events: Collection<Any>) {
        _events.addAll(events)
    }

    public fun events(events: IResolvable) {
        cdkBuilder.events(events)
    }

    public fun build(): CfnDetectorModel.OnExitProperty {
        if (_events.isNotEmpty()) cdkBuilder.events(_events)
        return cdkBuilder.build()
    }
}
