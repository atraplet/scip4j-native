# SCIP Solver for Java Native Libraries

*Work in progress*

[![Build](https://github.com/atraplet/scip4j-native/actions/workflows/build.yml/badge.svg)](https://github.com/atraplet/scip4j-native/actions/workflows/build.yml)
[![Maven Central](https://img.shields.io/maven-central/v/com.ustermetrics/scip4j-native)](https://central.sonatype.com/artifact/com.ustermetrics/scip4j-native)
[![Apache License, Version 2.0](https://img.shields.io/badge/License-Apache_2.0-blue.svg)](https://github.com/atraplet/scip4j-native/blob/master/LICENSE)

scip4j-native (SCIP Solver for Java Native Libraries) contains the shared library release binaries
of [SCIP](https://www.scipopt.org) for [scip4j](https://github.com/atraplet/scip4j).

## Usage

### Dependency

Add the latest version from [Maven Central](https://central.sonatype.com/artifact/com.ustermetrics/scip4j-native) to
your `pom.xml`

```
<dependency>
    <groupId>com.ustermetrics</groupId>
    <artifactId>scip4j-native</artifactId>
    <version>x.y.z</version>
    <scope>runtime</scope>
</dependency>
```

## Build

## Release

Update the version in the `pom.xml`, create a tag, and push it by running

```
export SCIP_VERSION=X.Y.Z
export VERSION=X.Y.Z
export VERSION=$VERSION-$SCIP_VERSION
git checkout --detach HEAD
sed -i -E "s/<version>[0-9]+\-SNAPSHOT<\/version>/<version>$VERSION<\/version>/g" pom.xml
git commit -m "v$VERSION" pom.xml
git tag v$VERSION
git push origin v$VERSION
```

This will trigger the upload of the package to Maven Central via GitHub Actions.

Then, go to the GitHub repository [releases page](https://github.com/atraplet/scip4j-native/releases) and update the
release.

## Credits

This project is based on the native open source mathematical programming
solver [SCIP](https://www.scipopt.org),
which is developed and maintained by the [current team members](https://scipopt.org/index.php#developers).
