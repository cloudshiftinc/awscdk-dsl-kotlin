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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.ExecuteFileOptions
import kotlin.String

@CdkDslMarker
public class ExecuteFileOptionsDsl {
    private val cdkBuilder: ExecuteFileOptions.Builder = ExecuteFileOptions.builder()

    public fun arguments(arguments: String) {
        cdkBuilder.arguments(arguments)
    }

    public fun filePath(filePath: String) {
        cdkBuilder.filePath(filePath)
    }

    public fun build(): ExecuteFileOptions = cdkBuilder.build()
}
