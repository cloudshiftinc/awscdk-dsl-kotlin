@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface AuroraPostgresEngineFeatures {
  public fun s3Export(): Boolean? = unwrap(this).getS3Export()

  public fun s3Import(): Boolean? = unwrap(this).getS3Import()

  @CdkDslMarker
  public interface Builder {
    public fun s3Export(s3Export: Boolean)

    public fun s3Import(s3Import: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.AuroraPostgresEngineFeatures.Builder
        = software.amazon.awscdk.services.rds.AuroraPostgresEngineFeatures.builder()

    override fun s3Export(s3Export: Boolean) {
      cdkBuilder.s3Export(s3Export)
    }

    override fun s3Import(s3Import: Boolean) {
      cdkBuilder.s3Import(s3Import)
    }

    public fun build(): software.amazon.awscdk.services.rds.AuroraPostgresEngineFeatures =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.AuroraPostgresEngineFeatures,
  ) : CdkObject(cdkObject), AuroraPostgresEngineFeatures {
    override fun s3Export(): Boolean? = unwrap(this).getS3Export()

    override fun s3Import(): Boolean? = unwrap(this).getS3Import()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AuroraPostgresEngineFeatures {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.AuroraPostgresEngineFeatures):
        AuroraPostgresEngineFeatures = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AuroraPostgresEngineFeatures):
        software.amazon.awscdk.services.rds.AuroraPostgresEngineFeatures = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.AuroraPostgresEngineFeatures
  }
}
