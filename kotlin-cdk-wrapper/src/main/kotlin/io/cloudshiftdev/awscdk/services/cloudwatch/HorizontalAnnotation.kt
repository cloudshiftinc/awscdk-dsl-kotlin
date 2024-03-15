@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface HorizontalAnnotation {
  public fun color(): String? = unwrap(this).getColor()

  public fun fill(): Shading? = unwrap(this).getFill()?.let(Shading::wrap)

  public fun label(): String? = unwrap(this).getLabel()

  public fun `value`(): Number

  public fun visible(): Boolean? = unwrap(this).getVisible()

  @CdkDslMarker
  public interface Builder {
    public fun color(color: String)

    public fun fill(fill: Shading)

    public fun label(label: String)

    public fun `value`(`value`: Number)

    public fun visible(visible: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation.Builder
        = software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation.builder()

    override fun color(color: String) {
      cdkBuilder.color(color)
    }

    override fun fill(fill: Shading) {
      cdkBuilder.fill(fill.let(Shading::unwrap))
    }

    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    override fun `value`(`value`: Number) {
      cdkBuilder.`value`(`value`)
    }

    override fun visible(visible: Boolean) {
      cdkBuilder.visible(visible)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation,
  ) : CdkObject(cdkObject), HorizontalAnnotation {
    override fun color(): String? = unwrap(this).getColor()

    override fun fill(): Shading? = unwrap(this).getFill()?.let(Shading::wrap)

    override fun label(): String? = unwrap(this).getLabel()

    override fun `value`(): Number = unwrap(this).getValue()

    override fun visible(): Boolean? = unwrap(this).getVisible()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HorizontalAnnotation {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation):
        HorizontalAnnotation = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HorizontalAnnotation):
        software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation
  }
}
