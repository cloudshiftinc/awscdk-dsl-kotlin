package io.cloudshiftdev.awscdk.services.ec2

import kotlin.String
import kotlin.Unit

public interface KeyPairAttributes {
  public fun keyPairName(): String

  public fun type(): KeyPairType? = unwrap(this).getType()?.let(KeyPairType::wrap)

  public interface Builder {
    public fun keyPairName(keyPairName: String) {
    }

    public fun type(type: KeyPairType) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.KeyPairAttributes.Builder =
        software.amazon.awscdk.services.ec2.KeyPairAttributes.builder()

    public override fun keyPairName(keyPairName: String) {
      cdkBuilder.keyPairName(keyPairName)
    }

    public override fun type(type: KeyPairType) {
      cdkBuilder.type(type.let(KeyPairType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.KeyPairAttributes = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.KeyPairAttributes,
  ) : KeyPairAttributes {
    public override fun keyPairName(): String = unwrap(this).getKeyPairName()

    public override fun type(): KeyPairType? = unwrap(this).getType()?.let(KeyPairType::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): KeyPairAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.KeyPairAttributes):
        KeyPairAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: KeyPairAttributes):
        software.amazon.awscdk.services.ec2.KeyPairAttributes = (wrapped as Wrapper).cdkObject
  }
}
