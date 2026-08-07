pipeline {
	agent any

    tools {
		maven 'my-maven'
	}
	stages {
		stage('0. 자동화2-1 연결 확인') { steps { echo '스테이지 출발' } }
		
		stage('1. 자바 빌드') {
			steps {
				echo '메이븐으로 빌드 시작'
				sh 'mvn clean package'
			}
		}
	}
}