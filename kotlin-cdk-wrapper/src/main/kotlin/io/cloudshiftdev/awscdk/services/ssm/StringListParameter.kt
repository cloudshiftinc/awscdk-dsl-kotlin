@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new StringList SSM Parameter.
 *
 * Example:
 *
 * ```
 * StringListParameter.valueForTypedListParameter(this, "/My/Public/Parameter",
 * ParameterValueType.AWS_EC2_IMAGE_ID);
 * ```
 */
public open class StringListParameter(
  cdkObject: software.amazon.awscdk.services.ssm.StringListParameter,
) : Resource(cdkObject), IStringListParameter, IParameter {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: StringListParameterProps,
  ) :
      this(software.amazon.awscdk.services.ssm.StringListParameter(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(StringListParameterProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: StringListParameterProps.Builder.() -> Unit,
  ) : this(scope, id, StringListParameterProps(props)
  )

  /**
   * The encryption key that is used to encrypt this parameter.
   *
   * Default: - default master key
   */
  public open fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * Grants read (DescribeParameter, GetParameters, GetParameter, GetParameterHistory) permissions
   * on the SSM Parameter.
   *
   * @param grantee 
   */
  public override fun grantRead(grantee: IGrantable): Grant =
      unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grants write (PutParameter) permissions on the SSM Parameter.
   *
   * @param grantee 
   */
  public override fun grantWrite(grantee: IGrantable): Grant =
      unwrap(this).grantWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * The ARN of the SSM Parameter resource.
   */
  public override fun parameterArn(): String = unwrap(this).getParameterArn()

  /**
   * The name of the SSM Parameter resource.
   */
  public override fun parameterName(): String = unwrap(this).getParameterName()

  /**
   * The type of the SSM Parameter resource.
   */
  public override fun parameterType(): String = unwrap(this).getParameterType()

  /**
   * The parameter value.
   *
   * Value must not nest another parameter. Do not use {{}} in the value. Values in the array
   * cannot contain commas (`,`).
   */
  public override fun stringListValue(): List<String> = unwrap(this).getStringListValue()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ssm.StringListParameter].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A regular expression used to validate the parameter value.
     *
     * For example, for String types with values restricted to
     * numbers, you can specify the following: `^\d+$`
     *
     * Default: no validation is performed
     *
     * @param allowedPattern A regular expression used to validate the parameter value. 
     */
    public fun allowedPattern(allowedPattern: String)

    /**
     * Information about the parameter that you want to add to the system.
     *
     * Default: none
     *
     * @param description Information about the parameter that you want to add to the system. 
     */
    public fun description(description: String)

    /**
     * The name of the parameter.
     *
     * Default: - a name will be generated by CloudFormation
     *
     * @param parameterName The name of the parameter. 
     */
    public fun parameterName(parameterName: String)

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
     *
     * @param simpleName Indicates if the parameter name is a simple name (i.e. does not include "/"
     * separators). 
     */
    public fun simpleName(simpleName: Boolean)

    /**
     * The values of the parameter.
     *
     * It may not reference another parameter and `{{}}` cannot be used in the value.
     *
     * @param stringListValue The values of the parameter. 
     */
    public fun stringListValue(stringListValue: List<String>)

    /**
     * The values of the parameter.
     *
     * It may not reference another parameter and `{{}}` cannot be used in the value.
     *
     * @param stringListValue The values of the parameter. 
     */
    public fun stringListValue(vararg stringListValue: String)

    /**
     * The tier of the string parameter.
     *
     * Default: - undefined
     *
     * @param tier The tier of the string parameter. 
     */
    public fun tier(tier: ParameterTier)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.StringListParameter.Builder =
        software.amazon.awscdk.services.ssm.StringListParameter.Builder.create(scope, id)

    /**
     * A regular expression used to validate the parameter value.
     *
     * For example, for String types with values restricted to
     * numbers, you can specify the following: `^\d+$`
     *
     * Default: no validation is performed
     *
     * @param allowedPattern A regular expression used to validate the parameter value. 
     */
    override fun allowedPattern(allowedPattern: String) {
      cdkBuilder.allowedPattern(allowedPattern)
    }

    /**
     * Information about the parameter that you want to add to the system.
     *
     * Default: none
     *
     * @param description Information about the parameter that you want to add to the system. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the parameter.
     *
     * Default: - a name will be generated by CloudFormation
     *
     * @param parameterName The name of the parameter. 
     */
    override fun parameterName(parameterName: String) {
      cdkBuilder.parameterName(parameterName)
    }

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
     *
     * @param simpleName Indicates if the parameter name is a simple name (i.e. does not include "/"
     * separators). 
     */
    override fun simpleName(simpleName: Boolean) {
      cdkBuilder.simpleName(simpleName)
    }

    /**
     * The values of the parameter.
     *
     * It may not reference another parameter and `{{}}` cannot be used in the value.
     *
     * @param stringListValue The values of the parameter. 
     */
    override fun stringListValue(stringListValue: List<String>) {
      cdkBuilder.stringListValue(stringListValue)
    }

    /**
     * The values of the parameter.
     *
     * It may not reference another parameter and `{{}}` cannot be used in the value.
     *
     * @param stringListValue The values of the parameter. 
     */
    override fun stringListValue(vararg stringListValue: String): Unit =
        stringListValue(stringListValue.toList())

    /**
     * The tier of the string parameter.
     *
     * Default: - undefined
     *
     * @param tier The tier of the string parameter. 
     */
    override fun tier(tier: ParameterTier) {
      cdkBuilder.tier(tier.let(ParameterTier::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ssm.StringListParameter = cdkBuilder.build()
  }

  public companion object {
    public fun fromListParameterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ListParameterAttributes,
    ): IStringListParameter =
        software.amazon.awscdk.services.ssm.StringListParameter.fromListParameterAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(ListParameterAttributes::unwrap)).let(IStringListParameter::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc836518e1f7fbb91648bb3769bf2dea12bec5f330ace7c70ee50a8a23d820f6")
    public fun fromListParameterAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ListParameterAttributes.Builder.() -> Unit,
    ): IStringListParameter = fromListParameterAttributes(scope, id, ListParameterAttributes(attrs))

    public fun fromStringListParameterName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      stringListParameterName: String,
    ): IStringListParameter =
        software.amazon.awscdk.services.ssm.StringListParameter.fromStringListParameterName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, stringListParameterName).let(IStringListParameter::wrap)

    public fun valueForTypedListParameter(scope: CloudshiftdevConstructsConstruct,
        parameterName: String): List<String> =
        software.amazon.awscdk.services.ssm.StringListParameter.valueForTypedListParameter(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        parameterName)

    public fun valueForTypedListParameter(
      scope: CloudshiftdevConstructsConstruct,
      parameterName: String,
      type: ParameterValueType,
    ): List<String> =
        software.amazon.awscdk.services.ssm.StringListParameter.valueForTypedListParameter(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        parameterName, type.let(ParameterValueType::unwrap))

    public fun valueForTypedListParameter(
      scope: CloudshiftdevConstructsConstruct,
      parameterName: String,
      type: ParameterValueType,
      version: Number,
    ): List<String> =
        software.amazon.awscdk.services.ssm.StringListParameter.valueForTypedListParameter(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        parameterName, type.let(ParameterValueType::unwrap), version)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): StringListParameter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return StringListParameter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.StringListParameter):
        StringListParameter = StringListParameter(cdkObject)

    internal fun unwrap(wrapped: StringListParameter):
        software.amazon.awscdk.services.ssm.StringListParameter = wrapped.cdkObject as
        software.amazon.awscdk.services.ssm.StringListParameter
  }
}
