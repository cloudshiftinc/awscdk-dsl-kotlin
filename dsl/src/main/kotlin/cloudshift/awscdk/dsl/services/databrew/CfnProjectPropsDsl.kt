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

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnProject
import software.amazon.awscdk.services.databrew.CfnProjectProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnProjectPropsDsl {
    private val cdkBuilder: CfnProjectProps.Builder = CfnProjectProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun datasetName(datasetName: String) {
        cdkBuilder.datasetName(datasetName)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun recipeName(recipeName: String) {
        cdkBuilder.recipeName(recipeName)
    }

    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    public fun sample(sample: IResolvable) {
        cdkBuilder.sample(sample)
    }

    public fun sample(sample: CfnProject.SampleProperty) {
        cdkBuilder.sample(sample)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnProjectProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
