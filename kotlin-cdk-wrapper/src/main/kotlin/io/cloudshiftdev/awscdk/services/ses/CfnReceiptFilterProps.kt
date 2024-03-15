@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnReceiptFilterProps {
  public fun filter(): Any

  @CdkDslMarker
  public interface Builder {
    public fun filter(filter: IResolvable)

    public fun filter(filter: CfnReceiptFilter.FilterProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a0132114fcbc3d0c0e844b1c1140464f87f9468244eeb5486156bf8aca5e509")
    public fun filter(filter: CfnReceiptFilter.FilterProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnReceiptFilterProps.Builder =
        software.amazon.awscdk.services.ses.CfnReceiptFilterProps.builder()

    override fun filter(filter: IResolvable) {
      cdkBuilder.filter(filter.let(IResolvable::unwrap))
    }

    override fun filter(filter: CfnReceiptFilter.FilterProperty) {
      cdkBuilder.filter(filter.let(CfnReceiptFilter.FilterProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a0132114fcbc3d0c0e844b1c1140464f87f9468244eeb5486156bf8aca5e509")
    override fun filter(filter: CfnReceiptFilter.FilterProperty.Builder.() -> Unit): Unit =
        filter(CfnReceiptFilter.FilterProperty(filter))

    public fun build(): software.amazon.awscdk.services.ses.CfnReceiptFilterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.CfnReceiptFilterProps,
  ) : CdkObject(cdkObject), CfnReceiptFilterProps {
    override fun filter(): Any = unwrap(this).getFilter()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReceiptFilterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnReceiptFilterProps):
        CfnReceiptFilterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReceiptFilterProps):
        software.amazon.awscdk.services.ses.CfnReceiptFilterProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.CfnReceiptFilterProps
  }
}
