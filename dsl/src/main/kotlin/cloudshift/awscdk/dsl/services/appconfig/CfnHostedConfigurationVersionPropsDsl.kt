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

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appconfig.CfnHostedConfigurationVersionProps
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnHostedConfigurationVersionPropsDsl {
    private val cdkBuilder: CfnHostedConfigurationVersionProps.Builder =
        CfnHostedConfigurationVersionProps.builder()

    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    public fun configurationProfileId(configurationProfileId: String) {
        cdkBuilder.configurationProfileId(configurationProfileId)
    }

    public fun content(content: String) {
        cdkBuilder.content(content)
    }

    public fun contentType(contentType: String) {
        cdkBuilder.contentType(contentType)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun latestVersionNumber(latestVersionNumber: Number) {
        cdkBuilder.latestVersionNumber(latestVersionNumber)
    }

    public fun versionLabel(versionLabel: String) {
        cdkBuilder.versionLabel(versionLabel)
    }

    public fun build(): CfnHostedConfigurationVersionProps = cdkBuilder.build()
}
