pipeline {
    agent any
    stages {
        stage('Fetch code') {
            git branch: testing-groovy-file, url
        }
    }

}