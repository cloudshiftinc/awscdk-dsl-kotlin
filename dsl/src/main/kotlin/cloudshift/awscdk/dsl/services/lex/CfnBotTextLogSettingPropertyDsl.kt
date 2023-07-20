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

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBot
import kotlin.Boolean

@CdkDslMarker
public class CfnBotTextLogSettingPropertyDsl {
    private val cdkBuilder: CfnBot.TextLogSettingProperty.Builder =
        CfnBot.TextLogSettingProperty.builder()

    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    public fun destination(destination: CfnBot.TextLogDestinationProperty) {
        cdkBuilder.destination(destination)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnBot.TextLogSettingProperty = cdkBuilder.build()
}
