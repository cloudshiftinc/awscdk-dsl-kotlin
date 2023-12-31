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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import software.amazon.awscdk.services.location.CfnGeofenceCollection
import software.constructs.Construct

/**
 * The `AWS::Location::GeofenceCollection` resource specifies the ability to detect and act when a
 * tracked device enters or exits a defined geographical boundary known as a geofence.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.location.*;
 * CfnGeofenceCollection cfnGeofenceCollection = CfnGeofenceCollection.Builder.create(this,
 * "MyCfnGeofenceCollection")
 * .collectionName("collectionName")
 * // the properties below are optional
 * .description("description")
 * .kmsKeyId("kmsKeyId")
 * .pricingPlan("pricingPlan")
 * .pricingPlanDataSource("pricingPlanDataSource")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html)
 */
@CdkDslMarker
public class CfnGeofenceCollectionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGeofenceCollection.Builder =
        CfnGeofenceCollection.Builder.create(scope, id)

    /**
     * A custom name for the geofence collection.
     *
     * Requirements:
     * * Contain only alphanumeric characters (A–Z, a–z, 0–9), hyphens (-), periods (.), and
     *   underscores (_).
     * * Must be a unique geofence collection name.
     * * No spaces allowed. For example, `ExampleGeofenceCollection` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-collectionname)
     *
     * @param collectionName A custom name for the geofence collection.
     */
    public fun collectionName(collectionName: String) {
        cdkBuilder.collectionName(collectionName)
    }

    /**
     * An optional description for the geofence collection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-description)
     *
     * @param description An optional description for the geofence collection.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * A key identifier for an
     * [AWS KMS customer managed key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html)
     * . Enter a key ID, key ARN, alias name, or alias ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-kmskeyid)
     *
     * @param kmsKeyId A key identifier for an
     *   [AWS KMS customer managed key](https://docs.aws.amazon.com/kms/latest/developerguide/create-keys.html)
     *   . Enter a key ID, key ARN, alias name, or alias ARN.
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-pricingplan)
     *
     * @param pricingPlan
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun pricingPlan(pricingPlan: String) {
        cdkBuilder.pricingPlan(pricingPlan)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-location-geofencecollection.html#cfn-location-geofencecollection-pricingplandatasource)
     *
     * @param pricingPlanDataSource
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun pricingPlanDataSource(pricingPlanDataSource: String) {
        cdkBuilder.pricingPlanDataSource(pricingPlanDataSource)
    }

    public fun build(): CfnGeofenceCollection = cdkBuilder.build()
}
