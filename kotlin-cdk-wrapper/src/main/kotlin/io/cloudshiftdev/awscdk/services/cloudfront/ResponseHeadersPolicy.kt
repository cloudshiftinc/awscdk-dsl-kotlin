@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ResponseHeadersPolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy,
) : Resource(cdkObject), IResponseHeadersPolicy {
  public override fun responseHeadersPolicyId(): String = unwrap(this).getResponseHeadersPolicyId()

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    public fun corsBehavior(corsBehavior: ResponseHeadersCorsBehavior)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad2af5fbd83f040932aa29ddbb986fde55e2d148fa3edb5d4b1eff454b8a8505")
    public fun corsBehavior(corsBehavior: ResponseHeadersCorsBehavior.Builder.() -> Unit)

    public fun customHeadersBehavior(customHeadersBehavior: ResponseCustomHeadersBehavior)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab2f2333b49f38c2836f76f275cc00c10028065625276a721d6053832074377b")
    public
        fun customHeadersBehavior(customHeadersBehavior: ResponseCustomHeadersBehavior.Builder.() -> Unit)

    public fun removeHeaders(removeHeaders: List<String>)

    public fun removeHeaders(vararg removeHeaders: String)

    public fun responseHeadersPolicyName(responseHeadersPolicyName: String)

    public fun securityHeadersBehavior(securityHeadersBehavior: ResponseSecurityHeadersBehavior)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("850766b95b6b44bdd5235525c7ce0800dd9a6a339e245395151303df303cefcc")
    public
        fun securityHeadersBehavior(securityHeadersBehavior: ResponseSecurityHeadersBehavior.Builder.() -> Unit)

    public fun serverTimingSamplingRate(serverTimingSamplingRate: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy.Builder
        = software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy.Builder.create(scope, id)

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun corsBehavior(corsBehavior: ResponseHeadersCorsBehavior) {
      cdkBuilder.corsBehavior(corsBehavior.let(ResponseHeadersCorsBehavior::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ad2af5fbd83f040932aa29ddbb986fde55e2d148fa3edb5d4b1eff454b8a8505")
    override fun corsBehavior(corsBehavior: ResponseHeadersCorsBehavior.Builder.() -> Unit): Unit =
        corsBehavior(ResponseHeadersCorsBehavior(corsBehavior))

    override fun customHeadersBehavior(customHeadersBehavior: ResponseCustomHeadersBehavior) {
      cdkBuilder.customHeadersBehavior(customHeadersBehavior.let(ResponseCustomHeadersBehavior::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab2f2333b49f38c2836f76f275cc00c10028065625276a721d6053832074377b")
    override
        fun customHeadersBehavior(customHeadersBehavior: ResponseCustomHeadersBehavior.Builder.() -> Unit):
        Unit = customHeadersBehavior(ResponseCustomHeadersBehavior(customHeadersBehavior))

    override fun removeHeaders(removeHeaders: List<String>) {
      cdkBuilder.removeHeaders(removeHeaders)
    }

    override fun removeHeaders(vararg removeHeaders: String): Unit =
        removeHeaders(removeHeaders.toList())

    override fun responseHeadersPolicyName(responseHeadersPolicyName: String) {
      cdkBuilder.responseHeadersPolicyName(responseHeadersPolicyName)
    }

    override fun securityHeadersBehavior(securityHeadersBehavior: ResponseSecurityHeadersBehavior) {
      cdkBuilder.securityHeadersBehavior(securityHeadersBehavior.let(ResponseSecurityHeadersBehavior::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("850766b95b6b44bdd5235525c7ce0800dd9a6a339e245395151303df303cefcc")
    override
        fun securityHeadersBehavior(securityHeadersBehavior: ResponseSecurityHeadersBehavior.Builder.() -> Unit):
        Unit = securityHeadersBehavior(ResponseSecurityHeadersBehavior(securityHeadersBehavior))

    override fun serverTimingSamplingRate(serverTimingSamplingRate: Number) {
      cdkBuilder.serverTimingSamplingRate(serverTimingSamplingRate)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CORS_ALLOW_ALL_ORIGINS: IResponseHeadersPolicy =
        IResponseHeadersPolicy.wrap(software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy.CORS_ALLOW_ALL_ORIGINS)

    public val CORS_ALLOW_ALL_ORIGINS_AND_SECURITY_HEADERS: IResponseHeadersPolicy =
        IResponseHeadersPolicy.wrap(software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy.CORS_ALLOW_ALL_ORIGINS_AND_SECURITY_HEADERS)

    public val CORS_ALLOW_ALL_ORIGINS_WITH_PREFLIGHT: IResponseHeadersPolicy =
        IResponseHeadersPolicy.wrap(software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy.CORS_ALLOW_ALL_ORIGINS_WITH_PREFLIGHT)

    public val CORS_ALLOW_ALL_ORIGINS_WITH_PREFLIGHT_AND_SECURITY_HEADERS: IResponseHeadersPolicy =
        IResponseHeadersPolicy.wrap(software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy.CORS_ALLOW_ALL_ORIGINS_WITH_PREFLIGHT_AND_SECURITY_HEADERS)

    public val SECURITY_HEADERS: IResponseHeadersPolicy =
        IResponseHeadersPolicy.wrap(software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy.SECURITY_HEADERS)

    public fun fromResponseHeadersPolicyId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      responseHeadersPolicyId: String,
    ): IResponseHeadersPolicy =
        software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy.fromResponseHeadersPolicyId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, responseHeadersPolicyId).let(IResponseHeadersPolicy::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ResponseHeadersPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ResponseHeadersPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy):
        ResponseHeadersPolicy = ResponseHeadersPolicy(cdkObject)

    internal fun unwrap(wrapped: ResponseHeadersPolicy):
        software.amazon.awscdk.services.cloudfront.ResponseHeadersPolicy = wrapped.cdkObject
  }
}