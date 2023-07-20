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

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.apigateway.QuotaSettings
import software.amazon.awscdk.services.apigateway.ThrottleSettings
import software.amazon.awscdk.services.apigateway.UsagePlan
import software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class UsagePlanDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: UsagePlan.Builder = UsagePlan.Builder.create(scope, id)

    private val _apiStages: MutableList<UsagePlanPerApiStage> = mutableListOf()

    public fun apiStages(apiStages: UsagePlanPerApiStageDsl.() -> Unit) {
        _apiStages.add(UsagePlanPerApiStageDsl().apply(apiStages).build())
    }

    public fun apiStages(apiStages: Collection<UsagePlanPerApiStage>) {
        _apiStages.addAll(apiStages)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun quota(block: QuotaSettingsDsl.() -> Unit = {}) {
        val builder = QuotaSettingsDsl()
        builder.apply(block)
        cdkBuilder.quota(builder.build())
    }

    public fun quota(quota: QuotaSettings) {
        cdkBuilder.quota(quota)
    }

    public fun throttle(block: ThrottleSettingsDsl.() -> Unit = {}) {
        val builder = ThrottleSettingsDsl()
        builder.apply(block)
        cdkBuilder.throttle(builder.build())
    }

    public fun throttle(throttle: ThrottleSettings) {
        cdkBuilder.throttle(throttle)
    }

    public fun build(): UsagePlan {
        if (_apiStages.isNotEmpty()) cdkBuilder.apiStages(_apiStages)
        return cdkBuilder.build()
    }
}
