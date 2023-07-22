@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.CfnXssMatchSet
import software.constructs.Construct

/**
 * This is *AWS WAF Classic* documentation.
 *
 * For more information, see [AWS WAF
 * Classic](https://docs.aws.amazon.com/waf/latest/developerguide/classic-waf-chapter.html) in the
 * developer guide.
 *
 *
 * *For the latest version of AWS WAF* , use the AWS WAF V2 API and see the [AWS WAF Developer
 * Guide](https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html) . With the latest
 * version, AWS WAF has a single set of endpoints for regional and global use.
 *
 *
 * A complex type that contains `XssMatchTuple` objects, which specify the parts of web requests
 * that you want AWS WAF to inspect for cross-site scripting attacks and, if you want AWS WAF to
 * inspect a header, the name of the header. If a `XssMatchSet` contains more than one `XssMatchTuple`
 * object, a request needs to include cross-site scripting attacks in only one of the specified parts
 * of the request to be considered a match.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.*;
 * CfnXssMatchSet cfnXssMatchSet = CfnXssMatchSet.Builder.create(this, "MyCfnXssMatchSet")
 * .name("name")
 * .xssMatchTuples(List.of(XssMatchTupleProperty.builder()
 * .fieldToMatch(FieldToMatchProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .data("data")
 * .build())
 * .textTransformation("textTransformation")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html)
 */
@CdkDslMarker
public class CfnXssMatchSetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnXssMatchSet.Builder = CfnXssMatchSet.Builder.create(scope, id)

  private val _xssMatchTuples: MutableList<Any> = mutableListOf()

  /**
   * The name, if any, of the `XssMatchSet` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html#cfn-waf-xssmatchset-name)
   * @param name The name, if any, of the `XssMatchSet` . 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Specifies the parts of web requests that you want to inspect for cross-site scripting attacks.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html#cfn-waf-xssmatchset-xssmatchtuples)
   * @param xssMatchTuples Specifies the parts of web requests that you want to inspect for
   * cross-site scripting attacks. 
   */
  public fun xssMatchTuples(vararg xssMatchTuples: Any) {
    _xssMatchTuples.addAll(listOf(*xssMatchTuples))
  }

  /**
   * Specifies the parts of web requests that you want to inspect for cross-site scripting attacks.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html#cfn-waf-xssmatchset-xssmatchtuples)
   * @param xssMatchTuples Specifies the parts of web requests that you want to inspect for
   * cross-site scripting attacks. 
   */
  public fun xssMatchTuples(xssMatchTuples: Collection<Any>) {
    _xssMatchTuples.addAll(xssMatchTuples)
  }

  /**
   * Specifies the parts of web requests that you want to inspect for cross-site scripting attacks.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-xssmatchset.html#cfn-waf-xssmatchset-xssmatchtuples)
   * @param xssMatchTuples Specifies the parts of web requests that you want to inspect for
   * cross-site scripting attacks. 
   */
  public fun xssMatchTuples(xssMatchTuples: IResolvable) {
    cdkBuilder.xssMatchTuples(xssMatchTuples)
  }

  public fun build(): CfnXssMatchSet {
    if(_xssMatchTuples.isNotEmpty()) cdkBuilder.xssMatchTuples(_xssMatchTuples)
    return cdkBuilder.build()
  }
}
