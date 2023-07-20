@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.identitystore

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.identitystore.CfnGroupMembership
import software.amazon.awscdk.services.identitystore.CfnGroupMembershipProps
import kotlin.String

@CdkDslMarker
public class CfnGroupMembershipPropsDsl {
    private val cdkBuilder: CfnGroupMembershipProps.Builder = CfnGroupMembershipProps.builder()

    public fun groupId(groupId: String) {
        cdkBuilder.groupId(groupId)
    }

    public fun identityStoreId(identityStoreId: String) {
        cdkBuilder.identityStoreId(identityStoreId)
    }

    public fun memberId(memberId: IResolvable) {
        cdkBuilder.memberId(memberId)
    }

    public fun memberId(memberId: CfnGroupMembership.MemberIdProperty) {
        cdkBuilder.memberId(memberId)
    }

    public fun build(): CfnGroupMembershipProps = cdkBuilder.build()
}
