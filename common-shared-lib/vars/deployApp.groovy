def call(String serviceName) {
    stage("Deploy Service") {
        sh "kubectl apply -f deployment.yaml"
    }
}
