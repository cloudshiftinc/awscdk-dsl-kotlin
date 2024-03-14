package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface RuleScope {
  /**
   * The construct ID to use for the rule.
   */
  public fun id(): String

  /**
   * The SecurityGroup in which a rule should be scoped.
   */
  public fun scope(): ISecurityGroup

  /**
   * A builder for [RuleScope]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param id The construct ID to use for the rule. 
     */
    public fun id(id: String)

    /**
     * @param scope The SecurityGroup in which a rule should be scoped. 
     */
    public fun scope(scope: ISecurityGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.RuleScope.Builder =
        software.amazon.awscdk.services.ec2.RuleScope.builder()

    /**
     * @param id The construct ID to use for the rule. 
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * @param scope The SecurityGroup in which a rule should be scoped. 
     */
    override fun scope(scope: ISecurityGroup) {
      cdkBuilder.scope(scope.let(ISecurityGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.RuleScope = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.RuleScope,
  ) : CdkObject(cdkObject), RuleScope {
    /**
     * The construct ID to use for the rule.
     */
    override fun id(): String = unwrap(this).getId()

    /**
     * The SecurityGroup in which a rule should be scoped.
     */
    override fun scope(): ISecurityGroup = unwrap(this).getScope().let(ISecurityGroup::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RuleScope {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.RuleScope): RuleScope =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RuleScope): software.amazon.awscdk.services.ec2.RuleScope =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.RuleScope
  }
}
