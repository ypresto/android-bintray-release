package com.novoda.gradle.release

class PublishExtension {

    String repoType = 'maven'
    String userOrg

    String groupId
    String artifactId
    String version
    String[] licenses = ['Apache-2.0']

    String uploadName = ''
    String description
    String website = ''
    String issueTracker = ''
    String repository = ''
    boolean autoPublish = true

    String bintrayUser = ''
    String bintrayKey = ''
    boolean dryRun = true

    String[] publications = ['maven']

}
