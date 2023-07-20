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

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.stepfunctions.Wait
import software.amazon.awscdk.services.stepfunctions.WaitTime
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class WaitDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Wait.Builder = Wait.Builder.create(scope, id)

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun time(time: WaitTime) {
        cdkBuilder.time(time)
    }

    public fun build(): Wait = cdkBuilder.build()
}
