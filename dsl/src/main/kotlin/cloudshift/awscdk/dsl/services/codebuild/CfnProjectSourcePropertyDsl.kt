@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnProject
import kotlin.Boolean
import kotlin.Number
import kotlin.String

/**
 * `Source` is a property of the
 * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
 * resource that specifies the source code settings for the project, such as the source code's
 * repository type and location.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * SourceProperty sourceProperty = SourceProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .auth(SourceAuthProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .resource("resource")
 * .build())
 * .buildSpec("buildSpec")
 * .buildStatusConfig(BuildStatusConfigProperty.builder()
 * .context("context")
 * .targetUrl("targetUrl")
 * .build())
 * .gitCloneDepth(123)
 * .gitSubmodulesConfig(GitSubmodulesConfigProperty.builder()
 * .fetchSubmodules(false)
 * .build())
 * .insecureSsl(false)
 * .location("location")
 * .reportBuildStatus(false)
 * .sourceIdentifier("sourceIdentifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html)
 */
@CdkDslMarker
public class CfnProjectSourcePropertyDsl {
    private val cdkBuilder: CfnProject.SourceProperty.Builder = CfnProject.SourceProperty.builder()

    /**
     * @param auth Information about the authorization settings for AWS CodeBuild to access the source
     * code to be built.
     * This information is for the AWS CodeBuild console's use only. Your code should not get or set
     * `Auth` directly.
     */
    public fun auth(auth: IResolvable) {
        cdkBuilder.auth(auth)
    }

    /**
     * @param auth Information about the authorization settings for AWS CodeBuild to access the source
     * code to be built.
     * This information is for the AWS CodeBuild console's use only. Your code should not get or set
     * `Auth` directly.
     */
    public fun auth(auth: CfnProject.SourceAuthProperty) {
        cdkBuilder.auth(auth)
    }

    /**
     * @param buildSpec The build specification for the project.
     * If this value is not provided, then the source code must contain a buildspec file named
     * `buildspec.yml` at the root level. If this value is provided, it can be either a single string
     * containing the entire build specification, or the path to an alternate buildspec file relative to
     * the value of the built-in environment variable `CODEBUILD_SRC_DIR` . The alternate buildspec file
     * can have a name other than `buildspec.yml` , for example `myspec.yml` or `build_spec_qa.yml` or
     * similar. For more information, see the [Build Spec
   * Reference](https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-example)
     * in the *AWS CodeBuild User Guide* .
     */
    public fun buildSpec(buildSpec: String) {
        cdkBuilder.buildSpec(buildSpec)
    }

    /**
     * @param buildStatusConfig Contains information that defines how the build project reports the
     * build status to the source provider.
     * This option is only used when the source provider is `GITHUB` , `GITHUB_ENTERPRISE` , or
     * `BITBUCKET` .
     */
    public fun buildStatusConfig(buildStatusConfig: IResolvable) {
        cdkBuilder.buildStatusConfig(buildStatusConfig)
    }

    /**
     * @param buildStatusConfig Contains information that defines how the build project reports the
     * build status to the source provider.
     * This option is only used when the source provider is `GITHUB` , `GITHUB_ENTERPRISE` , or
     * `BITBUCKET` .
     */
    public fun buildStatusConfig(buildStatusConfig: CfnProject.BuildStatusConfigProperty) {
        cdkBuilder.buildStatusConfig(buildStatusConfig)
    }

    /**
     * @param gitCloneDepth The depth of history to download.
     * Minimum value is 0. If this value is 0, greater than 25, or not provided, then the full history
     * is downloaded with each build project. If your source type is Amazon S3, this value is not
     * supported.
     */
    public fun gitCloneDepth(gitCloneDepth: Number) {
        cdkBuilder.gitCloneDepth(gitCloneDepth)
    }

    /**
     * @param gitSubmodulesConfig Information about the Git submodules configuration for the build
     * project.
     */
    public fun gitSubmodulesConfig(gitSubmodulesConfig: IResolvable) {
        cdkBuilder.gitSubmodulesConfig(gitSubmodulesConfig)
    }

    /**
     * @param gitSubmodulesConfig Information about the Git submodules configuration for the build
     * project.
     */
    public fun gitSubmodulesConfig(gitSubmodulesConfig: CfnProject.GitSubmodulesConfigProperty) {
        cdkBuilder.gitSubmodulesConfig(gitSubmodulesConfig)
    }

    /**
     * @param insecureSsl This is used with GitHub Enterprise only.
     * Set to true to ignore SSL warnings while connecting to your GitHub Enterprise project
     * repository. The default value is `false` . `InsecureSsl` should be used for testing purposes only.
     * It should not be used in a production environment.
     */
    public fun insecureSsl(insecureSsl: Boolean) {
        cdkBuilder.insecureSsl(insecureSsl)
    }

