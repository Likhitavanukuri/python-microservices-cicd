def call(String imageName) {
    echo "🚀 Deploying container using image: ${imageName}"

    // Determine port based on service name
    def port = "4001"  // default for greeting-service
    if (env.JOB_NAME == "time-service") {
        port = "4002"
    }

    sh """
        echo Stopping old container if exists...
        docker stop ${env.JOB_NAME} || true

        echo Removing old container...
        docker rm ${env.JOB_NAME} || true

        echo Running new container on port ${port}...
        docker run -d --name ${env.JOB_NAME} -p ${port}:${port} ${imageName}
    """
}
