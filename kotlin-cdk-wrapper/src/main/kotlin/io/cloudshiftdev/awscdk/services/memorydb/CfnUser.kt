@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.memorydb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUser internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.memorydb.CfnUser,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accessString(): String? = unwrap(this).getAccessString()

  public open fun accessString(`value`: String) {
    unwrap(this).setAccessString(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun authenticationMode(): Any? = unwrap(this).getAuthenticationMode()

  public open fun authenticationMode(`value`: Any) {
    unwrap(this).setAuthenticationMode(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun userName(): String = unwrap(this).getUserName()

  public open fun userName(`value`: String) {
    unwrap(this).setUserName(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun accessString(accessString: String)

    public fun authenticationMode(authenticationMode: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun userName(userName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.memorydb.CfnUser.Builder =
        software.amazon.awscdk.services.memorydb.CfnUser.Builder.create(scope, id)

    override fun accessString(accessString: String) {
      cdkBuilder.accessString(accessString)
    }

    override fun authenticationMode(authenticationMode: Any) {
      cdkBuilder.authenticationMode(authenticationMode)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.memorydb.CfnUser = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.memorydb.CfnUser.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUser {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUser(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.memorydb.CfnUser): CfnUser =
        CfnUser(cdkObject)

    internal fun unwrap(wrapped: CfnUser): software.amazon.awscdk.services.memorydb.CfnUser =
        wrapped.cdkObject
  }

  public interface AuthenticationModeProperty {
    public fun passwords(): List<String> = unwrap(this).getPasswords() ?: emptyList()

    public fun type(): String? = unwrap(this).getType()

    @CdkDslMarker
    public interface Builder {
      public fun passwords(passwords: List<String>)

      public fun passwords(vararg passwords: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.memorydb.CfnUser.AuthenticationModeProperty.Builder =
          software.amazon.awscdk.services.memorydb.CfnUser.AuthenticationModeProperty.builder()

      override fun passwords(passwords: List<String>) {
        cdkBuilder.passwords(passwords)
      }

      override fun passwords(vararg passwords: String): Unit = passwords(passwords.toList())

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.memorydb.CfnUser.AuthenticationModeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.memorydb.CfnUser.AuthenticationModeProperty,
    ) : CdkObject(cdkObject), AuthenticationModeProperty {
      override fun passwords(): List<String> = unwrap(this).getPasswords() ?: emptyList()

      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AuthenticationModeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.memorydb.CfnUser.AuthenticationModeProperty):
          AuthenticationModeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuthenticationModeProperty):
          software.amazon.awscdk.services.memorydb.CfnUser.AuthenticationModeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.memorydb.CfnUser.AuthenticationModeProperty
    }
  }
}
