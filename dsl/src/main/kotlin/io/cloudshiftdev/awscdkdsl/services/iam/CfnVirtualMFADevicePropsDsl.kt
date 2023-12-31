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

package io.cloudshiftdev.awscdkdsl.services.iam

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iam.CfnVirtualMFADeviceProps

/**
 * Properties for defining a `CfnVirtualMFADevice`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * CfnVirtualMFADeviceProps cfnVirtualMFADeviceProps = CfnVirtualMFADeviceProps.builder()
 * .users(List.of("users"))
 * // the properties below are optional
 * .path("path")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .virtualMfaDeviceName("virtualMfaDeviceName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-virtualmfadevice.html)
 */
@CdkDslMarker
public class CfnVirtualMFADevicePropsDsl {
    private val cdkBuilder: CfnVirtualMFADeviceProps.Builder = CfnVirtualMFADeviceProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _users: MutableList<String> = mutableListOf()

    /**
     * @param path The path for the virtual MFA device. For more information about paths, see
     *   [IAM identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html)
     *   in the *IAM User Guide* .
     *
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     *
     * This parameter allows (through its
     * [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of
     * characters consisting of either a forward slash (/) by itself or a string that must begin and
     * end with forward slashes. In addition, it can contain any ASCII character from the ! (
     * `\u0021` ) through the DEL character ( `\u007F` ), including most punctuation characters,
     * digits, and upper and lowercased letters.
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /**
     * @param tags A list of tags that you want to attach to the new IAM virtual MFA device. Each
     *   tag consists of a key name and an associated value. For more information about tagging, see
     *   [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
     *   the *IAM User Guide* .
     *
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then
     * the entire request fails and the resource is not created.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of tags that you want to attach to the new IAM virtual MFA device. Each
     *   tag consists of a key name and an associated value. For more information about tagging, see
     *   [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
     *   the *IAM User Guide* .
     *
     * If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then
     * the entire request fails and the resource is not created.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param users The IAM user associated with this virtual MFA device. */
    public fun users(vararg users: String) {
        _users.addAll(listOf(*users))
    }

    /** @param users The IAM user associated with this virtual MFA device. */
    public fun users(users: Collection<String>) {
        _users.addAll(users)
    }

    /**
     * @param virtualMfaDeviceName The name of the virtual MFA device, which must be unique. Use
     *   with path to uniquely identify a virtual MFA device.
     *
     * This parameter allows (through its
     * [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can
     * also include any of the following characters: _+=,.&#64;-
     */
    public fun virtualMfaDeviceName(virtualMfaDeviceName: String) {
        cdkBuilder.virtualMfaDeviceName(virtualMfaDeviceName)
    }

    public fun build(): CfnVirtualMFADeviceProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_users.isNotEmpty()) cdkBuilder.users(_users)
        return cdkBuilder.build()
    }
}
