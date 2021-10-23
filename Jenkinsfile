pipeline {
  
  agent any
  
  stages {

    stage("build") {    
      echo "Change author is: ${CHANGE_AUTHOR}"
      steps {
        echo "This build name is: ${BUILD_NAME}"
      	echo 'building the application....'

      }
      
    } 
    
    stage("test") {
     /* when{
        //define when this stage should execute (this steps underneath)
        expression{
          BRANCH_NAME != 'master' || BRANCH_NAME != 'dev' //(do only on master and dev)
         echo 'my branch is master or dev'
        }
      } */
      steps { 
        echo 'testing the application....'
        echo "Current branch name is ${BRANCH_NAME}" //(localhost:8080/env-vars.html/ for all ENV variables)
      }
      
    }
    
    stage("deploy") {
      steps {
        echo 'deploying the application....'
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
