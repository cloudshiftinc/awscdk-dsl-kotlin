@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCodeDeployBlueGreenEcsAttributes {
  public fun taskDefinitions(): List<String>

  public fun taskSets(): List<String>

  public fun trafficRouting(): CfnTrafficRouting

  @CdkDslMarker
  public interface Builder {
    public fun taskDefinitions(taskDefinitions: List<String>)

    public fun taskDefinitions(vararg taskDefinitions: String)

    public fun taskSets(taskSets: List<String>)

    public fun taskSets(vararg taskSets: String)

    public fun trafficRouting(trafficRouting: CfnTrafficRouting)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("651e074c6f5b0d634fb60252bb57c85f72cc306b0a4d5d9e42b254a81e7cd986")
    public fun trafficRouting(trafficRouting: CfnTrafficRouting.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes.Builder =
        software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes.builder()

    override fun taskDefinitions(taskDefinitions: List<String>) {
      cdkBuilder.taskDefinitions(taskDefinitions)
    }

    override fun taskDefinitions(vararg taskDefinitions: String): Unit =
        taskDefinitions(taskDefinitions.toList())

    override fun taskSets(taskSets: List<String>) {
      cdkBuilder.taskSets(taskSets)
    }

    override fun taskSets(vararg taskSets: String): Unit = taskSets(taskSets.toList())

    override fun trafficRouting(trafficRouting: CfnTrafficRouting) {
      cdkBuilder.trafficRouting(trafficRouting.let(CfnTrafficRouting::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("651e074c6f5b0d634fb60252bb57c85f72cc306b0a4d5d9e42b254a81e7cd986")
    override fun trafficRouting(trafficRouting: CfnTrafficRouting.Builder.() -> Unit): Unit =
        trafficRouting(CfnTrafficRouting(trafficRouting))

    public fun build(): software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes,
  ) : CdkObject(cdkObject), CfnCodeDeployBlueGreenEcsAttributes {
    override fun taskDefinitions(): List<String> = unwrap(this).getTaskDefinitions()

    override fun taskSets(): List<String> = unwrap(this).getTaskSets()

    override fun trafficRouting(): CfnTrafficRouting =
        unwrap(this).getTrafficRouting().let(CfnTrafficRouting::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnCodeDeployBlueGreenEcsAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes):
        CfnCodeDeployBlueGreenEcsAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCodeDeployBlueGreenEcsAttributes):
        software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.CfnCodeDeployBlueGreenEcsAttributes
  }
}
