def call(String bucketName) {
    pipeline {
        agent any
        stages {
            stage('Check Bucket') {
                steps {
                    script {
                        def bucketExists = sh(script: "aws s3api head-bucket --bucket ${bucketName} 2>/dev/null", returnStatus: true) == 0
                        if (bucketExists) {
                            echo "Bucket '${bucketName}' exists."
                        } else {
                            error "Bucket '${bucketName}' does not exist."
                        }
                    }
                }
            }
        }
    }
}