@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Encodes information how a certain Stack should be deployed.
 */
public interface IStackSynthesizer {
  /**
   * Register a Docker Image Asset.
   *
   * Returns the parameters that can be used to refer to the asset inside the template.
   *
   * @param asset 
   */
  public fun addDockerImageAsset(asset: DockerImageAssetSource): DockerImageAssetLocation

  /**
   * Register a Docker Image Asset.
   *
   * Returns the parameters that can be used to refer to the asset inside the template.
   *
   * @param asset 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("60e85405255a4559d9d101644bfe36735011455aae5a7b2c0ff140d999863ded")
  public fun addDockerImageAsset(asset: DockerImageAssetSource.Builder.() -> Unit):
      DockerImageAssetLocation

  /**
   * Register a File Asset.
   *
   * Returns the parameters that can be used to refer to the asset inside the template.
   *
   * @param asset 
   */
  public fun addFileAsset(asset: FileAssetSource): FileAssetLocation

  /**
   * Register a File Asset.
   *
   * Returns the parameters that can be used to refer to the asset inside the template.
   *
   * @param asset 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b8c4a8252dd3ca6f0e54c1277f4347dc34084a3d362bd2ed69cb738a218590d6")
  public fun addFileAsset(asset: FileAssetSource.Builder.() -> Unit): FileAssetLocation

  /**
   * Bind to the stack this environment is going to be used on.
   *
   * Must be called before any of the other methods are called, and can only be called once.
   *
   * @param stack 
   */
  public fun bind(stack: Stack)

  /**
   * The qualifier used to bootstrap this stack.
   *
   * Default: - no qualifier
   */
  public fun bootstrapQualifier(): String? = unwrap(this).getBootstrapQualifier()

  /**
   * The role used to lookup for this stack.
   *
   * Default: - no role
   */
  public fun lookupRole(): String? = unwrap(this).getLookupRole()

  /**
   * Synthesize the associated stack to the session.
   *
   * @param session 
   */
  public fun synthesize(session: ISynthesisSession)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IStackSynthesizer): IStackSynthesizer =
        CdkObjectWrappers.wrap(cdkObject) as IStackSynthesizer

    internal fun unwrap(wrapped: IStackSynthesizer): software.amazon.awscdk.IStackSynthesizer =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.IStackSynthesizer
  }
}
