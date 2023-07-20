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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication
import kotlin.String

@CdkDslMarker
public class CfnApplicationApplicationCodeConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.ApplicationCodeConfigurationProperty.Builder =
        CfnApplication.ApplicationCodeConfigurationProperty.builder()

    public fun codeContent(codeContent: IResolvable) {
        cdkBuilder.codeContent(codeContent)
    }

    public fun codeContent(codeContent: CfnApplication.CodeContentProperty) {
        cdkBuilder.codeContent(codeContent)
    }

    public fun codeContentType(codeContentType: String) {
        cdkBuilder.codeContentType(codeContentType)
    }

    public fun build(): CfnApplication.ApplicationCodeConfigurationProperty = cdkBuilder.build()
}
