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

package io.cloudshiftdev.awscdkdsl.services.memorydb

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.memorydb.CfnACL
import software.constructs.Construct

/**
 * Specifies an Access Control List.
 *
 * For more information, see
 * [Authenticating users with Access Contol Lists (ACLs)](https://docs.aws.amazon.com/memorydb/latest/devguide/clusters.acls.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.memorydb.*;
 * CfnACL cfnACL = CfnACL.Builder.create(this, "MyCfnACL")
 * .aclName("aclName")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .userNames(List.of("userNames"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html)
 */
@CdkDslMarker
public class CfnACLDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnACL.Builder = CfnACL.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _userNames: MutableList<String> = mutableListOf()

    /**
     * The name of the Access Control List.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html#cfn-memorydb-acl-aclname)
     *
     * @param aclName The name of the Access Control List.
     */
    public fun aclName(aclName: String) {
        cdkBuilder.aclName(aclName)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html#cfn-memorydb-acl-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html#cfn-memorydb-acl-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The list of users that belong to the Access Control List.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html#cfn-memorydb-acl-usernames)
     *
     * @param userNames The list of users that belong to the Access Control List.
     */
    public fun userNames(vararg userNames: String) {
        _userNames.addAll(listOf(*userNames))
    }

    /**
     * The list of users that belong to the Access Control List.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html#cfn-memorydb-acl-usernames)
     *
     * @param userNames The list of users that belong to the Access Control List.
     */
    public fun userNames(userNames: Collection<String>) {
        _userNames.addAll(userNames)
    }

    public fun build(): CfnACL {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_userNames.isNotEmpty()) cdkBuilder.userNames(_userNames)
        return cdkBuilder.build()
    }
}
