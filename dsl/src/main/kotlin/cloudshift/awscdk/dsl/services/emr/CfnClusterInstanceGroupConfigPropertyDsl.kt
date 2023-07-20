@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnCluster
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnClusterInstanceGroupConfigPropertyDsl {
    private val cdkBuilder: CfnCluster.InstanceGroupConfigProperty.Builder =
        CfnCluster.InstanceGroupConfigProperty.builder()

    private val _configurations: MutableList<Any> = mutableListOf()

    public fun autoScalingPolicy(autoScalingPolicy: IResolvable) {
        cdkBuilder.autoScalingPolicy(autoScalingPolicy)
    }

    public fun autoScalingPolicy(autoScalingPolicy: CfnCluster.AutoScalingPolicyProperty) {
        cdkBuilder.autoScalingPolicy(autoScalingPolicy)
    }

    public fun bidPrice(bidPrice: String) {
        cdkBuilder.bidPrice(bidPrice)
    }

    public fun configurations(vararg configurations: Any) {
        _configurations.addAll(listOf(*configurations))
    }

    public fun configurations(configurations: Collection<Any>) {
        _configurations.addAll(configurations)
    }

    public fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations)
    }

    public fun customAmiId(customAmiId: String) {
        cdkBuilder.customAmiId(customAmiId)
    }

    public fun ebsConfiguration(ebsConfiguration: IResolvable) {
        cdkBuilder.ebsConfiguration(ebsConfiguration)
    }

    public fun ebsConfiguration(ebsConfiguration: CfnCluster.EbsConfigurationProperty) {
        cdkBuilder.ebsConfiguration(ebsConfiguration)
    }

    public fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
    }

    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun market(market: String) {
        cdkBuilder.market(market)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnCluster.InstanceGroupConfigProperty {
        if (_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
        return cdkBuilder.build()
    }
}
