@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrassv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnComponentVersion internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrComponentName(): String = unwrap(this).getAttrComponentName()

  public open fun attrComponentVersion(): String = unwrap(this).getAttrComponentVersion()

  public open fun inlineRecipe(): String? = unwrap(this).getInlineRecipe()

  public open fun inlineRecipe(`value`: String) {
    unwrap(this).setInlineRecipe(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun lambdaFunction(): Any? = unwrap(this).getLambdaFunction()

  public open fun lambdaFunction(`value`: IResolvable) {
    unwrap(this).setLambdaFunction(`value`.let(IResolvable::unwrap))
  }

  public open fun lambdaFunction(`value`: LambdaFunctionRecipeSourceProperty) {
    unwrap(this).setLambdaFunction(`value`.let(LambdaFunctionRecipeSourceProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("912ee6c56bce82fb0485702ee19ea7213703738006edcfcf3f479d7751a1fb67")
  public open fun lambdaFunction(`value`: LambdaFunctionRecipeSourceProperty.Builder.() -> Unit):
      Unit = lambdaFunction(LambdaFunctionRecipeSourceProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun inlineRecipe(inlineRecipe: String)

    public fun lambdaFunction(lambdaFunction: IResolvable)

    public fun lambdaFunction(lambdaFunction: LambdaFunctionRecipeSourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1256639b251728b2059a1b5b692c31dd46259d0bedee6a8d593077e4904deb9")
    public fun lambdaFunction(lambdaFunction: LambdaFunctionRecipeSourceProperty.Builder.() -> Unit)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.Builder
        = software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.Builder.create(scope, id)

    override fun inlineRecipe(inlineRecipe: String) {
      cdkBuilder.inlineRecipe(inlineRecipe)
    }

    override fun lambdaFunction(lambdaFunction: IResolvable) {
      cdkBuilder.lambdaFunction(lambdaFunction.let(IResolvable::unwrap))
    }

    override fun lambdaFunction(lambdaFunction: LambdaFunctionRecipeSourceProperty) {
      cdkBuilder.lambdaFunction(lambdaFunction.let(LambdaFunctionRecipeSourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1256639b251728b2059a1b5b692c31dd46259d0bedee6a8d593077e4904deb9")
    override
        fun lambdaFunction(lambdaFunction: LambdaFunctionRecipeSourceProperty.Builder.() -> Unit):
        Unit = lambdaFunction(LambdaFunctionRecipeSourceProperty(lambdaFunction))

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrassv2.CfnComponentVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnComponentVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnComponentVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion):
        CfnComponentVersion = CfnComponentVersion(cdkObject)

    internal fun unwrap(wrapped: CfnComponentVersion):
        software.amazon.awscdk.services.greengrassv2.CfnComponentVersion = wrapped.cdkObject
  }

  public interface LambdaFunctionRecipeSourceProperty {
    public fun componentDependencies(): Any? = unwrap(this).getComponentDependencies()

    public fun componentLambdaParameters(): Any? = unwrap(this).getComponentLambdaParameters()

    public fun componentName(): String? = unwrap(this).getComponentName()

    public fun componentPlatforms(): Any? = unwrap(this).getComponentPlatforms()

    public fun componentVersion(): String? = unwrap(this).getComponentVersion()

    public fun lambdaArn(): String? = unwrap(this).getLambdaArn()

    @CdkDslMarker
    public interface Builder {
      public fun componentDependencies(componentDependencies: IResolvable)

      public fun componentDependencies(componentDependencies: Map<String, Any>)

      public fun componentLambdaParameters(componentLambdaParameters: IResolvable)

      public
          fun componentLambdaParameters(componentLambdaParameters: LambdaExecutionParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2baaea23fa42a72d73625398b3745773a4ef9501bd5209c28d2a3b7974b71fce")
      public
          fun componentLambdaParameters(componentLambdaParameters: LambdaExecutionParametersProperty.Builder.() -> Unit)

      public fun componentName(componentName: String)

      public fun componentPlatforms(componentPlatforms: IResolvable)

      public fun componentPlatforms(componentPlatforms: List<Any>)

      public fun componentPlatforms(vararg componentPlatforms: Any)

      public fun componentVersion(componentVersion: String)

      public fun lambdaArn(lambdaArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty.builder()

      override fun componentDependencies(componentDependencies: IResolvable) {
        cdkBuilder.componentDependencies(componentDependencies.let(IResolvable::unwrap))
      }

      override fun componentDependencies(componentDependencies: Map<String, Any>) {
        cdkBuilder.componentDependencies(componentDependencies)
      }

      override fun componentLambdaParameters(componentLambdaParameters: IResolvable) {
        cdkBuilder.componentLambdaParameters(componentLambdaParameters.let(IResolvable::unwrap))
      }

      override
          fun componentLambdaParameters(componentLambdaParameters: LambdaExecutionParametersProperty) {
        cdkBuilder.componentLambdaParameters(componentLambdaParameters.let(LambdaExecutionParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2baaea23fa42a72d73625398b3745773a4ef9501bd5209c28d2a3b7974b71fce")
      override
          fun componentLambdaParameters(componentLambdaParameters: LambdaExecutionParametersProperty.Builder.() -> Unit):
          Unit =
          componentLambdaParameters(LambdaExecutionParametersProperty(componentLambdaParameters))

      override fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
      }

      override fun componentPlatforms(componentPlatforms: IResolvable) {
        cdkBuilder.componentPlatforms(componentPlatforms.let(IResolvable::unwrap))
      }

      override fun componentPlatforms(componentPlatforms: List<Any>) {
        cdkBuilder.componentPlatforms(componentPlatforms)
      }

      override fun componentPlatforms(vararg componentPlatforms: Any): Unit =
          componentPlatforms(componentPlatforms.toList())

      override fun componentVersion(componentVersion: String) {
        cdkBuilder.componentVersion(componentVersion)
      }

      override fun lambdaArn(lambdaArn: String) {
        cdkBuilder.lambdaArn(lambdaArn)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty,
    ) : CdkObject(cdkObject), LambdaFunctionRecipeSourceProperty {
      override fun componentDependencies(): Any? = unwrap(this).getComponentDependencies()

      override fun componentLambdaParameters(): Any? = unwrap(this).getComponentLambdaParameters()

      override fun componentName(): String? = unwrap(this).getComponentName()

      override fun componentPlatforms(): Any? = unwrap(this).getComponentPlatforms()

      override fun componentVersion(): String? = unwrap(this).getComponentVersion()

      override fun lambdaArn(): String? = unwrap(this).getLambdaArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LambdaFunctionRecipeSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty):
          LambdaFunctionRecipeSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaFunctionRecipeSourceProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaFunctionRecipeSourceProperty
    }
  }

  public interface LambdaContainerParamsProperty {
    public fun devices(): Any? = unwrap(this).getDevices()

    public fun memorySizeInKb(): Number? = unwrap(this).getMemorySizeInKb()

    public fun mountRoSysfs(): Any? = unwrap(this).getMountRoSysfs()

    public fun volumes(): Any? = unwrap(this).getVolumes()

    @CdkDslMarker
    public interface Builder {
      public fun devices(devices: IResolvable)

      public fun devices(devices: List<Any>)

      public fun devices(vararg devices: Any)

      public fun memorySizeInKb(memorySizeInKb: Number)

      public fun mountRoSysfs(mountRoSysfs: Boolean)

      public fun mountRoSysfs(mountRoSysfs: IResolvable)

      public fun volumes(volumes: IResolvable)

      public fun volumes(volumes: List<Any>)

      public fun volumes(vararg volumes: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaContainerParamsProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaContainerParamsProperty.builder()

      override fun devices(devices: IResolvable) {
        cdkBuilder.devices(devices.let(IResolvable::unwrap))
      }

      override fun devices(devices: List<Any>) {
        cdkBuilder.devices(devices)
      }

      override fun devices(vararg devices: Any): Unit = devices(devices.toList())

      override fun memorySizeInKb(memorySizeInKb: Number) {
        cdkBuilder.memorySizeInKb(memorySizeInKb)
      }

      override fun mountRoSysfs(mountRoSysfs: Boolean) {
        cdkBuilder.mountRoSysfs(mountRoSysfs)
      }

      override fun mountRoSysfs(mountRoSysfs: IResolvable) {
        cdkBuilder.mountRoSysfs(mountRoSysfs.let(IResolvable::unwrap))
      }

      override fun volumes(volumes: IResolvable) {
        cdkBuilder.volumes(volumes.let(IResolvable::unwrap))
      }

      override fun volumes(volumes: List<Any>) {
        cdkBuilder.volumes(volumes)
      }

      override fun volumes(vararg volumes: Any): Unit = volumes(volumes.toList())

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaContainerParamsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaContainerParamsProperty,
    ) : CdkObject(cdkObject), LambdaContainerParamsProperty {
      override fun devices(): Any? = unwrap(this).getDevices()

      override fun memorySizeInKb(): Number? = unwrap(this).getMemorySizeInKb()

      override fun mountRoSysfs(): Any? = unwrap(this).getMountRoSysfs()

      override fun volumes(): Any? = unwrap(this).getVolumes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaContainerParamsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaContainerParamsProperty):
          LambdaContainerParamsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaContainerParamsProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaContainerParamsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaContainerParamsProperty
    }
  }

  public interface LambdaDeviceMountProperty {
    public fun addGroupOwner(): Any? = unwrap(this).getAddGroupOwner()

    public fun path(): String? = unwrap(this).getPath()

    public fun permission(): String? = unwrap(this).getPermission()

    @CdkDslMarker
    public interface Builder {
      public fun addGroupOwner(addGroupOwner: Boolean)

      public fun addGroupOwner(addGroupOwner: IResolvable)

      public fun path(path: String)

      public fun permission(permission: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaDeviceMountProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaDeviceMountProperty.builder()

      override fun addGroupOwner(addGroupOwner: Boolean) {
        cdkBuilder.addGroupOwner(addGroupOwner)
      }

      override fun addGroupOwner(addGroupOwner: IResolvable) {
        cdkBuilder.addGroupOwner(addGroupOwner.let(IResolvable::unwrap))
      }

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      override fun permission(permission: String) {
        cdkBuilder.permission(permission)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaDeviceMountProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaDeviceMountProperty,
    ) : CdkObject(cdkObject), LambdaDeviceMountProperty {
      override fun addGroupOwner(): Any? = unwrap(this).getAddGroupOwner()

      override fun path(): String? = unwrap(this).getPath()

      override fun permission(): String? = unwrap(this).getPermission()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaDeviceMountProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaDeviceMountProperty):
          LambdaDeviceMountProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaDeviceMountProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaDeviceMountProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaDeviceMountProperty
    }
  }

  public interface ComponentDependencyRequirementProperty {
    public fun dependencyType(): String? = unwrap(this).getDependencyType()

    public fun versionRequirement(): String? = unwrap(this).getVersionRequirement()

    @CdkDslMarker
    public interface Builder {
      public fun dependencyType(dependencyType: String)

      public fun versionRequirement(versionRequirement: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentDependencyRequirementProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentDependencyRequirementProperty.builder()

      override fun dependencyType(dependencyType: String) {
        cdkBuilder.dependencyType(dependencyType)
      }

      override fun versionRequirement(versionRequirement: String) {
        cdkBuilder.versionRequirement(versionRequirement)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentDependencyRequirementProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentDependencyRequirementProperty,
    ) : CdkObject(cdkObject), ComponentDependencyRequirementProperty {
      override fun dependencyType(): String? = unwrap(this).getDependencyType()

      override fun versionRequirement(): String? = unwrap(this).getVersionRequirement()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ComponentDependencyRequirementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentDependencyRequirementProperty):
          ComponentDependencyRequirementProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentDependencyRequirementProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentDependencyRequirementProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentDependencyRequirementProperty
    }
  }

  public interface ComponentPlatformProperty {
    public fun attributes(): Any? = unwrap(this).getAttributes()

    public fun name(): String? = unwrap(this).getName()

    @CdkDslMarker
    public interface Builder {
      public fun attributes(attributes: IResolvable)

      public fun attributes(attributes: Map<String, String>)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentPlatformProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentPlatformProperty.builder()

      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
      }

      override fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentPlatformProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentPlatformProperty,
    ) : CdkObject(cdkObject), ComponentPlatformProperty {
      override fun attributes(): Any? = unwrap(this).getAttributes()

      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComponentPlatformProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentPlatformProperty):
          ComponentPlatformProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComponentPlatformProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentPlatformProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.ComponentPlatformProperty
    }
  }

  public interface LambdaExecutionParametersProperty {
    public fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

    public fun eventSources(): Any? = unwrap(this).getEventSources()

    public fun execArgs(): List<String> = unwrap(this).getExecArgs() ?: emptyList()

    public fun inputPayloadEncodingType(): String? = unwrap(this).getInputPayloadEncodingType()

    public fun linuxProcessParams(): Any? = unwrap(this).getLinuxProcessParams()

    public fun maxIdleTimeInSeconds(): Number? = unwrap(this).getMaxIdleTimeInSeconds()

    public fun maxInstancesCount(): Number? = unwrap(this).getMaxInstancesCount()

    public fun maxQueueSize(): Number? = unwrap(this).getMaxQueueSize()

    public fun pinned(): Any? = unwrap(this).getPinned()

    public fun statusTimeoutInSeconds(): Number? = unwrap(this).getStatusTimeoutInSeconds()

    public fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()

    @CdkDslMarker
    public interface Builder {
      public fun environmentVariables(environmentVariables: IResolvable)

      public fun environmentVariables(environmentVariables: Map<String, String>)

      public fun eventSources(eventSources: IResolvable)

      public fun eventSources(eventSources: List<Any>)

      public fun eventSources(vararg eventSources: Any)

      public fun execArgs(execArgs: List<String>)

      public fun execArgs(vararg execArgs: String)

      public fun inputPayloadEncodingType(inputPayloadEncodingType: String)

      public fun linuxProcessParams(linuxProcessParams: IResolvable)

      public fun linuxProcessParams(linuxProcessParams: LambdaLinuxProcessParamsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27d11b929d32a5b083d2f35c3eae03f5233b88cc8fe45bccc391568c97e6ed00")
      public
          fun linuxProcessParams(linuxProcessParams: LambdaLinuxProcessParamsProperty.Builder.() -> Unit)

      public fun maxIdleTimeInSeconds(maxIdleTimeInSeconds: Number)

      public fun maxInstancesCount(maxInstancesCount: Number)

      public fun maxQueueSize(maxQueueSize: Number)

      public fun pinned(pinned: Boolean)

      public fun pinned(pinned: IResolvable)

      public fun statusTimeoutInSeconds(statusTimeoutInSeconds: Number)

      public fun timeoutInSeconds(timeoutInSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaExecutionParametersProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaExecutionParametersProperty.builder()

      override fun environmentVariables(environmentVariables: IResolvable) {
        cdkBuilder.environmentVariables(environmentVariables.let(IResolvable::unwrap))
      }

      override fun environmentVariables(environmentVariables: Map<String, String>) {
        cdkBuilder.environmentVariables(environmentVariables)
      }

      override fun eventSources(eventSources: IResolvable) {
        cdkBuilder.eventSources(eventSources.let(IResolvable::unwrap))
      }

      override fun eventSources(eventSources: List<Any>) {
        cdkBuilder.eventSources(eventSources)
      }

      override fun eventSources(vararg eventSources: Any): Unit =
          eventSources(eventSources.toList())

      override fun execArgs(execArgs: List<String>) {
        cdkBuilder.execArgs(execArgs)
      }

      override fun execArgs(vararg execArgs: String): Unit = execArgs(execArgs.toList())

      override fun inputPayloadEncodingType(inputPayloadEncodingType: String) {
        cdkBuilder.inputPayloadEncodingType(inputPayloadEncodingType)
      }

      override fun linuxProcessParams(linuxProcessParams: IResolvable) {
        cdkBuilder.linuxProcessParams(linuxProcessParams.let(IResolvable::unwrap))
      }

      override fun linuxProcessParams(linuxProcessParams: LambdaLinuxProcessParamsProperty) {
        cdkBuilder.linuxProcessParams(linuxProcessParams.let(LambdaLinuxProcessParamsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("27d11b929d32a5b083d2f35c3eae03f5233b88cc8fe45bccc391568c97e6ed00")
      override
          fun linuxProcessParams(linuxProcessParams: LambdaLinuxProcessParamsProperty.Builder.() -> Unit):
          Unit = linuxProcessParams(LambdaLinuxProcessParamsProperty(linuxProcessParams))

      override fun maxIdleTimeInSeconds(maxIdleTimeInSeconds: Number) {
        cdkBuilder.maxIdleTimeInSeconds(maxIdleTimeInSeconds)
      }

      override fun maxInstancesCount(maxInstancesCount: Number) {
        cdkBuilder.maxInstancesCount(maxInstancesCount)
      }

      override fun maxQueueSize(maxQueueSize: Number) {
        cdkBuilder.maxQueueSize(maxQueueSize)
      }

      override fun pinned(pinned: Boolean) {
        cdkBuilder.pinned(pinned)
      }

      override fun pinned(pinned: IResolvable) {
        cdkBuilder.pinned(pinned.let(IResolvable::unwrap))
      }

      override fun statusTimeoutInSeconds(statusTimeoutInSeconds: Number) {
        cdkBuilder.statusTimeoutInSeconds(statusTimeoutInSeconds)
      }

      override fun timeoutInSeconds(timeoutInSeconds: Number) {
        cdkBuilder.timeoutInSeconds(timeoutInSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaExecutionParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaExecutionParametersProperty,
    ) : CdkObject(cdkObject), LambdaExecutionParametersProperty {
      override fun environmentVariables(): Any? = unwrap(this).getEnvironmentVariables()

      override fun eventSources(): Any? = unwrap(this).getEventSources()

      override fun execArgs(): List<String> = unwrap(this).getExecArgs() ?: emptyList()

      override fun inputPayloadEncodingType(): String? = unwrap(this).getInputPayloadEncodingType()

      override fun linuxProcessParams(): Any? = unwrap(this).getLinuxProcessParams()

      override fun maxIdleTimeInSeconds(): Number? = unwrap(this).getMaxIdleTimeInSeconds()

      override fun maxInstancesCount(): Number? = unwrap(this).getMaxInstancesCount()

      override fun maxQueueSize(): Number? = unwrap(this).getMaxQueueSize()

      override fun pinned(): Any? = unwrap(this).getPinned()

      override fun statusTimeoutInSeconds(): Number? = unwrap(this).getStatusTimeoutInSeconds()

      override fun timeoutInSeconds(): Number? = unwrap(this).getTimeoutInSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LambdaExecutionParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaExecutionParametersProperty):
          LambdaExecutionParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaExecutionParametersProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaExecutionParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaExecutionParametersProperty
    }
  }

  public interface LambdaEventSourceProperty {
    public fun topic(): String? = unwrap(this).getTopic()

    public fun type(): String? = unwrap(this).getType()

    @CdkDslMarker
    public interface Builder {
      public fun topic(topic: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaEventSourceProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaEventSourceProperty.builder()

      override fun topic(topic: String) {
        cdkBuilder.topic(topic)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaEventSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaEventSourceProperty,
    ) : CdkObject(cdkObject), LambdaEventSourceProperty {
      override fun topic(): String? = unwrap(this).getTopic()

      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaEventSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaEventSourceProperty):
          LambdaEventSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaEventSourceProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaEventSourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaEventSourceProperty
    }
  }

  public interface LambdaVolumeMountProperty {
    public fun addGroupOwner(): Any? = unwrap(this).getAddGroupOwner()

    public fun destinationPath(): String? = unwrap(this).getDestinationPath()

    public fun permission(): String? = unwrap(this).getPermission()

    public fun sourcePath(): String? = unwrap(this).getSourcePath()

    @CdkDslMarker
    public interface Builder {
      public fun addGroupOwner(addGroupOwner: Boolean)

      public fun addGroupOwner(addGroupOwner: IResolvable)

      public fun destinationPath(destinationPath: String)

      public fun permission(permission: String)

      public fun sourcePath(sourcePath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaVolumeMountProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaVolumeMountProperty.builder()

      override fun addGroupOwner(addGroupOwner: Boolean) {
        cdkBuilder.addGroupOwner(addGroupOwner)
      }

      override fun addGroupOwner(addGroupOwner: IResolvable) {
        cdkBuilder.addGroupOwner(addGroupOwner.let(IResolvable::unwrap))
      }

      override fun destinationPath(destinationPath: String) {
        cdkBuilder.destinationPath(destinationPath)
      }

      override fun permission(permission: String) {
        cdkBuilder.permission(permission)
      }

      override fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaVolumeMountProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaVolumeMountProperty,
    ) : CdkObject(cdkObject), LambdaVolumeMountProperty {
      override fun addGroupOwner(): Any? = unwrap(this).getAddGroupOwner()

      override fun destinationPath(): String? = unwrap(this).getDestinationPath()

      override fun permission(): String? = unwrap(this).getPermission()

      override fun sourcePath(): String? = unwrap(this).getSourcePath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaVolumeMountProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaVolumeMountProperty):
          LambdaVolumeMountProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaVolumeMountProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaVolumeMountProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaVolumeMountProperty
    }
  }

  public interface LambdaLinuxProcessParamsProperty {
    public fun containerParams(): Any? = unwrap(this).getContainerParams()

    public fun isolationMode(): String? = unwrap(this).getIsolationMode()

    @CdkDslMarker
    public interface Builder {
      public fun containerParams(containerParams: IResolvable)

      public fun containerParams(containerParams: LambdaContainerParamsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06d50906feca98faf4df750e8c8b2505d20d6d0ec007d1b01d4e003f98aa20d2")
      public fun containerParams(containerParams: LambdaContainerParamsProperty.Builder.() -> Unit)

      public fun isolationMode(isolationMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaLinuxProcessParamsProperty.Builder
          =
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaLinuxProcessParamsProperty.builder()

      override fun containerParams(containerParams: IResolvable) {
        cdkBuilder.containerParams(containerParams.let(IResolvable::unwrap))
      }

      override fun containerParams(containerParams: LambdaContainerParamsProperty) {
        cdkBuilder.containerParams(containerParams.let(LambdaContainerParamsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06d50906feca98faf4df750e8c8b2505d20d6d0ec007d1b01d4e003f98aa20d2")
      override
          fun containerParams(containerParams: LambdaContainerParamsProperty.Builder.() -> Unit):
          Unit = containerParams(LambdaContainerParamsProperty(containerParams))

      override fun isolationMode(isolationMode: String) {
        cdkBuilder.isolationMode(isolationMode)
      }

      public fun build():
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaLinuxProcessParamsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaLinuxProcessParamsProperty,
    ) : CdkObject(cdkObject), LambdaLinuxProcessParamsProperty {
      override fun containerParams(): Any? = unwrap(this).getContainerParams()

      override fun isolationMode(): String? = unwrap(this).getIsolationMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaLinuxProcessParamsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaLinuxProcessParamsProperty):
          LambdaLinuxProcessParamsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaLinuxProcessParamsProperty):
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaLinuxProcessParamsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrassv2.CfnComponentVersion.LambdaLinuxProcessParamsProperty
    }
  }
}
