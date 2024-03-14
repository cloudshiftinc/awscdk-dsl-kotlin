package io.cloudshiftdev.awscdk

import kotlin.Any
import kotlin.String
import kotlin.collections.List

public interface ICfnConditionExpression : IResolvable {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.ICfnConditionExpression,
  ) : CdkObject(cdkObject), ICfnConditionExpression {
    /**
     * The creation stack of this resolvable which will be appended to errors thrown during
     * resolution.
     *
     * This may return an array with a single informational element indicating how
     * to get this property populated, if it was skipped for performance reasons.
     */
    override fun creationStack(): List<String> = unwrap(this).getCreationStack()

    /**
     * Produce the Token's value at resolution time.
     *
     * @param context 
     */
    override fun resolve(context: IResolveContext): Any =
        unwrap(this).resolve(context.let(IResolveContext::unwrap))

    /**
     * Return a string representation of this resolvable object.
     *
     * Returns a reversible string representation.
     */
    override fun toString(): String = unwrap(this).toString()

    /**
     * The type that this token will likely resolve to.
     */
    override fun typeHint(): ResolutionTypeHint? =
        unwrap(this).getTypeHint()?.let(ResolutionTypeHint::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ICfnConditionExpression):
        ICfnConditionExpression = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICfnConditionExpression):
        software.amazon.awscdk.ICfnConditionExpression = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.ICfnConditionExpression
  }
}
