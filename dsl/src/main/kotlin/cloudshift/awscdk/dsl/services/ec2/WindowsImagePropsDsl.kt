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
import software.amazon.awscdk.services.ec2.UserData
import software.amazon.awscdk.services.ec2.WindowsImageProps

@CdkDslMarker
public class WindowsImagePropsDsl {
    private val cdkBuilder: WindowsImageProps.Builder = WindowsImageProps.builder()

    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    public fun build(): WindowsImageProps = cdkBuilder.build()
}
