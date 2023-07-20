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

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appstream.CfnUser
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnUserDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnUser.Builder = CfnUser.Builder.create(scope, id)

    public fun authenticationType(authenticationType: String) {
        cdkBuilder.authenticationType(authenticationType)
    }

    public fun firstName(firstName: String) {
        cdkBuilder.firstName(firstName)
    }

    public fun lastName(lastName: String) {
        cdkBuilder.lastName(lastName)
    }

    public fun messageAction(messageAction: String) {
        cdkBuilder.messageAction(messageAction)
    }

    public fun userName(userName: String) {
        cdkBuilder.userName(userName)
    }

    public fun build(): CfnUser = cdkBuilder.build()
}
