@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fis

import kotlin.Unit
import software.amazon.awscdk.services.fis.CfnExperimentTemplate

public inline
    fun CfnExperimentTemplate.setLogConfiguration(block: CfnExperimentTemplateExperimentTemplateLogConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnExperimentTemplateExperimentTemplateLogConfigurationPropertyDsl()
  builder.apply(block)
  return setLogConfiguration(builder.build())
}
