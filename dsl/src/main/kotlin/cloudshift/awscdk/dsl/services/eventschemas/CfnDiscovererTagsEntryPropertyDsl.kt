@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eventschemas

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.eventschemas.CfnDiscoverer

/**
 * Tags to associate with the discoverer.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eventschemas.*;
 * TagsEntryProperty tagsEntryProperty = TagsEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eventschemas-discoverer-tagsentry.html)
 */
@CdkDslMarker
public class CfnDiscovererTagsEntryPropertyDsl {
  private val cdkBuilder: CfnDiscoverer.TagsEntryProperty.Builder =
      CfnDiscoverer.TagsEntryProperty.builder()

  /**
   * @param key They key of a key-value pair. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value They value of a key-value pair. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnDiscoverer.TagsEntryProperty = cdkBuilder.build()
}
