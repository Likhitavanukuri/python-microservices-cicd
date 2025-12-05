def call(String imageName) {
    echo "🚧 Building Docker Image: ${imageName}"

    sh """
        cd greeting-service
        docker build -t ${imageName} .
    """
}
