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

package io.cloudshiftdev.awscdkdsl.services.appstream

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnEntitlementProps

/**
 * Properties for defining a `CfnEntitlement`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * CfnEntitlementProps cfnEntitlementProps = CfnEntitlementProps.builder()
 * .appVisibility("appVisibility")
 * .attributes(List.of(AttributeProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .name("name")
 * .stackName("stackName")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html)
 */
@CdkDslMarker
public class CfnEntitlementPropsDsl {
    private val cdkBuilder: CfnEntitlementProps.Builder = CfnEntitlementProps.builder()

    private val _attributes: MutableList<Any> = mutableListOf()

    /** @param appVisibility Specifies whether to entitle all apps or only selected apps. */
    public fun appVisibility(appVisibility: String) {
        cdkBuilder.appVisibility(appVisibility)
    }

    /** @param attributes The attributes of the entitlement. */
    public fun attributes(vararg attributes: Any) {
        _attributes.addAll(listOf(*attributes))
    }

    /** @param attributes The attributes of the entitlement. */
    public fun attributes(attributes: Collection<Any>) {
        _attributes.addAll(attributes)
    }

    /** @param attributes The attributes of the entitlement. */
    public fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes)
    }

    /** @param description The description of the entitlement. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The name of the entitlement. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param stackName The name of the stack. */
    public fun stackName(stackName: String) {
        cdkBuilder.stackName(stackName)
    }

    public fun build(): CfnEntitlementProps {
        if (_attributes.isNotEmpty()) cdkBuilder.attributes(_attributes)
        return cdkBuilder.build()
    }
}
