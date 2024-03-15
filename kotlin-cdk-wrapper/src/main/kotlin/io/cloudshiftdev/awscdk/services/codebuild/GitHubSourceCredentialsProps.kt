@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface GitHubSourceCredentialsProps {
  public fun accessToken(): SecretValue

  @CdkDslMarker
  public interface Builder {
    public fun accessToken(accessToken: SecretValue)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codebuild.GitHubSourceCredentialsProps.Builder =
        software.amazon.awscdk.services.codebuild.GitHubSourceCredentialsProps.builder()

    override fun accessToken(accessToken: SecretValue) {
      cdkBuilder.accessToken(accessToken.let(SecretValue::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codebuild.GitHubSourceCredentialsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codebuild.GitHubSourceCredentialsProps,
  ) : CdkObject(cdkObject), GitHubSourceCredentialsProps {
    override fun accessToken(): SecretValue = unwrap(this).getAccessToken().let(SecretValue::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GitHubSourceCredentialsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.GitHubSourceCredentialsProps):
        GitHubSourceCredentialsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GitHubSourceCredentialsProps):
        software.amazon.awscdk.services.codebuild.GitHubSourceCredentialsProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codebuild.GitHubSourceCredentialsProps
  }
}