@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.ssm

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssm.CfnAssociation
import software.amazon.awscdk.services.ssm.CfnAssociationProps

/**
 * Properties for defining a `CfnAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssm.*;
 * Object parameters;
 * CfnAssociationProps cfnAssociationProps = CfnAssociationProps.builder()
 * .name("name")
 * // the properties below are optional
 * .applyOnlyAtCronInterval(false)
 * .associationName("associationName")
 * .automationTargetParameterName("automationTargetParameterName")
 * .calendarNames(List.of("calendarNames"))
 * .complianceSeverity("complianceSeverity")
 * .documentVersion("documentVersion")
 * .instanceId("instanceId")
 * .maxConcurrency("maxConcurrency")
 * .maxErrors("maxErrors")
 * .outputLocation(InstanceAssociationOutputLocationProperty.builder()
 * .s3Location(S3OutputLocationProperty.builder()
 * .outputS3BucketName("outputS3BucketName")
 * .outputS3KeyPrefix("outputS3KeyPrefix")
 * .outputS3Region("outputS3Region")
 * .build())
 * .build())
 * .parameters(parameters)
 * .scheduleExpression("scheduleExpression")
 * .scheduleOffset(123)
 * .syncCompliance("syncCompliance")
 * .targets(List.of(TargetProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build()))
 * .waitForSuccessTimeoutSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-association.html)
 */
@CdkDslMarker
public class CfnAssociationPropsDsl {
    private val cdkBuilder: CfnAssociationProps.Builder = CfnAssociationProps.builder()

    private val _calendarNames: MutableList<String> = mutableListOf()

    private val _targets: MutableList<Any> = mutableListOf()

    /**
     * @param applyOnlyAtCronInterval By default, when you create a new association, the system runs
     *   it immediately after it is created and then according to the schedule you specified.
     *   Specify this option if you don't want an association to run immediately after you create
     *   it. This parameter is not supported for rate expressions.
     */
    public fun applyOnlyAtCronInterval(applyOnlyAtCronInterval: Boolean) {
        cdkBuilder.applyOnlyAtCronInterval(applyOnlyAtCronInterval)
    }

    /**
     * @param applyOnlyAtCronInterval By default, when you create a new association, the system runs
     *   it immediately after it is created and then according to the schedule you specified.
     *   Specify this option if you don't want an association to run immediately after you create
     *   it. This parameter is not supported for rate expressions.
     */
    public fun applyOnlyAtCronInterval(applyOnlyAtCronInterval: IResolvable) {
        cdkBuilder.applyOnlyAtCronInterval(applyOnlyAtCronInterval)
    }

    /** @param associationName Specify a descriptive name for the association. */
    public fun associationName(associationName: String) {
        cdkBuilder.associationName(associationName)
    }

    /**
     * @param automationTargetParameterName Choose the parameter that will define how your
     *   automation will branch out. This target is required for associations that use an Automation
     *   runbook and target resources by using rate controls. Automation is a capability of AWS
     *   Systems Manager .
     */
    public fun automationTargetParameterName(automationTargetParameterName: String) {
        cdkBuilder.automationTargetParameterName(automationTargetParameterName)
    }

    /**
     * @param calendarNames The names or Amazon Resource Names (ARNs) of the Change Calendar type
     *   documents your associations are gated under. The associations only run when that Change
     *   Calendar is open. For more information, see
     *   [AWS Systems Manager Change Calendar](https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-change-calendar)
     *   .
     */
    public fun calendarNames(vararg calendarNames: String) {
        _calendarNames.addAll(listOf(*calendarNames))
    }

    /**
     * @param calendarNames The names or Amazon Resource Names (ARNs) of the Change Calendar type
     *   documents your associations are gated under. The associations only run when that Change
     *   Calendar is open. For more information, see
     *   [AWS Systems Manager Change Calendar](https://docs.aws.amazon.com/systems-manager/latest/userguide/systems-manager-change-calendar)
     *   .
     */
    public fun calendarNames(calendarNames: Collection<String>) {
        _calendarNames.addAll(calendarNames)
    }

