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

package io.cloudshiftdev.awscdkdsl.services.logs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.logs.CfnLogAnomalyDetectorProps

/**
 * Properties for defining a `CfnLogAnomalyDetector`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * CfnLogAnomalyDetectorProps cfnLogAnomalyDetectorProps = CfnLogAnomalyDetectorProps.builder()
 * .accountId("accountId")
 * .anomalyVisibilityTime(123)
 * .detectorName("detectorName")
 * .evaluationFrequency("evaluationFrequency")
 * .filterPattern("filterPattern")
 * .kmsKeyId("kmsKeyId")
 * .logGroupArnList(List.of("logGroupArnList"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-loganomalydetector.html)
 */
@CdkDslMarker
public class CfnLogAnomalyDetectorPropsDsl {
    private val cdkBuilder: CfnLogAnomalyDetectorProps.Builder =
        CfnLogAnomalyDetectorProps.builder()

    private val _logGroupArnList: MutableList<String> = mutableListOf()

    /** @param accountId The ID of the account to create the anomaly detector in. */
    public fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
    }

    /**
     * @param anomalyVisibilityTime The number of days to have visibility on an anomaly. After this
     *   time period has elapsed for an anomaly, it will be automatically baselined and the anomaly
     *   detector will treat new occurrences of a similar anomaly as normal. Therefore, if you do
     *   not correct the cause of an anomaly during the time period specified in
     *   `AnomalyVisibilityTime` , it will be considered normal going forward and will not be
     *   detected as an anomaly.
     */
    public fun anomalyVisibilityTime(anomalyVisibilityTime: Number) {
        cdkBuilder.anomalyVisibilityTime(anomalyVisibilityTime)
    }

    /** @param detectorName A name for this anomaly detector. */
    public fun detectorName(detectorName: String) {
        cdkBuilder.detectorName(detectorName)
    }

    /**
     * @param evaluationFrequency Specifies how often the anomaly detector is to run and look for
     *   anomalies. Set this value according to the frequency that the log group receives new logs.
     *   For example, if the log group receives new log events every 10 minutes, then 15 minutes
     *   might be a good setting for `EvaluationFrequency` .
     */
    public fun evaluationFrequency(evaluationFrequency: String) {
        cdkBuilder.evaluationFrequency(evaluationFrequency)
    }

    /**
     * @param filterPattern You can use this parameter to limit the anomaly detection model to
     *   examine only log events that match the pattern you specify here. For more information, see
     *   [Filter and Pattern Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html)
     *   .
     */
    public fun filterPattern(filterPattern: String) {
        cdkBuilder.filterPattern(filterPattern)
    }

    /**
     * @param kmsKeyId Optionally assigns a AWS KMS key to secure this anomaly detector and its
     *   findings. If a key is assigned, the anomalies found and the model used by this detector are
     *   encrypted at rest with the key. If a key is assigned to an anomaly detector, a user must
     *   have permissions for both this key and for the anomaly detector to retrieve information
     *   about the anomalies that it finds.
     *
     * For more information about using a AWS KMS key and to see the required IAM policy, see
     * [Use a AWS KMS key with an anomaly detector](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/LogsAnomalyDetection-KMS.html)
     * .
     */
    public fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param logGroupArnList The ARN of the log group that is associated with this anomaly
     *   detector. You can specify only one log group ARN.
     */
    public fun logGroupArnList(vararg logGroupArnList: String) {
        _logGroupArnList.addAll(listOf(*logGroupArnList))
    }

    /**
     * @param logGroupArnList The ARN of the log group that is associated with this anomaly
     *   detector. You can specify only one log group ARN.
     */
    public fun logGroupArnList(logGroupArnList: Collection<String>) {
        _logGroupArnList.addAll(logGroupArnList)
    }

    public fun build(): CfnLogAnomalyDetectorProps {
        if (_logGroupArnList.isNotEmpty()) cdkBuilder.logGroupArnList(_logGroupArnList)
        return cdkBuilder.build()
    }
}
