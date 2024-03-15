@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.assets.Asset
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface HelmChartProps : HelmChartOptions {
  public fun cluster(): ICluster

  @CdkDslMarker
  public interface Builder {
    public fun chart(chart: String)

    public fun chartAsset(chartAsset: Asset)

    public fun cluster(cluster: ICluster)

    public fun createNamespace(createNamespace: Boolean)

    public fun namespace(namespace: String)

    public fun release(release: String)

    public fun repository(repository: String)

    public fun skipCrds(skipCrds: Boolean)

    public fun timeout(timeout: Duration)

    public fun values(values: Map<String, Any>)

    public fun version(version: String)

    public fun wait(wait: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.HelmChartProps.Builder =
        software.amazon.awscdk.services.eks.HelmChartProps.builder()

    override fun chart(chart: String) {
      cdkBuilder.chart(chart)
    }

    override fun chartAsset(chartAsset: Asset) {
      cdkBuilder.chartAsset(chartAsset.let(Asset::unwrap))
    }

    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    override fun createNamespace(createNamespace: Boolean) {
      cdkBuilder.createNamespace(createNamespace)
    }

    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    override fun release(release: String) {
      cdkBuilder.release(release)
    }

    override fun repository(repository: String) {
      cdkBuilder.repository(repository)
    }

    override fun skipCrds(skipCrds: Boolean) {
      cdkBuilder.skipCrds(skipCrds)
    }

    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    override fun values(values: Map<String, Any>) {
      cdkBuilder.values(values)
    }

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    override fun wait(wait: Boolean) {
      cdkBuilder.wait(wait)
    }

    public fun build(): software.amazon.awscdk.services.eks.HelmChartProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.HelmChartProps,
  ) : CdkObject(cdkObject), HelmChartProps {
    override fun chart(): String? = unwrap(this).getChart()

    override fun chartAsset(): Asset? = unwrap(this).getChartAsset()?.let(Asset::wrap)

    override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

    override fun createNamespace(): Boolean? = unwrap(this).getCreateNamespace()

    override fun namespace(): String? = unwrap(this).getNamespace()

    override fun release(): String? = unwrap(this).getRelease()

    override fun repository(): String? = unwrap(this).getRepository()

    override fun skipCrds(): Boolean? = unwrap(this).getSkipCrds()

    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    override fun values(): Map<String, Any> = unwrap(this).getValues() ?: emptyMap()

    override fun version(): String? = unwrap(this).getVersion()

    override fun wait(): Boolean? = unwrap(this).getWait()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HelmChartProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.HelmChartProps): HelmChartProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HelmChartProps): software.amazon.awscdk.services.eks.HelmChartProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.eks.HelmChartProps
  }
}
