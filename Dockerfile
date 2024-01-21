FROM openjdk:17-oracle
EXPOSE 8080
ADD target/git_action_project_2.jar git_action_project_2.jar 
ENTRYPOINT ["java","-jar","/git_action_project_2.jar"]