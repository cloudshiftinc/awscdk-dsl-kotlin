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

package io.cloudshiftdev.awscdkdsl.services.location

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.location.CfnGeofenceCollectionProps

/**
 * Properties for defining a `CfnGeofenceCollection`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.location.*;
 * CfnGeofenceCollectionProps cfnGeofenceCollectionProps = CfnGeofenceCollectionProps.builder()
 * .collectionName("collectionName")
 * // the properties below are optional
 * .description("description")
 * .kmsKeyId("kmsKeyId")
 * .pricingPlan("pricingPlan")
 * .pricingPlanDataSource("pricingPlanDataSource")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html)
 */
@CdkDslMarker
public class CfnGeofenceCollectionPropsDsl {
    private val cdkBuilder: CfnGeofenceCollectionProps.Builder =
        CfnGeofenceCollectionProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param collectionName A custom name for the geofence collection. Requirements:
     * * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and
     *   underscores (_).
     * * Must be a unique geofence collection name.
     * * No spaces allowed. For example, `ExampleGeofenceCollection` .
     */
    public fun collectionName(collectionName: String) {
        cdkBuilder.collectionName(collectionName)
    }

    /** @param description An optional description for the geofence collection. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param kmsKeyId A key identifier for an
     *   [AWS KMS customer managed key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html)
     *   . Enter a key ID, key ARN, alias name, or alias ARN.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param pricingPlan the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun pricingPlan(pricingPlan: String) {
        cdkBuilder.pricingPlan(pricingPlan)
    }

    /**
     * @param pricingPlanDataSource the value to be set.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun pricingPlanDataSource(pricingPlanDataSource: String) {
        cdkBuilder.pricingPlanDataSource(pricingPlanDataSource)
    }

    /**
     * @param tags Applies one or more tags to the geofence collection. A tag is a key-value pair
     *   helps manage, identify, search, and filter your resources by labelling them.
     *
     * Format: `"key" : "value"`
     *
     * Restrictions:
     * * Maximum 50 tags per resource
     * * Each resource tag must be unique with a maximum of one value.
     * * Maximum key length: 128 Unicode characters in UTF-8
     * * Maximum value length: 256 Unicode characters in UTF-8
     * * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ :
     *   /
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Applies one or more tags to the geofence collection. A tag is a key-value pair
     *   helps manage, identify, search, and filter your resources by labelling them.
     *
     * Format: `"key" : "value"`
     *
     * Restrictions:
     * * Maximum 50 tags per resource
     * * Each resource tag must be unique with a maximum of one value.
     * * Maximum key length: 128 Unicode characters in UTF-8
     * * Maximum value length: 256 Unicode characters in UTF-8
     * * Can use alphanumeric characters (A–Z, a–z, 0–9), and the following characters: + - = . _ :
     *   /
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnGeofenceCollectionProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
