package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject

public interface IAccessLogDestination {
  /**
   * Binds this destination to the RestApi Stage.
   *
   * @param stage 
   */
  public fun bind(stage: IStage): AccessLogDestinationConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.IAccessLogDestination,
  ) : CdkObject(cdkObject), IAccessLogDestination {
    /**
     * Binds this destination to the RestApi Stage.
     *
     * @param stage 
     */
    override fun bind(stage: IStage): AccessLogDestinationConfig =
        unwrap(this).bind(stage.let(IStage::unwrap)).let(AccessLogDestinationConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IAccessLogDestination):
        IAccessLogDestination = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAccessLogDestination):
        software.amazon.awscdk.services.apigateway.IAccessLogDestination = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.IAccessLogDestination
  }
}
