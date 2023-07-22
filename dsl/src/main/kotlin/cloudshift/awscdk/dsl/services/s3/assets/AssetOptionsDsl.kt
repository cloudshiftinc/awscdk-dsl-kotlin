@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3.assets

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.BundlingOptionsDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.AssetHashType
import software.amazon.awscdk.BundlingOptions
import software.amazon.awscdk.IgnoreMode
import software.amazon.awscdk.SymlinkFollowMode
import software.amazon.awscdk.services.iam.IGrantable
import software.amazon.awscdk.services.s3.assets.AssetOptions

/**
 * Example:
 *
 * ```
 * Function.Builder.create(this, "Function")
 * .code(Code.fromAsset(join(__dirname, "my-python-handler"), AssetOptions.builder()
 * .bundling(BundlingOptions.builder()
 * .image(Runtime.PYTHON_3_9.getBundlingImage())
 * .command(List.of("bash", "-c", "pip install -r requirements.txt -t /asset-output &amp;&amp;
 * cp -au . /asset-output"))
 * .build())
 * .build()))
 * .runtime(Runtime.PYTHON_3_9)
 * .handler("index.handler")
 * .build();
 * ```
 */
@CdkDslMarker
public class AssetOptionsDsl {
  private val cdkBuilder: AssetOptions.Builder = AssetOptions.builder()

  private val _exclude: MutableList<String> = mutableListOf()

  private val _readers: MutableList<IGrantable> = mutableListOf()

  /**
   * @param assetHash Specify a custom hash for this asset.
   * If `assetHashType` is set it must
   * be set to `AssetHashType.CUSTOM`. For consistency, this custom hash will
   * be SHA256 hashed and encoded as hex. The resulting hash will be the asset
   * hash.
   *
   * NOTE: the hash is used in order to identify a specific revision of the asset, and
   * used for optimizing and caching deployment activities related to this asset such as
   * packaging, uploading to Amazon S3, etc. If you chose to customize the hash, you will
   * need to make sure it is updated every time the asset changes, or otherwise it is
   * possible that some deployments will not be invalidated.
   */
  public fun assetHash(assetHash: String) {
    cdkBuilder.assetHash(assetHash)
  }

  /**
   * @param assetHashType Specifies the type of hash to calculate for this asset.
   * If `assetHash` is configured, this option must be `undefined` or
   * `AssetHashType.CUSTOM`.
   */
  public fun assetHashType(assetHashType: AssetHashType) {
    cdkBuilder.assetHashType(assetHashType)
  }

  /**
   * @param bundling Bundle the asset by executing a command in a Docker container or a custom
   * bundling provider.
   * The asset path will be mounted at `/asset-input`. The Docker
   * container is responsible for putting content at `/asset-output`.
   * The content at `/asset-output` will be zipped and used as the
   * final asset.
   */
  public fun bundling(bundling: BundlingOptionsDsl.() -> Unit = {}) {
    val builder = BundlingOptionsDsl()
    builder.apply(bundling)
    cdkBuilder.bundling(builder.build())
  }

  /**
   * @param bundling Bundle the asset by executing a command in a Docker container or a custom
   * bundling provider.
   * The asset path will be mounted at `/asset-input`. The Docker
   * container is responsible for putting content at `/asset-output`.
   * The content at `/asset-output` will be zipped and used as the
   * final asset.
   */
  public fun bundling(bundling: BundlingOptions) {
    cdkBuilder.bundling(bundling)
  }

  /**
   * @param deployTime Whether or not the asset needs to exist beyond deployment time;.
   * i.e.
   * are copied over to a different location and not needed afterwards.
   * Setting this property to true has an impact on the lifecycle of the asset,
   * because we will assume that it is safe to delete after the CloudFormation
   * deployment succeeds.
   *
   * For example, Lambda Function assets are copied over to Lambda during
   * deployment. Therefore, it is not necessary to store the asset in S3, so
   * we consider those deployTime assets.
   */
  public fun deployTime(deployTime: Boolean) {
    cdkBuilder.deployTime(deployTime)
  }

  /**
   * @param exclude File paths matching the patterns will be excluded.
   * See `ignoreMode` to set the matching behavior.
   * Has no effect on Assets bundled using the `bundling` property.
   */
  public fun exclude(vararg exclude: String) {
    _exclude.addAll(listOf(*exclude))
  }

  /**
   * @param exclude File paths matching the patterns will be excluded.
   * See `ignoreMode` to set the matching behavior.
   * Has no effect on Assets bundled using the `bundling` property.
   */
  public fun exclude(exclude: Collection<String>) {
    _exclude.addAll(exclude)
  }

  /**
   * @param followSymlinks A strategy for how to handle symlinks.
   */
  public fun followSymlinks(followSymlinks: SymlinkFollowMode) {
    cdkBuilder.followSymlinks(followSymlinks)
  }

  /**
   * @param ignoreMode The ignore behavior to use for `exclude` patterns.
   */
  public fun ignoreMode(ignoreMode: IgnoreMode) {
    cdkBuilder.ignoreMode(ignoreMode)
  }

  /**
   * @param readers A list of principals that should be able to read this asset from S3.
   * You can use `asset.grantRead(principal)` to grant read permissions later.
   */
  public fun readers(vararg readers: IGrantable) {
    _readers.addAll(listOf(*readers))
  }

  /**
   * @param readers A list of principals that should be able to read this asset from S3.
   * You can use `asset.grantRead(principal)` to grant read permissions later.
   */
  public fun readers(readers: Collection<IGrantable>) {
    _readers.addAll(readers)
  }

  public fun build(): AssetOptions {
    if(_exclude.isNotEmpty()) cdkBuilder.exclude(_exclude)
    if(_readers.isNotEmpty()) cdkBuilder.readers(_readers)
    return cdkBuilder.build()
  }
}
