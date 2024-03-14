package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.services.route53.IPublicHostedZone
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class DkimIdentity internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ses.DkimIdentity,
) {
  public open fun bind(arg0: EmailIdentity): DkimIdentityConfig? =
      unwrap(this).bind(arg0.let(EmailIdentity::unwrap))?.let(DkimIdentityConfig::wrap)

  public open fun bind(arg0: EmailIdentity, arg1: IPublicHostedZone): DkimIdentityConfig? =
      unwrap(this).bind(arg0.let(EmailIdentity::unwrap),
      arg1.let(IPublicHostedZone::unwrap))?.let(DkimIdentityConfig::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ses.DkimIdentity,
  ) : DkimIdentity(cdkObject)

  public companion object {
    public open fun byoDkim(options: ByoDkimOptions): DkimIdentity =
        software.amazon.awscdk.services.ses.DkimIdentity.byoDkim(options.let(ByoDkimOptions::unwrap)).let(DkimIdentity::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3bfff2fcb89d53bfb99ba06b7f9047a977afc3c905867e474890d4c288deeedd")
    public open fun byoDkim(options: ByoDkimOptions.Builder.() -> Unit): DkimIdentity =
        byoDkim(ByoDkimOptions(options))

    public open fun easyDkim(): DkimIdentity =
        software.amazon.awscdk.services.ses.DkimIdentity.easyDkim().let(DkimIdentity::wrap)

    public open fun easyDkim(signingKeyLength: EasyDkimSigningKeyLength): DkimIdentity =
        software.amazon.awscdk.services.ses.DkimIdentity.easyDkim(signingKeyLength.let(EasyDkimSigningKeyLength::unwrap)).let(DkimIdentity::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.DkimIdentity): DkimIdentity =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DkimIdentity): software.amazon.awscdk.services.ses.DkimIdentity =
        (wrapped as Wrapper).cdkObject
  }
}