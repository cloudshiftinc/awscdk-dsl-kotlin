@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.imagebuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnImage

/**
 * Contains settings for Image Builder image resource and container image scans.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * ImageScanningConfigurationProperty imageScanningConfigurationProperty =
 * ImageScanningConfigurationProperty.builder()
 * .ecrConfiguration(EcrConfigurationProperty.builder()
 * .containerTags(List.of("containerTags"))
 * .repositoryName("repositoryName")
 * .build())
 * .imageScanningEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-imagescanningconfiguration.html)
 */
@CdkDslMarker
public class CfnImageImageScanningConfigurationPropertyDsl {
    private val cdkBuilder: CfnImage.ImageScanningConfigurationProperty.Builder =
        CfnImage.ImageScanningConfigurationProperty.builder()

    /**
     * @param ecrConfiguration Settings for Image Builder to configure the ECR repository and output
     *   container images that are scanned.
     */
    public fun ecrConfiguration(ecrConfiguration: IResolvable) {
        cdkBuilder.ecrConfiguration(ecrConfiguration)
    }

    /**
     * @param ecrConfiguration Settings for Image Builder to configure the ECR repository and output
     *   container images that are scanned.
     */
    public fun ecrConfiguration(ecrConfiguration: CfnImage.EcrConfigurationProperty) {
        cdkBuilder.ecrConfiguration(ecrConfiguration)
    }

    /**
     * @param imageScanningEnabled This sets whether Image Builder keeps a snapshot of the
     *   vulnerability scans that Amazon Inspector runs against the build instance when you create a
     *   new image.
     */
    public fun imageScanningEnabled(imageScanningEnabled: Boolean) {
        cdkBuilder.imageScanningEnabled(imageScanningEnabled)
    }

    /**
     * @param imageScanningEnabled This sets whether Image Builder keeps a snapshot of the
     *   vulnerability scans that Amazon Inspector runs against the build instance when you create a
     *   new image.
     */
    public fun imageScanningEnabled(imageScanningEnabled: IResolvable) {
        cdkBuilder.imageScanningEnabled(imageScanningEnabled)
    }

    public fun build(): CfnImage.ImageScanningConfigurationProperty = cdkBuilder.build()
}
