pipeline {
    agent any

    stages {
        stage('Fetch from GitHub') { //build steps
            steps {
                echo 'Fetching for GitHub'
                git branch: 'main' , url: 'https://github.com/POMMOUYLANG/DevOp_Midterm-JK.git'
            }
        }
    }
    post {
        success {
            sh 'curl -X POST -H "Content-Type: application/json" -d \'{\"chat_id\": \"1003515001\", \"text\": \"[SUCCESS] Ukata api build success!\", \"disable_notification\": false}\' https://api.telegram.org/bot6654457291:AAF8XhNC9HPwMIhgk4DTIcYvpe2o0qoX70o/sendMessage'
        }
        failure {
            sh 'curl -X POST -H "Content-Type: application/json" -d \'{\"chat_id\": \"1003515001\", \"text\": \"[FAILED] Ukata api build failed!\", \"disable_notification\": false}\' https://api.telegram.org/bot6654457291:AAF8XhNC9HPwMIhgk4DTIcYvpe2o0qoX70o/sendMessage'
        }
    }
}
