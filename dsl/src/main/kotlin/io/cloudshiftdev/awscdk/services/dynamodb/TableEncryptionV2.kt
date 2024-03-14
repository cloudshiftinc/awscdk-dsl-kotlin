package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.String
import kotlin.collections.Map

public abstract class TableEncryptionV2 internal constructor(
  private val cdkObject: software.amazon.awscdk.services.dynamodb.TableEncryptionV2,
) {
  public open fun replicaKeyArns(): Map<String, String> = unwrap(this).getReplicaKeyArns() ?:
      emptyMap()

  public open fun tableKey(): IKey? = unwrap(this).getTableKey()?.let(IKey::wrap)

  public open fun type(): TableEncryption = unwrap(this).getType().let(TableEncryption::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.dynamodb.TableEncryptionV2,
  ) : TableEncryptionV2(cdkObject)

  public companion object {
    public open fun awsManagedKey(): TableEncryptionV2 =
        software.amazon.awscdk.services.dynamodb.TableEncryptionV2.awsManagedKey().let(TableEncryptionV2::wrap)

    public open fun customerManagedKey(tableKey: IKey): TableEncryptionV2 =
        software.amazon.awscdk.services.dynamodb.TableEncryptionV2.customerManagedKey(tableKey.let(IKey::unwrap)).let(TableEncryptionV2::wrap)

    public open fun customerManagedKey(tableKey: IKey, replicaKeyArns: Map<String, String>):
        TableEncryptionV2 =
        software.amazon.awscdk.services.dynamodb.TableEncryptionV2.customerManagedKey(tableKey.let(IKey::unwrap),
        replicaKeyArns).let(TableEncryptionV2::wrap)

    public open fun dynamoOwnedKey(): TableEncryptionV2 =
        software.amazon.awscdk.services.dynamodb.TableEncryptionV2.dynamoOwnedKey().let(TableEncryptionV2::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.TableEncryptionV2):
        TableEncryptionV2 = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TableEncryptionV2):
        software.amazon.awscdk.services.dynamodb.TableEncryptionV2 = (wrapped as Wrapper).cdkObject
  }
}