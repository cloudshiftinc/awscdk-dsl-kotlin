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
 * A structure containing an LF-tag key and values for a resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
 * LFTagKeyResourceProperty lFTagKeyResourceProperty = LFTagKeyResourceProperty.builder()
 * .catalogId("catalogId")
 * .tagKey("tagKey")
 * .tagValues(List.of("tagValues"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftagkeyresource.html)
 */
@CdkDslMarker
public class CfnPrincipalPermissionsLFTagKeyResourcePropertyDsl {
    private val cdkBuilder: CfnPrincipalPermissions.LFTagKeyResourceProperty.Builder =
        CfnPrincipalPermissions.LFTagKeyResourceProperty.builder()

    private val _tagValues: MutableList<String> = mutableListOf()

    /**
     * @param catalogId The identifier for the Data Catalog where the location is registered with
     *   Data Catalog .
     */
    public fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
    }

    /** @param tagKey The key-name for the LF-tag. */
    public fun tagKey(tagKey: String) {
        cdkBuilder.tagKey(tagKey)
    }

    /**
     * @param tagValues A list of possible values for the corresponding `TagKey` of an LF-tag
     *   key-value pair.
     */
    public fun tagValues(vararg tagValues: String) {
        _tagValues.addAll(listOf(*tagValues))
    }

    /**
     * @param tagValues A list of possible values for the corresponding `TagKey` of an LF-tag
     *   key-value pair.
     */
    public fun tagValues(tagValues: Collection<String>) {
        _tagValues.addAll(tagValues)
    }

    public fun build(): CfnPrincipalPermissions.LFTagKeyResourceProperty {
        if (_tagValues.isNotEmpty()) cdkBuilder.tagValues(_tagValues)
        return cdkBuilder.build()
    }
}
