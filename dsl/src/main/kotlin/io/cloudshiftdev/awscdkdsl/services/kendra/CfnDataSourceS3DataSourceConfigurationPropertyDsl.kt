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

package io.cloudshiftdev.awscdkdsl.services.kendra

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Provides the configuration information to connect to an Amazon S3 bucket.
 *
 * Amazon Kendra now supports an upgraded Amazon S3 connector.
 *
 * You must now use the
 * [TemplateConfiguration](https://docs.aws.amazon.com/kendra/latest/APIReference/API_TemplateConfiguration.html)
 * object instead of the `S3DataSourceConfiguration` object to configure your connector.
 *
 * Connectors configured using the older console and API architecture will continue to function as
 * configured. However, you won't be able to edit or update them. If you want to edit or update your
 * connector configuration, you must create a new connector.
 *
 * We recommended migrating your connector workflow to the upgraded version. Support for connectors
 * configured using the older architecture is scheduled to end by June 2024.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * S3DataSourceConfigurationProperty s3DataSourceConfigurationProperty =
 * S3DataSourceConfigurationProperty.builder()
 * .bucketName("bucketName")
 * // the properties below are optional
 * .accessControlListConfiguration(AccessControlListConfigurationProperty.builder()
 * .keyPath("keyPath")
 * .build())
 * .documentsMetadataConfiguration(DocumentsMetadataConfigurationProperty.builder()
 * .s3Prefix("s3Prefix")
 * .build())
 * .exclusionPatterns(List.of("exclusionPatterns"))
 * .inclusionPatterns(List.of("inclusionPatterns"))
 * .inclusionPrefixes(List.of("inclusionPrefixes"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-s3datasourceconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceS3DataSourceConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.S3DataSourceConfigurationProperty.Builder =
        CfnDataSource.S3DataSourceConfigurationProperty.builder()

    private val _exclusionPatterns: MutableList<String> = mutableListOf()

    private val _inclusionPatterns: MutableList<String> = mutableListOf()

    private val _inclusionPrefixes: MutableList<String> = mutableListOf()

    /**
     * @param accessControlListConfiguration Provides the path to the S3 bucket that contains the
     *   user context filtering files for the data source. For the format of the file, see
     *   [Access control for S3 data sources](https://docs.aws.amazon.com/kendra/latest/dg/s3-acl.html)
     *   .
     */
    public fun accessControlListConfiguration(accessControlListConfiguration: IResolvable) {
        cdkBuilder.accessControlListConfiguration(accessControlListConfiguration)
    }

    /**
     * @param accessControlListConfiguration Provides the path to the S3 bucket that contains the
     *   user context filtering files for the data source. For the format of the file, see
     *   [Access control for S3 data sources](https://docs.aws.amazon.com/kendra/latest/dg/s3-acl.html)
     *   .
     */
    public fun accessControlListConfiguration(
        accessControlListConfiguration: CfnDataSource.AccessControlListConfigurationProperty
    ) {
        cdkBuilder.accessControlListConfiguration(accessControlListConfiguration)
    }

    /** @param bucketName The name of the bucket that contains the documents. */
    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param documentsMetadataConfiguration Specifies document metadata files that contain
     *   information such as the document access control information, source URI, document author,
     *   and custom attributes. Each metadata file contains metadata about a single document.
     */
    public fun documentsMetadataConfiguration(documentsMetadataConfiguration: IResolvable) {
        cdkBuilder.documentsMetadataConfiguration(documentsMetadataConfiguration)
    }

    /**
     * @param documentsMetadataConfiguration Specifies document metadata files that contain
     *   information such as the document access control information, source URI, document author,
     *   and custom attributes. Each metadata file contains metadata about a single document.
     */
    public fun documentsMetadataConfiguration(
        documentsMetadataConfiguration: CfnDataSource.DocumentsMetadataConfigurationProperty
    ) {
        cdkBuilder.documentsMetadataConfiguration(documentsMetadataConfiguration)
    }

    /**
     * @param exclusionPatterns A list of glob patterns (patterns that can expand a wildcard pattern
     *   into a list of path names that match the given pattern) for certain file names and file
     *   types to exclude from your index. If a document matches both an inclusion and exclusion
     *   prefix or pattern, the exclusion prefix takes precendence and the document is not indexed.
     *   Examples of glob patterns include:
     * * `/myapp/config/ *` - All files inside config directory
     * * `/ ** / *.png` - All .png files in all directories
     * * `/ ** / *.{png,ico,md}` - All .png, .ico or .md files in all directories
     * * `/myapp/src/ ** / *.ts` - All .ts files inside src directory (and all its subdirectories)
     * * `** /!(*.module).ts` - All .ts files but not .module.ts
     * * **.png , *.jpg* excludes all PNG and JPEG image files in a directory (files with the
     *   extensions .png and .jpg).
     * * **internal** excludes all files in a directory that contain 'internal' in the file name,
     *   such as 'internal', 'internal_only', 'company_internal'.
     * * *** / *internal** excludes all internal-related files in a directory and its
     *   subdirectories.
     *
     * For more examples, see
     * [Use of Exclude and Include Filters](https://docs.aws.amazon.com/cli/latest/reference/s3/#use-of-exclude-and-include-filters)
     * in the AWS CLI Command Reference.
     */
    public fun exclusionPatterns(vararg exclusionPatterns: String) {
        _exclusionPatterns.addAll(listOf(*exclusionPatterns))
    }

    /**
     * @param exclusionPatterns A list of glob patterns (patterns that can expand a wildcard pattern
     *   into a list of path names that match the given pattern) for certain file names and file
     *   types to exclude from your index. If a document matches both an inclusion and exclusion
     *   prefix or pattern, the exclusion prefix takes precendence and the document is not indexed.
     *   Examples of glob patterns include:
     * * `/myapp/config/ *` - All files inside config directory
     * * `/ ** / *.png` - All .png files in all directories
     * * `/ ** / *.{png,ico,md}` - All .png, .ico or .md files in all directories
     * * `/myapp/src/ ** / *.ts` - All .ts files inside src directory (and all its subdirectories)
     * * `** /!(*.module).ts` - All .ts files but not .module.ts
     * * **.png , *.jpg* excludes all PNG and JPEG image files in a directory (files with the
     *   extensions .png and .jpg).
     * * **internal** excludes all files in a directory that contain 'internal' in the file name,
     *   such as 'internal', 'internal_only', 'company_internal'.
     * * *** / *internal** excludes all internal-related files in a directory and its
     *   subdirectories.
     *
     * For more examples, see
     * [Use of Exclude and Include Filters](https://docs.aws.amazon.com/cli/latest/reference/s3/#use-of-exclude-and-include-filters)
     * in the AWS CLI Command Reference.
     */
    public fun exclusionPatterns(exclusionPatterns: Collection<String>) {
        _exclusionPatterns.addAll(exclusionPatterns)
    }

    /**
     * @param inclusionPatterns A list of glob patterns (patterns that can expand a wildcard pattern
     *   into a list of path names that match the given pattern) for certain file names and file
     *   types to include in your index. If a document matches both an inclusion and exclusion
     *   prefix or pattern, the exclusion prefix takes precendence and the document is not indexed.
     *   Examples of glob patterns include:
     * * `/myapp/config/ *` - All files inside config directory
     * * `/ ** / *.png` - All .png files in all directories
     * * `/ ** / *.{png,ico,md}` - All .png, .ico or .md files in all directories
     * * `/myapp/src/ ** / *.ts` - All .ts files inside src directory (and all its subdirectories)
     * * `** /!(*.module).ts` - All .ts files but not .module.ts
     * * **.png , *.jpg* includes all PNG and JPEG image files in a directory (files with the
     *   extensions .png and .jpg).
     * * **internal** includes all files in a directory that contain 'internal' in the file name,
     *   such as 'internal', 'internal_only', 'company_internal'.
     * * *** / *internal** includes all internal-related files in a directory and its
     *   subdirectories.
     *
     * For more examples, see
     * [Use of Exclude and Include Filters](https://docs.aws.amazon.com/cli/latest/reference/s3/#use-of-exclude-and-include-filters)
     * in the AWS CLI Command Reference.
     */
    public fun inclusionPatterns(vararg inclusionPatterns: String) {
        _inclusionPatterns.addAll(listOf(*inclusionPatterns))
    }

    /**
     * @param inclusionPatterns A list of glob patterns (patterns that can expand a wildcard pattern
     *   into a list of path names that match the given pattern) for certain file names and file
     *   types to include in your index. If a document matches both an inclusion and exclusion
     *   prefix or pattern, the exclusion prefix takes precendence and the document is not indexed.
     *   Examples of glob patterns include:
     * * `/myapp/config/ *` - All files inside config directory
     * * `/ ** / *.png` - All .png files in all directories
     * * `/ ** / *.{png,ico,md}` - All .png, .ico or .md files in all directories
     * * `/myapp/src/ ** / *.ts` - All .ts files inside src directory (and all its subdirectories)
     * * `** /!(*.module).ts` - All .ts files but not .module.ts
     * * **.png , *.jpg* includes all PNG and JPEG image files in a directory (files with the
     *   extensions .png and .jpg).
     * * **internal** includes all files in a directory that contain 'internal' in the file name,
     *   such as 'internal', 'internal_only', 'company_internal'.
     * * *** / *internal** includes all internal-related files in a directory and its
     *   subdirectories.
     *
     * For more examples, see
     * [Use of Exclude and Include Filters](https://docs.aws.amazon.com/cli/latest/reference/s3/#use-of-exclude-and-include-filters)
     * in the AWS CLI Command Reference.
     */
    public fun inclusionPatterns(inclusionPatterns: Collection<String>) {
        _inclusionPatterns.addAll(inclusionPatterns)
    }

    /**
     * @param inclusionPrefixes A list of S3 prefixes for the documents that should be included in
     *   the index.
     */
    public fun inclusionPrefixes(vararg inclusionPrefixes: String) {
        _inclusionPrefixes.addAll(listOf(*inclusionPrefixes))
    }

    /**
     * @param inclusionPrefixes A list of S3 prefixes for the documents that should be included in
     *   the index.
     */
    public fun inclusionPrefixes(inclusionPrefixes: Collection<String>) {
        _inclusionPrefixes.addAll(inclusionPrefixes)
    }

    public fun build(): CfnDataSource.S3DataSourceConfigurationProperty {
        if (_exclusionPatterns.isNotEmpty()) cdkBuilder.exclusionPatterns(_exclusionPatterns)
        if (_inclusionPatterns.isNotEmpty()) cdkBuilder.inclusionPatterns(_inclusionPatterns)
        if (_inclusionPrefixes.isNotEmpty()) cdkBuilder.inclusionPrefixes(_inclusionPrefixes)
        return cdkBuilder.build()
    }
}
