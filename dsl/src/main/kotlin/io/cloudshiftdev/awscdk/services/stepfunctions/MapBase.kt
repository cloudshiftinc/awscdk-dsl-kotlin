package io.cloudshiftdev.awscdk.services.stepfunctions

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.CdkObject
import kotlin.collections.List

public abstract class MapBase internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.MapBase,
) : State(cdkObject), INextable {
  /**
   * Continuable states of this Chainable.
   */
  public override fun endStates(): List<INextable> =
      unwrap(this).getEndStates().map(INextable::wrap)

  /**
   * Continue normal execution with the given state.
   *
   * @param next 
   */
  public override fun next(next: IChainable): Chain =
      unwrap(this).next(next.let(IChainable::unwrap)).let(Chain::wrap)

  /**
   * Return the Amazon States Language object for this state.
   */
  public override fun toStateJson(): ObjectNode = unwrap(this).toStateJson()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.MapBase,
  ) : MapBase(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.MapBase): MapBase =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MapBase): software.amazon.awscdk.services.stepfunctions.MapBase =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.MapBase
  }
}
