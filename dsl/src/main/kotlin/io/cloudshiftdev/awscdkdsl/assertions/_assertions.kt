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

package io.cloudshiftdev.awscdkdsl.assertions

import kotlin.Unit
import software.amazon.awscdk.assertions.MatchCapture
import software.amazon.awscdk.assertions.MatchFailure
import software.amazon.awscdk.assertions.TemplateParsingOptions

public object assertions {
    /**
     * Information about a value captured during match.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.assertions.*;
     * Capture capture;
     * Object value;
     * MatchCapture matchCapture = MatchCapture.builder()
     * .capture(capture)
     * .value(value)
     * .build();
     * ```
     */
    public inline fun matchCapture(block: MatchCaptureDsl.() -> Unit = {}): MatchCapture {
        val builder = MatchCaptureDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Match failure details.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.assertions.*;
     * Matcher matcher;
     * MatchFailure matchFailure = MatchFailure.builder()
     * .matcher(matcher)
     * .message("message")
     * .path(List.of("path"))
     * // the properties below are optional
     * .cost(123)
     * .build();
     * ```
     */
    public inline fun matchFailure(block: MatchFailureDsl.() -> Unit = {}): MatchFailure {
        val builder = MatchFailureDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options to configure template parsing behavior, such as disregarding circular dependencies.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.assertions.*;
     * TemplateParsingOptions templateParsingOptions = TemplateParsingOptions.builder()
     * .skipCyclicalDependenciesCheck(false)
     * .build();
     * ```
     */
    public inline fun templateParsingOptions(
        block: TemplateParsingOptionsDsl.() -> Unit = {}
    ): TemplateParsingOptions {
        val builder = TemplateParsingOptionsDsl()
        builder.apply(block)
        return builder.build()
    }
}
