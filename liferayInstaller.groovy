pipeline {
    agent any
    

  options([
    [$class: 'ChoiceParameter',
      name: 'Environment',
      description: 'Select target environment',
      choiceType: 'PT_SINGLE_SELECT',
      filterLength: 1,
      filterable: false,
      script: [
        $class: 'GroovyScript',
        script: [
          sandbox: true,
          classpath: [],
          script: '''
            return ["dev", "staging", "production"]
          '''
        ]
      ]
    ]
  ])

    stages {
        stage('Показать приветствие') {
            steps {
                echo "Значение параметра GREETING: ${params.GREETING}"
            }
        }
    }
}
