@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.BaseLogDriverProps

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * BaseLogDriverProps baseLogDriverProps = BaseLogDriverProps.builder()
 * .env(List.of("env"))
 * .envRegex("envRegex")
 * .labels(List.of("labels"))
 * .tag("tag")
 * .build();
 * ```
 */
@CdkDslMarker
public class BaseLogDriverPropsDsl {
  private val cdkBuilder: BaseLogDriverProps.Builder = BaseLogDriverProps.builder()

  private val _env: MutableList<String> = mutableListOf()

  private val _labels: MutableList<String> = mutableListOf()

  /**
   * @param env The env option takes an array of keys.
   * If there is collision between
   * label and env keys, the value of the env takes precedence. Adds additional fields
   * to the extra attributes of a logging message.
   */
  public fun env(vararg env: String) {
    _env.addAll(listOf(*env))
  }

  /**
   * @param env The env option takes an array of keys.
   * If there is collision between
   * label and env keys, the value of the env takes precedence. Adds additional fields
   * to the extra attributes of a logging message.
   */
  public fun env(env: Collection<String>) {
    _env.addAll(env)
  }

  /**
   * @param envRegex The env-regex option is similar to and compatible with env.
   * Its value is a regular
   * expression to match logging-related environment variables. It is used for advanced
   * log tag options.
   */
  public fun envRegex(envRegex: String) {
    cdkBuilder.envRegex(envRegex)
  }

  /**
   * @param labels The labels option takes an array of keys.
   * If there is collision
   * between label and env keys, the value of the env takes precedence. Adds additional
   * fields to the extra attributes of a logging message.
   */
  public fun labels(vararg labels: String) {
    _labels.addAll(listOf(*labels))
  }

  /**
   * @param labels The labels option takes an array of keys.
   * If there is collision
   * between label and env keys, the value of the env takes precedence. Adds additional
   * fields to the extra attributes of a logging message.
   */
  public fun labels(labels: Collection<String>) {
    _labels.addAll(labels)
  }

  /**
   * @param tag By default, Docker uses the first 12 characters of the container ID to tag log
   * messages.
   * Refer to the log tag option documentation for customizing the
   * log tag format.
   */
  public fun tag(tag: String) {
    cdkBuilder.tag(tag)
  }

  public fun build(): BaseLogDriverProps {
    if(_env.isNotEmpty()) cdkBuilder.env(_env)
    if(_labels.isNotEmpty()) cdkBuilder.labels(_labels)
    return cdkBuilder.build()
  }
}
