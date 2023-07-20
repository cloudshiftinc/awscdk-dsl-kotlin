@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.workspaces

import kotlin.Unit
import software.amazon.awscdk.services.workspaces.CfnWorkspace

public inline
    fun CfnWorkspace.setWorkspaceProperties(block: CfnWorkspaceWorkspacePropertiesPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnWorkspaceWorkspacePropertiesPropertyDsl()
  builder.apply(block)
  return setWorkspaceProperties(builder.build())
}
