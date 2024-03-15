@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface HostedConfigurationProps : ConfigurationProps {
  public fun content(): ConfigurationContent

  public fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

  public fun versionLabel(): String? = unwrap(this).getVersionLabel()

  @CdkDslMarker
  public interface Builder {
    public fun application(application: IApplication)

    public fun content(content: ConfigurationContent)

    public fun deployTo(deployTo: List<IEnvironment>)

    public fun deployTo(vararg deployTo: IEnvironment)

    public fun deploymentKey(deploymentKey: IKey)

    public fun deploymentStrategy(deploymentStrategy: IDeploymentStrategy)

    public fun description(description: String)

    public fun latestVersionNumber(latestVersionNumber: Number)

    public fun name(name: String)

    public fun type(type: ConfigurationType)

    public fun validators(validators: List<IValidator>)

    public fun validators(vararg validators: IValidator)

    public fun versionLabel(versionLabel: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appconfig.HostedConfigurationProps.Builder =
        software.amazon.awscdk.services.appconfig.HostedConfigurationProps.builder()

    override fun application(application: IApplication) {
      cdkBuilder.application(application.let(IApplication::unwrap))
    }

    override fun content(content: ConfigurationContent) {
      cdkBuilder.content(content.let(ConfigurationContent::unwrap))
    }

    override fun deployTo(deployTo: List<IEnvironment>) {
      cdkBuilder.deployTo(deployTo.map(IEnvironment::unwrap))
    }

    override fun deployTo(vararg deployTo: IEnvironment): Unit = deployTo(deployTo.toList())

    override fun deploymentKey(deploymentKey: IKey) {
      cdkBuilder.deploymentKey(deploymentKey.let(IKey::unwrap))
    }

    override fun deploymentStrategy(deploymentStrategy: IDeploymentStrategy) {
      cdkBuilder.deploymentStrategy(deploymentStrategy.let(IDeploymentStrategy::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun latestVersionNumber(latestVersionNumber: Number) {
      cdkBuilder.latestVersionNumber(latestVersionNumber)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun type(type: ConfigurationType) {
      cdkBuilder.type(type.let(ConfigurationType::unwrap))
    }

    override fun validators(validators: List<IValidator>) {
      cdkBuilder.validators(validators.map(IValidator::unwrap))
    }

    override fun validators(vararg validators: IValidator): Unit = validators(validators.toList())

    override fun versionLabel(versionLabel: String) {
      cdkBuilder.versionLabel(versionLabel)
    }

    public fun build(): software.amazon.awscdk.services.appconfig.HostedConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.HostedConfigurationProps,
  ) : CdkObject(cdkObject), HostedConfigurationProps {
    override fun application(): IApplication = unwrap(this).getApplication().let(IApplication::wrap)

    override fun content(): ConfigurationContent =
        unwrap(this).getContent().let(ConfigurationContent::wrap)

    override fun deployTo(): List<IEnvironment> =
        unwrap(this).getDeployTo()?.map(IEnvironment::wrap) ?: emptyList()

    override fun deploymentKey(): IKey? = unwrap(this).getDeploymentKey()?.let(IKey::wrap)

    override fun deploymentStrategy(): IDeploymentStrategy? =
        unwrap(this).getDeploymentStrategy()?.let(IDeploymentStrategy::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun latestVersionNumber(): Number? = unwrap(this).getLatestVersionNumber()

    override fun name(): String? = unwrap(this).getName()

    override fun type(): ConfigurationType? = unwrap(this).getType()?.let(ConfigurationType::wrap)

    override fun validators(): List<IValidator> =
        unwrap(this).getValidators()?.map(IValidator::wrap) ?: emptyList()

    override fun versionLabel(): String? = unwrap(this).getVersionLabel()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HostedConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.HostedConfigurationProps):
        HostedConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HostedConfigurationProps):
        software.amazon.awscdk.services.appconfig.HostedConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.HostedConfigurationProps
  }
}
