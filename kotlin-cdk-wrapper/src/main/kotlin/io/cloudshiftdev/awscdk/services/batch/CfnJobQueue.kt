@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Batch::JobQueue` resource specifies the parameters for an AWS Batch job queue
 * definition.
 *
 * For more information, see [Job
 * Queues](https://docs.aws.amazon.com/batch/latest/userguide/job_queues.html) in the ** .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * CfnJobQueue cfnJobQueue = CfnJobQueue.Builder.create(this, "MyCfnJobQueue")
 * .computeEnvironmentOrder(List.of(ComputeEnvironmentOrderProperty.builder()
 * .computeEnvironment("computeEnvironment")
 * .order(123)
 * .build()))
 * .priority(123)
 * // the properties below are optional
 * .jobQueueName("jobQueueName")
 * .schedulingPolicyArn("schedulingPolicyArn")
 * .state("state")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html)
 */
public open class CfnJobQueue(
  cdkObject: software.amazon.awscdk.services.batch.CfnJobQueue,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnJobQueueProps,
  ) :
      this(software.amazon.awscdk.services.batch.CfnJobQueue(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnJobQueueProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnJobQueueProps.Builder.() -> Unit,
  ) : this(scope, id, CfnJobQueueProps(props)
  )

  /**
   * Returns the job queue ARN, such as `batch: *us-east-1* : *111122223333* :job-queue/
   * *JobQueueName*` .
   */
  public open fun attrJobQueueArn(): String = unwrap(this).getAttrJobQueueArn()

  /**
   * The set of compute environments mapped to a job queue and their order relative to each other.
   */
  public open fun computeEnvironmentOrder(): Any = unwrap(this).getComputeEnvironmentOrder()

  /**
   * The set of compute environments mapped to a job queue and their order relative to each other.
   */
  public open fun computeEnvironmentOrder(`value`: IResolvable) {
    unwrap(this).setComputeEnvironmentOrder(`value`.let(IResolvable::unwrap))
  }

  /**
   * The set of compute environments mapped to a job queue and their order relative to each other.
   */
  public open fun computeEnvironmentOrder(`value`: List<Any>) {
    unwrap(this).setComputeEnvironmentOrder(`value`)
  }

  /**
   * The set of compute environments mapped to a job queue and their order relative to each other.
   */
  public open fun computeEnvironmentOrder(vararg `value`: Any): Unit =
      computeEnvironmentOrder(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the job queue.
   */
  public open fun jobQueueName(): String? = unwrap(this).getJobQueueName()

  /**
   * The name of the job queue.
   */
  public open fun jobQueueName(`value`: String) {
    unwrap(this).setJobQueueName(`value`)
  }

  /**
   * The priority of the job queue.
   */
  public open fun priority(): Number = unwrap(this).getPriority()

  /**
   * The priority of the job queue.
   */
  public open fun priority(`value`: Number) {
    unwrap(this).setPriority(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the scheduling policy.
   */
  public open fun schedulingPolicyArn(): String? = unwrap(this).getSchedulingPolicyArn()

  /**
   * The Amazon Resource Name (ARN) of the scheduling policy.
   */
  public open fun schedulingPolicyArn(`value`: String) {
    unwrap(this).setSchedulingPolicyArn(`value`)
  }

  /**
   * The state of the job queue.
   */
  public open fun state(): String? = unwrap(this).getState()

  /**
   * The state of the job queue.
   */
  public open fun state(`value`: String) {
    unwrap(this).setState(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags that are applied to the job queue.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * The tags that are applied to the job queue.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.batch.CfnJobQueue].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The set of compute environments mapped to a job queue and their order relative to each other.
     *
     * The job scheduler uses this parameter to determine which compute environment runs a specific
     * job. Compute environments must be in the `VALID` state before you can associate them with a job
     * queue. You can associate up to three compute environments with a job queue. All of the compute
     * environments must be either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` );
     * EC2 and Fargate compute environments can't be mixed.
     *
     *
     * All compute environments that are associated with a job queue must share the same
     * architecture. AWS Batch doesn't support mixing compute environment architecture types in a
     * single job queue.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-computeenvironmentorder)
     * @param computeEnvironmentOrder The set of compute environments mapped to a job queue and
     * their order relative to each other. 
     */
    public fun computeEnvironmentOrder(computeEnvironmentOrder: IResolvable)

    /**
     * The set of compute environments mapped to a job queue and their order relative to each other.
     *
     * The job scheduler uses this parameter to determine which compute environment runs a specific
     * job. Compute environments must be in the `VALID` state before you can associate them with a job
     * queue. You can associate up to three compute environments with a job queue. All of the compute
     * environments must be either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` );
     * EC2 and Fargate compute environments can't be mixed.
     *
     *
     * All compute environments that are associated with a job queue must share the same
     * architecture. AWS Batch doesn't support mixing compute environment architecture types in a
     * single job queue.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-computeenvironmentorder)
     * @param computeEnvironmentOrder The set of compute environments mapped to a job queue and
     * their order relative to each other. 
     */
    public fun computeEnvironmentOrder(computeEnvironmentOrder: List<Any>)

    /**
     * The set of compute environments mapped to a job queue and their order relative to each other.
     *
     * The job scheduler uses this parameter to determine which compute environment runs a specific
     * job. Compute environments must be in the `VALID` state before you can associate them with a job
     * queue. You can associate up to three compute environments with a job queue. All of the compute
     * environments must be either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` );
     * EC2 and Fargate compute environments can't be mixed.
     *
     *
     * All compute environments that are associated with a job queue must share the same
     * architecture. AWS Batch doesn't support mixing compute environment architecture types in a
     * single job queue.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-computeenvironmentorder)
     * @param computeEnvironmentOrder The set of compute environments mapped to a job queue and
     * their order relative to each other. 
     */
    public fun computeEnvironmentOrder(vararg computeEnvironmentOrder: Any)

    /**
     * The name of the job queue.
     *
     * It can be up to 128 letters long. It can contain uppercase and lowercase letters, numbers,
     * hyphens (-), and underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-jobqueuename)
     * @param jobQueueName The name of the job queue. 
     */
    public fun jobQueueName(jobQueueName: String)

    /**
     * The priority of the job queue.
     *
     * Job queues with a higher priority (or a higher integer value for the `priority` parameter)
     * are evaluated first when associated with the same compute environment. Priority is determined in
     * descending order. For example, a job queue with a priority value of `10` is given scheduling
     * preference over a job queue with a priority value of `1` . All of the compute environments must
     * be either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` ); EC2 and Fargate
     * compute environments can't be mixed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-priority)
     * @param priority The priority of the job queue. 
     */
    public fun priority(priority: Number)

    /**
     * The Amazon Resource Name (ARN) of the scheduling policy.
     *
     * The format is `aws: *Partition* :batch: *Region* : *Account* :scheduling-policy/ *Name*` .
     * For example, `aws:aws:batch:us-west-2:123456789012:scheduling-policy/MySchedulingPolicy` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-schedulingpolicyarn)
     * @param schedulingPolicyArn The Amazon Resource Name (ARN) of the scheduling policy. 
     */
    public fun schedulingPolicyArn(schedulingPolicyArn: String)

    /**
     * The state of the job queue.
     *
     * If the job queue state is `ENABLED` , it is able to accept jobs. If the job queue state is
     * `DISABLED` , new jobs can't be added to the queue, but jobs already in the queue can finish.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-state)
     * @param state The state of the job queue. 
     */
    public fun state(state: String)

    /**
     * The tags that are applied to the job queue.
     *
     * For more information, see [Tagging your AWS Batch
     * resources](https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html) in *AWS Batch
     * User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-tags)
     * @param tags The tags that are applied to the job queue. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.CfnJobQueue.Builder =
        software.amazon.awscdk.services.batch.CfnJobQueue.Builder.create(scope, id)

    /**
     * The set of compute environments mapped to a job queue and their order relative to each other.
     *
     * The job scheduler uses this parameter to determine which compute environment runs a specific
     * job. Compute environments must be in the `VALID` state before you can associate them with a job
     * queue. You can associate up to three compute environments with a job queue. All of the compute
     * environments must be either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` );
     * EC2 and Fargate compute environments can't be mixed.
     *
     *
     * All compute environments that are associated with a job queue must share the same
     * architecture. AWS Batch doesn't support mixing compute environment architecture types in a
     * single job queue.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-computeenvironmentorder)
     * @param computeEnvironmentOrder The set of compute environments mapped to a job queue and
     * their order relative to each other. 
     */
    override fun computeEnvironmentOrder(computeEnvironmentOrder: IResolvable) {
      cdkBuilder.computeEnvironmentOrder(computeEnvironmentOrder.let(IResolvable::unwrap))
    }

    /**
     * The set of compute environments mapped to a job queue and their order relative to each other.
     *
     * The job scheduler uses this parameter to determine which compute environment runs a specific
     * job. Compute environments must be in the `VALID` state before you can associate them with a job
     * queue. You can associate up to three compute environments with a job queue. All of the compute
     * environments must be either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` );
     * EC2 and Fargate compute environments can't be mixed.
     *
     *
     * All compute environments that are associated with a job queue must share the same
     * architecture. AWS Batch doesn't support mixing compute environment architecture types in a
     * single job queue.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-computeenvironmentorder)
     * @param computeEnvironmentOrder The set of compute environments mapped to a job queue and
     * their order relative to each other. 
     */
    override fun computeEnvironmentOrder(computeEnvironmentOrder: List<Any>) {
      cdkBuilder.computeEnvironmentOrder(computeEnvironmentOrder)
    }

    /**
     * The set of compute environments mapped to a job queue and their order relative to each other.
     *
     * The job scheduler uses this parameter to determine which compute environment runs a specific
     * job. Compute environments must be in the `VALID` state before you can associate them with a job
     * queue. You can associate up to three compute environments with a job queue. All of the compute
     * environments must be either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` );
     * EC2 and Fargate compute environments can't be mixed.
     *
     *
     * All compute environments that are associated with a job queue must share the same
     * architecture. AWS Batch doesn't support mixing compute environment architecture types in a
     * single job queue.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-computeenvironmentorder)
     * @param computeEnvironmentOrder The set of compute environments mapped to a job queue and
     * their order relative to each other. 
     */
    override fun computeEnvironmentOrder(vararg computeEnvironmentOrder: Any): Unit =
        computeEnvironmentOrder(computeEnvironmentOrder.toList())

    /**
     * The name of the job queue.
     *
     * It can be up to 128 letters long. It can contain uppercase and lowercase letters, numbers,
     * hyphens (-), and underscores (_).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-jobqueuename)
     * @param jobQueueName The name of the job queue. 
     */
    override fun jobQueueName(jobQueueName: String) {
      cdkBuilder.jobQueueName(jobQueueName)
    }

    /**
     * The priority of the job queue.
     *
     * Job queues with a higher priority (or a higher integer value for the `priority` parameter)
     * are evaluated first when associated with the same compute environment. Priority is determined in
     * descending order. For example, a job queue with a priority value of `10` is given scheduling
     * preference over a job queue with a priority value of `1` . All of the compute environments must
     * be either EC2 ( `EC2` or `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` ); EC2 and Fargate
     * compute environments can't be mixed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-priority)
     * @param priority The priority of the job queue. 
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * The Amazon Resource Name (ARN) of the scheduling policy.
     *
     * The format is `aws: *Partition* :batch: *Region* : *Account* :scheduling-policy/ *Name*` .
     * For example, `aws:aws:batch:us-west-2:123456789012:scheduling-policy/MySchedulingPolicy` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-schedulingpolicyarn)
     * @param schedulingPolicyArn The Amazon Resource Name (ARN) of the scheduling policy. 
     */
    override fun schedulingPolicyArn(schedulingPolicyArn: String) {
      cdkBuilder.schedulingPolicyArn(schedulingPolicyArn)
    }

    /**
     * The state of the job queue.
     *
     * If the job queue state is `ENABLED` , it is able to accept jobs. If the job queue state is
     * `DISABLED` , new jobs can't be added to the queue, but jobs already in the queue can finish.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-state)
     * @param state The state of the job queue. 
     */
    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    /**
     * The tags that are applied to the job queue.
     *
     * For more information, see [Tagging your AWS Batch
     * resources](https://docs.aws.amazon.com/batch/latest/userguide/using-tags.html) in *AWS Batch
     * User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobqueue.html#cfn-batch-jobqueue-tags)
     * @param tags The tags that are applied to the job queue. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.batch.CfnJobQueue = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.batch.CfnJobQueue.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnJobQueue {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnJobQueue(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobQueue): CfnJobQueue =
        CfnJobQueue(cdkObject)

    internal fun unwrap(wrapped: CfnJobQueue): software.amazon.awscdk.services.batch.CfnJobQueue =
        wrapped.cdkObject as software.amazon.awscdk.services.batch.CfnJobQueue
  }

  /**
   * The order that compute environments are tried in for job placement within a queue.
   *
   * Compute environments are tried in ascending order. For example, if two compute environments are
   * associated with a job queue, the compute environment with a lower order integer value is tried for
   * job placement first. Compute environments must be in the `VALID` state before you can associate
   * them with a job queue. All of the compute environments must be either EC2 ( `EC2` or `SPOT` ) or
   * Fargate ( `FARGATE` or `FARGATE_SPOT` ); Amazon EC2 and Fargate compute environments can't be
   * mixed.
   *
   *
   * All compute environments that are associated with a job queue must share the same architecture.
   * AWS Batch doesn't support mixing compute environment architecture types in a single job queue.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.batch.*;
   * ComputeEnvironmentOrderProperty computeEnvironmentOrderProperty =
   * ComputeEnvironmentOrderProperty.builder()
   * .computeEnvironment("computeEnvironment")
   * .order(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html)
   */
  public interface ComputeEnvironmentOrderProperty {
    /**
     * The Amazon Resource Name (ARN) of the compute environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-computeenvironment)
     */
    public fun computeEnvironment(): String

    /**
     * The order of the compute environment.
     *
     * Compute environments are tried in ascending order. For example, if two compute environments
     * are associated with a job queue, the compute environment with a lower `order` integer value is
     * tried for job placement first.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-order)
     */
    public fun order(): Number

    /**
     * A builder for [ComputeEnvironmentOrderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param computeEnvironment The Amazon Resource Name (ARN) of the compute environment. 
       */
      public fun computeEnvironment(computeEnvironment: String)

      /**
       * @param order The order of the compute environment. 
       * Compute environments are tried in ascending order. For example, if two compute environments
       * are associated with a job queue, the compute environment with a lower `order` integer value is
       * tried for job placement first.
       */
      public fun order(order: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty.builder()

      /**
       * @param computeEnvironment The Amazon Resource Name (ARN) of the compute environment. 
       */
      override fun computeEnvironment(computeEnvironment: String) {
        cdkBuilder.computeEnvironment(computeEnvironment)
      }

      /**
       * @param order The order of the compute environment. 
       * Compute environments are tried in ascending order. For example, if two compute environments
       * are associated with a job queue, the compute environment with a lower `order` integer value is
       * tried for job placement first.
       */
      override fun order(order: Number) {
        cdkBuilder.order(order)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty,
    ) : CdkObject(cdkObject), ComputeEnvironmentOrderProperty {
      /**
       * The Amazon Resource Name (ARN) of the compute environment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-computeenvironment)
       */
      override fun computeEnvironment(): String = unwrap(this).getComputeEnvironment()

      /**
       * The order of the compute environment.
       *
       * Compute environments are tried in ascending order. For example, if two compute environments
       * are associated with a job queue, the compute environment with a lower `order` integer value is
       * tried for job placement first.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html#cfn-batch-jobqueue-computeenvironmentorder-order)
       */
      override fun order(): Number = unwrap(this).getOrder()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComputeEnvironmentOrderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty):
          ComputeEnvironmentOrderProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ComputeEnvironmentOrderProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComputeEnvironmentOrderProperty):
          software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.batch.CfnJobQueue.ComputeEnvironmentOrderProperty
    }
  }
}
