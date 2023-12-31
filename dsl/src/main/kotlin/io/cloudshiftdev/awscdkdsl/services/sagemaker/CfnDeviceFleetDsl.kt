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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnDeviceFleet
import software.constructs.Construct

/**
 * The `AWS::SageMaker::DeviceFleet` resource is an Amazon SageMaker resource type that allows you
 * to create a DeviceFleet that manages your SageMaker Edge Manager Devices.
 *
 * You must register your devices against the `DeviceFleet` separately.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnDeviceFleet cfnDeviceFleet = CfnDeviceFleet.Builder.create(this, "MyCfnDeviceFleet")
 * .deviceFleetName("deviceFleetName")
 * .outputConfig(EdgeOutputConfigProperty.builder()
 * .s3OutputLocation("s3OutputLocation")
 * // the properties below are optional
 * .kmsKeyId("kmsKeyId")
 * .build())
 * .roleArn("roleArn")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html)
 */
@CdkDslMarker
public class CfnDeviceFleetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDeviceFleet.Builder = CfnDeviceFleet.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A description of the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-description)
     *
     * @param description A description of the fleet.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Name of the device fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-devicefleetname)
     *
     * @param deviceFleetName Name of the device fleet.
     */
    public fun deviceFleetName(deviceFleetName: String) {
        cdkBuilder.deviceFleetName(deviceFleetName)
    }

    /**
     * The output configuration for storing sample data collected by the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-outputconfig)
     *
     * @param outputConfig The output configuration for storing sample data collected by the fleet.
     */
    public fun outputConfig(outputConfig: IResolvable) {
        cdkBuilder.outputConfig(outputConfig)
    }

    /**
     * The output configuration for storing sample data collected by the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-outputconfig)
     *
     * @param outputConfig The output configuration for storing sample data collected by the fleet.
     */
    public fun outputConfig(outputConfig: CfnDeviceFleet.EdgeOutputConfigProperty) {
        cdkBuilder.outputConfig(outputConfig)
    }

    /**
     * The Amazon Resource Name (ARN) that has access to AWS Internet of Things (IoT).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-rolearn)
     *
     * @param roleArn The Amazon Resource Name (ARN) that has access to AWS Internet of Things
     *   (IoT).
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * An array of key-value pairs that contain metadata to help you categorize and organize your
     * device fleets.
     *
     * Each tag consists of a key and a value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-tags)
     *
     * @param tags An array of key-value pairs that contain metadata to help you categorize and
     *   organize your device fleets.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs that contain metadata to help you categorize and organize your
     * device fleets.
     *
     * Each tag consists of a key and a value, both of which you define.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-devicefleet.html#cfn-sagemaker-devicefleet-tags)
     *
     * @param tags An array of key-value pairs that contain metadata to help you categorize and
     *   organize your device fleets.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDeviceFleet {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
