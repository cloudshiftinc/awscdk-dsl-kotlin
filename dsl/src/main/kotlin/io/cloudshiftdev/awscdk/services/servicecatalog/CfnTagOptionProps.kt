package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnTagOptionProps {
  /**
   * The TagOption active state.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-active)
   */
  public fun active(): Any? = unwrap(this).getActive()

  /**
   * The TagOption key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-key)
   */
  public fun key(): String

  /**
   * The TagOption value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-value)
   */
  public fun `value`(): String

  /**
   * A builder for [CfnTagOptionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param active The TagOption active state.
     */
    public fun active(active: Boolean)

    /**
     * @param active The TagOption active state.
     */
    public fun active(active: IResolvable)

    /**
     * @param key The TagOption key. 
     */
    public fun key(key: String)

    /**
     * @param value The TagOption value. 
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.CfnTagOptionProps.Builder
        = software.amazon.awscdk.services.servicecatalog.CfnTagOptionProps.builder()

    /**
     * @param active The TagOption active state.
     */
    override fun active(active: Boolean) {
      cdkBuilder.active(active)
    }

    /**
     * @param active The TagOption active state.
     */
    override fun active(active: IResolvable) {
      cdkBuilder.active(active.let(IResolvable::unwrap))
    }

    /**
     * @param key The TagOption key. 
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param value The TagOption value. 
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.CfnTagOptionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicecatalog.CfnTagOptionProps,
  ) : CdkObject(cdkObject), CfnTagOptionProps {
    /**
     * The TagOption active state.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-active)
     */
    override fun active(): Any? = unwrap(this).getActive()

    /**
     * The TagOption key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-key)
     */
    override fun key(): String = unwrap(this).getKey()

    /**
     * The TagOption value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-value)
     */
    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTagOptionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CfnTagOptionProps):
        CfnTagOptionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTagOptionProps):
        software.amazon.awscdk.services.servicecatalog.CfnTagOptionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicecatalog.CfnTagOptionProps
  }
}
