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

package io.cloudshiftdev.awscdkdsl.services.route53recoveryreadiness

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.route53recoveryreadiness.CfnRecoveryGroupProps

/**
 * Properties for defining a `CfnRecoveryGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53recoveryreadiness.*;
 * CfnRecoveryGroupProps cfnRecoveryGroupProps = CfnRecoveryGroupProps.builder()
 * .cells(List.of("cells"))
 * .recoveryGroupName("recoveryGroupName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoveryreadiness-recoverygroup.html)
 */
@CdkDslMarker
public class CfnRecoveryGroupPropsDsl {
    private val cdkBuilder: CfnRecoveryGroupProps.Builder = CfnRecoveryGroupProps.builder()

    private val _cells: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param cells A list of the cell Amazon Resource Names (ARNs) in the recovery group. */
    public fun cells(vararg cells: String) {
        _cells.addAll(listOf(*cells))
    }

    /** @param cells A list of the cell Amazon Resource Names (ARNs) in the recovery group. */
    public fun cells(cells: Collection<String>) {
        _cells.addAll(cells)
    }

    /** @param recoveryGroupName The name of the recovery group to create. */
    public fun recoveryGroupName(recoveryGroupName: String) {
        cdkBuilder.recoveryGroupName(recoveryGroupName)
    }

    /** @param tags A collection of tags associated with a resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags A collection of tags associated with a resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnRecoveryGroupProps {
        if (_cells.isNotEmpty()) cdkBuilder.cells(_cells)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
