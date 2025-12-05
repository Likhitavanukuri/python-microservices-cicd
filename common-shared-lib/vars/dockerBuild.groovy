def call(String image) {
    stage("Docker Build & Push") {
        sh """
            docker build -t  .
            docker push 
        """
    }
}
