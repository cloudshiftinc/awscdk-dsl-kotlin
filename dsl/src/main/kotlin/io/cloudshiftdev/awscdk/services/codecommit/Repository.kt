package io.cloudshiftdev.awscdk.services.codecommit

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRule
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRuleTarget
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleOptions
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleSourceConfig
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Repository internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codecommit.Repository,
) : Resource(cdkObject), IRepository {
  public override fun bindAsNotificationRuleSource(_scope: CloudshiftdevConstructsConstruct):
      NotificationRuleSourceConfig =
      unwrap(this).bindAsNotificationRuleSource(_scope.let(CloudshiftdevConstructsConstruct::unwrap)).let(NotificationRuleSourceConfig::wrap)

  public override fun grant(grantee: IGrantable, actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable::unwrap), actions).let(Grant::wrap)

  public override fun grantPull(grantee: IGrantable): Grant =
      unwrap(this).grantPull(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantPullPush(grantee: IGrantable): Grant =
      unwrap(this).grantPullPush(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  public open fun notifiyOnPullRequestMerged(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifiyOnPullRequestMerged(id,
      target.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

  public open fun notifiyOnPullRequestMerged(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifiyOnPullRequestMerged(id,
      target.let(INotificationRuleTarget::unwrap),
      options.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("44a55935881be0a99d8e7983163dddb567213ff147b8c90981947edb0222ba8b")
  public open fun notifiyOnPullRequestMerged(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifiyOnPullRequestMerged(id, target, NotificationRuleOptions(options))

  public open fun notify(arn: String): Repository = unwrap(this).notify(arn).let(Repository::wrap)

  public open fun notify(arn: String, options: RepositoryTriggerOptions): Repository =
      unwrap(this).notify(arn, options.let(RepositoryTriggerOptions::unwrap)).let(Repository::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc62f8b194108fac3f61dea00eba84a479ae0166b0eb6466b2fa4157d2c36b54")
  public open fun notify(arn: String, options: RepositoryTriggerOptions.Builder.() -> Unit):
      Repository = notify(arn, RepositoryTriggerOptions(options))

  public override fun notifyOn(
    id: String,
    target: INotificationRuleTarget,
    options: RepositoryNotifyOnOptions,
  ): INotificationRule = unwrap(this).notifyOn(id, target.let(INotificationRuleTarget::unwrap),
      options.let(RepositoryNotifyOnOptions::unwrap)).let(INotificationRule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("72b9b2aa038343a1daad316b913d666c238445877a999385cf0a7c7a1320e69c")
  public override fun notifyOn(
    id: String,
    target: INotificationRuleTarget,
    options: RepositoryNotifyOnOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOn(id, target, RepositoryNotifyOnOptions(options))

  public override fun notifyOnApprovalRuleOverridden(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnApprovalRuleOverridden(id,
      target.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

  public override fun notifyOnApprovalRuleOverridden(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnApprovalRuleOverridden(id,
      target.let(INotificationRuleTarget::unwrap),
      options.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("46c7535e578d187135bc2130f0335526eaf9b1454c9eea6ebd990a0df134a92c")
  public override fun notifyOnApprovalRuleOverridden(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnApprovalRuleOverridden(id, target,
      NotificationRuleOptions(options))

  public override fun notifyOnApprovalStatusChanged(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnApprovalStatusChanged(id,
      target.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

  public override fun notifyOnApprovalStatusChanged(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnApprovalStatusChanged(id,
      target.let(INotificationRuleTarget::unwrap),
      options.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0250c078c4d0dccd5a08ea1155be9bc92ce3587ad936c97c1e270454cbf92bc1")
  public override fun notifyOnApprovalStatusChanged(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnApprovalStatusChanged(id, target, NotificationRuleOptions(options))

  public override fun notifyOnBranchOrTagCreated(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnBranchOrTagCreated(id,
      target.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

  public override fun notifyOnBranchOrTagCreated(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnBranchOrTagCreated(id,
      target.let(INotificationRuleTarget::unwrap),
      options.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3e045146770fab4226252820bfc6ddfd30fd0adc4c4336cd6270de40c5c86217")
  public override fun notifyOnBranchOrTagCreated(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnBranchOrTagCreated(id, target, NotificationRuleOptions(options))

  public override fun notifyOnBranchOrTagDeleted(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnBranchOrTagDeleted(id,
      target.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

  public override fun notifyOnBranchOrTagDeleted(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnBranchOrTagDeleted(id,
      target.let(INotificationRuleTarget::unwrap),
      options.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5c9200c2451a1025cfb291a53a04477481fca99d2e6d4673082f934f8929acb6")
  public override fun notifyOnBranchOrTagDeleted(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnBranchOrTagDeleted(id, target, NotificationRuleOptions(options))

  public override fun notifyOnPullRequestComment(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnPullRequestComment(id,
      target.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

  public override fun notifyOnPullRequestComment(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnPullRequestComment(id,
      target.let(INotificationRuleTarget::unwrap),
      options.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9bb2b07f792a875a42ab620542e7afb8ac4ad866bc24093173cdfcb00bfca715")
  public override fun notifyOnPullRequestComment(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnPullRequestComment(id, target, NotificationRuleOptions(options))

  public override fun notifyOnPullRequestCreated(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnPullRequestCreated(id,
      target.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

  public override fun notifyOnPullRequestCreated(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnPullRequestCreated(id,
      target.let(INotificationRuleTarget::unwrap),
      options.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fe51e45ce319a7968ee3c3a4bfe6c390ec6c8c7c12b1811b3e47629283510c35")
  public override fun notifyOnPullRequestCreated(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnPullRequestCreated(id, target, NotificationRuleOptions(options))

  public override fun notifyOnPullRequestMerged(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnPullRequestMerged(id,
      target.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

  public override fun notifyOnPullRequestMerged(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnPullRequestMerged(id,
      target.let(INotificationRuleTarget::unwrap),
      options.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("92b3a812ae669d7aa46f3d074f386774d46d4b3ff15e2ccf88f0bf2066082129")
  public override fun notifyOnPullRequestMerged(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnPullRequestMerged(id, target, NotificationRuleOptions(options))

  public override fun onCommentOnCommit(id: String): Rule =
      unwrap(this).onCommentOnCommit(id).let(Rule::wrap)

  public override fun onCommentOnCommit(id: String, options: OnEventOptions): Rule =
      unwrap(this).onCommentOnCommit(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fc9299001d6ed4dfe2f794175df00b897aca5f16d690ddb09e74a2f5369f803c")
  public override fun onCommentOnCommit(id: String, options: OnEventOptions.Builder.() -> Unit):
      Rule = onCommentOnCommit(id, OnEventOptions(options))

  public override fun onCommentOnPullRequest(id: String): Rule =
      unwrap(this).onCommentOnPullRequest(id).let(Rule::wrap)

  public override fun onCommentOnPullRequest(id: String, options: OnEventOptions): Rule =
      unwrap(this).onCommentOnPullRequest(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("74f4fa682efa8ab5c54c3e71185b1250add0058b150599ebd7b3daec160e0812")
  public override fun onCommentOnPullRequest(id: String,
      options: OnEventOptions.Builder.() -> Unit): Rule = onCommentOnPullRequest(id,
      OnEventOptions(options))

  public override fun onCommit(id: String): Rule = unwrap(this).onCommit(id).let(Rule::wrap)

  public override fun onCommit(id: String, options: OnCommitOptions): Rule =
      unwrap(this).onCommit(id, options.let(OnCommitOptions::unwrap)).let(Rule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("99e2a7e07608bfe036450f873080160e01bb6e158867249d838080fb9c326a6b")
  public override fun onCommit(id: String, options: OnCommitOptions.Builder.() -> Unit): Rule =
      onCommit(id, OnCommitOptions(options))

  public override fun onEvent(id: String): Rule = unwrap(this).onEvent(id).let(Rule::wrap)

  public override fun onEvent(id: String, options: OnEventOptions): Rule = unwrap(this).onEvent(id,
      options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
  public override fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
      onEvent(id, OnEventOptions(options))

  public override fun onPullRequestStateChange(id: String): Rule =
      unwrap(this).onPullRequestStateChange(id).let(Rule::wrap)

  public override fun onPullRequestStateChange(id: String, options: OnEventOptions): Rule =
      unwrap(this).onPullRequestStateChange(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccf05ddc1505b6c27a76cba26597bfadc25d79e62707184a50bdda0613bd142d")
  public override fun onPullRequestStateChange(id: String,
      options: OnEventOptions.Builder.() -> Unit): Rule = onPullRequestStateChange(id,
      OnEventOptions(options))

  public override fun onReferenceCreated(id: String): Rule =
      unwrap(this).onReferenceCreated(id).let(Rule::wrap)

  public override fun onReferenceCreated(id: String, options: OnEventOptions): Rule =
      unwrap(this).onReferenceCreated(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("11446a75b034ae186bc4e1eb7bb8a9dbf76f2500e19295e8f571f514f0358e4d")
  public override fun onReferenceCreated(id: String, options: OnEventOptions.Builder.() -> Unit):
      Rule = onReferenceCreated(id, OnEventOptions(options))

  public override fun onReferenceDeleted(id: String): Rule =
      unwrap(this).onReferenceDeleted(id).let(Rule::wrap)

  public override fun onReferenceDeleted(id: String, options: OnEventOptions): Rule =
      unwrap(this).onReferenceDeleted(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2bdfd909fd78fa26f40663ddfd35633018a14d28fd8cbdc095b859b4269ae5a4")
  public override fun onReferenceDeleted(id: String, options: OnEventOptions.Builder.() -> Unit):
      Rule = onReferenceDeleted(id, OnEventOptions(options))

  public override fun onReferenceUpdated(id: String): Rule =
      unwrap(this).onReferenceUpdated(id).let(Rule::wrap)

  public override fun onReferenceUpdated(id: String, options: OnEventOptions): Rule =
      unwrap(this).onReferenceUpdated(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3bf0d0235cd8985a161fe5e339db14aa6ae7e6ece47ee4528b7360629bbabdab")
  public override fun onReferenceUpdated(id: String, options: OnEventOptions.Builder.() -> Unit):
      Rule = onReferenceUpdated(id, OnEventOptions(options))

  public override fun onStateChange(id: String): Rule =
      unwrap(this).onStateChange(id).let(Rule::wrap)

  public override fun onStateChange(id: String, options: OnEventOptions): Rule =
      unwrap(this).onStateChange(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0c69fabe5fddba46daf5b555fe60da991e1b493c6809b40e0e9a1e19ce52aea1")
  public override fun onStateChange(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
      onStateChange(id, OnEventOptions(options))

  public override fun repositoryArn(): String = unwrap(this).getRepositoryArn()

  public override fun repositoryCloneUrlGrc(): String = unwrap(this).getRepositoryCloneUrlGrc()

  public override fun repositoryCloneUrlHttp(): String = unwrap(this).getRepositoryCloneUrlHttp()

  public override fun repositoryCloneUrlSsh(): String = unwrap(this).getRepositoryCloneUrlSsh()

  public override fun repositoryName(): String = unwrap(this).getRepositoryName()

  public interface Builder {
    public fun code(code: Code) {
    }

    public fun description(description: String) {
    }

    public fun repositoryName(repositoryName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codecommit.Repository.Builder =
        software.amazon.awscdk.services.codecommit.Repository.Builder.create(scope, id)

    public override fun code(code: Code) {
      cdkBuilder.code(code.let(Code::unwrap))
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): software.amazon.awscdk.services.codecommit.Repository = cdkBuilder.build()
  }

  public companion object {
    public open fun fromRepositoryArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      repositoryArn: String,
    ): IRepository =
        software.amazon.awscdk.services.codecommit.Repository.fromRepositoryArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, repositoryArn).let(IRepository::wrap)

    public open fun fromRepositoryName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      repositoryName: String,
    ): IRepository =
        software.amazon.awscdk.services.codecommit.Repository.fromRepositoryName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, repositoryName).let(IRepository::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Repository {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Repository(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.Repository): Repository
        = Repository(cdkObject)

    internal fun unwrap(wrapped: Repository): software.amazon.awscdk.services.codecommit.Repository
        = wrapped.cdkObject
  }
}
