@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.vpclattice

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnRule
import software.amazon.awscdk.services.vpclattice.CfnRuleProps

/**
 * Properties for defining a `CfnRule`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * CfnRuleProps cfnRuleProps = CfnRuleProps.builder()
 * .action(ActionProperty.builder()
 * .fixedResponse(FixedResponseProperty.builder()
 * .statusCode(123)
 * .build())
 * .forward(ForwardProperty.builder()
 * .targetGroups(List.of(WeightedTargetGroupProperty.builder()
 * .targetGroupIdentifier("targetGroupIdentifier")
 * // the properties below are optional
 * .weight(123)
 * .build()))
 * .build())
 * .build())
 * .match(MatchProperty.builder()
 * .httpMatch(HttpMatchProperty.builder()
 * .headerMatches(List.of(HeaderMatchProperty.builder()
 * .match(HeaderMatchTypeProperty.builder()
 * .contains("contains")
 * .exact("exact")
 * .prefix("prefix")
 * .build())
 * .name("name")
 * // the properties below are optional
 * .caseSensitive(false)
 * .build()))
 * .method("method")
 * .pathMatch(PathMatchProperty.builder()
 * .match(PathMatchTypeProperty.builder()
 * .exact("exact")
 * .prefix("prefix")
 * .build())
 * // the properties below are optional
 * .caseSensitive(false)
 * .build())
 * .build())
 * .build())
 * .priority(123)
 * // the properties below are optional
 * .listenerIdentifier("listenerIdentifier")
 * .name("name")
 * .serviceIdentifier("serviceIdentifier")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-rule.html)
 */
@CdkDslMarker
public class CfnRulePropsDsl {
    private val cdkBuilder: CfnRuleProps.Builder = CfnRuleProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param action Describes the action for a rule. Each rule must include exactly one of the
     *   following types of actions: `forward` or `fixed-response` , and it must be the last action
     *   to be performed.
     */
    public fun action(action: IResolvable) {
        cdkBuilder.action(action)
    }

    /**
     * @param action Describes the action for a rule. Each rule must include exactly one of the
     *   following types of actions: `forward` or `fixed-response` , and it must be the last action
     *   to be performed.
     */
    public fun action(action: CfnRule.ActionProperty) {
        cdkBuilder.action(action)
    }

    /** @param listenerIdentifier The ID or Amazon Resource Name (ARN) of the listener. */
    public fun listenerIdentifier(listenerIdentifier: String) {
        cdkBuilder.listenerIdentifier(listenerIdentifier)
    }

    /** @param match The rule match. */
    public fun match(match: IResolvable) {
        cdkBuilder.match(match)
    }

    /** @param match The rule match. */
    public fun match(match: CfnRule.MatchProperty) {
        cdkBuilder.match(match)
    }

    /**
     * @param name The name of the rule. The name must be unique within the listener. The valid
     *   characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last
     *   character, or immediately after another hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param priority The priority assigned to the rule. Each rule for a specific listener must
     *   have a unique priority. The lower the priority number the higher the priority.
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    /** @param serviceIdentifier The ID or Amazon Resource Name (ARN) of the service. */
    public fun serviceIdentifier(serviceIdentifier: String) {
        cdkBuilder.serviceIdentifier(serviceIdentifier)
    }

    /** @param tags The tags for the rule. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags for the rule. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnRuleProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
