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

package io.cloudshiftdev.awscdkdsl.services.identitystore

import kotlin.Unit
import software.amazon.awscdk.services.identitystore.CfnGroupMembership

/** An object containing the identifier of a group member. */
public inline fun CfnGroupMembership.setMemberId(
    block: CfnGroupMembershipMemberIdPropertyDsl.() -> Unit = {}
) {
    val builder = CfnGroupMembershipMemberIdPropertyDsl()
    builder.apply(block)
    return setMemberId(builder.build())
}
