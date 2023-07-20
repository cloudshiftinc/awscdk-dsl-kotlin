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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnMLTransform
import kotlin.String

@CdkDslMarker
public class CfnMLTransformTransformEncryptionPropertyDsl {
    private val cdkBuilder: CfnMLTransform.TransformEncryptionProperty.Builder =
        CfnMLTransform.TransformEncryptionProperty.builder()

    public fun mlUserDataEncryption(mlUserDataEncryption: IResolvable) {
        cdkBuilder.mlUserDataEncryption(mlUserDataEncryption)
    }

    public fun mlUserDataEncryption(mlUserDataEncryption: CfnMLTransform.MLUserDataEncryptionProperty) {
        cdkBuilder.mlUserDataEncryption(mlUserDataEncryption)
    }

    public fun taskRunSecurityConfigurationName(taskRunSecurityConfigurationName: String) {
        cdkBuilder.taskRunSecurityConfigurationName(taskRunSecurityConfigurationName)
    }

    public fun build(): CfnMLTransform.TransformEncryptionProperty = cdkBuilder.build()
}
