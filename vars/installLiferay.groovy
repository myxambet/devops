// vars/installLiferay.groovy
def call() {
   
    
    bat """
     wsl ansible-playbook -i inventory/host.ini playbook.yml  --ask-vault-password
     """
    
    
  
}


