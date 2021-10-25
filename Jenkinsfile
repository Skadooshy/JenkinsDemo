pipeline {
  
  agent any
  
 /* parameters{
    choice(name: 'VERSION', choices: ['1.1.0', '1.1.1', '1.1.2'])
    booleanParam(name: 'executeTests', defaultValue: true, description: '')
  } */
  
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
      when {
        expression {
          parameters.executeTests //if param executeTests = true, it will execute stage test
        }
      }
      steps { 
        echo 'testing the application....'
        echo "Current branch name is ${BRANCH_NAME}" //(localhost:8080/env-vars.html/ for all ENV variables)
      }
      
    }
    
    stage("deploy") {
      steps {
        echo 'deploying the application....'
        echo "deploying with ${SERVER_CREDENTIALS}"
       // echo "deploying ${params.VERSION}"
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
