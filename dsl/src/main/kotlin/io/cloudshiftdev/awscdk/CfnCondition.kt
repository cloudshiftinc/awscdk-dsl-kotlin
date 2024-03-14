package io.cloudshiftdev.awscdk

import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCondition internal constructor(
  private val cdkObject: software.amazon.awscdk.CfnCondition,
) : CfnElement(cdkObject), ICfnConditionExpression, IResolvable {
  public open fun expression(): ICfnConditionExpression? =
      unwrap(this).getExpression()?.let(ICfnConditionExpression::wrap)

  public open fun expression(`value`: ICfnConditionExpression) {
    unwrap(this).setExpression(`value`.let(ICfnConditionExpression::unwrap))
  }

  public override fun resolve(_context: IResolveContext): Any =
      unwrap(this).resolve(_context.let(IResolveContext::unwrap))

  public interface Builder {
    public fun expression(expression: ICfnConditionExpression)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCondition.Builder =
        software.amazon.awscdk.CfnCondition.Builder.create(scope, id)

    override fun expression(expression: ICfnConditionExpression) {
      cdkBuilder.expression(expression.let(ICfnConditionExpression::unwrap))
    }

    public fun build(): software.amazon.awscdk.CfnCondition = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCondition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCondition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCondition): CfnCondition =
        CfnCondition(cdkObject)

    internal fun unwrap(wrapped: CfnCondition): software.amazon.awscdk.CfnCondition =
        wrapped.cdkObject
  }
}