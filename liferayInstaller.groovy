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
           if (params.Environment=true) {

    return ["dev", "staging", "production"]
} else {
    return ["dev", "staging", "production"]
}
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
          def secretValue = params.SECRET_PARAM ?: 'default'
          def trig = false
          echo "trig = ${trig}"
          echo "${secretValue}"
          echo "${trig}"
        }
      }
    }
  }
}