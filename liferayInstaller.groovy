pipeline {
    agent any

    parameters {
        string(name: 'GREETING', defaultValue: 'Привет, мир!', description: 'Введите приветствие')
    }

    stages {
        stage('Показать приветствие') {
            steps {
                echo "Значение параметра GREETING: ${params.GREETING}"
            }
        }
    }
}
