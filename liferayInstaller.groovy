properties([
  parameters([
string(name: 'DEPLOY_ENV', defaultValue: params.DEPLOY_ENV ?:'staging', description: ''),

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
          echo "${params.Environment}"
          echo "${params.DEPLOY_ENV}"
        }
      }
    }
  }
}