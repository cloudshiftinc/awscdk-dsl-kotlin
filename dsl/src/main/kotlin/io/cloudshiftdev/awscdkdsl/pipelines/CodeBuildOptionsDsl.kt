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

package io.cloudshiftdev.awscdkdsl.pipelines

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.services.codebuild.BuildEnvironmentDsl
import io.cloudshiftdev.awscdkdsl.services.codebuild.LoggingOptionsDsl
import io.cloudshiftdev.awscdkdsl.services.ec2.SubnetSelectionDsl
import io.cloudshiftdev.awscdkdsl.services.iam.PolicyStatementDsl
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.pipelines.CodeBuildOptions
import software.amazon.awscdk.services.codebuild.BuildEnvironment
import software.amazon.awscdk.services.codebuild.BuildSpec
import software.amazon.awscdk.services.codebuild.Cache
import software.amazon.awscdk.services.codebuild.IFileSystemLocation
import software.amazon.awscdk.services.codebuild.LoggingOptions
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.iam.PolicyStatement

/**
 * Options for customizing a single CodeBuild project.
 *
 * Example:
 * ```
 * IFileSetProducer source; // the repository source
 * String[] synthCommands; // Commands to synthesize your app
 * String[] installCommands;
 * // Commands to install your toolchain
 * CodePipeline pipeline = CodePipeline.Builder.create(this, "Pipeline")
 * // Standard CodePipeline properties...
 * .synth(ShellStep.Builder.create("Synth")
 * .input(source)
 * .commands(synthCommands)
 * .build())
 * // Configure CodeBuild to use a drop-in Docker replacement.
 * .codeBuildDefaults(CodeBuildOptions.builder()
 * .partialBuildSpec(BuildSpec.fromObject(Map.of(
 * "phases", Map.of(
 * "install", Map.of(
 * // Add the shell commands to install your drop-in Docker
 * // replacement to the CodeBuild enviromment.
 * "commands", installCommands)))))
 * .buildEnvironment(BuildEnvironment.builder()
 * .environmentVariables(Map.of(
 * // Instruct the AWS CDK to use `drop-in-replacement` instead of
 * // `docker` when building / publishing docker images.
 * // e.g., `drop-in-replacement build . -f path/to/Dockerfile`
 * "CDK_DOCKER", BuildEnvironmentVariable.builder().value("drop-in-replacement").build()))
 * .build())
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class CodeBuildOptionsDsl {
    private val cdkBuilder: CodeBuildOptions.Builder = CodeBuildOptions.builder()

    private val _fileSystemLocations: MutableList<IFileSystemLocation> = mutableListOf()

    private val _rolePolicy: MutableList<PolicyStatement> = mutableListOf()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    /**
     * @param buildEnvironment Partial build environment, will be combined with other build
     *   environments that apply.
     */
    public fun buildEnvironment(buildEnvironment: BuildEnvironmentDsl.() -> Unit = {}) {
        val builder = BuildEnvironmentDsl()
        builder.apply(buildEnvironment)
        cdkBuilder.buildEnvironment(builder.build())
    }

    /**
     * @param buildEnvironment Partial build environment, will be combined with other build
     *   environments that apply.
     */
    public fun buildEnvironment(buildEnvironment: BuildEnvironment) {
        cdkBuilder.buildEnvironment(buildEnvironment)
    }

    /** @param cache Caching strategy to use. */
    public fun cache(cache: Cache) {
        cdkBuilder.cache(cache)
    }

    /**
     * @param fileSystemLocations ProjectFileSystemLocation objects for CodeBuild build projects. A
     *   ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     *   mountPoint, and type of a file system created using Amazon Elastic File System. Requires a
     *   vpc to be set and privileged to be set to true.
     */
    public fun fileSystemLocations(vararg fileSystemLocations: IFileSystemLocation) {
        _fileSystemLocations.addAll(listOf(*fileSystemLocations))
    }

    /**
     * @param fileSystemLocations ProjectFileSystemLocation objects for CodeBuild build projects. A
     *   ProjectFileSystemLocation object specifies the identifier, location, mountOptions,
     *   mountPoint, and type of a file system created using Amazon Elastic File System. Requires a
     *   vpc to be set and privileged to be set to true.
     */
    public fun fileSystemLocations(fileSystemLocations: Collection<IFileSystemLocation>) {
        _fileSystemLocations.addAll(fileSystemLocations)
    }

    /**
     * @param logging Information about logs for CodeBuild projects. A CodeBuild project can create
     *   logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     */
    public fun logging(logging: LoggingOptionsDsl.() -> Unit = {}) {
        val builder = LoggingOptionsDsl()
        builder.apply(logging)
        cdkBuilder.logging(builder.build())
    }

    /**
     * @param logging Information about logs for CodeBuild projects. A CodeBuild project can create
     *   logs in Amazon CloudWatch Logs, an S3 bucket, or both.
     */
    public fun logging(logging: LoggingOptions) {
        cdkBuilder.logging(logging)
    }

    /**
     * @param partialBuildSpec Partial buildspec, will be combined with other buildspecs that apply.
     *   The BuildSpec must be available inline--it cannot reference a file on disk.
     */
    public fun partialBuildSpec(partialBuildSpec: BuildSpec) {
        cdkBuilder.partialBuildSpec(partialBuildSpec)
    }

    /** @param rolePolicy Policy statements to add to role. */
    public fun rolePolicy(rolePolicy: PolicyStatementDsl.() -> Unit) {
        _rolePolicy.add(PolicyStatementDsl().apply(rolePolicy).build())
    }

    /** @param rolePolicy Policy statements to add to role. */
    public fun rolePolicy(rolePolicy: Collection<PolicyStatement>) {
        _rolePolicy.addAll(rolePolicy)
    }

    /**
     * @param securityGroups Which security group(s) to associate with the project network
     *   interfaces. Only used if 'vpc' is supplied.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    /**
     * @param securityGroups Which security group(s) to associate with the project network
     *   interfaces. Only used if 'vpc' is supplied.
     */
    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    /** @param subnetSelection Which subnets to use. Only used if 'vpc' is supplied. */
    public fun subnetSelection(subnetSelection: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(subnetSelection)
        cdkBuilder.subnetSelection(builder.build())
    }

    /** @param subnetSelection Which subnets to use. Only used if 'vpc' is supplied. */
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

    /** @param vpc The VPC where to create the CodeBuild network interfaces in. */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): CodeBuildOptions {
        if (_fileSystemLocations.isNotEmpty()) cdkBuilder.fileSystemLocations(_fileSystemLocations)
        if (_rolePolicy.isNotEmpty()) cdkBuilder.rolePolicy(_rolePolicy)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
