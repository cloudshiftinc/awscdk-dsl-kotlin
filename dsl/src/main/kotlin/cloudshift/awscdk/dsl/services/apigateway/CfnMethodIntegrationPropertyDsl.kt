@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnMethod

/**
 * `Integration` is a property of the
 * [AWS::ApiGateway::Method](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html)
 * resource that specifies information about the target backend that a method calls.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
 * IntegrationProperty integrationProperty = IntegrationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .cacheKeyParameters(List.of("cacheKeyParameters"))
 * .cacheNamespace("cacheNamespace")
 * .connectionId("connectionId")
 * .connectionType("connectionType")
 * .contentHandling("contentHandling")
 * .credentials("credentials")
 * .integrationHttpMethod("integrationHttpMethod")
 * .integrationResponses(List.of(IntegrationResponseProperty.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .contentHandling("contentHandling")
 * .responseParameters(Map.of(
 * "responseParametersKey", "responseParameters"))
 * .responseTemplates(Map.of(
 * "responseTemplatesKey", "responseTemplates"))
 * .selectionPattern("selectionPattern")
 * .build()))
 * .passthroughBehavior("passthroughBehavior")
 * .requestParameters(Map.of(
 * "requestParametersKey", "requestParameters"))
 * .requestTemplates(Map.of(
 * "requestTemplatesKey", "requestTemplates"))
 * .timeoutInMillis(123)
 * .uri("uri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html)
 */
@CdkDslMarker
public class CfnMethodIntegrationPropertyDsl {
  private val cdkBuilder: CfnMethod.IntegrationProperty.Builder =
      CfnMethod.IntegrationProperty.builder()

  private val _cacheKeyParameters: MutableList<String> = mutableListOf()

  private val _integrationResponses: MutableList<Any> = mutableListOf()

  /**
   * @param cacheKeyParameters A list of request parameters whose values API Gateway caches.
   * To be valid values for `cacheKeyParameters` , these parameters must also be specified for
   * Method `requestParameters` .
   */
  public fun cacheKeyParameters(vararg cacheKeyParameters: String) {
    _cacheKeyParameters.addAll(listOf(*cacheKeyParameters))
  }

  /**
   * @param cacheKeyParameters A list of request parameters whose values API Gateway caches.
   * To be valid values for `cacheKeyParameters` , these parameters must also be specified for
   * Method `requestParameters` .
   */
  public fun cacheKeyParameters(cacheKeyParameters: Collection<String>) {
    _cacheKeyParameters.addAll(cacheKeyParameters)
  }

  /**
   * @param cacheNamespace Specifies a group of related cached parameters.
   * By default, API Gateway uses the resource ID as the `cacheNamespace` . You can specify the same
   * `cacheNamespace` across resources to return the same cached data for requests to different
   * resources.
   */
  public fun cacheNamespace(cacheNamespace: String) {
    cdkBuilder.cacheNamespace(cacheNamespace)
  }

  /**
   * @param connectionId The ID of the VpcLink used for the integration when
   * `connectionType=VPC_LINK` and undefined, otherwise.
   */
  public fun connectionId(connectionId: String) {
    cdkBuilder.connectionId(connectionId)
  }

  /**
   * @param connectionType The type of the network connection to the integration endpoint.
   * The valid value is `INTERNET` for connections through the public routable internet or
   * `VPC_LINK` for private connections between API Gateway and a network load balancer in a VPC. The
   * default value is `INTERNET` .
   */
  public fun connectionType(connectionType: String) {
    cdkBuilder.connectionType(connectionType)
  }

  /**
   * @param contentHandling Specifies how to handle request payload content type conversions.
   * Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT` , with the following behaviors:
   *
   * If this property is not defined, the request payload will be passed through from the method
   * request to integration request without modification, provided that the `passthroughBehavior` is
   * configured to support payload pass-through.
   */
  public fun contentHandling(contentHandling: String) {
    cdkBuilder.contentHandling(contentHandling)
  }

  /**
   * @param credentials Specifies the credentials required for the integration, if any.
   * For AWS integrations, three options are available. To specify an IAM Role for API Gateway to
   * assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be passed
   * through from the request, specify the string `arn:aws:iam::\*:user/\*` . To use resource-based
   * permissions on supported AWS services, specify null.
   */
  public fun credentials(credentials: String) {
    cdkBuilder.credentials(credentials)
  }

  /**
   * @param integrationHttpMethod Specifies the integration's HTTP method type.
   * For the Type property, if you specify `MOCK` , this property is optional. For Lambda
   * integrations, you must set the integration method to `POST` . For all other types, you must
   * specify this property.
   */
  public fun integrationHttpMethod(integrationHttpMethod: String) {
    cdkBuilder.integrationHttpMethod(integrationHttpMethod)
  }

  /**
   * @param integrationResponses Specifies the integration's responses.
   */
  public fun integrationResponses(vararg integrationResponses: Any) {
    _integrationResponses.addAll(listOf(*integrationResponses))
  }

  /**
   * @param integrationResponses Specifies the integration's responses.
   */
  public fun integrationResponses(integrationResponses: Collection<Any>) {
    _integrationResponses.addAll(integrationResponses)
  }

  /**
   * @param integrationResponses Specifies the integration's responses.
   */
  public fun integrationResponses(integrationResponses: IResolvable) {
    cdkBuilder.integrationResponses(integrationResponses)
  }

