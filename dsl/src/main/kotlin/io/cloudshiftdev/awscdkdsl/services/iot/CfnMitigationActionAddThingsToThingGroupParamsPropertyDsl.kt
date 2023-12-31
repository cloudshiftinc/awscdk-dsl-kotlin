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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnMitigationAction

/**
 * Parameters used when defining a mitigation action that move a set of things to a thing group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * AddThingsToThingGroupParamsProperty addThingsToThingGroupParamsProperty =
 * AddThingsToThingGroupParamsProperty.builder()
 * .thingGroupNames(List.of("thingGroupNames"))
 * // the properties below are optional
 * .overrideDynamicGroups(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-mitigationaction-addthingstothinggroupparams.html)
 */
@CdkDslMarker
public class CfnMitigationActionAddThingsToThingGroupParamsPropertyDsl {
    private val cdkBuilder: CfnMitigationAction.AddThingsToThingGroupParamsProperty.Builder =
        CfnMitigationAction.AddThingsToThingGroupParamsProperty.builder()

    private val _thingGroupNames: MutableList<String> = mutableListOf()

    /**
     * @param overrideDynamicGroups Specifies if this mitigation action can move the things that
     *   triggered the mitigation action even if they are part of one or more dynamic thing groups.
     */
    public fun overrideDynamicGroups(overrideDynamicGroups: Boolean) {
        cdkBuilder.overrideDynamicGroups(overrideDynamicGroups)
    }

    /**
     * @param overrideDynamicGroups Specifies if this mitigation action can move the things that
     *   triggered the mitigation action even if they are part of one or more dynamic thing groups.
     */
    public fun overrideDynamicGroups(overrideDynamicGroups: IResolvable) {
        cdkBuilder.overrideDynamicGroups(overrideDynamicGroups)
    }

    /**
     * @param thingGroupNames The list of groups to which you want to add the things that triggered
     *   the mitigation action. You can add a thing to a maximum of 10 groups, but you can't add a
     *   thing to more than one group in the same hierarchy.
     */
    public fun thingGroupNames(vararg thingGroupNames: String) {
        _thingGroupNames.addAll(listOf(*thingGroupNames))
    }

    /**
     * @param thingGroupNames The list of groups to which you want to add the things that triggered
     *   the mitigation action. You can add a thing to a maximum of 10 groups, but you can't add a
     *   thing to more than one group in the same hierarchy.
     */
    public fun thingGroupNames(thingGroupNames: Collection<String>) {
        _thingGroupNames.addAll(thingGroupNames)
    }

    public fun build(): CfnMitigationAction.AddThingsToThingGroupParamsProperty {
        if (_thingGroupNames.isNotEmpty()) cdkBuilder.thingGroupNames(_thingGroupNames)
        return cdkBuilder.build()
    }
}
