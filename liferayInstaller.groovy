properties([
  parameters([
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
])

pipeline {
  agent any

  stages {
    stage('Показать окружение') {
      steps {
        echo "Вы выбрали окружение: ${params.Environment}"
      }
    }
  }
}
