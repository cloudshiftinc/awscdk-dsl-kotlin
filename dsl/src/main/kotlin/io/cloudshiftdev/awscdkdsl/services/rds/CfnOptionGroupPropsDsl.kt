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

package io.cloudshiftdev.awscdkdsl.services.rds

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rds.CfnOptionGroupProps

/**
 * Properties for defining a `CfnOptionGroup`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * CfnOptionGroupProps cfnOptionGroupProps = CfnOptionGroupProps.builder()
 * .engineName("engineName")
 * .majorEngineVersion("majorEngineVersion")
 * .optionGroupDescription("optionGroupDescription")
 * // the properties below are optional
 * .optionConfigurations(List.of(OptionConfigurationProperty.builder()
 * .optionName("optionName")
 * // the properties below are optional
 * .dbSecurityGroupMemberships(List.of("dbSecurityGroupMemberships"))
 * .optionSettings(List.of(OptionSettingProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .optionVersion("optionVersion")
 * .port(123)
 * .vpcSecurityGroupMemberships(List.of("vpcSecurityGroupMemberships"))
 * .build()))
 * .optionGroupName("optionGroupName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-optiongroup.html)
 */
@CdkDslMarker
public class CfnOptionGroupPropsDsl {
    private val cdkBuilder: CfnOptionGroupProps.Builder = CfnOptionGroupProps.builder()

    private val _optionConfigurations: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param engineName Specifies the name of the engine that this option group should be
     *   associated with. Valid Values:
     * * `mariadb`
     * * `mysql`
     * * `oracle-ee`
     * * `oracle-ee-cdb`
     * * `oracle-se2`
     * * `oracle-se2-cdb`
     * * `postgres`
     * * `sqlserver-ee`
     * * `sqlserver-se`
     * * `sqlserver-ex`
     * * `sqlserver-web`
     */
    public fun engineName(engineName: String) {
        cdkBuilder.engineName(engineName)
    }

    /**
     * @param majorEngineVersion Specifies the major version of the engine that this option group
     *   should be associated with.
     */
    public fun majorEngineVersion(majorEngineVersion: String) {
        cdkBuilder.majorEngineVersion(majorEngineVersion)
    }

    /** @param optionConfigurations A list of options and the settings for each option. */
    public fun optionConfigurations(vararg optionConfigurations: Any) {
        _optionConfigurations.addAll(listOf(*optionConfigurations))
    }

    /** @param optionConfigurations A list of options and the settings for each option. */
    public fun optionConfigurations(optionConfigurations: Collection<Any>) {
        _optionConfigurations.addAll(optionConfigurations)
    }

    /** @param optionConfigurations A list of options and the settings for each option. */
    public fun optionConfigurations(optionConfigurations: IResolvable) {
        cdkBuilder.optionConfigurations(optionConfigurations)
    }

    /** @param optionGroupDescription The description of the option group. */
    public fun optionGroupDescription(optionGroupDescription: String) {
        cdkBuilder.optionGroupDescription(optionGroupDescription)
    }

    /**
     * @param optionGroupName The name of the option group to be created. Constraints:
     * * Must be 1 to 255 letters, numbers, or hyphens
     * * First character must be a letter
     * * Can't end with a hyphen or contain two consecutive hyphens
     *
     * Example: `myoptiongroup`
     *
     * If you don't specify a value for `OptionGroupName` property, a name is automatically created
     * for the option group.
     *
     * This value is stored as a lowercase string.
     */
    public fun optionGroupName(optionGroupName: String) {
        cdkBuilder.optionGroupName(optionGroupName)
    }

    /** @param tags An optional array of key-value pairs to apply to this option group. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags An optional array of key-value pairs to apply to this option group. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnOptionGroupProps {
        if (_optionConfigurations.isNotEmpty())
            cdkBuilder.optionConfigurations(_optionConfigurations)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
