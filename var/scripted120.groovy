def call ( Map pipelineparam)
{env.REPO_NAME = pipelineparam.REPO_NAME 
env.BRANCH = pipelineparam.BRANCH
pipeline
{
node
{
stage ( "Checkout-SCM" )
{
sh '''
gitclone $REPO_NAME
cd nodeapp_repo
git checkout $BRANCH
'''
}
Stage ("build")
{
sh '''
cd nodeapp_repo
npm install
'''
}
stage ("Static code analysis using Sonar")
{}
stage ("upload artifacts into Nexus"
{}
stage ("deployment in QA environment")
{}
stage ("testing in QA environment using Selenium")
{}
stage ("deploy in staging area")
{}
stage ("deploy in UAT environment")
{}
stage ("deploy in production environment")
{}
}
}
}
