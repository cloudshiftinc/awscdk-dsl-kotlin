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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.eks.ICluster
import software.amazon.awscdk.services.eks.KubectlProvider
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class KubectlProviderDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: KubectlProvider.Builder = KubectlProvider.Builder.create(scope, id)

    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    public fun build(): KubectlProvider = cdkBuilder.build()
}
