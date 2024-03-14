package io.cloudshiftdev.awscdk.services.ecr

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IGrantable

public open class AuthorizationToken internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecr.AuthorizationToken,
) : CdkObject(cdkObject) {
  public companion object {
    public fun grantRead(grantee: IGrantable) {
      software.amazon.awscdk.services.ecr.AuthorizationToken.grantRead(grantee.let(IGrantable::unwrap))
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.AuthorizationToken):
        AuthorizationToken = AuthorizationToken(cdkObject)

    internal fun unwrap(wrapped: AuthorizationToken):
        software.amazon.awscdk.services.ecr.AuthorizationToken = wrapped.cdkObject
  }
}
