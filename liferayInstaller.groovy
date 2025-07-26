properties([
  parameters([
string(name: 'DEPLOY_ENV', defaultValue: params.DEPLOY_ENV ?:'staging', description: ''),
 hidden(name: 'hidden_param', defaultValue: 'false', description: 'Hidden parameter')
}
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
            echo "${hidden_param}"
    return ["123", "s312", "producetion"]
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