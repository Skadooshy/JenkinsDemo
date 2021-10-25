def buildApp(){
  echo 'building application'
}

def testApp(){
  echo 'testing application'
}

def deployApp(){
  echo 'deploy application'
  echo 'deploying the application....'
  echo "deploying with ${SERVER_CREDENTIALS}"
}

return this
