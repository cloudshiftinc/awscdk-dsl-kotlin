@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL

/**
 * Custom request handling behavior that inserts custom headers into a web request.
 *
 * You can add custom request handling for AWS WAF to use when the rule action doesn't block the
 * request. For example, `CaptchaAction` for requests with valid t okens, and `AllowAction` .
 *
 * For information about customizing web requests and responses, see [Customizing web requests and
 * responses in AWS
 * WAF](https://docs.aws.amazon.com/waf/latest/developerguide/waf-custom-request-response.html) in the
 * *AWS WAF Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.wafv2.*;
 * CustomRequestHandlingProperty customRequestHandlingProperty =
 * CustomRequestHandlingProperty.builder()
 * .insertHeaders(List.of(CustomHTTPHeaderProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-customrequesthandling.html)
 */
@CdkDslMarker
public class CfnWebACLCustomRequestHandlingPropertyDsl {
  private val cdkBuilder: CfnWebACL.CustomRequestHandlingProperty.Builder =
      CfnWebACL.CustomRequestHandlingProperty.builder()

  private val _insertHeaders: MutableList<Any> = mutableListOf()

  /**
   * @param insertHeaders The HTTP headers to insert into the request. Duplicate header names are
   * not allowed. 
   * For information about the limits on count and size for custom request and response settings,
   * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
   * *AWS WAF Developer Guide* .
   */
  public fun insertHeaders(vararg insertHeaders: Any) {
    _insertHeaders.addAll(listOf(*insertHeaders))
  }

  /**
   * @param insertHeaders The HTTP headers to insert into the request. Duplicate header names are
   * not allowed. 
   * For information about the limits on count and size for custom request and response settings,
   * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
   * *AWS WAF Developer Guide* .
   */
  public fun insertHeaders(insertHeaders: Collection<Any>) {
    _insertHeaders.addAll(insertHeaders)
  }

  /**
   * @param insertHeaders The HTTP headers to insert into the request. Duplicate header names are
   * not allowed. 
   * For information about the limits on count and size for custom request and response settings,
   * see [AWS WAF quotas](https://docs.aws.amazon.com/waf/latest/developerguide/limits.html) in the
   * *AWS WAF Developer Guide* .
   */
  public fun insertHeaders(insertHeaders: IResolvable) {
    cdkBuilder.insertHeaders(insertHeaders)
  }

  public fun build(): CfnWebACL.CustomRequestHandlingProperty {
    if(_insertHeaders.isNotEmpty()) cdkBuilder.insertHeaders(_insertHeaders)
    return cdkBuilder.build()
  }
}
