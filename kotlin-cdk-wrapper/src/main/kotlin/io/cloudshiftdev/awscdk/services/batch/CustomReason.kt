@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CustomReason {
  public fun onExitCode(): String? = unwrap(this).getOnExitCode()

  public fun onReason(): String? = unwrap(this).getOnReason()

  public fun onStatusReason(): String? = unwrap(this).getOnStatusReason()

  @CdkDslMarker
  public interface Builder {
    public fun onExitCode(onExitCode: String)

    public fun onReason(onReason: String)

    public fun onStatusReason(onStatusReason: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.CustomReason.Builder =
        software.amazon.awscdk.services.batch.CustomReason.builder()

    override fun onExitCode(onExitCode: String) {
      cdkBuilder.onExitCode(onExitCode)
    }

    override fun onReason(onReason: String) {
      cdkBuilder.onReason(onReason)
    }

    override fun onStatusReason(onStatusReason: String) {
      cdkBuilder.onStatusReason(onStatusReason)
    }

    public fun build(): software.amazon.awscdk.services.batch.CustomReason = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.CustomReason,
  ) : CdkObject(cdkObject), CustomReason {
    override fun onExitCode(): String? = unwrap(this).getOnExitCode()

    override fun onReason(): String? = unwrap(this).getOnReason()

    override fun onStatusReason(): String? = unwrap(this).getOnStatusReason()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomReason {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.CustomReason): CustomReason =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomReason): software.amazon.awscdk.services.batch.CustomReason =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.batch.CustomReason
  }
}
