properties([
  parameters([
string(name: 'DEPLOY_ENV', defaultValue: params.DEPLOY_ENV ?:'staging', description: ''),
hidden(name: 'hidden_param', defaultValue: 'hidden_value', description: 'Hidden parameter')
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
           if (hidden_param==true) {

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
          
          def trig = false
          echo "trig = ${trig}"
          echo "${params.Environment}"
          echo "${trig}"
        }
      }
    }
  }
}