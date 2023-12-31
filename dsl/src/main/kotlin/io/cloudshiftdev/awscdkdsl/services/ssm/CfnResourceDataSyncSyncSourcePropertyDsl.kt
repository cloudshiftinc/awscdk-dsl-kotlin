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

package io.cloudshiftdev.awscdkdsl.services.ssm

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnResourceDataSync

/**
 * Information about the source of the data included in the resource data sync.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * SyncSourceProperty syncSourceProperty = SyncSourceProperty.builder()
 * .sourceRegions(List.of("sourceRegions"))
 * .sourceType("sourceType")
 * // the properties below are optional
 * .awsOrganizationsSource(AwsOrganizationsSourceProperty.builder()
 * .organizationSourceType("organizationSourceType")
 * // the properties below are optional
 * .organizationalUnits(List.of("organizationalUnits"))
 * .build())
 * .includeFutureRegions(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html)
 */
@CdkDslMarker
public class CfnResourceDataSyncSyncSourcePropertyDsl {
    private val cdkBuilder: CfnResourceDataSync.SyncSourceProperty.Builder =
        CfnResourceDataSync.SyncSourceProperty.builder()

    private val _sourceRegions: MutableList<String> = mutableListOf()

    /**
     * @param awsOrganizationsSource Information about the AwsOrganizationsSource resource data sync
     *   source. A sync source of this type can synchronize data from AWS Organizations .
     */
    public fun awsOrganizationsSource(awsOrganizationsSource: IResolvable) {
        cdkBuilder.awsOrganizationsSource(awsOrganizationsSource)
    }

    /**
     * @param awsOrganizationsSource Information about the AwsOrganizationsSource resource data sync
     *   source. A sync source of this type can synchronize data from AWS Organizations .
     */
    public fun awsOrganizationsSource(
        awsOrganizationsSource: CfnResourceDataSync.AwsOrganizationsSourceProperty
    ) {
        cdkBuilder.awsOrganizationsSource(awsOrganizationsSource)
    }

    /**
     * @param includeFutureRegions Whether to automatically synchronize and aggregate data from new
     *   AWS Regions when those Regions come online.
     */
    public fun includeFutureRegions(includeFutureRegions: Boolean) {
        cdkBuilder.includeFutureRegions(includeFutureRegions)
    }

    /**
     * @param includeFutureRegions Whether to automatically synchronize and aggregate data from new
     *   AWS Regions when those Regions come online.
     */
    public fun includeFutureRegions(includeFutureRegions: IResolvable) {
        cdkBuilder.includeFutureRegions(includeFutureRegions)
    }

    /** @param sourceRegions The `SyncSource` AWS Regions included in the resource data sync. */
    public fun sourceRegions(vararg sourceRegions: String) {
        _sourceRegions.addAll(listOf(*sourceRegions))
    }

    /** @param sourceRegions The `SyncSource` AWS Regions included in the resource data sync. */
    public fun sourceRegions(sourceRegions: Collection<String>) {
        _sourceRegions.addAll(sourceRegions)
    }

    /**
     * @param sourceType The type of data source for the resource data sync. `SourceType` is either
     *   `AwsOrganizations` (if an organization is present in AWS Organizations ) or
     *   `SingleAccountMultiRegions` .
     */
    public fun sourceType(sourceType: String) {
        cdkBuilder.sourceType(sourceType)
    }

    public fun build(): CfnResourceDataSync.SyncSourceProperty {
        if (_sourceRegions.isNotEmpty()) cdkBuilder.sourceRegions(_sourceRegions)
        return cdkBuilder.build()
    }
}
