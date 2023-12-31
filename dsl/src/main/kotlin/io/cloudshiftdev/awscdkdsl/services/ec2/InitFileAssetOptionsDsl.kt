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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.BundlingOptionsDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.AssetHashType
import software.amazon.awscdk.BundlingOptions
import software.amazon.awscdk.IgnoreMode
import software.amazon.awscdk.SymlinkFollowMode
import software.amazon.awscdk.services.ec2.InitFileAssetOptions
import software.amazon.awscdk.services.ec2.InitServiceRestartHandle
import software.amazon.awscdk.services.iam.IGrantable

/**
 * Additional options for creating an InitFile from an asset.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.iam.*;
 * DockerImage dockerImage;
 * IGrantable grantable;
 * InitServiceRestartHandle initServiceRestartHandle;
 * ILocalBundling localBundling;
 * InitFileAssetOptions initFileAssetOptions = InitFileAssetOptions.builder()
 * .assetHash("assetHash")
 * .assetHashType(AssetHashType.SOURCE)
 * .base64Encoded(false)
 * .bundling(BundlingOptions.builder()
 * .image(dockerImage)
 * // the properties below are optional
 * .bundlingFileAccess(BundlingFileAccess.VOLUME_COPY)
 * .command(List.of("command"))
 * .entrypoint(List.of("entrypoint"))
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .local(localBundling)
 * .network("network")
 * .outputType(BundlingOutput.ARCHIVED)
 * .platform("platform")
 * .securityOpt("securityOpt")
 * .user("user")
 * .volumes(List.of(DockerVolume.builder()
 * .containerPath("containerPath")
 * .hostPath("hostPath")
 * // the properties below are optional
 * .consistency(DockerVolumeConsistency.CONSISTENT)
 * .build()))
 * .volumesFrom(List.of("volumesFrom"))
 * .workingDirectory("workingDirectory")
 * .build())
 * .deployTime(false)
 * .exclude(List.of("exclude"))
 * .followSymlinks(SymlinkFollowMode.NEVER)
 * .group("group")
 * .ignoreMode(IgnoreMode.GLOB)
 * .mode("mode")
 * .owner("owner")
 * .readers(List.of(grantable))
 * .serviceRestartHandles(List.of(initServiceRestartHandle))
 * .build();
 * ```
 */
@CdkDslMarker
public class InitFileAssetOptionsDsl {
    private val cdkBuilder: InitFileAssetOptions.Builder = InitFileAssetOptions.builder()

    private val _exclude: MutableList<String> = mutableListOf()

    private val _readers: MutableList<IGrantable> = mutableListOf()

    private val _serviceRestartHandles: MutableList<InitServiceRestartHandle> = mutableListOf()

    /**
     * @param assetHash Specify a custom hash for this asset. If `assetHashType` is set it must be
     *   set to `AssetHashType.CUSTOM`. For consistency, this custom hash will be SHA256 hashed and
     *   encoded as hex. The resulting hash will be the asset hash.
     *
     * NOTE: the hash is used in order to identify a specific revision of the asset, and used for
     * optimizing and caching deployment activities related to this asset such as packaging,
     * uploading to Amazon S3, etc. If you chose to customize the hash, you will need to make sure
     * it is updated every time the asset changes, or otherwise it is possible that some deployments
     * will not be invalidated.
     */
    public fun assetHash(assetHash: String) {
        cdkBuilder.assetHash(assetHash)
    }

    /**
     * @param assetHashType Specifies the type of hash to calculate for this asset. If `assetHash`
     *   is configured, this option must be `undefined` or `AssetHashType.CUSTOM`.
     */
    public fun assetHashType(assetHashType: AssetHashType) {
        cdkBuilder.assetHashType(assetHashType)
    }

    /**
     * @param base64Encoded True if the inlined content (from a string or file) should be treated as
     *   base64 encoded. Only applicable for inlined string and file content.
     */
    public fun base64Encoded(base64Encoded: Boolean) {
        cdkBuilder.base64Encoded(base64Encoded)
    }

