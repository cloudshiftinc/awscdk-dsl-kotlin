@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public abstract class BaseDeploymentConfig internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codedeploy.BaseDeploymentConfig,
) : Resource(cdkObject), IBaseDeploymentConfig {
  public override fun deploymentConfigArn(): String = unwrap(this).getDeploymentConfigArn()

  public override fun deploymentConfigName(): String = unwrap(this).getDeploymentConfigName()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.BaseDeploymentConfig,
  ) : BaseDeploymentConfig(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.BaseDeploymentConfig):
        BaseDeploymentConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseDeploymentConfig):
        software.amazon.awscdk.services.codedeploy.BaseDeploymentConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.BaseDeploymentConfig
  }
}