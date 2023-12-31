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

package io.cloudshiftdev.awscdkdsl.services.codestar

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codestar.CfnGitHubRepository
import software.amazon.awscdk.services.codestar.CfnGitHubRepositoryProps

/**
 * Properties for defining a `CfnGitHubRepository`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codestar.*;
 * CfnGitHubRepositoryProps cfnGitHubRepositoryProps = CfnGitHubRepositoryProps.builder()
 * .repositoryName("repositoryName")
 * .repositoryOwner("repositoryOwner")
 * // the properties below are optional
 * .code(CodeProperty.builder()
 * .s3(S3Property.builder()
 * .bucket("bucket")
 * .key("key")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * .build())
 * .connectionArn("connectionArn")
 * .enableIssues(false)
 * .isPrivate(false)
 * .repositoryAccessToken("repositoryAccessToken")
 * .repositoryDescription("repositoryDescription")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestar-githubrepository.html)
 */
@CdkDslMarker
public class CfnGitHubRepositoryPropsDsl {
    private val cdkBuilder: CfnGitHubRepositoryProps.Builder = CfnGitHubRepositoryProps.builder()

    /**
     * @param code Information about code to be committed to a repository after it is created in an
     *   AWS CloudFormation stack.
     */
    public fun code(code: IResolvable) {
        cdkBuilder.code(code)
    }

    /**
     * @param code Information about code to be committed to a repository after it is created in an
     *   AWS CloudFormation stack.
     */
    public fun code(code: CfnGitHubRepository.CodeProperty) {
        cdkBuilder.code(code)
    }

    /** @param connectionArn the value to be set. */
    public fun connectionArn(connectionArn: String) {
        cdkBuilder.connectionArn(connectionArn)
    }

    /**
     * @param enableIssues Indicates whether to enable issues for the GitHub repository. You can use
     *   GitHub issues to track information and bugs for your repository.
     */
    public fun enableIssues(enableIssues: Boolean) {
        cdkBuilder.enableIssues(enableIssues)
    }

    /**
     * @param enableIssues Indicates whether to enable issues for the GitHub repository. You can use
     *   GitHub issues to track information and bugs for your repository.
     */
    public fun enableIssues(enableIssues: IResolvable) {
        cdkBuilder.enableIssues(enableIssues)
    }

    /**
     * @param isPrivate Indicates whether the GitHub repository is a private repository. If so, you
     *   choose who can see and commit to this repository.
     */
    public fun isPrivate(isPrivate: Boolean) {
        cdkBuilder.isPrivate(isPrivate)
    }

    /**
     * @param isPrivate Indicates whether the GitHub repository is a private repository. If so, you
     *   choose who can see and commit to this repository.
     */
    public fun isPrivate(isPrivate: IResolvable) {
        cdkBuilder.isPrivate(isPrivate)
    }

    /**
     * @param repositoryAccessToken The GitHub user's personal access token for the GitHub
     *   repository.
     */
    public fun repositoryAccessToken(repositoryAccessToken: String) {
        cdkBuilder.repositoryAccessToken(repositoryAccessToken)
    }

    /**
     * @param repositoryDescription A comment or description about the new repository. This
     *   description is displayed in GitHub after the repository is created.
     */
    public fun repositoryDescription(repositoryDescription: String) {
        cdkBuilder.repositoryDescription(repositoryDescription)
    }

    /**
     * @param repositoryName The name of the repository you want to create in GitHub with AWS
     *   CloudFormation stack creation.
     */
    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    /**
     * @param repositoryOwner The GitHub user name for the owner of the GitHub repository to be
     *   created. If this repository should be owned by a GitHub organization, provide its name.
     */
    public fun repositoryOwner(repositoryOwner: String) {
        cdkBuilder.repositoryOwner(repositoryOwner)
    }

    public fun build(): CfnGitHubRepositoryProps = cdkBuilder.build()
}
