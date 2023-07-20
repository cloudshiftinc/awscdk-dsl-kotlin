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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAppImageConfigKernelGatewayImageConfigPropertyDsl {
    private val cdkBuilder: CfnAppImageConfig.KernelGatewayImageConfigProperty.Builder =
        CfnAppImageConfig.KernelGatewayImageConfigProperty.builder()

    private val _kernelSpecs: MutableList<Any> = mutableListOf()

    public fun fileSystemConfig(fileSystemConfig: IResolvable) {
        cdkBuilder.fileSystemConfig(fileSystemConfig)
    }

    public fun fileSystemConfig(fileSystemConfig: CfnAppImageConfig.FileSystemConfigProperty) {
        cdkBuilder.fileSystemConfig(fileSystemConfig)
    }

    public fun kernelSpecs(vararg kernelSpecs: Any) {
        _kernelSpecs.addAll(listOf(*kernelSpecs))
    }

    public fun kernelSpecs(kernelSpecs: Collection<Any>) {
        _kernelSpecs.addAll(kernelSpecs)
    }

    public fun kernelSpecs(kernelSpecs: IResolvable) {
        cdkBuilder.kernelSpecs(kernelSpecs)
    }

    public fun build(): CfnAppImageConfig.KernelGatewayImageConfigProperty {
        if (_kernelSpecs.isNotEmpty()) cdkBuilder.kernelSpecs(_kernelSpecs)
        return cdkBuilder.build()
    }
}
