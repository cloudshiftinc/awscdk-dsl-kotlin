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

package io.cloudshiftdev.awscdkdsl.services.organizations

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.organizations.CfnOrganizationalUnitProps

/**
 * Properties for defining a `CfnOrganizationalUnit`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.organizations.*;
 * CfnOrganizationalUnitProps cfnOrganizationalUnitProps = CfnOrganizationalUnitProps.builder()
 * .name("name")
 * .parentId("parentId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-organizationalunit.html)
 */
@CdkDslMarker
public class CfnOrganizationalUnitPropsDsl {
    private val cdkBuilder: CfnOrganizationalUnitProps.Builder =
        CfnOrganizationalUnitProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param name The friendly name of this OU. The
     *   [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) that is used
     *   to validate this parameter is a string of any of the characters in the ASCII character
     *   range.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param parentId The unique identifier (ID) of the parent root or OU that you want to create
     *   the new OU in.
     *
     * To update the `ParentId` parameter value, you must first remove all accounts attached to the
     * organizational unit (OU). OUs can't be moved within the organization with accounts still
     * attached.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) for a parent
     * ID string requires one of the following:
     * * *Root* - A string that begins with "r-" followed by from 4 to 32 lowercase letters or
     *   digits.
     * * *Organizational unit (OU)* - A string that begins with "ou-" followed by from 4 to 32
     *   lowercase letters or digits (the ID of the root that the OU is in). This string is followed
     *   by a second "-" dash and from 8 to 32 additional lowercase letters or digits.
     */
    public fun parentId(parentId: String) {
        cdkBuilder.parentId(parentId)
    }

    /**
     * @param tags A list of tags that you want to attach to the newly created OU. For each tag in
     *   the list, you must specify both a tag key and a value. You can set the value to an empty
     *   string, but you can't set it to `null` . For more information about tagging, see
     *   [Tagging AWS Organizations resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html)
     *   in the AWS Organizations User Guide.
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for an OU,
     * then the entire request fails and the OU is not created.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of tags that you want to attach to the newly created OU. For each tag in
     *   the list, you must specify both a tag key and a value. You can set the value to an empty
     *   string, but you can't set it to `null` . For more information about tagging, see
     *   [Tagging AWS Organizations resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html)
     *   in the AWS Organizations User Guide.
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for an OU,
     * then the entire request fails and the OU is not created.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnOrganizationalUnitProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
