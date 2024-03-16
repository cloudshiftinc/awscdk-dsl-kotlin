@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents a reference to a CodeDeploy Application deploying to EC2/on-premise instances.
 *
 * If you're managing the Application alongside the rest of your CDK resources,
 * use the `ServerApplication` class.
 *
 * If you want to reference an already existing Application,
 * or one defined in a different CDK Stack,
 * use the `#fromServerApplicationName` method.
 */
public interface IServerApplication : IResource {
  /**
   *
   */
  public fun applicationArn(): String

  /**
   *
   */
  public fun applicationName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.IServerApplication):
        IServerApplication = CdkObjectWrappers.wrap(cdkObject) as IServerApplication

    internal fun unwrap(wrapped: IServerApplication):
        software.amazon.awscdk.services.codedeploy.IServerApplication = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.IServerApplication
  }
}
