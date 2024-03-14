package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface WebSocketAuthorizerAttributes {
  /**
   * Id of the Authorizer.
   */
  public fun authorizerId(): String

  /**
   * Type of authorizer.
   *
   * Possible values are:
   *
   * * CUSTOM - Lambda Authorizer
   * * NONE - No Authorization
   */
  public fun authorizerType(): String

  /**
   * A builder for [WebSocketAuthorizerAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorizerId Id of the Authorizer. 
     */
    public fun authorizerId(authorizerId: String)

    /**
     * @param authorizerType Type of authorizer. 
     * Possible values are:
     *
     * * CUSTOM - Lambda Authorizer
     * * NONE - No Authorization
     */
    public fun authorizerType(authorizerType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerAttributes.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerAttributes.builder()

    /**
     * @param authorizerId Id of the Authorizer. 
     */
    override fun authorizerId(authorizerId: String) {
      cdkBuilder.authorizerId(authorizerId)
    }

    /**
     * @param authorizerType Type of authorizer. 
     * Possible values are:
     *
     * * CUSTOM - Lambda Authorizer
     * * NONE - No Authorization
     */
    override fun authorizerType(authorizerType: String) {
      cdkBuilder.authorizerType(authorizerType)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerAttributes,
  ) : CdkObject(cdkObject), WebSocketAuthorizerAttributes {
    /**
     * Id of the Authorizer.
     */
    override fun authorizerId(): String = unwrap(this).getAuthorizerId()

    /**
     * Type of authorizer.
     *
     * Possible values are:
     *
     * * CUSTOM - Lambda Authorizer
     * * NONE - No Authorization
     */
    override fun authorizerType(): String = unwrap(this).getAuthorizerType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketAuthorizerAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerAttributes):
        WebSocketAuthorizerAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketAuthorizerAttributes):
        software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerAttributes = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerAttributes
  }
}