    /** @param complianceSeverity The severity level that is assigned to the association. */
    public fun complianceSeverity(complianceSeverity: String) {
        cdkBuilder.complianceSeverity(complianceSeverity)
    }

    /**
     * @param documentVersion The version of the SSM document to associate with the target.
     *
     * Note the following important information.
     * * State Manager doesn't support running associations that use a new version of a document if
     *   that document is shared from another account. State Manager always runs the `default`
     *   version of a document if shared from another account, even though the Systems Manager
     *   console shows that a new version was processed. If you want to run an association using a
     *   new version of a document shared form another account, you must set the document version to
     *   `default` .
     * * `DocumentVersion` is not valid for documents owned by AWS , such as `AWS-RunPatchBaseline`
     *   or `AWS-UpdateSSMAgent` . If you specify `DocumentVersion` for an AWS document, the system
     *   returns the following error: "Error occurred during operation 'CreateAssociation'."
     *   (RequestToken: <token>, HandlerErrorCode: GeneralServiceException).
     */
    public fun documentVersion(documentVersion: String) {
        cdkBuilder.documentVersion(documentVersion)
    }

    /**
     * @param instanceId The ID of the instance that the SSM document is associated with. You must
     *   specify the `InstanceId` or `Targets` property.
     *
     * `InstanceId` has been deprecated. To specify an instance ID for an association, use the
     * `Targets` parameter. If you use the parameter `InstanceId` , you cannot use the parameters
     * `AssociationName` , `DocumentVersion` , `MaxErrors` , `MaxConcurrency` , `OutputLocation` ,
     * or `ScheduleExpression` . To use these parameters, you must use the `Targets` parameter.
     */
    public fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
    }

    /**
     * @param maxConcurrency The maximum number of targets allowed to run the association at the
     *   same time. You can specify a number, for example 10, or a percentage of the target set, for
     *   example 10%. The default value is 100%, which means all targets run the association at the
     *   same time.
     *
     * If a new managed node starts and attempts to run an association while Systems Manager is
     * running `MaxConcurrency` associations, the association is allowed to run. During the next
     * association interval, the new managed node will process its association within the limit
     * specified for `MaxConcurrency` .
     */
    public fun maxConcurrency(maxConcurrency: String) {
        cdkBuilder.maxConcurrency(maxConcurrency)
    }

    /**
     * @param maxErrors The number of errors that are allowed before the system stops sending
     *   requests to run the association on additional targets. You can specify either an absolute
     *   number of errors, for example 10, or a percentage of the target set, for example 10%. If
     *   you specify 3, for example, the system stops sending requests when the fourth error is
     *   received. If you specify 0, then the system stops sending requests after the first error is
     *   returned. If you run an association on 50 managed nodes and set `MaxError` to 10%, then the
     *   system stops sending the request when the sixth error is received.
     *
     * Executions that are already running an association when `MaxErrors` is reached are allowed to
     * complete, but some of these executions may fail as well. If you need to ensure that there
     * won't be more than max-errors failed executions, set `MaxConcurrency` to 1 so that executions
     * proceed one at a time.
     */
    public fun maxErrors(maxErrors: String) {
        cdkBuilder.maxErrors(maxErrors)
    }

    /**
     * @param name The name of the SSM document that contains the configuration information for the
     *   instance. You can specify `Command` or `Automation` documents. The documents can be AWS
     *   -predefined documents, documents you created, or a document that is shared with you from
     *   another account. For SSM documents that are shared with you from other AWS accounts , you
     *   must specify the complete SSM document ARN, in the following format:
     *
     * `arn:partition:ssm:region:account-id:document/document-name`
     *
     * For example: `arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document`
     *
     * For AWS -predefined documents and SSM documents you created in your account, you only need to
     * specify the document name. For example, `AWS -ApplyPatchBaseline` or `My-Document` .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param outputLocation An Amazon Simple Storage Service (Amazon S3) bucket where you want to
     *   store the output details of the request.
     */
    public fun outputLocation(outputLocation: IResolvable) {
        cdkBuilder.outputLocation(outputLocation)
    }

    /**
     * @param outputLocation An Amazon Simple Storage Service (Amazon S3) bucket where you want to
     *   store the output details of the request.
     */
    public fun outputLocation(
        outputLocation: CfnAssociation.InstanceAssociationOutputLocationProperty
    ) {
        cdkBuilder.outputLocation(outputLocation)
    }

    /** @param parameters The parameters for the runtime configuration of the document. */
    public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parameters)
        cdkBuilder.parameters(builder.map)
    }

    /** @param parameters The parameters for the runtime configuration of the document. */
    public fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
    }

    /**
     * @param scheduleExpression A cron expression that specifies a schedule when the association
     *   runs. The schedule runs in Coordinated Universal Time (UTC).
     */
    public fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
    }

    /**
     * @param scheduleOffset Number of days to wait after the scheduled day to run an association.
     */
    public fun scheduleOffset(scheduleOffset: Number) {
        cdkBuilder.scheduleOffset(scheduleOffset)
    }

    /**
     * @param syncCompliance The mode for generating association compliance. You can specify `AUTO`
     *   or `MANUAL` . In `AUTO` mode, the system uses the status of the association execution to
     *   determine the compliance status. If the association execution runs successfully, then the
     *   association is `COMPLIANT` . If the association execution doesn't run successfully, the
     *   association is `NON-COMPLIANT` .
     *
     * In `MANUAL` mode, you must specify the `AssociationId` as a parameter for the
     * PutComplianceItems API action. In this case, compliance data is not managed by State Manager.
     * It is managed by your direct call to the PutComplianceItems API action.
     *
     * By default, all associations use `AUTO` mode.
     */
    public fun syncCompliance(syncCompliance: String) {
        cdkBuilder.syncCompliance(syncCompliance)
    }

    /**
     * @param targets The targets for the association. You must specify the `InstanceId` or
     *   `Targets` property. You can target all instances in an AWS account by specifying the
     *   `InstanceIds` key with a value of `*` . To view a JSON and a YAML example that targets all
     *   instances, see "Create an association for all managed instances in an AWS account " on the
     *   Examples page.
     */
    public fun targets(vararg targets: Any) {
        _targets.addAll(listOf(*targets))
    }

    /**
     * @param targets The targets for the association. You must specify the `InstanceId` or
     *   `Targets` property. You can target all instances in an AWS account by specifying the
     *   `InstanceIds` key with a value of `*` . To view a JSON and a YAML example that targets all
     *   instances, see "Create an association for all managed instances in an AWS account " on the
     *   Examples page.
     */
    public fun targets(targets: Collection<Any>) {
        _targets.addAll(targets)
    }

    /**
     * @param targets The targets for the association. You must specify the `InstanceId` or
     *   `Targets` property. You can target all instances in an AWS account by specifying the
     *   `InstanceIds` key with a value of `*` . To view a JSON and a YAML example that targets all
     *   instances, see "Create an association for all managed instances in an AWS account " on the
     *   Examples page.
     */
    public fun targets(targets: IResolvable) {
        cdkBuilder.targets(targets)
    }

    /**
     * @param waitForSuccessTimeoutSeconds The number of seconds the service should wait for the
     *   association status to show "Success" before proceeding with the stack execution. If the
     *   association status doesn't show "Success" after the specified number of seconds, then stack
     *   creation fails.
     */
    public fun waitForSuccessTimeoutSeconds(waitForSuccessTimeoutSeconds: Number) {
        cdkBuilder.waitForSuccessTimeoutSeconds(waitForSuccessTimeoutSeconds)
    }

    public fun build(): CfnAssociationProps {
        if (_calendarNames.isNotEmpty()) cdkBuilder.calendarNames(_calendarNames)
        if (_targets.isNotEmpty()) cdkBuilder.targets(_targets)
        return cdkBuilder.build()
    }
}
