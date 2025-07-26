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
            return  ["dev", "staging", "production"] && abc = params.Environment
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
        def abc = ""
        echo "Вы выбрали окружение: ${abc}"
      }
    }
  }
}
