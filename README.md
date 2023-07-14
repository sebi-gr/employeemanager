# Employee-Manager Backend Project

## Set up MySQL Docker Container
1. `docker pull mysql/mysql-server`
2. `docker run -p 3306:3306 --name=mysql1 -d mysql/mysql-server`
3. `docker logs mysql1 2>&1 | grep GENERATED`
4. `docker exec -it mysql1 mysql -u root -p`
5. `ALTER USER 'root'@'localhost' IDENTIFIED BY 'mysql';`

## User Data
```json
[
    {
        "firstName": "Jane",
        "lastName": "Smith",
        "email": "janesmith@example.com",
        "birthday": "1985-09-21",
        "title": "Sales Manager"
    },
    {
        "firstName": "Michael",
        "lastName": "Johnson",
        "email": "michaeljohnson@example.com",
        "birthday": "1992-11-03",
        "title": "Human Resources Specialist"
    },
    {
        "firstName": "Emily",
        "lastName": "Davis",
        "email": "emilydavis@example.com",
        "birthday": "1988-04-10",
        "title": "Marketing Coordinator"
    },
    {
        "firstName": "David",
        "lastName": "Wilson",
        "email": "davidwilson@example.com",
        "birthday": "1993-08-25",
        "title": "Financial Analyst"
    }
]
```
