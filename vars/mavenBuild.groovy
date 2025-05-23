def call() {
	stage ("build") {
		sh 'mvn clean install'
	}

}
