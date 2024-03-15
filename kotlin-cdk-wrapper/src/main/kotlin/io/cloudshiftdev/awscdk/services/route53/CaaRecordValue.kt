@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CaaRecordValue {
  public fun flag(): Number

  public fun tag(): CaaTag

  public fun `value`(): String

  @CdkDslMarker
  public interface Builder {
    public fun flag(flag: Number)

    public fun tag(tag: CaaTag)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.CaaRecordValue.Builder =
        software.amazon.awscdk.services.route53.CaaRecordValue.builder()

    override fun flag(flag: Number) {
      cdkBuilder.flag(flag)
    }

    override fun tag(tag: CaaTag) {
      cdkBuilder.tag(tag.let(CaaTag::unwrap))
    }

    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.route53.CaaRecordValue = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.CaaRecordValue,
  ) : CdkObject(cdkObject), CaaRecordValue {
    override fun flag(): Number = unwrap(this).getFlag()

    override fun tag(): CaaTag = unwrap(this).getTag().let(CaaTag::wrap)

    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CaaRecordValue {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.CaaRecordValue):
        CaaRecordValue = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CaaRecordValue):
        software.amazon.awscdk.services.route53.CaaRecordValue = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.route53.CaaRecordValue
  }
}