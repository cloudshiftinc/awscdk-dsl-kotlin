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

package io.cloudshiftdev.awscdkdsl.services.ecr.assets

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IgnoreMode
import software.amazon.awscdk.SymlinkFollowMode
import software.amazon.awscdk.services.ecr.assets.DockerCacheOption
import software.amazon.awscdk.services.ecr.assets.DockerImageAsset
import software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions
import software.amazon.awscdk.services.ecr.assets.NetworkMode
import software.amazon.awscdk.services.ecr.assets.Platform
import software.constructs.Construct

/**
 * An asset that represents a Docker image.
 *
 * The image will be created in build time and uploaded to an ECR repository.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.ecr.assets.DockerImageAsset;
 * DockerImageAsset asset = DockerImageAsset.Builder.create(this, "MyBuildImage")
 * .directory(join(__dirname, "my-image"))
 * .buildArgs(Map.of(
 * "HTTP_PROXY", "http://10.20.30.2:1234"))
 * .invalidation(DockerImageAssetInvalidationOptions.builder()
 * .buildArgs(false)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class DockerImageAssetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: DockerImageAsset.Builder = DockerImageAsset.Builder.create(scope, id)

    private val _cacheFrom: MutableList<DockerCacheOption> = mutableListOf()

    private val _exclude: MutableList<String> = mutableListOf()

    private val _outputs: MutableList<String> = mutableListOf()

    /**
     * Unique identifier of the docker image asset and its potential revisions.
     *
     * Required if using AppScopedStagingSynthesizer.
     *
     * Default: - no asset name
     *
     * @param assetName Unique identifier of the docker image asset and its potential revisions.
     */
    public fun assetName(assetName: String) {
        cdkBuilder.assetName(assetName)
    }

    /**
     * Build args to pass to the `docker build` command.
     *
     * Since Docker build arguments are resolved before deployment, keys and values cannot refer to
     * unresolved tokens (such as `lambda.functionArn` or `queue.queueUrl`).
     *
     * Default: - no build args are passed
     *
     * @param buildArgs Build args to pass to the `docker build` command.
     */
    public fun buildArgs(buildArgs: Map<String, String>) {
        cdkBuilder.buildArgs(buildArgs)
    }

    /**
     * Build secrets.
     *
     * Docker BuildKit must be enabled to use build secrets.
     *
     * Default: - no build secrets
     *
     * Example:
     * ```
     * import software.amazon.awscdk.DockerBuildSecret;
     * Map&lt;String, String&gt; buildSecrets = Map.of(
     * "MY_SECRET", DockerBuildSecret.fromSrc("file.txt"));
     * ```
     *
     * [Documentation](https://docs.docker.com/build/buildkit/)
     *
     * @param buildSecrets Build secrets.
     */
    public fun buildSecrets(buildSecrets: Map<String, String>) {
        cdkBuilder.buildSecrets(buildSecrets)
    }

    /**
     * SSH agent socket or keys to pass to the `docker build` command.
     *
     * Docker BuildKit must be enabled to use the ssh flag
     *
     * Default: - no --ssh flag
     *
     * [Documentation](https://docs.docker.com/build/buildkit/)
     *
     * @param buildSsh SSH agent socket or keys to pass to the `docker build` command.
     */
    public fun buildSsh(buildSsh: String) {
        cdkBuilder.buildSsh(buildSsh)
    }

    /**
     * Cache from options to pass to the `docker build` command.
     *
     * Default: - no cache from options are passed to the build command
     *
     * [Documentation](https://docs.docker.com/build/cache/backends/)
     *
     * @param cacheFrom Cache from options to pass to the `docker build` command.
     */
    public fun cacheFrom(cacheFrom: DockerCacheOptionDsl.() -> Unit) {
        _cacheFrom.add(DockerCacheOptionDsl().apply(cacheFrom).build())
    }

    /**
     * Cache from options to pass to the `docker build` command.
     *
     * Default: - no cache from options are passed to the build command
     *
     * [Documentation](https://docs.docker.com/build/cache/backends/)
     *
     * @param cacheFrom Cache from options to pass to the `docker build` command.
     */
    public fun cacheFrom(cacheFrom: Collection<DockerCacheOption>) {
        _cacheFrom.addAll(cacheFrom)
    }

    /**
     * Cache to options to pass to the `docker build` command.
     *
     * Default: - no cache to options are passed to the build command
     *
     * [Documentation](https://docs.docker.com/build/cache/backends/)
     *
     * @param cacheTo Cache to options to pass to the `docker build` command.
     */
    public fun cacheTo(cacheTo: DockerCacheOptionDsl.() -> Unit = {}) {
        val builder = DockerCacheOptionDsl()
        builder.apply(cacheTo)
        cdkBuilder.cacheTo(builder.build())
    }

    /**
     * Cache to options to pass to the `docker build` command.
     *
     * Default: - no cache to options are passed to the build command
     *
     * [Documentation](https://docs.docker.com/build/cache/backends/)
     *
     * @param cacheTo Cache to options to pass to the `docker build` command.
     */
    public fun cacheTo(cacheTo: DockerCacheOption) {
        cdkBuilder.cacheTo(cacheTo)
    }

    /**
     * The directory where the Dockerfile is stored.
     *
     * Any directory inside with a name that matches the CDK output folder (cdk.out by default) will
     * be excluded from the asset
     *
     * @param directory The directory where the Dockerfile is stored.
     */
    public fun directory(directory: String) {
        cdkBuilder.directory(directory)
    }

    /**
     * File paths matching the patterns will be excluded.
     *
     * See `ignoreMode` to set the matching behavior. Has no effect on Assets bundled using the
     * `bundling` property.
     *
     * Default: - nothing is excluded
     *
     * @param exclude File paths matching the patterns will be excluded.
     */
    public fun exclude(vararg exclude: String) {
        _exclude.addAll(listOf(*exclude))
    }

    /**
     * File paths matching the patterns will be excluded.
     *
     * See `ignoreMode` to set the matching behavior. Has no effect on Assets bundled using the
     * `bundling` property.
     *
     * Default: - nothing is excluded
     *
     * @param exclude File paths matching the patterns will be excluded.
     */
    public fun exclude(exclude: Collection<String>) {
        _exclude.addAll(exclude)
    }

    /**
     * Extra information to encode into the fingerprint (e.g. build instructions and other inputs).
     *
     * Default: - hash is only based on source content
     *
     * @param extraHash Extra information to encode into the fingerprint (e.g. build instructions
     *   and other inputs).
     */
    public fun extraHash(extraHash: String) {
        cdkBuilder.extraHash(extraHash)
    }

    /**
     * Path to the Dockerfile (relative to the directory).
     *
     * Default: 'Dockerfile'
     *
     * @param file Path to the Dockerfile (relative to the directory).
     */
    public fun `file`(`file`: String) {
        cdkBuilder.`file`(`file`)
    }

    /**
     * A strategy for how to handle symlinks.
     *
     * Default: SymlinkFollowMode.NEVER
     *
     * @param followSymlinks A strategy for how to handle symlinks.
     */
    public fun followSymlinks(followSymlinks: SymlinkFollowMode) {
        cdkBuilder.followSymlinks(followSymlinks)
    }

    /**
     * The ignore behavior to use for `exclude` patterns.
     *
     * Default: IgnoreMode.GLOB
     *
     * @param ignoreMode The ignore behavior to use for `exclude` patterns.
     */
    public fun ignoreMode(ignoreMode: IgnoreMode) {
        cdkBuilder.ignoreMode(ignoreMode)
    }

    /**
     * Options to control which parameters are used to invalidate the asset hash.
     *
     * Default: - hash all parameters
     *
     * @param invalidation Options to control which parameters are used to invalidate the asset
     *   hash.
     */
    public fun invalidation(invalidation: DockerImageAssetInvalidationOptionsDsl.() -> Unit = {}) {
        val builder = DockerImageAssetInvalidationOptionsDsl()
        builder.apply(invalidation)
        cdkBuilder.invalidation(builder.build())
    }

    /**
     * Options to control which parameters are used to invalidate the asset hash.
     *
     * Default: - hash all parameters
     *
     * @param invalidation Options to control which parameters are used to invalidate the asset
     *   hash.
     */
    public fun invalidation(invalidation: DockerImageAssetInvalidationOptions) {
        cdkBuilder.invalidation(invalidation)
    }

    /**
     * Networking mode for the RUN commands during build.
     *
     * Support docker API 1.25+.
     *
     * Default: - no networking mode specified (the default networking mode `NetworkMode.DEFAULT`
     * will be used)
     *
     * @param networkMode Networking mode for the RUN commands during build.
     */
    public fun networkMode(networkMode: NetworkMode) {
        cdkBuilder.networkMode(networkMode)
    }

    /**
     * Outputs to pass to the `docker build` command.
     *
     * Default: - no outputs are passed to the build command (default outputs are used)
     *
     * [Documentation](https://docs.docker.com/engine/reference/commandline/build/#custom-build-outputs)
     *
     * @param outputs Outputs to pass to the `docker build` command.
     */
    public fun outputs(vararg outputs: String) {
        _outputs.addAll(listOf(*outputs))
    }

    /**
     * Outputs to pass to the `docker build` command.
     *
     * Default: - no outputs are passed to the build command (default outputs are used)
     *
     * [Documentation](https://docs.docker.com/engine/reference/commandline/build/#custom-build-outputs)
     *
     * @param outputs Outputs to pass to the `docker build` command.
     */
    public fun outputs(outputs: Collection<String>) {
        _outputs.addAll(outputs)
    }

    /**
     * Platform to build for.
     *
     * *Requires Docker Buildx*.
     *
     * Default: - no platform specified (the current machine architecture will be used)
     *
     * @param platform Platform to build for.
     */
    public fun platform(platform: Platform) {
        cdkBuilder.platform(platform)
    }

    /**
     * Docker target to build to.
     *
     * Default: - no target
     *
     * @param target Docker target to build to.
     */
    public fun target(target: String) {
        cdkBuilder.target(target)
    }

    public fun build(): DockerImageAsset {
        if (_cacheFrom.isNotEmpty()) cdkBuilder.cacheFrom(_cacheFrom)
        if (_exclude.isNotEmpty()) cdkBuilder.exclude(_exclude)
        if (_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
        return cdkBuilder.build()
    }
}
