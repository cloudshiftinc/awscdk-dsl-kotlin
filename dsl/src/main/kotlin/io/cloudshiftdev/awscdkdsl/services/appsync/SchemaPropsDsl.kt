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

package io.cloudshiftdev.awscdkdsl.services.appsync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.SchemaProps

/**
 * The options for configuring a schema from an existing file.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.certificatemanager.*;
 * import software.amazon.awscdk.services.route53.*;
 * // hosted zone and route53 features
 * String hostedZoneId;
 * String zoneName = "example.com";
 * String myDomainName = "api.example.com";
 * Certificate certificate = Certificate.Builder.create(this,
 * "cert").domainName(myDomainName).build();
 * SchemaFile schema = SchemaFile.Builder.create().filePath("mySchemaFile").build();
 * GraphqlApi api = GraphqlApi.Builder.create(this, "api")
 * .name("myApi")
 * .schema(schema)
 * .domainName(DomainOptions.builder()
 * .certificate(certificate)
 * .domainName(myDomainName)
 * .build())
 * .build();
 * // hosted zone for adding appsync domain
 * IHostedZone zone = HostedZone.fromHostedZoneAttributes(this, "HostedZone",
 * HostedZoneAttributes.builder()
 * .hostedZoneId(hostedZoneId)
 * .zoneName(zoneName)
 * .build());
 * // create a cname to the appsync domain. will map to something like xxxx.cloudfront.net
 * // create a cname to the appsync domain. will map to something like xxxx.cloudfront.net
 * CnameRecord.Builder.create(this, "CnameApiRecord")
 * .recordName("api")
 * .zone(zone)
 * .domainName(api.getAppSyncDomainName())
 * .build();
 * ```
 */
@CdkDslMarker
public class SchemaPropsDsl {
    private val cdkBuilder: SchemaProps.Builder = SchemaProps.builder()

    /**
     * @param filePath The file path for the schema. When this option is configured, then the schema
     *   will be generated from an existing file from disk.
     */
    public fun filePath(filePath: String) {
        cdkBuilder.filePath(filePath)
    }

    public fun build(): SchemaProps = cdkBuilder.build()
}
