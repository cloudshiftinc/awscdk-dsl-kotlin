@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Unit

public interface LambdaProps {
  public fun function(): IFunction

  public fun invocationType(): LambdaInvocationType? =
      unwrap(this).getInvocationType()?.let(LambdaInvocationType::wrap)

  public fun topic(): ITopic? = unwrap(this).getTopic()?.let(ITopic::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun function(function: IFunction)

    public fun invocationType(invocationType: LambdaInvocationType)

    public fun topic(topic: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.LambdaProps.Builder =
        software.amazon.awscdk.services.ses.actions.LambdaProps.builder()

    override fun function(function: IFunction) {
      cdkBuilder.function(function.let(IFunction::unwrap))
    }

    override fun invocationType(invocationType: LambdaInvocationType) {
      cdkBuilder.invocationType(invocationType.let(LambdaInvocationType::unwrap))
    }

    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.LambdaProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.actions.LambdaProps,
  ) : CdkObject(cdkObject), LambdaProps {
    override fun function(): IFunction = unwrap(this).getFunction().let(IFunction::wrap)

    override fun invocationType(): LambdaInvocationType? =
        unwrap(this).getInvocationType()?.let(LambdaInvocationType::wrap)

    override fun topic(): ITopic? = unwrap(this).getTopic()?.let(ITopic::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.LambdaProps):
        LambdaProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaProps):
        software.amazon.awscdk.services.ses.actions.LambdaProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.actions.LambdaProps
  }
}