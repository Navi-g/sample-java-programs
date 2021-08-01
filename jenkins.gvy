node('GOL') {
    stage('SCM') {
      git 'https://github.com/Navi-g/sample-java-programs.git'
}
    stage ('Build'){
      sh 'mvn clean package'
    stage('post-build') {
      junit allowEmptyResults: true, checksName: 'Junit', keepLongStdio: true, testResults: '**/TEST-*.xml'
      archive 'targets/*.jar, target/*.war'
}
    }
}