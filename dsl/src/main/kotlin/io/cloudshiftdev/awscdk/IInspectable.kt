package io.cloudshiftdev.awscdk

public interface IInspectable {
  /**
   * Examines construct.
   *
   * @param inspector * tree inspector to collect and process attributes. 
   */
  public fun inspect(inspector: TreeInspector)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IInspectable,
  ) : CdkObject(cdkObject), IInspectable {
    /**
     * Examines construct.
     *
     * @param inspector * tree inspector to collect and process attributes. 
     */
    override fun inspect(inspector: TreeInspector) {
      unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IInspectable): IInspectable =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IInspectable): software.amazon.awscdk.IInspectable = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.IInspectable
  }
}
