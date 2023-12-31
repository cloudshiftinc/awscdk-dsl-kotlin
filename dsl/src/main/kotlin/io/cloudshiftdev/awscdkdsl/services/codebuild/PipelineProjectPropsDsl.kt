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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.codebuild.BuildEnvironment
import software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable
import software.amazon.awscdk.services.codebuild.BuildSpec
import software.amazon.awscdk.services.codebuild.Cache
import software.amazon.awscdk.services.codebuild.IFileSystemLocation
import software.amazon.awscdk.services.codebuild.LoggingOptions
import software.amazon.awscdk.services.codebuild.PipelineProjectProps
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.kms.IKey

/**
 * Example:
 * ```
 * // Create a Cloudfront Web Distribution
 * import software.amazon.awscdk.services.cloudfront.*;
 * Distribution distribution;
 * // Create the build project that will invalidate the cache
 * PipelineProject invalidateBuildProject = PipelineProject.Builder.create(this,
 * "InvalidateProject")
 * .buildSpec(BuildSpec.fromObject(Map.of(
 * "version", "0.2",
 * "phases", Map.of(
 * "build", Map.of(
 * "commands", List.of("aws cloudfront create-invalidation --distribution-id
 * ${CLOUDFRONT_ID} --paths \"/ *\""))))))
 * .environmentVariables(Map.of(
 * "CLOUDFRONT_ID",
 * BuildEnvironmentVariable.builder().value(distribution.getDistributionId()).build()))
 * .build();
 * // Add Cloudfront invalidation permissions to the project
 * String distributionArn = String.format("arn:aws:cloudfront::%s:distribution/%s", this.account,
 * distribution.getDistributionId());
 * invalidateBuildProject.addToRolePolicy(PolicyStatement.Builder.create()
 * .resources(List.of(distributionArn))
 * .actions(List.of("cloudfront:CreateInvalidation"))
 * .build());
 * // Create the pipeline (here only the S3 deploy and Invalidate cache build)
 * Bucket deployBucket = new Bucket(this, "DeployBucket");
 * Artifact deployInput = new Artifact();
 * Pipeline.Builder.create(this, "Pipeline")
 * .stages(List.of(StageProps.builder()
 * .stageName("Deploy")
 * .actions(List.of(
 * S3DeployAction.Builder.create()
 * .actionName("S3Deploy")
 * .bucket(deployBucket)
 * .input(deployInput)
 * .runOrder(1)
 * .build(),
 * CodeBuildAction.Builder.create()
 * .actionName("InvalidateCache")
 * .project(invalidateBuildProject)
 * .input(deployInput)
 * .runOrder(2)
 * .build()))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class PipelineProjectPropsDsl {
    private val cdkBuilder: PipelineProjectProps.Builder = PipelineProjectProps.builder()

    private val _fileSystemLocations: MutableList<IFileSystemLocation> = mutableListOf()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /**
     * @param allowAllOutbound Whether to allow the CodeBuild to send all network traffic. If set to
     *   false, you must individually add traffic rules to allow the CodeBuild project to connect to
     *   network targets.
     *
     * Only used if 'vpc' is supplied.
     */
    public fun allowAllOutbound(allowAllOutbound: Boolean) {
        cdkBuilder.allowAllOutbound(allowAllOutbound)
    }

    /**
     * @param badge Indicates whether AWS CodeBuild generates a publicly accessible URL for your
     *   project's build badge. For more information, see Build Badges Sample in the AWS CodeBuild
     *   User Guide.
     */
    public fun badge(badge: Boolean) {
        cdkBuilder.badge(badge)
    }

    /** @param buildSpec Filename or contents of buildspec in JSON format. */
    public fun buildSpec(buildSpec: BuildSpec) {
        cdkBuilder.buildSpec(buildSpec)
    }

    /** @param cache Caching strategy to use. */
    public fun cache(cache: Cache) {
        cdkBuilder.cache(cache)
    }

    /**
     * @param checkSecretsInPlainTextEnvVariables Whether to check for the presence of any secrets
     *   in the environment variables of the default type, BuildEnvironmentVariableType.PLAINTEXT.
     *   Since using a secret for the value of that kind of variable would result in it being
     *   displayed in plain text in the AWS Console, the construct will throw an exception if it
     *   detects a secret was passed there. Pass this property as false if you want to skip this
     *   validation, and keep using a secret in a plain text environment variable.
     */
    public fun checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables: Boolean) {
        cdkBuilder.checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables)
    }

    /**
     * @param concurrentBuildLimit Maximum number of concurrent builds. Minimum value is 1 and
     *   maximum is account build limit.
     */
    public fun concurrentBuildLimit(concurrentBuildLimit: Number) {
        cdkBuilder.concurrentBuildLimit(concurrentBuildLimit)
    }

    /**
     * @param description A description of the project. Use the description to identify the purpose
     *   of the project.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param encryptionKey Encryption key to use to read and write artifacts. */
    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /** @param environment Build environment to use for the build. */
    public fun environment(environment: BuildEnvironmentDsl.() -> Unit = {}) {
        val builder = BuildEnvironmentDsl()
        builder.apply(environment)
        cdkBuilder.environment(builder.build())
    }

    /** @param environment Build environment to use for the build. */
    public fun environment(environment: BuildEnvironment) {
        cdkBuilder.environment(environment)
    }

    /**
     * @param environmentVariables Additional environment variables to add to the build environment.
     */
    public fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>) {
        cdkBuilder.environmentVariables(environmentVariables)
    }

    /**
     * @param fileSystemLocations An ProjectFileSystemLocation objects for a CodeBuild build
     *   project. A ProjectFileSystemLocation object specifies the identifier, location,
     *   mountOptions, mountPoint, and type of a file system created using Amazon Elastic File
     *   System.
     */
    public fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation) {
        _fileSystemLocations.addAll(listOf(*fileSystemLocations))
    }

    /**
     * @param fileSystemLocations An ProjectFileSystemLocation objects for a CodeBuild build
     *   project. A ProjectFileSystemLocation object specifies the identifier, location,
     *   mountOptions, mountPoint, and type of a file system created using Amazon Elastic File
     *   System.
     */
    public fun fileSystemLocations(fileSystemLocations: Collection<IFileSystemLocation>) {
        _fileSystemLocations.addAll(fileSystemLocations)
    }

    /**
     * @param grantReportGroupPermissions Add permissions to this project's role to create and use
     *   test report groups with name starting with the name of this project. That is the standard
     *   report group that gets created when a simple name (in contrast to an ARN) is used in the
     *   'reports' section of the buildspec of this project. This is usually harmless, but you can
     *   turn these off if you don't plan on using test reports in this project.
     */
    public fun grantReportGroupPermissions(grantReportGroupPermissions: Boolean) {
        cdkBuilder.grantReportGroupPermissions(grantReportGroupPermissions)
    }

    /**
     * @param logging Information about logs for the build project. A project can create logs in
     *   Amazon CloudWatch Logs, an S3 bucket, or both.
     */
    public fun logging(logging: LoggingOptionsDsl.() -> Unit = {}) {
        val builder = LoggingOptionsDsl()
        builder.apply(logging)
        cdkBuilder.logging(builder.build())
    }

    /**
     * @param logging Information about logs for the build project. A project can create logs in
     *   Amazon CloudWatch Logs, an S3 bucket, or both.
     */
    public fun logging(logging: LoggingOptions) {
        cdkBuilder.logging(logging)
    }

    /** @param projectName The physical, human-readable name of the CodeBuild Project. */
    public fun projectName(projectName: String) {
        cdkBuilder.projectName(projectName)
    }

    /**
     * @param queuedTimeout The number of minutes after which AWS CodeBuild stops the build if it's
     *   still in queue. For valid values, see the timeoutInMinutes field in the AWS CodeBuild User
     *   Guide.
     */
    public fun queuedTimeout(queuedTimeout: Duration) {
        cdkBuilder.queuedTimeout(queuedTimeout)
    }

    /** @param role Service Role to assume while running the build. */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * @param securityGroups What security group to associate with the codebuild project's network
     *   interfaces. If no security group is identified, one will be created automatically.
     *
     * Only used if 'vpc' is supplied.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * @param securityGroups What security group to associate with the codebuild project's network
     *   interfaces. If no security group is identified, one will be created automatically.
     *
     * Only used if 'vpc' is supplied.
     */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /**
     * @param ssmSessionPermissions Add the permissions necessary for debugging builds with SSM
     *   Session Manager. If the following prerequisites have been met:
     * * The necessary permissions have been added by setting this flag to true.
     * * The build image has the SSM agent installed (true for default CodeBuild images).
     * * The build is started with
     *   [debugSessionEnabled](https://docs.aws.amazon.com/codebuild/latest/APIReference/API_StartBuild.html#CodeBuild-StartBuild-request-debugSessionEnabled)
     *   set to true.
     *
     * Then the build container can be paused and inspected using Session Manager by invoking the
     * `codebuild-breakpoint` command somewhere during the build.
     *
     * `codebuild-breakpoint` commands will be ignored if the build is not started with
     * `debugSessionEnabled=true`.
     */
    public fun ssmSessionPermissions(ssmSessionPermissions: Boolean) {
        cdkBuilder.ssmSessionPermissions(ssmSessionPermissions)
    }

    /**
     * @param subnetSelection Where to place the network interfaces within the VPC. To access AWS
     *   services, your CodeBuild project needs to be in one of the following types of subnets:
     * * Subnets with access to the internet (of type PRIVATE_WITH_EGRESS).
     * * Private subnets unconnected to the internet, but with
     *   [VPC endpoints](https://docs.aws.amazon.com/codebuild/latest/userguide/use-vpc-endpoints-with-codebuild.html)
     *   for the necessary services.
     *
     * If you don't specify a subnet selection, the default behavior is to use PRIVATE_WITH_EGRESS
     * subnets first if they exist, then PRIVATE_WITHOUT_EGRESS, and finally PUBLIC subnets. If your
     * VPC doesn't have PRIVATE_WITH_EGRESS subnets but you need AWS service access, add VPC
     * Endpoints to your private subnets.
     */
    public fun subnetSelection(subnetSelection: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(subnetSelection)
        cdkBuilder.subnetSelection(builder.build())
    }

    /**
     * @param subnetSelection Where to place the network interfaces within the VPC. To access AWS
     *   services, your CodeBuild project needs to be in one of the following types of subnets:
     * * Subnets with access to the internet (of type PRIVATE_WITH_EGRESS).
     * * Private subnets unconnected to the internet, but with
     *   [VPC endpoints](https://docs.aws.amazon.com/codebuild/latest/userguide/use-vpc-endpoints-with-codebuild.html)
     *   for the necessary services.
     *
     * If you don't specify a subnet selection, the default behavior is to use PRIVATE_WITH_EGRESS
     * subnets first if they exist, then PRIVATE_WITHOUT_EGRESS, and finally PUBLIC subnets. If your
     * VPC doesn't have PRIVATE_WITH_EGRESS subnets but you need AWS service access, add VPC
     * Endpoints to your private subnets.
     */
    public fun subnetSelection(subnetSelection: SubnetSelection) {
        cdkBuilder.subnetSelection(subnetSelection)
    }

    /**
     * @param timeout The number of minutes after which AWS CodeBuild stops the build if it's not
     *   complete. For valid values, see the timeoutInMinutes field in the AWS CodeBuild User Guide.
     */
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * @param vpc VPC network to place codebuild network interfaces. Specify this if the codebuild
     *   project needs to access resources in a VPC.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): PipelineProjectProps {
        if (_fileSystemLocations.isNotEmpty()) cdkBuilder.fileSystemLocations(_fileSystemLocations)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
