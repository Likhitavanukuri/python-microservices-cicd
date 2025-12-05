def call(String tag) {
    echo "🚧 Building Docker Image: ${tag}"

    sh """
        cd ${env.JOB_NAME}
        podman build -t ${tag} .
        podman tag ${tag} ${tag}:latest
    """
}
