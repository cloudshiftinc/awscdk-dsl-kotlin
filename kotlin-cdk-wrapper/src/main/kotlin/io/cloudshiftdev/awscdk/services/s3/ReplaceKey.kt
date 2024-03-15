@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class ReplaceKey internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.s3.ReplaceKey,
) : CdkObject(cdkObject) {
  public open fun prefixWithKey(): String? = unwrap(this).getPrefixWithKey()

  public open fun withKey(): String? = unwrap(this).getWithKey()

  public companion object {
    public fun prefixWith(keyReplacement: String): ReplaceKey =
        software.amazon.awscdk.services.s3.ReplaceKey.prefixWith(keyReplacement).let(ReplaceKey::wrap)

    public fun with(keyReplacement: String): ReplaceKey =
        software.amazon.awscdk.services.s3.ReplaceKey.with(keyReplacement).let(ReplaceKey::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.ReplaceKey): ReplaceKey =
        ReplaceKey(cdkObject)

    internal fun unwrap(wrapped: ReplaceKey): software.amazon.awscdk.services.s3.ReplaceKey =
        wrapped.cdkObject
  }
}