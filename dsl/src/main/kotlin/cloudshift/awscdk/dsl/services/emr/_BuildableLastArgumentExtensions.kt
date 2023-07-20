@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnCluster
import software.amazon.awscdk.services.emr.CfnInstanceFleetConfig
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig
import software.amazon.awscdk.services.emr.CfnStep

public inline
    fun CfnCluster.setInstances(block: CfnClusterJobFlowInstancesConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnClusterJobFlowInstancesConfigPropertyDsl()
  builder.apply(block)
  return setInstances(builder.build())
}

public inline
    fun CfnCluster.setAutoTerminationPolicy(block: CfnClusterAutoTerminationPolicyPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnClusterAutoTerminationPolicyPropertyDsl()
  builder.apply(block)
  return setAutoTerminationPolicy(builder.build())
}

public inline
    fun CfnCluster.setKerberosAttributes(block: CfnClusterKerberosAttributesPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnClusterKerberosAttributesPropertyDsl()
  builder.apply(block)
  return setKerberosAttributes(builder.build())
}

public inline
    fun CfnCluster.setManagedScalingPolicy(block: CfnClusterManagedScalingPolicyPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnClusterManagedScalingPolicyPropertyDsl()
  builder.apply(block)
  return setManagedScalingPolicy(builder.build())
}

public inline
    fun CfnInstanceGroupConfig.setAutoScalingPolicy(block: CfnInstanceGroupConfigAutoScalingPolicyPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnInstanceGroupConfigAutoScalingPolicyPropertyDsl()
  builder.apply(block)
  return setAutoScalingPolicy(builder.build())
}

public inline
    fun CfnInstanceGroupConfig.setEbsConfiguration(block: CfnInstanceGroupConfigEbsConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnInstanceGroupConfigEbsConfigurationPropertyDsl()
  builder.apply(block)
  return setEbsConfiguration(builder.build())
}

public inline
    fun CfnInstanceFleetConfig.setLaunchSpecifications(block: CfnInstanceFleetConfigInstanceFleetProvisioningSpecificationsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnInstanceFleetConfigInstanceFleetProvisioningSpecificationsPropertyDsl()
  builder.apply(block)
  return setLaunchSpecifications(builder.build())
}

public inline fun CfnStep.setHadoopJarStep(block: CfnStepHadoopJarStepConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnStepHadoopJarStepConfigPropertyDsl()
  builder.apply(block)
  return setHadoopJarStep(builder.build())
}
