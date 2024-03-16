@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Creation properties of the plain Aurora database cluster engine.
 *
 * Used in `DatabaseClusterEngine.aurora`.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseClusterFromSnapshot.Builder.create(this, "Database")
 * .engine(DatabaseClusterEngine.aurora(AuroraClusterEngineProps.builder().version(AuroraEngineVersion.VER_1_22_2).build()))
 * .writer(ClusterInstance.provisioned("writer"))
 * .vpc(vpc)
 * .snapshotIdentifier("mySnapshot")
 * .build();
 * ```
 */
public interface AuroraClusterEngineProps {
  /**
   * The version of the Aurora cluster engine.
   */
  public fun version(): AuroraEngineVersion

  /**
   * A builder for [AuroraClusterEngineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param version The version of the Aurora cluster engine. 
     */
    public fun version(version: AuroraEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.AuroraClusterEngineProps.Builder =
        software.amazon.awscdk.services.rds.AuroraClusterEngineProps.builder()

    /**
     * @param version The version of the Aurora cluster engine. 
     */
    override fun version(version: AuroraEngineVersion) {
      cdkBuilder.version(version.let(AuroraEngineVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.AuroraClusterEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.AuroraClusterEngineProps,
  ) : CdkObject(cdkObject), AuroraClusterEngineProps {
    /**
     * The version of the Aurora cluster engine.
     */
    override fun version(): AuroraEngineVersion =
        unwrap(this).getVersion().let(AuroraEngineVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AuroraClusterEngineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.AuroraClusterEngineProps):
        AuroraClusterEngineProps = CdkObjectWrappers.wrap(cdkObject) as AuroraClusterEngineProps

    internal fun unwrap(wrapped: AuroraClusterEngineProps):
        software.amazon.awscdk.services.rds.AuroraClusterEngineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.AuroraClusterEngineProps
  }
}
