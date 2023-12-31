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

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps

/**
 * Properties for controlling items output in JSON standard format.
 *
 * Example:
 * ```
 * // production stage
 * LogGroup prdLogGroup = new LogGroup(this, "PrdLogs");
 * RestApi api = RestApi.Builder.create(this, "books")
 * .deployOptions(StageOptions.builder()
 * .accessLogDestination(new LogGroupLogDestination(prdLogGroup))
 * .accessLogFormat(AccessLogFormat.jsonWithStandardFields())
 * .build())
 * .build();
 * Deployment deployment = Deployment.Builder.create(this, "Deployment").api(api).build();
 * // development stage
 * LogGroup devLogGroup = new LogGroup(this, "DevLogs");
 * Stage.Builder.create(this, "dev")
 * .deployment(deployment)
 * .accessLogDestination(new LogGroupLogDestination(devLogGroup))
 * .accessLogFormat(AccessLogFormat.jsonWithStandardFields(JsonWithStandardFieldProps.builder()
 * .caller(false)
 * .httpMethod(true)
 * .ip(true)
 * .protocol(true)
 * .requestTime(true)
 * .resourcePath(true)
 * .responseLength(true)
 * .status(true)
 * .user(true)
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class JsonWithStandardFieldPropsDsl {
    private val cdkBuilder: JsonWithStandardFieldProps.Builder =
        JsonWithStandardFieldProps.builder()

    /**
     * @param caller If this flag is enabled, the principal identifier of the caller will be output
     *   to the log.
     */
    public fun caller(caller: Boolean) {
        cdkBuilder.caller(caller)
    }

    /** @param httpMethod If this flag is enabled, the http method will be output to the log. */
    public fun httpMethod(httpMethod: Boolean) {
        cdkBuilder.httpMethod(httpMethod)
    }

    /** @param ip If this flag is enabled, the source IP of request will be output to the log. */
    public fun ip(ip: Boolean) {
        cdkBuilder.ip(ip)
    }

    /** @param protocol If this flag is enabled, the request protocol will be output to the log. */
    public fun protocol(protocol: Boolean) {
        cdkBuilder.protocol(protocol)
    }

    /**
     * @param requestTime If this flag is enabled, the CLF-formatted request
     *   time((dd/MMM/yyyy:HH:mm:ss +-hhmm) will be output to the log.
     */
    public fun requestTime(requestTime: Boolean) {
        cdkBuilder.requestTime(requestTime)
    }

    /**
     * @param resourcePath If this flag is enabled, the path to your resource will be output to the
     *   log.
     */
    public fun resourcePath(resourcePath: Boolean) {
        cdkBuilder.resourcePath(resourcePath)
    }

    /**
     * @param responseLength If this flag is enabled, the response payload length will be output to
     *   the log.
     */
    public fun responseLength(responseLength: Boolean) {
        cdkBuilder.responseLength(responseLength)
    }

    /**
     * @param status If this flag is enabled, the method response status will be output to the log.
     */
    public fun status(status: Boolean) {
        cdkBuilder.status(status)
    }

    /**
     * @param user If this flag is enabled, the principal identifier of the user will be output to
     *   the log.
     */
    public fun user(user: Boolean) {
        cdkBuilder.user(user)
    }

    public fun build(): JsonWithStandardFieldProps = cdkBuilder.build()
}
