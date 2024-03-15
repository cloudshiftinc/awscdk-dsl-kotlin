@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CustomizeRolesOptions {
  public fun preventSynthesis(): Boolean? = unwrap(this).getPreventSynthesis()

  public fun usePrecreatedRoles(): Map<String, String> = unwrap(this).getUsePrecreatedRoles() ?:
      emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun preventSynthesis(preventSynthesis: Boolean)

    public fun usePrecreatedRoles(usePrecreatedRoles: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CustomizeRolesOptions.Builder =
        software.amazon.awscdk.services.iam.CustomizeRolesOptions.builder()

    override fun preventSynthesis(preventSynthesis: Boolean) {
      cdkBuilder.preventSynthesis(preventSynthesis)
    }

    override fun usePrecreatedRoles(usePrecreatedRoles: Map<String, String>) {
      cdkBuilder.usePrecreatedRoles(usePrecreatedRoles)
    }

    public fun build(): software.amazon.awscdk.services.iam.CustomizeRolesOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CustomizeRolesOptions,
  ) : CdkObject(cdkObject), CustomizeRolesOptions {
    override fun preventSynthesis(): Boolean? = unwrap(this).getPreventSynthesis()

    override fun usePrecreatedRoles(): Map<String, String> = unwrap(this).getUsePrecreatedRoles() ?:
        emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomizeRolesOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CustomizeRolesOptions):
        CustomizeRolesOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomizeRolesOptions):
        software.amazon.awscdk.services.iam.CustomizeRolesOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.CustomizeRolesOptions
  }
}
