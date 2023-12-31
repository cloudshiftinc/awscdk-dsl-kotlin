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

package io.cloudshiftdev.awscdkdsl.services.greengrass

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion

/**
 * Settings that define additional Linux OS group permissions to give to the Lambda function
 * process.
 *
 * You can give the permissions of the Linux group that owns the resource or choose another Linux
 * group. These permissions are in addition to the function's `RunAs` permissions.
 *
 * In an AWS CloudFormation template, `GroupOwnerSetting` is a property of the
 * [`LocalDeviceResourceData`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html)
 * and
 * [`LocalVolumeResourceData`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html)
 * property types.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * GroupOwnerSettingProperty groupOwnerSettingProperty = GroupOwnerSettingProperty.builder()
 * .autoAddGroupOwner(false)
 * // the properties below are optional
 * .groupOwner("groupOwner")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-groupownersetting.html)
 */
@CdkDslMarker
public class CfnResourceDefinitionVersionGroupOwnerSettingPropertyDsl {
    private val cdkBuilder: CfnResourceDefinitionVersion.GroupOwnerSettingProperty.Builder =
        CfnResourceDefinitionVersion.GroupOwnerSettingProperty.builder()

    /**
     * @param autoAddGroupOwner Indicates whether to give the privileges of the Linux group that
     *   owns the resource to the Lambda process. This gives the Lambda process the file access
     *   permissions of the Linux group.
     */
    public fun autoAddGroupOwner(autoAddGroupOwner: Boolean) {
        cdkBuilder.autoAddGroupOwner(autoAddGroupOwner)
    }

    /**
     * @param autoAddGroupOwner Indicates whether to give the privileges of the Linux group that
     *   owns the resource to the Lambda process. This gives the Lambda process the file access
     *   permissions of the Linux group.
     */
    public fun autoAddGroupOwner(autoAddGroupOwner: IResolvable) {
        cdkBuilder.autoAddGroupOwner(autoAddGroupOwner)
    }

    /**
     * @param groupOwner The name of the Linux group whose privileges you want to add to the Lambda
     *   process. This value is ignored if `AutoAddGroupOwner` is true.
     */
    public fun groupOwner(groupOwner: String) {
        cdkBuilder.groupOwner(groupOwner)
    }

    public fun build(): CfnResourceDefinitionVersion.GroupOwnerSettingProperty = cdkBuilder.build()
}
