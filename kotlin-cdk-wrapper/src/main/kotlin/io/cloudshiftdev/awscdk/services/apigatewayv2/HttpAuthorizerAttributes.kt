@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Reference to an http authorizer.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * HttpAuthorizerAttributes httpAuthorizerAttributes = HttpAuthorizerAttributes.builder()
 * .authorizerId("authorizerId")
 * .authorizerType("authorizerType")
 * .build();
 * ```
 */
public interface HttpAuthorizerAttributes {
  /**
   * Id of the Authorizer.
   */
  public fun authorizerId(): String

  /**
   * Type of authorizer.
   *
   * Possible values are:
   *
   * * JWT - JSON Web Token Authorizer
   * * CUSTOM - Lambda Authorizer
   * * NONE - No Authorization
   */
  public fun authorizerType(): String

  /**
   * A builder for [HttpAuthorizerAttributes]
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
     * * JWT - JSON Web Token Authorizer
     * * CUSTOM - Lambda Authorizer
     * * NONE - No Authorization
     */
    public fun authorizerType(authorizerType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerAttributes.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerAttributes.builder()

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
     * * JWT - JSON Web Token Authorizer
     * * CUSTOM - Lambda Authorizer
     * * NONE - No Authorization
     */
    override fun authorizerType(authorizerType: String) {
      cdkBuilder.authorizerType(authorizerType)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerAttributes,
  ) : CdkObject(cdkObject), HttpAuthorizerAttributes {
    /**
     * Id of the Authorizer.
     */
    override fun authorizerId(): String = unwrap(this).getAuthorizerId()

    /**
     * Type of authorizer.
     *
     * Possible values are:
     *
     * * JWT - JSON Web Token Authorizer
     * * CUSTOM - Lambda Authorizer
     * * NONE - No Authorization
     */
    override fun authorizerType(): String = unwrap(this).getAuthorizerType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpAuthorizerAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerAttributes):
        HttpAuthorizerAttributes = CdkObjectWrappers.wrap(cdkObject) as? HttpAuthorizerAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpAuthorizerAttributes):
        software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerAttributes = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerAttributes
  }
}
