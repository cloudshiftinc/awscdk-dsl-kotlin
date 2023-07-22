@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.waf.CfnXssMatchSet

/**
 * The part of a web request that you want to inspect, such as a specified header or a query string.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.*;
 * FieldToMatchProperty fieldToMatchProperty = FieldToMatchProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .data("data")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-xssmatchset-fieldtomatch.html)
 */
@CdkDslMarker
public class CfnXssMatchSetFieldToMatchPropertyDsl {
  private val cdkBuilder: CfnXssMatchSet.FieldToMatchProperty.Builder =
      CfnXssMatchSet.FieldToMatchProperty.builder()

  /**
   * @param data When the value of `Type` is `HEADER` , enter the name of the header that you want
   * AWS WAF to search, for example, `User-Agent` or `Referer` .
   * The name of the header is not case sensitive.
   *
   * When the value of `Type` is `SINGLE_QUERY_ARG` , enter the name of the parameter that you want
   * AWS WAF to search, for example, `UserName` or `SalesRegion` . The parameter name is not case
   * sensitive.
   *
   * If the value of `Type` is any other value, omit `Data` .
   */
  public fun `data`(`data`: String) {
    cdkBuilder.`data`(`data`)
  }

  /**
   * @param type The part of the web request that you want AWS WAF to search for a specified string.
   * 
   * Parts of a request that you can search include the following:
   *
   * * `HEADER` : A specified request header, for example, the value of the `User-Agent` or
   * `Referer` header. If you choose `HEADER` for the type, specify the name of the header in `Data` .
   * * `METHOD` : The HTTP method, which indicated the type of operation that the request is asking
   * the origin to perform. Amazon CloudFront supports the following methods: `DELETE` , `GET` , `HEAD`
   * , `OPTIONS` , `PATCH` , `POST` , and `PUT` .
   * * `QUERY_STRING` : A query string, which is the part of a URL that appears after a `?`
   * character, if any.
   * * `URI` : The part of a web request that identifies a resource, for example,
   * `/images/daily-ad.jpg` .
   * * `BODY` : The part of a request that contains any additional data that you want to send to
   * your web server as the HTTP request body, such as data from a form. The request body immediately
   * follows the request headers. Note that only the first `8192` bytes of the request body are
   * forwarded to AWS WAF for inspection. To allow or block requests based on the length of the body,
   * you can create a size constraint set.
   * * `SINGLE_QUERY_ARG` : The parameter in the query string that you will inspect, such as
   * *UserName* or *SalesRegion* . The maximum length for `SINGLE_QUERY_ARG` is 30 characters.
   * * `ALL_QUERY_ARGS` : Similar to `SINGLE_QUERY_ARG` , but rather than inspecting a single
   * parameter, AWS WAF will inspect all parameters within the query for the value or regex pattern
   * that you specify in `TargetString` .
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnXssMatchSet.FieldToMatchProperty = cdkBuilder.build()
}
