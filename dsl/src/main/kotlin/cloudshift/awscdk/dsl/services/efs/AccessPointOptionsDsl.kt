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

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.efs.AccessPointOptions
import software.amazon.awscdk.services.efs.Acl
import software.amazon.awscdk.services.efs.PosixUser
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class AccessPointOptionsDsl {
    private val cdkBuilder: AccessPointOptions.Builder = AccessPointOptions.builder()

    public fun createAcl(block: AclDsl.() -> Unit = {}) {
        val builder = AclDsl()
        builder.apply(block)
        cdkBuilder.createAcl(builder.build())
    }

    public fun createAcl(createAcl: Acl) {
        cdkBuilder.createAcl(createAcl)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun posixUser(block: PosixUserDsl.() -> Unit = {}) {
        val builder = PosixUserDsl()
        builder.apply(block)
        cdkBuilder.posixUser(builder.build())
    }

    public fun posixUser(posixUser: PosixUser) {
        cdkBuilder.posixUser(posixUser)
    }

    public fun build(): AccessPointOptions = cdkBuilder.build()
}
