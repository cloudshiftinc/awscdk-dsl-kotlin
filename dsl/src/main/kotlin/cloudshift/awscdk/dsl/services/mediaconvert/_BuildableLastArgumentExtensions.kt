@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconvert

import kotlin.Unit
import software.amazon.awscdk.services.mediaconvert.CfnJobTemplate

public inline
    fun CfnJobTemplate.setAccelerationSettings(block: CfnJobTemplateAccelerationSettingsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnJobTemplateAccelerationSettingsPropertyDsl()
  builder.apply(block)
  return setAccelerationSettings(builder.build())
}
