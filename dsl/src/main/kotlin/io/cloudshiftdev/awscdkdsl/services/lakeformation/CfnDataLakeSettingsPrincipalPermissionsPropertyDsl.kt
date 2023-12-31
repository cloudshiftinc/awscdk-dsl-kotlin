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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnDataLakeSettings

/**
 * Permissions granted to a principal.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * PrincipalPermissionsProperty principalPermissionsProperty =
 * PrincipalPermissionsProperty.builder()
 * .permissions(List.of("permissions"))
 * .principal(DataLakePrincipalProperty.builder()
 * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-datalakesettings-principalpermissions.html)
 */
@CdkDslMarker
public class CfnDataLakeSettingsPrincipalPermissionsPropertyDsl {
    private val cdkBuilder: CfnDataLakeSettings.PrincipalPermissionsProperty.Builder =
        CfnDataLakeSettings.PrincipalPermissionsProperty.builder()

    private val _permissions: MutableList<String> = mutableListOf()

    /** @param permissions The permissions that are granted to the principal. */
    public fun permissions(vararg permissions: String) {
        _permissions.addAll(listOf(*permissions))
    }

    /** @param permissions The permissions that are granted to the principal. */
    public fun permissions(permissions: Collection<String>) {
        _permissions.addAll(permissions)
    }

    /** @param principal The principal who is granted permissions. */
    public fun principal(principal: IResolvable) {
        cdkBuilder.principal(principal)
    }

    /** @param principal The principal who is granted permissions. */
    public fun principal(principal: CfnDataLakeSettings.DataLakePrincipalProperty) {
        cdkBuilder.principal(principal)
    }

    public fun build(): CfnDataLakeSettings.PrincipalPermissionsProperty {
        if (_permissions.isNotEmpty()) cdkBuilder.permissions(_permissions)
        return cdkBuilder.build()
    }
}
