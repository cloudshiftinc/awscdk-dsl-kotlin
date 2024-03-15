@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

public open class CsvHeaders internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.CsvHeaders,
) : CdkObject(cdkObject) {
  public open fun headerLocation(): CsvHeaderLocation =
      unwrap(this).getHeaderLocation().let(CsvHeaderLocation::wrap)

  public open fun headers(): List<String> = unwrap(this).getHeaders() ?: emptyList()

  public companion object {
    public fun use(headers: List<String>): CsvHeaders =
        software.amazon.awscdk.services.stepfunctions.CsvHeaders.use(headers).let(CsvHeaders::wrap)

    public fun use(vararg headers: String): CsvHeaders = use(headers.toList())

    public fun useFirstRow(): CsvHeaders =
        software.amazon.awscdk.services.stepfunctions.CsvHeaders.useFirstRow().let(CsvHeaders::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.CsvHeaders):
        CsvHeaders = CsvHeaders(cdkObject)

    internal fun unwrap(wrapped: CsvHeaders):
        software.amazon.awscdk.services.stepfunctions.CsvHeaders = wrapped.cdkObject
  }
}