  /**
   * @param passthroughBehavior Specifies how the method request body of an unmapped content type
   * will be passed through the integration request to the back end without transformation.
   * A content type is unmapped if no mapping template is defined in the integration or the content
   * type does not match any of the mapped content types, as specified in `requestTemplates` . The
   * valid value is one of the following: `WHEN_NO_MATCH` : passes the method request body through the
   * integration request to the back end without transformation when the method request content type
   * does not match any content type associated with the mapping templates defined in the integration
   * request. `WHEN_NO_TEMPLATES` : passes the method request body through the integration request to
   * the back end without transformation when no mapping template is defined in the integration
   * request. If a template is defined when this option is selected, the method request of an unmapped
   * content-type will be rejected with an HTTP 415 Unsupported Media Type response. `NEVER` : rejects
   * the method request with an HTTP 415 Unsupported Media Type response when either the method request
   * content type does not match any content type associated with the mapping templates defined in the
   * integration request or no mapping template is defined in the integration request.
   */
  public fun passthroughBehavior(passthroughBehavior: String) {
    cdkBuilder.passthroughBehavior(passthroughBehavior)
  }

  /**
   * @param requestParameters A key-value map specifying request parameters that are passed from the
   * method request to the back end.
   * The key is an integration request parameter name and the associated value is a method request
   * parameter value or static value that must be enclosed within single quotes and pre-encoded as
   * required by the back end. The method request parameter value must match the pattern of
   * `method.request.{location}.{name}` , where `location` is `querystring` , `path` , or `header` and
   * `name` must be a valid and unique method request parameter name.
   */
  public fun requestParameters(requestParameters: Map<String, String>) {
    cdkBuilder.requestParameters(requestParameters)
  }

  /**
   * @param requestParameters A key-value map specifying request parameters that are passed from the
   * method request to the back end.
   * The key is an integration request parameter name and the associated value is a method request
   * parameter value or static value that must be enclosed within single quotes and pre-encoded as
   * required by the back end. The method request parameter value must match the pattern of
   * `method.request.{location}.{name}` , where `location` is `querystring` , `path` , or `header` and
   * `name` must be a valid and unique method request parameter name.
   */
  public fun requestParameters(requestParameters: IResolvable) {
    cdkBuilder.requestParameters(requestParameters)
  }

  /**
   * @param requestTemplates Represents a map of Velocity templates that are applied on the request
   * payload based on the value of the Content-Type header sent by the client.
   * The content type value is the key in this map, and the template (as a String) is the value.
   */
  public fun requestTemplates(requestTemplates: Map<String, String>) {
    cdkBuilder.requestTemplates(requestTemplates)
  }

  /**
   * @param requestTemplates Represents a map of Velocity templates that are applied on the request
   * payload based on the value of the Content-Type header sent by the client.
   * The content type value is the key in this map, and the template (as a String) is the value.
   */
  public fun requestTemplates(requestTemplates: IResolvable) {
    cdkBuilder.requestTemplates(requestTemplates)
  }

  /**
   * @param timeoutInMillis Custom timeout between 50 and 29,000 milliseconds.
   * The default value is 29,000 milliseconds or 29 seconds.
   */
  public fun timeoutInMillis(timeoutInMillis: Number) {
    cdkBuilder.timeoutInMillis(timeoutInMillis)
  }

  /**
   * @param type Specifies an API method integration type. The valid value is one of the following:.
   * 
   * For the HTTP and HTTP proxy integrations, each integration can specify a protocol (
   * `http/https` ), port and path. Standard 80 and 443 ports are supported as well as custom ports
   * above 1024. An HTTP or HTTP proxy integration with a `connectionType` of `VPC_LINK` is referred to
   * as a private integration and uses a VpcLink to connect API Gateway to a network load balancer of a
   * VPC.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param uri Specifies Uniform Resource Identifier (URI) of the integration endpoint.
   * For `HTTP` or `HTTP_PROXY` integrations, the URI must be a fully formed, encoded HTTP(S) URL
   * according to the RFC-3986 specification for standard integrations. If `connectionType` is
   * `VPC_LINK` specify the Network Load Balancer DNS name. For `AWS` or `AWS_PROXY` integrations, the
   * URI is of the form
   * `arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}` . Here,
   * {Region} is the API Gateway region (e.g., us-east-1); {service} is the name of the integrated AWS
   * service (e.g., s3); and {subdomain} is a designated subdomain supported by certain AWS service for
   * fast host-name lookup. action can be used for an AWS service action-based API, using an
   * Action={name}&amp;{p1}={v1}&amp;p2={v2}... query string. The ensuing {service_api} refers to a
   * supported action {name} plus any required input parameters. Alternatively, path can be used for an
   * AWS service path-based API. The ensuing service_api refers to the path to an AWS service resource,
   * including the region of the integrated AWS service, if applicable. For example, for integration
   * with the S3 API of GetObject, the uri can be either
   * `arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key}` or
   * `arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}`
   */
  public fun uri(uri: String) {
    cdkBuilder.uri(uri)
  }

  public fun build(): CfnMethod.IntegrationProperty {
    if(_cacheKeyParameters.isNotEmpty()) cdkBuilder.cacheKeyParameters(_cacheKeyParameters)
    if(_integrationResponses.isNotEmpty()) cdkBuilder.integrationResponses(_integrationResponses)
    return cdkBuilder.build()
  }
}
