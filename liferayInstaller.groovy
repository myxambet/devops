pipeline {
    agent any

    parameters {
        string(name: 'GREETING', defaultValue: params.GREETING :? 'Привет, мир!', description: 'Введите приветствие')
    }

    stages {
        stage('Показать приветствие') {
            steps {
                echo "Значение параметра GREETING: ${params.GREETING}"
            }
        }
    }
}
