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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.InitServiceRestartHandle
import software.amazon.awscdk.services.ec2.NamedPackageOptions
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class NamedPackageOptionsDsl {
    private val cdkBuilder: NamedPackageOptions.Builder = NamedPackageOptions.builder()

    private val _serviceRestartHandles: MutableList<InitServiceRestartHandle> = mutableListOf()

    private val _version: MutableList<String> = mutableListOf()

    public fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle) {
        _serviceRestartHandles.addAll(listOf(*serviceRestartHandles))
    }

    public fun serviceRestartHandles(serviceRestartHandles: Collection<InitServiceRestartHandle>) {
        _serviceRestartHandles.addAll(serviceRestartHandles)
    }

    public fun version(vararg version: String) {
        _version.addAll(listOf(*version))
    }

    public fun version(version: Collection<String>) {
        _version.addAll(version)
    }

    public fun build(): NamedPackageOptions {
        if (_serviceRestartHandles.isNotEmpty()) cdkBuilder.serviceRestartHandles(_serviceRestartHandles)
        if (_version.isNotEmpty()) cdkBuilder.version(_version)
        return cdkBuilder.build()
    }
}
