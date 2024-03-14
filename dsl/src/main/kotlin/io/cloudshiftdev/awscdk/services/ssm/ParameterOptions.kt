package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface ParameterOptions {
  /**
   * A regular expression used to validate the parameter value.
   *
   * For example, for String types with values restricted to
   * numbers, you can specify the following: `^\d+$`
   *
   * Default: no validation is performed
   */
  public fun allowedPattern(): String? = unwrap(this).getAllowedPattern()

  /**
   * Information about the parameter that you want to add to the system.
   *
   * Default: none
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the parameter.
   *
   * Default: - a name will be generated by CloudFormation
   */
  public fun parameterName(): String? = unwrap(this).getParameterName()

  /**
   * Indicates if the parameter name is a simple name (i.e. does not include "/" separators).
   *
   * This is required only if `parameterName` is a token, which means we
   * are unable to detect if the name is simple or "path-like" for the purpose
   * of rendering SSM parameter ARNs.
   *
   * If `parameterName` is not specified, `simpleName` must be `true` (or
   * undefined) since the name generated by AWS CloudFormation is always a
   * simple name.
   *
   * Default: - auto-detect based on `parameterName`
   */
  public fun simpleName(): Boolean? = unwrap(this).getSimpleName()

  /**
   * The tier of the string parameter.
   *
   * Default: - undefined
   */
  public fun tier(): ParameterTier? = unwrap(this).getTier()?.let(ParameterTier::wrap)

  /**
   * A builder for [ParameterOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param allowedPattern A regular expression used to validate the parameter value.
     * For example, for String types with values restricted to
     * numbers, you can specify the following: `^\d+$`
     */
    public fun allowedPattern(allowedPattern: String)

    /**
     * @param description Information about the parameter that you want to add to the system.
     */
    public fun description(description: String)

    /**
     * @param parameterName The name of the parameter.
     */
    public fun parameterName(parameterName: String)

    /**
     * @param simpleName Indicates if the parameter name is a simple name (i.e. does not include "/"
     * separators).
     * This is required only if `parameterName` is a token, which means we
     * are unable to detect if the name is simple or "path-like" for the purpose
     * of rendering SSM parameter ARNs.
     *
     * If `parameterName` is not specified, `simpleName` must be `true` (or
     * undefined) since the name generated by AWS CloudFormation is always a
     * simple name.
     */
    public fun simpleName(simpleName: Boolean)

    /**
     * @param tier The tier of the string parameter.
     */
    public fun tier(tier: ParameterTier)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.ParameterOptions.Builder =
        software.amazon.awscdk.services.ssm.ParameterOptions.builder()

    /**
     * @param allowedPattern A regular expression used to validate the parameter value.
     * For example, for String types with values restricted to
     * numbers, you can specify the following: `^\d+$`
     */
    override fun allowedPattern(allowedPattern: String) {
      cdkBuilder.allowedPattern(allowedPattern)
    }

    /**
     * @param description Information about the parameter that you want to add to the system.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param parameterName The name of the parameter.
     */
    override fun parameterName(parameterName: String) {
      cdkBuilder.parameterName(parameterName)
    }

    /**
     * @param simpleName Indicates if the parameter name is a simple name (i.e. does not include "/"
     * separators).
     * This is required only if `parameterName` is a token, which means we
     * are unable to detect if the name is simple or "path-like" for the purpose
     * of rendering SSM parameter ARNs.
     *
     * If `parameterName` is not specified, `simpleName` must be `true` (or
     * undefined) since the name generated by AWS CloudFormation is always a
     * simple name.
     */
    override fun simpleName(simpleName: Boolean) {
      cdkBuilder.simpleName(simpleName)
    }

    /**
     * @param tier The tier of the string parameter.
     */
    override fun tier(tier: ParameterTier) {
      cdkBuilder.tier(tier.let(ParameterTier::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ssm.ParameterOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssm.ParameterOptions,
  ) : CdkObject(cdkObject), ParameterOptions {
    /**
     * A regular expression used to validate the parameter value.
     *
     * For example, for String types with values restricted to
     * numbers, you can specify the following: `^\d+$`
     *
     * Default: no validation is performed
     */
    override fun allowedPattern(): String? = unwrap(this).getAllowedPattern()

    /**
     * Information about the parameter that you want to add to the system.
     *
     * Default: none
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the parameter.
     *
     * Default: - a name will be generated by CloudFormation
     */
    override fun parameterName(): String? = unwrap(this).getParameterName()

    /**
     * Indicates if the parameter name is a simple name (i.e. does not include "/" separators).
     *
     * This is required only if `parameterName` is a token, which means we
     * are unable to detect if the name is simple or "path-like" for the purpose
     * of rendering SSM parameter ARNs.
     *
     * If `parameterName` is not specified, `simpleName` must be `true` (or
     * undefined) since the name generated by AWS CloudFormation is always a
     * simple name.
     *
     * Default: - auto-detect based on `parameterName`
     */
    override fun simpleName(): Boolean? = unwrap(this).getSimpleName()

    /**
     * The tier of the string parameter.
     *
     * Default: - undefined
     */
    override fun tier(): ParameterTier? = unwrap(this).getTier()?.let(ParameterTier::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ParameterOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.ParameterOptions):
        ParameterOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ParameterOptions):
        software.amazon.awscdk.services.ssm.ParameterOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ssm.ParameterOptions
  }
}
