def call() {
	stage ("build") {
		steps {
			sh 'mvn clean install'
		}
	}

}
