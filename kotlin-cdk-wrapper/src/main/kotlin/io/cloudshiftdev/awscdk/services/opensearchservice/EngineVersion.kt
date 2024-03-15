@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class EngineVersion internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.opensearchservice.EngineVersion,
) : CdkObject(cdkObject) {
  public open fun version(): String = unwrap(this).getVersion()

  public companion object {
    public val ELASTICSEARCH_1_5: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.ELASTICSEARCH_1_5)

    public val ELASTICSEARCH_2_3: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.ELASTICSEARCH_2_3)

    public val ELASTICSEARCH_5_1: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.ELASTICSEARCH_5_1)

    public val ELASTICSEARCH_5_3: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.ELASTICSEARCH_5_3)

    public val ELASTICSEARCH_5_5: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.ELASTICSEARCH_5_5)

    public val ELASTICSEARCH_5_6: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.ELASTICSEARCH_5_6)

    public val ELASTICSEARCH_6_0: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.ELASTICSEARCH_6_0)

    public val ELASTICSEARCH_6_2: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.ELASTICSEARCH_6_2)

    public val ELASTICSEARCH_6_3: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.ELASTICSEARCH_6_3)

    public val ELASTICSEARCH_6_4: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.ELASTICSEARCH_6_4)

    public val ELASTICSEARCH_6_5: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.ELASTICSEARCH_6_5)

    public val ELASTICSEARCH_6_7: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.ELASTICSEARCH_6_7)

    public val ELASTICSEARCH_6_8: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.ELASTICSEARCH_6_8)

    public val ELASTICSEARCH_7_1: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.ELASTICSEARCH_7_1)

    public val ELASTICSEARCH_7_10: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.ELASTICSEARCH_7_10)

    public val ELASTICSEARCH_7_4: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.ELASTICSEARCH_7_4)

    public val ELASTICSEARCH_7_7: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.ELASTICSEARCH_7_7)

    public val ELASTICSEARCH_7_8: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.ELASTICSEARCH_7_8)

    public val ELASTICSEARCH_7_9: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.ELASTICSEARCH_7_9)

    public val OPENSEARCH_1_0: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.OPENSEARCH_1_0)

    public val OPENSEARCH_1_1: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.OPENSEARCH_1_1)

    public val OPENSEARCH_1_2: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.OPENSEARCH_1_2)

    public val OPENSEARCH_1_3: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.OPENSEARCH_1_3)

    public val OPENSEARCH_2_10: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.OPENSEARCH_2_10)

    public val OPENSEARCH_2_11: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.OPENSEARCH_2_11)

    public val OPENSEARCH_2_3: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.OPENSEARCH_2_3)

    public val OPENSEARCH_2_5: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.OPENSEARCH_2_5)

    public val OPENSEARCH_2_7: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.OPENSEARCH_2_7)

    public val OPENSEARCH_2_9: EngineVersion =
        EngineVersion.wrap(software.amazon.awscdk.services.opensearchservice.EngineVersion.OPENSEARCH_2_9)

    public fun elasticsearch(version: String): EngineVersion =
        software.amazon.awscdk.services.opensearchservice.EngineVersion.elasticsearch(version).let(EngineVersion::wrap)

    public fun openSearch(version: String): EngineVersion =
        software.amazon.awscdk.services.opensearchservice.EngineVersion.openSearch(version).let(EngineVersion::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.EngineVersion):
        EngineVersion = EngineVersion(cdkObject)

    internal fun unwrap(wrapped: EngineVersion):
        software.amazon.awscdk.services.opensearchservice.EngineVersion = wrapped.cdkObject
  }
}
