@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.licensemanager

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGrant internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.licensemanager.CfnGrant,
) : CfnResource(cdkObject), IInspectable {
  public open fun allowedOperations(): List<String> = unwrap(this).getAllowedOperations() ?:
      emptyList()

  public open fun allowedOperations(`value`: List<String>) {
    unwrap(this).setAllowedOperations(`value`)
  }

  public open fun allowedOperations(vararg `value`: String): Unit =
      allowedOperations(`value`.toList())

  public open fun attrGrantArn(): String = unwrap(this).getAttrGrantArn()

  public open fun attrVersion(): String = unwrap(this).getAttrVersion()

  public open fun grantName(): String? = unwrap(this).getGrantName()

  public open fun grantName(`value`: String) {
    unwrap(this).setGrantName(`value`)
  }

  public open fun homeRegion(): String? = unwrap(this).getHomeRegion()

  public open fun homeRegion(`value`: String) {
    unwrap(this).setHomeRegion(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun licenseArn(): String? = unwrap(this).getLicenseArn()

  public open fun licenseArn(`value`: String) {
    unwrap(this).setLicenseArn(`value`)
  }

  public open fun principals(): List<String> = unwrap(this).getPrincipals() ?: emptyList()

  public open fun principals(`value`: List<String>) {
    unwrap(this).setPrincipals(`value`)
  }

  public open fun principals(vararg `value`: String): Unit = principals(`value`.toList())

  public open fun status(): String? = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun allowedOperations(allowedOperations: List<String>)

    public fun allowedOperations(vararg allowedOperations: String)

    public fun grantName(grantName: String)

    public fun homeRegion(homeRegion: String)

    public fun licenseArn(licenseArn: String)

    public fun principals(principals: List<String>)

    public fun principals(vararg principals: String)

    public fun status(status: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.licensemanager.CfnGrant.Builder =
        software.amazon.awscdk.services.licensemanager.CfnGrant.Builder.create(scope, id)

    override fun allowedOperations(allowedOperations: List<String>) {
      cdkBuilder.allowedOperations(allowedOperations)
    }

    override fun allowedOperations(vararg allowedOperations: String): Unit =
        allowedOperations(allowedOperations.toList())

    override fun grantName(grantName: String) {
      cdkBuilder.grantName(grantName)
    }

    override fun homeRegion(homeRegion: String) {
      cdkBuilder.homeRegion(homeRegion)
    }

    override fun licenseArn(licenseArn: String) {
      cdkBuilder.licenseArn(licenseArn)
    }

    override fun principals(principals: List<String>) {
      cdkBuilder.principals(principals)
    }

    override fun principals(vararg principals: String): Unit = principals(principals.toList())

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.licensemanager.CfnGrant = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.licensemanager.CfnGrant.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGrant {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGrant(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.licensemanager.CfnGrant): CfnGrant
        = CfnGrant(cdkObject)

    internal fun unwrap(wrapped: CfnGrant): software.amazon.awscdk.services.licensemanager.CfnGrant
        = wrapped.cdkObject
  }
}
