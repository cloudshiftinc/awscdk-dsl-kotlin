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

package cloudshift.awscdk.dsl.services.systemsmanagersap

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.systemsmanagersap.CfnApplicationProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnApplicationPropsDsl {
    private val cdkBuilder: CfnApplicationProps.Builder = CfnApplicationProps.builder()

    private val _credentials: MutableList<Any> = mutableListOf()

    private val _instances: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    public fun applicationType(applicationType: String) {
        cdkBuilder.applicationType(applicationType)
    }

    public fun credentials(vararg credentials: Any) {
        _credentials.addAll(listOf(*credentials))
    }

    public fun credentials(credentials: Collection<Any>) {
        _credentials.addAll(credentials)
    }

    public fun credentials(credentials: IResolvable) {
        cdkBuilder.credentials(credentials)
    }

    public fun instances(vararg instances: String) {
        _instances.addAll(listOf(*instances))
    }

    public fun instances(instances: Collection<String>) {
        _instances.addAll(instances)
    }

    public fun sapInstanceNumber(sapInstanceNumber: String) {
        cdkBuilder.sapInstanceNumber(sapInstanceNumber)
    }

    public fun sid(sid: String) {
        cdkBuilder.sid(sid)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnApplicationProps {
        if (_credentials.isNotEmpty()) cdkBuilder.credentials(_credentials)
        if (_instances.isNotEmpty()) cdkBuilder.instances(_instances)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
