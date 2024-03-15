@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Unit
import kotlin.collections.List

public interface EcrDockerCredentialOptions {
  public fun assumeRole(): IRole? = unwrap(this).getAssumeRole()?.let(IRole::wrap)

  public fun usages(): List<DockerCredentialUsage> =
      unwrap(this).getUsages()?.map(DockerCredentialUsage::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun assumeRole(assumeRole: IRole)

    public fun usages(usages: List<DockerCredentialUsage>)

    public fun usages(vararg usages: DockerCredentialUsage)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.EcrDockerCredentialOptions.Builder =
        software.amazon.awscdk.pipelines.EcrDockerCredentialOptions.builder()

    override fun assumeRole(assumeRole: IRole) {
      cdkBuilder.assumeRole(assumeRole.let(IRole::unwrap))
    }

    override fun usages(usages: List<DockerCredentialUsage>) {
      cdkBuilder.usages(usages.map(DockerCredentialUsage::unwrap))
    }

    override fun usages(vararg usages: DockerCredentialUsage): Unit = usages(usages.toList())

    public fun build(): software.amazon.awscdk.pipelines.EcrDockerCredentialOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.EcrDockerCredentialOptions,
  ) : CdkObject(cdkObject), EcrDockerCredentialOptions {
    override fun assumeRole(): IRole? = unwrap(this).getAssumeRole()?.let(IRole::wrap)

    override fun usages(): List<DockerCredentialUsage> =
        unwrap(this).getUsages()?.map(DockerCredentialUsage::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcrDockerCredentialOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.EcrDockerCredentialOptions):
        EcrDockerCredentialOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcrDockerCredentialOptions):
        software.amazon.awscdk.pipelines.EcrDockerCredentialOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.pipelines.EcrDockerCredentialOptions
  }
}
