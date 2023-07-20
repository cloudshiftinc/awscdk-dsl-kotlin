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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnTopicRuleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTopicRule.Builder = CfnTopicRule.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun topicRulePayload(topicRulePayload: IResolvable) {
        cdkBuilder.topicRulePayload(topicRulePayload)
    }

    public fun topicRulePayload(topicRulePayload: CfnTopicRule.TopicRulePayloadProperty) {
        cdkBuilder.topicRulePayload(topicRulePayload)
    }

    public fun build(): CfnTopicRule {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
