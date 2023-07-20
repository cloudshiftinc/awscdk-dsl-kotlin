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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment
import kotlin.String

@CdkDslMarker
public class CfnUserPoolRiskConfigurationAttachmentCompromisedCredentialsActionsTypePropertyDsl {
    private val cdkBuilder:
        CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty.Builder =
        CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty.builder()

    public fun eventAction(eventAction: String) {
        cdkBuilder.eventAction(eventAction)
    }

    public fun build(): CfnUserPoolRiskConfigurationAttachment.CompromisedCredentialsActionsTypeProperty =
        cdkBuilder.build()
}
