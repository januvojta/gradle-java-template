# Default Java Template for Gradle

This Template contains a support for java 11, SonarQube, slf4j, and JUnit 4. 
The formatting is set to AOSP Google java format (https://source.android.com/setup/contribute/code-style). 
Java Milo library is included in version 5.1 as default too but that can be disabled.
The projects build script is compatible with Gradle 7.0

## Instal Open JDK 11
(https://stackoverflow.com/questions/52511778/how-to-install-openjdk-11-on-windows)

1. Download jdk 11 from the following link https://jdk.java.net/archive/ .
1. Extract the zip file into a folder, e.g. `C:\Program Files\Java\` and it will create a jdk-11 folder (where the bin folder is a direct sub-folder). You may need Administrator privileges to extract the zip file to this location.

1. Set a PATH:
   * Select Control Panel and then System.
   * Click Advanced and then Environment Variables.
   * Add the location of the bin folder of the JDK installation to the `PATH` variable in System Variables.
   * The following is a typical value for the `PATH` variable: `C:\WINDOWS\system32;C:\WINDOWS;"C:\Program Files\Java\jdk-11\bin"`

1. Set JAVA_HOME:
   * Under System Variables, click New.
   * Enter the variable name as `JAVA_HOME`.
   * Enter the variable value as the installation path of the JDK (without the bin sub-folder).
   * Click OK.
   * Click Apply Changes.
   * Configure the JDK in your IDE (e.g. IntelliJ or Eclipse).

You are set.

To see if it worked, open up the Command Prompt and type `java -version` and see if it prints your newly installed JDK.

## Setup new Project
1. Create a new Java project (not Gradle) in the IntelliJ IDEA.
1. While having new project open press CTRL twice.
1. Write `gradle init` and press Enter. This will open a initialization guide in terminal.
1. Follow the guide and choose `2` application, `3` Java, `1` Groovy, `1` JUnit 4, project name, `cz.cvut.ciirc.[package name]`.
1. Copy content of `build.gradle` from this repository to the new project.
1. Change `mainClassName = 'cz.cvut.ciirc.template.Main'` to a new path to the main class.

## Setup IntelliJ IDEA IDE
1. CTRL + ALT + S
1. Plugins
1. Install google-java-format
1. Switch to google-java-format plugin, check enable, and switch to AOSP.
