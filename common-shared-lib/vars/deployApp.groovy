def call(String imageName) {
    echo "🚀 Deploying container from local image: ${imageName}"

    sh """
        echo "Stopping old container if exists..."
        docker stop greeting || true

        echo "Removing old container..."
        docker rm greeting || true

        echo "Running new container..."
        docker run -d --name greeting -p 4001:4001 ${imageName}
    """
}

