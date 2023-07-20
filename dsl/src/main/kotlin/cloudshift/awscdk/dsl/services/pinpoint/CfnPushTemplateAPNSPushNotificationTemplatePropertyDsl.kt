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
import software.amazon.awscdk.services.pinpoint.CfnPushTemplate
import kotlin.String

@CdkDslMarker
public class CfnPushTemplateAPNSPushNotificationTemplatePropertyDsl {
    private val cdkBuilder: CfnPushTemplate.APNSPushNotificationTemplateProperty.Builder =
        CfnPushTemplate.APNSPushNotificationTemplateProperty.builder()

    public fun action(action: String) {
        cdkBuilder.action(action)
    }

    public fun body(body: String) {
        cdkBuilder.body(body)
    }

    public fun mediaUrl(mediaUrl: String) {
        cdkBuilder.mediaUrl(mediaUrl)
    }

    public fun sound(sound: String) {
        cdkBuilder.sound(sound)
    }

    public fun title(title: String) {
        cdkBuilder.title(title)
    }

    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun build(): CfnPushTemplate.APNSPushNotificationTemplateProperty = cdkBuilder.build()
}
