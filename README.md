# requestLogger
Spring Boot application for logging all the headers of client request and client's remote address ip

## Requirements
jdk 8 or later

## Usage
- Get the release requestLogger-0.0.1-SNAPSHOT.jar from the releases tab.
- Open a terminal, command line inside the folder which includes the jar you downloaded during the previous step and run 

`java -jar requestLogger-0.0.1-SNAPSHOT.jar --logging.file=/~/request-logger.log`

where --loging.file property is the path of your logging file. I use linux and my path is /~/request-logger.log.
For windows should be something like C:\users\\[username]\
