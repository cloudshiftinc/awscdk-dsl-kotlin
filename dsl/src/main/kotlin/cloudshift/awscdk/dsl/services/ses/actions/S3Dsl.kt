@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.s3.IBucket
import software.amazon.awscdk.services.ses.actions.S3
import software.amazon.awscdk.services.sns.ITopic

/**
 * Saves the received message to an Amazon S3 bucket and, optionally, publishes a notification to
 * Amazon SNS.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.s3.*;
 * import software.amazon.awscdk.services.ses.actions.*;
 * Bucket bucket = new Bucket(this, "Bucket");
 * Topic topic = new Topic(this, "Topic");
 * ReceiptRuleSet.Builder.create(this, "RuleSet")
 * .rules(List.of(ReceiptRuleOptions.builder()
 * .recipients(List.of("hello&#64;aws.com"))
 * .actions(List.of(
 * AddHeader.Builder.create()
 * .name("X-Special-Header")
 * .value("aws")
 * .build(),
 * S3.Builder.create()
 * .bucket(bucket)
 * .objectKeyPrefix("emails/")
 * .topic(topic)
 * .build()))
 * .build(), ReceiptRuleOptions.builder()
 * .recipients(List.of("aws.com"))
 * .actions(List.of(
 * Sns.Builder.create()
 * .topic(topic)
 * .build()))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class S3Dsl {
  private val cdkBuilder: S3.Builder = S3.Builder.create()

  /**
   * The S3 bucket that incoming email will be saved to.
   *
   * @param bucket The S3 bucket that incoming email will be saved to. 
   */
  public fun bucket(bucket: IBucket) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * The master key that SES should use to encrypt your emails before saving them to the S3 bucket.
   *
   * Default: no encryption
   *
   * @param kmsKey The master key that SES should use to encrypt your emails before saving them to
   * the S3 bucket. 
   */
  public fun kmsKey(kmsKey: IKey) {
    cdkBuilder.kmsKey(kmsKey)
  }

  /**
   * The key prefix of the S3 bucket.
   *
   * Default: no prefix
   *
   * @param objectKeyPrefix The key prefix of the S3 bucket. 
   */
  public fun objectKeyPrefix(objectKeyPrefix: String) {
    cdkBuilder.objectKeyPrefix(objectKeyPrefix)
  }

  /**
   * The SNS topic to notify when the S3 action is taken.
   *
   * Default: no notification
   *
   * @param topic The SNS topic to notify when the S3 action is taken. 
   */
  public fun topic(topic: ITopic) {
    cdkBuilder.topic(topic)
  }

  public fun build(): S3 = cdkBuilder.build()
}
