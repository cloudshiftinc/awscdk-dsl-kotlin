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

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnReplicationConfigurationReplicationConfigurationPropertyDsl {
    private val cdkBuilder: CfnReplicationConfiguration.ReplicationConfigurationProperty.Builder =
        CfnReplicationConfiguration.ReplicationConfigurationProperty.builder()

    private val _rules: MutableList<Any> = mutableListOf()

    public fun rules(vararg rules: Any) {
        _rules.addAll(listOf(*rules))
    }

    public fun rules(rules: Collection<Any>) {
        _rules.addAll(rules)
    }

    public fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules)
    }

    public fun build(): CfnReplicationConfiguration.ReplicationConfigurationProperty {
        if (_rules.isNotEmpty()) cdkBuilder.rules(_rules)
        return cdkBuilder.build()
    }
}
