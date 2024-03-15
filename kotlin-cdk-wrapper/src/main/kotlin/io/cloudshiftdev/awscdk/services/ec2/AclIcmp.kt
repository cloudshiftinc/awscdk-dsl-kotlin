@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface AclIcmp {
  public fun code(): Number? = unwrap(this).getCode()

  public fun type(): Number? = unwrap(this).getType()

  @CdkDslMarker
  public interface Builder {
    public fun code(code: Number)

    public fun type(type: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AclIcmp.Builder =
        software.amazon.awscdk.services.ec2.AclIcmp.builder()

    override fun code(code: Number) {
      cdkBuilder.code(code)
    }

    override fun type(type: Number) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ec2.AclIcmp = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.AclIcmp,
  ) : CdkObject(cdkObject), AclIcmp {
    override fun code(): Number? = unwrap(this).getCode()

    override fun type(): Number? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AclIcmp {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AclIcmp): AclIcmp =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AclIcmp): software.amazon.awscdk.services.ec2.AclIcmp = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.AclIcmp
  }
}
