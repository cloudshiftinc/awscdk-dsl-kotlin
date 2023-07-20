@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codestar

import kotlin.Unit
import software.amazon.awscdk.services.codestar.CfnGitHubRepository

public inline fun CfnGitHubRepository.setCode(block: CfnGitHubRepositoryCodePropertyDsl.() -> Unit =
    {}) {
  val builder = CfnGitHubRepositoryCodePropertyDsl()
  builder.apply(block)
  return setCode(builder.build())
}
