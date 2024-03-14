package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject

public open class AmazonLinux2023Kernel internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.AmazonLinux2023Kernel,
) : CdkObject(cdkObject) {
  public companion object {
    public val CDK_LATEST: AmazonLinux2023Kernel =
        AmazonLinux2023Kernel.wrap(software.amazon.awscdk.services.ec2.AmazonLinux2023Kernel.CDK_LATEST)

    public val DEFAULT: AmazonLinux2023Kernel =
        AmazonLinux2023Kernel.wrap(software.amazon.awscdk.services.ec2.AmazonLinux2023Kernel.DEFAULT)

    public val KERNEL_6_1: AmazonLinux2023Kernel =
        AmazonLinux2023Kernel.wrap(software.amazon.awscdk.services.ec2.AmazonLinux2023Kernel.KERNEL_6_1)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AmazonLinux2023Kernel):
        AmazonLinux2023Kernel = AmazonLinux2023Kernel(cdkObject)

    internal fun unwrap(wrapped: AmazonLinux2023Kernel):
        software.amazon.awscdk.services.ec2.AmazonLinux2023Kernel = wrapped.cdkObject
  }
}
