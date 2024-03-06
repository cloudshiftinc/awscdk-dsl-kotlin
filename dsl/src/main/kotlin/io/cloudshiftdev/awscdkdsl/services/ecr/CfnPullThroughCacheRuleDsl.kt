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

package io.cloudshiftdev.awscdkdsl.services.ecr

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecr.CfnPullThroughCacheRule
import software.constructs.Construct

/**
 * The `AWS::ECR::PullThroughCacheRule` resource creates or updates a pull through cache rule.
 *
 * A pull through cache rule provides a way to cache images from an upstream registry in your Amazon
 * ECR private registry.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecr.*;
 * CfnPullThroughCacheRule cfnPullThroughCacheRule = CfnPullThroughCacheRule.Builder.create(this,
 * "MyCfnPullThroughCacheRule")
 * .credentialArn("credentialArn")
 * .ecrRepositoryPrefix("ecrRepositoryPrefix")
 * .upstreamRegistry("upstreamRegistry")
 * .upstreamRegistryUrl("upstreamRegistryUrl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html)
 */
@CdkDslMarker
public class CfnPullThroughCacheRuleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPullThroughCacheRule.Builder =
        CfnPullThroughCacheRule.Builder.create(scope, id)

    /**
     * The ARN of the Secrets Manager secret associated with the pull through cache rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html#cfn-ecr-pullthroughcacherule-credentialarn)
     *
     * @param credentialArn The ARN of the Secrets Manager secret associated with the pull through
     *   cache rule.
     */
    public fun credentialArn(credentialArn: String) {
        cdkBuilder.credentialArn(credentialArn)
    }

    /**
     * The Amazon ECR repository prefix associated with the pull through cache rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html#cfn-ecr-pullthroughcacherule-ecrrepositoryprefix)
     *
     * @param ecrRepositoryPrefix The Amazon ECR repository prefix associated with the pull through
     *   cache rule.
     */
    public fun ecrRepositoryPrefix(ecrRepositoryPrefix: String) {
        cdkBuilder.ecrRepositoryPrefix(ecrRepositoryPrefix)
    }

    /**
     * The name of the upstream source registry associated with the pull through cache rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html#cfn-ecr-pullthroughcacherule-upstreamregistry)
     *
     * @param upstreamRegistry The name of the upstream source registry associated with the pull
     *   through cache rule.
     */
    public fun upstreamRegistry(upstreamRegistry: String) {
        cdkBuilder.upstreamRegistry(upstreamRegistry)
    }

    /**
     * The upstream registry URL associated with the pull through cache rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html#cfn-ecr-pullthroughcacherule-upstreamregistryurl)
     *
     * @param upstreamRegistryUrl The upstream registry URL associated with the pull through cache
     *   rule.
     */
    public fun upstreamRegistryUrl(upstreamRegistryUrl: String) {
        cdkBuilder.upstreamRegistryUrl(upstreamRegistryUrl)
    }

    public fun build(): CfnPullThroughCacheRule = cdkBuilder.build()
}
