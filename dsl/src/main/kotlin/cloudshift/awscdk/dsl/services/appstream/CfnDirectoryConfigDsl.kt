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

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnDirectoryConfig
import software.constructs.Construct
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDirectoryConfigDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDirectoryConfig.Builder = CfnDirectoryConfig.Builder.create(scope, id)

    private val _organizationalUnitDistinguishedNames: MutableList<String> = mutableListOf()

    public fun certificateBasedAuthProperties(certificateBasedAuthProperties: IResolvable) {
        cdkBuilder.certificateBasedAuthProperties(certificateBasedAuthProperties)
    }

    public fun certificateBasedAuthProperties(certificateBasedAuthProperties: CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty) {
        cdkBuilder.certificateBasedAuthProperties(certificateBasedAuthProperties)
    }

    public fun directoryName(directoryName: String) {
        cdkBuilder.directoryName(directoryName)
    }

    public fun organizationalUnitDistinguishedNames(
        vararg organizationalUnitDistinguishedNames: String,
    ) {
        _organizationalUnitDistinguishedNames.addAll(listOf(*organizationalUnitDistinguishedNames))
    }

    public fun organizationalUnitDistinguishedNames(organizationalUnitDistinguishedNames: Collection<String>) {
        _organizationalUnitDistinguishedNames.addAll(organizationalUnitDistinguishedNames)
    }

    public fun serviceAccountCredentials(serviceAccountCredentials: IResolvable) {
        cdkBuilder.serviceAccountCredentials(serviceAccountCredentials)
    }

    public fun serviceAccountCredentials(serviceAccountCredentials: CfnDirectoryConfig.ServiceAccountCredentialsProperty) {
        cdkBuilder.serviceAccountCredentials(serviceAccountCredentials)
    }

    public fun build(): CfnDirectoryConfig {
        if (_organizationalUnitDistinguishedNames.isNotEmpty()) {
            cdkBuilder.organizationalUnitDistinguishedNames(_organizationalUnitDistinguishedNames)
        }
        return cdkBuilder.build()
    }
}
