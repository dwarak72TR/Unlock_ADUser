
def buildAgent = 'CentosNode'
def playbook = "UserunlockPlaybook.yaml"

timestamps
{
    node(buildAgent)
    {  
        stage('Select Env And Invoke Playbook')
        {
          
                    // try{
                    //     ansiblePlaybook(
                    //      playbook: "$playbook"
                    //     )
                    //    // sh 'echo "for next time we will run the playbook not now"'
                    // //   } 
                      
                    catch (e)
                    {
                        echo e.getMessage()
                        currentBuild.result='FAILURE'
                    }   
           
        }
    }
}
