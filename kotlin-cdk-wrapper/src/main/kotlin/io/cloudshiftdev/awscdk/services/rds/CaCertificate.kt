@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * The CA certificate used for a DB instance.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseInstance.Builder.create(this, "Instance")
 * .engine(DatabaseInstanceEngine.mysql(MySqlInstanceEngineProps.builder().version(MysqlEngineVersion.VER_8_0_30).build()))
 * .vpc(vpc)
 * .caCertificate(CaCertificate.of("future-rds-ca"))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.SSL.html)
 */
public open class CaCertificate(
  cdkObject: software.amazon.awscdk.services.rds.CaCertificate,
) : CdkObject(cdkObject) {
  public companion object {
    public val RDS_CA_2019: CaCertificate =
        CaCertificate.wrap(software.amazon.awscdk.services.rds.CaCertificate.RDS_CA_2019)

    public val RDS_CA_ECC384_G1: CaCertificate =
        CaCertificate.wrap(software.amazon.awscdk.services.rds.CaCertificate.RDS_CA_ECC384_G1)

    public val RDS_CA_RDS2048_G1: CaCertificate =
        CaCertificate.wrap(software.amazon.awscdk.services.rds.CaCertificate.RDS_CA_RDS2048_G1)

    public val RDS_CA_RDS4096_G1: CaCertificate =
        CaCertificate.wrap(software.amazon.awscdk.services.rds.CaCertificate.RDS_CA_RDS4096_G1)

    public fun of(identifier: String): CaCertificate =
        software.amazon.awscdk.services.rds.CaCertificate.of(identifier).let(CaCertificate::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CaCertificate): CaCertificate =
        CaCertificate(cdkObject)

    internal fun unwrap(wrapped: CaCertificate): software.amazon.awscdk.services.rds.CaCertificate =
        wrapped.cdkObject as software.amazon.awscdk.services.rds.CaCertificate
  }
}
