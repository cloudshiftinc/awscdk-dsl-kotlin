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

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.transfer.CfnWorkflowProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnWorkflowPropsDsl {
    private val cdkBuilder: CfnWorkflowProps.Builder = CfnWorkflowProps.builder()

    private val _onExceptionSteps: MutableList<Any> = mutableListOf()

    private val _steps: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun onExceptionSteps(vararg onExceptionSteps: Any) {
        _onExceptionSteps.addAll(listOf(*onExceptionSteps))
    }

    public fun onExceptionSteps(onExceptionSteps: Collection<Any>) {
        _onExceptionSteps.addAll(onExceptionSteps)
    }

    public fun onExceptionSteps(onExceptionSteps: IResolvable) {
        cdkBuilder.onExceptionSteps(onExceptionSteps)
    }

    public fun steps(vararg steps: Any) {
        _steps.addAll(listOf(*steps))
    }

    public fun steps(steps: Collection<Any>) {
        _steps.addAll(steps)
    }

    public fun steps(steps: IResolvable) {
        cdkBuilder.steps(steps)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnWorkflowProps {
        if (_onExceptionSteps.isNotEmpty()) cdkBuilder.onExceptionSteps(_onExceptionSteps)
        if (_steps.isNotEmpty()) cdkBuilder.steps(_steps)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