    /**
     * @param insecureSsl This is used with GitHub Enterprise only.
     * Set to true to ignore SSL warnings while connecting to your GitHub Enterprise project
     * repository. The default value is `false` . `InsecureSsl` should be used for testing purposes only.
     * It should not be used in a production environment.
     */
    public fun insecureSsl(insecureSsl: IResolvable) {
        cdkBuilder.insecureSsl(insecureSsl)
    }

    /**
     * @param location Information about the location of the source code to be built. Valid values
     * include:.
     * * For source code settings that are specified in the source action of a pipeline in
     * CodePipeline, `location` should not be specified. If it is specified, CodePipeline ignores it.
     * This is because CodePipeline uses the settings in a pipeline's source action instead of this
     * value.
     * * For source code in an CodeCommit repository, the HTTPS clone URL to the repository that
     * contains the source code and the buildspec file (for example,
     * `https://git-codecommit.&lt;region-ID&gt;.amazonaws.com/v1/repos/&lt;repo-name&gt;` ).
     * * For source code in an Amazon S3 input bucket, one of the following.
     * * The path to the ZIP file that contains the source code (for example,
     * `&lt;bucket-name&gt;/&lt;path&gt;/&lt;object-name&gt;.zip` ).
     * * The path to the folder that contains the source code (for example,
     * `&lt;bucket-name&gt;/&lt;path-to-source-code&gt;/&lt;folder&gt;/` ).
     * * For source code in a GitHub repository, the HTTPS clone URL to the repository that contains
     * the source and the buildspec file. You must connect your AWS account to your GitHub account. Use
     * the AWS CodeBuild console to start creating a build project. When you use the console to connect
     * (or reconnect) with GitHub, on the GitHub *Authorize application* page, for *Organization access*
     * , choose *Request access* next to each repository you want to allow AWS CodeBuild to have access
     * to, and then choose *Authorize application* . (After you have connected to your GitHub account,
     * you do not need to finish creating the build project. You can leave the AWS CodeBuild console.) To
     * instruct AWS CodeBuild to use this connection, in the `source` object, set the `auth` object's
     * `type` value to `OAUTH` .
     * * For source code in a Bitbucket repository, the HTTPS clone URL to the repository that
     * contains the source and the buildspec file. You must connect your AWS account to your Bitbucket
     * account. Use the AWS CodeBuild console to start creating a build project. When you use the console
     * to connect (or reconnect) with Bitbucket, on the Bitbucket *Confirm access to your account* page,
     * choose *Grant access* . (After you have connected to your Bitbucket account, you do not need to
     * finish creating the build project. You can leave the AWS CodeBuild console.) To instruct AWS
     * CodeBuild to use this connection, in the `source` object, set the `auth` object's `type` value to
     * `OAUTH` .
     *
     * If you specify `CODEPIPELINE` for the `Type` property, don't specify this property. For all of
     * the other types, you must specify `Location` .
     */
    public fun location(location: String) {
        cdkBuilder.location(location)
    }

    /**
     * @param reportBuildStatus Set to true to report the status of a build's start and finish to your
     * source provider.
     * This option is valid only when your source provider is GitHub, GitHub Enterprise, or Bitbucket.
     * If this is set and you use a different source provider, an `invalidInputException` is thrown.
     */
    public fun reportBuildStatus(reportBuildStatus: Boolean) {
        cdkBuilder.reportBuildStatus(reportBuildStatus)
    }

    /**
     * @param reportBuildStatus Set to true to report the status of a build's start and finish to your
     * source provider.
     * This option is valid only when your source provider is GitHub, GitHub Enterprise, or Bitbucket.
     * If this is set and you use a different source provider, an `invalidInputException` is thrown.
     */
    public fun reportBuildStatus(reportBuildStatus: IResolvable) {
        cdkBuilder.reportBuildStatus(reportBuildStatus)
    }

    /**
     * @param sourceIdentifier An identifier for this project source.
     * The identifier can only contain alphanumeric characters and underscores, and must be less than
     * 128 characters in length.
     */
    public fun sourceIdentifier(sourceIdentifier: String) {
        cdkBuilder.sourceIdentifier(sourceIdentifier)
    }

    /**
     * @param type The type of repository that contains the source code to be built. Valid values
     * include:.
     * * `BITBUCKET` : The source code is in a Bitbucket repository.
     * * `CODECOMMIT` : The source code is in an CodeCommit repository.
     * * `CODEPIPELINE` : The source code settings are specified in the source action of a pipeline in
     * CodePipeline.
     * * `GITHUB` : The source code is in a GitHub or GitHub Enterprise Cloud repository.
     * * `GITHUB_ENTERPRISE` : The source code is in a GitHub Enterprise Server repository.
     * * `NO_SOURCE` : The project does not have input source code.
     * * `S3` : The source code is in an Amazon S3 bucket.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnProject.SourceProperty = cdkBuilder.build()
}
