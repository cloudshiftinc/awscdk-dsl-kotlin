package io.cloudshiftdev.awscdk.services.bedrock

import kotlin.String

public interface IModel {
  public fun modelArn(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.bedrock.IModel,
  ) : IModel {
    override fun modelArn(): String = unwrap(this).getModelArn()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.IModel): IModel =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IModel): software.amazon.awscdk.services.bedrock.IModel = (wrapped
        as Wrapper).cdkObject
  }
}
