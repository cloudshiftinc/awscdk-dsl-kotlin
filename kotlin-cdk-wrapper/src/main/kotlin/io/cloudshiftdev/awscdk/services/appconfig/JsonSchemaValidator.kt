@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public abstract class JsonSchemaValidator internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appconfig.JsonSchemaValidator,
) : CdkObject(cdkObject), IValidator {
  public override fun content(): String = unwrap(this).getContent()

  public override fun type(): ValidatorType = unwrap(this).getType().let(ValidatorType::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.JsonSchemaValidator,
  ) : JsonSchemaValidator(cdkObject)

  public companion object {
    public fun fromFile(inputPath: String): JsonSchemaValidator =
        software.amazon.awscdk.services.appconfig.JsonSchemaValidator.fromFile(inputPath).let(JsonSchemaValidator::wrap)

    public fun fromInline(code: String): JsonSchemaValidator =
        software.amazon.awscdk.services.appconfig.JsonSchemaValidator.fromInline(code).let(JsonSchemaValidator::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.JsonSchemaValidator):
        JsonSchemaValidator = Wrapper(cdkObject)

    internal fun unwrap(wrapped: JsonSchemaValidator):
        software.amazon.awscdk.services.appconfig.JsonSchemaValidator = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.JsonSchemaValidator
  }
}