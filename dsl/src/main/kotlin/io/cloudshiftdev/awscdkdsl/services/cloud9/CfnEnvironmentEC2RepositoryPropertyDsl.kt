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

package io.cloudshiftdev.awscdkdsl.services.cloud9

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloud9.CfnEnvironmentEC2

/**
 * The `Repository` property type specifies an AWS CodeCommit source code repository to be cloned
 * into an AWS Cloud9 development environment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloud9.*;
 * RepositoryProperty repositoryProperty = RepositoryProperty.builder()
 * .pathComponent("pathComponent")
 * .repositoryUrl("repositoryUrl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html)
 */
@CdkDslMarker
public class CfnEnvironmentEC2RepositoryPropertyDsl {
    private val cdkBuilder: CfnEnvironmentEC2.RepositoryProperty.Builder =
        CfnEnvironmentEC2.RepositoryProperty.builder()

    /**
     * @param pathComponent The path within the development environment's default file system
     *   location to clone the AWS CodeCommit repository into. For example, `/REPOSITORY_NAME` would
     *   clone the repository into the `/home/USER_NAME/environment/REPOSITORY_NAME` directory in
     *   the environment.
     */
    public fun pathComponent(pathComponent: String) {
        cdkBuilder.pathComponent(pathComponent)
    }

    /**
     * @param repositoryUrl The clone URL of the AWS CodeCommit repository to be cloned. For
     *   example, for an AWS CodeCommit repository this might be
     *   `https://git-codecommit.us-east-2.amazonaws.com/v1/repos/REPOSITORY_NAME` .
     */
    public fun repositoryUrl(repositoryUrl: String) {
        cdkBuilder.repositoryUrl(repositoryUrl)
    }

    public fun build(): CfnEnvironmentEC2.RepositoryProperty = cdkBuilder.build()
}
