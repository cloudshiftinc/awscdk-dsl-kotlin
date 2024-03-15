@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnCustomResourceProps {
  public fun serviceToken(): String

  @CdkDslMarker
  public interface Builder {
    public fun serviceToken(serviceToken: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCustomResourceProps.Builder =
        software.amazon.awscdk.CfnCustomResourceProps.builder()

    override fun serviceToken(serviceToken: String) {
      cdkBuilder.serviceToken(serviceToken)
    }

    public fun build(): software.amazon.awscdk.CfnCustomResourceProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnCustomResourceProps,
  ) : CdkObject(cdkObject), CfnCustomResourceProps {
    override fun serviceToken(): String = unwrap(this).getServiceToken()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCustomResourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCustomResourceProps):
        CfnCustomResourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCustomResourceProps):
        software.amazon.awscdk.CfnCustomResourceProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnCustomResourceProps
  }
}
