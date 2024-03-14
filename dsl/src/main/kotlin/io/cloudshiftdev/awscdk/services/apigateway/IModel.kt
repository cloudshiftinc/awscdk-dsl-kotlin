package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public interface IModel {
  /**
   * Returns the model name, such as 'myModel'.
   */
  public fun modelId(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.IModel,
  ) : CdkObject(cdkObject), IModel {
    /**
     * Returns the model name, such as 'myModel'.
     */
    override fun modelId(): String = unwrap(this).getModelId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IModel): IModel =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IModel): software.amazon.awscdk.services.apigateway.IModel =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.IModel
  }
}
