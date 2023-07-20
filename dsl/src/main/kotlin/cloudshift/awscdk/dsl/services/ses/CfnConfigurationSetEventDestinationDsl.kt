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
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnConfigurationSetEventDestinationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConfigurationSetEventDestination.Builder =
        CfnConfigurationSetEventDestination.Builder.create(scope, id)

    public fun configurationSetName(configurationSetName: String) {
        cdkBuilder.configurationSetName(configurationSetName)
    }

    public fun eventDestination(eventDestination: IResolvable) {
        cdkBuilder.eventDestination(eventDestination)
    }

    public fun eventDestination(eventDestination: CfnConfigurationSetEventDestination.EventDestinationProperty) {
        cdkBuilder.eventDestination(eventDestination)
    }

    public fun build(): CfnConfigurationSetEventDestination = cdkBuilder.build()
}
