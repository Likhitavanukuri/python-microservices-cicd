def call() {
    stage("Build") {
        sh "pip install --break-system-packages -r requirements.txt"
    }
}
