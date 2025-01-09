// vars/installLiferay.groovy
def installLiferay(String serverIp, String liferayLogin, String liferayPassword) {
    echo "Starting Liferay installation on server: ${serverIp}"
    
    sh """
    wsl ansible-playbook -i ${serverIp}, -u ${liferayLogin} --extra-vars 'ansible_ssh_pass=${liferayPassword}' install_liferay.yml
    """
    
    echo "Liferay installation completed on server: ${serverIp}"
}

}
