package cloudshift.awscdkdsl.build.dsl.model

import java.io.File

internal interface CdkClassLoader {
    fun loadClasses(classpath : Set<File>) : List<CdkClass>
}

