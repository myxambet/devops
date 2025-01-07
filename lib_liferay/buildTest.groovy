@Library('JenkinsShared') _
node('jenkins-agent')
{
    buildTest()
}
