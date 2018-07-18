# Requirements
Maven 3.3.9
Toolchains.xml in .m2 folder
```xml
<toolchains>
  <toolchain>
    <type>jdk</type>
    <provides>
      <version>1.9</version>
      <vendor>oracle</vendor>
    </provides>
    <configuration>
      <jdkHome>/home/jean-jay/runtimes/jdk-9</jdkHome>
    </configuration>
  </toolchain>
  <toolchain>
    <type>jdk</type>
    <provides>
      <version>1.8</version>
      <vendor>oracle</vendor>
    </provides>
    <configuration>
      <jdkHome>/home/jean-jay/runtimes/jdk1.8.0_101</jdkHome>
    </configuration>
  </toolchain>
</toolchains>
```
Install patched automatic module from manual build (commons-lang3-3.4.jar)
```bash
mvn install:install-file -Dfile=<path-toproject>/java9-jigsaw-project/manual-build/after/patched-automatic-modules/commons-lang3-3.4.jar -DgroupId=org.apache.commons -DartifactId=commons-lang3 -Dversion=3.4-module -Dpackaging=jar
```
## Build
Issue the following:
```bash
mvn clean install package
```
## Run
```bash
java -jar --module-path target/modules -m jigsaw.date.cli/com.javacodegeeks.jigsaw.date.cli.Main
```

