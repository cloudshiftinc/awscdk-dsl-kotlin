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

package io.cloudshiftdev.awscdkdsl.services.applicationautoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.applicationautoscaling.ScalableTarget
import software.amazon.awscdk.services.applicationautoscaling.ServiceNamespace
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct

/**
 * Define a scalable target.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.lambda.*;
 * Code code;
 * Function handler = Function.Builder.create(this, "MyFunction")
 * .runtime(Runtime.PYTHON_3_7)
 * .handler("index.handler")
 * .code(code)
 * .reservedConcurrentExecutions(2)
 * .build();
 * Version fnVer = handler.getCurrentVersion();
 * ScalableTarget target = ScalableTarget.Builder.create(this, "ScalableTarget")
 * .serviceNamespace(ServiceNamespace.LAMBDA)
 * .maxCapacity(100)
 * .minCapacity(10)
 * .resourceId(String.format("function:%s:%s", handler.getFunctionName(), fnVer.getVersion()))
 * .scalableDimension("lambda:function:ProvisionedConcurrency")
 * .build();
 * target.scaleToTrackMetric("PceTracking", BasicTargetTrackingScalingPolicyProps.builder()
 * .targetValue(0.9)
 * .predefinedMetric(PredefinedMetric.LAMBDA_PROVISIONED_CONCURRENCY_UTILIZATION)
 * .build());
 * ```
 */
@CdkDslMarker
public class ScalableTargetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ScalableTarget.Builder = ScalableTarget.Builder.create(scope, id)

    /**
     * The maximum value that Application Auto Scaling can use to scale a target during a scaling
     * activity.
     *
     * @param maxCapacity The maximum value that Application Auto Scaling can use to scale a target
     *   during a scaling activity.
     */
    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * The minimum value that Application Auto Scaling can use to scale a target during a scaling
     * activity.
     *
     * @param minCapacity The minimum value that Application Auto Scaling can use to scale a target
     *   during a scaling activity.
     */
    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    /**
     * The resource identifier to associate with this scalable target.
     *
     * This string consists of the resource type and unique identifier.
     *
     * Example value:
     * `service/ecsStack-MyECSCluster-AB12CDE3F4GH/ecsStack-MyECSService-AB12CDE3F4GH`
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
     *
     * @param resourceId The resource identifier to associate with this scalable target.
     */
    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    /**
     * Role that allows Application Auto Scaling to modify your scalable target.
     *
     * Default: A role is automatically created
     *
     * @param role Role that allows Application Auto Scaling to modify your scalable target.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * The scalable dimension that's associated with the scalable target.
     *
     * Specify the service namespace, resource type, and scaling property.
     *
     * Example value: `ecs:service:DesiredCount`
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_ScalingPolicy.html)
     *
     * @param scalableDimension The scalable dimension that's associated with the scalable target.
     */
    public fun scalableDimension(scalableDimension: String) {
        cdkBuilder.scalableDimension(scalableDimension)
    }

    /**
     * The namespace of the AWS service that provides the resource or custom-resource for a resource
     * provided by your own application or service.
     *
     * For valid AWS service namespace values, see the RegisterScalableTarget action in the
     * Application Auto Scaling API Reference.
     *
     * [Documentation](https://docs.aws.amazon.com/autoscaling/application/APIReference/API_RegisterScalableTarget.html)
     *
     * @param serviceNamespace The namespace of the AWS service that provides the resource or
     *   custom-resource for a resource provided by your own application or service.
     */
    public fun serviceNamespace(serviceNamespace: ServiceNamespace) {
        cdkBuilder.serviceNamespace(serviceNamespace)
    }

    public fun build(): ScalableTarget = cdkBuilder.build()
}
