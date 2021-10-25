def buildApp(){
  echo 'building application'
  echo "building version ${NEW_VERSION}"
}

def testApp(){
  echo 'testing application'
  echo "Current branch name is ${BRANCH_NAME}" //(localhost:8080/env-vars.html/ for all ENV variables)
}

def deployApp(){
  echo 'deploying the application....'
  echo "deploying with ${SERVER_CREDENTIALS}"
}

return this
