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

package io.cloudshiftdev.awscdkdsl.services.iotevents

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnInput
import software.constructs.Construct

/**
 * The AWS::IoTEvents::Input resource creates an input.
 *
 * To monitor your devices and processes, they must have a way to get telemetry data into AWS IoT
 * Events . This is done by sending messages as *inputs* to AWS IoT Events . For more information,
 * see
 * [How to Use AWS IoT Events](https://docs.aws.amazon.com/iotevents/latest/developerguide/how-to-use-iotevents.html)
 * in the *AWS IoT Events Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotevents.*;
 * CfnInput cfnInput = CfnInput.Builder.create(this, "MyCfnInput")
 * .inputDefinition(InputDefinitionProperty.builder()
 * .attributes(List.of(AttributeProperty.builder()
 * .jsonPath("jsonPath")
 * .build()))
 * .build())
 * // the properties below are optional
 * .inputDescription("inputDescription")
 * .inputName("inputName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html)
 */
@CdkDslMarker
public class CfnInputDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnInput.Builder = CfnInput.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The definition of the input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-inputdefinition)
     *
     * @param inputDefinition The definition of the input.
     */
    public fun inputDefinition(inputDefinition: IResolvable) {
        cdkBuilder.inputDefinition(inputDefinition)
    }

    /**
     * The definition of the input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-inputdefinition)
     *
     * @param inputDefinition The definition of the input.
     */
    public fun inputDefinition(inputDefinition: CfnInput.InputDefinitionProperty) {
        cdkBuilder.inputDefinition(inputDefinition)
    }

    /**
     * A brief description of the input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-inputdescription)
     *
     * @param inputDescription A brief description of the input.
     */
    public fun inputDescription(inputDescription: String) {
        cdkBuilder.inputDescription(inputDescription)
    }

    /**
     * The name of the input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-inputname)
     *
     * @param inputName The name of the input.
     */
    public fun inputName(inputName: String) {
        cdkBuilder.inputName(inputName)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotevents-input.html#cfn-iotevents-input-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnInput {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
