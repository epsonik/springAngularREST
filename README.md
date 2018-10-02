Simple CRUD application, no XML configurations with:
SpringMVC 4.3.10.RELEASE
Hibernate 5.2.11.Final
MySQL 6.0.6
Angular , ngresource
REST
DB script:
CREATE TABLE USER
(
    ID          INT PRIMARY KEY AUTO_INCREMENT,
    FIRSTNAME   VARCHAR(30),
    LASTNAME    VARCHAR(30),
    ADDRESS    VARCHAR(30),
    TELEPHONE   VARCHAR(15),
    EMAIL       VARCHAR(30)
);
