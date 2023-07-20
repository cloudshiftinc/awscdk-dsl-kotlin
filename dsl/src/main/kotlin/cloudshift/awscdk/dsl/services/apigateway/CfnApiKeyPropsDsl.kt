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
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnApiKeyProps
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnApiKeyPropsDsl {
    private val cdkBuilder: CfnApiKeyProps.Builder = CfnApiKeyProps.builder()

    private val _stageKeys: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun customerId(customerId: String) {
        cdkBuilder.customerId(customerId)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun generateDistinctId(generateDistinctId: Boolean) {
        cdkBuilder.generateDistinctId(generateDistinctId)
    }

    public fun generateDistinctId(generateDistinctId: IResolvable) {
        cdkBuilder.generateDistinctId(generateDistinctId)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun stageKeys(vararg stageKeys: Any) {
        _stageKeys.addAll(listOf(*stageKeys))
    }

    public fun stageKeys(stageKeys: Collection<Any>) {
        _stageKeys.addAll(stageKeys)
    }

    public fun stageKeys(stageKeys: IResolvable) {
        cdkBuilder.stageKeys(stageKeys)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnApiKeyProps {
        if (_stageKeys.isNotEmpty()) cdkBuilder.stageKeys(_stageKeys)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
