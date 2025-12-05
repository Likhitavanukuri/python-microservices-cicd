def call() {
    stage("Build") {
        sh "pip install -r requirements.txt"
    }
}
