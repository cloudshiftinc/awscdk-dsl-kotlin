@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface TaintSpec {
  public fun effect(): TaintEffect? = unwrap(this).getEffect()?.let(TaintEffect::wrap)

  public fun key(): String? = unwrap(this).getKey()

  public fun `value`(): String? = unwrap(this).getValue()

  @CdkDslMarker
  public interface Builder {
    public fun effect(effect: TaintEffect)

    public fun key(key: String)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.TaintSpec.Builder =
        software.amazon.awscdk.services.eks.TaintSpec.builder()

    override fun effect(effect: TaintEffect) {
      cdkBuilder.effect(effect.let(TaintEffect::unwrap))
    }

    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.eks.TaintSpec = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.TaintSpec,
  ) : CdkObject(cdkObject), TaintSpec {
    override fun effect(): TaintEffect? = unwrap(this).getEffect()?.let(TaintEffect::wrap)

    override fun key(): String? = unwrap(this).getKey()

    override fun `value`(): String? = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TaintSpec {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.TaintSpec): TaintSpec =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TaintSpec): software.amazon.awscdk.services.eks.TaintSpec =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.eks.TaintSpec
  }
}
