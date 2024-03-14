package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBackupVault internal constructor(
  private val cdkObject: software.amazon.awscdk.services.backup.CfnBackupVault,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun accessPolicy(): Any? = unwrap(this).getAccessPolicy()

  public open fun accessPolicy(`value`: Any) {
    unwrap(this).setAccessPolicy(`value`)
  }

  public open fun attrBackupVaultArn(): String = unwrap(this).getAttrBackupVaultArn()

  public open fun attrBackupVaultName(): String = unwrap(this).getAttrBackupVaultName()

  public open fun backupVaultName(): String = unwrap(this).getBackupVaultName()

  public open fun backupVaultName(`value`: String) {
    unwrap(this).setBackupVaultName(`value`)
  }

  public open fun backupVaultTags(): Map<String, String> = unwrap(this).getBackupVaultTags() ?:
      emptyMap()

  public open fun backupVaultTags(`value`: Map<String, String>) {
    unwrap(this).setBackupVaultTags(`value`)
  }

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

  public open fun encryptionKeyArn(`value`: String) {
    unwrap(this).setEncryptionKeyArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun lockConfiguration(): Any? = unwrap(this).getLockConfiguration()

  public open fun lockConfiguration(`value`: IResolvable) {
    unwrap(this).setLockConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun lockConfiguration(`value`: LockConfigurationTypeProperty) {
    unwrap(this).setLockConfiguration(`value`.let(LockConfigurationTypeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("05313fa9bfcbef99b4c75cf8ba7394185eb2dd28876c23ab5645396874294bf7")
  public open fun lockConfiguration(`value`: LockConfigurationTypeProperty.Builder.() -> Unit): Unit
      = lockConfiguration(LockConfigurationTypeProperty(`value`))

  public open fun notifications(): Any? = unwrap(this).getNotifications()

  public open fun notifications(`value`: IResolvable) {
    unwrap(this).setNotifications(`value`.let(IResolvable::unwrap))
  }

  public open fun notifications(`value`: NotificationObjectTypeProperty) {
    unwrap(this).setNotifications(`value`.let(NotificationObjectTypeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b591b9854082ae8d5642dcc6e2ff0ca0c3e315bd24a74bfb1c6fb47276351669")
  public open fun notifications(`value`: NotificationObjectTypeProperty.Builder.() -> Unit): Unit =
      notifications(NotificationObjectTypeProperty(`value`))

  public interface Builder {
    public fun accessPolicy(accessPolicy: Any) {
    }

    public fun backupVaultName(backupVaultName: String) {
    }

    public fun backupVaultTags(backupVaultTags: Map<String, String>) {
    }

    public fun encryptionKeyArn(encryptionKeyArn: String) {
    }

    public fun lockConfiguration(lockConfiguration: IResolvable) {
    }

    public fun lockConfiguration(lockConfiguration: LockConfigurationTypeProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a71402da52619170c8b22fd24486cad861ae95c5fa738d771d76af2f598f4f1")
    public
        fun lockConfiguration(lockConfiguration: LockConfigurationTypeProperty.Builder.() -> Unit) {
    }

    public fun notifications(notifications: IResolvable) {
    }

    public fun notifications(notifications: NotificationObjectTypeProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf094274cd7b72dd9667bbc2fa72561eb35043b71063a300537d895068062283")
    public fun notifications(notifications: NotificationObjectTypeProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.CfnBackupVault.Builder =
        software.amazon.awscdk.services.backup.CfnBackupVault.Builder.create(scope, id)

    public override fun accessPolicy(accessPolicy: Any) {
      cdkBuilder.accessPolicy(accessPolicy)
    }

    public override fun backupVaultName(backupVaultName: String) {
      cdkBuilder.backupVaultName(backupVaultName)
    }

    public override fun backupVaultTags(backupVaultTags: Map<String, String>) {
      cdkBuilder.backupVaultTags(backupVaultTags)
    }

    public override fun encryptionKeyArn(encryptionKeyArn: String) {
      cdkBuilder.encryptionKeyArn(encryptionKeyArn)
    }

    public override fun lockConfiguration(lockConfiguration: IResolvable) {
      cdkBuilder.lockConfiguration(lockConfiguration.let(IResolvable::unwrap))
    }

    public override fun lockConfiguration(lockConfiguration: LockConfigurationTypeProperty) {
      cdkBuilder.lockConfiguration(lockConfiguration.let(LockConfigurationTypeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a71402da52619170c8b22fd24486cad861ae95c5fa738d771d76af2f598f4f1")
    public override
        fun lockConfiguration(lockConfiguration: LockConfigurationTypeProperty.Builder.() -> Unit):
        Unit = lockConfiguration(LockConfigurationTypeProperty(lockConfiguration))

    public override fun notifications(notifications: IResolvable) {
      cdkBuilder.notifications(notifications.let(IResolvable::unwrap))
    }

    public override fun notifications(notifications: NotificationObjectTypeProperty) {
      cdkBuilder.notifications(notifications.let(NotificationObjectTypeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf094274cd7b72dd9667bbc2fa72561eb35043b71063a300537d895068062283")
    public override
        fun notifications(notifications: NotificationObjectTypeProperty.Builder.() -> Unit): Unit =
        notifications(NotificationObjectTypeProperty(notifications))

    public fun build(): software.amazon.awscdk.services.backup.CfnBackupVault = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBackupVault {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBackupVault(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupVault):
        CfnBackupVault = CfnBackupVault(cdkObject)

    internal fun unwrap(wrapped: CfnBackupVault):
        software.amazon.awscdk.services.backup.CfnBackupVault = wrapped.cdkObject
  }

  public interface NotificationObjectTypeProperty {
    public fun backupVaultEvents(): List<String>

    public fun snsTopicArn(): String

    public interface Builder {
      public fun backupVaultEvents(backupVaultEvents: List<String>) {
      }

      public fun snsTopicArn(snsTopicArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupVault.NotificationObjectTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupVault.NotificationObjectTypeProperty.builder()

      public override fun backupVaultEvents(backupVaultEvents: List<String>) {
        cdkBuilder.backupVaultEvents(backupVaultEvents)
      }

      public override fun snsTopicArn(snsTopicArn: String) {
        cdkBuilder.snsTopicArn(snsTopicArn)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupVault.NotificationObjectTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.backup.CfnBackupVault.NotificationObjectTypeProperty,
    ) : NotificationObjectTypeProperty {
      public override fun backupVaultEvents(): List<String> = unwrap(this).getBackupVaultEvents() ?:
          emptyList()

      public override fun snsTopicArn(): String = unwrap(this).getSnsTopicArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NotificationObjectTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupVault.NotificationObjectTypeProperty):
          NotificationObjectTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationObjectTypeProperty):
          software.amazon.awscdk.services.backup.CfnBackupVault.NotificationObjectTypeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LockConfigurationTypeProperty {
    public fun changeableForDays(): Number? = unwrap(this).getChangeableForDays()

    public fun maxRetentionDays(): Number? = unwrap(this).getMaxRetentionDays()

    public fun minRetentionDays(): Number

    public interface Builder {
      public fun changeableForDays(changeableForDays: Number) {
      }

      public fun maxRetentionDays(maxRetentionDays: Number) {
      }

      public fun minRetentionDays(minRetentionDays: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupVault.LockConfigurationTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupVault.LockConfigurationTypeProperty.builder()

      public override fun changeableForDays(changeableForDays: Number) {
        cdkBuilder.changeableForDays(changeableForDays)
      }

      public override fun maxRetentionDays(maxRetentionDays: Number) {
        cdkBuilder.maxRetentionDays(maxRetentionDays)
      }

      public override fun minRetentionDays(minRetentionDays: Number) {
        cdkBuilder.minRetentionDays(minRetentionDays)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupVault.LockConfigurationTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.backup.CfnBackupVault.LockConfigurationTypeProperty,
    ) : LockConfigurationTypeProperty {
      public override fun changeableForDays(): Number? = unwrap(this).getChangeableForDays()

      public override fun maxRetentionDays(): Number? = unwrap(this).getMaxRetentionDays()

      public override fun minRetentionDays(): Number = unwrap(this).getMinRetentionDays()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LockConfigurationTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupVault.LockConfigurationTypeProperty):
          LockConfigurationTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LockConfigurationTypeProperty):
          software.amazon.awscdk.services.backup.CfnBackupVault.LockConfigurationTypeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
