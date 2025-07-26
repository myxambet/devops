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
            return  abc = params.Environment & ["dev", "staging", "production"]  
          '''
        ]
      ]
    ]
  ])
])

pipeline {
  agent any

  stages {
    stage('Пример') {
      steps {
        script {
          def abc = ""
          echo "abc = ${abc}"
          echo "abc = ${params.Environment}"
        }
      }
    }
  }
}