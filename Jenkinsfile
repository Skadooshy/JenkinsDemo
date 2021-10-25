def gscript

pipeline {
  
  agent any
  
  parameters{
    choice(name: 'VERSION', choices: ['1.1.0', '1.1.1', '1.1.2'], description: 'choice of versions')
    booleanParam(name: 'executeTests', defaultValue: true, description: 'boolean for turning off tests')
  }
  
  environment { //environmental variables accessible throughout the whole jenkinsfile
    NEW_VERSION = '1.3.0'
    SERVER_CREDENTIALS = credentials('test-server-credentials')
  } 
 
  stages {
   stage("init"){
      steps{
        script{
          gscript = load "script.groovy"
        }
      }
    }
    
    stage("environment"){
      steps{
        script{
          gscript.useEnviromentalVariables()
        }
      }
    }
    
    stage("build") {    
      steps {
        script{
          gscript.buildApp()
        }
      }  
    } 
    
    stage("test") {
      steps { 
          script{
          gscript.testApp()
        }
      }
    }
    
    stage("deploy") {
      steps {
         script{
          gscript.deployApp()
        }
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
