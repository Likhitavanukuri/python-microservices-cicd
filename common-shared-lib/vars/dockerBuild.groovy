def call(imageName) {
    echo "🚧 Building Docker Image: "
    sh """
        cd greeting-service
        docker build -t  .
    """
}
