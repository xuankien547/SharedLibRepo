def call(String bucketName) {
    stage('Check Bucket') {
        def bucketExists = sh(script: "aws s3api head-bucket --bucket ${bucketName} 2>/dev/null", returnStatus: true) == 0
        if (bucketExists) {
            echo "Bucket '${bucketName}' exists."
        } else {
            error "Bucket '${bucketName}' does not exist."
        }
    }
}
// vars/checkbucket.groovy