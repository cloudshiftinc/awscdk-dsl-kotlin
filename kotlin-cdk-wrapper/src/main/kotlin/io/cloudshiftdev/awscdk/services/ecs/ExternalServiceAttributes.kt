@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ExternalServiceAttributes {
  public fun cluster(): ICluster

  public fun serviceArn(): String? = unwrap(this).getServiceArn()

  public fun serviceName(): String? = unwrap(this).getServiceName()

  @CdkDslMarker
  public interface Builder {
    public fun cluster(cluster: ICluster)

    public fun serviceArn(serviceArn: String)

    public fun serviceName(serviceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ExternalServiceAttributes.Builder =
        software.amazon.awscdk.services.ecs.ExternalServiceAttributes.builder()

    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    override fun serviceArn(serviceArn: String) {
      cdkBuilder.serviceArn(serviceArn)
    }

    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    public fun build(): software.amazon.awscdk.services.ecs.ExternalServiceAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.ExternalServiceAttributes,
  ) : CdkObject(cdkObject), ExternalServiceAttributes {
    override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

    override fun serviceArn(): String? = unwrap(this).getServiceArn()

    override fun serviceName(): String? = unwrap(this).getServiceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ExternalServiceAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ExternalServiceAttributes):
        ExternalServiceAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ExternalServiceAttributes):
        software.amazon.awscdk.services.ecs.ExternalServiceAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.ExternalServiceAttributes
  }
}