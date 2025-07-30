node {
    stage('Load Library') {
        // Load the shared lib dynamically
        library identifier: 'SharedLibRepo@main', retriever: modernSCM([
            $class: 'GitSCMSource',
            remote: 'https://github.com/xuankien547/SharedLibRepo.git',
            credentialsId: 'GITHUB'
        ])
    }

    stage('Check Bucket') {
        // Call function from SharedLib
        checkbucket('kingwai-bucket')
    }
}
