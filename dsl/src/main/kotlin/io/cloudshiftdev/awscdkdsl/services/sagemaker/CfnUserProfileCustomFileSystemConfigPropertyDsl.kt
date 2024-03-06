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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnUserProfile

/**
 * The settings for assigning a custom file system to a user profile or space for an Amazon
 * SageMaker Domain.
 *
 * Permitted users can access this file system in Amazon SageMaker Studio.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CustomFileSystemConfigProperty customFileSystemConfigProperty =
 * CustomFileSystemConfigProperty.builder()
 * .efsFileSystemConfig(EFSFileSystemConfigProperty.builder()
 * .fileSystemId("fileSystemId")
 * // the properties below are optional
 * .fileSystemPath("fileSystemPath")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-customfilesystemconfig.html)
 */
@CdkDslMarker
public class CfnUserProfileCustomFileSystemConfigPropertyDsl {
    private val cdkBuilder: CfnUserProfile.CustomFileSystemConfigProperty.Builder =
        CfnUserProfile.CustomFileSystemConfigProperty.builder()

    /** @param efsFileSystemConfig The settings for a custom Amazon EFS file system. */
    public fun efsFileSystemConfig(efsFileSystemConfig: IResolvable) {
        cdkBuilder.efsFileSystemConfig(efsFileSystemConfig)
    }

    /** @param efsFileSystemConfig The settings for a custom Amazon EFS file system. */
    public fun efsFileSystemConfig(
        efsFileSystemConfig: CfnUserProfile.EFSFileSystemConfigProperty
    ) {
        cdkBuilder.efsFileSystemConfig(efsFileSystemConfig)
    }

    public fun build(): CfnUserProfile.CustomFileSystemConfigProperty = cdkBuilder.build()
}
