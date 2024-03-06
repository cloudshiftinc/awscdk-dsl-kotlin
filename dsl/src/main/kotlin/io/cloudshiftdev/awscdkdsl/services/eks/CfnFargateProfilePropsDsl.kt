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

package io.cloudshiftdev.awscdkdsl.services.eks

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnFargateProfileProps

/**
 * Properties for defining a `CfnFargateProfile`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * CfnFargateProfileProps cfnFargateProfileProps = CfnFargateProfileProps.builder()
 * .clusterName("clusterName")
 * .podExecutionRoleArn("podExecutionRoleArn")
 * .selectors(List.of(SelectorProperty.builder()
 * .namespace("namespace")
 * // the properties below are optional
 * .labels(List.of(LabelProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * // the properties below are optional
 * .fargateProfileName("fargateProfileName")
 * .subnets(List.of("subnets"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html)
 */
@CdkDslMarker
public class CfnFargateProfilePropsDsl {
    private val cdkBuilder: CfnFargateProfileProps.Builder = CfnFargateProfileProps.builder()

    private val _selectors: MutableList<Any> = mutableListOf()

    private val _subnets: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param clusterName The name of your cluster. */
    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    /** @param fargateProfileName The name of the Fargate profile. */
    public fun fargateProfileName(fargateProfileName: String) {
        cdkBuilder.fargateProfileName(fargateProfileName)
    }

    /**
     * @param podExecutionRoleArn The Amazon Resource Name (ARN) of the `Pod` execution role to use
     *   for a `Pod` that matches the selectors in the Fargate profile. The `Pod` execution role
     *   allows Fargate infrastructure to register with your cluster as a node, and it provides read
     *   access to Amazon ECR image repositories. For more information, see
     *   [`Pod` execution role](https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html)
     *   in the *Amazon EKS User Guide* .
     */
    public fun podExecutionRoleArn(podExecutionRoleArn: String) {
        cdkBuilder.podExecutionRoleArn(podExecutionRoleArn)
    }

    /**
     * @param selectors The selectors to match for a `Pod` to use this Fargate profile. Each
     *   selector must have an associated Kubernetes `namespace` . Optionally, you can also specify
     *   `labels` for a `namespace` . You may specify up to five selectors in a Fargate profile.
     */
    public fun selectors(vararg selectors: Any) {
        _selectors.addAll(listOf(*selectors))
    }

    /**
     * @param selectors The selectors to match for a `Pod` to use this Fargate profile. Each
     *   selector must have an associated Kubernetes `namespace` . Optionally, you can also specify
     *   `labels` for a `namespace` . You may specify up to five selectors in a Fargate profile.
     */
    public fun selectors(selectors: Collection<Any>) {
        _selectors.addAll(selectors)
    }

    /**
     * @param selectors The selectors to match for a `Pod` to use this Fargate profile. Each
     *   selector must have an associated Kubernetes `namespace` . Optionally, you can also specify
     *   `labels` for a `namespace` . You may specify up to five selectors in a Fargate profile.
     */
    public fun selectors(selectors: IResolvable) {
        cdkBuilder.selectors(selectors)
    }

    /**
     * @param subnets The IDs of subnets to launch a `Pod` into. A `Pod` running on Fargate isn't
     *   assigned a public IP address, so only private subnets (with no direct route to an Internet
     *   Gateway) are accepted for this parameter.
     */
    public fun subnets(vararg subnets: String) {
        _subnets.addAll(listOf(*subnets))
    }

    /**
     * @param subnets The IDs of subnets to launch a `Pod` into. A `Pod` running on Fargate isn't
     *   assigned a public IP address, so only private subnets (with no direct route to an Internet
     *   Gateway) are accepted for this parameter.
     */
    public fun subnets(subnets: Collection<String>) {
        _subnets.addAll(subnets)
    }

    /**
     * @param tags Metadata that assists with categorization and organization. Each tag consists of
     *   a key and an optional value. You define both. Tags don't propagate to any other cluster or
     *   AWS resources.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Metadata that assists with categorization and organization. Each tag consists of
     *   a key and an optional value. You define both. Tags don't propagate to any other cluster or
     *   AWS resources.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnFargateProfileProps {
        if (_selectors.isNotEmpty()) cdkBuilder.selectors(_selectors)
        if (_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
