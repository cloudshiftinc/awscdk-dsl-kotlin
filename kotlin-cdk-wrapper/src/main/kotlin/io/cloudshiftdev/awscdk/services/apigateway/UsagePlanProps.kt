@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface UsagePlanProps {
  public fun apiStages(): List<UsagePlanPerApiStage> =
      unwrap(this).getApiStages()?.map(UsagePlanPerApiStage::wrap) ?: emptyList()

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String? = unwrap(this).getName()

  public fun quota(): QuotaSettings? = unwrap(this).getQuota()?.let(QuotaSettings::wrap)

  public fun throttle(): ThrottleSettings? = unwrap(this).getThrottle()?.let(ThrottleSettings::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun apiStages(apiStages: List<UsagePlanPerApiStage>)

    public fun apiStages(vararg apiStages: UsagePlanPerApiStage)

    public fun description(description: String)

    public fun name(name: String)

    public fun quota(quota: QuotaSettings)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5d12cdfee5bdbbb46ad7762a8f4725bbb9de358c9aba228ca734dc859ecfec4")
    public fun quota(quota: QuotaSettings.Builder.() -> Unit)

    public fun throttle(throttle: ThrottleSettings)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e846046156076b7275e27bc5f467db9c4ce70e1c888c1939c11dad216314a65")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.UsagePlanProps.Builder =
        software.amazon.awscdk.services.apigateway.UsagePlanProps.builder()

    override fun apiStages(apiStages: List<UsagePlanPerApiStage>) {
      cdkBuilder.apiStages(apiStages.map(UsagePlanPerApiStage::unwrap))
    }

    override fun apiStages(vararg apiStages: UsagePlanPerApiStage): Unit =
        apiStages(apiStages.toList())

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun quota(quota: QuotaSettings) {
      cdkBuilder.quota(quota.let(QuotaSettings::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a5d12cdfee5bdbbb46ad7762a8f4725bbb9de358c9aba228ca734dc859ecfec4")
    override fun quota(quota: QuotaSettings.Builder.() -> Unit): Unit = quota(QuotaSettings(quota))

    override fun throttle(throttle: ThrottleSettings) {
      cdkBuilder.throttle(throttle.let(ThrottleSettings::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4e846046156076b7275e27bc5f467db9c4ce70e1c888c1939c11dad216314a65")
    override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    public fun build(): software.amazon.awscdk.services.apigateway.UsagePlanProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.UsagePlanProps,
  ) : CdkObject(cdkObject), UsagePlanProps {
    override fun apiStages(): List<UsagePlanPerApiStage> =
        unwrap(this).getApiStages()?.map(UsagePlanPerApiStage::wrap) ?: emptyList()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String? = unwrap(this).getName()

    override fun quota(): QuotaSettings? = unwrap(this).getQuota()?.let(QuotaSettings::wrap)

    override fun throttle(): ThrottleSettings? =
        unwrap(this).getThrottle()?.let(ThrottleSettings::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UsagePlanProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.UsagePlanProps):
        UsagePlanProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UsagePlanProps):
        software.amazon.awscdk.services.apigateway.UsagePlanProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.UsagePlanProps
  }
}
