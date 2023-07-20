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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnConfigurationSet
import software.amazon.awscdk.services.ses.CfnConfigurationSetProps
import kotlin.String

@CdkDslMarker
public class CfnConfigurationSetPropsDsl {
    private val cdkBuilder: CfnConfigurationSetProps.Builder = CfnConfigurationSetProps.builder()

    public fun deliveryOptions(deliveryOptions: IResolvable) {
        cdkBuilder.deliveryOptions(deliveryOptions)
    }

    public fun deliveryOptions(deliveryOptions: CfnConfigurationSet.DeliveryOptionsProperty) {
        cdkBuilder.deliveryOptions(deliveryOptions)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun reputationOptions(reputationOptions: IResolvable) {
        cdkBuilder.reputationOptions(reputationOptions)
    }

    public fun reputationOptions(reputationOptions: CfnConfigurationSet.ReputationOptionsProperty) {
        cdkBuilder.reputationOptions(reputationOptions)
    }

    public fun sendingOptions(sendingOptions: IResolvable) {
        cdkBuilder.sendingOptions(sendingOptions)
    }

    public fun sendingOptions(sendingOptions: CfnConfigurationSet.SendingOptionsProperty) {
        cdkBuilder.sendingOptions(sendingOptions)
    }

    public fun suppressionOptions(suppressionOptions: IResolvable) {
        cdkBuilder.suppressionOptions(suppressionOptions)
    }

    public fun suppressionOptions(suppressionOptions: CfnConfigurationSet.SuppressionOptionsProperty) {
        cdkBuilder.suppressionOptions(suppressionOptions)
    }

    public fun trackingOptions(trackingOptions: IResolvable) {
        cdkBuilder.trackingOptions(trackingOptions)
    }

    public fun trackingOptions(trackingOptions: CfnConfigurationSet.TrackingOptionsProperty) {
        cdkBuilder.trackingOptions(trackingOptions)
    }

    public fun vdmOptions(vdmOptions: IResolvable) {
        cdkBuilder.vdmOptions(vdmOptions)
    }

    public fun vdmOptions(vdmOptions: CfnConfigurationSet.VdmOptionsProperty) {
        cdkBuilder.vdmOptions(vdmOptions)
    }

    public fun build(): CfnConfigurationSetProps = cdkBuilder.build()
}
