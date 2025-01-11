// vars/installLiferay.groovy
def installLiferay() {
   
    
    sh """
     wsl ansible-playbook -i inventory/host.ini playbook.yml  --ask-vault-password
     """
    
    
  
}

}
