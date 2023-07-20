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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appmesh.BackendDefaults
import software.amazon.awscdk.services.appmesh.TlsClientPolicy
import kotlin.Unit

@CdkDslMarker
public class BackendDefaultsDsl {
    private val cdkBuilder: BackendDefaults.Builder = BackendDefaults.builder()

    public fun tlsClientPolicy(block: TlsClientPolicyDsl.() -> Unit = {}) {
        val builder = TlsClientPolicyDsl()
        builder.apply(block)
        cdkBuilder.tlsClientPolicy(builder.build())
    }

    public fun tlsClientPolicy(tlsClientPolicy: TlsClientPolicy) {
        cdkBuilder.tlsClientPolicy(tlsClientPolicy)
    }

    public fun build(): BackendDefaults = cdkBuilder.build()
}
