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
import software.amazon.awscdk.services.ecs.ExternalTaskDefinitionAttributes
import software.amazon.awscdk.services.ecs.NetworkMode
import software.amazon.awscdk.services.iam.IRole
import kotlin.String

@CdkDslMarker
public class ExternalTaskDefinitionAttributesDsl {
    private val cdkBuilder: ExternalTaskDefinitionAttributes.Builder =
        ExternalTaskDefinitionAttributes.builder()

    public fun executionRole(executionRole: IRole) {
        cdkBuilder.executionRole(executionRole)
    }

    public fun networkMode(networkMode: NetworkMode) {
        cdkBuilder.networkMode(networkMode)
    }

    public fun taskDefinitionArn(taskDefinitionArn: String) {
        cdkBuilder.taskDefinitionArn(taskDefinitionArn)
    }

    public fun taskRole(taskRole: IRole) {
        cdkBuilder.taskRole(taskRole)
    }

    public fun build(): ExternalTaskDefinitionAttributes = cdkBuilder.build()
}
