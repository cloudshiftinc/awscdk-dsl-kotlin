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

package io.cloudshiftdev.awscdkdsl.services.emrserverless

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrserverless.CfnApplication
import software.constructs.Construct

/**
 * The `AWS::EMRServerless::Application` resource specifies an EMR Serverless application.
 *
 * An application uses open source analytics frameworks to run jobs that process data. To create an
 * application, you must specify the release version for the open source framework version you want
 * to use and the type of application you want, such as Apache Spark or Apache Hive. After you
 * create an application, you can submit data processing jobs or interactive requests to it.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emrserverless.*;
 * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
 * .releaseLabel("releaseLabel")
 * .type("type")
 * // the properties below are optional
 * .architecture("architecture")
 * .autoStartConfiguration(AutoStartConfigurationProperty.builder()
 * .enabled(false)
 * .build())
 * .autoStopConfiguration(AutoStopConfigurationProperty.builder()
 * .enabled(false)
 * .idleTimeoutMinutes(123)
 * .build())
 * .imageConfiguration(ImageConfigurationInputProperty.builder()
 * .imageUri("imageUri")
 * .build())
 * .initialCapacity(List.of(InitialCapacityConfigKeyValuePairProperty.builder()
 * .key("key")
 * .value(InitialCapacityConfigProperty.builder()
 * .workerConfiguration(WorkerConfigurationProperty.builder()
 * .cpu("cpu")
 * .memory("memory")
 * // the properties below are optional
 * .disk("disk")
 * .build())
 * .workerCount(123)
 * .build())
 * .build()))
 * .maximumCapacity(MaximumAllowedResourcesProperty.builder()
 * .cpu("cpu")
 * .memory("memory")
 * // the properties below are optional
 * .disk("disk")
 * .build())
 * .name("name")
 * .networkConfiguration(NetworkConfigurationProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .workerTypeSpecifications(Map.of(
 * "workerTypeSpecificationsKey", WorkerTypeSpecificationInputProperty.builder()
 * .imageConfiguration(ImageConfigurationInputProperty.builder()
 * .imageUri("imageUri")
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html)
 */
