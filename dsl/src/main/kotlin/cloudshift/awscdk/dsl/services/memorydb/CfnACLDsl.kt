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

package cloudshift.awscdk.dsl.services.memorydb

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.memorydb.CfnACL
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnACLDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnACL.Builder = CfnACL.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _userNames: MutableList<String> = mutableListOf()

    public fun aclName(aclName: String) {
        cdkBuilder.aclName(aclName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun userNames(vararg userNames: String) {
        _userNames.addAll(listOf(*userNames))
    }

    public fun userNames(userNames: Collection<String>) {
        _userNames.addAll(userNames)
    }

    public fun build(): CfnACL {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_userNames.isNotEmpty()) cdkBuilder.userNames(_userNames)
        return cdkBuilder.build()
    }
}
