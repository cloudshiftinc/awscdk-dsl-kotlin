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

package io.cloudshiftdev.awscdkdsl.services.inspectorv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.inspectorv2.CfnFilter
import software.amazon.awscdk.services.inspectorv2.CfnFilterProps

/**
 * Properties for defining a `CfnFilter`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.inspectorv2.*;
 * CfnFilterProps cfnFilterProps = CfnFilterProps.builder()
 * .filterAction("filterAction")
 * .filterCriteria(FilterCriteriaProperty.builder()
 * .awsAccountId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .componentId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .componentType(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ec2InstanceImageId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ec2InstanceSubnetId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ec2InstanceVpcId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ecrImageArchitecture(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ecrImageHash(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ecrImagePushedAt(List.of(DateFilterProperty.builder()
 * .endInclusive(123)
 * .startInclusive(123)
 * .build()))
 * .ecrImageRegistry(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ecrImageRepositoryName(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .ecrImageTags(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .findingArn(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .findingStatus(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .findingType(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .firstObservedAt(List.of(DateFilterProperty.builder()
 * .endInclusive(123)
 * .startInclusive(123)
 * .build()))
 * .inspectorScore(List.of(NumberFilterProperty.builder()
 * .lowerInclusive(123)
 * .upperInclusive(123)
 * .build()))
 * .lastObservedAt(List.of(DateFilterProperty.builder()
 * .endInclusive(123)
 * .startInclusive(123)
 * .build()))
 * .networkProtocol(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .portRange(List.of(PortRangeFilterProperty.builder()
 * .beginInclusive(123)
 * .endInclusive(123)
 * .build()))
 * .relatedVulnerabilities(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .resourceTags(List.of(MapFilterProperty.builder()
 * .comparison("comparison")
 * // the properties below are optional
 * .key("key")
 * .value("value")
 * .build()))
 * .resourceType(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .severity(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .title(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .updatedAt(List.of(DateFilterProperty.builder()
 * .endInclusive(123)
 * .startInclusive(123)
 * .build()))
 * .vendorSeverity(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .vulnerabilityId(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .vulnerabilitySource(List.of(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build()))
 * .vulnerablePackages(List.of(PackageFilterProperty.builder()
 * .architecture(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build())
 * .epoch(NumberFilterProperty.builder()
 * .lowerInclusive(123)
 * .upperInclusive(123)
 * .build())
 * .name(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build())
 * .release(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build())
 * .sourceLayerHash(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build())
 * .version(StringFilterProperty.builder()
 * .comparison("comparison")
 * .value("value")
 * .build())
 * .build()))
 * .build())
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspectorv2-filter.html)
 */
@CdkDslMarker
public class CfnFilterPropsDsl {
    private val cdkBuilder: CfnFilterProps.Builder = CfnFilterProps.builder()

    /** @param description A description of the filter. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param filterAction The action that is to be applied to the findings that match the filter.
     */
    public fun filterAction(filterAction: String) {
        cdkBuilder.filterAction(filterAction)
    }

    /** @param filterCriteria Details on the filter criteria associated with this filter. */
    public fun filterCriteria(filterCriteria: IResolvable) {
        cdkBuilder.filterCriteria(filterCriteria)
    }

    /** @param filterCriteria Details on the filter criteria associated with this filter. */
    public fun filterCriteria(filterCriteria: CfnFilter.FilterCriteriaProperty) {
        cdkBuilder.filterCriteria(filterCriteria)
    }

    /** @param name The name of the filter. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnFilterProps = cdkBuilder.build()
}
