// vars/installLiferay.groovy
def installLiferay(String serverIp, String liferayLogin, String liferayPassword) {

  // sh "export ANSIBLE_HOST_KEY_CHECKING=False && ansible-playbook -i ${serverIp}, /home/muha1022/liferayPostgres_install/liferay_inst.yml --vault-password-file=/home/muha1022/liferayPostgres_install/p_secrets.yml"
    echo "$liferayLogin"
    echo "$liferayPassword"    
    echo $serverIp
    
    
  
}


