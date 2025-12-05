def call(String tag) {
    echo "🚧 Building Docker Image: ${tag}"

    sh """
        cd ${env.JOB_NAME}
        docker build -t ${tag} .
    """
}
