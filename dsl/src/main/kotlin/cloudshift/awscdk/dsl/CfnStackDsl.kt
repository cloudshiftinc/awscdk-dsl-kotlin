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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnStack
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnStackDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStack.Builder = CfnStack.Builder.create(scope, id)

    private val _notificationArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun notificationArns(vararg notificationArns: String) {
        _notificationArns.addAll(listOf(*notificationArns))
    }

    public fun notificationArns(notificationArns: Collection<String>) {
        _notificationArns.addAll(notificationArns)
    }

    public fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
    }

    public fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun templateUrl(templateUrl: String) {
        cdkBuilder.templateUrl(templateUrl)
    }

    public fun timeoutInMinutes(timeoutInMinutes: Number) {
        cdkBuilder.timeoutInMinutes(timeoutInMinutes)
    }

    public fun build(): CfnStack {
        if (_notificationArns.isNotEmpty()) cdkBuilder.notificationArns(_notificationArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
