pipeline {
    agent any

    tools{
		maven 'my-maven'
	}
    stages {
        stage('0. 자동화2 연결 확인') { steps { echo '스테이지 출발' } }
        
        stage('1. 자바빌드'){
			steps{
				echo '메이븐으로 빌드 시작'
				sh 'mvn clean package'
			}
		}
        stage('2. Check Docker') {
            steps {
                sh 'docker version'
            }
        }
        stage('3. Docker Build') {
            steps {
                sh 'docker build -t order-service03-app:latest .'
            }
        }		                
    }
} 