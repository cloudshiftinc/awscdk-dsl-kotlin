package io.cloudshiftdev.awscdk.services.cognito

import kotlin.Boolean
import kotlin.Unit

public interface SignInAliases {
  public fun email(): Boolean? = unwrap(this).getEmail()

  public fun phone(): Boolean? = unwrap(this).getPhone()

  public fun preferredUsername(): Boolean? = unwrap(this).getPreferredUsername()

  public fun username(): Boolean? = unwrap(this).getUsername()

  public interface Builder {
    public fun email(email: Boolean)

    public fun phone(phone: Boolean)

    public fun preferredUsername(preferredUsername: Boolean)

    public fun username(username: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.SignInAliases.Builder =
        software.amazon.awscdk.services.cognito.SignInAliases.builder()

    override fun email(email: Boolean) {
      cdkBuilder.email(email)
    }

    override fun phone(phone: Boolean) {
      cdkBuilder.phone(phone)
    }

    override fun preferredUsername(preferredUsername: Boolean) {
      cdkBuilder.preferredUsername(preferredUsername)
    }

    override fun username(username: Boolean) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.cognito.SignInAliases = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.SignInAliases,
  ) : SignInAliases {
    override fun email(): Boolean? = unwrap(this).getEmail()

    override fun phone(): Boolean? = unwrap(this).getPhone()

    override fun preferredUsername(): Boolean? = unwrap(this).getPreferredUsername()

    override fun username(): Boolean? = unwrap(this).getUsername()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SignInAliases {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.SignInAliases):
        SignInAliases = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SignInAliases):
        software.amazon.awscdk.services.cognito.SignInAliases = (wrapped as Wrapper).cdkObject
  }
}