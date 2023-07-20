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

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cloudwatch.ComparisonOperator
import software.amazon.awscdk.services.cloudwatch.CreateAlarmOptions
import software.amazon.awscdk.services.cloudwatch.TreatMissingData
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CreateAlarmOptionsDsl {
    private val cdkBuilder: CreateAlarmOptions.Builder = CreateAlarmOptions.builder()

    public fun actionsEnabled(actionsEnabled: Boolean) {
        cdkBuilder.actionsEnabled(actionsEnabled)
    }

    public fun alarmDescription(alarmDescription: String) {
        cdkBuilder.alarmDescription(alarmDescription)
    }

    public fun alarmName(alarmName: String) {
        cdkBuilder.alarmName(alarmName)
    }

    public fun comparisonOperator(comparisonOperator: ComparisonOperator) {
        cdkBuilder.comparisonOperator(comparisonOperator)
    }

    public fun datapointsToAlarm(datapointsToAlarm: Number) {
        cdkBuilder.datapointsToAlarm(datapointsToAlarm)
    }

    public fun evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile: String) {
        cdkBuilder.evaluateLowSampleCountPercentile(evaluateLowSampleCountPercentile)
    }

    public fun evaluationPeriods(evaluationPeriods: Number) {
        cdkBuilder.evaluationPeriods(evaluationPeriods)
    }

    public fun threshold(threshold: Number) {
        cdkBuilder.threshold(threshold)
    }

    public fun treatMissingData(treatMissingData: TreatMissingData) {
        cdkBuilder.treatMissingData(treatMissingData)
    }

    public fun build(): CreateAlarmOptions = cdkBuilder.build()
}
