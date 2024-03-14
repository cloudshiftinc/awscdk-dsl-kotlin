package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRoleAlias internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot.CfnRoleAlias,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrRoleAliasArn(): String = unwrap(this).getAttrRoleAliasArn()

  public open fun credentialDurationSeconds(): Number? = unwrap(this).getCredentialDurationSeconds()

  public open fun credentialDurationSeconds(`value`: Number) {
    unwrap(this).setCredentialDurationSeconds(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun roleAlias(): String? = unwrap(this).getRoleAlias()

  public open fun roleAlias(`value`: String) {
    unwrap(this).setRoleAlias(`value`)
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun credentialDurationSeconds(credentialDurationSeconds: Number) {
    }

    public fun roleAlias(roleAlias: String) {
    }

    public fun roleArn(roleArn: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnRoleAlias.Builder =
        software.amazon.awscdk.services.iot.CfnRoleAlias.Builder.create(scope, id)

    public override fun credentialDurationSeconds(credentialDurationSeconds: Number) {
      cdkBuilder.credentialDurationSeconds(credentialDurationSeconds)
    }

    public override fun roleAlias(roleAlias: String) {
      cdkBuilder.roleAlias(roleAlias)
    }

    public override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnRoleAlias = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRoleAlias {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRoleAlias(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnRoleAlias): CfnRoleAlias =
        CfnRoleAlias(cdkObject)

    internal fun unwrap(wrapped: CfnRoleAlias): software.amazon.awscdk.services.iot.CfnRoleAlias =
        wrapped.cdkObject
  }
}
