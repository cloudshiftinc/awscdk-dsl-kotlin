package io.cloudshiftdev.awscdk

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public open class ValidationResults internal constructor(
  internal override val cdkObject: software.amazon.awscdk.ValidationResults,
) : CdkObject(cdkObject) {
  /**
   * @param result 
   */
  public open fun collect(result: ValidationResult) {
    unwrap(this).collect(result.let(ValidationResult::unwrap))
  }

  /**
   *
   */
  public open fun errorTreeList(): String = unwrap(this).errorTreeList()

  /**
   *
   */
  public open fun isSuccess(): Boolean = unwrap(this).getIsSuccess()

  /**
   *
   */
  public open fun results(): List<ValidationResult> =
      unwrap(this).getResults().map(ValidationResult::wrap)

  /**
   *
   */
  public open fun results(`value`: List<ValidationResult>) {
    unwrap(this).setResults(`value`.map(ValidationResult::unwrap))
  }

  /**
   *
   */
  public open fun results(vararg `value`: ValidationResult): Unit = results(`value`.toList())

  /**
   * Wrap up all validation results into a single tree node.
   *
   * If there are failures in the collection, add a message, otherwise
   * return a success.
   *
   * @param message 
   */
  public open fun wrap(message: String): ValidationResult =
      unwrap(this).wrap(message).let(ValidationResult::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ValidationResults): ValidationResults =
        ValidationResults(cdkObject)

    internal fun unwrap(wrapped: ValidationResults): software.amazon.awscdk.ValidationResults =
        wrapped.cdkObject
  }
}
