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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnKeyPair
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnKeyPairDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnKeyPair.Builder = CfnKeyPair.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun keyFormat(keyFormat: String) {
        cdkBuilder.keyFormat(keyFormat)
    }

    public fun keyName(keyName: String) {
        cdkBuilder.keyName(keyName)
    }

    public fun keyType(keyType: String) {
        cdkBuilder.keyType(keyType)
    }

    public fun publicKeyMaterial(publicKeyMaterial: String) {
        cdkBuilder.publicKeyMaterial(publicKeyMaterial)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnKeyPair {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
