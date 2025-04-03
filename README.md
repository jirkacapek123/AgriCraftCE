# AgriCraft 
Agricultural farming extended.

## Supported Versions
AgriCraft has releases for Minecraft versions 1.7.10 and onwards, status per Minecraft version is as follows:

| Version  | Notes
|----------|:----------
|![1.7.10] | Closed
|![1.12]   | Closed

## Bug Reports [![bug]][bug-link]

Please report any and all bugs you might encounter while playing with this mod (this only applies to versions of Minecraft this mod is currently being developed for). Suggestions are also welcome.
However before reporting a bug please update to the latest version of the mod to see if it still persists.
If you want to post bug reports for older versions, make sure to tell me what version you are using and the version of Forge you are using.
If you report a bug and I request more feedback, the label 'Awaiting reply' will be added, if I have had no response for 5 days after adding that label, the issue will be closed.

## Compilation Notes

The latest versions of ForgeGradle require some tweaking to get builds working. The two most important things to note are as follows:

1. ForgeGradle does not like JDKs newer than JDK8. To develop install [openjdk8](https://adoptopenjdk.net/?variant=openjdk8&jvmVariant=hotspot), and update `gradle.propeties` to contain the following:
```
org.gradle.java.home = C:\\Program Files\\AdoptOpenJDK\\jdk-8.0.275.1-hotspot
```

2. The default JVM heap size is too small to handle decompilation of MineCraft. Builds fail without increasing the heap size that Gradle allocates for the build. Update `gradle.propeties` to contain the following:
```
# Sets default memory used for gradle commands. Can be overridden by user or command line properties.
# This is required to provide enough memory for the Minecraft decompilation process.
org.gradle.jvmargs=-Xmx3G
```

> Note: We do not provide a default `gradle.properties` file as it is discouraged by the Gradle documentation, given that the file may contain maven login information and the likes.


[coverage]:https://codecov.io/gh/AgriCraft/AgriCore/branch/master/graph/badge.svg?token=DIEBA4U1AH
[coverage-link]:https://codecov.io/gh/AgriCraft/AgriCore

[minecraft]:https://agricraft.github.io/versions/1.12/minecraft.svg "Minecraft Version"


[bug-link]:https://agricraft.github.io/issues
[bug]:https://agricraft.github.io/images/bug.svg "AgriCraft Issues"


[1.7.10]:https://agricraft.github.io/versions/1.7.10/status.svg
[1.8.9]:https://agricraft.github.io/versions/1.8.9/status.svg
[1.9]:https://agricraft.github.io/versions/1.9/status.svg
[1.10]:https://agricraft.github.io/versions/1.10/status.svg
[1.11]:https://agricraft.github.io/versions/1.11/status.svg
[1.12]:https://agricraft.github.io/versions/1.12/status.svg
[1.16]:https://agricraft.github.io/versions/1.16/status.svg
[1.18]:https://agricraft.github.io/versions/1.18/status.svg
