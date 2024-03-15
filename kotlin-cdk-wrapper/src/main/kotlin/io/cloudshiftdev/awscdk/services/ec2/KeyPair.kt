@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ssm.IStringParameter
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class KeyPair internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.KeyPair,
) : Resource(cdkObject), IKeyPair {
  public open fun format(): KeyPairFormat = unwrap(this).getFormat().let(KeyPairFormat::wrap)

  public open fun hasImportedMaterial(): Boolean = unwrap(this).getHasImportedMaterial()

  public open fun keyPairFingerprint(): String = unwrap(this).getKeyPairFingerprint()

  public open fun keyPairId(): String = unwrap(this).getKeyPairId()

  public override fun keyPairName(): String = unwrap(this).getKeyPairName()

  public open fun privateKey(): IStringParameter =
      unwrap(this).getPrivateKey().let(IStringParameter::wrap)

  public override fun type(): KeyPairType? = unwrap(this).getType()?.let(KeyPairType::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun account(account: String)

    public fun environmentFromArn(environmentFromArn: String)

    public fun format(format: KeyPairFormat)

    public fun keyPairName(keyPairName: String)

    public fun physicalName(physicalName: String)

    public fun publicKeyMaterial(publicKeyMaterial: String)

    public fun region(region: String)

    public fun type(type: KeyPairType)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.KeyPair.Builder =
        software.amazon.awscdk.services.ec2.KeyPair.Builder.create(scope, id)

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun environmentFromArn(environmentFromArn: String) {
      cdkBuilder.environmentFromArn(environmentFromArn)
    }

    override fun format(format: KeyPairFormat) {
      cdkBuilder.format(format.let(KeyPairFormat::unwrap))
    }

    override fun keyPairName(keyPairName: String) {
      cdkBuilder.keyPairName(keyPairName)
    }

    override fun physicalName(physicalName: String) {
      cdkBuilder.physicalName(physicalName)
    }

    override fun publicKeyMaterial(publicKeyMaterial: String) {
      cdkBuilder.publicKeyMaterial(publicKeyMaterial)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun type(type: KeyPairType) {
      cdkBuilder.type(type.let(KeyPairType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.KeyPair = cdkBuilder.build()
  }

  public companion object {
    public fun fromKeyPairAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: KeyPairAttributes,
    ): IKeyPair =
        software.amazon.awscdk.services.ec2.KeyPair.fromKeyPairAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(KeyPairAttributes::unwrap)).let(IKeyPair::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd9caf7b1f832116a7bd6fe64c987b52581abb0163ff41ed36b0abc60e006127")
    public fun fromKeyPairAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: KeyPairAttributes.Builder.() -> Unit,
    ): IKeyPair = fromKeyPairAttributes(scope, id, KeyPairAttributes(attrs))

    public fun fromKeyPairName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      keyPairName: String,
    ): IKeyPair =
        software.amazon.awscdk.services.ec2.KeyPair.fromKeyPairName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, keyPairName).let(IKeyPair::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): KeyPair {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return KeyPair(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.KeyPair): KeyPair =
        KeyPair(cdkObject)

    internal fun unwrap(wrapped: KeyPair): software.amazon.awscdk.services.ec2.KeyPair =
        wrapped.cdkObject
  }
}