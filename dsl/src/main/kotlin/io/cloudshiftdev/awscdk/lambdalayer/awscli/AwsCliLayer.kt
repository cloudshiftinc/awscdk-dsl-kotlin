package io.cloudshiftdev.awscdk.lambdalayer.awscli

import io.cloudshiftdev.awscdk.services.lambda.LayerVersion

public open class AwsCliLayer internal constructor(
  private val cdkObject: software.amazon.awscdk.lambdalayer.awscli.AwsCliLayer,
) : LayerVersion(cdkObject) {
  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.lambdalayer.awscli.AwsCliLayer): AwsCliLayer
        = AwsCliLayer(cdkObject)

    internal fun unwrap(wrapped: AwsCliLayer): software.amazon.awscdk.lambdalayer.awscli.AwsCliLayer
        = wrapped.cdkObject
  }
}
