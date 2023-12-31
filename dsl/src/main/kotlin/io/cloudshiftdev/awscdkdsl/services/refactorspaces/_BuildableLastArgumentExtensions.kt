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

package io.cloudshiftdev.awscdkdsl.services.refactorspaces

import kotlin.Unit
import software.amazon.awscdk.services.refactorspaces.CfnApplication
import software.amazon.awscdk.services.refactorspaces.CfnRoute
import software.amazon.awscdk.services.refactorspaces.CfnService

/** The endpoint URL of the Amazon API Gateway proxy. */
public inline fun CfnApplication.setApiGatewayProxy(
    block: CfnApplicationApiGatewayProxyInputPropertyDsl.() -> Unit = {}
) {
    val builder = CfnApplicationApiGatewayProxyInputPropertyDsl()
    builder.apply(block)
    return setApiGatewayProxy(builder.build())
}

/** Configuration for the default route type. */
public inline fun CfnRoute.setDefaultRoute(
    block: CfnRouteDefaultRouteInputPropertyDsl.() -> Unit = {}
) {
    val builder = CfnRouteDefaultRouteInputPropertyDsl()
    builder.apply(block)
    return setDefaultRoute(builder.build())
}

/** The configuration for the URI path route type. */
public inline fun CfnRoute.setUriPathRoute(
    block: CfnRouteUriPathRouteInputPropertyDsl.() -> Unit = {}
) {
    val builder = CfnRouteUriPathRouteInputPropertyDsl()
    builder.apply(block)
    return setUriPathRoute(builder.build())
}

/** A summary of the configuration for the AWS Lambda endpoint type. */
public inline fun CfnService.setLambdaEndpoint(
    block: CfnServiceLambdaEndpointInputPropertyDsl.() -> Unit = {}
) {
    val builder = CfnServiceLambdaEndpointInputPropertyDsl()
    builder.apply(block)
    return setLambdaEndpoint(builder.build())
}

/** The summary of the configuration for the URL endpoint type. */
public inline fun CfnService.setUrlEndpoint(
    block: CfnServiceUrlEndpointInputPropertyDsl.() -> Unit = {}
) {
    val builder = CfnServiceUrlEndpointInputPropertyDsl()
    builder.apply(block)
    return setUrlEndpoint(builder.build())
}
