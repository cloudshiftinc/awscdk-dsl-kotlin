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

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sam.CfnFunction
import kotlin.String

@CdkDslMarker
public class CfnFunctionFileSystemConfigPropertyDsl {
    private val cdkBuilder: CfnFunction.FileSystemConfigProperty.Builder =
        CfnFunction.FileSystemConfigProperty.builder()

    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    public fun localMountPath(localMountPath: String) {
        cdkBuilder.localMountPath(localMountPath)
    }

    public fun build(): CfnFunction.FileSystemConfigProperty = cdkBuilder.build()
}
