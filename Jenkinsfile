node {
    stage('Load Library') {
        // Load the shared lib dynamically
        library identifier: 'SharedLibRepo@main', retriever: modernSCM([
            $class: 'GitSCMSource',
            remote: 'https://github.com/xuankien547/SharedLibRepo.git'
        ])
    }

    checkbucket('kingwai-bucket')
}
