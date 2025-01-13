// vars/installLiferay.groovy
def call(String serverIp, String liferayLogin, String liferayPassword) {

sh "export ANSIBLE_HOST_KEY_CHECKING=False && ansible-playbook -i ${serverIp}, /home/muha1022/liferayPostgres_install/liferay_inst.yml --vault-password-file=/home/muha1022/liferayPostgres_install/p_secrets.yml
echo "Second parameter: ${liferayLogin}"
echo "Third parameter: ${liferayPassword}"
    
    
  
}


