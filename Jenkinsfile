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
      //it will execute always even if the build fails (send email to the team about the build condition)
    }
    success{
      //if successful
    }
    failure{
      //if failed
    }
  }
}
