@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit

public interface GetContextValueResult {
  public fun `value`(): Any? = unwrap(this).getValue()

  @CdkDslMarker
  public interface Builder {
    public fun `value`(`value`: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.GetContextValueResult.Builder =
        software.amazon.awscdk.GetContextValueResult.builder()

    override fun `value`(`value`: Any) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.GetContextValueResult = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.GetContextValueResult,
  ) : CdkObject(cdkObject), GetContextValueResult {
    override fun `value`(): Any? = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GetContextValueResult {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.GetContextValueResult):
        GetContextValueResult = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GetContextValueResult):
        software.amazon.awscdk.GetContextValueResult = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.GetContextValueResult
  }
}