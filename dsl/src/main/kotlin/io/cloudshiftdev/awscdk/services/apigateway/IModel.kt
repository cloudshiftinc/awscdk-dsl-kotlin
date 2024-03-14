package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.String

public interface IModel {
  public fun modelId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.IModel,
  ) : IModel {
    public override fun modelId(): String = unwrap(this).getModelId()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IModel): IModel =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IModel): software.amazon.awscdk.services.apigateway.IModel =
        (wrapped as Wrapper).cdkObject
  }
}
