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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

/**
 * Describes execution properties for a Flink-based Kinesis Data Analytics application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * EnvironmentPropertiesProperty environmentPropertiesProperty =
 * EnvironmentPropertiesProperty.builder()
 * .propertyGroups(List.of(PropertyGroupProperty.builder()
 * .propertyGroupId("propertyGroupId")
 * .propertyMap(Map.of(
 * "propertyMapKey", "propertyMap"))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-environmentproperties.html)
 */
@CdkDslMarker
public class CfnApplicationV2EnvironmentPropertiesPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.EnvironmentPropertiesProperty.Builder =
        CfnApplicationV2.EnvironmentPropertiesProperty.builder()

    private val _propertyGroups: MutableList<Any> = mutableListOf()

    /** @param propertyGroups Describes the execution property groups. */
    public fun propertyGroups(vararg propertyGroups: Any) {
        _propertyGroups.addAll(listOf(*propertyGroups))
    }

    /** @param propertyGroups Describes the execution property groups. */
    public fun propertyGroups(propertyGroups: Collection<Any>) {
        _propertyGroups.addAll(propertyGroups)
    }

    /** @param propertyGroups Describes the execution property groups. */
    public fun propertyGroups(propertyGroups: IResolvable) {
        cdkBuilder.propertyGroups(propertyGroups)
    }

    public fun build(): CfnApplicationV2.EnvironmentPropertiesProperty {
        if (_propertyGroups.isNotEmpty()) cdkBuilder.propertyGroups(_propertyGroups)
        return cdkBuilder.build()
    }
}
