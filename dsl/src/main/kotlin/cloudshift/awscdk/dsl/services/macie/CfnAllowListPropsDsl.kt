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

package cloudshift.awscdk.dsl.services.macie

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.macie.CfnAllowList
import software.amazon.awscdk.services.macie.CfnAllowListProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAllowListPropsDsl {
    private val cdkBuilder: CfnAllowListProps.Builder = CfnAllowListProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun criteria(criteria: IResolvable) {
        cdkBuilder.criteria(criteria)
    }

    public fun criteria(criteria: CfnAllowList.CriteriaProperty) {
        cdkBuilder.criteria(criteria)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAllowListProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
