def call(String bucketName) {
    def s3 = new com.amazonaws.services.s3.AmazonS3Client()
    def exists = s3.doesBucketExistV2(bucketName)
    
    if (exists) {
        println "Bucket '${bucketName}' exists."
    } else {
        println "Bucket '${bucketName}' does not exist."
    }
}