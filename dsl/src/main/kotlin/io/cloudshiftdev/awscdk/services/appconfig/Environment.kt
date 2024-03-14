package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Environment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appconfig.Environment,
) : Resource(cdkObject), IEnvironment, IExtensible {
  public override fun addExtension(extension: IExtension) {
    unwrap(this).addExtension(extension.let(IExtension::unwrap))
  }

  public override fun application(): IApplication? =
      unwrap(this).getApplication()?.let(IApplication::wrap)

  public override fun applicationId(): String = unwrap(this).getApplicationId()

  public override fun description(): String? = unwrap(this).getDescription()

  public override fun environmentArn(): String = unwrap(this).getEnvironmentArn()

  public override fun environmentId(): String = unwrap(this).getEnvironmentId()

  public override fun monitors(): List<Monitor> = unwrap(this).getMonitors()?.map(Monitor::wrap) ?:
      emptyList()

  public override fun name(): String? = unwrap(this).getName()

  public override fun on(actionPoint: ActionPoint, eventDestination: IEventDestination) {
    unwrap(this).on(actionPoint.let(ActionPoint::unwrap),
        eventDestination.let(IEventDestination::unwrap))
  }

  public override fun on(
    actionPoint: ActionPoint,
    eventDestination: IEventDestination,
    options: ExtensionOptions,
  ) {
    unwrap(this).on(actionPoint.let(ActionPoint::unwrap),
        eventDestination.let(IEventDestination::unwrap), options.let(ExtensionOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0194001758d182c355eb63683c585f40699f2a8a5aa9624c1b81e4b64b8fee31")
  public override fun on(
    actionPoint: ActionPoint,
    eventDestination: IEventDestination,
    options: ExtensionOptions.Builder.() -> Unit,
  ): Unit = on(actionPoint, eventDestination, ExtensionOptions(options))

  public override fun onDeploymentBaking(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentBaking(eventDestination.let(IEventDestination::unwrap))
  }

  public override fun onDeploymentBaking(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentBaking(eventDestination.let(IEventDestination::unwrap),
        options.let(ExtensionOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("51413e14b67e6e3e78f3e45bf6cab9b9cba8e950d5fac88ca48f8e3e2023c82c")
  public override fun onDeploymentBaking(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentBaking(eventDestination,
      ExtensionOptions(options))

  public override fun onDeploymentComplete(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentComplete(eventDestination.let(IEventDestination::unwrap))
  }

  public override fun onDeploymentComplete(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentComplete(eventDestination.let(IEventDestination::unwrap),
        options.let(ExtensionOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c3e400dd20332bd0d2c232c5fc5ae8aba3a4e07c8bbd57bb17c41e6f624ded89")
  public override fun onDeploymentComplete(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentComplete(eventDestination,
      ExtensionOptions(options))

  public override fun onDeploymentRolledBack(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentRolledBack(eventDestination.let(IEventDestination::unwrap))
  }

  public override fun onDeploymentRolledBack(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentRolledBack(eventDestination.let(IEventDestination::unwrap),
        options.let(ExtensionOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("63bb6d64a26c6accd5567eb325ec58f0c47ae68f0a1bb9384009e199a550f9c8")
  public override fun onDeploymentRolledBack(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentRolledBack(eventDestination,
      ExtensionOptions(options))

  public override fun onDeploymentStart(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentStart(eventDestination.let(IEventDestination::unwrap))
  }

  public override fun onDeploymentStart(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentStart(eventDestination.let(IEventDestination::unwrap),
        options.let(ExtensionOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0131929b795a0129d9ba80efb4ca2e3a18629b79884e7818930b531df0c4d332")
  public override fun onDeploymentStart(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentStart(eventDestination,
      ExtensionOptions(options))

  public override fun onDeploymentStep(eventDestination: IEventDestination) {
    unwrap(this).onDeploymentStep(eventDestination.let(IEventDestination::unwrap))
  }

  public override fun onDeploymentStep(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).onDeploymentStep(eventDestination.let(IEventDestination::unwrap),
        options.let(ExtensionOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0fbc04022333094d4a1a9362f893671a1ace386fa2c11455572f1812c43cf137")
  public override fun onDeploymentStep(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = onDeploymentStep(eventDestination,
      ExtensionOptions(options))

  public override fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination) {
    unwrap(this).preCreateHostedConfigurationVersion(eventDestination.let(IEventDestination::unwrap))
  }

  public override fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).preCreateHostedConfigurationVersion(eventDestination.let(IEventDestination::unwrap),
        options.let(ExtensionOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("21cb7629406f579965cdf52846e7b2288b00565b4a6c6ec26df770e81fc6f51c")
  public override fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit =
      preCreateHostedConfigurationVersion(eventDestination, ExtensionOptions(options))

  public override fun preStartDeployment(eventDestination: IEventDestination) {
    unwrap(this).preStartDeployment(eventDestination.let(IEventDestination::unwrap))
  }

  public override fun preStartDeployment(eventDestination: IEventDestination,
      options: ExtensionOptions) {
    unwrap(this).preStartDeployment(eventDestination.let(IEventDestination::unwrap),
        options.let(ExtensionOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("859757079ee9049748a8b4aacb28276cae62030733e470054562efc4518aa8ff")
  public override fun preStartDeployment(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit): Unit = preStartDeployment(eventDestination,
      ExtensionOptions(options))

  public interface Builder {
    public fun application(application: IApplication)

    public fun description(description: String)

    public fun environmentName(environmentName: String)

    public fun monitors(monitors: List<Monitor>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.Environment.Builder =
        software.amazon.awscdk.services.appconfig.Environment.Builder.create(scope, id)

    override fun application(application: IApplication) {
      cdkBuilder.application(application.let(IApplication::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    override fun monitors(monitors: List<Monitor>) {
      cdkBuilder.monitors(monitors.map(Monitor::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appconfig.Environment = cdkBuilder.build()
  }

  public companion object {
    public open fun fromEnvironmentArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      environmentArn: String,
    ): IEnvironment =
        software.amazon.awscdk.services.appconfig.Environment.fromEnvironmentArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, environmentArn).let(IEnvironment::wrap)

    public open fun fromEnvironmentAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: EnvironmentAttributes,
    ): IEnvironment =
        software.amazon.awscdk.services.appconfig.Environment.fromEnvironmentAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(EnvironmentAttributes::unwrap)).let(IEnvironment::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cd908126f7f1a01009a6c6b7024c7d97a46bc780f4d581f0e786cd5e2abdccc2")
    public open fun fromEnvironmentAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: EnvironmentAttributes.Builder.() -> Unit,
    ): IEnvironment = fromEnvironmentAttributes(scope, id, EnvironmentAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Environment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Environment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.Environment): Environment
        = Environment(cdkObject)

    internal fun unwrap(wrapped: Environment): software.amazon.awscdk.services.appconfig.Environment
        = wrapped.cdkObject
  }
}
