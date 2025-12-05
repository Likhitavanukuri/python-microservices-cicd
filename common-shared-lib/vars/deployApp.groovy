def call(String imageName) {
    echo "🚀 Deploying container from local image: ${imageName}"

    sh """
        echo Stopping old container if exists...
        docker stop ${env.JOB_NAME} || true

        echo Removing old container...
        docker rm ${env.JOB_NAME} || true

        echo Running new container...
        docker run -d --name ${env.JOB_NAME} -p 4002:4002 ${imageName}
    """
}
