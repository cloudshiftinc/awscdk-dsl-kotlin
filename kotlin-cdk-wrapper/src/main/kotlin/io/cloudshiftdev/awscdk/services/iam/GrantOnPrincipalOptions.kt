@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface GrantOnPrincipalOptions : CommonGrantOptions {
  public fun scope(): IConstruct? = unwrap(this).getScope()?.let(IConstruct::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun actions(actions: List<String>)

    public fun actions(vararg actions: String)

    public fun conditions(conditions: Map<String, Map<String, Any>>)

    public fun grantee(grantee: IGrantable)

    public fun resourceArns(resourceArns: List<String>)

    public fun resourceArns(vararg resourceArns: String)

    public fun scope(scope: IConstruct)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.GrantOnPrincipalOptions.Builder =
        software.amazon.awscdk.services.iam.GrantOnPrincipalOptions.builder()

    override fun actions(actions: List<String>) {
      cdkBuilder.actions(actions)
    }

    override fun actions(vararg actions: String): Unit = actions(actions.toList())

    override fun conditions(conditions: Map<String, Map<String, Any>>) {
      cdkBuilder.conditions(conditions)
    }

    override fun grantee(grantee: IGrantable) {
      cdkBuilder.grantee(grantee.let(IGrantable::unwrap))
    }

    override fun resourceArns(resourceArns: List<String>) {
      cdkBuilder.resourceArns(resourceArns)
    }

    override fun resourceArns(vararg resourceArns: String): Unit =
        resourceArns(resourceArns.toList())

    override fun scope(scope: IConstruct) {
      cdkBuilder.scope(scope.let(IConstruct::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iam.GrantOnPrincipalOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.GrantOnPrincipalOptions,
  ) : CdkObject(cdkObject), GrantOnPrincipalOptions {
    override fun actions(): List<String> = unwrap(this).getActions()

    override fun conditions(): Map<String, Map<String, Any>> = unwrap(this).getConditions() ?:
        emptyMap()

    override fun grantee(): IGrantable = unwrap(this).getGrantee().let(IGrantable::wrap)

    override fun resourceArns(): List<String> = unwrap(this).getResourceArns()

    override fun scope(): IConstruct? = unwrap(this).getScope()?.let(IConstruct::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GrantOnPrincipalOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.GrantOnPrincipalOptions):
        GrantOnPrincipalOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrantOnPrincipalOptions):
        software.amazon.awscdk.services.iam.GrantOnPrincipalOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.GrantOnPrincipalOptions
  }
}
