@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * The abstract interface of a CodeBuild build output.
 *
 * Implemented by `Artifacts`.
 */
public interface IArtifacts {
  /**
   * Callback when an Artifacts class is used in a CodeBuild Project.
   *
   * @param scope a root Construct that allows creating new Constructs. 
   * @param project the Project this Artifacts is used in. 
   */
  public fun bind(scope: Construct, project: IProject): ArtifactsConfig

  /**
   * The artifact identifier.
   *
   * This property is required on secondary artifacts.
   */
  public fun identifier(): String? = unwrap(this).getIdentifier()

  /**
   * The CodeBuild type of this artifact.
   */
  public fun type(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.IArtifacts): IArtifacts =
        CdkObjectWrappers.wrap(cdkObject) as IArtifacts

    internal fun unwrap(wrapped: IArtifacts): software.amazon.awscdk.services.codebuild.IArtifacts =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codebuild.IArtifacts
  }
}
