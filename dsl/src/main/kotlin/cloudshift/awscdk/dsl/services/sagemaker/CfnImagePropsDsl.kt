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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.sagemaker.CfnImageProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnImagePropsDsl {
    private val cdkBuilder: CfnImageProps.Builder = CfnImageProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun imageDescription(imageDescription: String) {
        cdkBuilder.imageDescription(imageDescription)
    }

    public fun imageDisplayName(imageDisplayName: String) {
        cdkBuilder.imageDisplayName(imageDisplayName)
    }

    public fun imageName(imageName: String) {
        cdkBuilder.imageName(imageName)
    }

    public fun imageRoleArn(imageRoleArn: String) {
        cdkBuilder.imageRoleArn(imageRoleArn)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnImageProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
