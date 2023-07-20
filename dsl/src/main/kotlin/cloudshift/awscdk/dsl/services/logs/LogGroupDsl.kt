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

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.logs.DataProtectionPolicy
import software.amazon.awscdk.services.logs.LogGroup
import software.amazon.awscdk.services.logs.RetentionDays
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class LogGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: LogGroup.Builder = LogGroup.Builder.create(scope, id)

    public fun dataProtectionPolicy(block: DataProtectionPolicyDsl.() -> Unit = {}) {
        val builder = DataProtectionPolicyDsl()
        builder.apply(block)
        cdkBuilder.dataProtectionPolicy(builder.build())
    }

    public fun dataProtectionPolicy(dataProtectionPolicy: DataProtectionPolicy) {
        cdkBuilder.dataProtectionPolicy(dataProtectionPolicy)
    }

    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun retention(retention: RetentionDays) {
        cdkBuilder.retention(retention)
    }

    public fun build(): LogGroup = cdkBuilder.build()
}