    /**
     * @param bundling Bundle the asset by executing a command in a Docker container or a custom
     *   bundling provider. The asset path will be mounted at `/asset-input`. The Docker container
     *   is responsible for putting content at `/asset-output`. The content at `/asset-output` will
     *   be zipped and used as the final asset.
     */
    public fun bundling(bundling: BundlingOptionsDsl.() -> Unit = {}) {
        val builder = BundlingOptionsDsl()
        builder.apply(bundling)
        cdkBuilder.bundling(builder.build())
    }

    /**
     * @param bundling Bundle the asset by executing a command in a Docker container or a custom
     *   bundling provider. The asset path will be mounted at `/asset-input`. The Docker container
     *   is responsible for putting content at `/asset-output`. The content at `/asset-output` will
     *   be zipped and used as the final asset.
     */
    public fun bundling(bundling: BundlingOptions) {
        cdkBuilder.bundling(bundling)
    }

    /**
     * @param deployTime Whether or not the asset needs to exist beyond deployment time;. i.e. are
     *   copied over to a different location and not needed afterwards. Setting this property to
     *   true has an impact on the lifecycle of the asset, because we will assume that it is safe to
     *   delete after the CloudFormation deployment succeeds.
     *
     * For example, Lambda Function assets are copied over to Lambda during deployment. Therefore,
     * it is not necessary to store the asset in S3, so we consider those deployTime assets.
     */
    public fun deployTime(deployTime: Boolean) {
        cdkBuilder.deployTime(deployTime)
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

    /** @param followSymlinks A strategy for how to handle symlinks. */
    public fun followSymlinks(followSymlinks: SymlinkFollowMode) {
        cdkBuilder.followSymlinks(followSymlinks)
    }

    /**
     * @param group The name of the owning group for this file. Not supported for Windows systems.
     */
    public fun group(group: String) {
        cdkBuilder.group(group)
    }

    /** @param ignoreMode The ignore behavior to use for `exclude` patterns. */
    public fun ignoreMode(ignoreMode: IgnoreMode) {
        cdkBuilder.ignoreMode(ignoreMode)
    }

    /**
     * @param mode A six-digit octal value representing the mode for this file. Use the first three
     *   digits for symlinks and the last three digits for setting permissions. To create a symlink,
     *   specify 120xxx, where xxx defines the permissions of the target file. To specify
     *   permissions for a file, use the last three digits, such as 000644.
     *
     * Not supported for Windows systems.
     */
    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    /**
     * @param owner The name of the owning user for this file. Not supported for Windows systems.
     */
    public fun owner(owner: String) {
        cdkBuilder.owner(owner)
    }

    /**
     * @param readers A list of principals that should be able to read this asset from S3. You can
     *   use `asset.grantRead(principal)` to grant read permissions later.
     */
    public fun readers(vararg readers: IGrantable) {
        _readers.addAll(listOf(*readers))
    }

    /**
     * @param readers A list of principals that should be able to read this asset from S3. You can
     *   use `asset.grantRead(principal)` to grant read permissions later.
     */
    public fun readers(readers: Collection<IGrantable>) {
        _readers.addAll(readers)
    }

    /** @param serviceRestartHandles Restart the given service after this file has been written. */
    public fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle) {
        _serviceRestartHandles.addAll(listOf(*serviceRestartHandles))
    }

    /** @param serviceRestartHandles Restart the given service after this file has been written. */
    public fun serviceRestartHandles(serviceRestartHandles: Collection<InitServiceRestartHandle>) {
        _serviceRestartHandles.addAll(serviceRestartHandles)
    }

    public fun build(): InitFileAssetOptions {
        if (_exclude.isNotEmpty()) cdkBuilder.exclude(_exclude)
        if (_readers.isNotEmpty()) cdkBuilder.readers(_readers)
        if (_serviceRestartHandles.isNotEmpty())
            cdkBuilder.serviceRestartHandles(_serviceRestartHandles)
        return cdkBuilder.build()
    }
}
