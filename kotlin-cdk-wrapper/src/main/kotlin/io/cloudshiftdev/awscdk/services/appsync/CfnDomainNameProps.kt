@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnDomainNameProps {
  public fun certificateArn(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun domainName(): String

  @CdkDslMarker
  public interface Builder {
    public fun certificateArn(certificateArn: String)

    public fun description(description: String)

    public fun domainName(domainName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnDomainNameProps.Builder =
        software.amazon.awscdk.services.appsync.CfnDomainNameProps.builder()

    override fun certificateArn(certificateArn: String) {
      cdkBuilder.certificateArn(certificateArn)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnDomainNameProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.CfnDomainNameProps,
  ) : CdkObject(cdkObject), CfnDomainNameProps {
    override fun certificateArn(): String = unwrap(this).getCertificateArn()

    override fun description(): String? = unwrap(this).getDescription()

    override fun domainName(): String = unwrap(this).getDomainName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainNameProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnDomainNameProps):
        CfnDomainNameProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainNameProps):
        software.amazon.awscdk.services.appsync.CfnDomainNameProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.CfnDomainNameProps
  }
}
