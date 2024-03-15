@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.stepfunctions.Credentials
import io.cloudshiftdev.awscdk.services.stepfunctions.IntegrationPattern
import io.cloudshiftdev.awscdk.services.stepfunctions.TaskStateBase
import io.cloudshiftdev.awscdk.services.stepfunctions.Timeout
import kotlin.Any
import kotlin.Deprecated
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EmrModifyInstanceGroupByName internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName,
) : TaskStateBase(cdkObject) {
  @CdkDslMarker
  public interface Builder {
    public fun clusterId(clusterId: String)

    public fun comment(comment: String)

    public fun credentials(credentials: Credentials)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfbee46ace2525224ff6b87b3375e67519b270da22f21efdc9dd942cd5da366b")
    public fun credentials(credentials: Credentials.Builder.() -> Unit)

    @Deprecated(message = "deprecated in CDK")
    public fun heartbeat(heartbeat: Duration)

    public fun heartbeatTimeout(heartbeatTimeout: Timeout)

    public fun inputPath(inputPath: String)

    public fun instanceGroup(instanceGroup: InstanceGroupModifyConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6fceae4fc76c5e4ed9b22504e0ba1b604ff9cb480409b45cf2ab8a161d5853bc")
    public fun instanceGroup(instanceGroup: InstanceGroupModifyConfigProperty.Builder.() -> Unit)

    public fun instanceGroupName(instanceGroupName: String)

    public fun integrationPattern(integrationPattern: IntegrationPattern)

    public fun outputPath(outputPath: String)

    public fun resultPath(resultPath: String)

    public fun resultSelector(resultSelector: Map<String, Any>)

    public fun stateName(stateName: String)

    public fun taskTimeout(taskTimeout: Timeout)

    @Deprecated(message = "deprecated in CDK")
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.Builder.create(scope,
        id)

    override fun clusterId(clusterId: String) {
      cdkBuilder.clusterId(clusterId)
    }

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun credentials(credentials: Credentials) {
      cdkBuilder.credentials(credentials.let(Credentials::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cfbee46ace2525224ff6b87b3375e67519b270da22f21efdc9dd942cd5da366b")
    override fun credentials(credentials: Credentials.Builder.() -> Unit): Unit =
        credentials(Credentials(credentials))

    @Deprecated(message = "deprecated in CDK")
    override fun heartbeat(heartbeat: Duration) {
      cdkBuilder.heartbeat(heartbeat.let(Duration::unwrap))
    }

    override fun heartbeatTimeout(heartbeatTimeout: Timeout) {
      cdkBuilder.heartbeatTimeout(heartbeatTimeout.let(Timeout::unwrap))
    }

    override fun inputPath(inputPath: String) {
      cdkBuilder.inputPath(inputPath)
    }

    override fun instanceGroup(instanceGroup: InstanceGroupModifyConfigProperty) {
      cdkBuilder.instanceGroup(instanceGroup.let(InstanceGroupModifyConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6fceae4fc76c5e4ed9b22504e0ba1b604ff9cb480409b45cf2ab8a161d5853bc")
    override fun instanceGroup(instanceGroup: InstanceGroupModifyConfigProperty.Builder.() -> Unit):
        Unit = instanceGroup(InstanceGroupModifyConfigProperty(instanceGroup))

    override fun instanceGroupName(instanceGroupName: String) {
      cdkBuilder.instanceGroupName(instanceGroupName)
    }

    override fun integrationPattern(integrationPattern: IntegrationPattern) {
      cdkBuilder.integrationPattern(integrationPattern.let(IntegrationPattern::unwrap))
    }

    override fun outputPath(outputPath: String) {
      cdkBuilder.outputPath(outputPath)
    }

    override fun resultPath(resultPath: String) {
      cdkBuilder.resultPath(resultPath)
    }

    override fun resultSelector(resultSelector: Map<String, Any>) {
      cdkBuilder.resultSelector(resultSelector)
    }

    override fun stateName(stateName: String) {
      cdkBuilder.stateName(stateName)
    }

    override fun taskTimeout(taskTimeout: Timeout) {
      cdkBuilder.taskTimeout(taskTimeout.let(Timeout::unwrap))
    }

    @Deprecated(message = "deprecated in CDK")
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EmrModifyInstanceGroupByName {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EmrModifyInstanceGroupByName(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName):
        EmrModifyInstanceGroupByName = EmrModifyInstanceGroupByName(cdkObject)

    internal fun unwrap(wrapped: EmrModifyInstanceGroupByName):
        software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName =
        wrapped.cdkObject
  }

  public interface InstanceResizePolicyProperty {
    public fun instanceTerminationTimeout(): Duration? =
        unwrap(this).getInstanceTerminationTimeout()?.let(Duration::wrap)

    public fun instancesToProtect(): List<String> = unwrap(this).getInstancesToProtect() ?:
        emptyList()

    public fun instancesToTerminate(): List<String> = unwrap(this).getInstancesToTerminate() ?:
        emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun instanceTerminationTimeout(instanceTerminationTimeout: Duration)

      public fun instancesToProtect(instancesToProtect: List<String>)

      public fun instancesToProtect(vararg instancesToProtect: String)

      public fun instancesToTerminate(instancesToTerminate: List<String>)

      public fun instancesToTerminate(vararg instancesToTerminate: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceResizePolicyProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceResizePolicyProperty.builder()

      override fun instanceTerminationTimeout(instanceTerminationTimeout: Duration) {
        cdkBuilder.instanceTerminationTimeout(instanceTerminationTimeout.let(Duration::unwrap))
      }

      override fun instancesToProtect(instancesToProtect: List<String>) {
        cdkBuilder.instancesToProtect(instancesToProtect)
      }

      override fun instancesToProtect(vararg instancesToProtect: String): Unit =
          instancesToProtect(instancesToProtect.toList())

      override fun instancesToTerminate(instancesToTerminate: List<String>) {
        cdkBuilder.instancesToTerminate(instancesToTerminate)
      }

      override fun instancesToTerminate(vararg instancesToTerminate: String): Unit =
          instancesToTerminate(instancesToTerminate.toList())

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceResizePolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceResizePolicyProperty,
    ) : CdkObject(cdkObject), InstanceResizePolicyProperty {
      override fun instanceTerminationTimeout(): Duration? =
          unwrap(this).getInstanceTerminationTimeout()?.let(Duration::wrap)

      override fun instancesToProtect(): List<String> = unwrap(this).getInstancesToProtect() ?:
          emptyList()

      override fun instancesToTerminate(): List<String> = unwrap(this).getInstancesToTerminate() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceResizePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceResizePolicyProperty):
          InstanceResizePolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceResizePolicyProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceResizePolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceResizePolicyProperty
    }
  }

  public interface ShrinkPolicyProperty {
    public fun decommissionTimeout(): Duration? =
        unwrap(this).getDecommissionTimeout()?.let(Duration::wrap)

    public fun instanceResizePolicy(): InstanceResizePolicyProperty? =
        unwrap(this).getInstanceResizePolicy()?.let(InstanceResizePolicyProperty::wrap)

    @CdkDslMarker
    public interface Builder {
      public fun decommissionTimeout(decommissionTimeout: Duration)

      public fun instanceResizePolicy(instanceResizePolicy: InstanceResizePolicyProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("56d4576baf2f9bf78146137f7d858182ed08b35c01a56f19d4d822f3f246353b")
      public
          fun instanceResizePolicy(instanceResizePolicy: InstanceResizePolicyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.ShrinkPolicyProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.ShrinkPolicyProperty.builder()

      override fun decommissionTimeout(decommissionTimeout: Duration) {
        cdkBuilder.decommissionTimeout(decommissionTimeout.let(Duration::unwrap))
      }

      override fun instanceResizePolicy(instanceResizePolicy: InstanceResizePolicyProperty) {
        cdkBuilder.instanceResizePolicy(instanceResizePolicy.let(InstanceResizePolicyProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("56d4576baf2f9bf78146137f7d858182ed08b35c01a56f19d4d822f3f246353b")
      override
          fun instanceResizePolicy(instanceResizePolicy: InstanceResizePolicyProperty.Builder.() -> Unit):
          Unit = instanceResizePolicy(InstanceResizePolicyProperty(instanceResizePolicy))

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.ShrinkPolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.ShrinkPolicyProperty,
    ) : CdkObject(cdkObject), ShrinkPolicyProperty {
      override fun decommissionTimeout(): Duration? =
          unwrap(this).getDecommissionTimeout()?.let(Duration::wrap)

      override fun instanceResizePolicy(): InstanceResizePolicyProperty? =
          unwrap(this).getInstanceResizePolicy()?.let(InstanceResizePolicyProperty::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ShrinkPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.ShrinkPolicyProperty):
          ShrinkPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ShrinkPolicyProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.ShrinkPolicyProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.ShrinkPolicyProperty
    }
  }

  public interface InstanceGroupModifyConfigProperty {
    public fun configurations(): List<EmrCreateCluster.ConfigurationProperty> =
        unwrap(this).getConfigurations()?.map(EmrCreateCluster.ConfigurationProperty::wrap) ?:
        emptyList()

    public fun ec2InstanceIdsToTerminate(): List<String> =
        unwrap(this).getEC2InstanceIdsToTerminate() ?: emptyList()

    public fun instanceCount(): Number? = unwrap(this).getInstanceCount()

    public fun shrinkPolicy(): ShrinkPolicyProperty? =
        unwrap(this).getShrinkPolicy()?.let(ShrinkPolicyProperty::wrap)

    @CdkDslMarker
    public interface Builder {
      public fun configurations(configurations: List<EmrCreateCluster.ConfigurationProperty>)

      public fun configurations(vararg configurations: EmrCreateCluster.ConfigurationProperty)

      public fun eC2InstanceIdsToTerminate(eC2InstanceIdsToTerminate: List<String>)

      public fun eC2InstanceIdsToTerminate(vararg eC2InstanceIdsToTerminate: String)

      public fun instanceCount(instanceCount: Number)

      public fun shrinkPolicy(shrinkPolicy: ShrinkPolicyProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("780915b8831837b2846bf69d48cc0a5e6f8bfaa375d231e50add83eedad1c123")
      public fun shrinkPolicy(shrinkPolicy: ShrinkPolicyProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty.Builder
          =
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty.builder()

      override fun configurations(configurations: List<EmrCreateCluster.ConfigurationProperty>) {
        cdkBuilder.configurations(configurations.map(EmrCreateCluster.ConfigurationProperty::unwrap))
      }

      override fun configurations(vararg configurations: EmrCreateCluster.ConfigurationProperty):
          Unit = configurations(configurations.toList())

      override fun eC2InstanceIdsToTerminate(eC2InstanceIdsToTerminate: List<String>) {
        cdkBuilder.eC2InstanceIdsToTerminate(eC2InstanceIdsToTerminate)
      }

      override fun eC2InstanceIdsToTerminate(vararg eC2InstanceIdsToTerminate: String): Unit =
          eC2InstanceIdsToTerminate(eC2InstanceIdsToTerminate.toList())

      override fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
      }

      override fun shrinkPolicy(shrinkPolicy: ShrinkPolicyProperty) {
        cdkBuilder.shrinkPolicy(shrinkPolicy.let(ShrinkPolicyProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("780915b8831837b2846bf69d48cc0a5e6f8bfaa375d231e50add83eedad1c123")
      override fun shrinkPolicy(shrinkPolicy: ShrinkPolicyProperty.Builder.() -> Unit): Unit =
          shrinkPolicy(ShrinkPolicyProperty(shrinkPolicy))

      public fun build():
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty,
    ) : CdkObject(cdkObject), InstanceGroupModifyConfigProperty {
      override fun configurations(): List<EmrCreateCluster.ConfigurationProperty> =
          unwrap(this).getConfigurations()?.map(EmrCreateCluster.ConfigurationProperty::wrap) ?:
          emptyList()

      override fun ec2InstanceIdsToTerminate(): List<String> =
          unwrap(this).getEC2InstanceIdsToTerminate() ?: emptyList()

      override fun instanceCount(): Number? = unwrap(this).getInstanceCount()

      override fun shrinkPolicy(): ShrinkPolicyProperty? =
          unwrap(this).getShrinkPolicy()?.let(ShrinkPolicyProperty::wrap)
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InstanceGroupModifyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty):
          InstanceGroupModifyConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InstanceGroupModifyConfigProperty):
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceGroupModifyConfigProperty
    }
  }
}