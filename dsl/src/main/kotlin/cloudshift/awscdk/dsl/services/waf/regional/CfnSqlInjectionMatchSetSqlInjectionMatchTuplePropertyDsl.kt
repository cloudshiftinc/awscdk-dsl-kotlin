@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.waf.regional

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.waf.regional.CfnSqlInjectionMatchSet

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
 * Specifies the part of a web request that you want AWS WAF to inspect for snippets of malicious
 * SQL code and, if you want AWS WAF to inspect a header, the name of the header.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.waf.regional.*;
 * SqlInjectionMatchTupleProperty sqlInjectionMatchTupleProperty =
 * SqlInjectionMatchTupleProperty.builder()
 * .fieldToMatch(FieldToMatchProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .data("data")
 * .build())
 * .textTransformation("textTransformation")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sqlinjectionmatchset-sqlinjectionmatchtuple.html)
 */
@CdkDslMarker
public class CfnSqlInjectionMatchSetSqlInjectionMatchTuplePropertyDsl {
  private val cdkBuilder: CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.Builder =
      CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty.builder()

  /**
   * @param fieldToMatch The part of a web request that you want AWS WAF to inspect, such as a
   * specific header or a query string. 
   */
  public fun fieldToMatch(fieldToMatch: IResolvable) {
    cdkBuilder.fieldToMatch(fieldToMatch)
  }

  /**
   * @param fieldToMatch The part of a web request that you want AWS WAF to inspect, such as a
   * specific header or a query string. 
   */
  public fun fieldToMatch(fieldToMatch: CfnSqlInjectionMatchSet.FieldToMatchProperty) {
    cdkBuilder.fieldToMatch(fieldToMatch)
  }

  /**
   * @param textTransformation Text transformations eliminate some of the unusual formatting that
   * attackers use in web requests in an effort to bypass AWS WAF . 
   * If you specify a transformation, AWS WAF performs the transformation on `FieldToMatch` before
   * inspecting it for a match.
   *
   * You can only specify a single type of TextTransformation.
   *
   * *CMD_LINE*
   *
   * When you're concerned that attackers are injecting an operating system command line command and
   * using unusual formatting to disguise some or all of the command, use this option to perform the
   * following transformations:
   *
   * * Delete the following characters: \ " ' ^
   * * Delete spaces before the following characters: / (
   * * Replace the following characters with a space: , ;
   * * Replace multiple spaces with one space
   * * Convert uppercase letters (A-Z) to lowercase (a-z)
   *
   * *COMPRESS_WHITE_SPACE*
   *
   * Use this option to replace the following characters with a space character (decimal 32):
   *
   * * \f, formfeed, decimal 12
   * * \t, tab, decimal 9
   * * \n, newline, decimal 10
   * * \r, carriage return, decimal 13
   * * \v, vertical tab, decimal 11
   * * non-breaking space, decimal 160
   *
   * `COMPRESS_WHITE_SPACE` also replaces multiple spaces with one space.
   *
   * *HTML_ENTITY_DECODE*
   *
   * Use this option to replace HTML-encoded characters with unencoded characters.
   * `HTML_ENTITY_DECODE` performs the following operations:
   *
   * * Replaces `(ampersand)quot;` with `"`
   * * Replaces `(ampersand)nbsp;` with a non-breaking space, decimal 160
   * * Replaces `(ampersand)lt;` with a "less than" symbol
   * * Replaces `(ampersand)gt;` with `&gt;`
   * * Replaces characters that are represented in hexadecimal format, `(ampersand)#xhhhh;` , with
   * the corresponding characters
   * * Replaces characters that are represented in decimal format, `(ampersand)#nnnn;` , with the
   * corresponding characters
   *
   * *LOWERCASE*
   *
   * Use this option to convert uppercase letters (A-Z) to lowercase (a-z).
   *
   * *URL_DECODE*
   *
   * Use this option to decode a URL-encoded value.
   *
   * *NONE*
   *
   * Specify `NONE` if you don't want to perform any text transformations.
   */
  public fun textTransformation(textTransformation: String) {
    cdkBuilder.textTransformation(textTransformation)
  }

  public fun build(): CfnSqlInjectionMatchSet.SqlInjectionMatchTupleProperty = cdkBuilder.build()
}
