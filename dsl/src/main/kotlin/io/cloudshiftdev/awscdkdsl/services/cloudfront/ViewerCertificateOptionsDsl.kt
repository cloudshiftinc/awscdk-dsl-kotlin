@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cloudfront.SSLMethod
import software.amazon.awscdk.services.cloudfront.SecurityPolicyProtocol
import software.amazon.awscdk.services.cloudfront.ViewerCertificateOptions

/**
 * Example:
 * ```
 * Bucket s3BucketSource = new Bucket(this, "Bucket");
 * CloudFrontWebDistribution distribution = CloudFrontWebDistribution.Builder.create(this,
 * "AnAmazingWebsiteProbably")
 * .originConfigs(List.of(SourceConfiguration.builder()
 * .s3OriginSource(S3OriginConfig.builder().s3BucketSource(s3BucketSource).build())
 * .behaviors(List.of(Behavior.builder().isDefaultBehavior(true).build()))
 * .build()))
 * .viewerCertificate(ViewerCertificate.fromIamCertificate("certificateId",
 * ViewerCertificateOptions.builder()
 * .aliases(List.of("example.com"))
 * .securityPolicy(SecurityPolicyProtocol.SSL_V3) // default
 * .sslMethod(SSLMethod.SNI)
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class ViewerCertificateOptionsDsl {
    private val cdkBuilder: ViewerCertificateOptions.Builder = ViewerCertificateOptions.builder()

    private val _aliases: MutableList<String> = mutableListOf()

    /**
     * @param aliases Domain names on the certificate (both main domain name and Subject Alternative
     *   names).
     */
    public fun aliases(vararg aliases: String) {
        _aliases.addAll(listOf(*aliases))
    }

    /**
     * @param aliases Domain names on the certificate (both main domain name and Subject Alternative
     *   names).
     */
    public fun aliases(aliases: Collection<String>) {
        _aliases.addAll(aliases)
    }

    /**
     * @param securityPolicy The minimum version of the SSL protocol that you want CloudFront to use
     *   for HTTPS connections. CloudFront serves your objects only to browsers or devices that
     *   support at least the SSL version that you specify.
     */
    public fun securityPolicy(securityPolicy: SecurityPolicyProtocol) {
        cdkBuilder.securityPolicy(securityPolicy)
    }

    /**
     * @param sslMethod How CloudFront should serve HTTPS requests. See the notes on SSLMethod if
     *   you wish to use other SSL termination types.
     */
    public fun sslMethod(sslMethod: SSLMethod) {
        cdkBuilder.sslMethod(sslMethod)
    }

    public fun build(): ViewerCertificateOptions {
        if (_aliases.isNotEmpty()) cdkBuilder.aliases(_aliases)
        return cdkBuilder.build()
    }
}
