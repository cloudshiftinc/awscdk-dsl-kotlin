package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGatewayResponse internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.CfnGatewayResponse,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The ID for the gateway response.
   *
   * For example: `abc123` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Response parameters (paths, query strings and headers) of the GatewayResponse as a
   * string-to-string map of key-value pairs.
   */
  public open fun responseParameters(): Any? = unwrap(this).getResponseParameters()

  /**
   * Response parameters (paths, query strings and headers) of the GatewayResponse as a
   * string-to-string map of key-value pairs.
   */
  public open fun responseParameters(`value`: IResolvable) {
    unwrap(this).setResponseParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * Response parameters (paths, query strings and headers) of the GatewayResponse as a
   * string-to-string map of key-value pairs.
   */
  public open fun responseParameters(`value`: Map<String, String>) {
    unwrap(this).setResponseParameters(`value`)
  }

  /**
   * Response templates of the GatewayResponse as a string-to-string map of key-value pairs.
   */
  public open fun responseTemplates(): Any? = unwrap(this).getResponseTemplates()

  /**
   * Response templates of the GatewayResponse as a string-to-string map of key-value pairs.
   */
  public open fun responseTemplates(`value`: IResolvable) {
    unwrap(this).setResponseTemplates(`value`.let(IResolvable::unwrap))
  }

  /**
   * Response templates of the GatewayResponse as a string-to-string map of key-value pairs.
   */
  public open fun responseTemplates(`value`: Map<String, String>) {
    unwrap(this).setResponseTemplates(`value`)
  }

  /**
   * The response type of the associated GatewayResponse.
   */
  public open fun responseType(): String = unwrap(this).getResponseType()

  /**
   * The response type of the associated GatewayResponse.
   */
  public open fun responseType(`value`: String) {
    unwrap(this).setResponseType(`value`)
  }

  /**
   * The string identifier of the associated RestApi.
   */
  public open fun restApiId(): String = unwrap(this).getRestApiId()

  /**
   * The string identifier of the associated RestApi.
   */
  public open fun restApiId(`value`: String) {
    unwrap(this).setRestApiId(`value`)
  }

  /**
   * The HTTP status code for this GatewayResponse.
   */
  public open fun statusCode(): String? = unwrap(this).getStatusCode()

  /**
   * The HTTP status code for this GatewayResponse.
   */
  public open fun statusCode(`value`: String) {
    unwrap(this).setStatusCode(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.CfnGatewayResponse].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Response parameters (paths, query strings and headers) of the GatewayResponse as a
     * string-to-string map of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responseparameters)
     * @param responseParameters Response parameters (paths, query strings and headers) of the
     * GatewayResponse as a string-to-string map of key-value pairs. 
     */
    public fun responseParameters(responseParameters: IResolvable)

    /**
     * Response parameters (paths, query strings and headers) of the GatewayResponse as a
     * string-to-string map of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responseparameters)
     * @param responseParameters Response parameters (paths, query strings and headers) of the
     * GatewayResponse as a string-to-string map of key-value pairs. 
     */
    public fun responseParameters(responseParameters: Map<String, String>)

    /**
     * Response templates of the GatewayResponse as a string-to-string map of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetemplates)
     * @param responseTemplates Response templates of the GatewayResponse as a string-to-string map
     * of key-value pairs. 
     */
    public fun responseTemplates(responseTemplates: IResolvable)

    /**
     * Response templates of the GatewayResponse as a string-to-string map of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetemplates)
     * @param responseTemplates Response templates of the GatewayResponse as a string-to-string map
     * of key-value pairs. 
     */
    public fun responseTemplates(responseTemplates: Map<String, String>)

    /**
     * The response type of the associated GatewayResponse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetype)
     * @param responseType The response type of the associated GatewayResponse. 
     */
    public fun responseType(responseType: String)

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-restapiid)
     * @param restApiId The string identifier of the associated RestApi. 
     */
    public fun restApiId(restApiId: String)

    /**
     * The HTTP status code for this GatewayResponse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-statuscode)
     * @param statusCode The HTTP status code for this GatewayResponse. 
     */
    public fun statusCode(statusCode: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnGatewayResponse.Builder =
        software.amazon.awscdk.services.apigateway.CfnGatewayResponse.Builder.create(scope, id)

    /**
     * Response parameters (paths, query strings and headers) of the GatewayResponse as a
     * string-to-string map of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responseparameters)
     * @param responseParameters Response parameters (paths, query strings and headers) of the
     * GatewayResponse as a string-to-string map of key-value pairs. 
     */
    override fun responseParameters(responseParameters: IResolvable) {
      cdkBuilder.responseParameters(responseParameters.let(IResolvable::unwrap))
    }

    /**
     * Response parameters (paths, query strings and headers) of the GatewayResponse as a
     * string-to-string map of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responseparameters)
     * @param responseParameters Response parameters (paths, query strings and headers) of the
     * GatewayResponse as a string-to-string map of key-value pairs. 
     */
    override fun responseParameters(responseParameters: Map<String, String>) {
      cdkBuilder.responseParameters(responseParameters)
    }

    /**
     * Response templates of the GatewayResponse as a string-to-string map of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetemplates)
     * @param responseTemplates Response templates of the GatewayResponse as a string-to-string map
     * of key-value pairs. 
     */
    override fun responseTemplates(responseTemplates: IResolvable) {
      cdkBuilder.responseTemplates(responseTemplates.let(IResolvable::unwrap))
    }

    /**
     * Response templates of the GatewayResponse as a string-to-string map of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetemplates)
     * @param responseTemplates Response templates of the GatewayResponse as a string-to-string map
     * of key-value pairs. 
     */
    override fun responseTemplates(responseTemplates: Map<String, String>) {
      cdkBuilder.responseTemplates(responseTemplates)
    }

    /**
     * The response type of the associated GatewayResponse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetype)
     * @param responseType The response type of the associated GatewayResponse. 
     */
    override fun responseType(responseType: String) {
      cdkBuilder.responseType(responseType)
    }

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-restapiid)
     * @param restApiId The string identifier of the associated RestApi. 
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    /**
     * The HTTP status code for this GatewayResponse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-statuscode)
     * @param statusCode The HTTP status code for this GatewayResponse. 
     */
    override fun statusCode(statusCode: String) {
      cdkBuilder.statusCode(statusCode)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnGatewayResponse =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGatewayResponse {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGatewayResponse(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnGatewayResponse):
        CfnGatewayResponse = CfnGatewayResponse(cdkObject)

    internal fun unwrap(wrapped: CfnGatewayResponse):
        software.amazon.awscdk.services.apigateway.CfnGatewayResponse = wrapped.cdkObject
  }
}
