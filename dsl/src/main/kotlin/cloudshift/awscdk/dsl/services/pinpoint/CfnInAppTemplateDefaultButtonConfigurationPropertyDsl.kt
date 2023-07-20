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

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pinpoint.CfnInAppTemplate
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnInAppTemplateDefaultButtonConfigurationPropertyDsl {
    private val cdkBuilder: CfnInAppTemplate.DefaultButtonConfigurationProperty.Builder =
        CfnInAppTemplate.DefaultButtonConfigurationProperty.builder()

    public fun backgroundColor(backgroundColor: String) {
        cdkBuilder.backgroundColor(backgroundColor)
    }

    public fun borderRadius(borderRadius: Number) {
        cdkBuilder.borderRadius(borderRadius)
    }

    public fun buttonAction(buttonAction: String) {
        cdkBuilder.buttonAction(buttonAction)
    }

    public fun link(link: String) {
        cdkBuilder.link(link)
    }

    public fun text(text: String) {
        cdkBuilder.text(text)
    }

    public fun textColor(textColor: String) {
        cdkBuilder.textColor(textColor)
    }

    public fun build(): CfnInAppTemplate.DefaultButtonConfigurationProperty = cdkBuilder.build()
}
