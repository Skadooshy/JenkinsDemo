pipeline {
  
  agent any
  
  environment{ //environmental variables accessible throughout the whole jenkinsfile
    NEW_VERSION = '1.3.0'
    SERVER_CREDENTIALS = credentials('test-server-credentials')
  } 
 
  stages {
    
    stage("environment"){
      steps{
        echo "Job url: ${JOB_URL}"
        echo "Commit github: ${GIT_COMMIT}" 
        echo "This job name is: ${BUILD_DISPLAY_NAME}"
      }
    }

    stage("build") {    
      steps {
        echo "building version ${NEW_VERSION}"
      	echo 'building the application....'
      }
      
    } 
    
    stage("test") {
      
      steps { 
        echo 'testing the application....'
        echo "Current branch name is ${BRANCH_NAME}" //(localhost:8080/env-vars.html/ for all ENV variables)
      }
      
    }
    
    stage("deploy") {
      steps {
        echo 'deploying the application....'
        echo "deploying with ${SERVER_CREDENTIALS}"
      }
      
    }
    
  }
  
  post{
    //after all the stages are done
    always{
        echo 'it will execute always even if the build fails, send email to the team about the build condition'
    }
    success{
        echo 'if successful'
    }
    failure{
         echo 'if successful' 
     }
  }
  
}
