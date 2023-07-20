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

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.apigateway.RestApi
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.ApiGateway
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class ApiGatewayDsl(
    restApi: RestApi,
) {
    private val cdkBuilder: ApiGateway.Builder = ApiGateway.Builder.create(restApi)

    private val _pathParameterValues: MutableList<String> = mutableListOf()

    public fun deadLetterQueue(deadLetterQueue: IQueue) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    public fun eventRole(eventRole: IRole) {
        cdkBuilder.eventRole(eventRole)
    }

    public fun headerParameters(headerParameters: Map<String, String>) {
        cdkBuilder.headerParameters(headerParameters)
    }

    public fun maxEventAge(maxEventAge: Duration) {
        cdkBuilder.maxEventAge(maxEventAge)
    }

    public fun method(method: String) {
        cdkBuilder.method(method)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun pathParameterValues(vararg pathParameterValues: String) {
        _pathParameterValues.addAll(listOf(*pathParameterValues))
    }

    public fun pathParameterValues(pathParameterValues: Collection<String>) {
        _pathParameterValues.addAll(pathParameterValues)
    }

    public fun postBody(postBody: RuleTargetInput) {
        cdkBuilder.postBody(postBody)
    }

    public fun queryStringParameters(queryStringParameters: Map<String, String>) {
        cdkBuilder.queryStringParameters(queryStringParameters)
    }

    public fun retryAttempts(retryAttempts: Number) {
        cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun stage(stage: String) {
        cdkBuilder.stage(stage)
    }

    public fun build(): ApiGateway {
        if (_pathParameterValues.isNotEmpty()) cdkBuilder.pathParameterValues(_pathParameterValues)
        return cdkBuilder.build()
    }
}
