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

package io.cloudshiftdev.awscdkdsl.services.lex

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lex.CfnBotAlias
import software.amazon.awscdk.services.lex.CfnBotAliasProps

/**
 * Properties for defining a `CfnBotAlias`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lex.*;
 * Object sentimentAnalysisSettings;
 * CfnBotAliasProps cfnBotAliasProps = CfnBotAliasProps.builder()
 * .botAliasName("botAliasName")
 * .botId("botId")
 * // the properties below are optional
 * .botAliasLocaleSettings(List.of(BotAliasLocaleSettingsItemProperty.builder()
 * .botAliasLocaleSetting(BotAliasLocaleSettingsProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .codeHookSpecification(CodeHookSpecificationProperty.builder()
 * .lambdaCodeHook(LambdaCodeHookProperty.builder()
 * .codeHookInterfaceVersion("codeHookInterfaceVersion")
 * .lambdaArn("lambdaArn")
 * .build())
 * .build())
 * .build())
 * .localeId("localeId")
 * .build()))
 * .botAliasTags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .botVersion("botVersion")
 * .conversationLogSettings(ConversationLogSettingsProperty.builder()
 * .audioLogSettings(List.of(AudioLogSettingProperty.builder()
 * .destination(AudioLogDestinationProperty.builder()
 * .s3Bucket(S3BucketLogDestinationProperty.builder()
 * .logPrefix("logPrefix")
 * .s3BucketArn("s3BucketArn")
 * // the properties below are optional
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .build())
 * .enabled(false)
 * .build()))
 * .textLogSettings(List.of(TextLogSettingProperty.builder()
 * .destination(TextLogDestinationProperty.builder()
 * .cloudWatch(CloudWatchLogGroupLogDestinationProperty.builder()
 * .cloudWatchLogGroupArn("cloudWatchLogGroupArn")
 * .logPrefix("logPrefix")
 * .build())
 * .build())
 * .enabled(false)
 * .build()))
 * .build())
 * .description("description")
 * .sentimentAnalysisSettings(sentimentAnalysisSettings)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lex-botalias.html)
 */
@CdkDslMarker
public class CfnBotAliasPropsDsl {
    private val cdkBuilder: CfnBotAliasProps.Builder = CfnBotAliasProps.builder()

    private val _botAliasLocaleSettings: MutableList<Any> = mutableListOf()

    private val _botAliasTags: MutableList<Any> = mutableListOf()

    /**
     * @param botAliasLocaleSettings Specifies settings that are unique to a locale. For example,
     *   you can use different Lambda function depending on the bot's locale.
     */
    public fun botAliasLocaleSettings(vararg botAliasLocaleSettings: Any) {
        _botAliasLocaleSettings.addAll(listOf(*botAliasLocaleSettings))
    }

    /**
     * @param botAliasLocaleSettings Specifies settings that are unique to a locale. For example,
     *   you can use different Lambda function depending on the bot's locale.
     */
    public fun botAliasLocaleSettings(botAliasLocaleSettings: Collection<Any>) {
        _botAliasLocaleSettings.addAll(botAliasLocaleSettings)
    }

    /**
     * @param botAliasLocaleSettings Specifies settings that are unique to a locale. For example,
     *   you can use different Lambda function depending on the bot's locale.
     */
    public fun botAliasLocaleSettings(botAliasLocaleSettings: IResolvable) {
        cdkBuilder.botAliasLocaleSettings(botAliasLocaleSettings)
    }

    /** @param botAliasName The name of the bot alias. */
    public fun botAliasName(botAliasName: String) {
        cdkBuilder.botAliasName(botAliasName)
    }

    /**
     * @param botAliasTags An array of key-value pairs to apply to this resource. You can only add
     *   tags when you specify an alias.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun botAliasTags(vararg botAliasTags: Any) {
        _botAliasTags.addAll(listOf(*botAliasTags))
    }

    /**
     * @param botAliasTags An array of key-value pairs to apply to this resource. You can only add
     *   tags when you specify an alias.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun botAliasTags(botAliasTags: Collection<Any>) {
        _botAliasTags.addAll(botAliasTags)
    }

    /**
     * @param botAliasTags An array of key-value pairs to apply to this resource. You can only add
     *   tags when you specify an alias.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun botAliasTags(botAliasTags: IResolvable) {
        cdkBuilder.botAliasTags(botAliasTags)
    }

    /** @param botId The unique identifier of the bot. */
    public fun botId(botId: String) {
        cdkBuilder.botId(botId)
    }

    /** @param botVersion The version of the bot that the bot alias references. */
    public fun botVersion(botVersion: String) {
        cdkBuilder.botVersion(botVersion)
    }

    /**
     * @param conversationLogSettings Specifies whether Amazon Lex logs text and audio for
     *   conversations with the bot. When you enable conversation logs, text logs store text input,
     *   transcripts of audio input, and associated metadata in Amazon CloudWatch logs. Audio logs
     *   store input in Amazon S3 .
     */
    public fun conversationLogSettings(conversationLogSettings: IResolvable) {
        cdkBuilder.conversationLogSettings(conversationLogSettings)
    }

    /**
     * @param conversationLogSettings Specifies whether Amazon Lex logs text and audio for
     *   conversations with the bot. When you enable conversation logs, text logs store text input,
     *   transcripts of audio input, and associated metadata in Amazon CloudWatch logs. Audio logs
     *   store input in Amazon S3 .
     */
    public fun conversationLogSettings(
        conversationLogSettings: CfnBotAlias.ConversationLogSettingsProperty
    ) {
        cdkBuilder.conversationLogSettings(conversationLogSettings)
    }

    /** @param description The description of the bot alias. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param sentimentAnalysisSettings Determines whether Amazon Lex will use Amazon Comprehend to
     *   detect the sentiment of user utterances.
     */
    public fun sentimentAnalysisSettings(sentimentAnalysisSettings: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(sentimentAnalysisSettings)
        cdkBuilder.sentimentAnalysisSettings(builder.map)
    }

    /**
     * @param sentimentAnalysisSettings Determines whether Amazon Lex will use Amazon Comprehend to
     *   detect the sentiment of user utterances.
     */
    public fun sentimentAnalysisSettings(sentimentAnalysisSettings: Any) {
        cdkBuilder.sentimentAnalysisSettings(sentimentAnalysisSettings)
    }

    public fun build(): CfnBotAliasProps {
        if (_botAliasLocaleSettings.isNotEmpty())
            cdkBuilder.botAliasLocaleSettings(_botAliasLocaleSettings)
        if (_botAliasTags.isNotEmpty()) cdkBuilder.botAliasTags(_botAliasTags)
        return cdkBuilder.build()
    }
}
