pipeline {
  
  agent any
  
  stages {
  
    stage("build") {    
      steps {
      	echo 'building the application....'
      }
      
    } 
    
    stage("test") {
      steps { 
        echo 'testing the application....'
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
        echo 'it will execute always even if the build fails (send email to the team about the build condition')
    }
    success{
        echo 'if successful'
    }
    failure{
         echo 'if successful' 
     }
  }
  
}
