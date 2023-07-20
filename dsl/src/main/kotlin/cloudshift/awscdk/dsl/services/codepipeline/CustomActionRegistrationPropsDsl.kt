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

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codepipeline.ActionArtifactBounds
import software.amazon.awscdk.services.codepipeline.ActionCategory
import software.amazon.awscdk.services.codepipeline.CustomActionProperty
import software.amazon.awscdk.services.codepipeline.CustomActionRegistrationProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CustomActionRegistrationPropsDsl {
    private val cdkBuilder: CustomActionRegistrationProps.Builder =
        CustomActionRegistrationProps.builder()

    private val _actionProperties: MutableList<CustomActionProperty> = mutableListOf()

    public fun actionProperties(actionProperties: CustomActionPropertyDsl.() -> Unit) {
        _actionProperties.add(CustomActionPropertyDsl().apply(actionProperties).build())
    }

    public fun actionProperties(actionProperties: Collection<CustomActionProperty>) {
        _actionProperties.addAll(actionProperties)
    }

    public fun artifactBounds(block: ActionArtifactBoundsDsl.() -> Unit = {}) {
        val builder = ActionArtifactBoundsDsl()
        builder.apply(block)
        cdkBuilder.artifactBounds(builder.build())
    }

    public fun artifactBounds(artifactBounds: ActionArtifactBounds) {
        cdkBuilder.artifactBounds(artifactBounds)
    }

    public fun category(category: ActionCategory) {
        cdkBuilder.category(category)
    }

    public fun entityUrl(entityUrl: String) {
        cdkBuilder.entityUrl(entityUrl)
    }

    public fun executionUrl(executionUrl: String) {
        cdkBuilder.executionUrl(executionUrl)
    }

    public fun provider(provider: String) {
        cdkBuilder.provider(provider)
    }

    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CustomActionRegistrationProps {
        if (_actionProperties.isNotEmpty()) cdkBuilder.actionProperties(_actionProperties)
        return cdkBuilder.build()
    }
}
