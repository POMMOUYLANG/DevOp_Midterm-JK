pipeline {
    agent any // window agent, Jenkins-laravel (other machine)

    stages {
        stage('Fetch from GitHub') { //build steps
            steps {
                echo 'Fetching for GitHub'
                git branch: 'VURJS_MIDTERM', url: 'https://github.com/POMMOUYLANG/DevOp_Midterm-JK.git'
            }
        }
        stage('Build using Tools'){
            steps{
                echo 'Compiling code ...'
                sh 'npm install'
            }
        }
        stage('Test the app'){
            steps{
                echo 'Testing unit tests...'
                echo 'Testing feature...'
                sh 'npm run build'
            }
        }
    }
}