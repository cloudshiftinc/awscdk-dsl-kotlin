@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface LockConfiguration {
  public fun changeableFor(): Duration? = unwrap(this).getChangeableFor()?.let(Duration::wrap)

  public fun maxRetention(): Duration? = unwrap(this).getMaxRetention()?.let(Duration::wrap)

  public fun minRetention(): Duration

  @CdkDslMarker
  public interface Builder {
    public fun changeableFor(changeableFor: Duration)

    public fun maxRetention(maxRetention: Duration)

    public fun minRetention(minRetention: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.LockConfiguration.Builder =
        software.amazon.awscdk.services.backup.LockConfiguration.builder()

    override fun changeableFor(changeableFor: Duration) {
      cdkBuilder.changeableFor(changeableFor.let(Duration::unwrap))
    }

    override fun maxRetention(maxRetention: Duration) {
      cdkBuilder.maxRetention(maxRetention.let(Duration::unwrap))
    }

    override fun minRetention(minRetention: Duration) {
      cdkBuilder.minRetention(minRetention.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.backup.LockConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.backup.LockConfiguration,
  ) : CdkObject(cdkObject), LockConfiguration {
    override fun changeableFor(): Duration? = unwrap(this).getChangeableFor()?.let(Duration::wrap)

    override fun maxRetention(): Duration? = unwrap(this).getMaxRetention()?.let(Duration::wrap)

    override fun minRetention(): Duration = unwrap(this).getMinRetention().let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LockConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.LockConfiguration):
        LockConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LockConfiguration):
        software.amazon.awscdk.services.backup.LockConfiguration = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.backup.LockConfiguration
  }
}
