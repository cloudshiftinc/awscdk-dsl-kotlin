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

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnAlarmModel
import kotlin.String

@CdkDslMarker
public class CfnAlarmModelDynamoDBPropertyDsl {
    private val cdkBuilder: CfnAlarmModel.DynamoDBProperty.Builder =
        CfnAlarmModel.DynamoDBProperty.builder()

    public fun hashKeyField(hashKeyField: String) {
        cdkBuilder.hashKeyField(hashKeyField)
    }

    public fun hashKeyType(hashKeyType: String) {
        cdkBuilder.hashKeyType(hashKeyType)
    }

    public fun hashKeyValue(hashKeyValue: String) {
        cdkBuilder.hashKeyValue(hashKeyValue)
    }

    public fun operation(operation: String) {
        cdkBuilder.operation(operation)
    }

    public fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload)
    }

    public fun payload(payload: CfnAlarmModel.PayloadProperty) {
        cdkBuilder.payload(payload)
    }

    public fun payloadField(payloadField: String) {
        cdkBuilder.payloadField(payloadField)
    }

    public fun rangeKeyField(rangeKeyField: String) {
        cdkBuilder.rangeKeyField(rangeKeyField)
    }

    public fun rangeKeyType(rangeKeyType: String) {
        cdkBuilder.rangeKeyType(rangeKeyType)
    }

    public fun rangeKeyValue(rangeKeyValue: String) {
        cdkBuilder.rangeKeyValue(rangeKeyValue)
    }

    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    public fun build(): CfnAlarmModel.DynamoDBProperty = cdkBuilder.build()
}
