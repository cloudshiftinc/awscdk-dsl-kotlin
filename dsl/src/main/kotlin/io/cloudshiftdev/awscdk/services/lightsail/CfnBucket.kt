package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBucket internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lightsail.CfnBucket,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accessRules(): Any? = unwrap(this).getAccessRules()

  public open fun accessRules(`value`: IResolvable) {
    unwrap(this).setAccessRules(`value`.let(IResolvable::unwrap))
  }

  public open fun accessRules(`value`: AccessRulesProperty) {
    unwrap(this).setAccessRules(`value`.let(AccessRulesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("34bbb541d3503849607db4408d500da6fb2dd086a50da539a95887494713b8eb")
  public open fun accessRules(`value`: AccessRulesProperty.Builder.() -> Unit): Unit =
      accessRules(AccessRulesProperty(`value`))

  public open fun attrAbleToUpdateBundle(): IResolvable =
      unwrap(this).getAttrAbleToUpdateBundle().let(IResolvable::wrap)

  public open fun attrBucketArn(): String = unwrap(this).getAttrBucketArn()

  public open fun attrUrl(): String = unwrap(this).getAttrUrl()

  public open fun bucketName(): String = unwrap(this).getBucketName()

  public open fun bucketName(`value`: String) {
    unwrap(this).setBucketName(`value`)
  }

  public open fun bundleId(): String = unwrap(this).getBundleId()

  public open fun bundleId(`value`: String) {
    unwrap(this).setBundleId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun objectVersioning(): Any? = unwrap(this).getObjectVersioning()

  public open fun objectVersioning(`value`: Boolean) {
    unwrap(this).setObjectVersioning(`value`)
  }

  public open fun objectVersioning(`value`: IResolvable) {
    unwrap(this).setObjectVersioning(`value`.let(IResolvable::unwrap))
  }

  public open fun readOnlyAccessAccounts(): List<String> = unwrap(this).getReadOnlyAccessAccounts()
      ?: emptyList()

  public open fun readOnlyAccessAccounts(`value`: List<String>) {
    unwrap(this).setReadOnlyAccessAccounts(`value`)
  }

  public open fun resourcesReceivingAccess(): List<String> =
      unwrap(this).getResourcesReceivingAccess() ?: emptyList()

  public open fun resourcesReceivingAccess(`value`: List<String>) {
    unwrap(this).setResourcesReceivingAccess(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun accessRules(accessRules: IResolvable) {
    }

    public fun accessRules(accessRules: AccessRulesProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3bfa6456dc7a9a43da03b9688cb627d224c83e44098ae1afa1a12ccd7bc2d6c2")
    public fun accessRules(accessRules: AccessRulesProperty.Builder.() -> Unit) {
    }

    public fun bucketName(bucketName: String) {
    }

    public fun bundleId(bundleId: String) {
    }

    public fun objectVersioning(objectVersioning: Boolean) {
    }

    public fun objectVersioning(objectVersioning: IResolvable) {
    }

    public fun readOnlyAccessAccounts(readOnlyAccessAccounts: List<String>) {
    }

    public fun resourcesReceivingAccess(resourcesReceivingAccess: List<String>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnBucket.Builder =
        software.amazon.awscdk.services.lightsail.CfnBucket.Builder.create(scope, id)

    public override fun accessRules(accessRules: IResolvable) {
      cdkBuilder.accessRules(accessRules.let(IResolvable::unwrap))
    }

    public override fun accessRules(accessRules: AccessRulesProperty) {
      cdkBuilder.accessRules(accessRules.let(AccessRulesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3bfa6456dc7a9a43da03b9688cb627d224c83e44098ae1afa1a12ccd7bc2d6c2")
    public override fun accessRules(accessRules: AccessRulesProperty.Builder.() -> Unit): Unit =
        accessRules(AccessRulesProperty(accessRules))

    public override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    public override fun bundleId(bundleId: String) {
      cdkBuilder.bundleId(bundleId)
    }

    public override fun objectVersioning(objectVersioning: Boolean) {
      cdkBuilder.objectVersioning(objectVersioning)
    }

    public override fun objectVersioning(objectVersioning: IResolvable) {
      cdkBuilder.objectVersioning(objectVersioning.let(IResolvable::unwrap))
    }

    public override fun readOnlyAccessAccounts(readOnlyAccessAccounts: List<String>) {
      cdkBuilder.readOnlyAccessAccounts(readOnlyAccessAccounts)
    }

    public override fun resourcesReceivingAccess(resourcesReceivingAccess: List<String>) {
      cdkBuilder.resourcesReceivingAccess(resourcesReceivingAccess)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lightsail.CfnBucket = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBucket {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBucket(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnBucket): CfnBucket =
        CfnBucket(cdkObject)

    internal fun unwrap(wrapped: CfnBucket): software.amazon.awscdk.services.lightsail.CfnBucket =
        wrapped.cdkObject
  }

  public interface AccessRulesProperty {
    public fun allowPublicOverrides(): Any? = unwrap(this).getAllowPublicOverrides()

    public fun objectAccess(): String? = unwrap(this).getObjectAccess()

    public interface Builder {
      public fun allowPublicOverrides(allowPublicOverrides: Boolean) {
      }

      public fun allowPublicOverrides(allowPublicOverrides: IResolvable) {
      }

      public fun objectAccess(objectAccess: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnBucket.AccessRulesProperty.Builder =
          software.amazon.awscdk.services.lightsail.CfnBucket.AccessRulesProperty.builder()

      public override fun allowPublicOverrides(allowPublicOverrides: Boolean) {
        cdkBuilder.allowPublicOverrides(allowPublicOverrides)
      }

      public override fun allowPublicOverrides(allowPublicOverrides: IResolvable) {
        cdkBuilder.allowPublicOverrides(allowPublicOverrides.let(IResolvable::unwrap))
      }

      public override fun objectAccess(objectAccess: String) {
        cdkBuilder.objectAccess(objectAccess)
      }

      public fun build(): software.amazon.awscdk.services.lightsail.CfnBucket.AccessRulesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnBucket.AccessRulesProperty,
    ) : AccessRulesProperty {
      public override fun allowPublicOverrides(): Any? = unwrap(this).getAllowPublicOverrides()

      public override fun objectAccess(): String? = unwrap(this).getObjectAccess()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AccessRulesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnBucket.AccessRulesProperty):
          AccessRulesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessRulesProperty):
          software.amazon.awscdk.services.lightsail.CfnBucket.AccessRulesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
