@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnStateMachine

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * Object pattern;
 * CloudWatchEventEventProperty cloudWatchEventEventProperty =
 * CloudWatchEventEventProperty.builder()
 * .pattern(pattern)
 * // the properties below are optional
 * .eventBusName("eventBusName")
 * .input("input")
 * .inputPath("inputPath")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-statemachine-cloudwatcheventevent.html)
 */
@CdkDslMarker
public class CfnStateMachineCloudWatchEventEventPropertyDsl {
    private val cdkBuilder: CfnStateMachine.CloudWatchEventEventProperty.Builder =
        CfnStateMachine.CloudWatchEventEventProperty.builder()

    /** @param eventBusName the value to be set. */
    public fun eventBusName(eventBusName: String) {
        cdkBuilder.eventBusName(eventBusName)
    }

    /** @param input the value to be set. */
    public fun input(input: String) {
        cdkBuilder.input(input)
    }

    /** @param inputPath the value to be set. */
    public fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
    }

    /** @param pattern the value to be set. */
    public fun pattern(pattern: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(pattern)
        cdkBuilder.pattern(builder.map)
    }

    /** @param pattern the value to be set. */
    public fun pattern(pattern: Any) {
        cdkBuilder.pattern(pattern)
    }

    public fun build(): CfnStateMachine.CloudWatchEventEventProperty = cdkBuilder.build()
}
