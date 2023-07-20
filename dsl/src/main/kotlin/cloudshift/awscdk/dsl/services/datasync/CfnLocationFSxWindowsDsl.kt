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

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.datasync.CfnLocationFSxWindows
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLocationFSxWindowsDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLocationFSxWindows.Builder =
        CfnLocationFSxWindows.Builder.create(scope, id)

    private val _securityGroupArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun domain(domain: String) {
        cdkBuilder.domain(domain)
    }

    public fun fsxFilesystemArn(fsxFilesystemArn: String) {
        cdkBuilder.fsxFilesystemArn(fsxFilesystemArn)
    }

    public fun password(password: String) {
        cdkBuilder.password(password)
    }

    public fun securityGroupArns(vararg securityGroupArns: String) {
        _securityGroupArns.addAll(listOf(*securityGroupArns))
    }

    public fun securityGroupArns(securityGroupArns: Collection<String>) {
        _securityGroupArns.addAll(securityGroupArns)
    }

    public fun subdirectory(subdirectory: String) {
        cdkBuilder.subdirectory(subdirectory)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun user(user: String) {
        cdkBuilder.user(user)
    }

    public fun build(): CfnLocationFSxWindows {
        if (_securityGroupArns.isNotEmpty()) cdkBuilder.securityGroupArns(_securityGroupArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
