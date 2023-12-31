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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnJobTemplate

/**
 * The configuration that determines how many retries are allowed for each failure type for a job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * JobExecutionsRetryConfigProperty jobExecutionsRetryConfigProperty =
 * JobExecutionsRetryConfigProperty.builder()
 * .retryCriteriaList(List.of(RetryCriteriaProperty.builder()
 * .failureType("failureType")
 * .numberOfRetries(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-jobtemplate-jobexecutionsretryconfig.html)
 */
@CdkDslMarker
public class CfnJobTemplateJobExecutionsRetryConfigPropertyDsl {
    private val cdkBuilder: CfnJobTemplate.JobExecutionsRetryConfigProperty.Builder =
        CfnJobTemplate.JobExecutionsRetryConfigProperty.builder()

    private val _retryCriteriaList: MutableList<Any> = mutableListOf()

    /**
     * @param retryCriteriaList The list of criteria that determines how many retries are allowed
     *   for each failure type for a job.
     */
    public fun retryCriteriaList(vararg retryCriteriaList: Any) {
        _retryCriteriaList.addAll(listOf(*retryCriteriaList))
    }

    /**
     * @param retryCriteriaList The list of criteria that determines how many retries are allowed
     *   for each failure type for a job.
     */
    public fun retryCriteriaList(retryCriteriaList: Collection<Any>) {
        _retryCriteriaList.addAll(retryCriteriaList)
    }

    /**
     * @param retryCriteriaList The list of criteria that determines how many retries are allowed
     *   for each failure type for a job.
     */
    public fun retryCriteriaList(retryCriteriaList: IResolvable) {
        cdkBuilder.retryCriteriaList(retryCriteriaList)
    }

    public fun build(): CfnJobTemplate.JobExecutionsRetryConfigProperty {
        if (_retryCriteriaList.isNotEmpty()) cdkBuilder.retryCriteriaList(_retryCriteriaList)
        return cdkBuilder.build()
    }
}
