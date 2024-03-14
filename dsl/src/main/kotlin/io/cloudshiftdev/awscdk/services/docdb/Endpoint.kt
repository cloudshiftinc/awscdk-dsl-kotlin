package io.cloudshiftdev.awscdk.services.docdb

import kotlin.Number
import kotlin.String

public open class Endpoint internal constructor(
  private val cdkObject: software.amazon.awscdk.services.docdb.Endpoint,
) {
  public open fun hostname(): String = unwrap(this).getHostname()

  public open fun port(): Number = unwrap(this).getPort()

  public open fun portAsString(): String = unwrap(this).portAsString()

  public open fun socketAddress(): String = unwrap(this).getSocketAddress()

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.Endpoint): Endpoint =
        Endpoint(cdkObject)

    internal fun unwrap(wrapped: Endpoint): software.amazon.awscdk.services.docdb.Endpoint =
        wrapped.cdkObject
  }
}