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
import software.amazon.awscdk.services.sagemaker.CfnDeviceFleetProps

/**
 * Properties for defining a `CfnDeviceFleet`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CfnDeviceFleetProps cfnDeviceFleetProps = CfnDeviceFleetProps.builder()
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
public class CfnDeviceFleetPropsDsl {
    private val cdkBuilder: CfnDeviceFleetProps.Builder = CfnDeviceFleetProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description A description of the fleet. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param deviceFleetName Name of the device fleet. */
    public fun deviceFleetName(deviceFleetName: String) {
        cdkBuilder.deviceFleetName(deviceFleetName)
    }

    /**
     * @param outputConfig The output configuration for storing sample data collected by the fleet.
     */
    public fun outputConfig(outputConfig: IResolvable) {
        cdkBuilder.outputConfig(outputConfig)
    }

    /**
     * @param outputConfig The output configuration for storing sample data collected by the fleet.
     */
    public fun outputConfig(outputConfig: CfnDeviceFleet.EdgeOutputConfigProperty) {
        cdkBuilder.outputConfig(outputConfig)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) that has access to AWS Internet of Things
     *   (IoT).
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags An array of key-value pairs that contain metadata to help you categorize and
     *   organize your device fleets. Each tag consists of a key and a value, both of which you
     *   define.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags An array of key-value pairs that contain metadata to help you categorize and
     *   organize your device fleets. Each tag consists of a key and a value, both of which you
     *   define.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDeviceFleetProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
