# e-Market Web Application

## Requirements
- **Glassfish Server 6.2.11**
- **Jakarta 9.1**
- **Java 11 (OpenJDK 11.0.13)**

## Students
- Boutaib Najib
- Ennassef Ismail

## Run and deploy from command line:
- Launch Glassfish sever
- STart a domain in Glassfish sever : `sudo ~/Glassfish_Server/bin/asadmin start-domain domain1`
- Run `mvn clean package`
- Deploy `.war` file to the server : `sudo ~/Glassfish_Server/bin/asadmin deploy --force ./target/e-market-app.war`
