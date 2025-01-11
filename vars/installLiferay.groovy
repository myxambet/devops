// vars/installLiferay.groovy
def call() {
   
    
    bat """
     ansible-playbook -i /home/muha1022/liferayPostgres_install/inventory/host.ini /home/muha1022/liferayPostgres_install/playbook.yml --ask-vault-password
     """
    
    
  
}


