pipeline
{
    agent any
    tools
    {
        maven 'MAVEN_HOME'
    }
    stages
    {
        stage('Welcome Stage')
        {
            steps
            {
                echo 'Welcome to Jenkins Pipeline'
            }
        }
        stage('Cleaning Stage')
        {
            steps
            {
                sh 'mvn clean'
            }
        }
        stage('Test Stage')
        {
            steps
            {
                sh 'mvn test'
            }
        }
        stage('Build Stage')
        {
            steps
            {
                sh 'mvn install'
            }
        }
    }
}