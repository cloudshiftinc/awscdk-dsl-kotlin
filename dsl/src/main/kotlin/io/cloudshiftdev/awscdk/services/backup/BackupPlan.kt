package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.Resource
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class BackupPlan internal constructor(
  private val cdkObject: software.amazon.awscdk.services.backup.BackupPlan,
) : Resource(cdkObject), IBackupPlan {
  public open fun addRule(rule: BackupPlanRule) {
    unwrap(this).addRule(rule.let(BackupPlanRule::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c354ff819768ecabe537b12fda4ef307f79765659c6aae1dd84f9fff2e13303f")
  public open fun addRule(rule: BackupPlanRule.Builder.() -> Unit): Unit =
      addRule(BackupPlanRule(rule))

  public open fun addSelection(id: String, options: BackupSelectionOptions): BackupSelection =
      unwrap(this).addSelection(id,
      options.let(BackupSelectionOptions::unwrap)).let(BackupSelection::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("761dd5018d2791efcf16aed3c704577639e35f4f46b7e64524b11092bab5b5cf")
  public open fun addSelection(id: String, options: BackupSelectionOptions.Builder.() -> Unit):
      BackupSelection = addSelection(id, BackupSelectionOptions(options))

  public open fun backupPlanArn(): String = unwrap(this).getBackupPlanArn()

  public override fun backupPlanId(): String = unwrap(this).getBackupPlanId()

  public open fun backupVault(): IBackupVault =
      unwrap(this).getBackupVault().let(IBackupVault::wrap)

  public open fun versionId(): String = unwrap(this).getVersionId()

  public interface Builder {
    public fun backupPlanName(backupPlanName: String) {
    }

    public fun backupPlanRules(backupPlanRules: List<BackupPlanRule>) {
    }

    public fun backupVault(backupVault: IBackupVault) {
    }

    public fun windowsVss(windowsVss: Boolean) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.BackupPlan.Builder =
        software.amazon.awscdk.services.backup.BackupPlan.Builder.create(scope, id)

    public override fun backupPlanName(backupPlanName: String) {
      cdkBuilder.backupPlanName(backupPlanName)
    }

    public override fun backupPlanRules(backupPlanRules: List<BackupPlanRule>) {
      cdkBuilder.backupPlanRules(backupPlanRules.map(BackupPlanRule::unwrap))
    }

    public override fun backupVault(backupVault: IBackupVault) {
      cdkBuilder.backupVault(backupVault.let(IBackupVault::unwrap))
    }

    public override fun windowsVss(windowsVss: Boolean) {
      cdkBuilder.windowsVss(windowsVss)
    }

    public fun build(): software.amazon.awscdk.services.backup.BackupPlan = cdkBuilder.build()
  }

  public companion object {
    public open fun daily35DayRetention(scope: CloudshiftdevConstructsConstruct, id: String):
        BackupPlan =
        software.amazon.awscdk.services.backup.BackupPlan.daily35DayRetention(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id).let(BackupPlan::wrap)

    public open fun daily35DayRetention(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      backupVault: IBackupVault,
    ): BackupPlan =
        software.amazon.awscdk.services.backup.BackupPlan.daily35DayRetention(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, backupVault.let(IBackupVault::unwrap)).let(BackupPlan::wrap)

    public open fun dailyMonthly1YearRetention(scope: CloudshiftdevConstructsConstruct, id: String):
        BackupPlan =
        software.amazon.awscdk.services.backup.BackupPlan.dailyMonthly1YearRetention(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id).let(BackupPlan::wrap)

    public open fun dailyMonthly1YearRetention(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      backupVault: IBackupVault,
    ): BackupPlan =
        software.amazon.awscdk.services.backup.BackupPlan.dailyMonthly1YearRetention(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, backupVault.let(IBackupVault::unwrap)).let(BackupPlan::wrap)

    public open fun dailyWeeklyMonthly5YearRetention(scope: CloudshiftdevConstructsConstruct,
        id: String): BackupPlan =
        software.amazon.awscdk.services.backup.BackupPlan.dailyWeeklyMonthly5YearRetention(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id).let(BackupPlan::wrap)

    public open fun dailyWeeklyMonthly5YearRetention(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      backupVault: IBackupVault,
    ): BackupPlan =
        software.amazon.awscdk.services.backup.BackupPlan.dailyWeeklyMonthly5YearRetention(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, backupVault.let(IBackupVault::unwrap)).let(BackupPlan::wrap)

    public open fun dailyWeeklyMonthly7YearRetention(scope: CloudshiftdevConstructsConstruct,
        id: String): BackupPlan =
        software.amazon.awscdk.services.backup.BackupPlan.dailyWeeklyMonthly7YearRetention(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id).let(BackupPlan::wrap)

    public open fun dailyWeeklyMonthly7YearRetention(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      backupVault: IBackupVault,
    ): BackupPlan =
        software.amazon.awscdk.services.backup.BackupPlan.dailyWeeklyMonthly7YearRetention(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, backupVault.let(IBackupVault::unwrap)).let(BackupPlan::wrap)

    public open fun fromBackupPlanId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      backupPlanId: String,
    ): IBackupPlan =
        software.amazon.awscdk.services.backup.BackupPlan.fromBackupPlanId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, backupPlanId).let(IBackupPlan::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): BackupPlan {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return BackupPlan(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.BackupPlan): BackupPlan =
        BackupPlan(cdkObject)

    internal fun unwrap(wrapped: BackupPlan): software.amazon.awscdk.services.backup.BackupPlan =
        wrapped.cdkObject
  }
}
