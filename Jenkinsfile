node {
   stage('Preparation') { // for display purposes
      // Get some code from a GitHub repository
      git 'https://github.com/diegokrule/nexus.git'
   }
   
   stage('Build') {
         sh "mvn -Dmaven.test.failure.ignore clean package"
   }
   
   stage('Results') {
      junit '**/target/surefire-reports/TEST-*.xml'
      archive 'target/*.jar'
   }
   
   stage('Create tag'){
       sh "mvn release:clean release:prepare"
   }
   
   stage('Perform Release'){
        sh "mvn release:perform"
   }       
   
    post {
        always {
            deleteDir() /* clean up our workspace */
        }
    }
}
