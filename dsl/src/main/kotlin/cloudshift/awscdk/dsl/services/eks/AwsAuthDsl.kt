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
import software.amazon.awscdk.services.eks.AwsAuth
import software.amazon.awscdk.services.eks.Cluster
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class AwsAuthDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: AwsAuth.Builder = AwsAuth.Builder.create(scope, id)

    public fun cluster(cluster: Cluster) {
        cdkBuilder.cluster(cluster)
    }

    public fun build(): AwsAuth = cdkBuilder.build()
}
