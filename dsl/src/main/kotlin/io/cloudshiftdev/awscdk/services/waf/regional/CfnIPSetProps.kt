package io.cloudshiftdev.awscdk.services.waf.regional

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnIPSetProps {
  /**
   * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
   * requests originate from.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-ipsetdescriptors)
   */
  public fun ipSetDescriptors(): Any? = unwrap(this).getIpSetDescriptors()

  /**
   * A friendly name or description of the `IPSet` .
   *
   * You can't change the name of an `IPSet` after you create it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-name)
   */
  public fun name(): String

  /**
   * A builder for [CfnIPSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     * CIDR notation) that web requests originate from.
     */
    public fun ipSetDescriptors(ipSetDescriptors: IResolvable)

    /**
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     * CIDR notation) that web requests originate from.
     */
    public fun ipSetDescriptors(ipSetDescriptors: List<Any>)

    /**
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     * CIDR notation) that web requests originate from.
     */
    public fun ipSetDescriptors(vararg ipSetDescriptors: Any)

    /**
     * @param name A friendly name or description of the `IPSet` . 
     * You can't change the name of an `IPSet` after you create it.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnIPSetProps.Builder =
        software.amazon.awscdk.services.waf.regional.CfnIPSetProps.builder()

    /**
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     * CIDR notation) that web requests originate from.
     */
    override fun ipSetDescriptors(ipSetDescriptors: IResolvable) {
      cdkBuilder.ipSetDescriptors(ipSetDescriptors.let(IResolvable::unwrap))
    }

    /**
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     * CIDR notation) that web requests originate from.
     */
    override fun ipSetDescriptors(ipSetDescriptors: List<Any>) {
      cdkBuilder.ipSetDescriptors(ipSetDescriptors)
    }

    /**
     * @param ipSetDescriptors The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in
     * CIDR notation) that web requests originate from.
     */
    override fun ipSetDescriptors(vararg ipSetDescriptors: Any): Unit =
        ipSetDescriptors(ipSetDescriptors.toList())

    /**
     * @param name A friendly name or description of the `IPSet` . 
     * You can't change the name of an `IPSet` after you create it.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnIPSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.waf.regional.CfnIPSetProps,
  ) : CdkObject(cdkObject), CfnIPSetProps {
    /**
     * The IP address type ( `IPV4` or `IPV6` ) and the IP address range (in CIDR notation) that web
     * requests originate from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-ipsetdescriptors)
     */
    override fun ipSetDescriptors(): Any? = unwrap(this).getIpSetDescriptors()

    /**
     * A friendly name or description of the `IPSet` .
     *
     * You can't change the name of an `IPSet` after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-ipset.html#cfn-wafregional-ipset-name)
     */
    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIPSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnIPSetProps):
        CfnIPSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIPSetProps):
        software.amazon.awscdk.services.waf.regional.CfnIPSetProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.waf.regional.CfnIPSetProps
  }
}
