package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class DockerImage internal constructor(
  private val cdkObject: software.amazon.awscdk.DockerImage,
) {
  public open fun cp(imagePath: String): String = unwrap(this).cp(imagePath)

  public open fun cp(imagePath: String, outputPath: String): String = unwrap(this).cp(imagePath,
      outputPath)

  public open fun image(): String = unwrap(this).getImage()

  public open fun run() {
    unwrap(this).run()
  }

  public open fun run(options: DockerRunOptions) {
    unwrap(this).run(options.let(DockerRunOptions::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9137d0a62ac33b4ff6263285d372ca2e4172964b9f7855d0be63ff4bea62e9a3")
  public open fun run(options: DockerRunOptions.Builder.() -> Unit): Unit =
      run(DockerRunOptions(options))

  public open fun toJson(): String = unwrap(this).toJSON()

  public companion object {
    public open fun fromBuild(path: String): DockerImage =
        software.amazon.awscdk.DockerImage.fromBuild(path).let(DockerImage::wrap)

    public open fun fromBuild(path: String, options: DockerBuildOptions): DockerImage =
        software.amazon.awscdk.DockerImage.fromBuild(path,
        options.let(DockerBuildOptions::unwrap)).let(DockerImage::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fa809b479d7fa4f75675888e725dc7bc71e72b027ae5adeca331083178755c4")
    public open fun fromBuild(path: String, options: DockerBuildOptions.Builder.() -> Unit):
        DockerImage = fromBuild(path, DockerBuildOptions(options))

    public open fun fromRegistry(image: String): DockerImage =
        software.amazon.awscdk.DockerImage.fromRegistry(image).let(DockerImage::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.DockerImage): DockerImage =
        DockerImage(cdkObject)

    internal fun unwrap(wrapped: DockerImage): software.amazon.awscdk.DockerImage =
        wrapped.cdkObject
  }
}