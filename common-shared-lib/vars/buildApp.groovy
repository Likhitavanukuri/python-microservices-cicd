def call() {
    stage("Build") {
        sh """
            cd \${env.JOB_NAME}
            pip install --break-system-packages -r requirements.txt
        """
    }
}
