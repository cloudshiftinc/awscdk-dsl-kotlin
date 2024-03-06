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

package io.cloudshiftdev.awscdkdsl.services.shield

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.shield.CfnDRTAccessProps

/**
 * Properties for defining a `CfnDRTAccess`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.shield.*;
 * CfnDRTAccessProps cfnDRTAccessProps = CfnDRTAccessProps.builder()
 * .roleArn("roleArn")
 * // the properties below are optional
 * .logBucketList(List.of("logBucketList"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-drtaccess.html)
 */
@CdkDslMarker
public class CfnDRTAccessPropsDsl {
    private val cdkBuilder: CfnDRTAccessProps.Builder = CfnDRTAccessProps.builder()

    private val _logBucketList: MutableList<String> = mutableListOf()

    /**
     * @param logBucketList Authorizes the Shield Response Team (SRT) to access the specified Amazon
     *   S3 bucket containing log data such as Application Load Balancer access logs, CloudFront
     *   logs, or logs from third party sources. You can associate up to 10 Amazon S3 buckets with
     *   your subscription.
     *
     * Use this to share information with the SRT that's not available in AWS WAF logs.
     *
     * To use the services of the SRT, you must be subscribed to the
     * [Business Support plan](https://docs.aws.amazon.com/premiumsupport/business-support/) or the
     * [Enterprise Support plan](https://docs.aws.amazon.com/premiumsupport/enterprise-support/) .
     */
    public fun logBucketList(vararg logBucketList: String) {
        _logBucketList.addAll(listOf(*logBucketList))
    }

    /**
     * @param logBucketList Authorizes the Shield Response Team (SRT) to access the specified Amazon
     *   S3 bucket containing log data such as Application Load Balancer access logs, CloudFront
     *   logs, or logs from third party sources. You can associate up to 10 Amazon S3 buckets with
     *   your subscription.
     *
     * Use this to share information with the SRT that's not available in AWS WAF logs.
     *
     * To use the services of the SRT, you must be subscribed to the
     * [Business Support plan](https://docs.aws.amazon.com/premiumsupport/business-support/) or the
     * [Enterprise Support plan](https://docs.aws.amazon.com/premiumsupport/enterprise-support/) .
     */
    public fun logBucketList(logBucketList: Collection<String>) {
        _logBucketList.addAll(logBucketList)
    }

    /**
     * @param roleArn Authorizes the Shield Response Team (SRT) using the specified role, to access
     *   your AWS account to assist with DDoS attack mitigation during potential attacks. This
     *   enables the SRT to inspect your AWS WAF configuration and logs and to create or update AWS
     *   WAF rules and web ACLs.
     *
     * You can associate only one `RoleArn` with your subscription. If you submit this update for an
     * account that already has an associated role, the new `RoleArn` will replace the existing
     * `RoleArn` .
     *
     * This change requires the following:
     * * You must be subscribed to the
     *   [Business Support plan](https://docs.aws.amazon.com/premiumsupport/business-support/) or
     *   the
     *   [Enterprise Support plan](https://docs.aws.amazon.com/premiumsupport/enterprise-support/) .
     * * You must have the `iam:PassRole` permission. For more information, see
     *   [Granting a user permissions to pass a role to an AWS service](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html)
     *   .
     * * The `AWSShieldDRTAccessPolicy` managed policy must be attached to the role that you specify
     *   in the request. You can access this policy in the IAM console at
     *   [AWSShieldDRTAccessPolicy](https://docs.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSShieldDRTAccessPolicy)
     *   . For information, see
     *   [Adding and removing IAM identity permissions](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage-attach-detach.html)
     *   .
     * * The role must trust the service principal `drt.shield.amazonaws.com` . For information, see
     *   [IAM JSON policy elements: Principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html)
     *   .
     *
     * The SRT will have access only to your AWS WAF and Shield resources. By submitting this
     * request, you provide permissions to the SRT to inspect your AWS WAF and Shield configuration
     * and logs, and to create and update AWS WAF rules and web ACLs on your behalf. The SRT takes
     * these actions only if explicitly authorized by you.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun build(): CfnDRTAccessProps {
        if (_logBucketList.isNotEmpty()) cdkBuilder.logBucketList(_logBucketList)
        return cdkBuilder.build()
    }
}
