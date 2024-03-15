@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.Function
import kotlin.String

public abstract class LambdaValidator internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appconfig.LambdaValidator,
) : CdkObject(cdkObject), IValidator {
  public override fun content(): String = unwrap(this).getContent()

  public override fun type(): ValidatorType = unwrap(this).getType().let(ValidatorType::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.LambdaValidator,
  ) : LambdaValidator(cdkObject)

  public companion object {
    public fun fromFunction(func: Function): LambdaValidator =
        software.amazon.awscdk.services.appconfig.LambdaValidator.fromFunction(func.let(Function::unwrap)).let(LambdaValidator::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.LambdaValidator):
        LambdaValidator = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaValidator):
        software.amazon.awscdk.services.appconfig.LambdaValidator = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appconfig.LambdaValidator
  }
}