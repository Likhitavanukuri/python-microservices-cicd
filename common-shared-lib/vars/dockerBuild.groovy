def call() {
    stage("Docker Build & Push") {
        def serviceDir = env.JOB_NAME
        def imageName = "vanukurilikhita/${serviceDir}:latest"

        sh """
            docker build -t ${imageName} ${serviceDir}
            docker push ${imageName}
        """
    }
}
