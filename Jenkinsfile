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
       steps { 
        echo 'it will execute always even if the build fails (send email to the team about the build condition'
      }
    
    }
    success{
        steps { 
         echo 'if successful'
      }
    }
    failure{
        steps { 
          echo 'if successful'
       }    
     }
  
  }
  
}
