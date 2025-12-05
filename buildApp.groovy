def call() {
    stage("Build") {
        def serviceDir = env.JOB_NAME
        sh """
            cd ${serviceDir}
            pip install --break-system-packages -r requirements.txt
        """
    }
}
