package io.cloudshiftdev.awscdk.services.ses

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ReceiptRuleOptions {
  public fun actions(): List<IReceiptRuleAction> =
      unwrap(this).getActions()?.map(IReceiptRuleAction::wrap) ?: emptyList()

  public fun after(): IReceiptRule? = unwrap(this).getAfter()?.let(IReceiptRule::wrap)

  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun receiptRuleName(): String? = unwrap(this).getReceiptRuleName()

  public fun recipients(): List<String> = unwrap(this).getRecipients() ?: emptyList()

  public fun scanEnabled(): Boolean? = unwrap(this).getScanEnabled()

  public fun tlsPolicy(): TlsPolicy? = unwrap(this).getTlsPolicy()?.let(TlsPolicy::wrap)

  public interface Builder {
    public fun actions(actions: List<IReceiptRuleAction>)

    public fun after(after: IReceiptRule)

    public fun enabled(enabled: Boolean)

    public fun receiptRuleName(receiptRuleName: String)

    public fun recipients(recipients: List<String>)

    public fun scanEnabled(scanEnabled: Boolean)

    public fun tlsPolicy(tlsPolicy: TlsPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.ReceiptRuleOptions.Builder =
        software.amazon.awscdk.services.ses.ReceiptRuleOptions.builder()

    override fun actions(actions: List<IReceiptRuleAction>) {
      cdkBuilder.actions(actions.map(IReceiptRuleAction::unwrap))
    }

    override fun after(after: IReceiptRule) {
      cdkBuilder.after(after.let(IReceiptRule::unwrap))
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun receiptRuleName(receiptRuleName: String) {
      cdkBuilder.receiptRuleName(receiptRuleName)
    }

    override fun recipients(recipients: List<String>) {
      cdkBuilder.recipients(recipients)
    }

    override fun scanEnabled(scanEnabled: Boolean) {
      cdkBuilder.scanEnabled(scanEnabled)
    }

    override fun tlsPolicy(tlsPolicy: TlsPolicy) {
      cdkBuilder.tlsPolicy(tlsPolicy.let(TlsPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.ReceiptRuleOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ses.ReceiptRuleOptions,
  ) : ReceiptRuleOptions {
    override fun actions(): List<IReceiptRuleAction> =
        unwrap(this).getActions()?.map(IReceiptRuleAction::wrap) ?: emptyList()

    override fun after(): IReceiptRule? = unwrap(this).getAfter()?.let(IReceiptRule::wrap)

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun receiptRuleName(): String? = unwrap(this).getReceiptRuleName()

    override fun recipients(): List<String> = unwrap(this).getRecipients() ?: emptyList()

    override fun scanEnabled(): Boolean? = unwrap(this).getScanEnabled()

    override fun tlsPolicy(): TlsPolicy? = unwrap(this).getTlsPolicy()?.let(TlsPolicy::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ReceiptRuleOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.ReceiptRuleOptions):
        ReceiptRuleOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ReceiptRuleOptions):
        software.amazon.awscdk.services.ses.ReceiptRuleOptions = (wrapped as Wrapper).cdkObject
  }
}
