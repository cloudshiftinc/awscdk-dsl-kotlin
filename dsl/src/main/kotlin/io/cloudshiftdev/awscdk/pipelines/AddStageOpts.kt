package io.cloudshiftdev.awscdk.pipelines

import kotlin.Unit
import kotlin.collections.List

public interface AddStageOpts {
  public fun post(): List<Step> = unwrap(this).getPost()?.map(Step::wrap) ?: emptyList()

  public fun pre(): List<Step> = unwrap(this).getPre()?.map(Step::wrap) ?: emptyList()

  public fun stackSteps(): List<StackSteps> = unwrap(this).getStackSteps()?.map(StackSteps::wrap) ?:
      emptyList()

  public interface Builder {
    public fun post(post: List<Step>)

    public fun pre(pre: List<Step>)

    public fun stackSteps(stackSteps: List<StackSteps>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.AddStageOpts.Builder =
        software.amazon.awscdk.pipelines.AddStageOpts.builder()

    override fun post(post: List<Step>) {
      cdkBuilder.post(post.map(Step::unwrap))
    }

    override fun pre(pre: List<Step>) {
      cdkBuilder.pre(pre.map(Step::unwrap))
    }

    override fun stackSteps(stackSteps: List<StackSteps>) {
      cdkBuilder.stackSteps(stackSteps.map(StackSteps::unwrap))
    }

    public fun build(): software.amazon.awscdk.pipelines.AddStageOpts = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.pipelines.AddStageOpts,
  ) : AddStageOpts {
    override fun post(): List<Step> = unwrap(this).getPost()?.map(Step::wrap) ?: emptyList()

    override fun pre(): List<Step> = unwrap(this).getPre()?.map(Step::wrap) ?: emptyList()

    override fun stackSteps(): List<StackSteps> =
        unwrap(this).getStackSteps()?.map(StackSteps::wrap) ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AddStageOpts {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.AddStageOpts): AddStageOpts =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AddStageOpts): software.amazon.awscdk.pipelines.AddStageOpts =
        (wrapped as Wrapper).cdkObject
  }
}