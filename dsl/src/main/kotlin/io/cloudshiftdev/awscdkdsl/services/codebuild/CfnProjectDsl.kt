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

package io.cloudshiftdev.awscdkdsl.services.codebuild

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnProject
import software.constructs.Construct

/**
 * The `AWS::CodeBuild::Project` resource configures how AWS CodeBuild builds your source code.
 *
 * For example, it tells CodeBuild where to get the source code and which build environment to use.
 *
 * To unset or remove a project value via CFN, explicitly provide the attribute with value as empty
 * input.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * CfnProject cfnProject = CfnProject.Builder.create(this, "MyCfnProject")
 * .artifacts(ArtifactsProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .artifactIdentifier("artifactIdentifier")
 * .encryptionDisabled(false)
 * .location("location")
 * .name("name")
 * .namespaceType("namespaceType")
 * .overrideArtifactName(false)
 * .packaging("packaging")
 * .path("path")
 * .build())
 * .environment(EnvironmentProperty.builder()
 * .computeType("computeType")
 * .image("image")
 * .type("type")
 * // the properties below are optional
 * .certificate("certificate")
 * .environmentVariables(List.of(EnvironmentVariableProperty.builder()
 * .name("name")
 * .value("value")
 * // the properties below are optional
 * .type("type")
 * .build()))
 * .imagePullCredentialsType("imagePullCredentialsType")
 * .privilegedMode(false)
 * .registryCredential(RegistryCredentialProperty.builder()
 * .credential("credential")
 * .credentialProvider("credentialProvider")
 * .build())
 * .build())
 * .serviceRole("serviceRole")
 * .source(SourceProperty.builder()
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
 * .build())
 * // the properties below are optional
 * .badgeEnabled(false)
 * .buildBatchConfig(ProjectBuildBatchConfigProperty.builder()
 * .batchReportMode("batchReportMode")
 * .combineArtifacts(false)
 * .restrictions(BatchRestrictionsProperty.builder()
 * .computeTypesAllowed(List.of("computeTypesAllowed"))
 * .maximumBuildsAllowed(123)
 * .build())
 * .serviceRole("serviceRole")
 * .timeoutInMins(123)
 * .build())
 * .cache(ProjectCacheProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .location("location")
 * .modes(List.of("modes"))
 * .build())
 * .concurrentBuildLimit(123)
 * .description("description")
 * .encryptionKey("encryptionKey")
 * .fileSystemLocations(List.of(ProjectFileSystemLocationProperty.builder()
 * .identifier("identifier")
 * .location("location")
 * .mountPoint("mountPoint")
 * .type("type")
 * // the properties below are optional
 * .mountOptions("mountOptions")
 * .build()))
 * .logsConfig(LogsConfigProperty.builder()
 * .cloudWatchLogs(CloudWatchLogsConfigProperty.builder()
 * .status("status")
 * // the properties below are optional
 * .groupName("groupName")
 * .streamName("streamName")
 * .build())
 * .s3Logs(S3LogsConfigProperty.builder()
 * .status("status")
 * // the properties below are optional
 * .encryptionDisabled(false)
 * .location("location")
 * .build())
 * .build())
 * .name("name")
 * .queuedTimeoutInMinutes(123)
 * .resourceAccessRole("resourceAccessRole")
 * .secondaryArtifacts(List.of(ArtifactsProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .artifactIdentifier("artifactIdentifier")
 * .encryptionDisabled(false)
 * .location("location")
 * .name("name")
 * .namespaceType("namespaceType")
 * .overrideArtifactName(false)
 * .packaging("packaging")
 * .path("path")
 * .build()))
 * .secondarySources(List.of(SourceProperty.builder()
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
 * .build()))
 * .secondarySourceVersions(List.of(ProjectSourceVersionProperty.builder()
 * .sourceIdentifier("sourceIdentifier")
 * // the properties below are optional
 * .sourceVersion("sourceVersion")
 * .build()))
 * .sourceVersion("sourceVersion")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .timeoutInMinutes(123)
 * .triggers(ProjectTriggersProperty.builder()
 * .buildType("buildType")
 * .filterGroups(List.of(List.of(WebhookFilterProperty.builder()
 * .pattern("pattern")
 * .type("type")
 * // the properties below are optional
 * .excludeMatchedPattern(false)
 * .build())))
 * .webhook(false)
 * .build())
 * .visibility("visibility")
 * .vpcConfig(VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnets(List.of("subnets"))
 * .vpcId("vpcId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
 */
