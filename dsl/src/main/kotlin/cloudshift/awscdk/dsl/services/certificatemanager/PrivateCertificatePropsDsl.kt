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

package cloudshift.awscdk.dsl.services.certificatemanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.acmpca.ICertificateAuthority
import software.amazon.awscdk.services.certificatemanager.PrivateCertificateProps
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class PrivateCertificatePropsDsl {
    private val cdkBuilder: PrivateCertificateProps.Builder = PrivateCertificateProps.builder()

    private val _subjectAlternativeNames: MutableList<String> = mutableListOf()

    public fun certificateAuthority(certificateAuthority: ICertificateAuthority) {
        cdkBuilder.certificateAuthority(certificateAuthority)
    }

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun subjectAlternativeNames(vararg subjectAlternativeNames: String) {
        _subjectAlternativeNames.addAll(listOf(*subjectAlternativeNames))
    }

    public fun subjectAlternativeNames(subjectAlternativeNames: Collection<String>) {
        _subjectAlternativeNames.addAll(subjectAlternativeNames)
    }

    public fun build(): PrivateCertificateProps {
        if (_subjectAlternativeNames.isNotEmpty()) {
            cdkBuilder.subjectAlternativeNames(_subjectAlternativeNames)
        }
        return cdkBuilder.build()
    }
}
