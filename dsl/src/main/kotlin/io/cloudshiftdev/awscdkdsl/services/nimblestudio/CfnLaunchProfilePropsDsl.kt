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

package io.cloudshiftdev.awscdkdsl.services.nimblestudio

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfileProps

/**
 * Properties for defining a `CfnLaunchProfile`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.nimblestudio.*;
 * CfnLaunchProfileProps cfnLaunchProfileProps = CfnLaunchProfileProps.builder()
 * .ec2SubnetIds(List.of("ec2SubnetIds"))
 * .launchProfileProtocolVersions(List.of("launchProfileProtocolVersions"))
 * .name("name")
 * .streamConfiguration(StreamConfigurationProperty.builder()
 * .clipboardMode("clipboardMode")
 * .ec2InstanceTypes(List.of("ec2InstanceTypes"))
 * .streamingImageIds(List.of("streamingImageIds"))
 * // the properties below are optional
 * .automaticTerminationMode("automaticTerminationMode")
 * .maxSessionLengthInMinutes(123)
 * .maxStoppedSessionLengthInMinutes(123)
 * .sessionBackup(StreamConfigurationSessionBackupProperty.builder()
 * .maxBackupsToRetain(123)
 * .mode("mode")
 * .build())
 * .sessionPersistenceMode("sessionPersistenceMode")
 * .sessionStorage(StreamConfigurationSessionStorageProperty.builder()
 * .mode(List.of("mode"))
 * // the properties below are optional
 * .root(StreamingSessionStorageRootProperty.builder()
 * .linux("linux")
 * .windows("windows")
 * .build())
 * .build())
 * .volumeConfiguration(VolumeConfigurationProperty.builder()
 * .iops(123)
 * .size(123)
 * .throughput(123)
 * .build())
 * .build())
 * .studioComponentIds(List.of("studioComponentIds"))
 * .studioId("studioId")
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-launchprofile.html)
 */
@CdkDslMarker
public class CfnLaunchProfilePropsDsl {
    private val cdkBuilder: CfnLaunchProfileProps.Builder = CfnLaunchProfileProps.builder()

    private val _ec2SubnetIds: MutableList<String> = mutableListOf()

    private val _launchProfileProtocolVersions: MutableList<String> = mutableListOf()

    private val _studioComponentIds: MutableList<String> = mutableListOf()

    /** @param description A human-readable description of the launch profile. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param ec2SubnetIds Unique identifiers for a collection of EC2 subnets. */
    public fun ec2SubnetIds(vararg ec2SubnetIds: String) {
        _ec2SubnetIds.addAll(listOf(*ec2SubnetIds))
    }

    /** @param ec2SubnetIds Unique identifiers for a collection of EC2 subnets. */
    public fun ec2SubnetIds(ec2SubnetIds: Collection<String>) {
        _ec2SubnetIds.addAll(ec2SubnetIds)
    }

    /**
     * @param launchProfileProtocolVersions The version number of the protocol that is used by the
     *   launch profile. The only valid version is "2021-03-31".
     */
    public fun launchProfileProtocolVersions(vararg launchProfileProtocolVersions: String) {
        _launchProfileProtocolVersions.addAll(listOf(*launchProfileProtocolVersions))
    }

    /**
     * @param launchProfileProtocolVersions The version number of the protocol that is used by the
     *   launch profile. The only valid version is "2021-03-31".
     */
    public fun launchProfileProtocolVersions(launchProfileProtocolVersions: Collection<String>) {
        _launchProfileProtocolVersions.addAll(launchProfileProtocolVersions)
    }

    /** @param name A friendly name for the launch profile. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param streamConfiguration A configuration for a streaming session. */
    public fun streamConfiguration(streamConfiguration: IResolvable) {
        cdkBuilder.streamConfiguration(streamConfiguration)
    }

    /** @param streamConfiguration A configuration for a streaming session. */
    public fun streamConfiguration(
        streamConfiguration: CfnLaunchProfile.StreamConfigurationProperty
    ) {
        cdkBuilder.streamConfiguration(streamConfiguration)
    }

    /**
     * @param studioComponentIds Unique identifiers for a collection of studio components that can
     *   be used with this launch profile.
     */
    public fun studioComponentIds(vararg studioComponentIds: String) {
        _studioComponentIds.addAll(listOf(*studioComponentIds))
    }

    /**
     * @param studioComponentIds Unique identifiers for a collection of studio components that can
     *   be used with this launch profile.
     */
    public fun studioComponentIds(studioComponentIds: Collection<String>) {
        _studioComponentIds.addAll(studioComponentIds)
    }

    /**
     * @param studioId The unique identifier for a studio resource. In Nimble Studio , all other
     *   resources are contained in a studio resource.
     */
    public fun studioId(studioId: String) {
        cdkBuilder.studioId(studioId)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource. For more information, see
     *   [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     *   .
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnLaunchProfileProps {
        if (_ec2SubnetIds.isNotEmpty()) cdkBuilder.ec2SubnetIds(_ec2SubnetIds)
        if (_launchProfileProtocolVersions.isNotEmpty())
            cdkBuilder.launchProfileProtocolVersions(_launchProfileProtocolVersions)
        if (_studioComponentIds.isNotEmpty()) cdkBuilder.studioComponentIds(_studioComponentIds)
        return cdkBuilder.build()
    }
}
