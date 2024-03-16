@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A Lambda destination.
 */
public interface IDestination {
  /**
   * Binds this destination to the Lambda function.
   *
   * @param scope 
   * @param fn 
   * @param options
   */
  public fun bind(scope: Construct, fn: IFunction): DestinationConfig

  /**
   * Binds this destination to the Lambda function.
   *
   * @param scope 
   * @param fn 
   * @param options
   */
  public fun bind(
    scope: Construct,
    fn: IFunction,
    options: DestinationOptions,
  ): DestinationConfig

  /**
   * Binds this destination to the Lambda function.
   *
   * @param scope 
   * @param fn 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2d6ad4acfbba31901bb8135560633af5578e09f84d84123fa0dbea6b67295dd3")
  public fun bind(
    scope: Construct,
    fn: IFunction,
    options: DestinationOptions.Builder.() -> Unit,
  ): DestinationConfig

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.IDestination): IDestination
        = CdkObjectWrappers.wrap(cdkObject) as IDestination

    internal fun unwrap(wrapped: IDestination): software.amazon.awscdk.services.lambda.IDestination
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.lambda.IDestination
  }
}
