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
import software.amazon.awscdk.services.ecr.assets.DockerImageAssetInvalidationOptions
import software.amazon.awscdk.services.ecr.assets.DockerImageAssetProps
import software.amazon.awscdk.services.ecr.assets.NetworkMode
import software.amazon.awscdk.services.ecr.assets.Platform

/**
 * Props for DockerImageAssets.
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
public class DockerImageAssetPropsDsl {
    private val cdkBuilder: DockerImageAssetProps.Builder = DockerImageAssetProps.builder()

    private val _cacheFrom: MutableList<DockerCacheOption> = mutableListOf()

    private val _exclude: MutableList<String> = mutableListOf()

    private val _outputs: MutableList<String> = mutableListOf()

    /**
     * @param assetName Unique identifier of the docker image asset and its potential revisions.
     *   Required if using AppScopedStagingSynthesizer.
     */
    public fun assetName(assetName: String) {
        cdkBuilder.assetName(assetName)
    }

    /**
     * @param buildArgs Build args to pass to the `docker build` command. Since Docker build
     *   arguments are resolved before deployment, keys and values cannot refer to unresolved tokens
     *   (such as `lambda.functionArn` or `queue.queueUrl`).
     */
    public fun buildArgs(buildArgs: Map<String, String>) {
        cdkBuilder.buildArgs(buildArgs)
    }

    /** @param buildSecrets Build secrets. Docker BuildKit must be enabled to use build secrets. */
    public fun buildSecrets(buildSecrets: Map<String, String>) {
        cdkBuilder.buildSecrets(buildSecrets)
    }

    /**
     * @param buildSsh SSH agent socket or keys to pass to the `docker build` command. Docker
     *   BuildKit must be enabled to use the ssh flag
     */
    public fun buildSsh(buildSsh: String) {
        cdkBuilder.buildSsh(buildSsh)
    }

    /** @param cacheFrom Cache from options to pass to the `docker build` command. */
    public fun cacheFrom(cacheFrom: DockerCacheOptionDsl.() -> Unit) {
        _cacheFrom.add(DockerCacheOptionDsl().apply(cacheFrom).build())
    }

    /** @param cacheFrom Cache from options to pass to the `docker build` command. */
    public fun cacheFrom(cacheFrom: Collection<DockerCacheOption>) {
        _cacheFrom.addAll(cacheFrom)
    }

    /** @param cacheTo Cache to options to pass to the `docker build` command. */
    public fun cacheTo(cacheTo: DockerCacheOptionDsl.() -> Unit = {}) {
        val builder = DockerCacheOptionDsl()
        builder.apply(cacheTo)
        cdkBuilder.cacheTo(builder.build())
    }

    /** @param cacheTo Cache to options to pass to the `docker build` command. */
    public fun cacheTo(cacheTo: DockerCacheOption) {
        cdkBuilder.cacheTo(cacheTo)
    }

    /**
     * @param directory The directory where the Dockerfile is stored. Any directory inside with a
     *   name that matches the CDK output folder (cdk.out by default) will be excluded from the
     *   asset
     */
    public fun directory(directory: String) {
        cdkBuilder.directory(directory)
    }

    /**
     * @param exclude File paths matching the patterns will be excluded. See `ignoreMode` to set the
     *   matching behavior. Has no effect on Assets bundled using the `bundling` property.
     */
    public fun exclude(vararg exclude: String) {
        _exclude.addAll(listOf(*exclude))
    }

    /**
     * @param exclude File paths matching the patterns will be excluded. See `ignoreMode` to set the
     *   matching behavior. Has no effect on Assets bundled using the `bundling` property.
     */
    public fun exclude(exclude: Collection<String>) {
        _exclude.addAll(exclude)
    }

    /**
     * @param extraHash Extra information to encode into the fingerprint (e.g. build instructions
     *   and other inputs).
     */
    public fun extraHash(extraHash: String) {
        cdkBuilder.extraHash(extraHash)
    }

    /** @param file Path to the Dockerfile (relative to the directory). */
    public fun `file`(`file`: String) {
        cdkBuilder.`file`(`file`)
    }

    /** @param followSymlinks A strategy for how to handle symlinks. */
    public fun followSymlinks(followSymlinks: SymlinkFollowMode) {
        cdkBuilder.followSymlinks(followSymlinks)
    }

    /** @param ignoreMode The ignore behavior to use for `exclude` patterns. */
    public fun ignoreMode(ignoreMode: IgnoreMode) {
        cdkBuilder.ignoreMode(ignoreMode)
    }

    /**
     * @param invalidation Options to control which parameters are used to invalidate the asset
     *   hash.
     */
    public fun invalidation(invalidation: DockerImageAssetInvalidationOptionsDsl.() -> Unit = {}) {
        val builder = DockerImageAssetInvalidationOptionsDsl()
        builder.apply(invalidation)
        cdkBuilder.invalidation(builder.build())
    }

    /**
     * @param invalidation Options to control which parameters are used to invalidate the asset
     *   hash.
     */
    public fun invalidation(invalidation: DockerImageAssetInvalidationOptions) {
        cdkBuilder.invalidation(invalidation)
    }

    /**
     * @param networkMode Networking mode for the RUN commands during build. Support docker API
     *   1.25+.
     */
    public fun networkMode(networkMode: NetworkMode) {
        cdkBuilder.networkMode(networkMode)
    }

    /** @param outputs Outputs to pass to the `docker build` command. */
    public fun outputs(vararg outputs: String) {
        _outputs.addAll(listOf(*outputs))
    }

    /** @param outputs Outputs to pass to the `docker build` command. */
    public fun outputs(outputs: Collection<String>) {
        _outputs.addAll(outputs)
    }

    /** @param platform Platform to build for. *Requires Docker Buildx*. */
    public fun platform(platform: Platform) {
        cdkBuilder.platform(platform)
    }

    /** @param target Docker target to build to. */
    public fun target(target: String) {
        cdkBuilder.target(target)
    }

    public fun build(): DockerImageAssetProps {
        if (_cacheFrom.isNotEmpty()) cdkBuilder.cacheFrom(_cacheFrom)
        if (_exclude.isNotEmpty()) cdkBuilder.exclude(_exclude)
        if (_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
        return cdkBuilder.build()
    }
}
