@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.qldb

import kotlin.Unit
import software.amazon.awscdk.services.qldb.CfnStream

public inline
    fun CfnStream.setKinesisConfiguration(block: CfnStreamKinesisConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnStreamKinesisConfigurationPropertyDsl()
  builder.apply(block)
  return setKinesisConfiguration(builder.build())
}
