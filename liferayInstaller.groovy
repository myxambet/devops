pipeline {
    agent any

    stages {
        stage('Показать приветствие') {
            steps {
                echo "Значение параметра GREETING: ${params.GREETING}"
            }
        }
    }
}
