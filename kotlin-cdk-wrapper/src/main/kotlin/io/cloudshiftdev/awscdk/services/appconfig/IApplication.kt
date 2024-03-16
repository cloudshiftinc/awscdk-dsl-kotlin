@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 *
 */
public interface IApplication : IResource {
  /**
   * Adds an environment.
   *
   * @param id The name of the environment construct. 
   * @param options The options for the environment construct.
   */
  public fun addEnvironment(id: String): IEnvironment

  /**
   * Adds an environment.
   *
   * @param id The name of the environment construct. 
   * @param options The options for the environment construct.
   */
  public fun addEnvironment(id: String, options: EnvironmentOptions): IEnvironment

  /**
   * Adds an environment.
   *
   * @param id The name of the environment construct. 
   * @param options The options for the environment construct.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7c104632a3d0a4e3f999a6f63baa5b43afe61918d2af83102e45915a66f0ec0b")
  public fun addEnvironment(id: String, options: EnvironmentOptions.Builder.() -> Unit):
      IEnvironment

  /**
   * Adds an existing environment.
   *
   * @param environment The environment. 
   */
  public fun addExistingEnvironment(environment: IEnvironment)

  /**
   * Adds an extension association to the application.
   *
   * @param extension The extension to create an association for. 
   */
  public fun addExtension(extension: IExtension)

  /**
   * Adds a hosted configuration.
   *
   * @param id The name of the hosted configuration construct. 
   * @param options The options for the hosted configuration construct. 
   */
  public fun addHostedConfiguration(id: String, options: HostedConfigurationOptions):
      HostedConfiguration

  /**
   * Adds a hosted configuration.
   *
   * @param id The name of the hosted configuration construct. 
   * @param options The options for the hosted configuration construct. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9a4c56e358d895d1df2b4a4dfd88bd752cef6f44f4f4132eb52adb3024fc6e82")
  public fun addHostedConfiguration(id: String,
      options: HostedConfigurationOptions.Builder.() -> Unit): HostedConfiguration

  /**
   * Adds a sourced configuration.
   *
   * @param id The name of the sourced configuration construct. 
   * @param options The options for the sourced configuration construct. 
   */
  public fun addSourcedConfiguration(id: String, options: SourcedConfigurationOptions):
      SourcedConfiguration

  /**
   * Adds a sourced configuration.
   *
   * @param id The name of the sourced configuration construct. 
   * @param options The options for the sourced configuration construct. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f164adb048ad3f7b09ca183a13b663a31673b97620c35cd63fc05114572ed704")
  public fun addSourcedConfiguration(id: String,
      options: SourcedConfigurationOptions.Builder.() -> Unit): SourcedConfiguration

  /**
   * The Amazon Resource Name (ARN) of the application.
   */
  public fun applicationArn(): String

  /**
   * The ID of the application.
   */
  public fun applicationId(): String

  /**
   * The description of the application.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Returns the list of associated environments.
   */
  public fun environments(): List<IEnvironment>

  /**
   * The name of the application.
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Adds an extension defined by the action point and event destination and also creates an
   * extension association to an application.
   *
   * @param actionPoint The action point which triggers the event. 
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun on(actionPoint: ActionPoint, eventDestination: IEventDestination)

  /**
   * Adds an extension defined by the action point and event destination and also creates an
   * extension association to an application.
   *
   * @param actionPoint The action point which triggers the event. 
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun on(
    actionPoint: ActionPoint,
    eventDestination: IEventDestination,
    options: ExtensionOptions,
  )

  /**
   * Adds an extension defined by the action point and event destination and also creates an
   * extension association to an application.
   *
   * @param actionPoint The action point which triggers the event. 
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0194001758d182c355eb63683c585f40699f2a8a5aa9624c1b81e4b64b8fee31")
  public fun on(
    actionPoint: ActionPoint,
    eventDestination: IEventDestination,
    options: ExtensionOptions.Builder.() -> Unit,
  )

  /**
   * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun onDeploymentBaking(eventDestination: IEventDestination)

  /**
   * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun onDeploymentBaking(eventDestination: IEventDestination, options: ExtensionOptions)

  /**
   * Adds an ON_DEPLOYMENT_BAKING extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("51413e14b67e6e3e78f3e45bf6cab9b9cba8e950d5fac88ca48f8e3e2023c82c")
  public fun onDeploymentBaking(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit)

  /**
   * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates
   * an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun onDeploymentComplete(eventDestination: IEventDestination)

  /**
   * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates
   * an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun onDeploymentComplete(eventDestination: IEventDestination, options: ExtensionOptions)

  /**
   * Adds an ON_DEPLOYMENT_COMPLETE extension with the provided event destination and also creates
   * an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c3e400dd20332bd0d2c232c5fc5ae8aba3a4e07c8bbd57bb17c41e6f624ded89")
  public fun onDeploymentComplete(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit)

  /**
   * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
   * creates an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun onDeploymentRolledBack(eventDestination: IEventDestination)

  /**
   * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
   * creates an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun onDeploymentRolledBack(eventDestination: IEventDestination, options: ExtensionOptions)

  /**
   * Adds an ON_DEPLOYMENT_ROLLED_BACK extension with the provided event destination and also
   * creates an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("63bb6d64a26c6accd5567eb325ec58f0c47ae68f0a1bb9384009e199a550f9c8")
  public fun onDeploymentRolledBack(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit)

  /**
   * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun onDeploymentStart(eventDestination: IEventDestination)

  /**
   * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun onDeploymentStart(eventDestination: IEventDestination, options: ExtensionOptions)

  /**
   * Adds an ON_DEPLOYMENT_START extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0131929b795a0129d9ba80efb4ca2e3a18629b79884e7818930b531df0c4d332")
  public fun onDeploymentStart(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit)

  /**
   * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun onDeploymentStep(eventDestination: IEventDestination)

  /**
   * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun onDeploymentStep(eventDestination: IEventDestination, options: ExtensionOptions)

  /**
   * Adds an ON_DEPLOYMENT_STEP extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0fbc04022333094d4a1a9362f893671a1ace386fa2c11455572f1812c43cf137")
  public fun onDeploymentStep(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit)

  /**
   * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination
   * and also creates an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination)

  /**
   * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination
   * and also creates an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination,
      options: ExtensionOptions)

  /**
   * Adds a PRE_CREATE_HOSTED_CONFIGURATION_VERSION extension with the provided event destination
   * and also creates an extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("21cb7629406f579965cdf52846e7b2288b00565b4a6c6ec26df770e81fc6f51c")
  public fun preCreateHostedConfigurationVersion(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit)

  /**
   * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun preStartDeployment(eventDestination: IEventDestination)

  /**
   * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  public fun preStartDeployment(eventDestination: IEventDestination, options: ExtensionOptions)

  /**
   * Adds a PRE_START_DEPLOYMENT extension with the provided event destination and also creates an
   * extension association to an application.
   *
   * @param eventDestination The event that occurs during the extension. 
   * @param options Options for the extension.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("859757079ee9049748a8b4aacb28276cae62030733e470054562efc4518aa8ff")
  public fun preStartDeployment(eventDestination: IEventDestination,
      options: ExtensionOptions.Builder.() -> Unit)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.IApplication):
        IApplication = CdkObjectWrappers.wrap(cdkObject) as IApplication

    internal fun unwrap(wrapped: IApplication):
        software.amazon.awscdk.services.appconfig.IApplication = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appconfig.IApplication
  }
}
