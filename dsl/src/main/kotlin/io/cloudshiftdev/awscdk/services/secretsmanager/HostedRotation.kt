package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.constructs.Construct
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class HostedRotation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.secretsmanager.HostedRotation,
) : IConnectable {
  public open fun bind(secret: ISecret, scope: Construct):
      CfnRotationSchedule.HostedRotationLambdaProperty =
      unwrap(this).bind(secret.let(ISecret::unwrap),
      scope.let(Construct::unwrap)).let(CfnRotationSchedule.HostedRotationLambdaProperty::wrap)

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public companion object {
    public open fun mariaDbMultiUser(options: MultiUserHostedRotationOptions): HostedRotation =
        software.amazon.awscdk.services.secretsmanager.HostedRotation.mariaDbMultiUser(options.let(MultiUserHostedRotationOptions::unwrap)).let(HostedRotation::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3002ba3c057d780f5f230ee155f1bd8394c3946a82338315e17b4dbb3cab4339")
    public open fun mariaDbMultiUser(options: MultiUserHostedRotationOptions.Builder.() -> Unit):
        HostedRotation = mariaDbMultiUser(MultiUserHostedRotationOptions(options))

    public open fun mariaDbSingleUser(): HostedRotation =
        software.amazon.awscdk.services.secretsmanager.HostedRotation.mariaDbSingleUser().let(HostedRotation::wrap)

    public open fun mariaDbSingleUser(options: SingleUserHostedRotationOptions): HostedRotation =
        software.amazon.awscdk.services.secretsmanager.HostedRotation.mariaDbSingleUser(options.let(SingleUserHostedRotationOptions::unwrap)).let(HostedRotation::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04d8a183dce2a8c3dd0f2be8b9b90f1159712f25114bcf9d9612ffb60a12b59c")
    public open fun mariaDbSingleUser(options: SingleUserHostedRotationOptions.Builder.() -> Unit):
        HostedRotation = mariaDbSingleUser(SingleUserHostedRotationOptions(options))

    public open fun mongoDbMultiUser(options: MultiUserHostedRotationOptions): HostedRotation =
        software.amazon.awscdk.services.secretsmanager.HostedRotation.mongoDbMultiUser(options.let(MultiUserHostedRotationOptions::unwrap)).let(HostedRotation::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9a49a7392bd9a389688f6cfdeaf323315412811e36d0561105cb52fb671b4af")
    public open fun mongoDbMultiUser(options: MultiUserHostedRotationOptions.Builder.() -> Unit):
        HostedRotation = mongoDbMultiUser(MultiUserHostedRotationOptions(options))

    public open fun mongoDbSingleUser(): HostedRotation =
        software.amazon.awscdk.services.secretsmanager.HostedRotation.mongoDbSingleUser().let(HostedRotation::wrap)

    public open fun mongoDbSingleUser(options: SingleUserHostedRotationOptions): HostedRotation =
        software.amazon.awscdk.services.secretsmanager.HostedRotation.mongoDbSingleUser(options.let(SingleUserHostedRotationOptions::unwrap)).let(HostedRotation::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bb1dfab563e0d465e312bfbc98e135642c1dbcece3c4d7f606be5905024dd367")
    public open fun mongoDbSingleUser(options: SingleUserHostedRotationOptions.Builder.() -> Unit):
        HostedRotation = mongoDbSingleUser(SingleUserHostedRotationOptions(options))

    public open fun mysqlMultiUser(options: MultiUserHostedRotationOptions): HostedRotation =
        software.amazon.awscdk.services.secretsmanager.HostedRotation.mysqlMultiUser(options.let(MultiUserHostedRotationOptions::unwrap)).let(HostedRotation::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef08a292dd656ba5750fc7fe44ff294326a00ff79e8df540422c49f4af80bc0f")
    public open fun mysqlMultiUser(options: MultiUserHostedRotationOptions.Builder.() -> Unit):
        HostedRotation = mysqlMultiUser(MultiUserHostedRotationOptions(options))

    public open fun mysqlSingleUser(): HostedRotation =
        software.amazon.awscdk.services.secretsmanager.HostedRotation.mysqlSingleUser().let(HostedRotation::wrap)

    public open fun mysqlSingleUser(options: SingleUserHostedRotationOptions): HostedRotation =
        software.amazon.awscdk.services.secretsmanager.HostedRotation.mysqlSingleUser(options.let(SingleUserHostedRotationOptions::unwrap)).let(HostedRotation::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a15eb47fd23534fbec4975df14df2e611b29b1a3503db18fd0a79f0e2360d24e")
    public open fun mysqlSingleUser(options: SingleUserHostedRotationOptions.Builder.() -> Unit):
        HostedRotation = mysqlSingleUser(SingleUserHostedRotationOptions(options))

    public open fun oracleMultiUser(options: MultiUserHostedRotationOptions): HostedRotation =
        software.amazon.awscdk.services.secretsmanager.HostedRotation.oracleMultiUser(options.let(MultiUserHostedRotationOptions::unwrap)).let(HostedRotation::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4704947991b9982baa6d992986ed5ac5f74307e8c9ce30486f9bbd86895d83a8")
    public open fun oracleMultiUser(options: MultiUserHostedRotationOptions.Builder.() -> Unit):
        HostedRotation = oracleMultiUser(MultiUserHostedRotationOptions(options))

    public open fun oracleSingleUser(): HostedRotation =
        software.amazon.awscdk.services.secretsmanager.HostedRotation.oracleSingleUser().let(HostedRotation::wrap)

    public open fun oracleSingleUser(options: SingleUserHostedRotationOptions): HostedRotation =
        software.amazon.awscdk.services.secretsmanager.HostedRotation.oracleSingleUser(options.let(SingleUserHostedRotationOptions::unwrap)).let(HostedRotation::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("75eb56965428d474dd2d5f927b2632521452a1464ea2fcb7eb5b677082fc2028")
    public open fun oracleSingleUser(options: SingleUserHostedRotationOptions.Builder.() -> Unit):
        HostedRotation = oracleSingleUser(SingleUserHostedRotationOptions(options))

    public open fun postgreSqlMultiUser(options: MultiUserHostedRotationOptions): HostedRotation =
        software.amazon.awscdk.services.secretsmanager.HostedRotation.postgreSqlMultiUser(options.let(MultiUserHostedRotationOptions::unwrap)).let(HostedRotation::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f517065d619120d5df3e2988fd2ff92b3cb464f8be0b14717884d0a6909fcb79")
    public open fun postgreSqlMultiUser(options: MultiUserHostedRotationOptions.Builder.() -> Unit):
        HostedRotation = postgreSqlMultiUser(MultiUserHostedRotationOptions(options))

    public open fun postgreSqlSingleUser(): HostedRotation =
        software.amazon.awscdk.services.secretsmanager.HostedRotation.postgreSqlSingleUser().let(HostedRotation::wrap)

    public open fun postgreSqlSingleUser(options: SingleUserHostedRotationOptions): HostedRotation =
        software.amazon.awscdk.services.secretsmanager.HostedRotation.postgreSqlSingleUser(options.let(SingleUserHostedRotationOptions::unwrap)).let(HostedRotation::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e08095bef618433265b1c58c798eb039c787c8829df4e6b40dfa143c9669ed7")
    public open
        fun postgreSqlSingleUser(options: SingleUserHostedRotationOptions.Builder.() -> Unit):
        HostedRotation = postgreSqlSingleUser(SingleUserHostedRotationOptions(options))

    public open fun redshiftMultiUser(options: MultiUserHostedRotationOptions): HostedRotation =
        software.amazon.awscdk.services.secretsmanager.HostedRotation.redshiftMultiUser(options.let(MultiUserHostedRotationOptions::unwrap)).let(HostedRotation::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cbdaebd7eaaab8b1f40a51568da0b44cffe71c6ab3d887f06aa5ed08f10df911")
    public open fun redshiftMultiUser(options: MultiUserHostedRotationOptions.Builder.() -> Unit):
        HostedRotation = redshiftMultiUser(MultiUserHostedRotationOptions(options))

    public open fun redshiftSingleUser(): HostedRotation =
        software.amazon.awscdk.services.secretsmanager.HostedRotation.redshiftSingleUser().let(HostedRotation::wrap)

    public open fun redshiftSingleUser(options: SingleUserHostedRotationOptions): HostedRotation =
        software.amazon.awscdk.services.secretsmanager.HostedRotation.redshiftSingleUser(options.let(SingleUserHostedRotationOptions::unwrap)).let(HostedRotation::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7b1bcc789190fb568b3b0d5cfff715861922d6104f8d9410634d1f09717f74c")
    public open fun redshiftSingleUser(options: SingleUserHostedRotationOptions.Builder.() -> Unit):
        HostedRotation = redshiftSingleUser(SingleUserHostedRotationOptions(options))

    public open fun sqlServerMultiUser(options: MultiUserHostedRotationOptions): HostedRotation =
        software.amazon.awscdk.services.secretsmanager.HostedRotation.sqlServerMultiUser(options.let(MultiUserHostedRotationOptions::unwrap)).let(HostedRotation::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("261b210863d3408985ea32018b394984055e33da2fa57965344770d233c64506")
    public open fun sqlServerMultiUser(options: MultiUserHostedRotationOptions.Builder.() -> Unit):
        HostedRotation = sqlServerMultiUser(MultiUserHostedRotationOptions(options))

    public open fun sqlServerSingleUser(): HostedRotation =
        software.amazon.awscdk.services.secretsmanager.HostedRotation.sqlServerSingleUser().let(HostedRotation::wrap)

    public open fun sqlServerSingleUser(options: SingleUserHostedRotationOptions): HostedRotation =
        software.amazon.awscdk.services.secretsmanager.HostedRotation.sqlServerSingleUser(options.let(SingleUserHostedRotationOptions::unwrap)).let(HostedRotation::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("81a8e5e6c16790b210ce96b6ffc7ac0dbd56e4d89e6226c0fa0169659d462b7f")
    public open
        fun sqlServerSingleUser(options: SingleUserHostedRotationOptions.Builder.() -> Unit):
        HostedRotation = sqlServerSingleUser(SingleUserHostedRotationOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.HostedRotation):
        HostedRotation = HostedRotation(cdkObject)

    internal fun unwrap(wrapped: HostedRotation):
        software.amazon.awscdk.services.secretsmanager.HostedRotation = wrapped.cdkObject
  }
}
