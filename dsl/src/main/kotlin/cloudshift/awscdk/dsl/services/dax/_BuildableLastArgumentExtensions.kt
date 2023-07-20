@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dax

import kotlin.Unit
import software.amazon.awscdk.services.dax.CfnCluster

public inline
    fun CfnCluster.setSseSpecification(block: CfnClusterSSESpecificationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnClusterSSESpecificationPropertyDsl()
  builder.apply(block)
  return setSseSpecification(builder.build())
}