@CdkDslMarker
public class CfnProjectDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnProject.Builder = CfnProject.Builder.create(scope, id)

    private val _fileSystemLocations: MutableList<Any> = mutableListOf()

    private val _secondaryArtifacts: MutableList<Any> = mutableListOf()

    private val _secondarySourceVersions: MutableList<Any> = mutableListOf()

    private val _secondarySources: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * `Artifacts` is a property of the
     * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
     * resource that specifies output settings for artifacts generated by an AWS CodeBuild build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-artifacts)
     *
     * @param artifacts `Artifacts` is a property of the
     *   [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
     *   resource that specifies output settings for artifacts generated by an AWS CodeBuild build.
     */
    public fun artifacts(artifacts: IResolvable) {
        cdkBuilder.artifacts(artifacts)
    }

    /**
     * `Artifacts` is a property of the
     * [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
     * resource that specifies output settings for artifacts generated by an AWS CodeBuild build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-artifacts)
     *
     * @param artifacts `Artifacts` is a property of the
     *   [AWS::CodeBuild::Project](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html)
     *   resource that specifies output settings for artifacts generated by an AWS CodeBuild build.
     */
    public fun artifacts(artifacts: CfnProject.ArtifactsProperty) {
        cdkBuilder.artifacts(artifacts)
    }

    /**
     * Indicates whether AWS CodeBuild generates a publicly accessible URL for your project's build
     * badge.
     *
     * For more information, see
     * [Build Badges Sample](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-badges.html)
     * in the *AWS CodeBuild User Guide* .
     *
     * Including build badges with your project is currently not supported if the source type is
     * CodePipeline. If you specify `CODEPIPELINE` for the `Source` property, do not specify the
     * `BadgeEnabled` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-badgeenabled)
     *
     * @param badgeEnabled Indicates whether AWS CodeBuild generates a publicly accessible URL for
     *   your project's build badge.
     */
    public fun badgeEnabled(badgeEnabled: Boolean) {
        cdkBuilder.badgeEnabled(badgeEnabled)
    }

    /**
     * Indicates whether AWS CodeBuild generates a publicly accessible URL for your project's build
     * badge.
     *
     * For more information, see
     * [Build Badges Sample](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-badges.html)
     * in the *AWS CodeBuild User Guide* .
     *
     * Including build badges with your project is currently not supported if the source type is
     * CodePipeline. If you specify `CODEPIPELINE` for the `Source` property, do not specify the
     * `BadgeEnabled` property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-badgeenabled)
     *
     * @param badgeEnabled Indicates whether AWS CodeBuild generates a publicly accessible URL for
     *   your project's build badge.
     */
    public fun badgeEnabled(badgeEnabled: IResolvable) {
        cdkBuilder.badgeEnabled(badgeEnabled)
    }

    /**
     * A `ProjectBuildBatchConfig` object that defines the batch build options for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-buildbatchconfig)
     *
     * @param buildBatchConfig A `ProjectBuildBatchConfig` object that defines the batch build
     *   options for the project.
     */
    public fun buildBatchConfig(buildBatchConfig: IResolvable) {
        cdkBuilder.buildBatchConfig(buildBatchConfig)
    }

    /**
     * A `ProjectBuildBatchConfig` object that defines the batch build options for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-buildbatchconfig)
     *
     * @param buildBatchConfig A `ProjectBuildBatchConfig` object that defines the batch build
     *   options for the project.
     */
    public fun buildBatchConfig(buildBatchConfig: CfnProject.ProjectBuildBatchConfigProperty) {
        cdkBuilder.buildBatchConfig(buildBatchConfig)
    }

    /**
     * Settings that AWS CodeBuild uses to store and reuse build dependencies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-cache)
     *
     * @param cache Settings that AWS CodeBuild uses to store and reuse build dependencies.
     */
    public fun cache(cache: IResolvable) {
        cdkBuilder.cache(cache)
    }

    /**
     * Settings that AWS CodeBuild uses to store and reuse build dependencies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-cache)
     *
     * @param cache Settings that AWS CodeBuild uses to store and reuse build dependencies.
     */
    public fun cache(cache: CfnProject.ProjectCacheProperty) {
        cdkBuilder.cache(cache)
    }

    /**
     * The maximum number of concurrent builds that are allowed for this project.
     *
     * New builds are only started if the current number of builds is less than or equal to this
     * limit. If the current build count meets this limit, new builds are throttled and are not run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-concurrentbuildlimit)
     *
     * @param concurrentBuildLimit The maximum number of concurrent builds that are allowed for this
     *   project.
     */
    public fun concurrentBuildLimit(concurrentBuildLimit: Number) {
        cdkBuilder.concurrentBuildLimit(concurrentBuildLimit)
    }

    /**
     * A description that makes the build project easy to identify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-description)
     *
     * @param description A description that makes the build project easy to identify.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The AWS Key Management Service customer master key (CMK) to be used for encrypting the build
     * output artifacts.
     *
     * You can use a cross-account KMS key to encrypt the build output artifacts if your service
     * role has permission to that key.
     *
     * You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's
     * alias (using the format `alias/&lt;alias-name&gt;` ). If you don't specify a value, CodeBuild
     * uses the managed CMK for Amazon Simple Storage Service (Amazon S3).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-encryptionkey)
     *
     * @param encryptionKey The AWS Key Management Service customer master key (CMK) to be used for
     *   encrypting the build output artifacts.
     */
    public fun encryptionKey(encryptionKey: String) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * The build environment settings for the project, such as the environment type or the
     * environment variables to use for the build environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-environment)
     *
     * @param environment The build environment settings for the project, such as the environment
     *   type or the environment variables to use for the build environment.
     */
    public fun environment(environment: IResolvable) {
        cdkBuilder.environment(environment)
    }

    /**
     * The build environment settings for the project, such as the environment type or the
     * environment variables to use for the build environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-environment)
     *
     * @param environment The build environment settings for the project, such as the environment
     *   type or the environment variables to use for the build environment.
     */
    public fun environment(environment: CfnProject.EnvironmentProperty) {
        cdkBuilder.environment(environment)
    }

    /**
     * An array of `ProjectFileSystemLocation` objects for a CodeBuild build project.
     *
     * A `ProjectFileSystemLocation` object specifies the `identifier` , `location` , `mountOptions`
     * , `mountPoint` , and `type` of a file system created using Amazon Elastic File System.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-filesystemlocations)
     *
     * @param fileSystemLocations An array of `ProjectFileSystemLocation` objects for a CodeBuild
     *   build project.
     */
    public fun fileSystemLocations(vararg fileSystemLocations: Any) {
        _fileSystemLocations.addAll(listOf(*fileSystemLocations))
    }

    /**
     * An array of `ProjectFileSystemLocation` objects for a CodeBuild build project.
     *
     * A `ProjectFileSystemLocation` object specifies the `identifier` , `location` , `mountOptions`
     * , `mountPoint` , and `type` of a file system created using Amazon Elastic File System.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-filesystemlocations)
     *
     * @param fileSystemLocations An array of `ProjectFileSystemLocation` objects for a CodeBuild
     *   build project.
     */
    public fun fileSystemLocations(fileSystemLocations: Collection<Any>) {
        _fileSystemLocations.addAll(fileSystemLocations)
    }

    /**
     * An array of `ProjectFileSystemLocation` objects for a CodeBuild build project.
     *
     * A `ProjectFileSystemLocation` object specifies the `identifier` , `location` , `mountOptions`
     * , `mountPoint` , and `type` of a file system created using Amazon Elastic File System.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-filesystemlocations)
     *
     * @param fileSystemLocations An array of `ProjectFileSystemLocation` objects for a CodeBuild
     *   build project.
     */
    public fun fileSystemLocations(fileSystemLocations: IResolvable) {
        cdkBuilder.fileSystemLocations(fileSystemLocations)
    }

    /**
     * Information about logs for the build project.
     *
     * A project can create logs in CloudWatch Logs, an S3 bucket, or both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-logsconfig)
     *
     * @param logsConfig Information about logs for the build project.
     */
    public fun logsConfig(logsConfig: IResolvable) {
        cdkBuilder.logsConfig(logsConfig)
    }

    /**
     * Information about logs for the build project.
     *
     * A project can create logs in CloudWatch Logs, an S3 bucket, or both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-logsconfig)
     *
     * @param logsConfig Information about logs for the build project.
     */
    public fun logsConfig(logsConfig: CfnProject.LogsConfigProperty) {
        cdkBuilder.logsConfig(logsConfig)
    }

    /**
     * The name of the build project.
     *
     * The name must be unique across all of the projects in your AWS account .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-name)
     *
     * @param name The name of the build project.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The number of minutes a build is allowed to be queued before it times out.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-queuedtimeoutinminutes)
     *
     * @param queuedTimeoutInMinutes The number of minutes a build is allowed to be queued before it
     *   times out.
     */
    public fun queuedTimeoutInMinutes(queuedTimeoutInMinutes: Number) {
        cdkBuilder.queuedTimeoutInMinutes(queuedTimeoutInMinutes)
    }

    /**
     * The ARN of the IAM role that enables CodeBuild to access the CloudWatch Logs and Amazon S3
     * artifacts for the project's builds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-resourceaccessrole)
     *
     * @param resourceAccessRole The ARN of the IAM role that enables CodeBuild to access the
     *   CloudWatch Logs and Amazon S3 artifacts for the project's builds.
     */
    public fun resourceAccessRole(resourceAccessRole: String) {
        cdkBuilder.resourceAccessRole(resourceAccessRole)
    }

    /**
     * A list of `Artifacts` objects.
     *
     * Each artifacts object specifies output settings that the project generates during a build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondaryartifacts)
     *
     * @param secondaryArtifacts A list of `Artifacts` objects.
     */
    public fun secondaryArtifacts(vararg secondaryArtifacts: Any) {
        _secondaryArtifacts.addAll(listOf(*secondaryArtifacts))
    }

    /**
     * A list of `Artifacts` objects.
     *
     * Each artifacts object specifies output settings that the project generates during a build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondaryartifacts)
     *
     * @param secondaryArtifacts A list of `Artifacts` objects.
     */
    public fun secondaryArtifacts(secondaryArtifacts: Collection<Any>) {
        _secondaryArtifacts.addAll(secondaryArtifacts)
    }

    /**
     * A list of `Artifacts` objects.
     *
     * Each artifacts object specifies output settings that the project generates during a build.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondaryartifacts)
     *
     * @param secondaryArtifacts A list of `Artifacts` objects.
     */
    public fun secondaryArtifacts(secondaryArtifacts: IResolvable) {
        cdkBuilder.secondaryArtifacts(secondaryArtifacts)
    }

    /**
     * An array of `ProjectSourceVersion` objects.
     *
     * If `secondarySourceVersions` is specified at the build level, then they take over these
     * `secondarySourceVersions` (at the project level).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysourceversions)
     *
     * @param secondarySourceVersions An array of `ProjectSourceVersion` objects.
     */
    public fun secondarySourceVersions(vararg secondarySourceVersions: Any) {
        _secondarySourceVersions.addAll(listOf(*secondarySourceVersions))
    }

    /**
     * An array of `ProjectSourceVersion` objects.
     *
     * If `secondarySourceVersions` is specified at the build level, then they take over these
     * `secondarySourceVersions` (at the project level).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysourceversions)
     *
     * @param secondarySourceVersions An array of `ProjectSourceVersion` objects.
     */
    public fun secondarySourceVersions(secondarySourceVersions: Collection<Any>) {
        _secondarySourceVersions.addAll(secondarySourceVersions)
    }

    /**
     * An array of `ProjectSourceVersion` objects.
     *
     * If `secondarySourceVersions` is specified at the build level, then they take over these
     * `secondarySourceVersions` (at the project level).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysourceversions)
     *
     * @param secondarySourceVersions An array of `ProjectSourceVersion` objects.
     */
    public fun secondarySourceVersions(secondarySourceVersions: IResolvable) {
        cdkBuilder.secondarySourceVersions(secondarySourceVersions)
    }

    /**
     * An array of `ProjectSource` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysources)
     *
     * @param secondarySources An array of `ProjectSource` objects.
     */
    public fun secondarySources(vararg secondarySources: Any) {
        _secondarySources.addAll(listOf(*secondarySources))
    }

    /**
     * An array of `ProjectSource` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysources)
     *
     * @param secondarySources An array of `ProjectSource` objects.
     */
    public fun secondarySources(secondarySources: Collection<Any>) {
        _secondarySources.addAll(secondarySources)
    }

    /**
     * An array of `ProjectSource` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-secondarysources)
     *
     * @param secondarySources An array of `ProjectSource` objects.
     */
    public fun secondarySources(secondarySources: IResolvable) {
        cdkBuilder.secondarySources(secondarySources)
    }

    /**
     * The ARN of the IAM role that enables AWS CodeBuild to interact with dependent AWS services on
     * behalf of the AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-servicerole)
     *
     * @param serviceRole The ARN of the IAM role that enables AWS CodeBuild to interact with
     *   dependent AWS services on behalf of the AWS account.
     */
    public fun serviceRole(serviceRole: String) {
        cdkBuilder.serviceRole(serviceRole)
    }

    /**
     * The source code settings for the project, such as the source code's repository type and
     * location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-source)
     *
     * @param source The source code settings for the project, such as the source code's repository
     *   type and location.
     */
    public fun source(source: IResolvable) {
        cdkBuilder.source(source)
    }

    /**
     * The source code settings for the project, such as the source code's repository type and
     * location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-source)
     *
     * @param source The source code settings for the project, such as the source code's repository
     *   type and location.
     */
    public fun source(source: CfnProject.SourceProperty) {
        cdkBuilder.source(source)
    }

    /**
     * A version of the build input to be built for this project.
     *
     * If not specified, the latest version is used. If specified, it must be one of:
     * * For CodeCommit: the commit ID, branch, or Git tag to use.
     * * For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to
     *   the version of the source code you want to build. If a pull request ID is specified, it
     *   must use the format `pr/pull-request-ID` (for example `pr/25` ). If a branch name is
     *   specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD
     *   commit ID is used.
     * * For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of
     *   the source code you want to build. If a branch name is specified, the branch's HEAD commit
     *   ID is used. If not specified, the default branch's HEAD commit ID is used.
     * * For Amazon S3: the version ID of the object that represents the build input ZIP file to
     *   use.
     *
     * If `sourceVersion` is specified at the build level, then that version takes precedence over
     * this `sourceVersion` (at the project level).
     *
     * For more information, see
     * [Source Version Sample with CodeBuild](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-source-version.html)
     * in the *AWS CodeBuild User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-sourceversion)
     *
     * @param sourceVersion A version of the build input to be built for this project.
     */
    public fun sourceVersion(sourceVersion: String) {
        cdkBuilder.sourceVersion(sourceVersion)
    }

    /**
     * An arbitrary set of tags (key-value pairs) for the AWS CodeBuild project.
     *
     * These tags are available for use by AWS services that support AWS CodeBuild build project
     * tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-tags)
     *
     * @param tags An arbitrary set of tags (key-value pairs) for the AWS CodeBuild project.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An arbitrary set of tags (key-value pairs) for the AWS CodeBuild project.
     *
     * These tags are available for use by AWS services that support AWS CodeBuild build project
     * tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-tags)
     *
     * @param tags An arbitrary set of tags (key-value pairs) for the AWS CodeBuild project.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before timing out
     * any related build that did not get marked as completed.
     *
     * The default is 60 minutes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-timeoutinminutes)
     *
     * @param timeoutInMinutes How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to
     *   wait before timing out any related build that did not get marked as completed.
     */
    public fun timeoutInMinutes(timeoutInMinutes: Number) {
        cdkBuilder.timeoutInMinutes(timeoutInMinutes)
    }

    /**
     * For an existing AWS CodeBuild build project that has its source code stored in a GitHub
     * repository, enables AWS CodeBuild to begin automatically rebuilding the source code every
     * time a code change is pushed to the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-triggers)
     *
     * @param triggers For an existing AWS CodeBuild build project that has its source code stored
     *   in a GitHub repository, enables AWS CodeBuild to begin automatically rebuilding the source
     *   code every time a code change is pushed to the repository.
     */
    public fun triggers(triggers: IResolvable) {
        cdkBuilder.triggers(triggers)
    }

    /**
     * For an existing AWS CodeBuild build project that has its source code stored in a GitHub
     * repository, enables AWS CodeBuild to begin automatically rebuilding the source code every
     * time a code change is pushed to the repository.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-triggers)
     *
     * @param triggers For an existing AWS CodeBuild build project that has its source code stored
     *   in a GitHub repository, enables AWS CodeBuild to begin automatically rebuilding the source
     *   code every time a code change is pushed to the repository.
     */
    public fun triggers(triggers: CfnProject.ProjectTriggersProperty) {
        cdkBuilder.triggers(triggers)
    }

    /**
     * Specifies the visibility of the project's builds. Possible values are:.
     * * **PUBLIC_READ** - The project builds are visible to the public.
     * * **PRIVATE** - The project builds are not visible to the public.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-visibility)
     *
     * @param visibility Specifies the visibility of the project's builds. Possible values are:.
     */
    public fun visibility(visibility: String) {
        cdkBuilder.visibility(visibility)
    }

    /**
     * `VpcConfig` specifies settings that enable AWS CodeBuild to access resources in an Amazon
     * VPC.
     *
     * For more information, see
     * [Use AWS CodeBuild with Amazon Virtual Private Cloud](https://docs.aws.amazon.com/codebuild/latest/userguide/vpc-support.html)
     * in the *AWS CodeBuild User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-vpcconfig)
     *
     * @param vpcConfig `VpcConfig` specifies settings that enable AWS CodeBuild to access resources
     *   in an Amazon VPC.
     */
    public fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    /**
     * `VpcConfig` specifies settings that enable AWS CodeBuild to access resources in an Amazon
     * VPC.
     *
     * For more information, see
     * [Use AWS CodeBuild with Amazon Virtual Private Cloud](https://docs.aws.amazon.com/codebuild/latest/userguide/vpc-support.html)
     * in the *AWS CodeBuild User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codebuild-project.html#cfn-codebuild-project-vpcconfig)
     *
     * @param vpcConfig `VpcConfig` specifies settings that enable AWS CodeBuild to access resources
     *   in an Amazon VPC.
     */
    public fun vpcConfig(vpcConfig: CfnProject.VpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig)
    }

    public fun build(): CfnProject {
        if (_fileSystemLocations.isNotEmpty()) cdkBuilder.fileSystemLocations(_fileSystemLocations)
        if (_secondaryArtifacts.isNotEmpty()) cdkBuilder.secondaryArtifacts(_secondaryArtifacts)
        if (_secondarySourceVersions.isNotEmpty())
            cdkBuilder.secondarySourceVersions(_secondarySourceVersions)
        if (_secondarySources.isNotEmpty()) cdkBuilder.secondarySources(_secondarySources)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
