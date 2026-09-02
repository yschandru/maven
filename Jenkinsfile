pipeline{
    agent any
        stages{
            stage('clone'){
                steps{
                    git branch: 'main', url: 'https://github.com/yschandru/maven.git'
                }
            }
            stage('build'){
                steps{
                    sh 'mvn clean package'
                }
            }
            stage('deploy'){
                steps{
                sh 'sudo cp /home/ec2-user/maven/target/basic-war-app.war /home/ec2-user/apache-tomcat-10.1.59/webapps'
            }
        }
    }
}
