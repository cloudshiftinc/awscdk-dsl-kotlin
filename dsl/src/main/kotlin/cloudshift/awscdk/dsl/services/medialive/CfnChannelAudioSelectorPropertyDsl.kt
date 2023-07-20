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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel
import kotlin.String

@CdkDslMarker
public class CfnChannelAudioSelectorPropertyDsl {
    private val cdkBuilder: CfnChannel.AudioSelectorProperty.Builder =
        CfnChannel.AudioSelectorProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun selectorSettings(selectorSettings: IResolvable) {
        cdkBuilder.selectorSettings(selectorSettings)
    }

    public fun selectorSettings(selectorSettings: CfnChannel.AudioSelectorSettingsProperty) {
        cdkBuilder.selectorSettings(selectorSettings)
    }

    public fun build(): CfnChannel.AudioSelectorProperty = cdkBuilder.build()
}
