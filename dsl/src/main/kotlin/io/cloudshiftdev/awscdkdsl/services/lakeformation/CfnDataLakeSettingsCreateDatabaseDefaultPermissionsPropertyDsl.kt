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

package io.cloudshiftdev.awscdkdsl.services.lakeformation

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings

/**
 * Specifies whether access control on a newly created database is managed by Lake Formation
 * permissions or exclusively by IAM permissions.
 *
 * A null value indicates that the access is controlled by Lake Formation permissions. A value that
 * assigns `ALL` to `IAM_ALLOWED_PRINCIPALS` indicates access control by IAM permissions. This is
 * referred to as the setting "Use only IAM access control," and is for backward compatibility with
 * the AWS Glue permission model implemented by IAM permissions.
 *
 * The only permitted values are an empty array or an array that contains a single JSON object that
 * grants `ALL` to `IAM_ALLOWED_PRINCIPALS` .
 *
 * For more information, see
 * [Changing the default security settings for your data lake](https://docs.aws.amazon.com/lake-formation/latest/dg/change-settings.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * CreateDatabaseDefaultPermissionsProperty createDatabaseDefaultPermissionsProperty =
 * CreateDatabaseDefaultPermissionsProperty.builder().build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datalakesettings-createdatabasedefaultpermissions.html)
 */
@CdkDslMarker
public class CfnDataLakeSettingsCreateDatabaseDefaultPermissionsPropertyDsl {
    private val cdkBuilder: CfnDataLakeSettings.CreateDatabaseDefaultPermissionsProperty.Builder =
        CfnDataLakeSettings.CreateDatabaseDefaultPermissionsProperty.builder()

    public fun build(): CfnDataLakeSettings.CreateDatabaseDefaultPermissionsProperty =
        cdkBuilder.build()
}
