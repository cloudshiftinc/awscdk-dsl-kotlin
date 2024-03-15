@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWaitCondition internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudformation.CfnWaitCondition,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrData(): IResolvable = unwrap(this).getAttrData().let(IResolvable::wrap)

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun count(): Number? = unwrap(this).getCount()

  public open fun count(`value`: Number) {
    unwrap(this).setCount(`value`)
  }

  public open fun handle(): String? = unwrap(this).getHandle()

  public open fun handle(`value`: String) {
    unwrap(this).setHandle(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun timeout(): String? = unwrap(this).getTimeout()

  public open fun timeout(`value`: String) {
    unwrap(this).setTimeout(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun count(count: Number)

    public fun handle(handle: String)

    public fun timeout(timeout: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudformation.CfnWaitCondition.Builder
        = software.amazon.awscdk.services.cloudformation.CfnWaitCondition.Builder.create(scope, id)

    override fun count(count: Number) {
      cdkBuilder.count(count)
    }

    override fun handle(handle: String) {
      cdkBuilder.handle(handle)
    }

    override fun timeout(timeout: String) {
      cdkBuilder.timeout(timeout)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnWaitCondition =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudformation.CfnWaitCondition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWaitCondition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWaitCondition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnWaitCondition):
        CfnWaitCondition = CfnWaitCondition(cdkObject)

    internal fun unwrap(wrapped: CfnWaitCondition):
        software.amazon.awscdk.services.cloudformation.CfnWaitCondition = wrapped.cdkObject
  }
}
