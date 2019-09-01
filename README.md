# requestLogger
Spring Boot application for logging all the headers of client request and client's remote address ip

## Requirements
jdk 8 or later

## Usage
Get the release requestLogger-0.0.1-SNAPSHOT.jar from the <a href="https://github.com/kkaravitis/requestLogger/releases"> release tab </a> .

Open a terminal, command line inside the folder which includes the jar you downloaded during the previous step and run 

`java -jar requestLogger-0.0.1.jar --logging.file=/home/kostas/request-logger.log`

where --loging.file property is the path of your logging file. I use linux and my path is /home/kostas/request-logger.log.
For windows should be something like C:\users\\[username]\

After application startup open your browser and by browsing to http://localhost:8080 you will see your request details to be logged on your logging.file.

In case you want to change the default 8080 port run the application with server.port property changed with your port, for example if you want to run the application on port 8888, run the following command:

`java -jar requestLogger-0.0.1.jar --logging.file=[path to logging file] --server.port=8888`
