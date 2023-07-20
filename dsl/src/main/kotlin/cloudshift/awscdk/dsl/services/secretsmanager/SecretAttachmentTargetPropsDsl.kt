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

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.secretsmanager.AttachmentTargetType
import software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps
import kotlin.String

@CdkDslMarker
public class SecretAttachmentTargetPropsDsl {
    private val cdkBuilder: SecretAttachmentTargetProps.Builder =
        SecretAttachmentTargetProps.builder()

    public fun targetId(targetId: String) {
        cdkBuilder.targetId(targetId)
    }

    public fun targetType(targetType: AttachmentTargetType) {
        cdkBuilder.targetType(targetType)
    }

    public fun build(): SecretAttachmentTargetProps = cdkBuilder.build()
}
