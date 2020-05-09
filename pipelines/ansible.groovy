def buildAgent = 'CentosNode'
def playbook = "EmpDeployPlaybook.yml"

timestamps
{
    node(buildAgent)
    {  
        stage('Select Env And Invoke Playbook')
        // {  dir('ansible')
        //     {
        //         try{
        //             ansiblePlaybook(
        //               playbook: "$playbook",inventory: "inventory"
        //             )
        //           } 
                   
        //         catch (e)
        //          {
        //             echo e.getMessage()
        //             currentBuild.result='FAILURE'
        //          }   
        //     }
        }
    }
}
