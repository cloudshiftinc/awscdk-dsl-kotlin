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

package cloudshift.awscdk.dsl.services.codeguruprofiler

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codeguruprofiler.CfnProfilingGroup
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnProfilingGroupAgentPermissionsPropertyDsl {
    private val cdkBuilder: CfnProfilingGroup.AgentPermissionsProperty.Builder =
        CfnProfilingGroup.AgentPermissionsProperty.builder()

    private val _principals: MutableList<String> = mutableListOf()

    public fun principals(vararg principals: String) {
        _principals.addAll(listOf(*principals))
    }

    public fun principals(principals: Collection<String>) {
        _principals.addAll(principals)
    }

    public fun build(): CfnProfilingGroup.AgentPermissionsProperty {
        if (_principals.isNotEmpty()) cdkBuilder.principals(_principals)
        return cdkBuilder.build()
    }
}
