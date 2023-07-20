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

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnQuickConnect
import software.amazon.awscdk.services.connect.CfnQuickConnectProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnQuickConnectPropsDsl {
    private val cdkBuilder: CfnQuickConnectProps.Builder = CfnQuickConnectProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun quickConnectConfig(quickConnectConfig: IResolvable) {
        cdkBuilder.quickConnectConfig(quickConnectConfig)
    }

    public fun quickConnectConfig(quickConnectConfig: CfnQuickConnect.QuickConnectConfigProperty) {
        cdkBuilder.quickConnectConfig(quickConnectConfig)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnQuickConnectProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
