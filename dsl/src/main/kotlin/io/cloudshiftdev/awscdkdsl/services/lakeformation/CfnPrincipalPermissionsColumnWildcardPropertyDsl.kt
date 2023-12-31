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
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions

/**
 * A wildcard object, consisting of an optional list of excluded column names or indexes.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * ColumnWildcardProperty columnWildcardProperty = ColumnWildcardProperty.builder()
 * .excludedColumnNames(List.of("excludedColumnNames"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-columnwildcard.html)
 */
@CdkDslMarker
public class CfnPrincipalPermissionsColumnWildcardPropertyDsl {
    private val cdkBuilder: CfnPrincipalPermissions.ColumnWildcardProperty.Builder =
        CfnPrincipalPermissions.ColumnWildcardProperty.builder()

    private val _excludedColumnNames: MutableList<String> = mutableListOf()

    /**
     * @param excludedColumnNames Excludes column names. Any column with this name will be excluded.
     */
    public fun excludedColumnNames(vararg excludedColumnNames: String) {
        _excludedColumnNames.addAll(listOf(*excludedColumnNames))
    }

    /**
     * @param excludedColumnNames Excludes column names. Any column with this name will be excluded.
     */
    public fun excludedColumnNames(excludedColumnNames: Collection<String>) {
        _excludedColumnNames.addAll(excludedColumnNames)
    }

    public fun build(): CfnPrincipalPermissions.ColumnWildcardProperty {
        if (_excludedColumnNames.isNotEmpty()) cdkBuilder.excludedColumnNames(_excludedColumnNames)
        return cdkBuilder.build()
    }
}
