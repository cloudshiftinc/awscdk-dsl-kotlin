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
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate
import kotlin.String

@CdkDslMarker
public class CfnLaunchTemplateLicenseSpecificationPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.LicenseSpecificationProperty.Builder =
        CfnLaunchTemplate.LicenseSpecificationProperty.builder()

    public fun licenseConfigurationArn(licenseConfigurationArn: String) {
        cdkBuilder.licenseConfigurationArn(licenseConfigurationArn)
    }

    public fun build(): CfnLaunchTemplate.LicenseSpecificationProperty = cdkBuilder.build()
}