@CdkDslMarker
public class CfnApplicationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApplication.Builder = CfnApplication.Builder.create(scope, id)

    private val _initialCapacity: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The CPU architecture type of the application.
     *
     * Allowed values: `X86_64` or `ARM64`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-architecture)
     *
     * @param architecture The CPU architecture type of the application.
     */
    public fun architecture(architecture: String) {
        cdkBuilder.architecture(architecture)
    }

    /**
     * The configuration for an application to automatically start on job submission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostartconfiguration)
     *
     * @param autoStartConfiguration The configuration for an application to automatically start on
     *   job submission.
     */
    public fun autoStartConfiguration(autoStartConfiguration: IResolvable) {
        cdkBuilder.autoStartConfiguration(autoStartConfiguration)
    }

    /**
     * The configuration for an application to automatically start on job submission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostartconfiguration)
     *
     * @param autoStartConfiguration The configuration for an application to automatically start on
     *   job submission.
     */
    public fun autoStartConfiguration(
        autoStartConfiguration: CfnApplication.AutoStartConfigurationProperty
    ) {
        cdkBuilder.autoStartConfiguration(autoStartConfiguration)
    }

    /**
     * The configuration for an application to automatically stop after a certain amount of time
     * being idle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostopconfiguration)
     *
     * @param autoStopConfiguration The configuration for an application to automatically stop after
     *   a certain amount of time being idle.
     */
    public fun autoStopConfiguration(autoStopConfiguration: IResolvable) {
        cdkBuilder.autoStopConfiguration(autoStopConfiguration)
    }

    /**
     * The configuration for an application to automatically stop after a certain amount of time
     * being idle.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-autostopconfiguration)
     *
     * @param autoStopConfiguration The configuration for an application to automatically stop after
     *   a certain amount of time being idle.
     */
    public fun autoStopConfiguration(
        autoStopConfiguration: CfnApplication.AutoStopConfigurationProperty
    ) {
        cdkBuilder.autoStopConfiguration(autoStopConfiguration)
    }

    /**
     * The image configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-imageconfiguration)
     *
     * @param imageConfiguration The image configuration.
     */
    public fun imageConfiguration(imageConfiguration: IResolvable) {
        cdkBuilder.imageConfiguration(imageConfiguration)
    }

    /**
     * The image configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-imageconfiguration)
     *
     * @param imageConfiguration The image configuration.
     */
    public fun imageConfiguration(
        imageConfiguration: CfnApplication.ImageConfigurationInputProperty
    ) {
        cdkBuilder.imageConfiguration(imageConfiguration)
    }

    /**
     * The initial capacity of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-initialcapacity)
     *
     * @param initialCapacity The initial capacity of the application.
     */
    public fun initialCapacity(vararg initialCapacity: Any) {
        _initialCapacity.addAll(listOf(*initialCapacity))
    }

    /**
     * The initial capacity of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-initialcapacity)
     *
     * @param initialCapacity The initial capacity of the application.
     */
    public fun initialCapacity(initialCapacity: Collection<Any>) {
        _initialCapacity.addAll(initialCapacity)
    }

    /**
     * The initial capacity of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-initialcapacity)
     *
     * @param initialCapacity The initial capacity of the application.
     */
    public fun initialCapacity(initialCapacity: IResolvable) {
        cdkBuilder.initialCapacity(initialCapacity)
    }

    /**
     * The maximum capacity of the application.
     *
     * This is cumulative across all workers at any given point in time during the lifespan of the
     * application is created. No new resources will be created once any one of the defined limits
     * is hit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-maximumcapacity)
     *
     * @param maximumCapacity The maximum capacity of the application.
     */
    public fun maximumCapacity(maximumCapacity: IResolvable) {
        cdkBuilder.maximumCapacity(maximumCapacity)
    }

    /**
     * The maximum capacity of the application.
     *
     * This is cumulative across all workers at any given point in time during the lifespan of the
     * application is created. No new resources will be created once any one of the defined limits
     * is hit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-maximumcapacity)
     *
     * @param maximumCapacity The maximum capacity of the application.
     */
    public fun maximumCapacity(maximumCapacity: CfnApplication.MaximumAllowedResourcesProperty) {
        cdkBuilder.maximumCapacity(maximumCapacity)
    }

    /**
     * The name of the application.
     *
     * *Minimum* : 1
     *
     * *Maximum* : 64
     *
     * *Pattern* : `^[A-Za-z0-9._\\/#-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-name)
     *
     * @param name The name of the application.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The network configuration for customer VPC connectivity for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-networkconfiguration)
     *
     * @param networkConfiguration The network configuration for customer VPC connectivity for the
     *   application.
     */
    public fun networkConfiguration(networkConfiguration: IResolvable) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    /**
     * The network configuration for customer VPC connectivity for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-networkconfiguration)
     *
     * @param networkConfiguration The network configuration for customer VPC connectivity for the
     *   application.
     */
    public fun networkConfiguration(
        networkConfiguration: CfnApplication.NetworkConfigurationProperty
    ) {
        cdkBuilder.networkConfiguration(networkConfiguration)
    }

    /**
     * The EMR release version associated with the application.
     *
     * *Minimum* : 1
     *
     * *Maximum* : 64
     *
     * *Pattern* : `^[A-Za-z0-9._/-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-releaselabel)
     *
     * @param releaseLabel The EMR release version associated with the application.
     */
    public fun releaseLabel(releaseLabel: String) {
        cdkBuilder.releaseLabel(releaseLabel)
    }

    /**
     * The tags assigned to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-tags)
     *
     * @param tags The tags assigned to the application.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags assigned to the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-tags)
     *
     * @param tags The tags assigned to the application.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The type of application, such as Spark or Hive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-type)
     *
     * @param type The type of application, such as Spark or Hive.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-workertypespecifications)
     *
     * @param workerTypeSpecifications
     */
    public fun workerTypeSpecifications(workerTypeSpecifications: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(workerTypeSpecifications)
        cdkBuilder.workerTypeSpecifications(builder.map)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-workertypespecifications)
     *
     * @param workerTypeSpecifications
     */
    public fun workerTypeSpecifications(workerTypeSpecifications: Map<String, Any>) {
        cdkBuilder.workerTypeSpecifications(workerTypeSpecifications)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emrserverless-application.html#cfn-emrserverless-application-workertypespecifications)
     *
     * @param workerTypeSpecifications
     */
    public fun workerTypeSpecifications(workerTypeSpecifications: IResolvable) {
        cdkBuilder.workerTypeSpecifications(workerTypeSpecifications)
    }

    public fun build(): CfnApplication {
        if (_initialCapacity.isNotEmpty()) cdkBuilder.initialCapacity(_initialCapacity)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
