// vars/installLiferay.groovy
def call() {
   
    
    sh """
     wsl ansible-playbook -i inventory/host.ini playbook.yml  --ask-vault-password
     """
    
    
  
}

}
