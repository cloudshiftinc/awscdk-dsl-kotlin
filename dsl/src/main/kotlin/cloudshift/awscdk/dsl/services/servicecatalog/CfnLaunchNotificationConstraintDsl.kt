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

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.servicecatalog.CfnLaunchNotificationConstraint
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLaunchNotificationConstraintDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLaunchNotificationConstraint.Builder =
        CfnLaunchNotificationConstraint.Builder.create(scope, id)

    private val _notificationArns: MutableList<String> = mutableListOf()

    public fun acceptLanguage(acceptLanguage: String) {
        cdkBuilder.acceptLanguage(acceptLanguage)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun notificationArns(vararg notificationArns: String) {
        _notificationArns.addAll(listOf(*notificationArns))
    }

    public fun notificationArns(notificationArns: Collection<String>) {
        _notificationArns.addAll(notificationArns)
    }

    public fun portfolioId(portfolioId: String) {
        cdkBuilder.portfolioId(portfolioId)
    }

    public fun productId(productId: String) {
        cdkBuilder.productId(productId)
    }

    public fun build(): CfnLaunchNotificationConstraint {
        if (_notificationArns.isNotEmpty()) cdkBuilder.notificationArns(_notificationArns)
        return cdkBuilder.build()
    }
}
