# Employee-Manager Backend Project

## Set up MySQL Docker Container
1. docker pull mysql/mysql-server
2. docker run -p 3306:3306 --name=mysql1 -d mysql/mysql-server
3. docker logs mysql1 2>&1 | grep GENERATED
4. docker exec -it mysql1 mysql -u root -p
5. ALTER USER 'root'@'localhost' IDENTIFIED BY 'mysql';
