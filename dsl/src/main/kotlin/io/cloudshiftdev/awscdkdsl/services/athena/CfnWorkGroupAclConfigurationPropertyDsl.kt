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

package io.cloudshiftdev.awscdkdsl.services.athena

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.athena.CfnWorkGroup

/**
 * Indicates that an Amazon S3 canned ACL should be set to control ownership of stored query
 * results.
 *
 * When Athena stores query results in Amazon S3, the canned ACL is set with the `x-amz-acl` request
 * header. For more information about S3 Object Ownership, see
 * [Object Ownership settings](https://docs.aws.amazon.com/AmazonS3/latest/userguide/about-object-ownership.html#object-ownership-overview)
 * in the *Amazon S3 User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.athena.*;
 * AclConfigurationProperty aclConfigurationProperty = AclConfigurationProperty.builder()
 * .s3AclOption("s3AclOption")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-aclconfiguration.html)
 */
@CdkDslMarker
public class CfnWorkGroupAclConfigurationPropertyDsl {
    private val cdkBuilder: CfnWorkGroup.AclConfigurationProperty.Builder =
        CfnWorkGroup.AclConfigurationProperty.builder()

    /**
     * @param s3AclOption The Amazon S3 canned ACL that Athena should specify when storing query
     *   results. Currently the only supported canned ACL is `BUCKET_OWNER_FULL_CONTROL` . If a
     *   query runs in a workgroup and the workgroup overrides client-side settings, then the Amazon
     *   S3 canned ACL specified in the workgroup's settings is used for all queries that run in the
     *   workgroup. For more information about Amazon S3 canned ACLs, see
     *   [Canned ACL](https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl)
     *   in the *Amazon S3 User Guide* .
     */
    public fun s3AclOption(s3AclOption: String) {
        cdkBuilder.s3AclOption(s3AclOption)
    }

    public fun build(): CfnWorkGroup.AclConfigurationProperty = cdkBuilder.build()
}
