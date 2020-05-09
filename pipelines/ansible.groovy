def buildAgent = 'CentosNode'
def playbook = "EmpDeployPlaybook.yml"

timestamps
{
    node(buildAgent)
    {  
        stage('Select Env And Invoke Playbook')
        {
          dir('ansible')
           {
                    try{
                        // ansiblePlaybook(
                        //  // playbook: "$playbook",inventory: "inventory"
                        // )
                        sh 'echo "for next time we will run the playbook not now"'
                      } 
                      
                    catch (e)
                    {
                        echo e.getMessage()
                        currentBuild.result='FAILURE'
                    }   
           }
        }
    }
}
