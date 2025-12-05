def call(String imageName) {
    echo "🚀 Deploying Docker Image: ${imageName}"

    sh """
        docker pull ${imageName}
        docker run -d -p 4001:4001 ${imageName}
    """
}
