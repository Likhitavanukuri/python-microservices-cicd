def call(String imageName) {
    echo "🚀 Deploying Docker Image: "
    sh "docker pull "
    sh "docker run -d -p 5000:5000 "
}
